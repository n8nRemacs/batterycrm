package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class q9b implements Closeable {
    public final q3b X;
    public final String Y;
    public final Context a;
    public final g4b b;
    public final Object[] c;
    public final bwf d;
    public final qi8 o;

    public q9b(Context context, qi8 qi8Var, q3b q3bVar, g4b g4bVar, k18 k18Var, nxg nxgVar) {
        Object[] objArr = {new m73(q3bVar), new ky9(k18Var)};
        this.a = context;
        this.b = g4bVar;
        this.c = objArr;
        this.d = new bwf(new he4(this, 1));
        this.o = qi8Var;
        this.X = q3bVar;
        this.Y = q9b.class.getName();
        new si8(nxgVar, qi8Var, new sw9(this, null, 2)).a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d.e()) {
            lrd lrdVar = (lrd) this.d.getValue();
            pk6 pk6Var = lrdVar.a;
            prf prfVar = null;
            if (fni.a(pk6Var != null ? Boolean.valueOf(((SQLiteDatabase) pk6Var.b).isOpen()) : null, Boolean.TRUE)) {
                ReentrantReadWriteLock.WriteLock writeLock = lrdVar.i.writeLock();
                writeLock.lock();
                try {
                    lrdVar.e.getClass();
                    prf prfVar2 = lrdVar.d;
                    if (prfVar2 != null) {
                        prfVar = prfVar2;
                    }
                    prfVar.close();
                } finally {
                    writeLock.unlock();
                }
            }
        }
    }

    public final lrd l() {
        return (lrd) this.d.getValue();
    }

    public final wk3 w() {
        return new wk3(5, new tv0(11, this));
    }
}
