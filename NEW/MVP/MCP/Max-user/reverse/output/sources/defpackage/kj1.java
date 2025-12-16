package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class kj1 {
    public final s2i a;
    public final bwf b = new bwf(new g31(24));
    public final k18 c = rsb.a.a();
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final bwf g;
    public maf h;
    public boolean i;
    public boolean j;
    public boolean k;
    public cm6 l;
    public final bwf m;
    public final bwf n;

    public kj1(bwf bwfVar, s2i s2iVar) {
        this.a = s2iVar;
        kx1 kx1Var = kx1.a;
        this.d = kx1Var.getAccessor().d(139);
        this.e = kx1Var.getAccessor().d(156);
        this.f = kx1Var.getAccessor().d(48);
        this.g = bwfVar;
        final int i = 0;
        this.m = new bwf(new cm6(this) { // from class: jj1
            public final /* synthetic */ kj1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(((gu5) ((rt5) this.b.f.getValue())).u());
                    default:
                        gu5 gu5Var = (gu5) ((rt5) this.b.f.getValue());
                        Boolean bool = (Boolean) gu5Var.r.D(gu5Var, gu5.S[7]);
                        bool.booleanValue();
                        return bool;
                }
            }
        });
        final int i2 = 1;
        this.n = new bwf(new cm6(this) { // from class: jj1
            public final /* synthetic */ kj1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(((gu5) ((rt5) this.b.f.getValue())).u());
                    default:
                        gu5 gu5Var = (gu5) ((rt5) this.b.f.getValue());
                        Boolean bool = (Boolean) gu5Var.r.D(gu5Var, gu5.S[7]);
                        bool.booleanValue();
                        return bool;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(maf mafVar, cm6 cm6Var) {
        boolean zF = ((ur3) this.d.getValue()).f();
        if (cm6Var == null) {
            c();
            return;
        }
        if (!zF && mafVar != null && !((hw1) d()).g(mafVar)) {
            if (!bx1.a((ytd) this.g.getValue())) {
                lj1.c.p0().b(":call-active", null);
            }
            c();
            return;
        }
        if (!zF) {
            this.a.b();
            return;
        }
        if (mafVar == null) {
            ((hw1) d()).y();
            if (!bx1.a((ytd) this.g.getValue())) {
                cm6Var.invoke();
            }
            c();
            return;
        }
        if ((mafVar instanceof jaf) && !this.k && ((hw1) d()).g(mafVar)) {
            lj1 lj1Var = lj1.c;
            jaf jafVar = (jaf) mafVar;
            String str = jafVar.a;
            boolean z = jafVar.b;
            lj1Var.p0().b(":call-join-preview?link=" + str + "&is_video_call=" + z, null);
            return;
        }
        if (((hw1) d()).l().l instanceof xn5) {
            if (!bx1.a((ytd) this.g.getValue())) {
                cm6Var.invoke();
            }
            c();
            return;
        }
        boolean z2 = false;
        if (!((hw1) d()).g(mafVar)) {
            if (((hw1) d()).l().h) {
                gu5 gu5Var = (gu5) ((rt5) this.f.getValue());
                gu5Var.getClass();
                boolean z3 = gu5Var.k(PmsKey.f12callincomingab, 0L) == 0;
                if (mafVar.a() && !z3) {
                    z2 = true;
                }
                ((hw1) d()).f(z2);
            }
            if (!bx1.a((ytd) this.g.getValue())) {
                lj1.c.p0().b(":call-active", null);
            }
            c();
            return;
        }
        this.l = cm6Var;
        e().f = 1;
        yx1 yx1VarE = e();
        yx1VarE.d = rx1.a;
        yx1.d(yx1VarE, "START_CALL", null, "ANOTHER_USER_TRY", null, null, null, false, 250);
        s2i s2iVar = this.a;
        int i = this.i ? e0b.d : e0b.c;
        yy7[] yy7VarArr = BottomSheetWidget.B0;
        oq3 oq3VarE = az1.e(e0b.f, null, null, 4);
        oq3VarE.f(new n5g(e0b.e));
        oq3VarE.d(d0b.b, new n5g(i));
        oq3VarE.c(d0b.a, new n5g(e0b.b));
        ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
        Widget widget = s2iVar.b;
        confirmationBottomSheetE.setTargetController(widget);
        c54 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        confirmationBottomSheetE.N0(widget);
        if (ytdVarE0 != null) {
            bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
            az1.u(false, budVar, true, "BottomSheetWidget");
            ytdVarE0.H(budVar);
        }
    }

    public final boolean b(int i, String[] strArr, int[] iArr) {
        if (i != 178) {
            return false;
        }
        qsb qsbVarF = f();
        if (((Boolean) this.n.getValue()).booleanValue()) {
            strArr = qsb.h;
        }
        boolean zC = qsbVarF.c(strArr);
        s2i s2iVar = this.a;
        if (!zC) {
            for (int i2 : iArr) {
                if (i2 == -1) {
                    c();
                    s2i.g(s2iVar, a3d.permission_detail_dialog_title, Integer.valueOf(a3d.permission_detail_dialog_subtitile), null, null, false, null, 60);
                    return true;
                }
            }
            c();
            return false;
        }
        if (!this.j) {
            a(this.h, this.l);
            return true;
        }
        cm6 cm6Var = this.l;
        boolean zF = ((ur3) this.d.getValue()).f();
        if (cm6Var == null) {
            c();
            return true;
        }
        if (zF) {
            cm6Var.invoke();
            return true;
        }
        s2iVar.b();
        return true;
    }

    public final void c() {
        this.l = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.k = false;
    }

    public final tv1 d() {
        return (tv1) this.b.getValue();
    }

    public final yx1 e() {
        return (yx1) this.e.getValue();
    }

    public final qsb f() {
        return (qsb) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, k18] */
    public final boolean g(int i) {
        if (i != cyc.call_permission_dialog_check_continue) {
            if (i != cyc.call_permission_dialog_check_cancel) {
                return false;
            }
            c();
            return true;
        }
        e().f = 1;
        yx1 yx1VarE = e();
        yx1VarE.d = rx1.a;
        yx1.d(yx1VarE, "START_CALL", null, "ANOTHER_USER_CALL", null, null, null, false, 250);
        ((hw1) e51.a.b()).y();
        ytd ytdVar = (ytd) this.g.getValue();
        Object obj = bx1.a;
        ArrayList arrayListE = ytdVar.e();
        Collection<?> xsVar = new xs(0);
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            bud budVar = (bud) it.next();
            if (ue3.A((List) bx1.a.getValue(), budVar.b)) {
                xsVar.add(budVar);
            }
        }
        arrayListE.removeAll(xsVar);
        ytdVar.Q(arrayListE, null);
        cm6 cm6Var = this.l;
        if (cm6Var != null) {
            cm6Var.invoke();
        }
        c();
        return true;
    }

    public final void h(boolean z) {
        String str = ((hw1) d()).l().c;
        boolean z2 = ((hw1) d()).l().i;
        if (z && !f().c(qsb.m)) {
            e().g(str, "OUT_OF_CALL", z2);
        }
        if (f().c(qsb.h)) {
            return;
        }
        yx1 yx1VarE = e();
        yx1VarE.getClass();
        yx1.d(yx1VarE, "REQUEST_PERMISSION_MIC", str, "AFTER_INITIATION", null, null, null, z2, 120);
    }

    public final void i(long j, boolean z, cm6 cm6Var) {
        c();
        boolean zBooleanValue = ((Boolean) this.m.getValue()).booleanValue();
        s2i s2iVar = this.a;
        if (!zBooleanValue) {
            s2iVar.a();
            return;
        }
        iaf iafVar = new iaf(new ir1(j, z));
        if (f().a(s2iVar, z)) {
            a(iafVar, cm6Var);
            return;
        }
        h(z);
        this.h = iafVar;
        this.l = cm6Var;
        this.i = z;
    }

    public final void j(String str, boolean z, boolean z2, boolean z3, cm6 cm6Var) {
        c();
        this.k = z3;
        boolean zF = vmf.F(str);
        s2i s2iVar = this.a;
        if (zF) {
            s2iVar.a();
            return;
        }
        jaf jafVar = new jaf(str, z2, z, z2);
        if (f().a(s2iVar, z2)) {
            a(jafVar, cm6Var);
            return;
        }
        h(z2);
        this.h = jafVar;
        this.l = cm6Var;
        this.i = z2;
    }

    public final void l(long j, boolean z, cm6 cm6Var) {
        c();
        kaf kafVar = new kaf(new kr1(j, z));
        if (f().a(this.a, z)) {
            a(kafVar, cm6Var);
            return;
        }
        h(z);
        this.h = kafVar;
        this.l = cm6Var;
        this.i = z;
    }
}
