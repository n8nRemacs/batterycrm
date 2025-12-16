package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class b3b extends zh4 {
    public static final /* synthetic */ yy7[] f;
    public final k18 a;
    public boolean b = true;
    public final LinkedList c = new LinkedList();
    public final a3b d = new a3b(0, false);
    public sya e;

    static {
        z8a z8aVar = new z8a(b3b.class, "router", "getRouter()Lone/me/sdk/arch/rootcontroller/RouterWrapper;");
        vid.a.getClass();
        f = new yy7[]{z8aVar};
    }

    public b3b(k18 k18Var) {
        this.a = k18Var;
    }

    public static void h(c54 c54Var, ni4 ni4Var) {
        Bundle bundle = ni4Var.c;
        Widget widget = c54Var instanceof Widget ? (Widget) c54Var : null;
        if (widget != null) {
            widget.updateArgs(bundle);
        } else {
            c54Var.getArgs().clear();
            c54Var.getArgs().putAll(bundle);
        }
    }

    @Override // defpackage.zh4
    public final ArrayList a() {
        ArrayList arrayListE = ((RootController) f()).G0().e();
        ArrayList arrayList = new ArrayList(we3.q(arrayListE, 10));
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            arrayList.add(new z2b((bud) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.zh4
    public final int b() {
        if (!this.b) {
            return ((RootController) f()).G0().a.a.size();
        }
        List listE = this.c;
        if (listE.isEmpty()) {
            listE = ((RootController) f()).G0().e();
        }
        return listE.size();
    }

    @Override // defpackage.zh4
    public final void c(ni4 ni4Var) {
        bud budVarD = d(ni4Var, !a().isEmpty());
        if (this.b) {
            this.c.add(budVarD);
            return;
        }
        ((RootController) f()).G0().S(budVarD);
        sya syaVar = this.e;
        if (syaVar != null) {
            ((j94) syaVar.a.getValue()).getClass();
        }
    }

    public final bud d(ni4 ni4Var, boolean z) {
        mi4 mi4Var = ni4Var.f;
        li4 li4Var = ni4Var.e;
        bud budVarA = l8j.a((Widget) mi4Var.a(), null, null);
        budVarA.d(ni4Var.a);
        if (z && li4Var != li4.c) {
            Object objInvoke = li4Var.a.invoke();
            h54 h54VarE = objInvoke instanceof h54 ? (h54) objInvoke : null;
            if (h54VarE == null) {
                h54VarE = e();
            }
            budVarA.c(h54VarE);
            Object objInvoke2 = li4Var.b.invoke();
            h54 h54VarE2 = objInvoke2 instanceof h54 ? (h54) objInvoke2 : null;
            if (h54VarE2 == null) {
                h54VarE2 = e();
            }
            budVarA.a(h54VarE2);
        }
        return budVarA;
    }

    public final ih e() {
        return ((gu5) ((rt5) this.a.getValue())).y() ? new ar8(0) : new p67(0);
    }

    public final eud f() {
        return this.d.x(f[0]);
    }

    public final void g(cm6 cm6Var) {
        this.b = true;
        cm6Var.invoke();
        this.b = false;
        LinkedList linkedList = this.c;
        if (linkedList.isEmpty()) {
            return;
        }
        ArrayList arrayListE = ((RootController) f()).G0().e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (!((Widget) ((bud) obj).a).getE0()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListT = ue3.T(arrayListE, arrayList);
        ArrayList arrayListE2 = ((RootController) f()).E0().e();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedList) {
            if (((Widget) ((bud) obj2).a).getE0()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayListT2 = ue3.T(arrayListE2, arrayList2);
        linkedList.clear();
        ((RootController) f()).E0().Q(arrayListT2, null);
        ytd ytdVarG0 = ((RootController) f()).G0();
        bud budVar = (bud) ue3.Q(arrayListT);
        ytdVarG0.Q(arrayListT, budVar != null ? budVar.b() : null);
    }
}
