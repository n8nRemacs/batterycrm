package com.google.android.exoplayer2.extractor.flac;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.D;
import com.google.android.exoplayer2.extractor.f;
import com.google.android.exoplayer2.extractor.flac.a;
import com.google.android.exoplayer2.extractor.j;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.o;
import com.google.android.exoplayer2.extractor.p;
import com.google.android.exoplayer2.extractor.q;
import com.google.android.exoplayer2.extractor.r;
import com.google.android.exoplayer2.extractor.u;
import com.google.android.exoplayer2.extractor.w;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.util.E;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: FlacExtractor.java */
/* loaded from: classes6.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f344502a;

    /* renamed from: b, reason: collision with root package name */
    public final F f344503b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f344504c;

    /* renamed from: d, reason: collision with root package name */
    public final o.a f344505d;

    /* renamed from: e, reason: collision with root package name */
    public l f344506e;

    /* renamed from: f, reason: collision with root package name */
    public A f344507f;

    /* renamed from: g, reason: collision with root package name */
    public int f344508g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public Metadata f344509h;

    /* renamed from: i, reason: collision with root package name */
    public r f344510i;

    /* renamed from: j, reason: collision with root package name */
    public int f344511j;

    /* renamed from: k, reason: collision with root package name */
    public int f344512k;

    /* renamed from: l, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.flac.a f344513l;

    /* renamed from: m, reason: collision with root package name */
    public int f344514m;

    /* renamed from: n, reason: collision with root package name */
    public long f344515n;

    /* compiled from: FlacExtractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public c() {
        this(0);
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        if (j12 == 0) {
            this.f344508g = 0;
        } else {
            com.google.android.exoplayer2.extractor.flac.a aVar = this.f344513l;
            if (aVar != null) {
                aVar.c(j13);
            }
        }
        this.f344515n = j13 != 0 ? -1L : 0L;
        this.f344514m = 0;
        this.f344503b.y(0);
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(l lVar) {
        this.f344506e = lVar;
        this.f344507f = lVar.c(0, 1);
        lVar.b();
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(k kVar) throws EOFException, InterruptedIOException {
        f fVar = (f) kVar;
        Metadata metadataA = new u().a(fVar, com.google.android.exoplayer2.metadata.id3.a.f345708b);
        if (metadataA != null) {
            int length = metadataA.f345623b.length;
        }
        F f12 = new F(4);
        fVar.a(f12.f348070a, 0, 4, false);
        return f12.s() == 1716281667;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final int i(k kVar, w wVar) throws ParserException, EOFException, InterruptedIOException {
        Metadata metadata;
        Metadata metadata2;
        y bVar;
        com.avito.android.str_seller_orders.orders_seller.d dVar;
        long j12;
        long j13;
        boolean z12;
        long j14;
        boolean zA2;
        int i12 = this.f344508g;
        Metadata metadata3 = null;
        if (i12 == 0) {
            ((f) kVar).f344497f = 0;
            f fVar = (f) kVar;
            long jG2 = fVar.g();
            Metadata metadataA = new u().a(fVar, !this.f344504c ? null : com.google.android.exoplayer2.metadata.id3.a.f345708b);
            if (metadataA != null && metadataA.f345623b.length != 0) {
                metadata3 = metadataA;
            }
            fVar.i((int) (fVar.g() - jG2));
            this.f344509h = metadata3;
            this.f344508g = 1;
            return 0;
        }
        byte[] bArr = this.f344502a;
        if (i12 == 1) {
            ((f) kVar).a(bArr, 0, bArr.length, false);
            ((f) kVar).f344497f = 0;
            this.f344508g = 2;
            return 0;
        }
        int i13 = 3;
        if (i12 == 2) {
            F f12 = new F(4);
            ((f) kVar).d(f12.f348070a, 0, 4, false);
            if (f12.s() != 1716281667) {
                throw ParserException.a("Failed to read FLAC stream marker.", null);
            }
            this.f344508g = 3;
            return 0;
        }
        if (i12 == 3) {
            r rVar = this.f344510i;
            p.a aVar = new p.a();
            aVar.f344972a = rVar;
            boolean z13 = false;
            while (!z13) {
                ((f) kVar).f344497f = 0;
                byte[] bArr2 = new byte[4];
                E e12 = new E(bArr2, 4);
                f fVar2 = (f) kVar;
                fVar2.a(bArr2, 0, 4, false);
                boolean zF2 = e12.f();
                int iG2 = e12.g(i);
                int iG3 = e12.g(24) + 4;
                if (iG2 == 0) {
                    byte[] bArr3 = new byte[38];
                    fVar2.d(bArr3, 0, 38, false);
                    aVar.f344972a = new r(bArr3, 4);
                } else {
                    r rVar2 = aVar.f344972a;
                    if (rVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iG2 == i13) {
                        F f13 = new F(iG3);
                        fVar2.d(f13.f348070a, 0, iG3, false);
                        aVar.f344972a = new r(rVar2.f344975a, rVar2.f344976b, rVar2.f344977c, rVar2.f344978d, rVar2.f344979e, rVar2.f344981g, rVar2.f344982h, rVar2.f344984j, p.a(f13), rVar2.f344986l);
                    } else {
                        Metadata metadata4 = rVar2.f344986l;
                        if (iG2 == 4) {
                            F f14 = new F(iG3);
                            fVar2.d(f14.f348070a, 0, iG3, false);
                            f14.C(4);
                            Metadata metadataB = D.b(Arrays.asList(D.c(f14, false, false).f344387a));
                            if (metadata4 == null) {
                                metadata2 = metadataB;
                            } else {
                                if (metadataB != null) {
                                    Metadata.Entry[] entryArr = metadataB.f345623b;
                                    if (entryArr.length != 0) {
                                        int i14 = U.f348106a;
                                        Metadata.Entry[] entryArr2 = metadata4.f345623b;
                                        Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                                        System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                                        metadata4 = new Metadata((Metadata.Entry[]) objArrCopyOf);
                                    }
                                }
                                metadata2 = metadata4;
                            }
                            aVar.f344972a = new r(rVar2.f344975a, rVar2.f344976b, rVar2.f344977c, rVar2.f344978d, rVar2.f344979e, rVar2.f344981g, rVar2.f344982h, rVar2.f344984j, rVar2.f344985k, metadata2);
                        } else if (iG2 == 6) {
                            F f15 = new F(iG3);
                            fVar2.d(f15.f348070a, 0, iG3, false);
                            f15.C(4);
                            Metadata metadata5 = new Metadata(AbstractC37401r1.E(PictureFrame.a(f15)));
                            if (metadata4 == null) {
                                metadata = metadata5;
                            } else {
                                Metadata.Entry[] entryArr3 = metadata5.f345623b;
                                if (entryArr3.length != 0) {
                                    int i15 = U.f348106a;
                                    Metadata.Entry[] entryArr4 = metadata4.f345623b;
                                    Object[] objArrCopyOf2 = Arrays.copyOf(entryArr4, entryArr4.length + entryArr3.length);
                                    System.arraycopy(entryArr3, 0, objArrCopyOf2, entryArr4.length, entryArr3.length);
                                    metadata4 = new Metadata((Metadata.Entry[]) objArrCopyOf2);
                                }
                                metadata = metadata4;
                            }
                            aVar.f344972a = new r(rVar2.f344975a, rVar2.f344976b, rVar2.f344977c, rVar2.f344978d, rVar2.f344979e, rVar2.f344981g, rVar2.f344982h, rVar2.f344984j, rVar2.f344985k, metadata);
                        } else {
                            fVar2.i(iG3);
                        }
                    }
                }
                r rVar3 = aVar.f344972a;
                int i16 = U.f348106a;
                this.f344510i = rVar3;
                z13 = zF2;
                i13 = 3;
                i = 7;
            }
            this.f344510i.getClass();
            this.f344511j = Math.max(this.f344510i.f344977c, 6);
            A a12 = this.f344507f;
            int i17 = U.f348106a;
            a12.a(this.f344510i.c(bArr, this.f344509h));
            this.f344508g = 4;
            return 0;
        }
        if (i12 == 4) {
            ((f) kVar).f344497f = 0;
            F f16 = new F(2);
            f fVar3 = (f) kVar;
            fVar3.a(f16.f348070a, 0, 2, false);
            int iW2 = f16.w();
            if ((iW2 >> 2) != 16382) {
                fVar3.f344497f = 0;
                throw ParserException.a("First frame does not start with sync code.", null);
            }
            fVar3.f344497f = 0;
            this.f344512k = iW2;
            l lVar = this.f344506e;
            int i18 = U.f348106a;
            long j15 = fVar3.f344495d;
            this.f344510i.getClass();
            r rVar4 = this.f344510i;
            if (rVar4.f344985k != null) {
                bVar = new q(rVar4, j15);
            } else {
                long j16 = fVar3.f344494c;
                if (j16 == -1 || rVar4.f344984j <= 0) {
                    bVar = new y.b(rVar4.b());
                } else {
                    int i19 = this.f344512k;
                    com.avito.android.str_seller_orders.orders_seller.d dVar2 = new com.avito.android.str_seller_orders.orders_seller.d(rVar4, 22);
                    a.b bVar2 = new a.b(rVar4, i19, null);
                    long jB2 = rVar4.b();
                    int i22 = rVar4.f344977c;
                    int i23 = rVar4.f344978d;
                    if (i23 > 0) {
                        dVar = dVar2;
                        j12 = (i23 + i22) / 2;
                        j13 = 1;
                    } else {
                        dVar = dVar2;
                        int i24 = rVar4.f344976b;
                        int i25 = rVar4.f344975a;
                        j12 = ((((i25 != i24 || i25 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i25) * rVar4.f344981g) * rVar4.f344982h) / 8;
                        j13 = 64;
                    }
                    com.google.android.exoplayer2.extractor.flac.a aVar2 = new com.google.android.exoplayer2.extractor.flac.a(dVar, bVar2, jB2, rVar4.f344984j, j15, j16, j12 + j13, Math.max(6, i22));
                    this.f344513l = aVar2;
                    bVar = aVar2.f344396a;
                }
            }
            lVar.i(bVar);
            this.f344508g = 5;
            return 0;
        }
        if (i12 != 5) {
            throw new IllegalStateException();
        }
        this.f344507f.getClass();
        this.f344510i.getClass();
        com.google.android.exoplayer2.extractor.flac.a aVar3 = this.f344513l;
        if (aVar3 != null && aVar3.f344398c != null) {
            return aVar3.a((f) kVar, wVar);
        }
        if (this.f344515n == -1) {
            r rVar5 = this.f344510i;
            ((f) kVar).f344497f = 0;
            f fVar4 = (f) kVar;
            fVar4.l(1, false);
            byte[] bArr4 = new byte[1];
            fVar4.a(bArr4, 0, 1, false);
            boolean z14 = (bArr4[0] & 1) == 1;
            fVar4.l(2, false);
            i = z14 ? 7 : 6;
            F f17 = new F(i);
            byte[] bArr5 = f17.f348070a;
            int i26 = 0;
            while (i26 < i) {
                int iJ2 = fVar4.j(i26, i - i26, bArr5);
                if (iJ2 == -1) {
                    break;
                }
                i26 += iJ2;
            }
            f17.A(i26);
            fVar4.f344497f = 0;
            o.a aVar4 = new o.a();
            try {
                long jX2 = f17.x();
                if (!z14) {
                    jX2 *= rVar5.f344976b;
                }
                aVar4.f344909a = jX2;
                this.f344515n = jX2;
                return 0;
            } catch (NumberFormatException unused) {
                throw ParserException.a(null, null);
            }
        }
        F f18 = this.f344503b;
        int i27 = f18.f348072c;
        if (i27 < 32768) {
            int i28 = ((f) kVar).read(f18.f348070a, i27, 32768 - i27);
            z12 = i28 == -1;
            if (!z12) {
                f18.A(i27 + i28);
            } else if (f18.a() == 0) {
                long j17 = this.f344515n * 1000000;
                r rVar6 = this.f344510i;
                int i29 = U.f348106a;
                this.f344507f.f(j17 / rVar6.f344979e, 1, this.f344514m, 0, null);
                return -1;
            }
        } else {
            z12 = false;
        }
        int i32 = f18.f348071b;
        int i33 = this.f344514m;
        int i34 = this.f344511j;
        if (i33 < i34) {
            f18.C(Math.min(i34 - i33, f18.a()));
        }
        this.f344510i.getClass();
        int i35 = f18.f348071b;
        while (true) {
            int i36 = f18.f348072c - 16;
            o.a aVar5 = this.f344505d;
            if (i35 <= i36) {
                f18.B(i35);
                if (o.a(f18, this.f344510i, this.f344512k, aVar5)) {
                    f18.B(i35);
                    j14 = aVar5.f344909a;
                    break;
                }
                i35++;
            } else {
                if (z12) {
                    while (true) {
                        int i37 = f18.f348072c;
                        if (i35 > i37 - this.f344511j) {
                            f18.B(i37);
                            break;
                        }
                        f18.B(i35);
                        try {
                            zA2 = o.a(f18, this.f344510i, this.f344512k, aVar5);
                        } catch (IndexOutOfBoundsException unused2) {
                            zA2 = false;
                        }
                        if (f18.f348071b > f18.f348072c) {
                            zA2 = false;
                        }
                        if (zA2) {
                            f18.B(i35);
                            j14 = aVar5.f344909a;
                            break;
                        }
                        i35++;
                    }
                } else {
                    f18.B(i35);
                }
                j14 = -1;
            }
        }
        int i38 = f18.f348071b - i32;
        f18.B(i32);
        this.f344507f.c(i38, f18);
        int i39 = i38 + this.f344514m;
        this.f344514m = i39;
        if (j14 != -1) {
            long j18 = this.f344515n * 1000000;
            r rVar7 = this.f344510i;
            int i42 = U.f348106a;
            this.f344507f.f(j18 / rVar7.f344979e, 1, i39, 0, null);
            this.f344514m = 0;
            this.f344515n = j14;
        }
        if (f18.a() >= 16) {
            return 0;
        }
        int iA2 = f18.a();
        byte[] bArr6 = f18.f348070a;
        System.arraycopy(bArr6, f18.f348071b, bArr6, 0, iA2);
        f18.B(0);
        f18.A(iA2);
        return 0;
    }

    public c(int i12) {
        this.f344502a = new byte[42];
        this.f344503b = new F(new byte[32768], 0);
        this.f344504c = false;
        this.f344505d = new o.a();
        this.f344508g = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
