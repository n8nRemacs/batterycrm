package one.me.calllist.ui.page;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.bb1;
import defpackage.bbd;
import defpackage.bwf;
import defpackage.byc;
import defpackage.f2;
import defpackage.fni;
import defpackage.g31;
import defpackage.g44;
import defpackage.g56;
import defpackage.ha1;
import defpackage.hs;
import defpackage.ipi;
import defpackage.ja1;
import defpackage.k18;
import defpackage.ka1;
import defpackage.kj1;
import defpackage.kti;
import defpackage.la1;
import defpackage.ma1;
import defpackage.o37;
import defpackage.ocg;
import defpackage.pa1;
import defpackage.q;
import defpackage.qq3;
import defpackage.s3e;
import defpackage.svi;
import defpackage.tcf;
import defpackage.toc;
import defpackage.tw1;
import defpackage.u45;
import defpackage.und;
import defpackage.v17;
import defpackage.vid;
import defpackage.vpi;
import defpackage.vw1;
import defpackage.vw4;
import defpackage.wqi;
import defpackage.x3b;
import defpackage.x7j;
import defpackage.xa1;
import defpackage.ya1;
import defpackage.yy7;
import defpackage.z34;
import defpackage.za1;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lone/me/calllist/ui/page/CallHistoryPageScreen;", "Lone/me/sdk/arch/Widget;", "Lg44;", "Lqq3;", "Ls3e;", "<init>", "()V", "Lbb1;", "type", "(Lbb1;)V", "v17", "call-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallHistoryPageScreen extends Widget implements g44, qq3, s3e {
    public final bbd X;
    public final bwf Y;
    public final Object Z;
    public final k18 a;
    public final k18 b;
    public final Object c;
    public ocg d;
    public final und o;
    public final hs s0;
    public z34 t0;
    public static final /* synthetic */ yy7[] v0 = {new toc(CallHistoryPageScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), u45.h(vid.a, CallHistoryPageScreen.class, "typeArg", "getTypeArg()Ljava/lang/String;")};
    public static final v17 u0 = new v17(15, 0);
    public static final int w0 = 1;

    public CallHistoryPageScreen() {
        super(null, 0, 3, null);
        this.a = m39getSharedViewModelcp94BC8("call_history_scope_id", za1.class, null);
        this.b = createViewModelLazy(pa1.class, new q(12, new ja1(this, 0)));
        this.c = ipi.b(3, new ja1(this, 1));
        this.o = new und(new ja1(this, 2));
        this.X = viewBinding(byc.call_history_list);
        this.Y = new bwf(new ja1(this, 3));
        this.Z = ipi.b(3, new g31(9));
        this.s0 = new hs(String.class, "type_arg");
    }

    public final za1 A0() {
        return (za1) this.a.getValue();
    }

    public final pa1 B0() {
        return (pa1) this.b.getValue();
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        Object value;
        Map map;
        Long l = B0().x0;
        if (l != null) {
            long jLongValue = l.longValue();
            this.t0 = null;
            B0().x0 = null;
            o37 o37VarT = B0().t(jLongValue);
            if (o37VarT == null) {
                return;
            }
            if (i != w0) {
                if (i == 0) {
                    za1 za1VarA0 = A0();
                    svi.e(za1VarA0.a, null, null, new ya1(za1VarA0, Collections.singletonList(o37VarT), null), 3);
                    return;
                }
                return;
            }
            tcf tcfVar = A0().o;
            do {
                value = tcfVar.getValue();
                xa1 xa1Var = (xa1) value;
                map = xa1Var.b;
                xa1Var.getClass();
            } while (!tcfVar.c(value, new xa1(true, map)));
            A0().t(jLongValue, o37VarT);
        }
    }

    @Override // defpackage.s3e
    public final void f0() {
        z0().x0(0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        ((kj1) this.c.getValue()).g(i);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        pa1 pa1VarB0 = B0();
        wqi.c("CallHistoryPageViewModel", "unregister load history callbacks for type=" + pa1VarB0.b, new Object[0]);
        vw1 vw1Var = pa1VarB0.o;
        vw1Var.y0.b(new tw1(vw1Var, 4));
        vw1Var.X.remove(pa1VarB0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        B0().w();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        x3b x3bVar = (x3b) this.o.getValue();
        if (x3bVar != null) {
            frameLayout.addView(x3bVar, -1, -1);
        }
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), null, 6);
        endlessRecyclerView2.setId(byc.call_history_list);
        frameLayout.addView(endlessRecyclerView2, -1, -1);
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        this.o.reset();
        ocg ocgVar = this.d;
        if (ocgVar != null) {
            ocgVar.b(z0());
        }
    }

    @Override // defpackage.g44
    public final void onDismiss() {
        this.t0 = null;
        B0().x0 = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((kj1) this.c.getValue()).b(i, strArr, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        EndlessRecyclerView2 endlessRecyclerView2Z0 = z0();
        endlessRecyclerView2Z0.getContext();
        endlessRecyclerView2Z0.setLayoutManager(new LinearLayoutManager());
        endlessRecyclerView2Z0.setAdapter((ha1) this.Y.getValue());
        this.d = x7j.c(endlessRecyclerView2Z0);
        x3b x3bVar = (x3b) this.o.getValue();
        if (x3bVar != null) {
            endlessRecyclerView2Z0.setEmptyView(x3bVar);
        }
        endlessRecyclerView2Z0.setPager(new ma1(this, 0));
        endlessRecyclerView2Z0.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2Z0.setThreshold(10);
        endlessRecyclerView2Z0.setClipToPadding(false);
        float f = 0;
        float f2 = 10;
        endlessRecyclerView2Z0.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        vpi.b(new g56(B0().u0, new ka1(this, null), 1), getViewLifecycleScope());
        bb1 bb1Var = bb1.b;
        if (B0().b == bb1.b) {
            vpi.b(new g56(B0().w0, new la1(this, null), 1), getViewLifecycleScope());
        }
    }

    public final bb1 y0() {
        Object next;
        bb1 bb1Var = bb1.b;
        yy7 yy7Var = v0[1];
        String str = (String) this.s0.a(this);
        Iterator it = bb1.o.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                next = null;
                break;
            }
            next = f2Var.next();
            if (fni.a(((bb1) next).name(), str)) {
                break;
            }
        }
        bb1 bb1Var2 = (bb1) next;
        return bb1Var2 == null ? bb1.b : bb1Var2;
    }

    public final EndlessRecyclerView2 z0() {
        return (EndlessRecyclerView2) this.X.D(this, v0[0]);
    }

    public CallHistoryPageScreen(bb1 bb1Var) {
        this();
        String strName = bb1Var.name();
        hs hsVar = this.s0;
        yy7 yy7Var = v0[1];
        hsVar.b(this, strName);
    }
}
