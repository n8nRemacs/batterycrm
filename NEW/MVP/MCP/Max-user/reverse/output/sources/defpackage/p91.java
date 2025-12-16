package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.List;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;

/* loaded from: classes.dex */
public final class p91 extends ConstraintLayout {
    public final CallGridLayoutManager F0;
    public final RecyclerView G0;
    public final lh1 H0;
    public m91 I0;
    public final Object J0;
    public zib K0;
    public cm6 L0;
    public final GestureDetector M0;
    public final Object N0;

    /* JADX WARN: Type inference failed for: r11v0, types: [j91] */
    public p91(Context context) {
        super(context, null);
        this.J0 = ipi.b(3, new o40(context, 8));
        this.K0 = zib.d;
        final int i = 0;
        this.N0 = ipi.b(3, new cm6(this) { // from class: j91
            public final /* synthetic */ p91 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new n91(this.b);
                    case 1:
                        cm6 cm6Var = this.b.L0;
                        if (cm6Var != null) {
                            return (x4h) cm6Var.invoke();
                        }
                        return null;
                    default:
                        return Integer.valueOf(this.b.K0.a);
                }
            }
        });
        setLayoutParams(new kt3(-1, -1));
        this.M0 = new GestureDetector(context, new kx0(1, this));
        r5j r5jVar = new r5j(6, this);
        final int i2 = 1;
        cm6 cm6Var = new cm6(this) { // from class: j91
            public final /* synthetic */ p91 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new n91(this.b);
                    case 1:
                        cm6 cm6Var2 = this.b.L0;
                        if (cm6Var2 != null) {
                            return (x4h) cm6Var2.invoke();
                        }
                        return null;
                    default:
                        return Integer.valueOf(this.b.K0.a);
                }
            }
        };
        final int i3 = 2;
        lh1 lh1Var = new lh1(vfh.c, r5jVar, cm6Var, null, new cm6(this) { // from class: j91
            public final /* synthetic */ p91 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new n91(this.b);
                    case 1:
                        cm6 cm6Var2 = this.b.L0;
                        if (cm6Var2 != null) {
                            return (x4h) cm6Var2.invoke();
                        }
                        return null;
                    default:
                        return Integer.valueOf(this.b.K0.a);
                }
            }
        }, 18);
        this.H0 = lh1Var;
        float f = 2;
        CallGridLayoutManager callGridLayoutManager = new CallGridLayoutManager(context, kti.d(vw4.d().getDisplayMetrics().density * f), new bj(this, (getScreenInfo().f || getScreenInfo().e) ? 2 : 3, 3));
        callGridLayoutManager.K = new k91(this);
        this.F0 = callGridLayoutManager;
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setId(eyc.call_grid_opponents_view);
        recyclerView.setAdapter(lh1Var);
        recyclerView.setLayoutManager(callGridLayoutManager);
        recyclerView.setItemAnimator(getGridItemAnimation());
        recyclerView.j(new e91(kti.d(f * vw4.d().getDisplayMetrics().density), 0));
        recyclerView.l(new l91(0, this));
        this.G0 = recyclerView;
        addView(recyclerView, -1, -1);
        ut3 ut3VarG = l5j.g(this);
        int id = recyclerView.getId();
        ut3VarG.d(id, 4, 0, 4);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final n91 getGridItemAnimation() {
        return (n91) this.N0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final r1e getScreenInfo() {
        return (r1e) this.J0.getValue();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.M0.onTouchEvent(motionEvent);
    }

    public final void setListener(m91 m91Var) {
        this.I0 = m91Var;
    }

    public final void setOpponents(zib zibVar) {
        List list = zibVar.c;
        int i = zibVar.a;
        RecyclerView recyclerView = this.G0;
        if (i == 0 && list.size() > 2 && getHeight() != -2) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
        } else if (i == 0 && list.size() <= 2 && getHeight() != -1) {
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = -1;
            recyclerView.setLayoutParams(layoutParams2);
        } else if (i > 0 && getHeight() != -1) {
            ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.height = -1;
            recyclerView.setLayoutParams(layoutParams3);
        }
        lh1 lh1Var = this.H0;
        o91 o91Var = (lh1Var.j() != 1 || list.size() <= 1) ? null : new o91(0, recyclerView, mfh.class, "liteUpdateVisibleItems", "liteUpdateVisibleItems(Landroidx/recyclerview/widget/RecyclerView;)V", 1, 0);
        this.K0 = zibVar;
        lh1Var.F(list, o91Var != null ? new aj0(1, o91Var) : null);
    }

    public final void setOpponentsViewPool(b bVar) {
        this.G0.setRecycledViewPool(bVar);
    }

    public final void setParentSizeProvider(f91 f91Var) {
        this.F0.P = f91Var;
    }

    public final void setVideoLayoutUpdatesControllerProvider(cm6 cm6Var) {
        this.L0 = cm6Var;
    }
}
