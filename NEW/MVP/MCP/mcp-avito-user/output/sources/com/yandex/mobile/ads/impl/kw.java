package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e71;
import com.yandex.mobile.ads.impl.mw;
import java.util.Arrays;
import v61.InterfaceC49174e;

/* loaded from: classes8.dex */
final class kw extends e71 {

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private mw f387270n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private a f387271o;

    @Override // com.yandex.mobile.ads.impl.e71
    public final void a(boolean z12) {
        super.a(z12);
        if (z12) {
            this.f387270n = null;
            this.f387271o = null;
        }
    }

    public static final class a implements zp0 {

        /* renamed from: a, reason: collision with root package name */
        private mw f387272a;

        /* renamed from: b, reason: collision with root package name */
        private mw.a f387273b;

        /* renamed from: c, reason: collision with root package name */
        private long f387274c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f387275d = -1;

        public a(mw mwVar, mw.a aVar) {
            this.f387272a = mwVar;
            this.f387273b = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.zp0
        public final long a(to toVar) {
            long j12 = this.f387275d;
            if (j12 < 0) {
                return -1L;
            }
            long j13 = -(j12 + 2);
            this.f387275d = -1L;
            return j13;
        }

        public final void b(long j12) {
            this.f387274c = j12;
        }

        @Override // com.yandex.mobile.ads.impl.zp0
        public final void a(long j12) {
            long[] jArr = this.f387273b.f388110a;
            this.f387275d = jArr[pc1.b(jArr, j12, true)];
        }

        @Override // com.yandex.mobile.ads.impl.zp0
        public final x21 a() {
            db.b(this.f387274c != -1);
            return new lw(this.f387272a, this.f387274c);
        }
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final long a(pr0 pr0Var) {
        int i12;
        int i13;
        int iT2;
        int i14 = -1;
        if (pr0Var.c()[0] != -1) {
            return -1L;
        }
        int i15 = (pr0Var.c()[2] & 255) >> 4;
        if (i15 == 6 || i15 == 7) {
            pr0Var.f(4);
            pr0Var.A();
        }
        switch (i15) {
            case 1:
                i14 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i12 = i15 - 2;
                i13 = 576;
                i14 = i13 << i12;
                break;
            case 6:
                iT2 = pr0Var.t();
                i14 = iT2 + 1;
                break;
            case 7:
                iT2 = pr0Var.z();
                i14 = iT2 + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i12 = i15 - 8;
                i13 = 256;
                i14 = i13 << i12;
                break;
        }
        pr0Var.e(0);
        return i14;
    }

    @Override // com.yandex.mobile.ads.impl.e71
    @InterfaceC49174e
    public final boolean a(pr0 pr0Var, long j12, e71.a aVar) {
        byte[] bArrC = pr0Var.c();
        mw mwVar = this.f387270n;
        if (mwVar == null) {
            mw mwVar2 = new mw(17, bArrC);
            this.f387270n = mwVar2;
            aVar.f384810a = mwVar2.a(Arrays.copyOfRange(bArrC, 9, pr0Var.e()), null);
            return true;
        }
        byte b12 = bArrC[0];
        if ((b12 & 127) == 3) {
            mw.a aVarA = jw.a(pr0Var);
            mw mwVarA = mwVar.a(aVarA);
            this.f387270n = mwVarA;
            this.f387271o = new a(mwVarA, aVarA);
            return true;
        }
        if (b12 != -1) {
            return true;
        }
        a aVar2 = this.f387271o;
        if (aVar2 != null) {
            aVar2.b(j12);
            aVar.f384811b = this.f387271o;
        }
        aVar.f384810a.getClass();
        return false;
    }
}
