package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class eia extends gia {
    public static final /* synthetic */ yy7[] i;
    public final n8a e;
    public final ReentrantLock f;
    public final t9f g;
    public long h;

    static {
        z8a z8aVar = new z8a(eia.class, "job", "getJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        i = new yy7[]{z8aVar};
    }

    public eia(f84 f84Var, k18 k18Var) {
        super(f84Var, k18Var);
        this.e = new n8a((Object) null);
        this.f = new ReentrantLock();
        this.g = c7j.c();
        int i2 = s65.d;
        this.h = 0L;
        a();
        this.c = svi.e(f84Var, null, null, new dia(this, null), 3);
    }

    public final void d() {
        n8a n8aVar = this.e;
        if (e()) {
            ReentrantLock reentrantLock = this.f;
            reentrantLock.lock();
            try {
                int i2 = n8aVar.d;
                l5c l5cVar = ((z7c) this.b.getValue()).b;
                l5cVar.getClass();
                if (i2 < ((int) l5cVar.m(PmsKey.f114noncontactmaxchunksize, 10))) {
                    return;
                }
                int i3 = s65.d;
                long jI = v9j.i(System.nanoTime(), y65.NANOSECONDS);
                if (s65.d(s65.k(jI, this.h), b()) <= 0) {
                    return;
                }
                this.h = jI;
                n8a n8aVarA = dsi.a(n8aVar);
                n8aVar.c();
                this.g.O(this, i[0], svi.e(this.a, null, i84.b, new cia(this, n8aVarA, null), 1));
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean e() {
        if (s65.d(b(), 0L) <= 0) {
            return false;
        }
        l5c l5cVar = ((z7c) this.b.getValue()).b;
        l5cVar.getClass();
        return ((int) l5cVar.m(PmsKey.f114noncontactmaxchunksize, (long) 10)) > 0;
    }
}
