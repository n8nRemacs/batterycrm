package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class yfb extends FrameLayout implements rce, u6g {
    public static final /* synthetic */ yy7[] J0 = {new z8a(yfb.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), u45.h(vid.a, yfb.class, "form", "getForm()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Form;"), new z8a(yfb.class, "rightActions", "getRightActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Right;"), new z8a(yfb.class, "leftActions", "getLeftActions()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar$Action$Left;"), new z8a(yfb.class, "actionsHorizontalPadding", "getActionsHorizontalPadding()Lkotlin/Pair;"), new z8a(yfb.class, "isTextShimmerEnabled", "isTextShimmerEnabled()Z")};
    public View A0;
    public View B0;
    public View C0;
    public final Rect D0;
    public boolean E0;
    public boolean F0;
    public cm6 G0;
    public long H0;
    public cm6 I0;
    public final xfb a;
    public final xfb b;
    public final xfb c;
    public final xfb d;
    public final xfb o;
    public final xfb s0;
    public final TextView t0;
    public final Object u0;
    public final Object v0;
    public final Object w0;
    public final Object x0;
    public final Object y0;
    public OneMeButton z0;

    public yfb(final Context context, int i) {
        super(context, null, 0);
        boolean z = false;
        this.a = new xfb(this, 0, z);
        this.b = new xfb(this, 1);
        this.c = new xfb(this, 2);
        this.d = new xfb(this, 3);
        this.o = new xfb(this, 4, z);
        this.s0 = new xfb(this, 5);
        TextView textView = new TextView(context);
        textView.setId(zud.S0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(a93.s0.y(textView).getText().e);
        textView.setTextAlignment(5);
        mfh.k(textView, false);
        textView.setSingleLine();
        this.t0 = textView;
        final int i2 = 0;
        this.u0 = ipi.b(3, new cm6() { // from class: efb
            @Override // defpackage.cm6
            public final Object invoke() {
                ViewGroup.LayoutParams layoutParams;
                switch (i2) {
                    case 0:
                        iwe iweVar = new iwe(context);
                        iweVar.setId(zud.R0);
                        iweVar.setEllipsize(TextUtils.TruncateAt.END);
                        v1a v1aVar = a93.s0;
                        iweVar.setTextColor(v1aVar.y(iweVar).getText().e);
                        iweVar.setSingleLine();
                        ulc ulcVar = new ulc(4);
                        bwe bweVar = (bwe) ulcVar.b;
                        bweVar.j = false;
                        bweVar.d = v1aVar.y(iweVar).getText().a;
                        ulcVar.q(v1aVar.y(iweVar).getText().h);
                        ulcVar.r(900L);
                        ulcVar.p(1.0f);
                        ulcVar.s(kti.d(360 * vw4.d().getDisplayMetrics().density));
                        bweVar.p = new LinearInterpolator();
                        iweVar.a(ulcVar.k());
                        jgh.a(iweVar);
                        dpg.l.b(iweVar, t75.b);
                        yfb yfbVar = this;
                        xfb xfbVar = yfbVar.s0;
                        yy7 yy7Var = yfb.J0[5];
                        boolean zBooleanValue = ((Boolean) xfbVar.b).booleanValue();
                        ewe eweVar = iweVar.b;
                        if (zBooleanValue) {
                            iweVar.c = true;
                            if (zBooleanValue) {
                                eweVar.c();
                            }
                        } else {
                            eweVar.d();
                            iweVar.c = false;
                            iweVar.invalidate();
                        }
                        yfbVar.addView(iweVar);
                        return iweVar;
                    case 1:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.T0);
                        yfb yfbVar2 = this;
                        if (yfbVar2.getForm() == qfb.c) {
                            float f = 40;
                            layoutParams = new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        } else {
                            float f2 = 24;
                            layoutParams = new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        }
                        uxaVar.setLayoutParams(layoutParams);
                        uxaVar.setAvatarShape(kxa.a);
                        yfbVar2.addView(uxaVar);
                        return uxaVar;
                    case 2:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.U0);
                        float f3 = 16;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        imageView.setImageDrawable(r34.b(imageView.getContext(), yud.a0).mutate());
                        imageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(imageView).getIcon().f));
                        this.addView(imageView);
                        return imageView;
                    default:
                        bgb bgbVar = new bgb(context);
                        bgbVar.setId(zud.Q0);
                        bgbVar.setVisibility(8);
                        bgbVar.setAlpha(0.0f);
                        bgbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        this.addView(bgbVar);
                        return bgbVar;
                }
            }
        });
        final int i3 = 1;
        this.v0 = ipi.b(3, new cm6() { // from class: efb
            @Override // defpackage.cm6
            public final Object invoke() {
                ViewGroup.LayoutParams layoutParams;
                switch (i3) {
                    case 0:
                        iwe iweVar = new iwe(context);
                        iweVar.setId(zud.R0);
                        iweVar.setEllipsize(TextUtils.TruncateAt.END);
                        v1a v1aVar = a93.s0;
                        iweVar.setTextColor(v1aVar.y(iweVar).getText().e);
                        iweVar.setSingleLine();
                        ulc ulcVar = new ulc(4);
                        bwe bweVar = (bwe) ulcVar.b;
                        bweVar.j = false;
                        bweVar.d = v1aVar.y(iweVar).getText().a;
                        ulcVar.q(v1aVar.y(iweVar).getText().h);
                        ulcVar.r(900L);
                        ulcVar.p(1.0f);
                        ulcVar.s(kti.d(360 * vw4.d().getDisplayMetrics().density));
                        bweVar.p = new LinearInterpolator();
                        iweVar.a(ulcVar.k());
                        jgh.a(iweVar);
                        dpg.l.b(iweVar, t75.b);
                        yfb yfbVar = this;
                        xfb xfbVar = yfbVar.s0;
                        yy7 yy7Var = yfb.J0[5];
                        boolean zBooleanValue = ((Boolean) xfbVar.b).booleanValue();
                        ewe eweVar = iweVar.b;
                        if (zBooleanValue) {
                            iweVar.c = true;
                            if (zBooleanValue) {
                                eweVar.c();
                            }
                        } else {
                            eweVar.d();
                            iweVar.c = false;
                            iweVar.invalidate();
                        }
                        yfbVar.addView(iweVar);
                        return iweVar;
                    case 1:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.T0);
                        yfb yfbVar2 = this;
                        if (yfbVar2.getForm() == qfb.c) {
                            float f = 40;
                            layoutParams = new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        } else {
                            float f2 = 24;
                            layoutParams = new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        }
                        uxaVar.setLayoutParams(layoutParams);
                        uxaVar.setAvatarShape(kxa.a);
                        yfbVar2.addView(uxaVar);
                        return uxaVar;
                    case 2:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.U0);
                        float f3 = 16;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        imageView.setImageDrawable(r34.b(imageView.getContext(), yud.a0).mutate());
                        imageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(imageView).getIcon().f));
                        this.addView(imageView);
                        return imageView;
                    default:
                        bgb bgbVar = new bgb(context);
                        bgbVar.setId(zud.Q0);
                        bgbVar.setVisibility(8);
                        bgbVar.setAlpha(0.0f);
                        bgbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        this.addView(bgbVar);
                        return bgbVar;
                }
            }
        });
        final int i4 = 2;
        this.w0 = ipi.b(3, new cm6() { // from class: efb
            @Override // defpackage.cm6
            public final Object invoke() {
                ViewGroup.LayoutParams layoutParams;
                switch (i4) {
                    case 0:
                        iwe iweVar = new iwe(context);
                        iweVar.setId(zud.R0);
                        iweVar.setEllipsize(TextUtils.TruncateAt.END);
                        v1a v1aVar = a93.s0;
                        iweVar.setTextColor(v1aVar.y(iweVar).getText().e);
                        iweVar.setSingleLine();
                        ulc ulcVar = new ulc(4);
                        bwe bweVar = (bwe) ulcVar.b;
                        bweVar.j = false;
                        bweVar.d = v1aVar.y(iweVar).getText().a;
                        ulcVar.q(v1aVar.y(iweVar).getText().h);
                        ulcVar.r(900L);
                        ulcVar.p(1.0f);
                        ulcVar.s(kti.d(360 * vw4.d().getDisplayMetrics().density));
                        bweVar.p = new LinearInterpolator();
                        iweVar.a(ulcVar.k());
                        jgh.a(iweVar);
                        dpg.l.b(iweVar, t75.b);
                        yfb yfbVar = this;
                        xfb xfbVar = yfbVar.s0;
                        yy7 yy7Var = yfb.J0[5];
                        boolean zBooleanValue = ((Boolean) xfbVar.b).booleanValue();
                        ewe eweVar = iweVar.b;
                        if (zBooleanValue) {
                            iweVar.c = true;
                            if (zBooleanValue) {
                                eweVar.c();
                            }
                        } else {
                            eweVar.d();
                            iweVar.c = false;
                            iweVar.invalidate();
                        }
                        yfbVar.addView(iweVar);
                        return iweVar;
                    case 1:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.T0);
                        yfb yfbVar2 = this;
                        if (yfbVar2.getForm() == qfb.c) {
                            float f = 40;
                            layoutParams = new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        } else {
                            float f2 = 24;
                            layoutParams = new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        }
                        uxaVar.setLayoutParams(layoutParams);
                        uxaVar.setAvatarShape(kxa.a);
                        yfbVar2.addView(uxaVar);
                        return uxaVar;
                    case 2:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.U0);
                        float f3 = 16;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        imageView.setImageDrawable(r34.b(imageView.getContext(), yud.a0).mutate());
                        imageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(imageView).getIcon().f));
                        this.addView(imageView);
                        return imageView;
                    default:
                        bgb bgbVar = new bgb(context);
                        bgbVar.setId(zud.Q0);
                        bgbVar.setVisibility(8);
                        bgbVar.setAlpha(0.0f);
                        bgbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        this.addView(bgbVar);
                        return bgbVar;
                }
            }
        });
        this.x0 = ipi.b(3, new ffb(0, this));
        final int i5 = 3;
        this.y0 = ipi.b(3, new cm6() { // from class: efb
            @Override // defpackage.cm6
            public final Object invoke() {
                ViewGroup.LayoutParams layoutParams;
                switch (i5) {
                    case 0:
                        iwe iweVar = new iwe(context);
                        iweVar.setId(zud.R0);
                        iweVar.setEllipsize(TextUtils.TruncateAt.END);
                        v1a v1aVar = a93.s0;
                        iweVar.setTextColor(v1aVar.y(iweVar).getText().e);
                        iweVar.setSingleLine();
                        ulc ulcVar = new ulc(4);
                        bwe bweVar = (bwe) ulcVar.b;
                        bweVar.j = false;
                        bweVar.d = v1aVar.y(iweVar).getText().a;
                        ulcVar.q(v1aVar.y(iweVar).getText().h);
                        ulcVar.r(900L);
                        ulcVar.p(1.0f);
                        ulcVar.s(kti.d(360 * vw4.d().getDisplayMetrics().density));
                        bweVar.p = new LinearInterpolator();
                        iweVar.a(ulcVar.k());
                        jgh.a(iweVar);
                        dpg.l.b(iweVar, t75.b);
                        yfb yfbVar = this;
                        xfb xfbVar = yfbVar.s0;
                        yy7 yy7Var = yfb.J0[5];
                        boolean zBooleanValue = ((Boolean) xfbVar.b).booleanValue();
                        ewe eweVar = iweVar.b;
                        if (zBooleanValue) {
                            iweVar.c = true;
                            if (zBooleanValue) {
                                eweVar.c();
                            }
                        } else {
                            eweVar.d();
                            iweVar.c = false;
                            iweVar.invalidate();
                        }
                        yfbVar.addView(iweVar);
                        return iweVar;
                    case 1:
                        uxa uxaVar = new uxa(context);
                        uxaVar.setId(zud.T0);
                        yfb yfbVar2 = this;
                        if (yfbVar2.getForm() == qfb.c) {
                            float f = 40;
                            layoutParams = new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        } else {
                            float f2 = 24;
                            layoutParams = new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        }
                        uxaVar.setLayoutParams(layoutParams);
                        uxaVar.setAvatarShape(kxa.a);
                        yfbVar2.addView(uxaVar);
                        return uxaVar;
                    case 2:
                        ImageView imageView = new ImageView(context);
                        imageView.setId(zud.U0);
                        float f3 = 16;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                        imageView.setImageDrawable(r34.b(imageView.getContext(), yud.a0).mutate());
                        imageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(imageView).getIcon().f));
                        this.addView(imageView);
                        return imageView;
                    default:
                        bgb bgbVar = new bgb(context);
                        bgbVar.setId(zud.Q0);
                        bgbVar.setVisibility(8);
                        bgbVar.setAlpha(0.0f);
                        bgbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        this.addView(bgbVar);
                        return bgbVar;
                }
            }
        });
        this.D0 = new Rect();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(textView, new FrameLayout.LayoutParams(-2, -2));
        l();
        m();
        addOnLayoutChangeListener(new es0(11, this));
        if (isLaidOut()) {
            e(this);
        }
    }

    public static final void d(yfb yfbVar, final ofb ofbVar) {
        View viewN;
        OneMeButton oneMeButton;
        yfbVar.removeView(yfbVar.A0);
        yfbVar.removeView(yfbVar.B0);
        yfbVar.removeView(yfbVar.C0);
        Context context = yfbVar.getContext();
        wfb searchViewInteraction = yfbVar.getSearchViewInteraction();
        boolean z = ofbVar instanceof lfb;
        View view = null;
        lfb lfbVar = z ? (lfb) ofbVar : null;
        View viewN2 = hfi.n(context, lfbVar != null ? lfbVar.c : null, searchViewInteraction);
        if (viewN2 != null) {
            viewN2.setId(zud.w0);
        } else {
            viewN2 = null;
        }
        yfbVar.C0 = viewN2;
        Context context2 = yfbVar.getContext();
        wfb searchViewInteraction2 = yfbVar.getSearchViewInteraction();
        lfb lfbVar2 = z ? (lfb) ofbVar : null;
        View viewN3 = hfi.n(context2, lfbVar2 != null ? lfbVar2.a : null, searchViewInteraction2);
        if (viewN3 != null) {
            viewN3.setId(zud.v0);
        } else {
            viewN3 = null;
        }
        yfbVar.B0 = viewN3;
        Context context3 = yfbVar.getContext();
        wfb searchViewInteraction3 = yfbVar.getSearchViewInteraction();
        yeb customTheme = yfbVar.getCustomTheme();
        if (z) {
            viewN = hfi.n(context3, ((lfb) ofbVar).b, searchViewInteraction3);
        } else {
            if (ofbVar instanceof nfb) {
                oneMeButton = new OneMeButton(context3, null);
                oneMeButton.setCustomTheme(customTheme);
                oneMeButton.d(Integer.valueOf(uwc.ic_more_vertical_filled_16));
                final int i = 0;
                f8j.d(oneMeButton, 300L, new View.OnClickListener() { // from class: dcg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i) {
                            case 0:
                                ((nfb) ofbVar).a.invoke(view2);
                                break;
                            case 1:
                                ((ifb) ofbVar).a.invoke(view2);
                                break;
                            default:
                                ((hfb) ofbVar).a.invoke(view2);
                                break;
                        }
                    }
                });
            } else if (ofbVar instanceof ifb) {
                oneMeButton = new OneMeButton(context3, null);
                oneMeButton.d(Integer.valueOf(uwc.ic_done_28));
                final int i2 = 1;
                f8j.d(oneMeButton, 300L, new View.OnClickListener() { // from class: dcg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i2) {
                            case 0:
                                ((nfb) ofbVar).a.invoke(view2);
                                break;
                            case 1:
                                ((ifb) ofbVar).a.invoke(view2);
                                break;
                            default:
                                ((hfb) ofbVar).a.invoke(view2);
                                break;
                        }
                    }
                });
            } else if (ofbVar instanceof hfb) {
                oneMeButton = new OneMeButton(context3, null);
                oneMeButton.d(Integer.valueOf(uwc.ic_cancel_outline_28));
                final int i3 = 2;
                f8j.d(oneMeButton, 300L, new View.OnClickListener() { // from class: dcg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i3) {
                            case 0:
                                ((nfb) ofbVar).a.invoke(view2);
                                break;
                            case 1:
                                ((ifb) ofbVar).a.invoke(view2);
                                break;
                            default:
                                ((hfb) ofbVar).a.invoke(view2);
                                break;
                        }
                    }
                });
            } else {
                if (!(ofbVar instanceof jfb)) {
                    throw new NoWhenBranchMatchedException();
                }
                viewN = null;
            }
            viewN = oneMeButton;
        }
        if (viewN != null) {
            viewN.setId(zud.u0);
            view = viewN;
        }
        yfbVar.A0 = view;
        if (view != null) {
            yfbVar.addView(view);
            jfi.a(view, kti.d(40 * vw4.d().getDisplayMetrics().density), kti.d(52 * vw4.d().getDisplayMetrics().density));
        }
        View view2 = yfbVar.B0;
        if (view2 != null) {
            yfbVar.addView(view2);
            jfi.a(view2, kti.d(40 * vw4.d().getDisplayMetrics().density), kti.d(52 * vw4.d().getDisplayMetrics().density));
        }
        View view3 = yfbVar.C0;
        if (view3 != null) {
            yfbVar.addView(view3);
            jfi.a(view3, kti.d(40 * vw4.d().getDisplayMetrics().density), kti.d(52 * vw4.d().getDisplayMetrics().density));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.yfb r5) {
        /*
            android.graphics.Rect r0 = r5.D0
            android.widget.TextView r1 = r5.t0
            int r2 = r1.getLeft()
            int r1 = r1.getRight()
            int r3 = r5.getHeight()
            r4 = 0
            r0.set(r2, r4, r1, r3)
            java.lang.Object r1 = r5.v0
            boolean r2 = r1.e()
            if (r2 == 0) goto L2e
            java.lang.Object r1 = r1.getValue()
            uxa r1 = (defpackage.uxa) r1
            int r1 = r1.getLeft()
            int r2 = r0.left
            int r1 = java.lang.Math.min(r1, r2)
            r0.left = r1
        L2e:
            java.lang.Object r1 = r5.u0
            boolean r2 = r1.e()
            if (r2 == 0) goto L54
            java.lang.Object r1 = r1.getValue()
            iwe r1 = (defpackage.iwe) r1
            int r2 = r1.getLeft()
            int r3 = r0.left
            int r2 = java.lang.Math.min(r2, r3)
            r0.left = r2
            int r1 = r1.getRight()
            int r2 = r0.right
            int r1 = java.lang.Math.max(r1, r2)
            r0.right = r1
        L54:
            one.me.sdk.uikit.common.button.OneMeButton r1 = r5.z0
            if (r1 == 0) goto L91
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L83
            android.view.TouchDelegate r2 = r1.getTouchDelegate()
            if (r2 == 0) goto L81
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r2 = defpackage.hld.j(r2)
            if (r2 == 0) goto L81
            int r3 = defpackage.hld.b(r2)
            if (r3 > 0) goto L72
            r2 = 0
            goto L76
        L72:
            android.graphics.Region r2 = defpackage.hld.d(r2)
        L76:
            if (r2 == 0) goto L81
            android.graphics.Rect r2 = r2.getBounds()
            if (r2 == 0) goto L81
            int r2 = r2.right
            goto L87
        L81:
            r2 = -1
            goto L87
        L83:
            int r2 = r1.getRight()
        L87:
            int r1 = r1.getRight()
            int r1 = java.lang.Math.max(r2, r1)
            r0.left = r1
        L91:
            java.lang.Object r1 = r5.w0
            boolean r2 = r1.e()
            if (r2 == 0) goto Lab
            java.lang.Object r1 = r1.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r1 = r1.getRight()
            int r2 = r0.right
            int r1 = java.lang.Math.max(r1, r2)
            r0.right = r1
        Lab:
            android.view.View r1 = r5.A0
            if (r1 == 0) goto Lbd
            int r2 = defpackage.jfi.d(r1)
            int r1 = r1.getLeft()
            int r1 = java.lang.Math.min(r2, r1)
            r0.right = r1
        Lbd:
            android.view.View r1 = r5.B0
            if (r1 == 0) goto Lcf
            int r2 = defpackage.jfi.d(r1)
            int r1 = r1.getLeft()
            int r1 = java.lang.Math.min(r2, r1)
            r0.right = r1
        Lcf:
            android.view.View r5 = r5.C0
            if (r5 == 0) goto Le1
            int r1 = defpackage.jfi.d(r5)
            int r5 = r5.getLeft()
            int r5 = java.lang.Math.min(r1, r5)
            r0.right = r5
        Le1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfb.e(yfb):void");
    }

    private final yeb getCurrentTheme() {
        yeb customTheme = getCustomTheme();
        return customTheme == null ? a93.s0.y(this) : customTheme;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final wfb getSearchViewInteraction() {
        return (wfb) this.x0.getValue();
    }

    private final int getVerticalPaddingOffset() {
        return (getPaddingTop() / 2) - (getPaddingBottom() / 2);
    }

    public static void i(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    public static void j(View view, int i, int i2) {
        view.layout(i, i2 - (view.getMeasuredHeight() / 2), view.getMeasuredWidth() + i, view.getMeasuredHeight() + (i2 - (view.getMeasuredHeight() / 2)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.rce
    public final void a() {
        ((bgb) this.y0.getValue()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.rce
    public final boolean b() {
        ?? r0 = this.y0;
        return r0.e() && ((bgb) r0.getValue()).b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.rce
    public final void c(String str, List list, cm6 cm6Var, em6 em6Var) {
        ((bgb) this.y0.getValue()).c(str, list, cm6Var, em6Var);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, k18] */
    public final void f(boolean z) {
        this.F0 = !z;
        this.t0.setVisibility(z ? 0 : 8);
        ?? r2 = this.u0;
        if (r2.e()) {
            ((iwe) r2.getValue()).setVisibility(z ? 0 : 8);
        }
        ?? r22 = this.v0;
        if (r22.e()) {
            ((uxa) r22.getValue()).setVisibility(z ? 0 : 8);
        }
        ?? r23 = this.w0;
        if (r23.e()) {
            ((ImageView) r23.getValue()).setVisibility(z ? 0 : 8);
        }
        OneMeButton oneMeButton = this.z0;
        if (oneMeButton != null) {
            oneMeButton.setVisibility(z ? 0 : 8);
        }
        View view = this.A0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        View view2 = this.B0;
        if (view2 != null) {
            view2.setVisibility(z ? 0 : 8);
        }
        View view3 = this.C0;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, k18] */
    public final void g() {
        this.F0 = true;
        setPadding(0, getPaddingTop(), kti.d(12 * vw4.d().getDisplayMetrics().density), getPaddingBottom());
        View view = this.B0;
        if (view instanceof fbb) {
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(0);
                view.setLayoutParams(marginLayoutParams);
            }
            View view2 = this.A0;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.C0;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        View view4 = this.C0;
        if (view4 instanceof fbb) {
            if (view4 != null) {
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMarginEnd(0);
                view4.setLayoutParams(marginLayoutParams2);
            }
            View view5 = this.A0;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            View view6 = this.B0;
            if (view6 != null) {
                view6.setVisibility(8);
            }
        }
        this.t0.setVisibility(8);
        ?? r0 = this.u0;
        if (r0.e()) {
            ((iwe) r0.getValue()).setVisibility(8);
        }
        ?? r02 = this.v0;
        if (r02.e()) {
            ((uxa) r02.getValue()).setVisibility(8);
        }
        ?? r03 = this.w0;
        if (r03.e()) {
            ((ImageView) r03.getValue()).setVisibility(8);
        }
        OneMeButton oneMeButton = this.z0;
        if (oneMeButton != null) {
            oneMeButton.setVisibility(8);
        }
    }

    public final imb getActionsHorizontalPadding() {
        yy7 yy7Var = J0[4];
        return (imb) this.o.b;
    }

    public final yeb getCustomTheme() {
        yy7 yy7Var = J0[0];
        return (yeb) this.a.b;
    }

    public final qfb getForm() {
        yy7 yy7Var = J0[1];
        return (qfb) this.b.b;
    }

    public final mfb getLeftActions() {
        yy7 yy7Var = J0[3];
        return (mfb) this.d.b;
    }

    public final ofb getRightActions() {
        yy7 yy7Var = J0[2];
        return (ofb) this.c.b;
    }

    public final fbb getSearchView() {
        View view = this.A0;
        fbb fbbVar = view instanceof fbb ? (fbb) view : null;
        if (fbbVar == null) {
            View view2 = this.B0;
            fbbVar = view2 instanceof fbb ? (fbb) view2 : null;
            if (fbbVar == null) {
                View view3 = this.C0;
                if (view3 instanceof fbb) {
                    return (fbb) view3;
                }
                return null;
            }
        }
        return fbbVar;
    }

    public final TextView getTitle() {
        return this.t0;
    }

    public final boolean h() {
        fbb searchView = getSearchView();
        dbb state = searchView != null ? searchView.getState() : null;
        return state == dbb.c || state == dbb.d || state == dbb.b;
    }

    public final int k(int i, int i2, View view, View view2, View view3, int i3, int i4) {
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        if (view != null && view2 != null && view3 != null) {
            measureChild(view, i, i2);
            measureChild(view2, i, i2);
            measureChild(view3, i, i2);
            return (i4 * 2) + view3.getMeasuredWidth() + view2.getMeasuredWidth() + view.getMeasuredWidth() + i3;
        }
        if (view != null && view2 != null) {
            measureChild(view, i, i2);
            measureChild(view2, i, i2);
            measuredWidth2 = view.getMeasuredWidth();
            measuredWidth3 = view2.getMeasuredWidth();
        } else {
            if (view2 == null || view3 == null) {
                if (view != null) {
                    measureChild(view, i, i2);
                    measuredWidth = view.getMeasuredWidth();
                } else if (view2 != null) {
                    measureChild(view2, i, i2);
                    measuredWidth = view2.getMeasuredWidth();
                } else {
                    if (view3 == null) {
                        return 0;
                    }
                    measureChild(view3, i, i2);
                    measuredWidth = view3.getMeasuredWidth();
                }
                return measuredWidth + i3;
            }
            measureChild(view2, i, i2);
            measureChild(view3, i, i2);
            measuredWidth2 = view2.getMeasuredWidth();
            measuredWidth3 = view3.getMeasuredWidth();
        }
        return measuredWidth3 + measuredWidth2 + i4 + i3;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, k18] */
    public final void l() {
        int iOrdinal = getForm().ordinal();
        TextView textView = this.t0;
        if (iOrdinal == 0) {
            dpg.x.b(textView, t75.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            OneMeButton oneMeButton = this.z0;
            if (oneMeButton != null) {
                gfi.a(oneMeButton, getLeftActions(), getCustomTheme());
            }
            View view = this.B0;
            if (view != null) {
                gfi.b(view, getRightActions(), 2);
            }
            View view2 = this.A0;
            if (view2 != null) {
                gfi.b(view2, getRightActions(), 1);
            }
        } else if (iOrdinal == 1) {
            dpg.v.b(textView, t75.b);
            textView.setTextColor(getCurrentTheme().getText().e);
            View view3 = this.B0;
            if (view3 != null) {
                gfi.c(view3, getRightActions(), 2);
            }
            View view4 = this.A0;
            if (view4 != null) {
                gfi.c(view4, getRightActions(), 1);
            }
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dpg.x.b(textView, t75.b);
            textView.setTextColor(getCurrentTheme().a().u().d.a.b);
            OneMeButton oneMeButton2 = this.z0;
            if (oneMeButton2 != null) {
                gfi.a(oneMeButton2, getLeftActions(), getCustomTheme());
            }
            View view5 = this.C0;
            if (view5 != null) {
                gfi.b(view5, getRightActions(), 3);
            }
            View view6 = this.B0;
            if (view6 != null) {
                gfi.b(view6, getRightActions(), 2);
            }
            View view7 = this.A0;
            if (view7 != null) {
                gfi.b(view7, getRightActions(), 1);
            }
        }
        ?? r0 = this.u0;
        if (r0.e()) {
            iwe iweVar = (iwe) r0.getValue();
            yy7 yy7Var = J0[5];
            if (((Boolean) this.s0.b).booleanValue()) {
                dpg.f.b(iweVar, t75.b);
                iweVar.setTextColor(getCurrentTheme().getText().h);
            } else {
                dpg.l.b(iweVar, t75.b);
                iweVar.setTextColor(getCurrentTheme().getText().g);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    public final void m() {
        int iOrdinal = getForm().ordinal();
        ?? r4 = this.v0;
        TextView textView = this.t0;
        if (iOrdinal == 0) {
            textView.setGravity(17);
            if (r4.e()) {
                uxa uxaVar = (uxa) r4.getValue();
                ViewGroup.LayoutParams layoutParams = uxaVar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                float f = 24;
                layoutParams.width = kti.d(vw4.d().getDisplayMetrics().density * f);
                layoutParams.height = kti.d(f * vw4.d().getDisplayMetrics().density);
                uxaVar.setLayoutParams(layoutParams);
            }
            imb actionsHorizontalPadding = getActionsHorizontalPadding();
            int iIntValue = actionsHorizontalPadding != null ? ((Number) actionsHorizontalPadding.a).intValue() : kti.d(12 * vw4.d().getDisplayMetrics().density);
            imb actionsHorizontalPadding2 = getActionsHorizontalPadding();
            setPadding(iIntValue, 0, actionsHorizontalPadding2 != null ? ((Number) actionsHorizontalPadding2.b).intValue() : kti.d(12 * vw4.d().getDisplayMetrics().density), 0);
            return;
        }
        if (iOrdinal == 1) {
            textView.setGravity(8388611);
            if (r4.e()) {
                uxa uxaVar2 = (uxa) r4.getValue();
                ViewGroup.LayoutParams layoutParams2 = uxaVar2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                float f2 = 24;
                layoutParams2.width = kti.d(vw4.d().getDisplayMetrics().density * f2);
                layoutParams2.height = kti.d(f2 * vw4.d().getDisplayMetrics().density);
                uxaVar2.setLayoutParams(layoutParams2);
            }
            imb actionsHorizontalPadding3 = getActionsHorizontalPadding();
            int iIntValue2 = actionsHorizontalPadding3 != null ? ((Number) actionsHorizontalPadding3.a).intValue() : kti.d(16 * vw4.d().getDisplayMetrics().density);
            imb actionsHorizontalPadding4 = getActionsHorizontalPadding();
            setPadding(iIntValue2, 0, actionsHorizontalPadding4 != null ? ((Number) actionsHorizontalPadding4.b).intValue() : kti.d(12 * vw4.d().getDisplayMetrics().density), 0);
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        textView.setGravity(8388611);
        if (r4.e()) {
            uxa uxaVar3 = (uxa) r4.getValue();
            ViewGroup.LayoutParams layoutParams3 = uxaVar3.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            float f3 = 40;
            layoutParams3.width = kti.d(vw4.d().getDisplayMetrics().density * f3);
            layoutParams3.height = kti.d(f3 * vw4.d().getDisplayMetrics().density);
            uxaVar3.setLayoutParams(layoutParams3);
        }
        imb actionsHorizontalPadding5 = getActionsHorizontalPadding();
        int iIntValue3 = actionsHorizontalPadding5 != null ? ((Number) actionsHorizontalPadding5.a).intValue() : kti.d(4 * vw4.d().getDisplayMetrics().density);
        imb actionsHorizontalPadding6 = getActionsHorizontalPadding();
        setPadding(iIntValue3, 0, actionsHorizontalPadding6 != null ? ((Number) actionsHorizontalPadding6.b).intValue() : kti.d(4 * vw4.d().getDisplayMetrics().density), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, k18] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int verticalPaddingOffset;
        int measuredHeight2;
        int verticalPaddingOffset2;
        int measuredHeight3;
        int verticalPaddingOffset3;
        int iOrdinal = getForm().ordinal();
        ?? r11 = this.v0;
        ?? r13 = this.w0;
        ?? r14 = this.u0;
        ?? r0 = this.y0;
        TextView textView = this.t0;
        if (iOrdinal == 0) {
            View viewJ = dqi.j(r0);
            if (viewJ != null) {
                j(viewJ, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            OneMeButton oneMeButton = this.z0;
            if (oneMeButton != null) {
                oneMeButton.layout(getPaddingLeft(), ((getMeasuredHeight() / 2) - (oneMeButton.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), oneMeButton.getMeasuredWidth() + getPaddingLeft(), (oneMeButton.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View viewJ2 = dqi.j(r14);
            if (viewJ2 != null) {
                measuredHeight = (((getMeasuredHeight() - viewJ2.getMeasuredHeight()) - textView.getMeasuredHeight()) - kti.d(2 * vw4.d().getDisplayMetrics().density)) / 2;
                verticalPaddingOffset = getVerticalPaddingOffset();
            } else {
                measuredHeight = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
                verticalPaddingOffset = getVerticalPaddingOffset();
            }
            int i5 = measuredHeight + verticalPaddingOffset;
            View view = this.A0;
            View view2 = this.B0;
            if ((view2 instanceof fbb) && h()) {
                fbb fbbVar = (fbb) view2;
                fbbVar.layout((getMeasuredWidth() - getPaddingRight()) - fbbVar.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (fbbVar.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (fbbVar.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (view != null && view2 != null) {
                view.layout((getMeasuredWidth() - getPaddingRight()) - view.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                float f = 12;
                view2.layout(u45.q(f, vw4.d().getDisplayMetrics().density, m8j.c(view) - view2.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), u45.q(f, vw4.d().getDisplayMetrics().density, m8j.c(view)), (view2.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view2 != null) {
                view2.layout((getMeasuredWidth() - getPaddingRight()) - view2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view2.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (view != null) {
                view.layout((getMeasuredWidth() - getPaddingRight()) - view.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View viewJ3 = dqi.j(r11);
            View viewJ4 = dqi.j(r13);
            int measuredHeight4 = (textView.getMeasuredHeight() / 2) + i5;
            int measuredWidth = (((getMeasuredWidth() / 2) - (viewJ3 != null ? (kti.d(8 * vw4.d().getDisplayMetrics().density) + viewJ3.getMeasuredWidth()) / 2 : 0)) - (viewJ4 != null ? (kti.d(2 * vw4.d().getDisplayMetrics().density) + viewJ4.getMeasuredWidth()) / 2 : 0)) - (textView.getMeasuredWidth() / 2);
            if (viewJ3 != null) {
                j(viewJ3, measuredWidth, measuredHeight4);
                measuredWidth = utb.j(8, vw4.d().getDisplayMetrics().density, viewJ3.getMeasuredWidth(), measuredWidth);
            }
            i(textView, measuredWidth, i5);
            float f2 = 2;
            int iJ = utb.j(f2, vw4.d().getDisplayMetrics().density, textView.getMeasuredWidth(), measuredWidth);
            if (viewJ4 != null) {
                j(viewJ4, iJ, measuredHeight4);
            }
            if (viewJ2 != null) {
                int measuredWidth2 = (getMeasuredWidth() / 2) - (viewJ2.getMeasuredWidth() / 2);
                View viewJ5 = dqi.j(r11);
                i(viewJ2, measuredWidth2, kti.d(f2 * vw4.d().getDisplayMetrics().density) + (viewJ5 != null ? viewJ5.getBottom() : textView.getBottom()));
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            View viewJ6 = dqi.j(r0);
            if (viewJ6 != null) {
                j(viewJ6, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            View viewJ7 = dqi.j(r14);
            if (viewJ7 != null) {
                measuredHeight2 = (((getMeasuredHeight() - viewJ7.getMeasuredHeight()) - textView.getMeasuredHeight()) - kti.d(2 * vw4.d().getDisplayMetrics().density)) / 2;
                verticalPaddingOffset2 = getVerticalPaddingOffset();
            } else {
                measuredHeight2 = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
                verticalPaddingOffset2 = getVerticalPaddingOffset();
            }
            int i6 = measuredHeight2 + verticalPaddingOffset2;
            i(textView, getPaddingLeft(), i6);
            View viewJ8 = dqi.j(r13);
            if (viewJ8 != null) {
                j(viewJ8, u45.c(2, vw4.d().getDisplayMetrics().density, textView.getRight()), (textView.getMeasuredHeight() / 2) + i6);
            }
            if (viewJ7 != null) {
                i(viewJ7, getPaddingLeft(), kti.d(2 * vw4.d().getDisplayMetrics().density) + textView.getBottom());
            }
            View view3 = this.A0;
            View view4 = this.B0;
            if ((view4 instanceof fbb) && h()) {
                fbb fbbVar2 = (fbb) view4;
                fbbVar2.layout((getMeasuredWidth() - getPaddingRight()) - fbbVar2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (fbbVar2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (fbbVar2.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            if (view3 != null && view4 != null) {
                view3.layout((getMeasuredWidth() - getPaddingRight()) - view3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view3.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                float f3 = 16;
                view4.layout(u45.q(f3, vw4.d().getDisplayMetrics().density, m8j.c(view3) - view4.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view4.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), u45.q(f3, vw4.d().getDisplayMetrics().density, m8j.c(view3)), (view4.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            } else if (view4 != null) {
                view4.layout((getMeasuredWidth() - getPaddingRight()) - view4.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view4.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view4.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            } else {
                if (view3 != null) {
                    view3.layout((getMeasuredWidth() - getPaddingRight()) - view3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view3.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                    return;
                }
                return;
            }
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        View viewJ9 = dqi.j(r0);
        if (viewJ9 != null) {
            j(viewJ9, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        View viewJ10 = dqi.j(r14);
        if (viewJ10 != null) {
            measuredHeight3 = ((getMeasuredHeight() - viewJ10.getMeasuredHeight()) - textView.getMeasuredHeight()) / 2;
            verticalPaddingOffset3 = getVerticalPaddingOffset();
        } else {
            measuredHeight3 = (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2);
            verticalPaddingOffset3 = getVerticalPaddingOffset();
        }
        int i7 = measuredHeight3 + verticalPaddingOffset3;
        int paddingLeft = getPaddingLeft();
        OneMeButton oneMeButton2 = this.z0;
        if (oneMeButton2 != null) {
            oneMeButton2.layout(getPaddingLeft(), ((getMeasuredHeight() / 2) - (oneMeButton2.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), oneMeButton2.getMeasuredWidth() + getPaddingLeft(), (oneMeButton2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            paddingLeft += oneMeButton2.getMeasuredWidth();
        }
        View viewJ11 = dqi.j(r11);
        if (viewJ11 != null) {
            int iD = paddingLeft + (this.z0 != null ? kti.d(8 * vw4.d().getDisplayMetrics().density) / 2 : kti.d(8 * vw4.d().getDisplayMetrics().density));
            j(viewJ11, iD, (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            paddingLeft = iD + viewJ11.getMeasuredWidth();
        }
        float f4 = 8;
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f4) + paddingLeft;
        i(textView, iD2, i7);
        View viewJ12 = dqi.j(r13);
        if (viewJ12 != null) {
            j(viewJ12, u45.c(2, vw4.d().getDisplayMetrics().density, textView.getRight()), (textView.getMeasuredHeight() / 2) + i7);
        }
        if (viewJ10 != null) {
            i(viewJ10, iD2, textView.getBottom());
        }
        View view5 = this.A0;
        View view6 = this.B0;
        View view7 = this.C0;
        if ((view6 instanceof fbb) && h()) {
            fbb fbbVar3 = (fbb) view6;
            fbbVar3.layout((getMeasuredWidth() - getPaddingRight()) - fbbVar3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (fbbVar3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (fbbVar3.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        if ((view7 instanceof fbb) && h()) {
            fbb fbbVar4 = (fbb) view7;
            fbbVar4.layout((getMeasuredWidth() - getPaddingRight()) - fbbVar4.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (fbbVar4.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (fbbVar4.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        if (view5 != null && view6 != null && view7 != null) {
            view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view5.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            view6.layout(u45.q(f4, vw4.d().getDisplayMetrics().density, m8j.c(view5) - view6.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view6.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), u45.q(f4, vw4.d().getDisplayMetrics().density, m8j.c(view5)), (view6.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            view7.layout(u45.q(f4, vw4.d().getDisplayMetrics().density, m8j.c(view6) - view7.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view7.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), u45.q(f4, vw4.d().getDisplayMetrics().density, m8j.c(view6)), (view7.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        if (view5 != null && view6 != null) {
            view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view5.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            view6.layout(u45.q(f4, vw4.d().getDisplayMetrics().density, m8j.c(view5) - view6.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view6.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), u45.q(f4, vw4.d().getDisplayMetrics().density, m8j.c(view5)), (view6.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            return;
        }
        if (view6 != null && view7 != null) {
            view6.layout((getMeasuredWidth() - getPaddingRight()) - view6.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view6.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view6.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            view7.layout(u45.q(f4, vw4.d().getDisplayMetrics().density, m8j.c(view6) - view7.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (view7.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), u45.q(f4, vw4.d().getDisplayMetrics().density, m8j.c(view6)), (view7.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
        } else if (view6 != null) {
            view6.layout((getMeasuredWidth() - getPaddingRight()) - view6.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view6.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view6.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
        } else if (view7 != null) {
            view7.layout((getMeasuredWidth() - getPaddingRight()) - view7.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view7.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view7.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
        } else if (view5 != null) {
            view5.layout((getMeasuredWidth() - getPaddingRight()) - view5.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (view5.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (view5.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, k18] */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iOrdinal = getForm().ordinal();
        ?? r8 = this.v0;
        TextView textView = this.t0;
        ?? r11 = this.w0;
        ?? r12 = this.u0;
        ?? r5 = this.y0;
        if (iOrdinal == 0) {
            int size = View.MeasureSpec.getSize(i);
            int paddingTop = getPaddingTop() + kti.d(52 * vw4.d().getDisplayMetrics().density) + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            View viewJ = dqi.j(r5);
            if (viewJ != null) {
                viewJ.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
            }
            if (viewJ != null) {
                measureChild(viewJ, i, i2);
            }
            float f = 12;
            int paddingRight = getPaddingRight() + k(i, i2, this.A0, this.B0, null, kti.d(16 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f));
            int paddingLeft2 = getPaddingLeft();
            OneMeButton oneMeButton = this.z0;
            if (oneMeButton != null) {
                measureChild(oneMeButton, i, i2);
                paddingLeft2 = utb.j(f, vw4.d().getDisplayMetrics().density, oneMeButton.getMeasuredWidth(), paddingLeft2);
            }
            int iMax = size - (Math.max(paddingLeft2, paddingRight) * 2);
            View viewJ2 = dqi.j(r12);
            if (viewJ2 != null) {
                viewJ2.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View viewJ3 = dqi.j(r8);
            if (viewJ3 != null) {
                measureChild(viewJ3, i, i2);
                iMax -= kti.d(8 * vw4.d().getDisplayMetrics().density) + viewJ3.getMeasuredWidth();
            }
            View viewJ4 = dqi.j(r11);
            if (viewJ4 != null) {
                measureChild(viewJ4, i, i2);
                iMax -= kti.d(2 * vw4.d().getDisplayMetrics().density) + viewJ4.getMeasuredWidth();
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size, paddingTop);
            return;
        }
        if (iOrdinal == 1) {
            int size2 = View.MeasureSpec.getSize(i);
            int paddingTop2 = getPaddingTop() + kti.d(52 * vw4.d().getDisplayMetrics().density) + getPaddingBottom();
            int paddingLeft3 = (size2 - getPaddingLeft()) - getPaddingRight();
            View viewJ5 = dqi.j(r5);
            if (viewJ5 != null) {
                viewJ5.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop2, 1073741824));
            }
            int iK = paddingLeft3 - k(i, i2, this.A0, this.B0, null, kti.d(16 * vw4.d().getDisplayMetrics().density), kti.d(12 * vw4.d().getDisplayMetrics().density));
            View viewJ6 = dqi.j(r12);
            if (viewJ6 != null) {
                viewJ6.measure(View.MeasureSpec.makeMeasureSpec(iK, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View viewJ7 = dqi.j(r11);
            if (viewJ7 != null) {
                measureChild(viewJ7, i, i2);
                iK -= kti.d(2 * vw4.d().getDisplayMetrics().density) + viewJ7.getMeasuredWidth();
            }
            textView.measure(View.MeasureSpec.makeMeasureSpec(iK, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size2, paddingTop2);
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int size3 = View.MeasureSpec.getSize(i);
        float f2 = 64;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + kti.d(vw4.d().getDisplayMetrics().density * f2);
        int paddingLeft4 = (size3 - getPaddingLeft()) - getPaddingRight();
        View viewJ8 = dqi.j(r5);
        if (viewJ8 != null) {
            viewJ8.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft4, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        }
        float f3 = 8;
        int iK2 = paddingLeft4 - k(i, i2, this.A0, this.B0, this.C0, kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3));
        OneMeButton oneMeButton2 = this.z0;
        if (oneMeButton2 != null) {
            measureChild(oneMeButton2, i, i2);
            iK2 -= oneMeButton2.getMeasuredWidth();
        }
        View viewJ9 = dqi.j(r8);
        if (viewJ9 != null) {
            measureChild(viewJ9, i, i2);
            iK2 -= kti.d(f3 * vw4.d().getDisplayMetrics().density) + (viewJ9.getMeasuredWidth() + (this.z0 != null ? kti.d(vw4.d().getDisplayMetrics().density * f3) / 2 : kti.d(vw4.d().getDisplayMetrics().density * f3)));
        }
        View viewJ10 = dqi.j(r12);
        if (viewJ10 != null) {
            viewJ10.measure(View.MeasureSpec.makeMeasureSpec(iK2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        View viewJ11 = dqi.j(r11);
        if (viewJ11 != null) {
            measureChild(viewJ11, i, i2);
            iK2 -= kti.d(2 * vw4.d().getDisplayMetrics().density) + viewJ11.getMeasuredWidth();
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(iK2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        setMeasuredDimension(size3, getPaddingBottom() + getPaddingTop() + kti.d(f2 * vw4.d().getDisplayMetrics().density));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        v1a v1aVar = a93.s0;
        a93 a93VarX = v1aVar.x(getContext());
        yeb currentTheme = getCurrentTheme();
        a93VarX.getClass();
        a93.g(this, currentTheme);
        l();
        ?? r0 = this.u0;
        if (r0.e()) {
            iwe iweVar = (iwe) r0.getValue();
            CharSequence text = iweVar.getText();
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            Object[] spans = spanned != null ? spanned.getSpans(0, iweVar.getText().length(), u6g.class) : null;
            if (spans == null) {
                spans = new u6g[0];
            }
            for (Object obj : spans) {
                u6g u6gVar = (u6g) obj;
                u6gVar.onThemeChanged(getCurrentTheme());
                b6g.b(iweVar, u6gVar);
            }
        }
        ?? r02 = this.w0;
        if (r02.e()) {
            ImageView imageView = (ImageView) r02.getValue();
            imageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(imageView).getIcon().f));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate;
        View view;
        TouchDelegate touchDelegate2;
        View view2;
        TouchDelegate touchDelegate3;
        View view3;
        TouchDelegate touchDelegate4;
        OneMeButton oneMeButton;
        if (motionEvent == null || this.F0) {
            return super.onTouchEvent(motionEvent);
        }
        cm6 cm6Var = this.I0;
        Rect rect = this.D0;
        if (cm6Var != null && motionEvent.getAction() == 0 && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.H0 = System.currentTimeMillis();
        }
        if (motionEvent.getAction() == 1 && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (this.I0 == null || System.currentTimeMillis() - this.H0 <= ViewConfiguration.getLongPressTimeout()) {
                cm6 cm6Var2 = this.G0;
                if (cm6Var2 != null) {
                    cm6Var2.invoke();
                }
                performClick();
            } else {
                cm6 cm6Var3 = this.I0;
                if (cm6Var3 != null) {
                    cm6Var3.invoke();
                }
            }
            this.H0 = 0L;
            return true;
        }
        OneMeButton oneMeButton2 = this.z0;
        if (oneMeButton2 == null || (touchDelegate4 = oneMeButton2.getTouchDelegate()) == null || !touchDelegate4.onTouchEvent(motionEvent)) {
            View view4 = this.B0;
            if (view4 == null || (touchDelegate3 = view4.getTouchDelegate()) == null || !touchDelegate3.onTouchEvent(motionEvent)) {
                View view5 = this.C0;
                if (view5 == null || (touchDelegate2 = view5.getTouchDelegate()) == null || !touchDelegate2.onTouchEvent(motionEvent)) {
                    View view6 = this.A0;
                    if (view6 != null && (touchDelegate = view6.getTouchDelegate()) != null && touchDelegate.onTouchEvent(motionEvent) && motionEvent.getAction() == 1 && (view = this.A0) != null) {
                        view.performClick();
                    }
                } else if (motionEvent.getAction() == 1 && (view2 = this.C0) != null) {
                    view2.performClick();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && (view3 = this.B0) != null) {
                view3.performClick();
                return true;
            }
        } else if (motionEvent.getAction() == 1 && (oneMeButton = this.z0) != null) {
            oneMeButton.performClick();
            return true;
        }
        return true;
    }

    public final void setActionsHorizontalPadding(imb imbVar) {
        this.o.O(this, J0[4], imbVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    public final void setAvatar(pfb pfbVar) {
        if (getForm() == qfb.b) {
            throw new IllegalStateException("setAvatar can't be applied for Form.Main");
        }
        int i = 8;
        ?? r1 = this.v0;
        if (pfbVar != null) {
            uxa uxaVar = (uxa) r1.getValue();
            uxaVar.l(fui.a(pfbVar.b, Long.valueOf(pfbVar.c)), true);
            uxaVar.setAvatarUrl(pfbVar.a);
            uxa.o(uxaVar, null, null, null, 30);
            uxaVar.setCustomOverlay(pfbVar.d);
            if (!h() && !this.F0) {
                i = 0;
            }
            uxaVar.setVisibility(i);
        } else if (r1.e()) {
            ((uxa) r1.getValue()).setVisibility(8);
        }
        if (h()) {
            return;
        }
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setAvatarAlpha(float f) {
        ?? r0 = this.v0;
        if (r0.e()) {
            ((uxa) r0.getValue()).setAlpha(f);
        }
    }

    public final void setCustomTheme(yeb yebVar) {
        this.a.O(this, J0[0], yebVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setDropdownRotationProgress(float f) {
        ?? r0 = this.w0;
        if (r0.e()) {
            ((ImageView) r0.getValue()).setRotation(n7j.b(f, 0.0f, 1.0f) * 180.0f);
        }
    }

    public final void setForm(qfb qfbVar) {
        this.b.O(this, J0[1], qfbVar);
    }

    public final void setLeftActions(mfb mfbVar) {
        this.d.O(this, J0[3], mfbVar);
    }

    public final void setRightActions(ofb ofbVar) {
        this.c.O(this, J0[2], ofbVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setShowDropdown(boolean z) {
        ((View) this.w0.getValue()).setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public final void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public final void setTextShimmerEnabled(boolean z) {
        this.s0.O(this, J0[5], Boolean.valueOf(z));
    }

    public final void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public final void setTitleAlpha(float f) {
        this.t0.setAlpha(f);
    }

    public final void setTitleClickListener(cm6 cm6Var) {
        this.G0 = cm6Var;
    }

    public final void setTitleLongClickListener(cm6 cm6Var) {
        this.I0 = cm6Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    public final void setSubtitle(CharSequence charSequence) {
        this.E0 = charSequence != null;
        ?? r2 = this.u0;
        if (charSequence != null) {
            ((iwe) r2.getValue()).setText(charSequence);
            ((View) r2.getValue()).setVisibility((h() || this.F0) ? 8 : 0);
        } else if (r2.e()) {
            ((iwe) r2.getValue()).setVisibility(8);
        }
        if (h()) {
            return;
        }
        requestLayout();
    }

    public final void setTitle(CharSequence charSequence) {
        this.t0.setText(charSequence);
    }
}
