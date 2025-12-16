package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class efe implements iv4 {
    public final r5g a;
    public final PmsKey b;
    public final boolean c;
    public final k18 d;
    public final k18 e;
    public final long f;
    public final tcf g;
    public final hbd h;

    public efe(r5g r5gVar, PmsKey pmsKey, boolean z) {
        this.a = r5gVar;
        this.b = pmsKey;
        this.c = z;
        sv4 sv4Var = sv4.a;
        this.d = sv4Var.getAccessor().d(66);
        this.e = sv4Var.getAccessor().d(64);
        this.f = pu4.b.incrementAndGet();
        tcf tcfVarA = ucf.a(e());
        this.g = tcfVarA;
        this.h = new hbd(tcfVarA);
    }

    @Override // defpackage.iv4
    public final mcf b() {
        return this.h;
    }

    @Override // defpackage.iv4
    public final void d(yg4 yg4Var) {
        if (pu4.a(yg4Var.a, this.f)) {
            k18 k18Var = this.d;
            f5e f5eVar = (f5e) k18Var.getValue();
            boolean z = this.c;
            PmsKey pmsKey = this.b;
            boolean zJ = f5eVar.j(pmsKey, z);
            f5e f5eVar2 = (f5e) k18Var.getValue();
            f5eVar2.getClass();
            f5eVar2.f(pmsKey.name(), !zJ);
            this.g.m(null, e());
        }
    }

    public final List e() {
        f5e f5eVar = (f5e) this.d.getValue();
        PmsKey pmsKey = this.b;
        boolean z = this.c;
        return Collections.singletonList(new yg4(this.f, this.a, 0, new r5g("Server: " + ((l5c) this.e.getValue()).g.getBoolean(pmsKey.name(), z) + "\nPMS: " + pmsKey.name()), new xg4(f5eVar.j(pmsKey, z))));
    }

    public efe(PmsKey pmsKey) {
        this(new r5g(pmsKey.name()), pmsKey, false);
    }

    public efe(String str, PmsKey pmsKey, boolean z) {
        this(new r5g(str), pmsKey, z);
    }
}
