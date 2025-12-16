package androidx.concurrent.futures;

import androidx.appcompat.app.r;
import androidx.concurrent.futures.a;
import com.google.common.util.concurrent.D0;
import j.N;
import j.P;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: CallbackToFutureAdapter.java */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public Object f43159a;

        /* renamed from: b, reason: collision with root package name */
        public d<T> f43160b;

        /* renamed from: c, reason: collision with root package name */
        public e<Void> f43161c = new e<>();

        /* renamed from: d, reason: collision with root package name */
        public boolean f43162d;

        public final void a(@N Runnable runnable, @N Executor executor) {
            e<Void> eVar = this.f43161c;
            if (eVar != null) {
                eVar.N(runnable, executor);
            }
        }

        public final boolean b(T t12) {
            this.f43162d = true;
            d<T> dVar = this.f43160b;
            boolean z12 = dVar != null && dVar.f43164c.j(t12);
            if (z12) {
                this.f43159a = null;
                this.f43160b = null;
                this.f43161c = null;
            }
            return z12;
        }

        public final void c() {
            this.f43162d = true;
            d<T> dVar = this.f43160b;
            if (dVar == null || !dVar.f43164c.cancel(true)) {
                return;
            }
            this.f43159a = null;
            this.f43160b = null;
            this.f43161c = null;
        }

        public final boolean d(@N Throwable th2) {
            this.f43162d = true;
            d<T> dVar = this.f43160b;
            boolean z12 = dVar != null && dVar.f43164c.k(th2);
            if (z12) {
                this.f43159a = null;
                this.f43160b = null;
                this.f43161c = null;
            }
            return z12;
        }

        public final void finalize() {
            e<Void> eVar;
            d<T> dVar = this.f43160b;
            if (dVar != null) {
                androidx.concurrent.futures.a<T> aVar = dVar.f43164c;
                if (!aVar.isDone()) {
                    aVar.k(new C1699b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f43159a));
                }
            }
            if (this.f43162d || (eVar = this.f43161c) == null) {
                return;
            }
            eVar.j(null);
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* renamed from: androidx.concurrent.futures.b$b, reason: collision with other inner class name */
    public static final class C1699b extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    public interface c<T> {
        @P
        Object d(@N a<T> aVar);
    }

    /* compiled from: CallbackToFutureAdapter.java */
    public static final class d<T> implements D0<T> {

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<a<T>> f43163b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.concurrent.futures.a<T> f43164c = new a();

        /* compiled from: CallbackToFutureAdapter.java */
        public class a extends androidx.concurrent.futures.a<T> {
            public a() {
            }

            @Override // androidx.concurrent.futures.a
            public final String h() {
                a<T> aVar = d.this.f43163b.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return r.o(aVar.f43159a, "]", new StringBuilder("tag=["));
            }
        }

        public d(a<T> aVar) {
            this.f43163b = new WeakReference<>(aVar);
        }

        @Override // com.google.common.util.concurrent.D0
        public final void N(@N Runnable runnable, @N Executor executor) {
            this.f43164c.N(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z12) {
            a<T> aVar = this.f43163b.get();
            boolean zCancel = this.f43164c.cancel(z12);
            if (zCancel && aVar != null) {
                aVar.f43159a = null;
                aVar.f43160b = null;
                aVar.f43161c.j(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() {
            return this.f43164c.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f43164c.f43139b instanceof a.c;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f43164c.isDone();
        }

        public final String toString() {
            return this.f43164c.toString();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j12, @N TimeUnit timeUnit) {
            return this.f43164c.get(j12, timeUnit);
        }
    }

    @N
    public static <T> D0<T> a(@N c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f43160b = dVar;
        aVar.f43159a = cVar.getClass();
        try {
            Object objD = cVar.d(aVar);
            if (objD != null) {
                aVar.f43159a = objD;
            }
        } catch (Exception e12) {
            dVar.f43164c.k(e12);
        }
        return dVar;
    }
}
