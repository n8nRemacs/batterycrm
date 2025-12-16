package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class spg extends g9c {
    public static final spg c = new spg(tpg.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((qpg) obj).a.length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        rpg rpgVar = (rpg) obj;
        long jT = yl3Var.a(this.b, i).t();
        rpgVar.b(rpgVar.d() + 1);
        long[] jArr = rpgVar.a;
        int i2 = rpgVar.b;
        rpgVar.b = i2 + 1;
        jArr[i2] = jT;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        long[] jArr = ((qpg) obj).a;
        rpg rpgVar = new rpg();
        rpgVar.a = jArr;
        rpgVar.b = jArr.length;
        rpgVar.b(10);
        return rpgVar;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new qpg(new long[0]);
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        long[] jArr = ((qpg) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            bVar.j(this.b, i2).l(jArr[i2]);
        }
    }
}
