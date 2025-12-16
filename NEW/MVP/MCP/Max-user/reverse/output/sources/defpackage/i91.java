package defpackage;

import android.content.Context;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* loaded from: classes.dex */
public final class i91 extends ConstraintLayout implements z54 {
    public final Object F0;
    public final Object G0;
    public final ViewStub H0;
    public final ViewPager2 I0;
    public final ry6 J0;
    public final r91 K0;
    public final Object L0;
    public b M0;
    public h91 N0;
    public x4h O0;
    public a64 P0;
    public final ki0 Q0;

    public i91(Context context) {
        super(context, null);
        this.F0 = ipi.b(3, new g91(this, 0));
        this.G0 = ipi.b(3, new o40(context, 7));
        this.L0 = ipi.b(3, new m3(context, 10, this));
        this.Q0 = new ki0(1, this);
        setLayoutParams(new kt3(-1, -1));
        ViewPager2 viewPager2 = new ViewPager2(context);
        viewPager2.setId(j0b.U1);
        this.I0 = viewPager2;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(j0b.T1);
        this.H0 = viewStub;
        r91 r91Var = new r91(new x6i(4, this), new y6i(6, this), new g91(this, 1), new g91(this, 2));
        viewPager2.setAdapter(r91Var);
        this.K0 = r91Var;
        ry6 ry6Var = new ry6(context);
        ry6Var.setId(eyc.call_users_speakers_view_tab_layout);
        ry6Var.setBackgroundColor(0);
        ry6Var.setVisibility(8);
        this.J0 = ry6Var;
        addView(viewPager2, getScreenInfo().g ? (getScreenInfo().a * 9) / 16 : 0, getScreenInfo().f ? getScreenInfo().b : 0);
        addView(ry6Var, kti.d(80 * vw4.d().getDisplayMetrics().density), kti.d(24 * vw4.d().getDisplayMetrics().density));
        addView(viewStub, -2, -2);
        ut3 ut3VarG = l5j.g(this);
        int id = viewPager2.getId();
        ut3VarG.d(id, 4, ry6Var.getId(), 3);
        az1.q(6, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 4, id, 5));
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.d(id, 3, 0, 3);
        int id2 = ry6Var.getId();
        ut3VarG.d(id2, 4, 0, 4);
        az1.q(8, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 4, id2, 5));
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 7, 0, 7);
        int id3 = viewStub.getId();
        ut3VarG.d(id3, 6, viewPager2.getId(), 6);
        new fua(ut3VarG, 6, id3, 5).e(kti.d(16 * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id3, 4, ry6Var.getId(), 4);
        ut3VarG.d(id3, 3, ry6Var.getId(), 3);
        ut3VarG.d(id3, 7, ry6Var.getId(), 6);
        ut3VarG.g(id3).d.l0 = true;
        ut3VarG.g(id3).d.w = 0.0f;
        ut3VarG.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ny6 getMediator() {
        return (ny6) this.F0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final r1e getScreenInfo() {
        return (r1e) this.G0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final TextView getScrollToStartView() {
        return (TextView) this.L0.getValue();
    }

    public static final void v(i91 i91Var, int i) {
        ViewStub viewStub = i91Var.H0;
        boolean z = i > 1;
        if (dqi.q(viewStub) || z) {
            dqi.p(viewStub, i91Var.getScrollToStartView(), null);
            hqi.g(i91Var.getScrollToStartView(), z, 0L, null, 6);
        }
    }

    @Override // defpackage.z54
    public final void E(y54 y54Var) {
        mfh.n(this, y54Var.b());
    }

    @Override // defpackage.z54
    public final List I(x54 x54Var, x54 x54Var2) {
        return hd5.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ny6 mediator = getMediator();
        ViewPager2 viewPager2 = mediator.a;
        if (!mediator.c) {
            mediator.c = true;
            phd adapter = viewPager2.getAdapter();
            mediator.d = adapter;
            if (adapter == null) {
                throw new IllegalStateException("Attached before view pager has an adapter");
            }
            kd5 kd5Var = new kd5(3, mediator);
            mediator.f = kd5Var;
            adapter.z(kd5Var);
            my6 my6Var = new my6(mediator.b);
            mediator.e = my6Var;
            viewPager2.b(my6Var);
            mediator.a();
        }
        this.I0.b(this.Q0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        phd phdVar;
        super.onDetachedFromWindow();
        ny6 mediator = getMediator();
        if (mediator.c) {
            mediator.c = false;
            kd5 kd5Var = mediator.f;
            if (kd5Var != null && (phdVar = mediator.d) != null) {
                phdVar.B(kd5Var);
            }
            mediator.f = null;
            mediator.d = null;
            my6 my6Var = mediator.e;
            if (my6Var != null) {
                mediator.a.g(my6Var);
            }
            mediator.e = null;
        }
        this.I0.g(this.Q0);
    }

    public final void setControlsMediator(a64 a64Var) {
        this.P0 = a64Var;
    }

    public final void setListener(h91 h91Var) {
        this.N0 = h91Var;
    }

    public final void setOpponents(List<zib> list) {
        this.K0.E(list);
        int i = list.size() > 1 ? 0 : 8;
        ry6 ry6Var = this.J0;
        ry6Var.setVisibility(i);
        ry6Var.b(list.size(), Math.min(list.size() - 1, this.I0.getCurrentItem()));
        a64 a64Var = this.P0;
        if (a64Var != null) {
            e64 e64Var = (e64) a64Var;
            E(e64Var.j);
            y(e64Var.k);
        }
    }

    public final void setOpponentsViewPool(b bVar) {
        this.M0 = bVar;
    }

    public final void setVideoLayoutUpdatesController(x4h x4hVar) {
        this.O0 = x4hVar;
    }

    @Override // defpackage.z54
    public final void y(y54 y54Var) {
        mfh.m(this, y54Var.b());
    }
}
