package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class xpg extends g9c {
    public static final xpg c = new xpg(ypg.a);

    @Override // defpackage.k0
    public final int h(Object obj) {
        return ((vpg) obj).a.length;
    }

    @Override // defpackage.se3, defpackage.k0
    public final void j(yl3 yl3Var, int i, Object obj) {
        wpg wpgVar = (wpg) obj;
        short sA = yl3Var.a(this.b, i).A();
        wpgVar.b(wpgVar.d() + 1);
        short[] sArr = wpgVar.a;
        int i2 = wpgVar.b;
        wpgVar.b = i2 + 1;
        sArr[i2] = sA;
    }

    @Override // defpackage.k0
    public final Object k(Object obj) {
        short[] sArr = ((vpg) obj).a;
        wpg wpgVar = new wpg();
        wpgVar.a = sArr;
        wpgVar.b = sArr.length;
        wpgVar.b(10);
        return wpgVar;
    }

    @Override // defpackage.g9c
    public final Object n() {
        return new vpg(new short[0]);
    }

    @Override // defpackage.g9c
    public final void o(b bVar, Object obj, int i) {
        short[] sArr = ((vpg) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            bVar.j(this.b, i2).q(sArr[i2]);
        }
    }
}
