package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.InterfaceC22791e;
import j.N;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
class o {

    /* compiled from: RequestExecutor.java */
    public static class a implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        public String f44848b;

        /* renamed from: c, reason: collision with root package name */
        public int f44849c;

        /* compiled from: RequestExecutor.java */
        /* renamed from: androidx.core.provider.o$a$a, reason: collision with other inner class name */
        public static class C1740a extends Thread {

            /* renamed from: b, reason: collision with root package name */
            public final int f44850b;

            public C1740a(Runnable runnable, String str, int i12) {
                super(runnable, str);
                this.f44850b = i12;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f44850b);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new C1740a(runnable, this.f44848b, this.f44849c);
        }
    }

    /* compiled from: RequestExecutor.java */
    public static class b implements Executor {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f44851b;

        public b(@N Handler handler) {
            this.f44851b = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@N Runnable runnable) {
            runnable.getClass();
            Handler handler = this.f44851b;
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    /* compiled from: RequestExecutor.java */
    public static class c<T> implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @N
        public Callable<T> f44852b;

        /* renamed from: c, reason: collision with root package name */
        @N
        public InterfaceC22791e<T> f44853c;

        /* renamed from: d, reason: collision with root package name */
        @N
        public Handler f44854d;

        /* compiled from: RequestExecutor.java */
        public class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22791e f44855b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f44856c;

            public a(InterfaceC22791e interfaceC22791e, Object obj) {
                this.f44855b = interfaceC22791e;
                this.f44856c = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                this.f44855b.accept(this.f44856c);
            }
        }

        public c() {
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object objCall;
            try {
                objCall = ((k) this.f44852b).call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f44854d.post(new a(this.f44853c, objCall));
        }
    }
}
