package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class pfe implements iv4 {
    public final PmsKey a;
    public final long b;
    public final String[] c;
    public final s5g d;
    public final k18 e;
    public final k18 f;
    public final long g;
    public final tcf h;
    public final hbd i;

    public pfe(PmsKey pmsKey, long j, String[] strArr, r5g r5gVar, int i) {
        strArr = (i & 8) != 0 ? new String[0] : strArr;
        r5gVar = (i & 16) != 0 ? new r5g(pmsKey.name()) : r5gVar;
        this.a = pmsKey;
        this.b = j;
        this.c = strArr;
        this.d = r5gVar;
        sv4 sv4Var = sv4.a;
        this.e = sv4Var.getAccessor().d(66);
        this.f = sv4Var.getAccessor().d(64);
        this.g = pu4.b.incrementAndGet();
        tcf tcfVarA = ucf.a(e());
        this.h = tcfVarA;
        this.i = new hbd(tcfVarA);
    }

    @Override // defpackage.iv4
    public final mcf b() {
        return this.i;
    }

    @Override // defpackage.iv4
    public final void c(yg4 yg4Var, Object obj) throws NumberFormatException {
        long j = Long.parseLong(obj.toString());
        if (pu4.a(yg4Var.a, this.g)) {
            ((f5e) this.e.getValue()).h(j, this.a.name());
            this.h.m(null, e());
        }
    }

    public final List e() {
        l5c l5cVar = (l5c) this.f.getValue();
        PmsKey pmsKey = this.a;
        return Collections.singletonList(new yg4(this.g, this.d, 0, new r5g(a9h.e("Server=", l5cVar.g.getLong(pmsKey.name(), this.b), "\nPMS: ", pmsKey.name())), wg4.a));
    }
}
