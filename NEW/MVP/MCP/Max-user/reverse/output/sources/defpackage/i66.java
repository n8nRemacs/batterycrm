package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class i66 implements mqc {
    public static final int a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public static i66 a(Object... objArr) {
        if (objArr.length == 0) {
            return q66.b;
        }
        if (objArr.length != 1) {
            return new r66(1, objArr);
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj, "item is null");
        return new a76(obj);
    }

    public final void c(q76 q76Var) {
        Objects.requireNonNull(q76Var, "subscriber is null");
        try {
            g(q76Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            raj.c(th);
            t8j.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final void e(aof aofVar) {
        if (aofVar instanceof q76) {
            c((q76) aofVar);
        } else {
            Objects.requireNonNull(aofVar, "subscriber is null");
            c(new kmf(aofVar));
        }
    }

    public abstract void g(q76 q76Var);
}
