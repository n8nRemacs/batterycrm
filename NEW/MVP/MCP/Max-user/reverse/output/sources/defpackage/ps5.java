package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ps5 implements ui8 {
    public final kz4 X;
    public final kz4 Y;
    public final kz4 a;
    public final kz4 b;
    public final kz4 c;
    public final kz4 d;
    public final kz4 o;
    public final zl3 Z = new zl3();
    public final nm0 s0 = nm0.t(Collections.EMPTY_LIST);

    public ps5(kz4 kz4Var, kz4 kz4Var2, kz4 kz4Var3, kz4 kz4Var4, kz4 kz4Var5, kz4 kz4Var6, kz4 kz4Var7) {
        this.a = kz4Var;
        this.b = kz4Var2;
        this.c = kz4Var3;
        this.d = kz4Var4;
        this.o = kz4Var5;
        this.X = kz4Var6;
        this.Y = kz4Var7;
    }

    public final ora a() {
        nm0 nm0Var = this.s0;
        nm0Var.getClass();
        return new ora(new qra(nm0Var, 0), new er5(28), 5);
    }

    public final void b(long j) {
        wqi.c("ps5", "loadFromMarker: marker=%d", Long.valueOf(j));
        js5 js5Var = (js5) this.Y.get();
        u2f u2fVarG = js5Var.a.G(new wua(0, 50, j, "FAVORITE_STICKERS", (String) null), js5Var.c);
        d1g d1gVar = js5Var.b;
        d1gVar.getClass();
        qk3 qk3VarH = new ik3(new k2f(u2fVarG.j(new b1g(d1gVar, 1, 0)).h(new kce(20, iu.class)).h(new er5(23)), new ms5(this, 4), 1).h(new os5(1)), 2, new ms5(this, 5)).h((j0e) this.d.get());
        qu1 qu1Var = new qu1(new t00(j, 11), 0, new qr5(j, 4));
        qk3VarH.f(qu1Var);
        this.Z.a(qu1Var);
    }

    @Override // defpackage.ui8
    public final void c() {
        this.Z.dispose();
    }

    public final uk3 d(long j, boolean z) {
        qk3 qk3VarH;
        wqi.c("ps5", "markAsFavorite: stickerId=%d, favorite=%b", Long.valueOf(j), Boolean.valueOf(z));
        int i = 3;
        kz4 kz4Var = this.a;
        ik3 ik3Var = new ik3(z ? new ik3(new m2f(((kr5) kz4Var.get()).a(), new dm4(29), 0), 2, new ms5(this, i)) : nk3.a, 0, new ik3(((kr5) kz4Var.get()).a(), 2, new dr5(0, j, z)));
        int i2 = 1;
        if (z) {
            wqi.c("ps5", "addToFavorites: stickerId=%d", Long.valueOf(j));
            js5 js5Var = (js5) this.Y.get();
            js5Var.getClass();
            qk3VarH = new ik3(new wk3(i, new cs5(js5Var, j, i2)).h(new kce(20, eu.class)), 2, new er5(25)).h(js5Var.d);
        } else {
            qk3VarH = h(new long[]{j});
        }
        return new ik3(ik3Var, 0, qk3VarH).d(new rr5(1, j, z)).e(new dr5(4, j, z));
    }

    public final void e(List list) {
        m2f m2fVarB = ((tef) this.b.get()).b(list);
        kz4 kz4Var = this.c;
        m2fVarB.i((j0e) kz4Var.get()).m((j0e) kz4Var.get()).k(new qu1(new ms5(this, 2), 2, new os5(0)));
    }

    public final void f() {
        wqi.c("ps5", "reloadFavoritesFromServer: ", new Object[0]);
        ((w4e) ((pb3) this.o.get())).z(0L);
        js5 js5Var = (js5) this.Y.get();
        js5Var.getClass();
        wqi.c("js5", "assetsUpdate: request, sync=%d", 0L);
        qk3 qk3VarH = new ik3(js5Var.e.a(ve3.j(usb.Q0, usb.S0, usb.T0, usb.R0)), 0, new kk3(1, new gk0(5, js5Var))).h(js5Var.c);
        qu1 qu1Var = new qu1(new er5(26), 0, new yl4(3));
        qk3VarH.f(qu1Var);
        js5Var.g.a(qu1Var);
    }

    public final uk3 g(List list) {
        wqi.c("ps5", "removeFromFavorites: ids=%s", list);
        return new ik3(new ik3(((kr5) this.a.get()).a(), 2, new oh2(5, list)), 0, h(jqi.c(list))).d(new mr5(3, list)).e(new oh2(13, list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qk3 h(long[] jArr) {
        wqi.c("ps5", "removeFromFavorites: stickerIds=%s", jArr);
        js5 js5Var = (js5) this.Y.get();
        js5Var.getClass();
        return new ik3(new wk3(3, new es5(js5Var, jArr, 1)).h(new kce(20, ru.class)), 2, new er5(24)).h(js5Var.d);
    }

    public final void i(long j) {
        wqi.c("ps5", "setSectionUpdateTime: %d", Long.valueOf(j));
        w4e w4eVar = (w4e) ((pb3) this.o.get());
        w4eVar.U.O(w4eVar, w4e.m0[38], Long.valueOf(j));
    }
}
