package defpackage;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class d52 extends FrameLayout implements e88, ab3 {
    public static final /* synthetic */ yy7[] L0;
    public final int A0;
    public boolean B0;
    public boolean C0;
    public final nk D0;
    public final r35 E0;
    public final yta F0;
    public final c52 G0;
    public final LinearLayout H0;
    public final FrameLayout I0;
    public final lfh J0;
    public final View K0;
    public final ChatMediaViewerScreen a;
    public final h88 b;
    public final int c;
    public final Rect d;
    public int o;
    public int s0;
    public int t0;
    public Integer u0;
    public int v0;
    public int w0;
    public Integer x0;
    public float y0;
    public long z0;

    static {
        z8a z8aVar = new z8a(d52.class, "panelState", "getPanelState()Lone/me/chatmedia/viewer/caption/CaptionPopupView$PanelState;");
        vid.a.getClass();
        L0 = new yy7[]{z8aVar};
    }

    public d52(Context context, ChatMediaViewerScreen chatMediaViewerScreen, v3b v3bVar) {
        super(context);
        this.a = chatMediaViewerScreen;
        bb3 bb3Var = new bb3(context, this);
        final int i = 0;
        bb3Var.h = new cm6(this) { // from class: a52
            public final /* synthetic */ d52 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        d52.e(this.b);
                        return qqg.a;
                    default:
                        return Integer.valueOf(d52.d(this.b));
                }
            }
        };
        final int i2 = 1;
        h88 h88Var = new h88(this, new cm6(this) { // from class: a52
            public final /* synthetic */ d52 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        d52.e(this.b);
                        return qqg.a;
                    default:
                        return Integer.valueOf(d52.d(this.b));
                }
            }
        }, 4);
        this.b = h88Var;
        this.c = kti.d(39 * vw4.d().getDisplayMetrics().density);
        this.d = new Rect();
        this.A0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.C0 = true;
        this.D0 = new nk(this);
        r35 r35Var = new r35(context);
        r35Var.setCustomTheme(getCustomTheme());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
        r35Var.setLayoutParams(layoutParams);
        this.E0 = r35Var;
        yta ytaVar = new yta(context);
        ytaVar.setTextColor(getCustomTheme().getText().e);
        vz2.f.b(ytaVar, (t75) v3bVar.a.a.getValue());
        ytaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ytaVar.setMovementMethod(bb3Var);
        ytaVar.setTransformationMethod(h88Var);
        jgh.a(ytaVar);
        this.F0 = ytaVar;
        c52 c52Var = new c52(context, this);
        c52Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c52Var.setFillViewport(false);
        c52Var.addView(ytaVar);
        c52Var.setVerticalFadingEdgeEnabled(true);
        float f = 8;
        c52Var.setFadingEdgeLength(kti.d(vw4.d().getDisplayMetrics().density * f));
        this.G0 = c52Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(r35Var);
        linearLayout.addView(c52Var);
        this.H0 = linearLayout;
        FrameLayout frameLayout = new FrameLayout(context);
        float f2 = 16;
        frameLayout.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ls0(i2, vw4.d().getDisplayMetrics().density * 20.0f));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ColorDrawable colorDrawable = new ColorDrawable(zob.b(getCustomTheme().b().d, 0.84f));
        xw6 xw6Var = new xw6(new int[]{zob.b(getCustomTheme().b().a.g, 0.04f), 0});
        float f3 = vw4.d().getDisplayMetrics().density * 24.0f;
        xw6Var.c = f3;
        int[] iArr = xw6Var.a;
        xw6Var.b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f3, iArr[0], iArr[1], Shader.TileMode.CLAMP));
        xw6Var.invalidateSelf();
        frameLayout.setBackground(new LayerDrawable(new Drawable[]{colorDrawable, xw6Var}));
        this.I0 = frameLayout;
        lfh lfhVar = new lfh(getContext(), this, new ps0(i2, this));
        lfhVar.b = (int) (1.0f * lfhVar.b);
        this.J0 = lfhVar;
        View view = new View(context);
        view.setClickable(false);
        view.setFocusableInTouchMode(false);
        view.setFocusable(false);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, zob.b(getCustomTheme().b().d, 0.84f)}));
        view.setVisibility(8);
        this.K0 = view;
        setClipToOutline(true);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -2, 80));
        addView(view, new FrameLayout.LayoutParams(-1, kti.d(f * vw4.d().getDisplayMetrics().density), 80));
    }

    public static int d(d52 d52Var) {
        return d52Var.getCustomTheme().getText().j;
    }

    public static void e(d52 d52Var) {
        if (d52Var.getPanelState() == b52.a && d52Var.C0) {
            int i = d52Var.t0;
            lfh lfhVar = d52Var.J0;
            FrameLayout frameLayout = d52Var.I0;
            if (lfhVar.q(frameLayout, frameLayout.getLeft(), i)) {
                d52Var.postInvalidateOnAnimation();
                d52Var.u0 = Integer.valueOf(i);
                d52Var.j(i);
            }
        }
    }

    private final yeb getCustomTheme() {
        return a93.s0.B(this).c;
    }

    private static /* synthetic */ void getPanelFrame$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b52 getPanelState() {
        yy7 yy7Var = L0[0];
        return (b52) this.D0.b;
    }

    private final void setExpandable(boolean z) {
        this.C0 = z;
        h(getPanelState());
    }

    private final void setPanelState(b52 b52Var) {
        this.D0.O(this, L0[0], b52Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void settleToPosition(int i) {
        if (this.J0.o(this.I0.getLeft(), i)) {
            postInvalidateOnAnimation();
            this.u0 = Integer.valueOf(i);
            j(i);
        }
    }

    @Override // defpackage.e88
    public final void a(cj9 cj9Var) {
        ChatMediaViewerScreen chatMediaViewerScreen = this.a;
        chatMediaViewerScreen.getClass();
        long j = cj9Var.a;
        if (mo2.$EnumSwitchMapping$2[cj9Var.c.ordinal()] == 1) {
            if (j > 0) {
                yq2 yq2VarQ0 = chatMediaViewerScreen.Q0();
                yq2VarQ0.s1.O(yq2VarQ0, yq2.u1[7], svi.e(yq2VarQ0.a, null, null, new aq2(yq2VarQ0, j, null), 3));
                return;
            }
            yq2 yq2VarQ02 = chatMediaViewerScreen.Q0();
            String str = cj9Var.b;
            if (str == null) {
                yq2VarQ02.getClass();
                return;
            }
            String strA = ((j98) yq2VarQ02.I0.getValue()).a(str);
            if (strA == null) {
                return;
            }
            yq2VarQ02.G(strA);
        }
    }

    @Override // defpackage.e88
    public final void b(String str, i88 i88Var, ClickableSpan clickableSpan) {
        this.a.Q0().H(str, i88Var);
    }

    @Override // defpackage.ab3
    public final void c(String str, cj9 cj9Var, MotionEvent motionEvent) {
        yq2 yq2VarQ0 = this.a.Q0();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        yq2VarQ0.getClass();
        String str2 = cj9Var.b;
        if (str2 != null) {
            str = "@".concat(str2);
        }
        xfh.r(yq2VarQ0.U0, new uh5(rawX, rawY, new r5g(str), gwi.b(new imb("chat.media.viewer.link", str), new imb("chat.media.viewer.entity_id", Long.valueOf(cj9Var.a)), new imb("chat.media.viewer.link_type", 4)), ve3.j((str2 == null || str2.length() == 0) ? new b44(evd.j, new n5g(fvd.s), Integer.valueOf(yud.k1), (Integer) null, 20) : new b44(evd.f, new n5g(fvd.o), Integer.valueOf(ivd.A), (Integer) null, 20), new b44(evd.b, new n5g(fvd.k), Integer.valueOf(yud.s), (Integer) null, 20))));
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.J0.f()) {
            postInvalidateOnAnimation();
        }
    }

    public final int getCollapsedPanelHeight() {
        return this.v0;
    }

    public final b52 getState() {
        return getPanelState();
    }

    public final void h(b52 b52Var) {
        int iOrdinal = b52Var.ordinal();
        r35 r35Var = this.E0;
        FrameLayout frameLayout = this.I0;
        if (iOrdinal == 0) {
            frameLayout.setOutlineProvider(new ls0(1, vw4.d().getDisplayMetrics().density * 20.0f));
            frameLayout.setClipToOutline(true);
            r35Var.setVisibility(this.C0 ? 0 : 8);
        } else if (iOrdinal == 1) {
            frameLayout.setOutlineProvider(new ls0(1, vw4.d().getDisplayMetrics().density * 20.0f));
            frameLayout.setClipToOutline(true);
            r35Var.setVisibility(0);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            frameLayout.setOutlineProvider(null);
            frameLayout.setClipToOutline(false);
            r35Var.setVisibility(0);
        }
    }

    public final void i() {
        Integer num = this.u0;
        this.K0.setVisibility((this.C0 && getPanelState() == b52.a) || (getPanelState() == b52.b && num != null && this.t0 < num.intValue()) ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r2) {
        /*
            r1 = this;
            int r0 = r1.o
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0 - r2
            int r2 = r1.v0
            if (r0 > r2) goto Ld
            b52 r2 = defpackage.b52.a
            goto L22
        Ld:
            java.lang.Integer r2 = r1.x0
            if (r2 == 0) goto L20
            if (r2 == 0) goto L18
            int r2 = r2.intValue()
            goto L1b
        L18:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L1b:
            if (r0 < r2) goto L20
            b52 r2 = defpackage.b52.c
            goto L22
        L20:
            b52 r2 = defpackage.b52.b
        L22:
            r1.setPanelState(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d52.j(int):void");
    }

    @Override // defpackage.ab3
    public final boolean k(ClickableSpan clickableSpan, int i, int i2, String str, i88 i88Var, MotionEvent motionEvent) {
        List listJ;
        yq2 yq2VarQ0 = this.a.Q0();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        yq2VarQ0.getClass();
        Bundle bundleB = gwi.b(new imb("chat.media.viewer.link", str), new imb("chat.media.viewer.link_type", Integer.valueOf(i88Var.ordinal())));
        int iV = az1.v(ooi.b(str) ? 3 : ooi.c(str) ? 2 : 1);
        if (iV == 0) {
            listJ = ve3.j(new b44(i88Var == i88.o ? evd.i : evd.g, new n5g(fvd.p), Integer.valueOf(yud.C0), (Integer) null, 20), new b44(evd.b, new n5g(fvd.l), Integer.valueOf(yud.s), (Integer) null, 20));
        } else if (iV == 1) {
            listJ = ve3.j(new b44(evd.g, new n5g(fvd.r), Integer.valueOf(yud.e0), (Integer) null, 20), new b44(evd.b, new n5g(fvd.n), Integer.valueOf(yud.s), (Integer) null, 20));
        } else {
            if (iV != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listJ = ve3.j(new b44(evd.g, new n5g(fvd.q), Integer.valueOf(yud.C0), (Integer) null, 20), new b44(evd.b, new n5g(fvd.m), Integer.valueOf(yud.s), (Integer) null, 20));
        }
        xfh.r(yq2VarQ0.U0, new uh5(rawX, rawY, new r5g(str), bundleB, listJ));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CharSequence text = this.F0.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        h88 h88Var = this.b;
        h88Var.a = this;
        h88Var.c(spannable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CharSequence text = this.F0.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.a = null;
        h88.a(spannable);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.C0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Integer num = this.u0;
            boolean z = num != null && num.intValue() == this.t0;
            c52 c52Var = this.G0;
            boolean zCanScrollVertically = c52Var.canScrollVertically(-1);
            boolean zCanScrollVertically2 = c52Var.canScrollVertically(1);
            int actionMasked = motionEvent.getActionMasked();
            lfh lfhVar = this.J0;
            if (actionMasked == 0) {
                this.y0 = y;
                this.B0 = false;
                lfhVar.j(motionEvent);
                return false;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float f = y - this.y0;
                    FrameLayout frameLayout = this.I0;
                    int left = frameLayout.getLeft();
                    LinearLayout linearLayout = this.H0;
                    int left2 = linearLayout.getLeft() + left;
                    int top = linearLayout.getTop() + frameLayout.getTop();
                    int right = linearLayout.getRight() + frameLayout.getLeft();
                    int bottom = linearLayout.getBottom() + frameLayout.getTop();
                    Rect rect = this.d;
                    rect.set(left2, top, right, bottom);
                    if (rect.contains((int) x, (int) y)) {
                        if (!this.B0 && Math.abs(f) > this.A0) {
                            this.B0 = true;
                        }
                        if (this.B0) {
                            if (!z) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                return true;
                            }
                            boolean z2 = f > 0.0f;
                            boolean z3 = f < 0.0f;
                            if ((!z2 || !zCanScrollVertically) && (!z3 || !zCanScrollVertically2)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                                return true;
                            }
                        }
                    }
                } else if (actionMasked != 3) {
                    return lfhVar.p(motionEvent);
                }
            }
            this.y0 = 0.0f;
            this.B0 = false;
            return false;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.o = getMeasuredHeight();
        FrameLayout frameLayout = this.I0;
        this.w0 = frameLayout.getMeasuredHeight();
        Layout layout = this.F0.getLayout();
        int lineCount = layout != null ? layout.getLineCount() : 1;
        int paddingBottom = lineCount <= 1 ? this.w0 : frameLayout.getPaddingBottom() + frameLayout.getPaddingTop() + this.c;
        this.v0 = paddingBottom;
        int i5 = this.o;
        this.s0 = i5 - paddingBottom;
        this.t0 = i5 - this.w0;
        if (this.u0 == null || getPanelState() == b52.a) {
            frameLayout.offsetTopAndBottom(this.s0 - frameLayout.getTop());
            this.u0 = Integer.valueOf(this.s0);
        }
        setExpandable(lineCount > 1);
        Integer num = this.u0;
        j(num != null ? num.intValue() : this.s0);
        i();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Integer num = this.x0;
        if (num != null) {
            int iIntValue = num.intValue();
            FrameLayout frameLayout = this.I0;
            if (frameLayout.getMeasuredHeight() > iIntValue) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r0 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e6, code lost:
    
        if (r4.contains((int) r0, (int) r2) == false) goto L50;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d52.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setMaxExpandedHeightPx(int i) {
        this.x0 = Integer.valueOf(i);
        invalidate();
        requestLayout();
    }

    public final void setText(CharSequence charSequence) {
        h88 h88Var = this.b;
        yta ytaVar = this.F0;
        ytaVar.setText(h88Var.getTransformation(charSequence, ytaVar));
        CharSequence text = ytaVar.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            h88Var.a = this;
            h88Var.c(spannable);
        }
        setPanelState(b52.a);
        this.u0 = null;
        requestLayout();
    }
}
