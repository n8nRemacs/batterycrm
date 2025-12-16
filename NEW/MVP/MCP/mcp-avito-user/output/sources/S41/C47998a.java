package s41;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import io.reactivex.rxjava3.internal.util.h;
import j41.e;
import j41.f;
import java.util.Objects;
import l41.g;
import l41.s;

/* compiled from: RxJavaPlugins.java */
/* renamed from: s41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47998a {

    /* renamed from: a, reason: collision with root package name */
    @f
    public static volatile g<? super Throwable> f437472a;

    public C47998a() {
        throw new IllegalStateException("No instances!");
    }

    @e
    public static H a(@e s<H> sVar) {
        try {
            H h12 = sVar.get();
            Objects.requireNonNull(h12, "Scheduler Supplier result can't be null");
            return h12;
        } catch (Throwable th2) {
            throw h.f(th2);
        }
    }

    public static void b(@e Throwable th2) {
        g<? super Throwable> gVar = f437472a;
        if (th2 == null) {
            th2 = h.b("onError called with a null Throwable.");
        } else if (!(th2 instanceof OnErrorNotImplementedException) && !(th2 instanceof MissingBackpressureException) && !(th2 instanceof IllegalStateException) && !(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof CompositeException)) {
            th2 = new UndeliverableException(th2);
        }
        if (gVar != null) {
            try {
                gVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th3);
            }
        }
        th2.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }
}
