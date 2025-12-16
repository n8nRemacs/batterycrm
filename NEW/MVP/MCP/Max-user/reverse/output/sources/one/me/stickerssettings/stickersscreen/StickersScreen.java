package one.me.stickerssettings.stickersscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a08;
import defpackage.aw0;
import defpackage.awd;
import defpackage.bbd;
import defpackage.c5e;
import defpackage.ci5;
import defpackage.d53;
import defpackage.dse;
import defpackage.eo7;
import defpackage.f2;
import defpackage.f6a;
import defpackage.fb5;
import defpackage.fb6;
import defpackage.fhf;
import defpackage.g44;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.ghf;
import defpackage.gt;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h54;
import defpackage.hbd;
import defpackage.hhf;
import defpackage.hkf;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i54;
import defpackage.i84;
import defpackage.ihf;
import defpackage.imb;
import defpackage.jhf;
import defpackage.k18;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.lzf;
import defpackage.mgb;
import defpackage.n5g;
import defpackage.o6a;
import defpackage.oif;
import defpackage.one;
import defpackage.pq3;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qk8;
import defpackage.qne;
import defpackage.qq3;
import defpackage.rk8;
import defpackage.sjf;
import defpackage.sn0;
import defpackage.svi;
import defpackage.t9f;
import defpackage.tec;
import defpackage.tjf;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u6a;
import defpackage.udb;
import defpackage.ujf;
import defpackage.vdb;
import defpackage.vdc;
import defpackage.ve3;
import defpackage.vid;
import defpackage.vjf;
import defpackage.vw4;
import defpackage.wjf;
import defpackage.xb3;
import defpackage.xfh;
import defpackage.yfb;
import defpackage.yud;
import defpackage.yy7;
import defpackage.zr0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/stickerssettings/stickersscreen/StickersScreen;", "Lone/me/sdk/arch/Widget;", "Lg44;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lghf;", "mode", "", "setId", "(Lghf;J)V", "stickers-settings_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class StickersScreen extends Widget implements g44, qq3 {
    public static final /* synthetic */ yy7[] u0 = {new toc(StickersScreen.class, "stickersSetId", "getStickersSetId()J", 0), ho7.d(vid.a, StickersScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(StickersScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final sn0 X;
    public final sn0 Y;
    public final k18 Z;
    public final ghf a;
    public final hs b;
    public final k18 c;
    public final bbd d;
    public final bbd o;
    public final qk8 s0;
    public final fb6 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StickersScreen(Bundle bundle) {
        super(bundle, 0, 2, null == true ? 1 : 0);
        Object obj = null;
        String string = bundle.getString("mode");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Iterator it = ghf.X.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                break;
            }
            Object next = f2Var.next();
            if (((ghf) next).a.equals(string)) {
                obj = next;
                break;
            }
        }
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.a = (ghf) obj;
        this.b = new hs(Long.class, -1L, "set_id");
        this.c = createViewModelLazy(hkf.class, new vdc(28, new fhf(this, 0)));
        this.d = viewBinding(udb.x);
        this.o = viewBinding(udb.f);
        this.X = binding(new fhf(this, 1));
        this.Y = binding(new fhf(this, 2));
        oif oifVar = oif.a;
        this.Z = oifVar.getAccessor().d(476);
        this.s0 = new qk8();
        this.t0 = new fb6(((g4b) oifVar.getAccessor().c(56)).a(), new awd(3, this));
    }

    public final hkf A0() {
        return (hkf) this.c.getValue();
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        hkf hkfVarA0 = A0();
        ci5 ci5Var = hkfVarA0.y0;
        if (i == udb.u) {
            hkfVarA0.u().d.m(null, new f6a(6));
            return;
        }
        if (i == udb.w) {
            xfh.r(ci5Var, new one(new n5g(vdb.B), new n5g(vdb.A), ve3.j(new pq3(udb.e, new n5g(vdb.D), 1, 56), new pq3(udb.a, new n5g(vdb.i), 2, 56))));
            return;
        }
        if (i == udb.t) {
            xfh.r(ci5Var, new one(new n5g(vdb.w), new n5g(vdb.v), ve3.j(new pq3(udb.d, new n5g(vdb.D), 1, 56), new pq3(udb.a, new n5g(vdb.i), 2, 56))));
            return;
        }
        if (i != udb.i) {
            if (i == udb.j) {
                xfh.r(ci5Var, new one(new n5g(vdb.k), new n5g(vdb.j), ve3.j(new pq3(udb.b, new n5g(vdb.h), 1, 56), new pq3(udb.a, new n5g(vdb.i), 2, 56))));
                return;
            }
            return;
        }
        sjf sjfVar = (sjf) hkfVarA0.x0.a.getValue();
        String str = sjfVar != null ? sjfVar.c : null;
        if (str == null || str.length() == 0) {
            return;
        }
        xb3.a(hkfVarA0.d, str);
        qne qneVar = xb3.b() ? new qne(yud.u, new n5g(vdb.g)) : null;
        if (qneVar != null) {
            xfh.r(ci5Var, qneVar);
        }
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        hkf hkfVarA0 = A0();
        yy7[] yy7VarArr = hkf.A0;
        ContextScope contextScope = hkfVarA0.a;
        t9f t9fVar = hkfVarA0.s0;
        lzf lzfVar = hkfVarA0.o;
        int i2 = udb.e;
        i84 i84Var = i84.b;
        if (i == i2) {
            t9fVar.O(hkfVarA0, yy7VarArr[0], svi.d(contextScope, ((q2b) lzfVar).b(), i84Var, new ujf(hkfVarA0, null)));
            return;
        }
        if (i == udb.d) {
            t9fVar.O(hkfVarA0, yy7VarArr[0], svi.d(contextScope, ((q2b) lzfVar).b(), i84Var, new tjf(hkfVarA0, null)));
            return;
        }
        if (i == udb.c) {
            hkfVarA0.t0.O(hkfVarA0, yy7VarArr[1], svi.d(contextScope, ((q2b) lzfVar).b(), i84Var, new wjf(hkfVarA0, ((f6a) hkfVarA0.u().e.a.getValue()).b, null)));
            hkfVarA0.u().a();
            return;
        }
        if (i == udb.b) {
            hkfVarA0.u0.O(hkfVarA0, yy7VarArr[2], svi.d(contextScope, ((q2b) lzfVar).b(), i84Var, new vjf(hkfVarA0, hkfVarA0.c, null)));
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getT0() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityPaused(Activity activity) {
        ((rk8) this.Z.getValue()).a(this.s0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityResumed(Activity activity) {
        ((rk8) this.Z.getValue()).b(this.s0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onChangeStarted(h54 h54Var, i54 i54Var) {
        super.onChangeStarted(h54Var, i54Var);
        i54 i54Var2 = i54.POP_ENTER;
        k18 k18Var = this.Z;
        qk8 qk8Var = this.s0;
        if (i54Var == i54Var2 || i54Var == i54.PUSH_ENTER) {
            ((rk8) k18Var.getValue()).b(qk8Var);
        } else if (i54Var == i54.PUSH_EXIT) {
            ((rk8) k18Var.getValue()).a(qk8Var);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), null);
        recyclerView.setId(udb.f);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        float f = 12;
        recyclerView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.t0);
        int iB = gt.b(recyclerView.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(iB));
        recyclerView.j(new fb5(iB, kti.d(4 * vw4.d().getDisplayMetrics().density), 6));
        recyclerView.k(new a08(3, this));
        frameLayout.addView(recyclerView);
        yfb yfbVar = new yfb(frameLayout.getContext(), 6);
        yfbVar.setId(udb.x);
        yfbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new dse(4, this)));
        tqi.c(new tec(3, null, 1), yfbVar);
        frameLayout.addView(yfbVar);
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        this.s0.b();
        y0().setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        yfb yfbVarZ0 = z0();
        mgb.a(yfbVarZ0, new c5e(yfbVarZ0, 3, this));
        hbd hbdVar = A0().w0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new hhf(null, this, view), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new d53(A0().x0, 12), getViewLifecycleOwner().p(), l38Var), new ihf(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(A0().y0, getViewLifecycleOwner().p(), l38Var), new jhf(null, this), 1), getViewLifecycleScope());
        RecyclerView recyclerViewY0 = y0();
        o6a o6aVarU = A0().u();
        u6a u6aVar = new u6a(recyclerViewY0, this.t0, o6aVarU, z0());
        gw0.w(new g56(o6aVarU.e, new zr0(2, u6aVar, u6a.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/stickerssettings/stickersscreen/multiselection/MultiSelectionLogic$Data;)V", 4, 25), 1), getViewLifecycleScope());
    }

    public final RecyclerView y0() {
        return (RecyclerView) this.o.D(this, u0[2]);
    }

    public final yfb z0() {
        return (yfb) this.d.D(this, u0[1]);
    }

    public /* synthetic */ StickersScreen(ghf ghfVar, long j, int i, tk4 tk4Var) {
        this(ghfVar, (i & 2) != 0 ? -1L : j);
    }

    public StickersScreen(ghf ghfVar, long j) {
        this(gwi.b(new imb("mode", ghfVar.a), new imb("set_id", Long.valueOf(j))));
    }
}
