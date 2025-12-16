package defpackage;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class sca {
    public final w7b a;
    public final no4 b;
    public final ExecutorService c;
    public final String d;
    public volatile boolean e;
    public final AtomicReference f = new AtomicReference(new ArrayList());
    public volatile Future g;

    public sca(w7b w7bVar, no4 no4Var, ExecutorService executorService, String str, boolean z) {
        this.a = w7bVar;
        this.b = no4Var;
        this.c = executorService;
        this.d = str;
        this.e = z;
    }

    public final void a(tca tcaVar) {
        AtomicReference atomicReference;
        boolean z = false;
        loop0: while (true) {
            atomicReference = this.f;
            ArrayList arrayList = (ArrayList) atomicReference.get();
            ArrayList arrayList2 = new ArrayList(arrayList);
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else if (weakReference.get() == tcaVar) {
                    z = true;
                    break;
                }
            }
            while (!atomicReference.compareAndSet(arrayList, arrayList2)) {
                if (atomicReference.get() != arrayList) {
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        while (true) {
            ArrayList arrayList3 = (ArrayList) atomicReference.get();
            ArrayList arrayList4 = new ArrayList(arrayList3);
            arrayList4.add(new WeakReference(tcaVar));
            while (!atomicReference.compareAndSet(arrayList3, arrayList4)) {
                if (atomicReference.get() != arrayList3) {
                    break;
                }
            }
            return;
        }
    }

    public final void b(wca wcaVar, tca tcaVar) {
        if (wcaVar != null) {
            try {
                if (wcaVar.b.exists() && wcaVar.b.canRead()) {
                    tcaVar.onFinished(this.d, wcaVar.b, wcaVar.a);
                    return;
                }
            } catch (Throwable th) {
                if (th instanceof ExecutionException) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        tcaVar.onFailed(cause);
                    }
                } else {
                    tcaVar.onFailed(th);
                }
                if (this.e) {
                    a(tcaVar);
                    d();
                    return;
                }
                return;
            }
        }
        if (this.e) {
            a(tcaVar);
            d();
        }
    }

    public final void c(File file, String str) {
        for (WeakReference weakReference : (Iterable) this.f.get()) {
            tca tcaVar = (tca) weakReference.get();
            if (tcaVar != null) {
                tcaVar.onFinished(this.d, file, str);
            }
            weakReference.clear();
        }
    }

    public final void d() {
        Future future = this.g;
        if (future == null || future.isDone()) {
            this.g = this.c.submit(new tv0(8, this));
        }
    }

    public final void e(tca tcaVar) {
        Future future;
        if (this.g == null || !((future = this.g) == null || future.isDone())) {
            a(tcaVar);
        } else {
            this.c.execute(new k79(this, 11, tcaVar));
        }
    }
}
