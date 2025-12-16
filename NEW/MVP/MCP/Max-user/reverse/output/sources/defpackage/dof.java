package defpackage;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public class dof extends AtomicInteger implements cof {
    public volatile boolean X;
    public boolean Y;
    public cof a;
    public long b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong d = new AtomicLong();
    public final AtomicLong o = new AtomicLong();

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        c();
    }

    public final void c() {
        int iAddAndGet = 1;
        long jB = 0;
        cof cofVar = null;
        do {
            cof cofVar2 = (cof) this.c.get();
            if (cofVar2 != null) {
                cofVar2 = (cof) this.c.getAndSet(null);
            }
            long andSet = this.d.get();
            if (andSet != 0) {
                andSet = this.d.getAndSet(0L);
            }
            long andSet2 = this.o.get();
            if (andSet2 != 0) {
                andSet2 = this.o.getAndSet(0L);
            }
            cof cofVar3 = this.a;
            if (this.X) {
                if (cofVar3 != null) {
                    cofVar3.cancel();
                    this.a = null;
                }
                if (cofVar2 != null) {
                    cofVar2.cancel();
                }
            } else {
                long jB2 = this.b;
                if (jB2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
                    jB2 = nui.b(jB2, andSet);
                    if (jB2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
                        jB2 -= andSet2;
                        if (jB2 < 0) {
                            t8j.a(new ProtocolViolationException(vb9.e(jB2, "More produced than requested: ")));
                            jB2 = 0;
                        }
                    }
                    this.b = jB2;
                }
                if (cofVar2 != null) {
                    this.a = cofVar2;
                    if (jB2 != 0) {
                        jB = nui.b(jB, jB2);
                        cofVar = cofVar2;
                    }
                } else if (cofVar3 != null && andSet != 0) {
                    jB = nui.b(jB, andSet);
                    cofVar = cofVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jB != 0) {
            cofVar.g(jB);
        }
    }

    @Override // defpackage.cof
    public void cancel() {
        if (this.X) {
            return;
        }
        this.X = true;
        a();
    }

    public void d(cof cofVar) {
        h(cofVar);
    }

    public final void e(long j) {
        if (this.Y) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            nui.a(this.o, j);
            a();
            return;
        }
        long j2 = this.b;
        if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            long j3 = j2 - j;
            if (j3 < 0) {
                t8j.a(new ProtocolViolationException(vb9.e(j3, "More produced than requested: ")));
                j3 = 0;
            }
            this.b = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        c();
    }

    @Override // defpackage.cof
    public final void g(long j) {
        if (!fof.e(j) || this.Y) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            nui.a(this.d, j);
            a();
            return;
        }
        long j2 = this.b;
        if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            long jB = nui.b(j2, j);
            this.b = jB;
            if (jB == BuildConfig.MAX_TIME_TO_UPLOAD) {
                this.Y = true;
            }
        }
        cof cofVar = this.a;
        if (decrementAndGet() != 0) {
            c();
        }
        if (cofVar != null) {
            cofVar.g(j);
        }
    }

    public final void h(cof cofVar) {
        if (this.X) {
            cofVar.cancel();
            return;
        }
        Objects.requireNonNull(cofVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            a();
            return;
        }
        this.a = cofVar;
        long j = this.b;
        if (decrementAndGet() != 0) {
            c();
        }
        if (j != 0) {
            cofVar.g(j);
        }
    }
}
