package defpackage;

import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class keg {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public final qeg a;
    public final osf b;
    public final ukd c;
    public final vd d;
    public final u5i e;
    public volatile boolean f;
    public final Object g;
    public final AtomicInteger h;

    public keg(qeg qegVar) {
        Object objPutIfAbsent;
        osf osfVar = new osf();
        this.a = qegVar;
        this.b = osfVar;
        this.c = new ukd(22);
        vd vdVar = qegVar.k;
        this.d = vdVar;
        u5i u5iVar = new u5i();
        u5iVar.a = qegVar;
        u5iVar.b = qegVar.i;
        mc5 mc5Var = new mc5(10, false);
        mc5Var.b = vdVar;
        u5iVar.c = new iv6(mc5Var);
        this.e = u5iVar;
        this.g = ipi.b(2, new m2(13, this));
        String str = qegVar.a;
        ConcurrentHashMap concurrentHashMap = i;
        Object atomicInteger = concurrentHashMap.get(str);
        if (atomicInteger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger = new AtomicInteger()))) != null) {
            atomicInteger = objPutIfAbsent;
        }
        this.h = (AtomicInteger) atomicInteger;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    public final void a(String str, Throwable th) {
        if (this.f) {
            Log.d("Tracer", "Tracer is disabled");
            return;
        }
        if (((Boolean) this.g.getValue()).booleanValue()) {
            if (this.d.o()) {
                Log.e("Tracer", "Feature CRASH_REPORT limited");
                return;
            }
            int iIncrementAndGet = this.h.incrementAndGet();
            if (iIncrementAndGet <= 8) {
                ((Executor) this.a.j.b).execute(new zcd(this, th, str, 12));
                return;
            }
            Log.d("Tracer", "Can't handle non fatal exception. Max non fatal count is reached for this session.");
            if (iIncrementAndGet - 8 == 1) {
                ((Executor) this.a.j.b).execute(new bee(23, this));
            }
        }
    }
}
