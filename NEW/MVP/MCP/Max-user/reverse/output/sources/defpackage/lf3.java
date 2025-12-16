package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class lf3 extends phd {
    public final int X;
    public final int Y;
    public final int d;
    public final int s0;
    public nf3 t0;
    public int[] o = {-65536};
    public int Z = -1;

    public lf3(Context context, int i) {
        this.d = i;
        this.X = soi.a(context, 6);
        this.Y = soi.a(context, 32);
        this.s0 = soi.a(context, 2);
    }

    @Override // defpackage.phd
    public final int j() {
        return this.o.length;
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) {
        pf3 pf3Var = (pf3) midVar;
        pf3Var.E0.setColor(this.o[i]);
        View view = pf3Var.a;
        view.animate().cancel();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        int measuredHeight;
        int paddingBottom;
        int i2 = this.Z;
        int i3 = this.Y;
        int i4 = this.d;
        int i5 = this.X;
        if (i2 == -1) {
            if (i4 == 0) {
                measuredHeight = viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft();
                paddingBottom = viewGroup.getPaddingRight();
            } else {
                measuredHeight = viewGroup.getMeasuredHeight() - viewGroup.getPaddingTop();
                paddingBottom = viewGroup.getPaddingBottom();
            }
            int i6 = measuredHeight - paddingBottom;
            float f = (i5 * 2) + i3;
            float f2 = i6;
            float f3 = f2 / f;
            this.Z = (int) (((f2 / (f3 - (f3 - (((int) f3) + 0.5f)))) - f) / 2.0f);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new xhd(-2, -2));
        frameLayout.setClipToPadding(false);
        if (i4 == 0) {
            int i7 = this.Z + i5;
            frameLayout.setPadding(i7, i5, i7, i5);
        } else {
            int i8 = this.Z + i5;
            frameLayout.setPadding(i5, i8, i5, i8);
        }
        mf3 mf3Var = new mf3(viewGroup.getContext());
        mf3Var.c = soi.a(mf3Var.getContext(), 2);
        Paint paint = new Paint();
        mf3Var.a = paint;
        paint.setColor(-65536);
        Paint paint2 = mf3Var.a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        mf3Var.a.setAntiAlias(true);
        mf3Var.a.setDither(true);
        Paint paint3 = new Paint();
        mf3Var.b = paint3;
        paint3.setColor(-1);
        mf3Var.b.setStyle(style);
        mf3Var.b.setAntiAlias(true);
        mf3Var.b.setDither(true);
        mf3Var.setClipToOutline(false);
        mf3Var.setOutlineProvider(new f83(mf3Var, 1));
        mf3Var.setLayoutParams(new xhd(i3, i3));
        mf3Var.setElevation(this.s0);
        frameLayout.addView(mf3Var);
        return new pf3(frameLayout, mf3Var, this.t0);
    }
}
