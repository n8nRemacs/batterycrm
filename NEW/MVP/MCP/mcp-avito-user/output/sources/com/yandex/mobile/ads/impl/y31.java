package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.un;
import com.yandex.mobile.ads.impl.vn;
import com.yandex.mobile.ads.impl.wn;
import j.InterfaceC42153i;
import java.util.ArrayDeque;

/* loaded from: classes8.dex */
public abstract class y31<I extends vn, O extends wn, E extends un> implements sn<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f391905a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f391906b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f391907c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f391908d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final I[] f391909e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f391910f;

    /* renamed from: g, reason: collision with root package name */
    private int f391911g;

    /* renamed from: h, reason: collision with root package name */
    private int f391912h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private I f391913i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private v71 f391914j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f391915k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f391916l;

    public class a extends Thread {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y31 f391917b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d41 d41Var) {
            super("ExoPlayer:SimpleDecoder");
            this.f391917b = d41Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            y31.a(this.f391917b);
        }
    }

    public y31(I[] iArr, O[] oArr) {
        this.f391909e = iArr;
        this.f391911g = iArr.length;
        for (int i12 = 0; i12 < this.f391911g; i12++) {
            this.f391909e[i12] = c();
        }
        this.f391910f = oArr;
        this.f391912h = oArr.length;
        for (int i13 = 0; i13 < this.f391912h; i13++) {
            ((O[]) this.f391910f)[i13] = d();
        }
        a aVar = new a((d41) this);
        this.f391905a = aVar;
        aVar.start();
    }

    public static void a(y31 y31Var) {
        y31Var.getClass();
        do {
            try {
            } catch (InterruptedException e12) {
                throw new IllegalStateException(e12);
            }
        } while (y31Var.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f391906b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.f391916l     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L1d
            java.util.ArrayDeque<I extends com.yandex.mobile.ads.impl.vn> r1 = r8.f391907c     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            int r1 = r8.f391912h     // Catch: java.lang.Throwable -> L14
            if (r1 <= 0) goto L17
            goto L1d
        L14:
            r1 = move-exception
            goto Lad
        L17:
            java.lang.Object r1 = r8.f391906b     // Catch: java.lang.Throwable -> L14
            r1.wait()     // Catch: java.lang.Throwable -> L14
            goto L3
        L1d:
            boolean r1 = r8.f391916l     // Catch: java.lang.Throwable -> L14
            r2 = 0
            if (r1 == 0) goto L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r2
        L24:
            java.util.ArrayDeque<I extends com.yandex.mobile.ads.impl.vn> r1 = r8.f391907c     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L14
            com.yandex.mobile.ads.impl.vn r1 = (com.yandex.mobile.ads.impl.vn) r1     // Catch: java.lang.Throwable -> L14
            O extends com.yandex.mobile.ads.impl.wn[] r3 = r8.f391910f     // Catch: java.lang.Throwable -> L14
            int r4 = r8.f391912h     // Catch: java.lang.Throwable -> L14
            r5 = 1
            int r4 = r4 - r5
            r8.f391912h = r4     // Catch: java.lang.Throwable -> L14
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L14
            boolean r4 = r8.f391915k     // Catch: java.lang.Throwable -> L14
            r8.f391915k = r2     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            r0 = 4
            boolean r6 = r1.c(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L48
            r3.b(r0)
            goto L80
        L48:
            boolean r0 = r1.c(r7)
            if (r0 == 0) goto L51
            r3.b(r7)
        L51:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.c(r0)
            if (r6 == 0) goto L5c
            r3.b(r0)
        L5c:
            com.yandex.mobile.ads.impl.v71 r0 = r8.a(r1, r3, r4)     // Catch: java.lang.OutOfMemoryError -> L61 java.lang.RuntimeException -> L6b
            goto L74
        L61:
            r0 = move-exception
            com.yandex.mobile.ads.impl.v71 r4 = new com.yandex.mobile.ads.impl.v71
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
        L69:
            r0 = r4
            goto L74
        L6b:
            r0 = move-exception
            com.yandex.mobile.ads.impl.v71 r4 = new com.yandex.mobile.ads.impl.v71
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
            goto L69
        L74:
            if (r0 == 0) goto L80
            java.lang.Object r4 = r8.f391906b
            monitor-enter(r4)
            r8.f391914j = r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            return r2
        L7d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            throw r0
        L80:
            java.lang.Object r2 = r8.f391906b
            monitor-enter(r2)
            boolean r0 = r8.f391915k     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L8d
            r3.h()     // Catch: java.lang.Throwable -> L8b
            goto L9c
        L8b:
            r0 = move-exception
            goto Lab
        L8d:
            boolean r0 = r3.c(r7)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L97
            r3.h()     // Catch: java.lang.Throwable -> L8b
            goto L9c
        L97:
            java.util.ArrayDeque<O extends com.yandex.mobile.ads.impl.wn> r0 = r8.f391908d     // Catch: java.lang.Throwable -> L8b
            r0.addLast(r3)     // Catch: java.lang.Throwable -> L8b
        L9c:
            r1.b()     // Catch: java.lang.Throwable -> L8b
            I extends com.yandex.mobile.ads.impl.vn[] r0 = r8.f391909e     // Catch: java.lang.Throwable -> L8b
            int r3 = r8.f391911g     // Catch: java.lang.Throwable -> L8b
            int r4 = r3 + 1
            r8.f391911g = r4     // Catch: java.lang.Throwable -> L8b
            r0[r3] = r1     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8b
            return r5
        Lab:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8b
            throw r0
        Lad:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.y31.e():boolean");
    }

    @j.P
    public abstract v71 a(vn vnVar, wn wnVar, boolean z12);

    @Override // com.yandex.mobile.ads.impl.sn
    @j.P
    public final Object b() {
        I i12;
        synchronized (this.f391906b) {
            try {
                v71 v71Var = this.f391914j;
                if (v71Var != null) {
                    throw v71Var;
                }
                db.b(this.f391913i == null);
                int i13 = this.f391911g;
                if (i13 == 0) {
                    i12 = null;
                } else {
                    I[] iArr = this.f391909e;
                    int i14 = i13 - 1;
                    this.f391911g = i14;
                    i12 = iArr[i14];
                }
                this.f391913i = i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i12;
    }

    public abstract x71 c();

    public abstract O d();

    public final void f() {
        db.b(this.f391911g == this.f391909e.length);
        for (I i12 : this.f391909e) {
            i12.e(1024);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sn
    public final void flush() {
        synchronized (this.f391906b) {
            try {
                this.f391915k = true;
                I i12 = this.f391913i;
                if (i12 != null) {
                    i12.b();
                    I[] iArr = this.f391909e;
                    int i13 = this.f391911g;
                    this.f391911g = i13 + 1;
                    iArr[i13] = i12;
                    this.f391913i = null;
                }
                while (!this.f391907c.isEmpty()) {
                    I iRemoveFirst = this.f391907c.removeFirst();
                    iRemoveFirst.b();
                    I[] iArr2 = this.f391909e;
                    int i14 = this.f391911g;
                    this.f391911g = i14 + 1;
                    iArr2[i14] = iRemoveFirst;
                }
                while (!this.f391908d.isEmpty()) {
                    this.f391908d.removeFirst().h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sn
    @InterfaceC42153i
    public final void release() throws InterruptedException {
        synchronized (this.f391906b) {
            this.f391916l = true;
            this.f391906b.notify();
        }
        try {
            this.f391905a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sn
    public final void a(x71 x71Var) {
        synchronized (this.f391906b) {
            try {
                v71 v71Var = this.f391914j;
                if (v71Var == null) {
                    db.a(x71Var == this.f391913i);
                    this.f391907c.addLast(x71Var);
                    if (!this.f391907c.isEmpty() && this.f391912h > 0) {
                        this.f391906b.notify();
                    }
                    this.f391913i = null;
                } else {
                    throw v71Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.sn
    @j.P
    public final Object a() {
        synchronized (this.f391906b) {
            try {
                v71 v71Var = this.f391914j;
                if (v71Var == null) {
                    if (this.f391908d.isEmpty()) {
                        return null;
                    }
                    return this.f391908d.removeFirst();
                }
                throw v71Var;
            } finally {
            }
        }
    }

    @InterfaceC42153i
    public final void a(O o12) {
        synchronized (this.f391906b) {
            try {
                o12.b();
                O[] oArr = this.f391910f;
                int i12 = this.f391912h;
                this.f391912h = i12 + 1;
                oArr[i12] = o12;
                if (!this.f391907c.isEmpty() && this.f391912h > 0) {
                    this.f391906b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
