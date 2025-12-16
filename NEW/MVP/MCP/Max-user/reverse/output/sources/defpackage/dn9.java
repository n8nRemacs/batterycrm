package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class dn9 {
    public final mcf a;
    public final lzf b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final bwf f;
    public final pv0 g;
    public final ConcurrentHashMap.KeySetView h;

    public dn9(hbd hbdVar, lzf lzfVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = hbdVar;
        this.b = lzfVar;
        this.c = k18Var;
        this.d = k18Var2;
        this.e = k18Var3;
        bwf bwfVar = new bwf(new qn2(this, 28, k18Var4));
        this.f = bwfVar;
        this.g = gzi.a(32, 0, 6);
        this.h = ConcurrentHashMap.newKeySet();
        svi.e((f84) bwfVar.getValue(), null, null, new cn9(this, null), 3);
    }
}
