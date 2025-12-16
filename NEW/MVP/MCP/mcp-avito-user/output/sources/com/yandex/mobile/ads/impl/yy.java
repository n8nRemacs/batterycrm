package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class yy implements is {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f392085l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final oc1 f392086a;

    /* renamed from: f, reason: collision with root package name */
    private b f392091f;

    /* renamed from: g, reason: collision with root package name */
    private long f392092g;

    /* renamed from: h, reason: collision with root package name */
    private String f392093h;

    /* renamed from: i, reason: collision with root package name */
    private x91 f392094i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f392095j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f392088c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final a f392089d = new a();

    /* renamed from: k, reason: collision with root package name */
    private long f392096k = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final kj0 f392090e = new kj0(178);

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final pr0 f392087b = new pr0();

    public yy(@j.P oc1 oc1Var) {
        this.f392086a = oc1Var;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a() {
        lj0.a(this.f392088c);
        this.f392089d.a();
        b bVar = this.f392091f;
        if (bVar != null) {
            bVar.a();
        }
        kj0 kj0Var = this.f392090e;
        if (kj0Var != null) {
            kj0Var.b();
        }
        this.f392092g = 0L;
        this.f392096k = -9223372036854775807L;
    }

    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f392097f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f392098a;

        /* renamed from: b, reason: collision with root package name */
        private int f392099b;

        /* renamed from: c, reason: collision with root package name */
        public int f392100c;

        /* renamed from: d, reason: collision with root package name */
        public int f392101d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f392102e = new byte[128];

        public final void a() {
            this.f392098a = false;
            this.f392100c = 0;
            this.f392099b = 0;
        }

        public final boolean a(int i12, int i13) {
            int i14 = this.f392099b;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i12 == 179 || i12 == 181) {
                                this.f392100c -= i13;
                                this.f392098a = false;
                                return true;
                            }
                        } else if ((i12 & 240) != 32) {
                            ka0.d("H263Reader", "Unexpected start code value");
                            a();
                        } else {
                            this.f392101d = this.f392100c;
                            this.f392099b = 4;
                        }
                    } else if (i12 > 31) {
                        ka0.d("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f392099b = 3;
                    }
                } else if (i12 != 181) {
                    ka0.d("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f392099b = 2;
                }
            } else if (i12 == 176) {
                this.f392099b = 1;
                this.f392098a = true;
            }
            a(f392097f, 0, 3);
            return false;
        }

        public final void a(byte[] bArr, int i12, int i13) {
            if (this.f392098a) {
                int i14 = i13 - i12;
                byte[] bArr2 = this.f392102e;
                int length = bArr2.length;
                int i15 = this.f392100c + i14;
                if (length < i15) {
                    this.f392102e = Arrays.copyOf(bArr2, i15 * 2);
                }
                System.arraycopy(bArr, i12, this.f392102e, this.f392100c, i14);
                this.f392100c += i14;
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final x91 f392103a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f392104b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f392105c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f392106d;

        /* renamed from: e, reason: collision with root package name */
        private int f392107e;

        /* renamed from: f, reason: collision with root package name */
        private int f392108f;

        /* renamed from: g, reason: collision with root package name */
        private long f392109g;

        /* renamed from: h, reason: collision with root package name */
        private long f392110h;

        public b(x91 x91Var) {
            this.f392103a = x91Var;
        }

        public final void a() {
            this.f392104b = false;
            this.f392105c = false;
            this.f392106d = false;
            this.f392107e = -1;
        }

        public final void a(int i12, long j12) {
            this.f392107e = i12;
            this.f392106d = false;
            this.f392104b = i12 == 182 || i12 == 179;
            this.f392105c = i12 == 182;
            this.f392108f = 0;
            this.f392110h = j12;
        }

        public final void a(byte[] bArr, int i12, int i13) {
            if (this.f392105c) {
                int i14 = this.f392108f;
                int i15 = (i12 + 1) - i14;
                if (i15 < i13) {
                    this.f392106d = ((bArr[i15] & 192) >> 6) == 0;
                    this.f392105c = false;
                } else {
                    this.f392108f = (i13 - i12) + i14;
                }
            }
        }

        public final void a(int i12, long j12, boolean z12) {
            if (this.f392107e == 182 && z12 && this.f392104b) {
                long j13 = this.f392110h;
                if (j13 != -9223372036854775807L) {
                    this.f392103a.a(j13, this.f392106d ? 1 : 0, (int) (j12 - this.f392109g), i12, null);
                }
            }
            if (this.f392107e != 179) {
                this.f392109g = j12;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(tu tuVar, fb1.d dVar) {
        dVar.a();
        this.f392093h = dVar.b();
        x91 x91VarA = tuVar.a(dVar.c(), 2);
        this.f392094i = x91VarA;
        this.f392091f = new b(x91VarA);
        oc1 oc1Var = this.f392086a;
        if (oc1Var != null) {
            oc1Var.a(tuVar, dVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f392096k = j12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dc  */
    @Override // com.yandex.mobile.ads.impl.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.yandex.mobile.ads.impl.pr0 r19) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.yy.a(com.yandex.mobile.ads.impl.pr0):void");
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void b() {
    }
}
