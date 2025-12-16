package one.me.calls.ui.ui.settings;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a21;
import defpackage.a93;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.c54;
import defpackage.ca;
import defpackage.cm6;
import defpackage.d9e;
import defpackage.eo7;
import defpackage.eud;
import defpackage.g56;
import defpackage.gda;
import defpackage.gfb;
import defpackage.gm1;
import defpackage.gu5;
import defpackage.gw0;
import defpackage.h21;
import defpackage.ho7;
import defpackage.hw1;
import defpackage.ipi;
import defpackage.j0b;
import defpackage.j2e;
import defpackage.k18;
import defpackage.l;
import defpackage.l38;
import defpackage.m0b;
import defpackage.mc5;
import defpackage.nha;
import defpackage.nn8;
import defpackage.q;
import defpackage.qfb;
import defpackage.rt5;
import defpackage.toc;
import defpackage.tv1;
import defpackage.v11;
import defpackage.v1a;
import defpackage.vid;
import defpackage.vye;
import defpackage.w11;
import defpackage.y01;
import defpackage.y11;
import defpackage.yfb;
import defpackage.ytd;
import defpackage.yx1;
import defpackage.yy7;
import defpackage.z01;
import defpackage.z11;
import defpackage.zr0;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.sdk.arch.Widget;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/calls/ui/ui/settings/CallAdminSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lnha;", "Lj2e;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallAdminSettingsScreen extends Widget implements nha, j2e {
    public static final /* synthetic */ yy7[] s0 = {new toc(CallAdminSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, CallAdminSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final Object X;
    public final bbd Y;
    public final Object Z;
    public final eo7 a;
    public final k18 b;
    public final y01 c;
    public final Object d;
    public final Object o;

    /* JADX WARN: Multi-variable type inference failed */
    public CallAdminSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = eo7.f;
        this.b = createViewModelLazy(h21.class, new q(8, new l(26)));
        y01 y01Var = new y01(new mc5(5, this), gm1.a.b().a());
        this.c = y01Var;
        final int i = 0;
        this.d = ipi.b(3, new cm6(this) { // from class: x11
            public final /* synthetic */ CallAdminSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                CallAdminSettingsScreen callAdminSettingsScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = CallAdminSettingsScreen.s0;
                        return new d9e(a93.s0.z(callAdminSettingsScreen.getContext()).c, new xtd(10, callAdminSettingsScreen), new k(16, callAdminSettingsScreen), null, 20);
                    default:
                        yy7[] yy7VarArr2 = CallAdminSettingsScreen.s0;
                        return new y11(callAdminSettingsScreen);
                }
            }
        });
        this.o = ipi.b(3, new l(27));
        this.X = ipi.b(3, new l(28));
        viewBinding(j0b.X);
        this.Y = viewBinding(j0b.W);
        gw0.w(new g56(y0().Z, new zr0(2, y01Var, y01.class, "submitList", "submitList(Ljava/util/List;)V", 4, 2), 1), getLifecycleScope());
        final int i2 = 1;
        this.Z = ipi.b(3, new cm6(this) { // from class: x11
            public final /* synthetic */ CallAdminSettingsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                CallAdminSettingsScreen callAdminSettingsScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = CallAdminSettingsScreen.s0;
                        return new d9e(a93.s0.z(callAdminSettingsScreen.getContext()).c, new xtd(10, callAdminSettingsScreen), new k(16, callAdminSettingsScreen), null, 20);
                    default:
                        yy7[] yy7VarArr2 = CallAdminSettingsScreen.s0;
                        return new y11(callAdminSettingsScreen);
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
        yfbVar.setId(j0b.X);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(m0b.z);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new z11(0, this)));
        v1a v1aVar = a93.s0;
        yfbVar.setCustomTheme(v1aVar.B(yfbVar).c);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(j0b.W);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.c);
        recyclerView.setItemAnimator(null);
        recyclerView.j((d9e) this.d.getValue());
        recyclerView.j((w11) this.o.getValue());
        linearLayout.addView(yfbVar);
        linearLayout.addView(recyclerView);
        linearLayout.setBackgroundColor(v1aVar.B(linearLayout).c.b().m);
        return linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        if (((vye) this.X.getValue()) != null) {
            vye.a();
        }
        c54 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        if (ytdVarE0 != null) {
            ytdVarE0.L((y11) this.Z.getValue());
        }
        yy7[] yy7VarArr = s0;
        yy7 yy7Var = yy7VarArr[1];
        bbd bbdVar = this.Y;
        ((RecyclerView) bbdVar.D(this, yy7Var)).setAdapter(null);
        ((RecyclerView) bbdVar.D(this, yy7VarArr[1])).p0((w11) this.o.getValue());
        ((RecyclerView) bbdVar.D(this, yy7VarArr[1])).p0((d9e) this.d.getValue());
        h21 h21VarY0 = y0();
        k18 k18Var = h21VarY0.o;
        k18 k18Var2 = h21VarY0.d;
        k18 k18Var3 = h21VarY0.o;
        ((hw1) ((tv1) k18Var.getValue())).Z0.remove(h21VarY0);
        if (((hw1) ((tv1) k18Var3.getValue())).t()) {
            z01 z01VarT = h21VarY0.t();
            z01VarT.getClass();
            ca caVar = (ca) ((v11) z01VarT).F0.getValue();
            yx1 yx1Var = (yx1) h21VarY0.X.getValue();
            boolean z = caVar.b;
            boolean z2 = caVar.c;
            boolean z3 = caVar.d;
            gu5 gu5Var = (gu5) ((rt5) k18Var2.getValue());
            gu5Var.getClass();
            boolean z4 = gu5Var.j(PmsKey.grse, false) ? caVar.e : false;
            gu5 gu5Var2 = (gu5) ((rt5) k18Var2.getValue());
            gu5Var2.getClass();
            boolean z5 = gu5Var2.j(PmsKey.gcwre, false) ? caVar.g : false;
            String str = ((hw1) ((tv1) k18Var3.getValue())).l().c;
            yx1Var.getClass();
            nn8 nn8Var = new nn8();
            Integer numD = ((gda) yx1Var.c.getValue()).d();
            if (numD != null) {
                nn8Var.put("screen", Integer.valueOf(numD.intValue()));
            }
            nn8Var.put("camera", Boolean.valueOf(z));
            nn8Var.put("microphone", Boolean.valueOf(z2));
            nn8Var.put("screenshare", Boolean.valueOf(z3));
            nn8Var.put("recording", Boolean.valueOf(z4));
            nn8Var.put("waiting", Boolean.valueOf(z5));
            if (str != null) {
                nn8Var.put("call_id", str);
            }
            yx1Var.b("ADMIN_CALL_SETTINGS", nn8Var.b());
        }
        super.onDestroyView(view);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
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
            ytdVarE0.a((y11) this.Z.getValue());
        }
        gw0.w(new g56(aw0.a(y0().s0, getViewLifecycleOwner().p(), l38.d), new a21(null, this), 1), getViewLifecycleScope());
    }

    public final h21 y0() {
        return (h21) this.b.getValue();
    }
}
