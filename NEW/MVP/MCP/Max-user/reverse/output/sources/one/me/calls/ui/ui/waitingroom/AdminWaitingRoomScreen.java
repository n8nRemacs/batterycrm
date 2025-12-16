package one.me.calls.ui.ui.waitingroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.az1;
import defpackage.bbd;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.fua;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gza;
import defpackage.ho7;
import defpackage.i0b;
import defpackage.i6;
import defpackage.ipi;
import defpackage.iza;
import defpackage.j0b;
import defpackage.j2e;
import defpackage.jza;
import defpackage.k;
import defpackage.k18;
import defpackage.kti;
import defpackage.l;
import defpackage.l5j;
import defpackage.la;
import defpackage.m0b;
import defpackage.n5g;
import defpackage.na;
import defpackage.nha;
import defpackage.q;
import defpackage.qfb;
import defpackage.sa;
import defpackage.toc;
import defpackage.ut3;
import defpackage.v1a;
import defpackage.vid;
import defpackage.vw4;
import defpackage.x3b;
import defpackage.yfb;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/calls/ui/ui/waitingroom/AdminWaitingRoomScreen;", "Lone/me/sdk/arch/Widget;", "Lnha;", "Lj2e;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AdminWaitingRoomScreen extends Widget implements nha, j2e {
    public static final /* synthetic */ yy7[] Z = {new toc(AdminWaitingRoomScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, AdminWaitingRoomScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(AdminWaitingRoomScreen.class, "applyAllButton", "getApplyAllButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(AdminWaitingRoomScreen.class, "rejectAllButton", "getRejectAllButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(AdminWaitingRoomScreen.class, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    public final bbd X;
    public final Object Y;
    public final k18 a;
    public final bbd b;
    public final bbd c;
    public final bbd d;
    public final bbd o;

    /* JADX WARN: Multi-variable type inference failed */
    public AdminWaitingRoomScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = createViewModelLazy(sa.class, new q(4, new l(3)));
        this.b = viewBinding(j0b.W0);
        this.c = viewBinding(j0b.T0);
        this.d = viewBinding(j0b.R0);
        this.o = viewBinding(j0b.V0);
        this.X = viewBinding(j0b.S0);
        this.Y = ipi.b(3, new i6(5, this));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getB() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        v1a v1aVar = a93.s0;
        constraintLayout.setBackgroundColor(v1aVar.B(constraintLayout).c.b().l);
        yfb yfbVar = new yfb(getContext(), 6);
        yfbVar.setId(j0b.W0);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setCustomTheme(v1aVar.B(yfbVar).c);
        yfbVar.setTitle(m0b.i1);
        yfbVar.setSubtitle(m0b.v2);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new k(5, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(j0b.T0);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter((la) this.Y.getValue());
        recyclerView.setItemAnimator(null);
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setId(j0b.R0);
        oneMeButton.setCustomTheme(v1aVar.B(oneMeButton).c);
        jza jzaVar = jza.c;
        oneMeButton.setSize(jzaVar);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setText(m0b.d1);
        final int i = 0;
        f8j.d(oneMeButton, 300L, new View.OnClickListener(this) { // from class: ma
            public final /* synthetic */ AdminWaitingRoomScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                AdminWaitingRoomScreen adminWaitingRoomScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = AdminWaitingRoomScreen.Z;
                        ((sa) adminWaitingRoomScreen.a.getValue()).t(true);
                        break;
                    case 1:
                        yy7[] yy7VarArr2 = AdminWaitingRoomScreen.Z;
                        ((sa) adminWaitingRoomScreen.a.getValue()).t(false);
                        break;
                    default:
                        yy7[] yy7VarArr3 = AdminWaitingRoomScreen.Z;
                        adminWaitingRoomScreen.getRouter().B(adminWaitingRoomScreen);
                        break;
                }
            }
        });
        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        OneMeButton oneMeButton2 = new OneMeButton(getContext(), null);
        oneMeButton2.setId(j0b.V0);
        oneMeButton2.setCustomTheme(v1aVar.B(oneMeButton2).c);
        oneMeButton2.setSize(jzaVar);
        oneMeButton2.setMode(iza.b);
        oneMeButton2.setAppearance(gza.c);
        oneMeButton2.setText(m0b.h1);
        final int i2 = 1;
        f8j.d(oneMeButton2, 300L, new View.OnClickListener(this) { // from class: ma
            public final /* synthetic */ AdminWaitingRoomScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                AdminWaitingRoomScreen adminWaitingRoomScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = AdminWaitingRoomScreen.Z;
                        ((sa) adminWaitingRoomScreen.a.getValue()).t(true);
                        break;
                    case 1:
                        yy7[] yy7VarArr2 = AdminWaitingRoomScreen.Z;
                        ((sa) adminWaitingRoomScreen.a.getValue()).t(false);
                        break;
                    default:
                        yy7[] yy7VarArr3 = AdminWaitingRoomScreen.Z;
                        adminWaitingRoomScreen.getRouter().B(adminWaitingRoomScreen);
                        break;
                }
            }
        });
        oneMeButton2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        x3b x3bVar = new x3b(getContext());
        x3bVar.setId(j0b.S0);
        x3bVar.setIcon(i0b.y0);
        x3bVar.setTitle(new n5g(m0b.g1));
        x3bVar.setSubtitle(new n5g(m0b.f1));
        final int i3 = 2;
        x3bVar.f(x3bVar.getContext().getString(m0b.e1), new View.OnClickListener(this) { // from class: ma
            public final /* synthetic */ AdminWaitingRoomScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                AdminWaitingRoomScreen adminWaitingRoomScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = AdminWaitingRoomScreen.Z;
                        ((sa) adminWaitingRoomScreen.a.getValue()).t(true);
                        break;
                    case 1:
                        yy7[] yy7VarArr2 = AdminWaitingRoomScreen.Z;
                        ((sa) adminWaitingRoomScreen.a.getValue()).t(false);
                        break;
                    default:
                        yy7[] yy7VarArr3 = AdminWaitingRoomScreen.Z;
                        adminWaitingRoomScreen.getRouter().B(adminWaitingRoomScreen);
                        break;
                }
            }
        });
        x3bVar.setCustomTheme(v1aVar.B(x3bVar).c);
        x3bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        x3bVar.setVisibility(8);
        constraintLayout.addView(yfbVar);
        constraintLayout.addView(x3bVar);
        constraintLayout.addView(recyclerView);
        constraintLayout.addView(oneMeButton);
        constraintLayout.addView(oneMeButton2);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = yfbVar.getId();
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = recyclerView.getId();
        ut3VarG.d(id2, 3, yfbVar.getId(), 4);
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 4, oneMeButton.getId(), 3);
        int id3 = x3bVar.getId();
        ut3VarG.d(id3, 3, yfbVar.getId(), 4);
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 7, 0, 7);
        ut3VarG.d(id3, 4, 0, 4);
        int id4 = oneMeButton.getId();
        ut3VarG.d(id4, 6, oneMeButton2.getId(), 6);
        float f = 12;
        new fua(ut3VarG, 6, id4, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f));
        ut3VarG.d(id4, 7, oneMeButton2.getId(), 7);
        new fua(ut3VarG, 7, id4, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f));
        ut3VarG.d(id4, 4, oneMeButton2.getId(), 3);
        new fua(ut3VarG, 4, id4, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f));
        int id5 = oneMeButton2.getId();
        ut3VarG.d(id5, 6, 0, 6);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id5, 5));
        ut3VarG.d(id5, 7, 0, 7);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id5, 5));
        ut3VarG.d(id5, 4, 0, 4);
        new fua(ut3VarG, 4, id5, 5).e(kti.d(f * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.D(this, Z[1])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(((sa) this.a.getValue()).o, new na(this, null), 1), getLifecycleScope());
    }
}
