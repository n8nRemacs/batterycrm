package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.o;
import com.google.android.exoplayer2.extractor.ogg.h;
import com.google.android.exoplayer2.extractor.p;
import com.google.android.exoplayer2.extractor.q;
import com.google.android.exoplayer2.extractor.r;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;
import v61.InterfaceC49174e;

/* compiled from: FlacReader.java */
/* loaded from: classes6.dex */
final class b extends h {

    /* renamed from: n, reason: collision with root package name */
    @P
    public r f344923n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public a f344924o;

    /* compiled from: FlacReader.java */
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public r f344925a;

        /* renamed from: b, reason: collision with root package name */
        public r.a f344926b;

        /* renamed from: c, reason: collision with root package name */
        public long f344927c;

        /* renamed from: d, reason: collision with root package name */
        public long f344928d;

        @Override // com.google.android.exoplayer2.extractor.ogg.f
        public final long a(com.google.android.exoplayer2.extractor.f fVar) {
            long j12 = this.f344928d;
            if (j12 < 0) {
                return -1L;
            }
            long j13 = -(j12 + 2);
            this.f344928d = -1L;
            return j13;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.f
        public final y b() {
            C36585a.d(this.f344927c != -1);
            return new q(this.f344925a, this.f344927c);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.f
        public final void c(long j12) {
            long[] jArr = this.f344926b.f344987a;
            this.f344928d = jArr[U.f(jArr, j12, true)];
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.h
    public final long b(F f12) {
        byte[] bArr = f12.f348070a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i12 = (bArr[2] & 255) >> 4;
        if (i12 == 6 || i12 == 7) {
            f12.C(4);
            f12.x();
        }
        int iB2 = o.b(i12, f12);
        f12.B(0);
        return iB2;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.h
    @InterfaceC49174e
    public final boolean c(F f12, long j12, h.b bVar) {
        byte[] bArr = f12.f348070a;
        r rVar = this.f344923n;
        if (rVar == null) {
            r rVar2 = new r(bArr, 17);
            this.f344923n = rVar2;
            bVar.f344960a = rVar2.c(Arrays.copyOfRange(bArr, 9, f12.f348072c), null);
            return true;
        }
        byte b12 = bArr[0];
        if ((b12 & 127) != 3) {
            if (b12 != -1) {
                return true;
            }
            a aVar = this.f344924o;
            if (aVar != null) {
                aVar.f344927c = j12;
                bVar.f344961b = aVar;
            }
            bVar.f344960a.getClass();
            return false;
        }
        r.a aVarA = p.a(f12);
        r rVar3 = new r(rVar.f344975a, rVar.f344976b, rVar.f344977c, rVar.f344978d, rVar.f344979e, rVar.f344981g, rVar.f344982h, rVar.f344984j, aVarA, rVar.f344986l);
        this.f344923n = rVar3;
        a aVar2 = new a();
        aVar2.f344925a = rVar3;
        aVar2.f344926b = aVarA;
        aVar2.f344927c = -1L;
        aVar2.f344928d = -1L;
        this.f344924o = aVar2;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.h
    public final void d(boolean z12) {
        super.d(z12);
        if (z12) {
            this.f344923n = null;
            this.f344924o = null;
        }
    }
}
