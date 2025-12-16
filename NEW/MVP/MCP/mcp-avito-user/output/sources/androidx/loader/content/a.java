package androidx.loader.content;

import android.os.AsyncTask;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import j.P;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* compiled from: AsyncTaskLoader.java */
/* loaded from: classes.dex */
public abstract class a<D> extends c<D> {

    /* renamed from: h, reason: collision with root package name */
    public Executor f46956h;

    /* renamed from: i, reason: collision with root package name */
    public volatile a<D>.RunnableC1806a f46957i;

    /* renamed from: j, reason: collision with root package name */
    public volatile a<D>.RunnableC1806a f46958j;

    /* compiled from: AsyncTaskLoader.java */
    /* renamed from: androidx.loader.content.a$a, reason: collision with other inner class name */
    public final class RunnableC1806a extends ModernAsyncTask<D> implements Runnable {
        public RunnableC1806a() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final D a() {
            try {
                return (D) a.this.i();
            } catch (OperationCanceledException e12) {
                if (this.f46945d.get()) {
                    return null;
                }
                throw e12;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void b(D d12) {
            a aVar = a.this;
            aVar.j(d12);
            if (aVar.f46958j == this) {
                if (aVar.f46968g) {
                    if (aVar.f46964c) {
                        aVar.k();
                    } else {
                        aVar.f46967f = true;
                    }
                }
                SystemClock.uptimeMillis();
                aVar.f46958j = null;
                aVar.h();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public final void c(D d12) {
            a aVar = a.this;
            if (aVar.f46957i == this) {
                if (aVar.f46965d) {
                    aVar.j(d12);
                    return;
                }
                aVar.f46968g = false;
                SystemClock.uptimeMillis();
                aVar.f46957i = null;
                aVar.a(d12);
                return;
            }
            aVar.j(d12);
            if (aVar.f46958j == this) {
                if (aVar.f46968g) {
                    if (aVar.f46964c) {
                        aVar.k();
                    } else {
                        aVar.f46967f = true;
                    }
                }
                SystemClock.uptimeMillis();
                aVar.f46958j = null;
                aVar.h();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.h();
        }
    }

    @Override // androidx.loader.content.c
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.b(str, fileDescriptor, printWriter, strArr);
        if (this.f46957i != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f46957i);
            printWriter.print(" waiting=");
            this.f46957i.getClass();
            printWriter.println(false);
        }
        if (this.f46958j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f46958j);
            printWriter.print(" waiting=");
            this.f46958j.getClass();
            printWriter.println(false);
        }
    }

    @Override // androidx.loader.content.c
    public final boolean c() {
        if (this.f46957i == null) {
            return false;
        }
        boolean z12 = this.f46964c;
        if (!z12) {
            if (z12) {
                k();
            } else {
                this.f46967f = true;
            }
        }
        if (this.f46958j != null) {
            this.f46957i.getClass();
            this.f46957i = null;
            return false;
        }
        this.f46957i.getClass();
        a<D>.RunnableC1806a runnableC1806a = this.f46957i;
        runnableC1806a.f46945d.set(true);
        boolean zCancel = runnableC1806a.f46943b.cancel(false);
        if (zCancel) {
            this.f46958j = this.f46957i;
            g();
        }
        this.f46957i = null;
        return zCancel;
    }

    public final void h() {
        if (this.f46958j != null || this.f46957i == null) {
            return;
        }
        this.f46957i.getClass();
        if (this.f46956h == null) {
            this.f46956h = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        a<D>.RunnableC1806a runnableC1806a = this.f46957i;
        Executor executor = this.f46956h;
        if (runnableC1806a.f46944c == ModernAsyncTask.Status.f46947b) {
            runnableC1806a.f46944c = ModernAsyncTask.Status.f46948c;
            executor.execute(runnableC1806a.f46943b);
            return;
        }
        int iOrdinal = runnableC1806a.f46944c.ordinal();
        if (iOrdinal == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iOrdinal == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    @P
    public abstract D i();

    public final void k() {
        c();
        this.f46957i = new RunnableC1806a();
        h();
    }

    public void g() {
    }

    public void j(@P D d12) {
    }
}
