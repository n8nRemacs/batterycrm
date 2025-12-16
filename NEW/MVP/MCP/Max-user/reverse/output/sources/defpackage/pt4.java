package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class pt4 implements Iterator, my7 {
    public final /* synthetic */ qt4 X;
    public int a = -1;
    public int b;
    public int c;
    public to7 d;
    public int o;

    public pt4(qt4 qt4Var) {
        this.X = qt4Var;
        int iC = n7j.c(0, 0, qt4Var.a.length());
        this.b = iC;
        this.c = iC;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Type inference failed for: r0v1, types: [sm6, u08] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            qt4 r0 = r8.X
            java.lang.CharSequence r1 = r0.a
            int r2 = r8.c
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.a = r3
            r0 = 0
            r8.d = r0
            return
        Lf:
            int r4 = r0.b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.o
            int r7 = r7 + r6
            r8.o = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L32
        L22:
            to7 r0 = new to7
            int r2 = r8.b
            int r1 = defpackage.vmf.y(r1)
            r0.<init>(r2, r1, r6)
            r8.d = r0
            r8.c = r5
            goto L73
        L32:
            u08 r0 = r0.c
            int r2 = r8.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            imb r0 = (defpackage.imb) r0
            if (r0 != 0) goto L52
            to7 r0 = new to7
            int r2 = r8.b
            int r1 = defpackage.vmf.y(r1)
            r0.<init>(r2, r1, r6)
            r8.d = r0
            r8.c = r5
            goto L73
        L52:
            java.lang.Object r1 = r0.a
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.b
            to7 r2 = defpackage.n7j.h(r2, r1)
            r8.d = r2
            int r1 = r1 + r0
            r8.b = r1
            if (r0 != 0) goto L70
            r3 = r6
        L70:
            int r1 = r1 + r3
            r8.c = r1
        L73:
            r8.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt4.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            throw new NoSuchElementException();
        }
        to7 to7Var = this.d;
        this.d = null;
        this.a = -1;
        return to7Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
