package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class on1 extends ConstraintLayout implements jn1, hn1 {
    public final Object F0;
    public final Object G0;
    public a64 H0;
    public i1c I0;
    public nn1 J0;
    public final ViewPager2 K0;
    public final ViewStub L0;
    public final Object M0;
    public final ViewStub N0;
    public final Object O0;
    public final ViewStub P0;
    public final Object Q0;
    public final Object R0;

    public on1(final Context context) {
        super(context, null);
        this.F0 = ipi.b(3, new o40(context, 10));
        this.G0 = ipi.b(3, new jl1(5));
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setId(eyc.call_modes_view_pager);
        viewPager2.setLayoutParams(new kt3(-1, -1));
        viewPager2.setOrientation(1);
        this.K0 = viewPager2;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(eyc.call_bottom_unavailable_control);
        this.L0 = viewStub;
        final int i = 0;
        this.M0 = ipi.b(3, new cm6() { // from class: kn1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        e41 e41Var = new e41(context);
                        e41Var.setLayoutParams(new kt3(-1, 0));
                        e41Var.setVisibility(8);
                        e41Var.setClickListener(this.J0);
                        return e41Var;
                    default:
                        return on1.w(context, this);
                }
            }
        });
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(eyc.call_user_talking_view_label);
        this.N0 = viewStub2;
        final int i2 = 1;
        this.O0 = ipi.b(3, new cm6() { // from class: kn1
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        e41 e41Var = new e41(context);
                        e41Var.setLayoutParams(new kt3(-1, 0));
                        e41Var.setVisibility(8);
                        e41Var.setClickListener(this.J0);
                        return e41Var;
                    default:
                        return on1.w(context, this);
                }
            }
        });
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(eyc.call_change_mode_tip_view);
        this.P0 = viewStub3;
        this.Q0 = ipi.b(3, new o40(context, 11));
        this.R0 = ipi.b(3, new ln1(this, 0));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(a93.s0.B(this).c.b().l);
        setId(eyc.call_screen_main_content_id);
        addView(viewPager2);
        addView(viewStub3);
        addView(viewStub2);
        addView(viewStub);
        ut3 ut3VarG = l5j.g(this);
        int id = viewPager2.getId();
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.d(id, 4, 0, 4);
        int id2 = viewStub2.getId();
        ut3VarG.d(id2, 3, 0, 3);
        az1.q(12, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id2, 5));
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 7, 0, 7);
        int id3 = viewStub3.getId();
        ut3VarG.d(id3, 3, 0, 3);
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 7, 0, 7);
        int id4 = viewStub.getId();
        ut3VarG.d(id4, 3, 0, 3);
        ut3VarG.d(id4, 4, 0, 4);
        ut3VarG.d(id4, 6, 0, 6);
        ut3VarG.d(id4, 7, 0, 7);
        ut3VarG.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final e41 getCallBottomUnavailablePanel() {
        return (e41) this.M0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final j41 getCallChangeModeHint() {
        return (j41) this.Q0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final vf1 getCallModeChangeCallBack() {
        return (vf1) this.R0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final mq1 getCallSpeakerLabel() {
        return (mq1) this.O0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final oq1 getCallSpeakerMediator() {
        return (oq1) this.G0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final r1e getScreenInfo() {
        return (r1e) this.F0.getValue();
    }

    private final vq1 getSpeakerModeView() {
        ViewPager2 viewPager2 = this.K0;
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return null;
        }
        mid midVarM = recyclerView.M(viewPager2.getCurrentItem());
        View view = midVarM != null ? midVarM.a : null;
        if (view instanceof vq1) {
            return (vq1) view;
        }
        return null;
    }

    private static /* synthetic */ void getViewPager$annotations() {
    }

    public static vf1 v(on1 on1Var) {
        ViewPager2 viewPager2 = on1Var.K0;
        ViewStub viewStub = on1Var.P0;
        j41 callChangeModeHint = on1Var.getCallChangeModeHint();
        ViewPager2 viewPager22 = on1Var.K0;
        vf1 vf1Var = new vf1(viewPager2, viewStub, callChangeModeHint, (dg1) viewPager22.getAdapter(), new k(24, on1Var), new ln1(on1Var, 1));
        viewPager22.b(vf1Var);
        return vf1Var;
    }

    public static mq1 w(Context context, on1 on1Var) {
        mq1 mq1Var = new mq1(context, 0);
        mq1Var.setLayoutParams(new kt3(-1, -2));
        mq1Var.setVisibility(8);
        if (!mq1Var.isLaidOut() || mq1Var.isLayoutRequested()) {
            mq1Var.addOnLayoutChangeListener(new es0(1, on1Var));
        } else {
            i1c i1cVar = on1Var.I0;
            if (i1cVar != null) {
                i1cVar.c();
            }
        }
        mq1Var.setControlsMediator(on1Var.H0);
        mq1Var.setCallSpeakerMediator(on1Var.getCallSpeakerMediator());
        mq1Var.setPipBoundariesController(on1Var.I0);
        nn1 nn1Var = on1Var.J0;
        if (nn1Var != null) {
            mq1Var.setListener(nn1Var);
        }
        a64 a64Var = on1Var.H0;
        if (a64Var != null) {
            ((e64) a64Var).b(mq1Var);
        }
        return mq1Var;
    }

    public static int x(on1 on1Var) {
        return on1Var.getScreenInfo().a;
    }

    public final void A() {
        this.K0.g(getCallModeChangeCallBack());
    }

    public final void B(rt1 rt1Var) {
        zi1 zi1Var;
        y54 y54Var;
        d51 d51Var;
        d51 d51Var2;
        iqg iqgVar = rt1Var.c;
        boolean z = iqgVar != null;
        e41 callBottomUnavailablePanel = getCallBottomUnavailablePanel();
        ViewStub viewStub = this.L0;
        dqi.p(viewStub, callBottomUnavailablePanel, null);
        e41 callBottomUnavailablePanel2 = getCallBottomUnavailablePanel();
        wd0 wd0Var = (iqgVar == null || (d51Var2 = iqgVar.c) == null) ? null : d51Var2.c;
        yd0 yd0Var = (iqgVar == null || (d51Var = iqgVar.c) == null) ? null : d51Var.d;
        vs1 vs1Var = callBottomUnavailablePanel2.F0;
        vs1 vs1Var2 = callBottomUnavailablePanel2.F0;
        uxa uxaVar = vs1Var.F0;
        uxa.m(uxaVar, wd0Var != null ? wd0Var.b : null, wd0Var != null ? wd0Var.a : null);
        uxaVar.setCustomOverlay(yd0Var);
        hqi.g(callBottomUnavailablePanel2, z, 0L, null, 6);
        if (z) {
            callBottomUnavailablePanel2.setName(iqgVar.a);
            callBottomUnavailablePanel2.setStatus(iqgVar.b);
            boolean z2 = iqgVar.d;
            int i = iqgVar.e ? i0b.b : i0b.a;
            vs1 vs1Var3 = callBottomUnavailablePanel2.F0;
            int i2 = d3d.call_recall;
            vs1Var3.W(z2, i, i2, new n5g(i2), new c41(callBottomUnavailablePanel2, 2));
            int i3 = i0b.c;
            int i4 = d3d.call_cancel;
            vs1Var2.V(i3, i4, new n5g(i4), new c41(callBottomUnavailablePanel2, 0));
            callBottomUnavailablePanel2.v(iqgVar.g);
            vs1Var2.R(iqgVar.f);
        }
        t08 t08Var = rt1Var.d;
        boolean z3 = t08Var != null;
        ViewStub viewStub2 = this.N0;
        if (dqi.q(viewStub2) || z3) {
            mq1 callSpeakerLabel = getCallSpeakerLabel();
            if (!dqi.q(viewStub2)) {
                ViewGroup viewGroup = (ViewGroup) viewStub2.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub2);
                viewGroup.removeViewInLayout(viewStub2);
                ViewGroup.LayoutParams layoutParams = viewStub2.getLayoutParams();
                layoutParams.height = callSpeakerLabel.getLayoutParams().height;
                layoutParams.width = callSpeakerLabel.getLayoutParams().width;
                callSpeakerLabel.setId(viewStub2.getId());
                viewGroup.addView(callSpeakerLabel, iIndexOfChild, layoutParams);
                a64 a64Var = this.H0;
                if (a64Var != null && (y54Var = ((e64) a64Var).j) != null) {
                    getCallSpeakerLabel().E(y54Var);
                }
            }
            getCallSpeakerLabel().setActive(z3);
            mq1 callSpeakerLabel2 = getCallSpeakerLabel();
            if (z3) {
                if (t08Var == null || (zi1Var = t08Var.a) == null) {
                    zi1Var = zi1.c;
                }
                callSpeakerLabel2.setParticipantId(zi1Var);
                uxg uxgVar = t08Var != null ? t08Var.e : uxg.d;
                AppCompatImageView appCompatImageView = callSpeakerLabel2.I0;
                if (callSpeakerLabel2.Q0 != uxgVar) {
                    callSpeakerLabel2.Q0 = uxgVar;
                    int iOrdinal = uxgVar.ordinal();
                    if (iOrdinal == 0) {
                        appCompatImageView.setVisibility(0);
                        appCompatImageView.setImageResource(i0b.U);
                        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(d3d.call_user_item_more));
                        f8j.d(appCompatImageView, 300L, new ub(appCompatImageView, 8, callSpeakerLabel2));
                    } else if (iOrdinal == 1) {
                        appCompatImageView.setVisibility(0);
                        appCompatImageView.setImageResource(i0b.d0);
                        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(m0b.o2));
                        f8j.d(appCompatImageView, 300L, new kq1(callSpeakerLabel2, 1));
                    } else {
                        if (iOrdinal != 2 && iOrdinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        appCompatImageView.setVisibility(8);
                        appCompatImageView.setContentDescription(null);
                    }
                }
                boolean z4 = t08Var != null ? t08Var.c : false;
                if (!fni.a(callSpeakerLabel2.L0, Boolean.valueOf(z4))) {
                    callSpeakerLabel2.L0 = Boolean.valueOf(z4);
                    callSpeakerLabel2.J0.setVisibility(z4 ? 0 : 8);
                }
                callSpeakerLabel2.setLabel(t08Var != null ? t08Var.b : null);
                boolean z5 = t08Var != null ? t08Var.d : false;
                if (!fni.a(callSpeakerLabel2.M0, Boolean.valueOf(z5))) {
                    callSpeakerLabel2.M0 = Boolean.valueOf(z5);
                    callSpeakerLabel2.v();
                }
            }
        }
        wd0 wd0Var2 = rt1Var.f;
        if (wd0Var2 == null || iqgVar != null) {
            return;
        }
        dqi.p(viewStub, getCallBottomUnavailablePanel(), null);
        uxa uxaVar2 = getCallBottomUnavailablePanel().F0.F0;
        uxa.m(uxaVar2, wd0Var2.b, wd0Var2.a);
        uxaVar2.setCustomOverlay(null);
    }

    @Override // defpackage.jn1
    public final void a(boolean z) {
        if (z) {
            vq1 speakerModeView = getSpeakerModeView();
            if (speakerModeView != null) {
                speakerModeView.a(true);
            }
            nn1 nn1Var = this.J0;
            if (nn1Var != null) {
                CallScreen callScreen = ((ql1) nn1Var).a;
                rha rhaVar = CallScreen.N0;
                callScreen.F0().c(true);
            }
        }
    }

    @Override // defpackage.jn1
    public final void c(boolean z) {
        nn1 nn1Var;
        if (z || (nn1Var = this.J0) == null) {
            return;
        }
        CallScreen callScreen = ((ql1) nn1Var).a;
        rha rhaVar = CallScreen.N0;
        callScreen.F0().c(false);
    }

    @Override // defpackage.hn1
    public final void d(RectF rectF, boolean z) {
        vq1 speakerModeView = getSpeakerModeView();
        if (speakerModeView != null) {
            speakerModeView.d(rectF, z);
        }
    }

    @Override // defpackage.hn1
    public final void e(boolean z) {
        nn1 nn1Var = this.J0;
        if (nn1Var != null) {
            CallScreen callScreen = ((ql1) nn1Var).a;
            rha rhaVar = CallScreen.N0;
            callScreen.F0().c(false);
        }
        vq1 speakerModeView = getSpeakerModeView();
        if (speakerModeView != null) {
            speakerModeView.e(z);
        }
    }

    @Override // defpackage.hn1
    public final void f(o98 o98Var, boolean z, long j) {
        vq1 speakerModeView = getSpeakerModeView();
        if (speakerModeView != null) {
            speakerModeView.f(o98Var, z, j);
        }
        if (dqi.q(this.N0)) {
            getCallSpeakerLabel().f(o98Var, z, j);
        }
    }

    @Override // defpackage.jn1
    public final void g(o98 o98Var, boolean z, long j) {
        vq1 speakerModeView = getSpeakerModeView();
        if (speakerModeView != null) {
            speakerModeView.g(o98Var, z, j);
        }
    }

    @Override // defpackage.hn1
    public boolean getShouldScaleMainOpponent() {
        vq1 speakerModeView = getSpeakerModeView();
        if (speakerModeView != null) {
            return speakerModeView.getShouldScaleMainOpponent();
        }
        return false;
    }

    @Override // defpackage.hn1
    public final void o(boolean z) {
        if (z) {
            if (dqi.q(this.N0)) {
                mq1 callSpeakerLabel = getCallSpeakerLabel();
                callSpeakerLabel.getClass();
                callSpeakerLabel.setAlpha(1.0f);
            }
            nn1 nn1Var = this.J0;
            if (nn1Var != null) {
                CallScreen callScreen = ((ql1) nn1Var).a;
                rha rhaVar = CallScreen.N0;
                callScreen.F0().c(true);
            }
            vq1 speakerModeView = getSpeakerModeView();
            if (speakerModeView != null) {
                speakerModeView.o(true);
            }
        }
    }

    public final void setPipBoundariesController(i1c i1cVar) {
        this.I0 = i1cVar;
        if (dqi.q(this.N0)) {
            i1cVar.a(getCallSpeakerLabel(), h1c.a);
        }
    }

    public final void setupCallModesAdapter(dg1 dg1Var) {
        this.K0.setAdapter(dg1Var);
    }

    public final void setupControlsMediator(a64 a64Var) {
        this.H0 = a64Var;
        if (dqi.q(this.N0)) {
            getCallSpeakerLabel().setControlsMediator(a64Var);
            ((e64) a64Var).b(getCallSpeakerLabel());
        }
    }

    public final void setupListener(nn1 nn1Var) {
        this.J0 = nn1Var;
        if (dqi.q(this.N0)) {
            getCallSpeakerLabel().setListener(nn1Var);
        }
        if (dqi.q(this.L0)) {
            getCallBottomUnavailablePanel().setClickListener(nn1Var);
        }
    }

    public final boolean z(int i, String str) {
        boolean z = getCallModeChangeCallBack().g;
        ViewPager2 viewPager2 = this.K0;
        if (!z || viewPager2.getCurrentItem() == i || viewPager2.getChildCount() == 0) {
            int currentItem = viewPager2.getCurrentItem();
            boolean z2 = viewPager2.E0;
            StringBuilder sbM = utb.m(currentItem, "skip changeViewPagerPosition from=", str, " currentPos=", " newPos=");
            sbM.append(i);
            sbM.append(" isUserInputEnabled=");
            sbM.append(z2);
            wqi.c("CallModeScrollTag", sbM.toString(), new Object[0]);
            return false;
        }
        viewPager2.setUserInputEnabled(false);
        viewPager2.e(i, false);
        wqi.c("CallModeScrollTag", "changeViewPagerPosition from=" + str + " newPos=" + i, new Object[0]);
        return true;
    }
}
