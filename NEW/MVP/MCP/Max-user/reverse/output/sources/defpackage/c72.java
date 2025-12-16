package defpackage;

import java.util.ArrayDeque;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class c72 implements jof {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public y62 d;
    public long e;
    public long f;
    public long g;

    public c72() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new y62(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            i62 i62Var = new i62(2, this);
            a72 a72Var = new a72();
            a72Var.Z = i62Var;
            arrayDeque.add(a72Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.jof
    public final void a(long j) {
        this.e = j;
    }

    @Override // defpackage.mh4
    public final Object c() {
        hsi.g(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        y62 y62Var = (y62) arrayDeque.pollFirst();
        this.d = y62Var;
        return y62Var;
    }

    @Override // defpackage.mh4
    public final void d(long j) {
        this.g = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // defpackage.mh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.oof r7) {
        /*
            r6 = this;
            y62 r0 = r6.d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            defpackage.hsi.b(r0)
            y62 r7 = (defpackage.y62) r7
            r0 = 4
            boolean r0 = r7.j(r0)
            if (r0 != 0) goto L33
            long r0 = r7.Y
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L33
            long r2 = r6.g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L33
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L33
            r7.w()
            java.util.ArrayDeque r0 = r6.a
            r0.add(r7)
            goto L41
        L33:
            long r0 = r6.f
            r2 = 1
            long r2 = r2 + r0
            r6.f = r2
            r7.u0 = r0
            java.util.ArrayDeque r0 = r6.c
            r0.add(r7)
        L41:
            r7 = 0
            r6.d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c72.e(oof):void");
    }

    public abstract y6i f();

    @Override // defpackage.mh4
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            y62 y62Var = (y62) arrayDeque2.poll();
            String str = zxg.a;
            y62Var.w();
            arrayDeque.add(y62Var);
        }
        y62 y62Var2 = this.d;
        if (y62Var2 != null) {
            y62Var2.w();
            arrayDeque.add(y62Var2);
            this.d = null;
        }
    }

    public abstract void g(y62 y62Var);

    @Override // defpackage.mh4
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a72 b() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            y62 y62Var = (y62) arrayDeque2.peek();
            String str = zxg.a;
            if (y62Var.Y > this.e) {
                return null;
            }
            y62 y62Var2 = (y62) arrayDeque2.poll();
            boolean zJ = y62Var2.j(4);
            ArrayDeque arrayDeque3 = this.a;
            if (zJ) {
                a72 a72Var = (a72) arrayDeque.pollFirst();
                a72Var.a(4);
                y62Var2.w();
                arrayDeque3.add(y62Var2);
                return a72Var;
            }
            g(y62Var2);
            if (i()) {
                y6i y6iVarF = f();
                a72 a72Var2 = (a72) arrayDeque.pollFirst();
                a72Var2.y(y62Var2.Y, y6iVarF, BuildConfig.MAX_TIME_TO_UPLOAD);
                y62Var2.w();
                arrayDeque3.add(y62Var2);
                return a72Var2;
            }
            y62Var2.w();
            arrayDeque3.add(y62Var2);
        }
    }

    public abstract boolean i();

    @Override // defpackage.mh4
    public void release() {
    }
}
