package one.me.sdk.messagewrite.mention;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.az1;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.cm6;
import defpackage.cqf;
import defpackage.dqf;
import defpackage.eo7;
import defpackage.fua;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i6c;
import defpackage.imb;
import defpackage.ipi;
import defpackage.k18;
import defpackage.kga;
import defpackage.kti;
import defpackage.l5j;
import defpackage.mab;
import defpackage.mqf;
import defpackage.ms0;
import defpackage.oqf;
import defpackage.sn0;
import defpackage.tcf;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ut3;
import defpackage.v9;
import defpackage.vid;
import defpackage.vw4;
import defpackage.xc6;
import defpackage.yf5;
import defpackage.yy7;
import defpackage.z8a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/sdk/messagewrite/mention/SuggestionsWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lcqf;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SuggestionsWidget extends BaseBottomSheetWidget implements cqf {
    public static final /* synthetic */ yy7[] F0 = {new z8a(SuggestionsWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), ho7.d(vid.a, SuggestionsWidget.class, "suggestionsContainer", "getSuggestionsContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), new toc(SuggestionsWidget.class, "dragView", "getDragView()Landroid/widget/FrameLayout;", 0), new toc(SuggestionsWidget.class, "suggestionsRecyclerView", "getSuggestionsRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), new toc(SuggestionsWidget.class, "closeView", "getCloseView()Landroidx/appcompat/widget/AppCompatImageView;", 0), new toc(SuggestionsWidget.class, "titleView", "getTitleView()Landroidx/appcompat/widget/AppCompatTextView;", 0), new toc(SuggestionsWidget.class, "closePanelView", "getClosePanelView()Landroid/widget/FrameLayout;", 0), new toc(SuggestionsWidget.class, "notFoundView", "getNotFoundView()Landroidx/appcompat/widget/AppCompatTextView;", 0)};
    public final sn0 A0;
    public final sn0 B0;
    public final sn0 C0;
    public final sn0 D0;
    public final sn0 E0;
    public final k18 w0;
    public final bbd x0;
    public final Object y0;
    public final sn0 z0;

    public SuggestionsWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* renamed from: A0 */
    public final eo7 getX() {
        return new eo7(0, new ms0(1, 3, false), 7);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void K0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(mab.E);
        constraintLayout.addView(L0(), -1, -2);
        constraintLayout.addView(O0());
        constraintLayout.addView(N0());
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = M0().getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = L0().getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 7, 0, 7);
        float f = 8;
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id2, 5));
        ut3VarG.d(id2, 6, 0, 6);
        new fua(ut3VarG, 6, id2, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f));
        int id3 = N0().getId();
        ut3VarG.d(id3, 3, L0().getId(), 4);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id3, 5));
        ut3VarG.d(id3, 6, 0, 6);
        int id4 = O0().getId();
        ut3VarG.d(id4, 3, L0().getId(), 4);
        az1.q(20, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id4, 5));
        ut3VarG.d(id4, 7, 0, 7);
        ut3VarG.d(id4, 6, 0, 6);
        ut3VarG.d(id4, 4, 0, 4);
        ut3VarG.g(id4).d.m0 = true;
        ut3VarG.g(id4).d.x = 0.0f;
        tqi.c(new xc6(3, null, 1), constraintLayout);
        ut3VarG.a(constraintLayout);
        frameLayout.addView(constraintLayout, -1, -1);
        frameLayout.addView(M0());
    }

    public final FrameLayout L0() {
        yy7 yy7Var = F0[6];
        return (FrameLayout) this.D0.getValue();
    }

    public final FrameLayout M0() {
        yy7 yy7Var = F0[2];
        return (FrameLayout) this.z0.getValue();
    }

    public final AppCompatTextView N0() {
        yy7 yy7Var = F0[7];
        return (AppCompatTextView) this.E0.getValue();
    }

    public final yf5 O0() {
        yy7 yy7Var = F0[3];
        return (yf5) this.A0.getValue();
    }

    public final mqf P0() {
        return (mqf) this.w0.getValue();
    }

    public final void Q0() {
        Object value;
        tcf tcfVar = P0().H0;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, null));
        E0(true);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final boolean handleBack() {
        Q0();
        return true;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        O0().setAdapter(null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        O0().setAdapter((dqf) this.y0.getValue());
        gw0.w(new g56(P0().C0, new oqf(this, null), 1), getViewLifecycleScope());
        tqi.c(new kga(this, (Continuation) null, 26), view);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final i6c z0() {
        return new v9(this, 6);
    }

    public SuggestionsWidget(Bundle bundle) {
        super(bundle);
        hs hsVar = new hs(b1e.class, Widget.ARG_SCOPE_ID);
        yy7 yy7Var = F0[0];
        this.w0 = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, mqf.class, null);
        this.x0 = viewBinding(mab.E);
        final int i = 0;
        this.y0 = ipi.b(3, new cm6(this) { // from class: nqf
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = SuggestionsWidget.F0;
                        return new dqf(suggestionsWidget, ((g4b) o6i.a.getAccessor().d(56).getValue()).c());
                    case 1:
                        yy7[] yy7VarArr2 = SuggestionsWidget.F0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(mab.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(36 * vw4.d().getDisplayMetrics().density), kti.d(5 * vw4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(a93.s0.y(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        yy7[] yy7VarArr3 = SuggestionsWidget.F0;
                        yf5 yf5Var = new yf5(suggestionsWidget.getContext(), null);
                        yf5Var.setId(mab.F);
                        yf5Var.setClipToPadding(false);
                        yf5Var.setLayoutParams(new kt3(-1, -2));
                        yf5Var.getContext();
                        yf5Var.setLayoutManager(new LinearLayoutManager());
                        yf5Var.setPager(new ma1(suggestionsWidget, 10));
                        yf5Var.setThreshold(3);
                        return yf5Var;
                    case 3:
                        yy7[] yy7VarArr4 = SuggestionsWidget.F0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(mab.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD, iD, iD, iD);
                        appCompatImageView.setImageResource(y9b.d);
                        v1a v1aVar = a93.s0;
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).getIcon().f));
                        f8j.d(appCompatImageView, 300L, new pcc(18, suggestionsWidget));
                        int i3 = v1aVar.y(appCompatImageView).c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        yy7[] yy7VarArr5 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(mab.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, kti.d(44 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        dpg.x.b(appCompatTextView, t75.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
                        appCompatTextView.setText(nab.t);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        yy7[] yy7VarArr6 = SuggestionsWidget.F0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(mab.A);
                        sn0 sn0Var = suggestionsWidget.B0;
                        yy7[] yy7VarArr7 = SuggestionsWidget.F0;
                        yy7 yy7Var2 = yy7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) sn0Var.getValue());
                        sn0 sn0Var2 = suggestionsWidget.C0;
                        yy7 yy7Var3 = yy7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) sn0Var2.getValue());
                        frameLayout2.setVisibility(8);
                        zfi.c(frameLayout2);
                        return frameLayout2;
                    default:
                        yy7[] yy7VarArr8 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(mab.C);
                        appCompatTextView2.setLayoutParams(new kt3(-2, -2));
                        dpg.j.b(appCompatTextView2, t75.b);
                        appCompatTextView2.setTextColor(a93.s0.y(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(nab.s);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(f2 * vw4.d().getDisplayMetrics().density), 0);
                        zfi.c(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i2 = 1;
        this.z0 = binding(new cm6(this) { // from class: nqf
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = SuggestionsWidget.F0;
                        return new dqf(suggestionsWidget, ((g4b) o6i.a.getAccessor().d(56).getValue()).c());
                    case 1:
                        yy7[] yy7VarArr2 = SuggestionsWidget.F0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(mab.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(36 * vw4.d().getDisplayMetrics().density), kti.d(5 * vw4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(a93.s0.y(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        yy7[] yy7VarArr3 = SuggestionsWidget.F0;
                        yf5 yf5Var = new yf5(suggestionsWidget.getContext(), null);
                        yf5Var.setId(mab.F);
                        yf5Var.setClipToPadding(false);
                        yf5Var.setLayoutParams(new kt3(-1, -2));
                        yf5Var.getContext();
                        yf5Var.setLayoutManager(new LinearLayoutManager());
                        yf5Var.setPager(new ma1(suggestionsWidget, 10));
                        yf5Var.setThreshold(3);
                        return yf5Var;
                    case 3:
                        yy7[] yy7VarArr4 = SuggestionsWidget.F0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(mab.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD, iD, iD, iD);
                        appCompatImageView.setImageResource(y9b.d);
                        v1a v1aVar = a93.s0;
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).getIcon().f));
                        f8j.d(appCompatImageView, 300L, new pcc(18, suggestionsWidget));
                        int i3 = v1aVar.y(appCompatImageView).c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        yy7[] yy7VarArr5 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(mab.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, kti.d(44 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        dpg.x.b(appCompatTextView, t75.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
                        appCompatTextView.setText(nab.t);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        yy7[] yy7VarArr6 = SuggestionsWidget.F0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(mab.A);
                        sn0 sn0Var = suggestionsWidget.B0;
                        yy7[] yy7VarArr7 = SuggestionsWidget.F0;
                        yy7 yy7Var2 = yy7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) sn0Var.getValue());
                        sn0 sn0Var2 = suggestionsWidget.C0;
                        yy7 yy7Var3 = yy7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) sn0Var2.getValue());
                        frameLayout2.setVisibility(8);
                        zfi.c(frameLayout2);
                        return frameLayout2;
                    default:
                        yy7[] yy7VarArr8 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(mab.C);
                        appCompatTextView2.setLayoutParams(new kt3(-2, -2));
                        dpg.j.b(appCompatTextView2, t75.b);
                        appCompatTextView2.setTextColor(a93.s0.y(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(nab.s);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(f2 * vw4.d().getDisplayMetrics().density), 0);
                        zfi.c(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i3 = 2;
        this.A0 = binding(new cm6(this) { // from class: nqf
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = SuggestionsWidget.F0;
                        return new dqf(suggestionsWidget, ((g4b) o6i.a.getAccessor().d(56).getValue()).c());
                    case 1:
                        yy7[] yy7VarArr2 = SuggestionsWidget.F0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(mab.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(36 * vw4.d().getDisplayMetrics().density), kti.d(5 * vw4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(a93.s0.y(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        yy7[] yy7VarArr3 = SuggestionsWidget.F0;
                        yf5 yf5Var = new yf5(suggestionsWidget.getContext(), null);
                        yf5Var.setId(mab.F);
                        yf5Var.setClipToPadding(false);
                        yf5Var.setLayoutParams(new kt3(-1, -2));
                        yf5Var.getContext();
                        yf5Var.setLayoutManager(new LinearLayoutManager());
                        yf5Var.setPager(new ma1(suggestionsWidget, 10));
                        yf5Var.setThreshold(3);
                        return yf5Var;
                    case 3:
                        yy7[] yy7VarArr4 = SuggestionsWidget.F0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(mab.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD, iD, iD, iD);
                        appCompatImageView.setImageResource(y9b.d);
                        v1a v1aVar = a93.s0;
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).getIcon().f));
                        f8j.d(appCompatImageView, 300L, new pcc(18, suggestionsWidget));
                        int i32 = v1aVar.y(appCompatImageView).c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        yy7[] yy7VarArr5 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(mab.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, kti.d(44 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        dpg.x.b(appCompatTextView, t75.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
                        appCompatTextView.setText(nab.t);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        yy7[] yy7VarArr6 = SuggestionsWidget.F0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(mab.A);
                        sn0 sn0Var = suggestionsWidget.B0;
                        yy7[] yy7VarArr7 = SuggestionsWidget.F0;
                        yy7 yy7Var2 = yy7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) sn0Var.getValue());
                        sn0 sn0Var2 = suggestionsWidget.C0;
                        yy7 yy7Var3 = yy7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) sn0Var2.getValue());
                        frameLayout2.setVisibility(8);
                        zfi.c(frameLayout2);
                        return frameLayout2;
                    default:
                        yy7[] yy7VarArr8 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(mab.C);
                        appCompatTextView2.setLayoutParams(new kt3(-2, -2));
                        dpg.j.b(appCompatTextView2, t75.b);
                        appCompatTextView2.setTextColor(a93.s0.y(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(nab.s);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(f2 * vw4.d().getDisplayMetrics().density), 0);
                        zfi.c(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i4 = 3;
        this.B0 = binding(new cm6(this) { // from class: nqf
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i4;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = SuggestionsWidget.F0;
                        return new dqf(suggestionsWidget, ((g4b) o6i.a.getAccessor().d(56).getValue()).c());
                    case 1:
                        yy7[] yy7VarArr2 = SuggestionsWidget.F0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(mab.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(36 * vw4.d().getDisplayMetrics().density), kti.d(5 * vw4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(a93.s0.y(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        yy7[] yy7VarArr3 = SuggestionsWidget.F0;
                        yf5 yf5Var = new yf5(suggestionsWidget.getContext(), null);
                        yf5Var.setId(mab.F);
                        yf5Var.setClipToPadding(false);
                        yf5Var.setLayoutParams(new kt3(-1, -2));
                        yf5Var.getContext();
                        yf5Var.setLayoutManager(new LinearLayoutManager());
                        yf5Var.setPager(new ma1(suggestionsWidget, 10));
                        yf5Var.setThreshold(3);
                        return yf5Var;
                    case 3:
                        yy7[] yy7VarArr4 = SuggestionsWidget.F0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(mab.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD, iD, iD, iD);
                        appCompatImageView.setImageResource(y9b.d);
                        v1a v1aVar = a93.s0;
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).getIcon().f));
                        f8j.d(appCompatImageView, 300L, new pcc(18, suggestionsWidget));
                        int i32 = v1aVar.y(appCompatImageView).c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        yy7[] yy7VarArr5 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(mab.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, kti.d(44 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        dpg.x.b(appCompatTextView, t75.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
                        appCompatTextView.setText(nab.t);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        yy7[] yy7VarArr6 = SuggestionsWidget.F0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(mab.A);
                        sn0 sn0Var = suggestionsWidget.B0;
                        yy7[] yy7VarArr7 = SuggestionsWidget.F0;
                        yy7 yy7Var2 = yy7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) sn0Var.getValue());
                        sn0 sn0Var2 = suggestionsWidget.C0;
                        yy7 yy7Var3 = yy7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) sn0Var2.getValue());
                        frameLayout2.setVisibility(8);
                        zfi.c(frameLayout2);
                        return frameLayout2;
                    default:
                        yy7[] yy7VarArr8 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(mab.C);
                        appCompatTextView2.setLayoutParams(new kt3(-2, -2));
                        dpg.j.b(appCompatTextView2, t75.b);
                        appCompatTextView2.setTextColor(a93.s0.y(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(nab.s);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(f2 * vw4.d().getDisplayMetrics().density), 0);
                        zfi.c(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i5 = 4;
        this.C0 = binding(new cm6(this) { // from class: nqf
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i5;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = SuggestionsWidget.F0;
                        return new dqf(suggestionsWidget, ((g4b) o6i.a.getAccessor().d(56).getValue()).c());
                    case 1:
                        yy7[] yy7VarArr2 = SuggestionsWidget.F0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(mab.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(36 * vw4.d().getDisplayMetrics().density), kti.d(5 * vw4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(a93.s0.y(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        yy7[] yy7VarArr3 = SuggestionsWidget.F0;
                        yf5 yf5Var = new yf5(suggestionsWidget.getContext(), null);
                        yf5Var.setId(mab.F);
                        yf5Var.setClipToPadding(false);
                        yf5Var.setLayoutParams(new kt3(-1, -2));
                        yf5Var.getContext();
                        yf5Var.setLayoutManager(new LinearLayoutManager());
                        yf5Var.setPager(new ma1(suggestionsWidget, 10));
                        yf5Var.setThreshold(3);
                        return yf5Var;
                    case 3:
                        yy7[] yy7VarArr4 = SuggestionsWidget.F0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(mab.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD, iD, iD, iD);
                        appCompatImageView.setImageResource(y9b.d);
                        v1a v1aVar = a93.s0;
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).getIcon().f));
                        f8j.d(appCompatImageView, 300L, new pcc(18, suggestionsWidget));
                        int i32 = v1aVar.y(appCompatImageView).c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        yy7[] yy7VarArr5 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(mab.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, kti.d(44 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        dpg.x.b(appCompatTextView, t75.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
                        appCompatTextView.setText(nab.t);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        yy7[] yy7VarArr6 = SuggestionsWidget.F0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(mab.A);
                        sn0 sn0Var = suggestionsWidget.B0;
                        yy7[] yy7VarArr7 = SuggestionsWidget.F0;
                        yy7 yy7Var2 = yy7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) sn0Var.getValue());
                        sn0 sn0Var2 = suggestionsWidget.C0;
                        yy7 yy7Var3 = yy7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) sn0Var2.getValue());
                        frameLayout2.setVisibility(8);
                        zfi.c(frameLayout2);
                        return frameLayout2;
                    default:
                        yy7[] yy7VarArr8 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(mab.C);
                        appCompatTextView2.setLayoutParams(new kt3(-2, -2));
                        dpg.j.b(appCompatTextView2, t75.b);
                        appCompatTextView2.setTextColor(a93.s0.y(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(nab.s);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(f2 * vw4.d().getDisplayMetrics().density), 0);
                        zfi.c(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i6 = 5;
        this.D0 = binding(new cm6(this) { // from class: nqf
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i6;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = SuggestionsWidget.F0;
                        return new dqf(suggestionsWidget, ((g4b) o6i.a.getAccessor().d(56).getValue()).c());
                    case 1:
                        yy7[] yy7VarArr2 = SuggestionsWidget.F0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(mab.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(36 * vw4.d().getDisplayMetrics().density), kti.d(5 * vw4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(a93.s0.y(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        yy7[] yy7VarArr3 = SuggestionsWidget.F0;
                        yf5 yf5Var = new yf5(suggestionsWidget.getContext(), null);
                        yf5Var.setId(mab.F);
                        yf5Var.setClipToPadding(false);
                        yf5Var.setLayoutParams(new kt3(-1, -2));
                        yf5Var.getContext();
                        yf5Var.setLayoutManager(new LinearLayoutManager());
                        yf5Var.setPager(new ma1(suggestionsWidget, 10));
                        yf5Var.setThreshold(3);
                        return yf5Var;
                    case 3:
                        yy7[] yy7VarArr4 = SuggestionsWidget.F0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(mab.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD, iD, iD, iD);
                        appCompatImageView.setImageResource(y9b.d);
                        v1a v1aVar = a93.s0;
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).getIcon().f));
                        f8j.d(appCompatImageView, 300L, new pcc(18, suggestionsWidget));
                        int i32 = v1aVar.y(appCompatImageView).c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        yy7[] yy7VarArr5 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(mab.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, kti.d(44 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        dpg.x.b(appCompatTextView, t75.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
                        appCompatTextView.setText(nab.t);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        yy7[] yy7VarArr6 = SuggestionsWidget.F0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(mab.A);
                        sn0 sn0Var = suggestionsWidget.B0;
                        yy7[] yy7VarArr7 = SuggestionsWidget.F0;
                        yy7 yy7Var2 = yy7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) sn0Var.getValue());
                        sn0 sn0Var2 = suggestionsWidget.C0;
                        yy7 yy7Var3 = yy7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) sn0Var2.getValue());
                        frameLayout2.setVisibility(8);
                        zfi.c(frameLayout2);
                        return frameLayout2;
                    default:
                        yy7[] yy7VarArr8 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(mab.C);
                        appCompatTextView2.setLayoutParams(new kt3(-2, -2));
                        dpg.j.b(appCompatTextView2, t75.b);
                        appCompatTextView2.setTextColor(a93.s0.y(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(nab.s);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(f2 * vw4.d().getDisplayMetrics().density), 0);
                        zfi.c(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        final int i7 = 6;
        this.E0 = binding(new cm6(this) { // from class: nqf
            public final /* synthetic */ SuggestionsWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i7;
                SuggestionsWidget suggestionsWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = SuggestionsWidget.F0;
                        return new dqf(suggestionsWidget, ((g4b) o6i.a.getAccessor().d(56).getValue()).c());
                    case 1:
                        yy7[] yy7VarArr2 = SuggestionsWidget.F0;
                        View frameLayout = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout.setId(mab.D);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(36 * vw4.d().getDisplayMetrics().density), kti.d(5 * vw4.d().getDisplayMetrics().density));
                        layoutParams.gravity = 49;
                        layoutParams.topMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
                        frameLayout.setLayoutParams(layoutParams);
                        frameLayout.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 40.0f));
                        frameLayout.setBackgroundColor(a93.s0.y(frameLayout).getIcon().h);
                        return frameLayout;
                    case 2:
                        yy7[] yy7VarArr3 = SuggestionsWidget.F0;
                        yf5 yf5Var = new yf5(suggestionsWidget.getContext(), null);
                        yf5Var.setId(mab.F);
                        yf5Var.setClipToPadding(false);
                        yf5Var.setLayoutParams(new kt3(-1, -2));
                        yf5Var.getContext();
                        yf5Var.setLayoutManager(new LinearLayoutManager());
                        yf5Var.setPager(new ma1(suggestionsWidget, 10));
                        yf5Var.setThreshold(3);
                        return yf5Var;
                    case 3:
                        yy7[] yy7VarArr4 = SuggestionsWidget.F0;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(suggestionsWidget.getContext(), null);
                        appCompatImageView.setId(mab.z);
                        float f = 44;
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        layoutParams2.gravity = 19;
                        appCompatImageView.setLayoutParams(layoutParams2);
                        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD, iD, iD, iD);
                        appCompatImageView.setImageResource(y9b.d);
                        v1a v1aVar = a93.s0;
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).getIcon().f));
                        f8j.d(appCompatImageView, 300L, new pcc(18, suggestionsWidget));
                        int i32 = v1aVar.y(appCompatImageView).c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i32), null, shapeDrawable));
                        return appCompatImageView;
                    case 4:
                        yy7[] yy7VarArr5 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView.setId(mab.G);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, kti.d(44 * vw4.d().getDisplayMetrics().density));
                        layoutParams3.gravity = 17;
                        appCompatTextView.setLayoutParams(layoutParams3);
                        dpg.x.b(appCompatTextView, t75.b);
                        appCompatTextView.setGravity(17);
                        appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
                        appCompatTextView.setText(nab.t);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        return appCompatTextView;
                    case 5:
                        yy7[] yy7VarArr6 = SuggestionsWidget.F0;
                        FrameLayout frameLayout2 = new FrameLayout(suggestionsWidget.getContext());
                        frameLayout2.setId(mab.A);
                        sn0 sn0Var = suggestionsWidget.B0;
                        yy7[] yy7VarArr7 = SuggestionsWidget.F0;
                        yy7 yy7Var2 = yy7VarArr7[4];
                        frameLayout2.addView((AppCompatImageView) sn0Var.getValue());
                        sn0 sn0Var2 = suggestionsWidget.C0;
                        yy7 yy7Var3 = yy7VarArr7[5];
                        frameLayout2.addView((AppCompatTextView) sn0Var2.getValue());
                        frameLayout2.setVisibility(8);
                        zfi.c(frameLayout2);
                        return frameLayout2;
                    default:
                        yy7[] yy7VarArr8 = SuggestionsWidget.F0;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(suggestionsWidget.getContext(), null);
                        appCompatTextView2.setId(mab.C);
                        appCompatTextView2.setLayoutParams(new kt3(-2, -2));
                        dpg.j.b(appCompatTextView2, t75.b);
                        appCompatTextView2.setTextColor(a93.s0.y(appCompatTextView2).getText().h);
                        appCompatTextView2.setText(nab.s);
                        appCompatTextView2.setMaxLines(1);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setVisibility(8);
                        float f2 = 16;
                        appCompatTextView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(f2 * vw4.d().getDisplayMetrics().density), 0);
                        zfi.c(appCompatTextView2);
                        return appCompatTextView2;
                }
            }
        });
        J0(false);
    }
}
