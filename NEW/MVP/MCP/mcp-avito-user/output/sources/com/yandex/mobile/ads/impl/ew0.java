package com.yandex.mobile.ads.impl;

import android.util.SparseArray;

/* loaded from: classes8.dex */
public final class ew0 implements ru {

    /* renamed from: a, reason: collision with root package name */
    private final o91 f385117a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f385118b;

    /* renamed from: c, reason: collision with root package name */
    private final pr0 f385119c;

    /* renamed from: d, reason: collision with root package name */
    private final dw0 f385120d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f385121e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f385122f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f385123g;

    /* renamed from: h, reason: collision with root package name */
    private long f385124h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private cw0 f385125i;

    /* renamed from: j, reason: collision with root package name */
    private tu f385126j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f385127k;

    public ew0() {
        this(new o91(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ru[] a() {
        return new ru[]{new ew0()};
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final is f385128a;

        /* renamed from: b, reason: collision with root package name */
        private final o91 f385129b;

        /* renamed from: c, reason: collision with root package name */
        private final or0 f385130c = new or0(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        private boolean f385131d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f385132e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f385133f;

        /* renamed from: g, reason: collision with root package name */
        private long f385134g;

        public a(is isVar, o91 o91Var) {
            this.f385128a = isVar;
            this.f385129b = o91Var;
        }

        public final void a() {
            this.f385133f = false;
            this.f385128a.a();
        }

        public final void a(pr0 pr0Var) {
            pr0Var.a(this.f385130c.f388623a, 0, 3);
            this.f385130c.c(0);
            this.f385130c.d(8);
            this.f385131d = this.f385130c.f();
            this.f385132e = this.f385130c.f();
            this.f385130c.d(6);
            pr0Var.a(this.f385130c.f388623a, 0, this.f385130c.b(8));
            this.f385130c.c(0);
            this.f385134g = 0L;
            if (this.f385131d) {
                this.f385130c.d(4);
                this.f385130c.d(1);
                this.f385130c.d(1);
                long jB2 = (this.f385130c.b(3) << 30) | (this.f385130c.b(15) << 15) | this.f385130c.b(15);
                this.f385130c.d(1);
                if (!this.f385133f && this.f385132e) {
                    this.f385130c.d(4);
                    this.f385130c.d(1);
                    this.f385130c.d(1);
                    this.f385130c.d(1);
                    this.f385129b.b((this.f385130c.b(3) << 30) | (this.f385130c.b(15) << 15) | this.f385130c.b(15));
                    this.f385133f = true;
                }
                this.f385134g = this.f385129b.b(jB2);
            }
            this.f385128a.a(4, this.f385134g);
            this.f385128a.a(pr0Var);
            this.f385128a.b();
        }
    }

    public ew0(o91 o91Var) {
        this.f385117a = o91Var;
        this.f385119c = new pr0(4096);
        this.f385118b = new SparseArray<>();
        this.f385120d = new dw0();
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final boolean a(su suVar) {
        byte[] bArr = new byte[14];
        to toVar = (to) suVar;
        toVar.b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        toVar.a(false, bArr[13] & 7);
        toVar.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(tu tuVar) {
        this.f385126j = tuVar;
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void a(long j12, long j13) {
        boolean z12 = true;
        boolean z13 = this.f385117a.c() == -9223372036854775807L;
        if (z13) {
            z12 = z13;
        } else {
            long jA2 = this.f385117a.a();
            if (jA2 == -9223372036854775807L || jA2 == 0 || jA2 == j13) {
                z12 = false;
            }
        }
        if (z12) {
            this.f385117a.c(j13);
        }
        cw0 cw0Var = this.f385125i;
        if (cw0Var != null) {
            cw0Var.a(j13);
        }
        for (int i12 = 0; i12 < this.f385118b.size(); i12++) {
            this.f385118b.valueAt(i12).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ru
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    @Override // com.yandex.mobile.ads.impl.ru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.yandex.mobile.ads.impl.su r14, com.yandex.mobile.ads.impl.fu0 r15) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ew0.a(com.yandex.mobile.ads.impl.su, com.yandex.mobile.ads.impl.fu0):int");
    }
}
