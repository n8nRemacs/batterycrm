package io.reactivex.rxjava3.internal.util;

import androidx.compose.foundation.H;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ExceptionHelper.java */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Throwable f404834a = new a();

    public h() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean a(AtomicReference<Throwable> atomicReference, Throwable th2) {
        while (true) {
            Throwable th3 = atomicReference.get();
            if (th3 == f404834a) {
                return false;
            }
            Throwable compositeException = th3 == null ? th2 : new CompositeException(th3, th2);
            while (!atomicReference.compareAndSet(th3, compositeException)) {
                if (atomicReference.get() != th3) {
                    break;
                }
            }
            return true;
        }
    }

    public static NullPointerException b(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw b(str);
        }
    }

    public static Throwable d(AtomicReference<Throwable> atomicReference) {
        Throwable th2 = atomicReference.get();
        Throwable th3 = f404834a;
        return th2 != th3 ? atomicReference.getAndSet(th3) : th2;
    }

    public static String e(long j12, TimeUnit timeUnit) {
        StringBuilder sbQ = H.q(j12, "The source did not signal an event for ", " ");
        sbQ.append(timeUnit.toString().toLowerCase());
        sbQ.append(" and has been terminated.");
        return sbQ.toString();
    }

    public static RuntimeException f(Throwable th2) {
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        return th2 instanceof RuntimeException ? (RuntimeException) th2 : new RuntimeException(th2);
    }

    /* compiled from: ExceptionHelper.java */
    public static final class a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }
}
