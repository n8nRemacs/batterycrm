package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class b72 implements iof {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public x62 d;
    public long e;
    public long f;

    public b72() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new x62(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            i62 i62Var = new i62(1, this);
            z62 z62Var = new z62();
            z62Var.Y = i62Var;
            arrayDeque.add(z62Var);
        }
        this.c = new PriorityQueue();
    }

    @Override // defpackage.iof
    public final void a(long j) {
        this.e = j;
    }

    @Override // defpackage.kh4
    public final Object c() {
        fsi.d(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        x62 x62Var = (x62) arrayDeque.pollFirst();
        this.d = x62Var;
        return x62Var;
    }

    @Override // defpackage.kh4
    public final void d(nof nofVar) {
        fsi.b(nofVar == this.d);
        x62 x62Var = (x62) nofVar;
        if (x62Var.j(Integer.MIN_VALUE)) {
            x62Var.w();
            this.a.add(x62Var);
        } else {
            long j = this.f;
            this.f = 1 + j;
            x62Var.t0 = j;
            this.c.add(x62Var);
        }
        this.d = null;
    }

    public abstract x6i e();

    public abstract void f(x62 x62Var);

    @Override // defpackage.kh4
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            x62 x62Var = (x62) priorityQueue.poll();
            int i = xxg.a;
            x62Var.w();
            arrayDeque.add(x62Var);
        }
        x62 x62Var2 = this.d;
        if (x62Var2 != null) {
            x62Var2.w();
            arrayDeque.add(x62Var2);
            this.d = null;
        }
    }

    @Override // defpackage.kh4
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public z62 b() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            x62 x62Var = (x62) priorityQueue.peek();
            int i = xxg.a;
            if (x62Var.X > this.e) {
                return null;
            }
            x62 x62Var2 = (x62) priorityQueue.poll();
            boolean zJ = x62Var2.j(4);
            ArrayDeque arrayDeque2 = this.a;
            if (zJ) {
                z62 z62Var = (z62) arrayDeque.pollFirst();
                z62Var.a(4);
                x62Var2.w();
                arrayDeque2.add(x62Var2);
                return z62Var;
            }
            f(x62Var2);
            if (h()) {
                x6i x6iVarE = e();
                z62 z62Var2 = (z62) arrayDeque.pollFirst();
                z62Var2.x(x62Var2.X, x6iVarE, BuildConfig.MAX_TIME_TO_UPLOAD);
                x62Var2.w();
                arrayDeque2.add(x62Var2);
                return z62Var2;
            }
            x62Var2.w();
            arrayDeque2.add(x62Var2);
        }
    }

    public abstract boolean h();

    @Override // defpackage.kh4
    public void release() {
    }
}
