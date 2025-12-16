package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class t66 extends AtomicInteger implements q76, cof {
    public static final s66[] A0 = new s66[0];
    public static final s66[] B0 = new s66[0];
    public volatile boolean X;
    public final wy Y = new wy();
    public volatile boolean Z;
    public final aof a;
    public final tm6 b;
    public final int c;
    public final int d;
    public volatile m1f o;
    public final AtomicReference s0;
    public final AtomicLong t0;
    public cof u0;
    public long v0;
    public long w0;
    public int x0;
    public int y0;
    public final int z0;

    public t66(aof aofVar, b1g b1gVar, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.s0 = atomicReference;
        this.t0 = new AtomicLong();
        this.a = aofVar;
        this.b = b1gVar;
        this.c = i;
        this.d = i2;
        this.z0 = Math.max(1, i >> 1);
        atomicReference.lazySet(A0);
    }

    public final boolean a() {
        if (this.Z) {
            m1f m1fVar = this.o;
            if (m1fVar != null) {
                m1fVar.clear();
            }
            return true;
        }
        if (this.Y.get() == null) {
            return false;
        }
        m1f m1fVar2 = this.o;
        if (m1fVar2 != null) {
            m1fVar2.clear();
        }
        this.Y.f(this.a);
        return true;
    }

    @Override // defpackage.aof
    public final void b() {
        if (this.X) {
            return;
        }
        this.X = true;
        c();
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            e();
        }
    }

    @Override // defpackage.cof
    public final void cancel() {
        m1f m1fVar;
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.u0.cancel();
        AtomicReference atomicReference = this.s0;
        s66[] s66VarArr = B0;
        s66[] s66VarArr2 = (s66[]) atomicReference.getAndSet(s66VarArr);
        if (s66VarArr2 != s66VarArr) {
            for (s66 s66Var : s66VarArr2) {
                s66Var.getClass();
                fof.a(s66Var);
            }
            this.Y.c();
        }
        if (getAndIncrement() != 0 || (m1fVar = this.o) == null) {
            return;
        }
        m1fVar.clear();
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.h(this.u0, cofVar)) {
            this.u0 = cofVar;
            this.a.d(this);
            if (this.Z) {
                return;
            }
            int i = this.c;
            if (i == Integer.MAX_VALUE) {
                cofVar.g(BuildConfig.MAX_TIME_TO_UPLOAD);
            } else {
                cofVar.g(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t66.e():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aof
    public final void f(Object obj) {
        if (this.X) {
            return;
        }
        try {
            Object objApply = this.b.apply(obj);
            Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
            mqc mqcVar = (mqc) objApply;
            if (!(mqcVar instanceof drf)) {
                int i = this.d;
                long j = this.v0;
                this.v0 = 1 + j;
                s66 s66Var = new s66(this, i, j);
                AtomicReference atomicReference = this.s0;
                while (true) {
                    s66[] s66VarArr = (s66[]) atomicReference.get();
                    if (s66VarArr == B0) {
                        fof.a(s66Var);
                        return;
                    }
                    int length = s66VarArr.length;
                    s66[] s66VarArr2 = new s66[length + 1];
                    System.arraycopy(s66VarArr, 0, s66VarArr2, 0, length);
                    s66VarArr2[length] = s66Var;
                    while (!atomicReference.compareAndSet(s66VarArr, s66VarArr2)) {
                        if (atomicReference.get() != s66VarArr) {
                            break;
                        }
                    }
                    ((i66) mqcVar).e(s66Var);
                    return;
                }
            }
            try {
                Object obj2 = ((drf) mqcVar).get();
                if (obj2 == null) {
                    if (this.c == Integer.MAX_VALUE || this.Z) {
                        return;
                    }
                    int i2 = this.y0 + 1;
                    this.y0 = i2;
                    int i3 = this.z0;
                    if (i2 == i3) {
                        this.y0 = 0;
                        this.u0.g(i3);
                        return;
                    }
                    return;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    long j2 = this.t0.get();
                    m1f m1fVarH = this.o;
                    if (j2 == 0 || !(m1fVarH == null || m1fVarH.isEmpty())) {
                        if (m1fVarH == null) {
                            m1fVarH = h();
                        }
                        if (!m1fVarH.offer(obj2)) {
                            onError(new QueueOverflowException());
                        }
                    } else {
                        this.a.f(obj2);
                        if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
                            this.t0.decrementAndGet();
                        }
                        if (this.c != Integer.MAX_VALUE && !this.Z) {
                            int i4 = this.y0 + 1;
                            this.y0 = i4;
                            int i5 = this.z0;
                            if (i4 == i5) {
                                this.y0 = 0;
                                this.u0.g(i5);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else if (!h().offer(obj2)) {
                    onError(new QueueOverflowException());
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
                e();
            } catch (Throwable th) {
                raj.c(th);
                this.Y.b(th);
                c();
            }
        } catch (Throwable th2) {
            raj.c(th2);
            this.u0.cancel();
            onError(th2);
        }
    }

    @Override // defpackage.cof
    public final void g(long j) {
        if (fof.e(j)) {
            nui.a(this.t0, j);
            c();
        }
    }

    public final m1f h() {
        m1f r8fVar = this.o;
        if (r8fVar == null) {
            r8fVar = this.c == Integer.MAX_VALUE ? new r8f(this.d) : new q8f(this.c);
            this.o = r8fVar;
        }
        return r8fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(s66 s66Var) {
        s66[] s66VarArr;
        while (true) {
            AtomicReference atomicReference = this.s0;
            s66[] s66VarArr2 = (s66[]) atomicReference.get();
            int length = s66VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (s66VarArr2[i] == s66Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                s66VarArr = A0;
            } else {
                s66[] s66VarArr3 = new s66[length - 1];
                System.arraycopy(s66VarArr2, 0, s66VarArr3, 0, i);
                System.arraycopy(s66VarArr2, i + 1, s66VarArr3, i, (length - i) - 1);
                s66VarArr = s66VarArr3;
            }
            while (!atomicReference.compareAndSet(s66VarArr2, s66VarArr)) {
                if (atomicReference.get() != s66VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        if (this.X) {
            t8j.a(th);
            return;
        }
        if (this.Y.b(th)) {
            this.X = true;
            for (s66 s66Var : (s66[]) this.s0.getAndSet(B0)) {
                s66Var.getClass();
                fof.a(s66Var);
            }
            c();
        }
    }
}
