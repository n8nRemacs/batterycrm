package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class dfe implements iv4, SharedPreferences.OnSharedPreferenceChangeListener {
    public final pb3 a;
    public final k18 b;
    public final long c;
    public final long d;
    public final tcf e;
    public final hbd f;

    /* JADX WARN: Multi-variable type inference failed */
    public dfe(k18 k18Var, pb3 pb3Var) {
        this.a = pb3Var;
        this.b = k18Var;
        AtomicLong atomicLong = pu4.b;
        this.c = atomicLong.incrementAndGet();
        this.d = atomicLong.incrementAndGet();
        tcf tcfVarA = ucf.a(e());
        this.e = tcfVarA;
        this.f = new hbd(tcfVarA);
        c4 c4Var = pb3Var instanceof c4 ? (c4) pb3Var : null;
        if (c4Var != null) {
            c4Var.g.registerOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // defpackage.iv4
    public final void a() {
        Object obj = this.a;
        c4 c4Var = obj instanceof c4 ? (c4) obj : null;
        if (c4Var != null) {
            c4Var.g.unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // defpackage.iv4
    public final mcf b() {
        return this.f;
    }

    @Override // defpackage.iv4
    public final void d(yg4 yg4Var) {
        long j = yg4Var.a;
        boolean zA = pu4.a(j, this.c);
        k18 k18Var = this.b;
        if (zA) {
            ii4 ii4Var = (ii4) k18Var.getValue();
            tu4.b.getClass();
            ii4Var.b(oi4.a(tu4.h.a), null);
        } else if (pu4.a(j, this.d)) {
            ii4 ii4Var2 = (ii4) k18Var.getValue();
            tu4.b.getClass();
            ii4Var2.b(oi4.a(tu4.i.a), null);
        }
    }

    public final List e() {
        pe8 pe8Var = (pe8) this.a;
        String strI = pe8Var.I();
        if (strI == null) {
            strI = "";
        }
        yg4 yg4Var = new yg4(this.c, new r5g(strI), 0, new r5g("Адрес сервера"), null, 20);
        String strJ = pe8Var.J();
        return ve3.j(yg4Var, new yg4(this.d, new r5g(strJ != null ? strJ : ""), 0, new r5g("Порт сервера"), null, 20));
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.e.m(null, e());
    }
}
