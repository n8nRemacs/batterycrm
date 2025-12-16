package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class of8 implements mf8 {
    public static final /* synthetic */ int Y = 0;
    public final rl X;
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Context d;
    public final rl o;

    public of8(final k18 k18Var, final k18 k18Var2, Context context) {
        this.d = context;
        Objects.requireNonNull(k18Var);
        final int i = 0;
        this.o = new rl(5, new frf() { // from class: nf8
            @Override // defpackage.frf
            public final Object get() {
                switch (i) {
                    case 0:
                        return (cw6) k18Var.getValue();
                    default:
                        return (ew6) k18Var.getValue();
                }
            }
        });
        Objects.requireNonNull(k18Var2);
        final int i2 = 1;
        this.X = new rl(5, new frf() { // from class: nf8
            @Override // defpackage.frf
            public final Object get() {
                switch (i2) {
                    case 0:
                        return (cw6) k18Var2.getValue();
                    default:
                        return (ew6) k18Var2.getValue();
                }
            }
        });
    }

    @Override // defpackage.mf8
    public final void E() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((mf8) it.next()).E();
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((mf8) it2.next()).E();
        }
        Iterator it3 = this.c.iterator();
        while (it3.hasNext()) {
            ((mf8) it3.next()).E();
        }
    }

    @Override // defpackage.mf8
    public final void P(cf8 cf8Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((mf8) it.next()).P(cf8Var);
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((mf8) it2.next()).P(cf8Var);
        }
        Iterator it3 = this.c.iterator();
        while (it3.hasNext()) {
            ((mf8) it3.next()).P(cf8Var);
        }
    }

    public final void a(mf8 mf8Var) {
        if (!lfi.b(this.d, lfi.b)) {
            wqi.c("of8", "start: no permissions", new Object[0]);
            mf8Var.E();
            return;
        }
        cw6 cw6Var = (cw6) this.o.get();
        h08 h08Var = new h08(22, mf8Var);
        bci bciVar = cw6Var.a;
        bciVar.getClass();
        rs0 rs0VarE = mg7.e();
        rs0VarE.d = qof.a;
        rs0VarE.b = 2414;
        ybj ybjVarB = bciVar.b(0, rs0VarE.e());
        ybjVarB.i(new bw6(h08Var));
        ybjVarB.j(new bw6(h08Var));
    }

    public final void b(mf8 mf8Var) {
        synchronized (this.c) {
            try {
                this.c.remove(mf8Var);
                if (this.c.isEmpty()) {
                    wqi.c("of8", "stopHighAccuracyUpdates", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
