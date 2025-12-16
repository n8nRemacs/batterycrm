package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ak implements ti {
    public final zh a;
    public final a93 b;
    public volatile Integer c;
    public volatile ae4 d;
    public volatile ce4 e;
    public final zj f = new tud() { // from class: zj
        @Override // defpackage.tud
        public final void a(ae4 ae4Var, boolean z) {
            pa5 pa5Var = this.a.g;
            if (pa5Var != null) {
                pa5Var.a();
            }
        }
    };
    public volatile pa5 g;
    public volatile long h;

    /* JADX WARN: Type inference failed for: r2v1, types: [zj] */
    public ak(zh zhVar, a93 a93Var, Integer num) {
        this.a = zhVar;
        this.b = a93Var;
        this.c = num;
        Integer num2 = this.c;
        this.g = (num2 != null && num2.intValue() == 1) ? null : new pa5(this);
        if (zhVar.i) {
            zhVar.g.add(this);
            Integer num3 = zhVar.k;
            if (num3 != null) {
                e(num3.intValue());
            }
        }
    }

    @Override // defpackage.ti
    public final void a(Double[] dArr) {
        pa5 pa5Var = this.g;
        Integer num = this.c;
        if (pa5Var != null) {
            pa5Var.c = dArr;
            return;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            int length = dArr.length;
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                fArr[i] = (float) dArr[i].doubleValue();
            }
            c(iIntValue, new gi(fArr));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
        y6d y6dVar = this.a.b;
        String message = illegalStateException.getMessage();
        if (message == null) {
            message = "animoji error";
        }
        y6dVar.reportException("AniSend", message, illegalStateException);
        pa5 pa5Var2 = new pa5(this);
        pa5Var2.c = dArr;
        this.g = pa5Var2;
    }

    @Override // defpackage.ti
    public final void b() {
        pa5 pa5Var = this.g;
        Integer num = this.c;
        if (pa5Var != null) {
            this.g = new pa5(this);
            return;
        }
        if (num != null) {
            c(num.intValue(), ji.a);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
        y6d y6dVar = this.a.b;
        String message = illegalStateException.getMessage();
        if (message == null) {
            message = "animoji error";
        }
        y6dVar.reportException("AniSend", message, illegalStateException);
        pa5 pa5Var2 = new pa5(this);
        this.g = new pa5(this);
        this.g = pa5Var2;
    }

    public final void c(int i, hi hiVar) {
        String strH;
        ce4 ce4Var;
        Boolean boolValueOf = null;
        boolean z = true;
        yj yjVar = (i == 1 && (hiVar instanceof ii)) ? null : new yj(i, (int) (SystemClock.elapsedRealtime() - this.h), hiVar);
        if (yjVar != null && (ce4Var = this.e) != null) {
            a93 a93Var = ce4Var.a;
            AtomicInteger atomicInteger = ce4Var.o;
            if (atomicInteger.get() > ce4Var.b) {
                ((AtomicInteger) a93Var.c).incrementAndGet();
                z = false;
            } else {
                ce4Var.d.add(yjVar);
                ((AtomicInteger) a93Var.d).incrementAndGet();
                atomicInteger.incrementAndGet();
                ReentrantLock reentrantLock = ce4Var.Z;
                reentrantLock.lock();
                try {
                    ce4Var.s0.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
            boolValueOf = Boolean.valueOf(z);
        }
        if (fni.a(boolValueOf, Boolean.TRUE)) {
            return;
        }
        if (hiVar instanceof gi) {
            float[] fArr = ((gi) hiVar).a;
            int length = fArr.length;
            strH = "lmarks: (" + length + ") " + TextUtils.join(",", new zs(3, lee.m(fArr.length == 0 ? qd5.a : new at(1, fArr), 4))) + "...";
        } else if (hiVar instanceof ii) {
            ozi.a(16);
            String string = Long.toString(((ii) hiVar).a & 4294967295L, 16);
            strH = wy1.h("bgColor: 0x", vmf.J(string, string.length() > 6 ? 8 : 6, '0'));
        } else {
            if (!(hiVar instanceof ji)) {
                throw new NoWhenBranchMatchedException();
            }
            strH = "EOS";
        }
        a9h.o("package was not sent: ", strH, this.a.b, "AniSend");
    }

    public final void d() {
        ae4 ae4Var = this.d;
        if (ae4Var != null) {
            ae4Var.c.remove(this.f);
        }
        this.d = null;
        ce4 ce4Var = this.e;
        if (ce4Var != null) {
            if (!ce4Var.u0) {
                ce4Var.u0 = true;
                ce4Var.interrupt();
            }
            ReentrantLock reentrantLock = ce4Var.t0;
            reentrantLock.lock();
            try {
                ce4Var.c = null;
            } finally {
                reentrantLock.unlock();
            }
        }
        this.e = null;
    }

    public final void e(int i) {
        pa5 pa5Var = this.g;
        Integer num = this.c;
        if (pa5Var != null) {
            pa5Var.b = Integer.valueOf(i);
            pa5Var.a();
            return;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 2) {
                c(iIntValue, new ii(i));
                return;
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
        y6d y6dVar = this.a.b;
        String message = illegalStateException.getMessage();
        if (message == null) {
            message = "animoji error";
        }
        y6dVar.reportException("AniSend", message, illegalStateException);
        pa5 pa5Var2 = new pa5(this);
        pa5Var2.b = Integer.valueOf(i);
        pa5Var2.a();
        this.g = pa5Var2;
    }

    public final void f(ae4 ae4Var) {
        d();
        this.d = ae4Var;
        ae4Var.c.add(this.f);
        this.h = SystemClock.elapsedRealtime();
        a93 a93Var = this.b;
        ((AtomicInteger) a93Var.a).set(0);
        ((AtomicInteger) a93Var.b).set(0);
        ((AtomicInteger) a93Var.c).set(0);
        ((AtomicInteger) a93Var.d).set(0);
        this.e = new ce4(ae4Var, this.b);
        ce4 ce4Var = this.e;
        if (ce4Var != null) {
            ce4Var.start();
        }
        pa5 pa5Var = this.g;
        if (pa5Var != null) {
            pa5Var.a();
        }
    }
}
