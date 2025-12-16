package bolts;

import bolts.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: Task.java */
/* loaded from: classes10.dex */
public class x<TResult> {

    /* renamed from: g, reason: collision with root package name */
    public static final ExecutorService f57476g;

    /* renamed from: h, reason: collision with root package name */
    public static final Executor f57477h;

    /* renamed from: i, reason: collision with root package name */
    public static final Executor f57478i;

    /* renamed from: j, reason: collision with root package name */
    public static final x<?> f57479j;

    /* renamed from: k, reason: collision with root package name */
    public static final x<Boolean> f57480k;

    /* renamed from: l, reason: collision with root package name */
    public static final x<Boolean> f57481l;

    /* renamed from: m, reason: collision with root package name */
    public static final x<?> f57482m;

    /* renamed from: b, reason: collision with root package name */
    public boolean f57484b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f57485c;

    /* renamed from: d, reason: collision with root package name */
    public TResult f57486d;

    /* renamed from: e, reason: collision with root package name */
    public Exception f57487e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f57483a = new Object();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f57488f = new ArrayList();

    /* compiled from: Task.java */
    public class a extends y<TResult> {
    }

    /* compiled from: Task.java */
    public interface b {
    }

    static {
        bolts.b bVar = bolts.b.f57455d;
        f57476g = bVar.f57456a;
        f57477h = bVar.f57458c;
        f57478i = bolts.a.f57451b.f57454a;
        f57479j = new x<>((Boolean) null);
        f57480k = new x<>(Boolean.TRUE);
        f57481l = new x<>(Boolean.FALSE);
        f57482m = new x<>(0);
    }

    public x() {
    }

    public static <TResult> x<TResult> a(Callable<TResult> callable, Executor executor) {
        y yVar = new y();
        try {
            executor.execute(new r(yVar, callable));
        } catch (Exception e12) {
            yVar.b(new ExecutorException(e12));
        }
        return yVar.f57489a;
    }

    public static <TResult> x<TResult> c(Exception exc) {
        y yVar = new y();
        yVar.b(exc);
        return yVar.f57489a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> x<TResult> d(TResult tresult) {
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (x<TResult>) f57480k : (x<TResult>) f57481l;
        }
        y yVar = new y();
        yVar.c(tresult);
        return yVar.f57489a;
    }

    public final <TContinuationResult> x<TContinuationResult> b(h<TResult, TContinuationResult> hVar) {
        boolean z12;
        Executor executor = f57477h;
        y yVar = new y();
        synchronized (this.f57483a) {
            try {
                synchronized (this.f57483a) {
                    z12 = this.f57484b;
                }
                if (!z12) {
                    this.f57488f.add(new i(yVar, hVar, executor));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z12) {
            try {
                ((b.ExecutorC2017b) executor).execute(new m(yVar, hVar, this));
            } catch (Exception e12) {
                yVar.b(new ExecutorException(e12));
            }
        }
        return yVar.f57489a;
    }

    public final Exception e() {
        Exception exc;
        synchronized (this.f57483a) {
            exc = this.f57487e;
        }
        return exc;
    }

    public final TResult f() {
        TResult tresult;
        synchronized (this.f57483a) {
            tresult = this.f57486d;
        }
        return tresult;
    }

    public final boolean g() {
        boolean z12;
        synchronized (this.f57483a) {
            z12 = this.f57485c;
        }
        return z12;
    }

    public final boolean h() {
        boolean z12;
        synchronized (this.f57483a) {
            z12 = e() != null;
        }
        return z12;
    }

    public final void i() {
        synchronized (this.f57483a) {
            Iterator it = this.f57488f.iterator();
            while (it.hasNext()) {
                try {
                    ((h) it.next()).a(this);
                } catch (RuntimeException e12) {
                    throw e12;
                } catch (Exception e13) {
                    throw new RuntimeException(e13);
                }
            }
            this.f57488f = null;
        }
    }

    public final boolean j() {
        synchronized (this.f57483a) {
            try {
                if (this.f57484b) {
                    return false;
                }
                this.f57484b = true;
                this.f57485c = true;
                this.f57483a.notifyAll();
                i();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k(TResult tresult) {
        synchronized (this.f57483a) {
            try {
                if (this.f57484b) {
                    return false;
                }
                this.f57484b = true;
                this.f57486d = tresult;
                this.f57483a.notifyAll();
                i();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(Boolean bool) {
        k(bool);
    }

    public x(int i12) {
        j();
    }
}
