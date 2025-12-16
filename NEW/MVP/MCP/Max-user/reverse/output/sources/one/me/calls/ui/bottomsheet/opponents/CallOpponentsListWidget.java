package one.me.calls.ui.bottomsheet.opponents;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.a93;
import defpackage.api;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bqi;
import defpackage.bwf;
import defpackage.c7j;
import defpackage.ci1;
import defpackage.cm6;
import defpackage.d74;
import defpackage.ei1;
import defpackage.eo7;
import defpackage.ff1;
import defpackage.fm1;
import defpackage.g31;
import defpackage.g44;
import defpackage.g56;
import defpackage.gi1;
import defpackage.gw0;
import defpackage.hbd;
import defpackage.hi1;
import defpackage.ho7;
import defpackage.hw1;
import defpackage.i84;
import defpackage.ii1;
import defpackage.in;
import defpackage.ipi;
import defpackage.j0b;
import defpackage.j2e;
import defpackage.ji1;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l48;
import defpackage.nha;
import defpackage.nr1;
import defpackage.or1;
import defpackage.pr1;
import defpackage.q;
import defpackage.qt7;
import defpackage.sn0;
import defpackage.svi;
import defpackage.t9f;
import defpackage.toc;
import defpackage.tv1;
import defpackage.vid;
import defpackage.vza;
import defpackage.w3b;
import defpackage.x9f;
import defpackage.yfb;
import defpackage.yq5;
import defpackage.yy7;
import defpackage.z8a;
import kotlin.Metadata;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.ok.tamtam.nano.Protos;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponents/CallOpponentsListWidget;", "Lone/me/sdk/arch/Widget;", "Lg44;", "Lor1;", "Lnha;", "Lj2e;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallOpponentsListWidget extends Widget implements g44, or1, nha, j2e {
    public static final /* synthetic */ yy7[] H0 = {new z8a(CallOpponentsListWidget.class, "actionHandlerJob", "getActionHandlerJob()Lkotlinx/coroutines/Job;"), ho7.d(vid.a, CallOpponentsListWidget.class, "collapsibleHeaderContainer", "getCollapsibleHeaderContainer()Landroid/widget/LinearLayout;", 0), new toc(CallOpponentsListWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(CallOpponentsListWidget.class, "oneMeButtonToolStack", "getOneMeButtonToolStack()Lone/me/sdk/uikit/common/buttonstack/OneMeButtonToolStack;", 0), new toc(CallOpponentsListWidget.class, "opponentsListView", "getOpponentsListView()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(CallOpponentsListWidget.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new toc(CallOpponentsListWidget.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), new toc(CallOpponentsListWidget.class, "titleOpponentListView", "getTitleOpponentListView()Landroid/widget/TextView;", 0), new toc(CallOpponentsListWidget.class, "titleWaitingListView", "getTitleWaitingListView()Landroid/widget/TextView;", 0), new toc(CallOpponentsListWidget.class, "searchView", "getSearchView()Lone/me/sdk/uikit/common/views/OneMeEditText;", 0), new toc(CallOpponentsListWidget.class, "emptyStateViewStub", "getEmptyStateViewStub()Landroid/view/ViewStub;", 0), new toc(CallOpponentsListWidget.class, "emptyStateView", "getEmptyStateView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0), new toc(CallOpponentsListWidget.class, "appBarLayoutView", "getAppBarLayoutView()Lcom/google/android/material/appbar/AppBarLayout;", 0)};
    public final sn0 A0;
    public final sn0 B0;
    public final sn0 C0;
    public final bwf D0;
    public final Object E0;
    public final sn0 F0;
    public final ka5 G0;
    public final Object X;
    public final k18 Y;
    public final sn0 Z;
    public final Object a;
    public final k18 b;
    public final Object c;
    public final Object d;
    public final t9f o;
    public final Object s0;
    public final sn0 t0;
    public final sn0 u0;
    public final sn0 v0;
    public final sn0 w0;
    public final sn0 x0;
    public final sn0 y0;
    public final bbd z0;

    /* JADX WARN: Multi-variable type inference failed */
    public CallOpponentsListWidget() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = ipi.b(3, new g31(23));
        this.b = fm1.b();
        final int i = 1;
        this.c = ipi.b(3, new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                int i3 = 2;
                int i4 = 0;
                int i5 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i3), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i5)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i6 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i6)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i4, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i4, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        this.d = ipi.b(3, new g31(21));
        this.o = c7j.c();
        final int i2 = 2;
        this.X = ipi.b(3, new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                int i3 = 2;
                int i4 = 0;
                int i5 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i3), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i5)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i6 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i6)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i4, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i4, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        this.Y = createViewModelLazy(ci1.class, new q(19, new g31(22)));
        final int i3 = 3;
        this.Z = binding(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                int i32 = 2;
                int i4 = 0;
                int i5 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i5)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i6 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i6)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i4, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i4, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i4 = 4;
        this.s0 = ipi.b(3, new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i4;
                int i32 = 2;
                int i42 = 0;
                int i5 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i5)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i6 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i6)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i5 = 5;
        this.t0 = binding(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i5;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i6 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i6)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i6 = 6;
        this.u0 = binding(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i6;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i62 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i62)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i7 = 7;
        this.v0 = binding(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i7;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i62 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i62)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i8 = 8;
        this.w0 = binding(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i8;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i62 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i62)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i9 = 9;
        this.x0 = binding(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i9;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i62 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i62)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i10 = 10;
        this.y0 = binding(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i10;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i62 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i62)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        this.z0 = viewBinding(j0b.W0);
        final int i11 = 11;
        this.A0 = binding(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i11;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i62 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i62)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i12 = 12;
        this.B0 = binding(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i12;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i62 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i62)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i13 = 13;
        this.C0 = binding(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i13;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i62 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i62)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i14 = 14;
        this.D0 = new bwf(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i14;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i62 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i62)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i15 = 15;
        this.E0 = ipi.b(3, new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i15;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i62 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i62)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        final int i16 = 0;
        this.F0 = binding(new cm6(this) { // from class: di1
            public final /* synthetic */ CallOpponentsListWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i16;
                int i32 = 2;
                int i42 = 0;
                int i52 = 1;
                CallOpponentsListWidget callOpponentsListWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                        in inVar = new in(callOpponentsListWidget.getContext());
                        inVar.setFocusable(true);
                        inVar.setFocusableInTouchMode(true);
                        inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        inVar.setBackground(null);
                        inVar.setStateListAnimator(null);
                        return inVar;
                    case 1:
                        yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                        return i9j.b(callOpponentsListWidget.getContext());
                    case 2:
                        yy7[] yy7VarArr3 = CallOpponentsListWidget.H0;
                        Drawable drawableB = r34.b(callOpponentsListWidget.getContext(), kwc.ic_clear_16);
                        drawableB.setTint(a93.s0.z(callOpponentsListWidget.getContext()).c.getText().g);
                        return drawableB;
                    case 3:
                        yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                        LinearLayout linearLayout = new LinearLayout(callOpponentsListWidget.getContext());
                        oe3 oe3Var = new oe3(-1, -2);
                        oe3Var.a = 2;
                        linearLayout.setLayoutParams(oe3Var);
                        linearLayout.setOrientation(1);
                        return linearLayout;
                    case 4:
                        yy7[] yy7VarArr5 = CallOpponentsListWidget.H0;
                        return new lfb(null, new sfb(i0b.B, new ei1(callOpponentsListWidget, i32), 14), null);
                    case 5:
                        yy7[] yy7VarArr6 = CallOpponentsListWidget.H0;
                        yfb yfbVar = new yfb(callOpponentsListWidget.getContext(), 6);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setTextShimmerEnabled(false);
                        yfbVar.setLeftActions(new gfb(new ei1(callOpponentsListWidget, i52)));
                        float f = 6;
                        yfbVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), yfbVar.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), yfbVar.getPaddingBottom());
                        yfbVar.setCustomTheme(a93.s0.B(yfbVar).c);
                        return yfbVar;
                    case 6:
                        yy7[] yy7VarArr7 = CallOpponentsListWidget.H0;
                        vza vzaVar = new vza(callOpponentsListWidget.getContext());
                        vzaVar.setId(j0b.t0);
                        d74 d74Var = new d74(-1, -2);
                        float f2 = 12;
                        d74Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
                        d74Var.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        ((ViewGroup.MarginLayoutParams) d74Var).topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        ((ViewGroup.MarginLayoutParams) d74Var).bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        vzaVar.setLayoutParams(d74Var);
                        vzaVar.setCustomTheme(a93.s0.B(vzaVar).c);
                        vzaVar.setAppearance(nza.b);
                        vzaVar.setListener(new xtd(15, callOpponentsListWidget));
                        return vzaVar;
                    case 7:
                        yy7[] yy7VarArr8 = CallOpponentsListWidget.H0;
                        RecyclerView recyclerView = new RecyclerView(callOpponentsListWidget.getContext(), null);
                        recyclerView.setId(eyc.call_user_list_in_call_list);
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager());
                        recyclerView.setAdapter((nh1) callOpponentsListWidget.D0.getValue());
                        recyclerView.setClipToPadding(true);
                        recyclerView.setBackgroundColor(a93.s0.B(recyclerView).c.b().l);
                        d74 d74Var2 = new d74(-1, -1);
                        d74Var2.b(new AppBarLayout$ScrollingViewBehavior());
                        recyclerView.setLayoutParams(d74Var2);
                        return recyclerView;
                    case 8:
                        yy7[] yy7VarArr9 = CallOpponentsListWidget.H0;
                        TextView textView = new TextView(callOpponentsListWidget.getContext());
                        dpg.x.b(textView, t75.b);
                        textView.setTextColor(a93.s0.B(textView).c.getText().e);
                        textView.setMaxLines(3);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setGravity(17);
                        float f3 = 20;
                        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                        float f4 = 28;
                        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f4));
                        layoutParams.setMarginEnd(kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        textView.setLayoutParams(layoutParams);
                        return textView;
                    case 9:
                        yy7[] yy7VarArr10 = CallOpponentsListWidget.H0;
                        TextView textView2 = new TextView(callOpponentsListWidget.getContext());
                        dpg.l.b(textView2, t75.b);
                        textView2.setTextColor(a93.s0.B(textView2).c.getText().g);
                        textView2.setMaxLines(1);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setGravity(17);
                        float f5 = 12;
                        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f5 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density));
                        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return textView2;
                    case 10:
                        yy7[] yy7VarArr11 = CallOpponentsListWidget.H0;
                        TextView textView3 = new TextView(callOpponentsListWidget.getContext());
                        dpg.q.b(textView3, t75.b);
                        textView3.setTextColor(a93.s0.B(textView3).c.getText().g);
                        textView3.setMaxLines(1);
                        textView3.setEllipsize(TextUtils.TruncateAt.END);
                        textView3.setText(m0b.B1);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                        float f6 = 12;
                        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f6));
                        layoutParams2.setMarginEnd(kti.d(f6 * vw4.d().getDisplayMetrics().density));
                        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                        layoutParams2.bottomMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        textView3.setLayoutParams(layoutParams2);
                        return textView3;
                    case 11:
                        yy7[] yy7VarArr12 = CallOpponentsListWidget.H0;
                        w3b w3bVar = new w3b(callOpponentsListWidget.getContext(), 14);
                        w3bVar.setId(eyc.call_user_list_in_call_bottom_search);
                        dpg.a.b(w3bVar, t75.b);
                        v1a v1aVar = a93.s0;
                        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
                        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
                        float f7 = 12;
                        int iD = kti.d(vw4.d().getDisplayMetrics().density * f7);
                        w3bVar.setPadding(iD, iD, iD, iD);
                        w3bVar.setMaxLines(1);
                        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
                        oe3 oe3Var2 = new oe3(-1, -2);
                        oe3Var2.a = 1;
                        ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        oe3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f7));
                        oe3Var2.setMarginEnd(kti.d(f7 * vw4.d().getDisplayMetrics().density));
                        w3bVar.setLayoutParams(oe3Var2);
                        mr1 mr1Var = (mr1) callOpponentsListWidget.b.getValue();
                        int i62 = m0b.r2;
                        mr1Var.getClass();
                        Context context = mr1Var.a;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i62)));
                        Drawable drawableH = mfh.h(kwc.ic_search_outline_16, v1aVar.z(context).c.getIcon().j, context);
                        float f8 = 16;
                        drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density));
                        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableH, null, false, false, 14, null), 0, 1, 17);
                        w3bVar.setHint(spannableStringBuilder);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) callOpponentsListWidget.a.getValue(), null, null));
                        shapeDrawable.getPaint().setColor(v1aVar.B(w3bVar).c.b().a.h);
                        w3bVar.setBackground(shapeDrawable);
                        w3bVar.addTextChangedListener(new li1(w3bVar, i42, callOpponentsListWidget));
                        w3bVar.setOnTouchListener(new fi1(new gf1(4), i42, w3bVar));
                        return w3bVar;
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        yy7[] yy7VarArr13 = CallOpponentsListWidget.H0;
                        ViewStub viewStub = new ViewStub(callOpponentsListWidget.getContext());
                        viewStub.setId(eyc.call_screen_opponent_empty_list);
                        return viewStub;
                    case 13:
                        yy7[] yy7VarArr14 = CallOpponentsListWidget.H0;
                        x3b x3bVar = new x3b(callOpponentsListWidget.getContext());
                        x3bVar.setId(eyc.call_screen_opponent_empty_list);
                        d74 d74Var3 = new d74(-1, -1);
                        d74Var3.b(new AppBarLayout$ScrollingViewBehavior());
                        x3bVar.setLayoutParams(d74Var3);
                        x3bVar.setPadding(0, 0, 0, u45.c(40, vw4.d().getDisplayMetrics().density, ((r1e) callOpponentsListWidget.c.getValue()).d));
                        x3bVar.setIcon(i0b.f0);
                        x3bVar.setTitle(new n5g(m0b.z1));
                        x3bVar.setSubtitle(new n5g(m0b.y1));
                        x3bVar.setVisibility(8);
                        x3bVar.setCustomTheme(a93.s0.B(x3bVar).c);
                        return x3bVar;
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        yy7[] yy7VarArr15 = CallOpponentsListWidget.H0;
                        return new nh1(new h08(7, callOpponentsListWidget));
                    default:
                        yy7[] yy7VarArr16 = CallOpponentsListWidget.H0;
                        return new la(new a3b(6, callOpponentsListWidget), gm1.a.b().a(), new rjh(callOpponentsListWidget.getContext()));
                }
            }
        });
        this.G0 = new ka5(new g31(20), (cm6) null, 6);
    }

    public final ViewStub A0() {
        yy7 yy7Var = H0[10];
        return (ViewStub) this.B0.getValue();
    }

    @Override // defpackage.or1
    public final void B(nr1 nr1Var) {
        yy7 yy7Var = H0[6];
        ((TextView) this.x0.getValue()).setText(nr1Var != null ? nr1Var.c : null);
    }

    public final vza B0() {
        yy7 yy7Var = H0[3];
        return (vza) this.u0.getValue();
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        x9f x9fVarE = svi.e(getViewLifecycleScope(), null, i84.b, new gi1(this, i, bundle, null), 1);
        this.o.O(this, H0[0], x9fVarE);
    }

    public final w3b C0() {
        yy7 yy7Var = H0[9];
        return (w3b) this.A0.getValue();
    }

    public final yfb D0() {
        yy7 yy7Var = H0[2];
        return (yfb) this.t0.getValue();
    }

    public final ci1 E0() {
        return (ci1) this.Y.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getA() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.G0;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), null);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        coordinatorLayout.setBackgroundColor(a93.s0.B(coordinatorLayout).c.b().l);
        ei1 ei1Var = new ei1(this, 0);
        View viewY0 = y0();
        ei1Var.invoke(viewY0);
        coordinatorLayout.addView(viewY0);
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        yy7 yy7Var = H0[4];
        linearLayout.addView((RecyclerView) this.v0.getValue());
        linearLayout.addView(A0());
        d74 d74Var = new d74(-1, -1);
        d74Var.b(new AppBarLayout$ScrollingViewBehavior());
        linearLayout.setLayoutParams(d74Var);
        coordinatorLayout.addView(linearLayout);
        return coordinatorLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        api.e(C0());
        C0().clearFocus();
        E0().A0.a.remove(this);
        ci1 ci1VarE0 = E0();
        ((hw1) ((tv1) ci1VarE0.t0.getValue())).Z0.remove(ci1VarE0);
        qt7 qt7Var = (qt7) this.o.D(this, H0[0]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
    }

    @Override // defpackage.c54
    public final void onRestoreViewState(View view, Bundle bundle) {
        Window window;
        super.onRestoreViewState(view, bundle);
        Activity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        c(window);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0().clearFocus();
        y0().requestFocus();
        pr1 pr1Var = E0().A0;
        pr1Var.a.add(this);
        B(pr1Var.b);
        y0().a(bqi.b(new ff1(new yq5(), this, 1), y0(), getViewLifecycleOwner()));
        hbd hbdVar = E0().C0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new hi1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(E0().z0, getViewLifecycleOwner().p(), l38Var), new ii1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(E0().D0, getViewLifecycleOwner().p(), l38Var), new ji1(null, this), 1), getViewLifecycleScope());
    }

    public final in y0() {
        yy7 yy7Var = H0[12];
        return (in) this.F0.getValue();
    }

    public final LinearLayout z0() {
        yy7 yy7Var = H0[1];
        return (LinearLayout) this.Z.getValue();
    }
}
