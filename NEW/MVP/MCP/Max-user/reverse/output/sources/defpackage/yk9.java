package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.ViewGroup;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class yk9 extends ViewGroup implements ry2 {
    public static final /* synthetic */ yy7[] I0 = {new z8a(yk9.class, "drawMode", "getDrawMode()Lone/me/messages/list/ui/view/delegates/views/MessageLinkView$Mode;"), u45.h(vid.a, yk9.class, "isFloating", "isFloating()Z")};
    public final Object A0;
    public final Object B0;
    public final Path C0;
    public final RectF D0;
    public final Paint E0;
    public final Paint F0;
    public final TextPaint G0;
    public final qi H0;
    public final xk9 a;
    public final xk9 b;
    public yt0 c;
    public Layout d;
    public Layout o;
    public Layout s0;
    public Layout t0;
    public final Object u0;
    public Layout v0;
    public Layout w0;
    public int x0;
    public Layout y0;
    public final Object z0;

    public yk9(Context context) {
        super(context);
        this.a = new xk9(this, 0);
        this.b = new xk9(this, 1);
        this.u0 = ipi.b(3, new ns2(context, 18));
        this.z0 = ipi.b(3, new c38(27));
        this.A0 = ipi.b(3, new c38(28));
        this.B0 = ipi.b(3, new ns2(context, 19));
        this.C0 = new Path();
        this.D0 = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.E0 = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(vw4.d().getDisplayMetrics().density * 2.0f);
        this.F0 = paint2;
        TextPaint textPaint = new TextPaint();
        wsf.j(this, textPaint, vz2.d);
        this.G0 = textPaint;
        this.H0 = new qi(2, this);
    }

    public static final void e(yk9 yk9Var, Canvas canvas, float f) {
        boolean zG = yk9Var.g();
        Paint paint = yk9Var.F0;
        float strokeWidth = zG ? 0.0f : paint.getStrokeWidth();
        boolean zG2 = yk9Var.g();
        float measuredHeight = yk9Var.getMeasuredHeight();
        if (!zG2) {
            measuredHeight -= paint.getStrokeWidth();
        }
        canvas.drawLine(f, strokeWidth, f, measuredHeight, paint);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final uxa getAvatarView() {
        return (uxa) this.u0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final u74 getDefaultImageOutlineProvider() {
        return (u74) this.z0.getValue();
    }

    private final vk9 getDrawMode() {
        yy7 yy7Var = I0[0];
        return (vk9) this.a.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final OneMeDraweeView getImageView() {
        return (OneMeDraweeView) this.B0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final u74 getRoundImageOutlineProvider() {
        return (u74) this.A0.getValue();
    }

    private final void setDrawMode(vk9 vk9Var) {
        this.a.O(this, I0[0], vk9Var);
    }

    private final void setFloating(boolean z) {
        this.b.O(this, I0[1], Boolean.valueOf(z));
    }

    @Override // defpackage.ry2
    public final void a(yt0 yt0Var) {
        au0 au0Var = yt0Var.c;
        this.c = yt0Var;
        n();
        this.F0.setColor(g() ? au0Var.d : au0Var.c);
        this.E0.setColor(a93.s0.y(this).a().G().b.g);
        invalidate();
    }

    public final int b() {
        if (g()) {
            return kti.d(12 * vw4.d().getDisplayMetrics().density);
        }
        if (getDrawMode() == vk9.o) {
            return 0;
        }
        return kti.d(8 * vw4.d().getDisplayMetrics().density);
    }

    public final int c() {
        if (g()) {
            return kti.d(4 * vw4.d().getDisplayMetrics().density);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0264  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk9.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void f(nk9 nk9Var) {
        fqi.c(this, getImageView(), -1);
        OneMeDraweeView imageView = getImageView();
        String str = nk9Var.a;
        imageView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        OneMeDraweeView imageView2 = getImageView();
        String str2 = nk9Var.a;
        rf7 rf7VarB = str2 != null ? rf7.b(str2) : null;
        Uri uri = nk9Var.d;
        imageView2.i(rf7VarB, uri != null ? rf7.a(uri) : null);
        getImageView().setOutlineProvider(nk9Var.e ? getRoundImageOutlineProvider() : getDefaultImageOutlineProvider());
        this.x0 = nk9Var.b;
        this.y0 = nk9Var.c;
    }

    public final boolean g() {
        yy7 yy7Var = I0[1];
        return ((Boolean) this.b.b).booleanValue();
    }

    public final void h(Layout layout, mk9 mk9Var) {
        setDrawMode(vk9.b);
        this.d = layout;
        this.s0 = mk9Var.a;
        this.t0 = mk9Var.b;
        fqi.c(this, getAvatarView(), -1);
        getAvatarView().setVisibility(0);
        uxa.n(getAvatarView(), mk9Var.e, Long.valueOf(mk9Var.c), mk9Var.d);
    }

    public final void i(nk9 nk9Var, Layout layout) {
        setDrawMode(vk9.c);
        this.d = layout;
        f(nk9Var);
    }

    public final void j(nk9 nk9Var, Layout layout) {
        setDrawMode(vk9.c);
        this.d = layout;
        f(nk9Var);
    }

    public final void k(Layout layout, Layout layout2) {
        setDrawMode(vk9.a);
        this.d = layout;
        this.o = layout2;
    }

    public final void l(Layout layout, Layout layout2) {
        setDrawMode(vk9.a);
        this.d = layout;
        this.o = layout2;
        pqi.c(this, layout2, this.H0);
    }

    public final void m(Layout layout, pk9 pk9Var) {
        setDrawMode(vk9.d);
        this.d = layout;
        fqi.c(this, getImageView(), -1);
        OneMeDraweeView imageView = getImageView();
        String str = pk9Var.a;
        imageView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        OneMeDraweeView imageView2 = getImageView();
        rf7 rf7VarB = str != null ? rf7.b(str) : null;
        Uri uri = pk9Var.b;
        imageView2.i(rf7VarB, uri != null ? rf7.a(uri) : null);
        getImageView().setOutlineProvider(null);
    }

    public final void n() {
        TextPaint paint;
        TextPaint paint2;
        TextPaint paint3;
        TextPaint paint4;
        TextPaint paint5;
        TextPaint paint6;
        TextPaint paint7;
        v1a v1aVar = a93.s0;
        yt0 yt0Var = this.c;
        if (yt0Var == null) {
            return;
        }
        bu0 bu0Var = yt0Var.d;
        int i = bu0Var.l;
        int i2 = bu0Var.k;
        Layout layout = this.d;
        if (layout != null && (paint7 = layout.getPaint()) != null) {
            paint7.setColor(g() ? v1aVar.y(this).a().G().g.a : i);
        }
        Layout layout2 = this.o;
        if (layout2 != null && (paint6 = layout2.getPaint()) != null) {
            paint6.setColor(g() ? v1aVar.y(this).a().G().g.a : i2);
        }
        Layout layout3 = this.o;
        if (layout3 != null) {
            CharSequence text = layout3.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                Object[] spans = spanned.getSpans(0, layout3.getText().length(), Object.class);
                if (spans != null) {
                    for (Object obj : spans) {
                        ry2 ry2Var = obj instanceof ry2 ? (ry2) obj : null;
                        if (ry2Var != null) {
                            ry2Var.a(yt0Var);
                        }
                    }
                }
            }
        }
        Layout layout4 = this.t0;
        if (layout4 != null && (paint5 = layout4.getPaint()) != null) {
            paint5.setColor(g() ? v1aVar.y(this).a().G().g.a : i2);
        }
        Layout layout5 = this.s0;
        if (layout5 != null && (paint4 = layout5.getPaint()) != null) {
            paint4.setColor(g() ? v1aVar.y(this).a().G().g.a : i2);
        }
        Layout layout6 = this.v0;
        if (layout6 != null && (paint3 = layout6.getPaint()) != null) {
            paint3.setColor(g() ? v1aVar.y(this).a().G().g.a : bu0Var.g);
        }
        Layout layout7 = this.w0;
        if (layout7 != null && (paint2 = layout7.getPaint()) != null) {
            if (g()) {
                i = v1aVar.y(this).a().G().g.a;
            }
            paint2.setColor(i);
        }
        Layout layout8 = this.y0;
        if (layout8 == null || (paint = layout8.getPaint()) == null) {
            return;
        }
        if (g()) {
            i2 = v1aVar.y(this).a().G().g.a;
        }
        paint.setColor(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Layout layout = this.o;
        if (layout != null) {
            pqi.c(this, layout, this.H0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Layout layout = this.o;
        if (layout != null) {
            pqi.e(layout, this.H0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iB = b();
        int iD = gpi.d(this.d) + c();
        int iOrdinal = getDrawMode().ordinal();
        if (iOrdinal == 1) {
            cri.c(getAvatarView(), iB, u45.c(2, vw4.d().getDisplayMetrics().density, iD), 0, 12);
        } else if (iOrdinal == 2) {
            cri.c(getImageView(), iB, (getMeasuredHeight() / 2) - (getImageView().getMeasuredHeight() / 2), 0, 12);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            cri.c(getImageView(), iB, iD, 0, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x020d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk9.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.D0;
        rectF.set(0.0f, 0.0f, i, i2);
        Path path = this.C0;
        path.reset();
        path.addRoundRect(rectF, vw4.d().getDisplayMetrics().density * 8.0f, vw4.d().getDisplayMetrics().density * 8.0f, Path.Direction.CW);
    }

    public final void setIsFloating(boolean z) {
        setFloating(z);
    }

    public final void setSingleForward(lk9 lk9Var) {
        setDrawMode(vk9.o);
        this.v0 = lk9Var.b();
        this.w0 = lk9Var.a();
    }
}
