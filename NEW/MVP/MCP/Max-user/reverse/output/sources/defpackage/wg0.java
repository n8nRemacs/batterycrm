package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* loaded from: classes.dex */
public final class wg0 extends Drawable implements z3g {
    public static final int x0 = m5d.Widget_MaterialComponents_Badge;
    public static final int y0 = dvc.badgeStyle;
    public float X;
    public float Y;
    public final int Z;
    public final WeakReference a;
    public final wq8 b;
    public final a4g c;
    public final Rect d;
    public final yg0 o;
    public float s0;
    public float t0;
    public float u0;
    public WeakReference v0;
    public WeakReference w0;

    public wg0(Context context) {
        s3g s3gVar;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        d7g.c(context, d7g.b, "Theme.MaterialComponents");
        this.d = new Rect();
        a4g a4gVar = new a4g(this);
        this.c = a4gVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = a4gVar.a;
        textPaint.setTextAlign(align);
        yg0 yg0Var = new yg0(context);
        this.o = yg0Var;
        boolean zE = e();
        xg0 xg0Var = yg0Var.b;
        wq8 wq8Var = new wq8(xse.a(context, zE ? xg0Var.Y.intValue() : xg0Var.o.intValue(), e() ? xg0Var.Z.intValue() : xg0Var.X.intValue(), new g0(0)).g());
        this.b = wq8Var;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && a4gVar.g != (s3gVar = new s3g(context2, xg0Var.d.intValue()))) {
            a4gVar.c(s3gVar, context2);
            textPaint.setColor(xg0Var.c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i = xg0Var.v0;
        if (i != -2) {
            this.Z = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.Z = xg0Var.w0;
        }
        a4gVar.e = true;
        i();
        invalidateSelf();
        a4gVar.e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(xg0Var.b.intValue());
        if (wq8Var.a.c != colorStateListValueOf) {
            wq8Var.k(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(xg0Var.c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.v0;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.v0.get();
            WeakReference weakReference3 = this.w0;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(xg0Var.D0.booleanValue(), false);
    }

    @Override // defpackage.z3g
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        yg0 yg0Var = this.o;
        xg0 xg0Var = yg0Var.b;
        xg0 xg0Var2 = yg0Var.b;
        String str = xg0Var.t0;
        WeakReference weakReference = this.a;
        if (str == null) {
            if (!f()) {
                return null;
            }
            if (this.Z == -2 || d() <= this.Z) {
                return NumberFormat.getInstance(xg0Var2.x0).format(d());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(xg0Var2.x0, context.getString(s2d.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.Z), "+");
        }
        int i = xg0Var.v0;
        if (i == -2 || str == null || str.length() <= i) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(s2d.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.w0;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i = this.o.b.u0;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (!e() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        a4g a4gVar = this.c;
        a4gVar.a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.Y - rect.exactCenterY();
        canvas.drawText(strB, this.X, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), a4gVar.a);
    }

    public final boolean e() {
        return this.o.b.t0 != null || f();
    }

    public final boolean f() {
        xg0 xg0Var = this.o.b;
        return xg0Var.t0 == null && xg0Var.u0 != -1;
    }

    public final void g() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        boolean zE = e();
        yg0 yg0Var = this.o;
        this.b.setShapeAppearanceModel(xse.a(context, zE ? yg0Var.b.Y.intValue() : yg0Var.b.o.intValue(), e() ? yg0Var.b.Z.intValue() : yg0Var.b.X.intValue(), new g0(0)).g());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.o.b.s0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.v0 = new WeakReference(view);
        this.w0 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg0.i():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, defpackage.z3g
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        yg0 yg0Var = this.o;
        yg0Var.a.s0 = i;
        yg0Var.b.s0 = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
