package one.me.calls.ui.ui.debugmenu;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.bbd;
import defpackage.c54;
import defpackage.c61;
import defpackage.cm6;
import defpackage.d9e;
import defpackage.e61;
import defpackage.eo7;
import defpackage.eud;
import defpackage.f61;
import defpackage.g31;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gm1;
import defpackage.gw0;
import defpackage.h08;
import defpackage.ho7;
import defpackage.ipi;
import defpackage.j0b;
import defpackage.j61;
import defpackage.k18;
import defpackage.m0b;
import defpackage.nha;
import defpackage.q;
import defpackage.qfb;
import defpackage.toc;
import defpackage.v1a;
import defpackage.vid;
import defpackage.yfb;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.z11;
import defpackage.zr0;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lone/me/calls/ui/ui/debugmenu/CallDebugMenuScreen;", "Lone/me/sdk/arch/Widget;", "Lnha;", "<init>", "()V", "e61", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallDebugMenuScreen extends Widget implements nha {
    public static final /* synthetic */ yy7[] Z = {new toc(CallDebugMenuScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, CallDebugMenuScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final bbd X;
    public final Object Y;
    public final eo7 a;
    public final k18 b;
    public final c61 c;
    public final Object d;
    public final Object o;

    /* JADX WARN: Multi-variable type inference failed */
    public CallDebugMenuScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = eo7.f;
        k18 k18VarCreateViewModelLazy = createViewModelLazy(j61.class, new q(10, new g31(5)));
        this.b = k18VarCreateViewModelLazy;
        c61 c61Var = new c61(new h08(6, this), gm1.a.b().a());
        this.c = c61Var;
        final int i = 0;
        this.d = ipi.b(3, new cm6(this) { // from class: d61
            public final /* synthetic */ CallDebugMenuScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                CallDebugMenuScreen callDebugMenuScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = CallDebugMenuScreen.Z;
                        return new d9e(a93.s0.z(callDebugMenuScreen.getContext()).c, new xtd(11, callDebugMenuScreen), new k(17, callDebugMenuScreen), null, 20);
                    default:
                        yy7[] yy7VarArr2 = CallDebugMenuScreen.Z;
                        return new f61(callDebugMenuScreen);
                }
            }
        });
        this.o = ipi.b(3, new g31(6));
        viewBinding(j0b.H);
        this.X = viewBinding(j0b.E);
        gw0.w(new g56(((j61) k18VarCreateViewModelLazy.getValue()).d, new zr0(2, c61Var, c61.class, "submitList", "submitList(Ljava/util/List;)V", 4, 4), 1), getLifecycleScope());
        final int i2 = 1;
        this.Y = ipi.b(3, new cm6(this) { // from class: d61
            public final /* synthetic */ CallDebugMenuScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                CallDebugMenuScreen callDebugMenuScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallDebugMenuScreen.Z;
                        return new d9e(a93.s0.z(callDebugMenuScreen.getContext()).c, new xtd(11, callDebugMenuScreen), new k(17, callDebugMenuScreen), null, 20);
                    default:
                        yy7[] yy7VarArr2 = CallDebugMenuScreen.Z;
                        return new f61(callDebugMenuScreen);
                }
            }
        });
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(j0b.H);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(m0b.Z);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new z11(1, this)));
        v1a v1aVar = a93.s0;
        yfbVar.setCustomTheme(v1aVar.B(yfbVar).c);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(j0b.E);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.c);
        recyclerView.setItemAnimator(null);
        recyclerView.j((d9e) this.d.getValue());
        recyclerView.j((e61) this.o.getValue());
        linearLayout.addView(yfbVar);
        linearLayout.addView(recyclerView);
        linearLayout.setBackgroundColor(v1aVar.B(linearLayout).c.b().m);
        return linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        c54 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        if (ytdVarE0 != null) {
            ytdVarE0.L((f61) this.Y.getValue());
        }
        yy7[] yy7VarArr = Z;
        yy7 yy7Var = yy7VarArr[1];
        bbd bbdVar = this.X;
        ((RecyclerView) bbdVar.D(this, yy7Var)).setAdapter(null);
        ((RecyclerView) bbdVar.D(this, yy7VarArr[1])).p0((e61) this.o.getValue());
        ((RecyclerView) bbdVar.D(this, yy7VarArr[1])).p0((d9e) this.d.getValue());
        super.onDestroyView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        c54 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        if (ytdVarE0 != null) {
            ytdVarE0.a((f61) this.Y.getValue());
        }
    }
}
