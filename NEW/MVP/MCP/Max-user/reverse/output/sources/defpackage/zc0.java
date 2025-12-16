package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import one.me.mediapicker.crop.AvatarEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class zc0 extends w7i {
    public final int D0;
    public final int E0;
    public final Path F0;
    public final Paint G0;
    public final Paint H0;
    public final Rect I0;
    public int J0;
    public yc0 K0;

    public zc0(Context context) {
        super(context, null);
        this.D0 = kti.d(20 * vw4.d().getDisplayMetrics().density);
        this.E0 = kti.d(80 * vw4.d().getDisplayMetrics().density);
        this.F0 = new Path();
        Paint paint = new Paint();
        paint.setColor(a93.s0.x(context).k().b().f);
        paint.setAntiAlias(true);
        this.G0 = paint;
        Paint paint2 = new Paint();
        paint2.setColor(s34.a(context, gvd.c));
        paint2.setAlpha(50);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(vw4.d().getDisplayMetrics().density * 1.0f);
        this.H0 = paint2;
        this.I0 = new Rect();
    }

    @Override // defpackage.w7i, defpackage.s7i
    public final void a(Matrix matrix) {
        super.a(matrix);
        yc0 yc0Var = this.K0;
        if (yc0Var != null) {
            AvatarEditScreen avatarEditScreen = (AvatarEditScreen) yc0Var;
            ((OneMeButton) avatarEditScreen.Z.D(avatarEditScreen, AvatarEditScreen.u0[3])).setVisibility(0);
        }
    }

    @Override // defpackage.w7i
    public final void h(pe7 pe7Var) {
        super.h(pe7Var);
        this.J0 = pe7Var.getWidth();
        ((ea4) getZoomableController()).e();
        ((ea4) getZoomableController()).d(this.J0);
    }

    @Override // defpackage.w7i, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipPath(this.F0, Region.Op.DIFFERENCE);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.G0);
        canvas.restore();
        Rect rect = this.I0;
        canvas.drawCircle(rect.centerX(), rect.centerY(), rect.width() / 2, this.H0);
    }

    @Override // defpackage.w7i, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ((ea4) getZoomableController()).e();
        if (this.J0 > 0) {
            ((ea4) getZoomableController()).d(this.J0);
        }
    }

    @Override // defpackage.o45, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth() - (this.D0 * 2);
        int measuredHeight = getMeasuredHeight() - (this.E0 * 2);
        if (measuredWidth > measuredHeight) {
            measuredWidth = measuredHeight;
        }
        Path path = this.F0;
        path.reset();
        int i3 = measuredWidth / 2;
        path.addCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, i3, Path.Direction.CCW);
        int measuredWidth2 = (getMeasuredWidth() / 2) - i3;
        int measuredHeight2 = (getMeasuredHeight() / 2) - i3;
        int measuredWidth3 = (getMeasuredWidth() / 2) + i3;
        int measuredHeight3 = (getMeasuredHeight() / 2) + i3;
        Rect rect = this.I0;
        rect.set(measuredWidth2, measuredHeight2, measuredWidth3, measuredHeight3);
        ((ea4) getZoomableController()).m = rect;
    }

    public final void setTransformChangeListener(yc0 yc0Var) {
        this.K0 = yc0Var;
    }
}
