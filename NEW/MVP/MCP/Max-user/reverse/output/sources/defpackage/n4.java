package defpackage;

import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class n4 {
    public o4[] a;
    public int b;
    public int c;
    public eof d;

    public final o4 f() {
        o4 o4VarJ;
        eof eofVar;
        synchronized (this) {
            try {
                o4[] o4VarArrK = this.a;
                if (o4VarArrK == null) {
                    o4VarArrK = k();
                    this.a = o4VarArrK;
                } else if (this.b >= o4VarArrK.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(o4VarArrK, o4VarArrK.length * 2);
                    this.a = (o4[]) objArrCopyOf;
                    o4VarArrK = (o4[]) objArrCopyOf;
                }
                int i = this.c;
                do {
                    o4VarJ = o4VarArrK[i];
                    if (o4VarJ == null) {
                        o4VarJ = j();
                        o4VarArrK[i] = o4VarJ;
                    }
                    i++;
                    if (i >= o4VarArrK.length) {
                        i = 0;
                    }
                } while (!o4VarJ.a(this));
                this.c = i;
                this.b++;
                eofVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (eofVar != null) {
            eofVar.z(1);
        }
        return o4VarJ;
    }

    public final mcf i() {
        eof eofVar;
        synchronized (this) {
            eofVar = this.d;
            if (eofVar == null) {
                int i = this.b;
                eofVar = new eof(1, Integer.MAX_VALUE, 2);
                eofVar.h(Integer.valueOf(i));
                this.d = eofVar;
            }
        }
        return eofVar;
    }

    public abstract o4 j();

    public abstract o4[] k();

    public final void l(o4 o4Var) {
        eof eofVar;
        int i;
        Continuation[] continuationArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                eofVar = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                continuationArrB = o4Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrB) {
            if (continuation != null) {
                continuation.resumeWith(qqg.a);
            }
        }
        if (eofVar != null) {
            eofVar.z(-1);
        }
    }
}
