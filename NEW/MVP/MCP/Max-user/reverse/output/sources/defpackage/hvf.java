package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class hvf extends at7 implements u6g {
    public final Object A0;
    public final WeakReference X;
    public final Context Y;
    public final yu9 Z;
    public final wu9 s0;
    public final k18 t0;
    public boolean u0;
    public boolean v0;
    public final RectF w0;
    public final Paint x0;
    public final Paint y0;
    public PorterDuffColorFilter z0;

    public hvf(k18 k18Var, WeakReference weakReference, ln lnVar, yu9 yu9Var, wu9 wu9Var) {
        super(0, 4);
        this.X = weakReference;
        this.Y = lnVar;
        this.Z = yu9Var;
        this.s0 = wu9Var;
        this.t0 = k18Var;
        this.u0 = true;
        this.v0 = true;
        this.w0 = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.x0 = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.y0 = paint2;
        a93.s0.x(lnVar).k().getIcon();
        this.z0 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.A0 = ipi.b(3, new sue(k18Var, 5, this));
    }

    @Override // defpackage.at7
    public final void a(RecyclerView recyclerView, mid midVar) {
        super.a(recyclerView, midVar);
        this.v0 = true;
        this.u0 = true;
    }

    @Override // defpackage.at7
    public final float d(float f) {
        return Float.MAX_VALUE;
    }

    @Override // defpackage.at7
    public final float e() {
        return 1.0f;
    }

    @Override // defpackage.at7
    public final boolean g() {
        return ((Boolean) this.Z.invoke()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, k18] */
    @Override // defpackage.at7
    public final void h(Canvas canvas, RecyclerView recyclerView, mid midVar, float f, float f2, int i, boolean z) {
        float f3;
        if (midVar instanceof bi9) {
            bi9 bi9Var = (bi9) midVar;
            ghh ghhVar = bi9Var.K0;
            ghhVar.getClass();
            if (ghhVar == ghh.d || ghhVar == ghh.o || ghhVar == ghh.b) {
                float fB = n7j.b(f, -(vw4.d().getDisplayMetrics().density * 96.0f), 0.0f);
                super.h(canvas, recyclerView, midVar, fB, f2, i, z);
                float fAbs = Math.abs(fB) / (vw4.d().getDisplayMetrics().density * 96.0f);
                Paint paint = this.x0;
                paint.setAlpha((int) (255 * fAbs));
                paint.setColorFilter(this.z0);
                v1a v1aVar = a93.s0;
                Context context = this.Y;
                int iAlpha = Color.alpha(v1aVar.x(context).k().a().G().b.g);
                int i2 = v1aVar.x(context).k().a().G().b.g;
                Paint paint2 = this.y0;
                paint2.setColor(i2);
                paint2.setAlpha((int) (iAlpha * fAbs));
                ViewGroup viewGroup = bi9Var.I0;
                float right = (vw4.d().getDisplayMetrics().density * 8.0f) + viewGroup.getRight() + fB + ((1 - fAbs) * vw4.d().getDisplayMetrics().density * 32.0f) + (vw4.d().getDisplayMetrics().density * 20.0f);
                View view = midVar.a;
                int bottom = ((RecyclerView) view.getParent()).getBottom();
                float f4 = (vw4.d().getDisplayMetrics().density * 20.0f) + (vw4.d().getDisplayMetrics().density * 8.0f);
                float f5 = (vw4.d().getDisplayMetrics().density * 20.0f) + f4;
                if (viewGroup.getHeight() < f5 || bottom - view.getTop() < f5) {
                    float top = (vw4.d().getDisplayMetrics().density * 20.0f) + view.getTop();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    f3 = ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r3.topMargin : 0) + top;
                } else if (view.getBottom() < bottom) {
                    float bottom2 = view.getBottom();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    f3 = bottom2 - (((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) != null ? r5.bottomMargin : 0) + f4);
                } else {
                    f3 = bottom - f4;
                }
                canvas.drawCircle(right, f3, vw4.d().getDisplayMetrics().density * 20.0f, paint2);
                float f6 = (vw4.d().getDisplayMetrics().density * 20.0f) / 2.0f;
                float f7 = right - f6;
                float f8 = f3 - f6;
                float f9 = right + f6;
                float f10 = f3 + f6;
                RectF rectF = this.w0;
                rectF.set(f7, f8, f9, f10);
                canvas.drawBitmap((Bitmap) this.A0.getValue(), (Rect) null, rectF, paint);
                boolean z2 = fB < (-(vw4.d().getDisplayMetrics().density * 70.0f));
                WeakReference weakReference = this.X;
                if (z2 && this.u0) {
                    View view2 = (View) weakReference.get();
                    if (view2 != null) {
                        uog.i(view2, p07.CONFIRM);
                    }
                    this.u0 = false;
                } else if (!z2) {
                    this.u0 = true;
                }
                if (z || fB >= (-(vw4.d().getDisplayMetrics().density * 70.0f)) || !this.v0) {
                    return;
                }
                this.v0 = false;
                View view3 = (View) weakReference.get();
                if (view3 != null) {
                    view3.post(new qz5(view3, 17, view3));
                }
                this.s0.invoke(Integer.valueOf(bi9Var.g()));
            }
        }
    }

    @Override // defpackage.at7
    public final boolean i(mid midVar, mid midVar2) {
        return false;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        yebVar.getIcon();
        this.z0 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }
}
