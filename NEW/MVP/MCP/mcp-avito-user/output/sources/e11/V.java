package e11;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.widget.TextView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes7.dex */
public class V extends TextView {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final GradientDrawable f394488b;

    /* renamed from: c, reason: collision with root package name */
    public final int f394489c;

    public V(@j.N Context context) {
        super(context, null, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f394488b = gradientDrawable;
        gradientDrawable.setStroke(0, -13421773);
        gradientDrawable.setColor(0);
        this.f394489c = (int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics());
    }

    public final void a(int i12, int i13) {
        GradientDrawable gradientDrawable = this.f394488b;
        gradientDrawable.setStroke(1, i12);
        gradientDrawable.setCornerRadius(i13);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.f394488b;
        gradientDrawable.setBounds(getPaddingLeft() - this.f394489c, getPaddingTop(), getWidth(), getHeight());
        gradientDrawable.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        setMeasuredDimension((this.f394489c * 2) + getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i12) {
        this.f394488b.setColor(i12);
        invalidate();
    }
}
