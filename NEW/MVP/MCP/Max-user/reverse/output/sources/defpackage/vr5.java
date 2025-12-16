package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class vr5 implements ui8 {
    public final k18 X;
    public final nm0 Y = nm0.t(Collections.EMPTY_LIST);
    public final zl3 Z = new zl3();
    public final k18 a;
    public final k18 b;
    public final bwf c;
    public final bwf d;
    public final k18 o;

    public vr5(k18 k18Var, k18 k18Var2, k18 k18Var3, bwf bwfVar, bwf bwfVar2, k18 k18Var4) {
        this.a = k18Var;
        this.b = k18Var2;
        this.X = k18Var3;
        this.c = bwfVar;
        this.d = bwfVar2;
        this.o = k18Var4;
    }

    public final wk3 a() {
        k18 k18Var = this.a;
        Objects.requireNonNull(k18Var);
        return new wk3(5, new tv0(2, k18Var));
    }

    public final void b(long j) {
        wqi.c("vr5", "loadFromMarker: marker=%d", Long.valueOf(j));
        gs5 gs5Var = (gs5) this.X.getValue();
        u2f u2fVarG = gs5Var.a.G(new wua(0, 50, j, "FAVORITE_STICKER_SETS", (String) null), gs5Var.c);
        d1g d1gVar = gs5Var.b;
        d1gVar.getClass();
        int i = 1;
        int i2 = 0;
        qk3 qk3VarH = new ik3(new k2f(u2fVarG.j(new b1g(d1gVar, i, i2)).h(new kce(20, iu.class)).h(new er5(19)), new or5(this, 4), i).h(new er5(13)), 2, new or5(this, 5)).h((j0e) this.d.getValue());
        qu1 qu1Var = new qu1(new t00(j, 7), i2, new qr5(j, 1));
        qk3VarH.f(qu1Var);
        this.Z.a(qu1Var);
    }

    @Override // defpackage.ui8
    public final void c() {
        wqi.c("vr5", "clear: ", new Object[0]);
        gs5 gs5Var = (gs5) this.X.getValue();
        gs5Var.getClass();
        wqi.c("gs5", "cancelRequests: ", new Object[0]);
        gs5Var.f.clear();
        gs5Var.g.d();
        this.Z.d();
        azi.b(new ik3(a(), 2, new er5(11)).i(), pdf.e, new er5(12), new yl4(2));
        this.Y.f(Collections.EMPTY_LIST);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Serializable, long[]] */
    public final uk3 d(long j, boolean z) {
        qk3 qk3VarH;
        wqi.c("vr5", "markAsFavorite: setId=%d, favorite=%b", Long.valueOf(j), Boolean.valueOf(z));
        int i = 2;
        int i2 = 0;
        ik3 ik3Var = new ik3(z ? new ik3(new m2f(a(), new er5(9), 0), i, new or5(this, i)) : nk3.a, i2, new ik3(a(), i, new dr5(1, j, z)));
        int i3 = 3;
        int i4 = 20;
        k18 k18Var = this.X;
        if (z) {
            gs5 gs5Var = (gs5) k18Var.getValue();
            gs5Var.getClass();
            qk3VarH = new ik3(new wk3(i3, new cs5(gs5Var, j, i2)).h(new kce(i4, eu.class)), i, new er5(i4)).h(gs5Var.d);
        } else {
            gs5 gs5Var2 = (gs5) k18Var.getValue();
            gs5Var2.getClass();
            qk3VarH = new ik3(new wk3(i3, new es5(gs5Var2, new long[]{j}, i2)).h(new kce(i4, ru.class)), i, new er5(22)).h(gs5Var2.d);
        }
        return new ik3(ik3Var, i2, qk3VarH).d(new rr5(0, j, z)).e(new dr5(i, j, z));
    }

    public final void e(ArrayList arrayList) {
        List list;
        RuntimeException runtimeException;
        List list2 = (List) this.Y.u();
        if (jqi.f(list2)) {
            return;
        }
        if (list2 == null || !list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                try {
                    if (arrayList.contains(Long.valueOf(((sff) obj).a))) {
                        arrayList2.add(obj);
                    }
                } finally {
                }
            }
            list = arrayList2;
        } else {
            list = Collections.EMPTY_LIST;
        }
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(list2.size());
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            try {
                arrayList3.add(Long.valueOf(((sff) it.next()).a));
            } finally {
            }
        }
        f(arrayList3);
    }

    public final void f(List list) {
        ((igf) this.b.getValue()).b(list).i((j0e) this.d.getValue()).m((j0e) this.c.getValue()).k(new qu1(new or5(this, 3), 2, new er5(10)));
    }

    public final void g() {
        wqi.c("vr5", "reloadFavoritesFromServer: ", new Object[0]);
        ((w4e) ((x0g) this.o.getValue()).a).z(0L);
        i(0L);
    }

    public final void h(long j) {
        wqi.c("vr5", "setSectionUpdateTime: %d", Long.valueOf(j));
        w4e w4eVar = (w4e) ((x0g) this.o.getValue()).a;
        w4eVar.V.O(w4eVar, w4e.m0[39], Long.valueOf(j));
    }

    public final void i(long j) {
        gs5 gs5Var = (gs5) this.X.getValue();
        gs5Var.getClass();
        wqi.c("gs5", "assetsUpdate: request, sync=%d", Long.valueOf(j));
        uk3 uk3VarA = gs5Var.e.a(ve3.j(usb.Q0, usb.S0, usb.T0, usb.R0));
        int i = 1;
        kk3 kk3Var = new kk3(i, new mv3(gs5Var, j, i));
        int i2 = 0;
        qk3 qk3VarH = new ik3(uk3VarA, i2, kk3Var).h(gs5Var.c);
        qu1 qu1Var = new qu1(new t00(j, 8), i2, new qr5(j, 2));
        qk3VarH.f(qu1Var);
        gs5Var.g.a(qu1Var);
    }
}
