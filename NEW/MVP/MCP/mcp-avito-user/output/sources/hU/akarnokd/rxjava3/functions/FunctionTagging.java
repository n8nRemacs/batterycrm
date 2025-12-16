package hu.akarnokd.rxjava3.functions;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.HashSet;
import s41.C47998a;

/* loaded from: classes8.dex */
public final class FunctionTagging {

    public static final class FunctionTaggingException extends RuntimeException {
        private static final long serialVersionUID = -8382312975142579020L;

        public final void a(Throwable th2) {
            HashSet hashSet = new HashSet();
            Throwable cause = th2;
            while (cause.getCause() != null) {
                if (!hashSet.add(cause)) {
                    C47998a.b(new CompositeException(th2, this));
                    return;
                }
                cause = cause.getCause();
            }
            try {
                cause.initCause(this);
            } catch (Throwable unused) {
                C47998a.b(new CompositeException(th2, this));
            }
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static final class a<T1, T2, R> implements l41.c<T1, T2, R> {
        @Override // l41.c
        public final R apply(T1 t12, T2 t22) throws Exception {
            if (t12 == null) {
                throw new NullPointerException("t1 is null, tag = null");
            }
            if (t22 == null) {
                throw new NullPointerException("t2 is null, tag = null");
            }
            try {
                throw null;
            } catch (Throwable th2) {
                new FunctionTaggingException(null).a(th2);
                throw FunctionTagging.a(th2);
            }
        }
    }

    public static final class b<T1, T2, T3, R> implements l41.h<T1, T2, T3, R> {
        @Override // l41.h
        public final R a(T1 t12, T2 t22, T3 t32) throws Exception {
            if (t12 == null) {
                throw new NullPointerException("t1 is null, tag = null");
            }
            if (t22 == null) {
                throw new NullPointerException("t2 is null, tag = null");
            }
            if (t32 == null) {
                throw new NullPointerException("t3 is null, tag = null");
            }
            try {
                throw null;
            } catch (Throwable th2) {
                new FunctionTaggingException(null).a(th2);
                throw FunctionTagging.a(th2);
            }
        }
    }

    public static final class c<T1, T2, T3, T4, R> implements l41.i<T1, T2, T3, T4, R> {
        @Override // l41.i
        public final R a(T1 t12, T2 t22, T3 t32, T4 t42) throws Exception {
            if (t12 == null) {
                throw new NullPointerException("t1 is null, tag = null");
            }
            if (t22 == null) {
                throw new NullPointerException("t2 is null, tag = null");
            }
            if (t32 == null) {
                throw new NullPointerException("t3 is null, tag = null");
            }
            if (t42 == null) {
                throw new NullPointerException("t4 is null, tag = null");
            }
            try {
                throw null;
            } catch (Throwable th2) {
                new FunctionTaggingException(null).a(th2);
                throw FunctionTagging.a(th2);
            }
        }
    }

    public static final class d<T1, T2, T3, T4, T5, R> implements l41.j<T1, T2, T3, T4, T5, R> {
        @Override // l41.j
        public final R a(T1 t12, T2 t22, T3 t32, T4 t42, T5 t52) throws Exception {
            if (t12 == null) {
                throw new NullPointerException("t1 is null, tag = null");
            }
            if (t22 == null) {
                throw new NullPointerException("t2 is null, tag = null");
            }
            if (t32 == null) {
                throw new NullPointerException("t3 is null, tag = null");
            }
            if (t42 == null) {
                throw new NullPointerException("t4 is null, tag = null");
            }
            if (t52 == null) {
                throw new NullPointerException("t5 is null, tag = null");
            }
            try {
                throw null;
            } catch (Throwable th2) {
                new FunctionTaggingException(null).a(th2);
                throw FunctionTagging.a(th2);
            }
        }
    }

    public static final class e<T1, T2, T3, T4, T5, T6, R> implements l41.k<T1, T2, T3, T4, T5, T6, R> {
    }

    public static final class f<T1, T2, T3, T4, T5, T6, T7, R> implements l41.l<T1, T2, T3, T4, T5, T6, T7, R> {
    }

    public static final class g<T1, T2, T3, T4, T5, T6, T7, T8, R> implements l41.m<T1, T2, T3, T4, T5, T6, T7, T8, R> {
    }

    public static final class h<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements l41.n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> {
    }

    public static final class i<T, R> implements l41.o<T, R> {
        @Override // l41.o
        public final R apply(T t12) throws Exception {
            if (t12 == null) {
                throw new NullPointerException("t is null, tag = null");
            }
            try {
                throw null;
            } catch (Throwable th2) {
                new FunctionTaggingException(null).a(th2);
                throw FunctionTagging.a(th2);
            }
        }
    }

    public FunctionTagging() {
        throw new IllegalStateException("No instances!");
    }

    public static <E extends Throwable> Exception a(Throwable th2) throws Throwable {
        if (th2 instanceof Exception) {
            return (Exception) th2;
        }
        throw th2;
    }
}
