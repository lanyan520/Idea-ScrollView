package idea.analyzesystem.scrollview;

import android.content.Context;
import android.graphics.Point;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.WindowManager;

/**
 * Created by idea on 2018/2/24.
 */

public class IdeaViewPager extends ViewPager {

    private Point point;

    public IdeaViewPager(Context context) {
        this(context,null);
    }

    public IdeaViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(point.x,point.x);
    }
}
