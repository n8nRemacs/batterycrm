package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class p86 {
    public final String a;
    public final ch2 b;
    public final va4 c;
    public final tcf d;
    public final d53 e;
    public final ContextScope f;
    public final AtomicInteger g;
    public final tcf h;
    public final String i;

    public p86(String str, ch2 ch2Var, va4 va4Var, tw0 tw0Var, z74 z74Var) {
        this.a = str;
        this.b = ch2Var;
        this.c = va4Var;
        tcf tcfVarA = ucf.a(null);
        this.d = tcfVarA;
        this.e = new d53(new hbd(tcfVarA), 12);
        ContextScope contextScopeA = d7j.a(z74Var);
        this.f = contextScopeA;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.g = atomicInteger;
        tcf tcfVarA2 = ucf.a(Integer.valueOf(atomicInteger.get()));
        this.h = tcfVarA2;
        this.i = wy1.h("FolderCountersDataSource-", str);
        tw0Var.d(this);
        ka4 ka4Var = new ka4(new x26[]{va4Var.v0, tcfVarA2}, 2);
        int i = s65.d;
        gw0.w(new g56(zs0.g(ka4Var, v9j.h(1000, y65.MILLISECONDS)), new k86(this, null), 1), contextScopeA);
    }

    public static final void a(p86 p86Var) {
        p86Var.h.m(null, Integer.valueOf(p86Var.g.incrementAndGet()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.p86 r11, defpackage.q44 r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p86.b(p86, q44):java.lang.Object");
    }

    @vnf
    public final void onEvent(n73 n73Var) {
        svi.e(this.f, null, null, new l86(this, n73Var, null), 3);
    }

    @vnf
    public final void onEvent(gj7 gj7Var) {
        svi.e(this.f, null, null, new m86(this, gj7Var, null), 3);
    }

    @vnf
    public final void onEvent(ph8 ph8Var) {
        svi.e(this.f, null, null, new n86(ph8Var, this, null), 3);
    }
}
