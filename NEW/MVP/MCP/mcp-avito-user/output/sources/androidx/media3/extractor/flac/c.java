package androidx.media3.extractor.flac;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.J;
import androidx.media3.common.util.y;
import androidx.media3.common.util.z;
import androidx.media3.extractor.B;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.F;
import androidx.media3.extractor.H;
import androidx.media3.extractor.M;
import androidx.media3.extractor.flac.a;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
import androidx.media3.extractor.u;
import androidx.media3.extractor.v;
import androidx.media3.extractor.w;
import androidx.media3.extractor.x;
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
@J
/* loaded from: classes.dex */
public final class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f50523a;

    /* renamed from: b, reason: collision with root package name */
    public final z f50524b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f50525c;

    /* renamed from: d, reason: collision with root package name */
    public final u.a f50526d;

    /* renamed from: e, reason: collision with root package name */
    public r f50527e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.media3.extractor.J f50528f;

    /* renamed from: g, reason: collision with root package name */
    public int f50529g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public Metadata f50530h;

    /* renamed from: i, reason: collision with root package name */
    public x f50531i;

    /* renamed from: j, reason: collision with root package name */
    public int f50532j;

    /* renamed from: k, reason: collision with root package name */
    public int f50533k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.media3.extractor.flac.a f50534l;

    /* renamed from: m, reason: collision with root package name */
    public int f50535m;

    /* renamed from: n, reason: collision with root package name */
    public long f50536n;

    /* compiled from: FlacExtractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public c() {
        this(0);
    }

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        if (j12 == 0) {
            this.f50529g = 0;
        } else {
            androidx.media3.extractor.flac.a aVar = this.f50534l;
            if (aVar != null) {
                aVar.c(j13);
            }
        }
        this.f50536n = j13 != 0 ? -1L : 0L;
        this.f50535m = 0;
        this.f50524b.C(0);
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) throws EOFException, InterruptedIOException {
        C23191j c23191j = (C23191j) qVar;
        Metadata metadataA = new B().a(c23191j, androidx.media3.extractor.metadata.id3.a.f50694b);
        if (metadataA != null) {
            int length = metadataA.f47361b.length;
        }
        z zVar = new z(4);
        c23191j.a(zVar.f47962a, 0, 4, false);
        return zVar.v() == 1716281667;
    }

    @Override // androidx.media3.extractor.p
    public final int h(q qVar, F f12) throws ParserException, EOFException, InterruptedIOException {
        Metadata metadata;
        H bVar;
        Ae0.c cVar;
        long j12;
        long j13;
        boolean z12;
        long j14;
        boolean zA2;
        int i12 = this.f50529g;
        Metadata metadata2 = null;
        if (i12 == 0) {
            ((C23191j) qVar).f50585f = 0;
            C23191j c23191j = (C23191j) qVar;
            long jG2 = c23191j.g();
            Metadata metadataA = new B().a(c23191j, !this.f50525c ? null : androidx.media3.extractor.metadata.id3.a.f50694b);
            if (metadataA != null && metadataA.f47361b.length != 0) {
                metadata2 = metadataA;
            }
            c23191j.i((int) (c23191j.g() - jG2));
            this.f50530h = metadata2;
            this.f50529g = 1;
            return 0;
        }
        byte[] bArr = this.f50523a;
        if (i12 == 1) {
            ((C23191j) qVar).a(bArr, 0, bArr.length, false);
            ((C23191j) qVar).f50585f = 0;
            this.f50529g = 2;
            return 0;
        }
        int i13 = 3;
        if (i12 == 2) {
            z zVar = new z(4);
            ((C23191j) qVar).d(zVar.f47962a, 0, 4, false);
            if (zVar.v() != 1716281667) {
                throw ParserException.a("Failed to read FLAC stream marker.", null);
            }
            this.f50529g = 3;
            return 0;
        }
        if (i12 == 3) {
            x xVar = this.f50531i;
            v.a aVar = new v.a();
            aVar.f51847a = xVar;
            boolean z13 = false;
            while (!z13) {
                ((C23191j) qVar).f50585f = 0;
                byte[] bArr2 = new byte[4];
                y yVar = new y(bArr2, 4);
                C23191j c23191j2 = (C23191j) qVar;
                c23191j2.a(bArr2, 0, 4, false);
                boolean zF2 = yVar.f();
                int iG2 = yVar.g(i);
                int iG3 = yVar.g(24) + 4;
                if (iG2 == 0) {
                    byte[] bArr3 = new byte[38];
                    c23191j2.d(bArr3, 0, 38, false);
                    aVar.f51847a = new x(bArr3, 4);
                } else {
                    x xVar2 = aVar.f51847a;
                    if (xVar2 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iG2 == i13) {
                        z zVar2 = new z(iG3);
                        c23191j2.d(zVar2.f47962a, 0, iG3, false);
                        aVar.f51847a = new x(xVar2.f51891a, xVar2.f51892b, xVar2.f51893c, xVar2.f51894d, xVar2.f51895e, xVar2.f51897g, xVar2.f51898h, xVar2.f51900j, v.a(zVar2), xVar2.f51902l);
                    } else {
                        Metadata metadataA2 = xVar2.f51902l;
                        if (iG2 == 4) {
                            z zVar3 = new z(iG3);
                            c23191j2.d(zVar3.f47962a, 0, iG3, false);
                            zVar3.G(4);
                            Metadata metadataB = M.b(Arrays.asList(M.c(zVar3, false, false).f50395a));
                            if (metadataA2 == null) {
                                metadata = metadataB;
                            } else {
                                if (metadataB != null) {
                                    metadataA2 = metadataA2.a(metadataB.f47361b);
                                }
                                metadata = metadataA2;
                            }
                            aVar.f51847a = new x(xVar2.f51891a, xVar2.f51892b, xVar2.f51893c, xVar2.f51894d, xVar2.f51895e, xVar2.f51897g, xVar2.f51898h, xVar2.f51900j, xVar2.f51901k, metadata);
                        } else if (iG2 == 6) {
                            z zVar4 = new z(iG3);
                            c23191j2.d(zVar4.f47962a, 0, iG3, false);
                            zVar4.G(4);
                            Metadata metadata3 = new Metadata(AbstractC37401r1.E(PictureFrame.a(zVar4)));
                            if (metadataA2 != null) {
                                metadata3 = metadataA2.a(metadata3.f47361b);
                            }
                            aVar.f51847a = new x(xVar2.f51891a, xVar2.f51892b, xVar2.f51893c, xVar2.f51894d, xVar2.f51895e, xVar2.f51897g, xVar2.f51898h, xVar2.f51900j, xVar2.f51901k, metadata3);
                        } else {
                            c23191j2.i(iG3);
                        }
                    }
                }
                x xVar3 = aVar.f51847a;
                int i14 = androidx.media3.common.util.M.f47887a;
                this.f50531i = xVar3;
                z13 = zF2;
                i13 = 3;
                i = 7;
            }
            this.f50531i.getClass();
            this.f50532j = Math.max(this.f50531i.f51893c, 6);
            androidx.media3.extractor.J j15 = this.f50528f;
            int i15 = androidx.media3.common.util.M.f47887a;
            j15.b(this.f50531i.c(bArr, this.f50530h));
            this.f50529g = 4;
            return 0;
        }
        if (i12 == 4) {
            ((C23191j) qVar).f50585f = 0;
            z zVar5 = new z(2);
            C23191j c23191j3 = (C23191j) qVar;
            c23191j3.a(zVar5.f47962a, 0, 2, false);
            int iZ2 = zVar5.z();
            if ((iZ2 >> 2) != 16382) {
                c23191j3.f50585f = 0;
                throw ParserException.a("First frame does not start with sync code.", null);
            }
            c23191j3.f50585f = 0;
            this.f50533k = iZ2;
            r rVar = this.f50527e;
            int i16 = androidx.media3.common.util.M.f47887a;
            long j16 = c23191j3.f50583d;
            this.f50531i.getClass();
            x xVar4 = this.f50531i;
            if (xVar4.f51901k != null) {
                bVar = new w(xVar4, j16);
            } else {
                long j17 = c23191j3.f50582c;
                if (j17 == -1 || xVar4.f51900j <= 0) {
                    bVar = new H.b(xVar4.b());
                } else {
                    int i17 = this.f50533k;
                    Ae0.c cVar2 = new Ae0.c(xVar4, 13);
                    a.b bVar2 = new a.b(xVar4, i17, null);
                    long jB2 = xVar4.b();
                    int i18 = xVar4.f51893c;
                    int i19 = xVar4.f51894d;
                    if (i19 > 0) {
                        cVar = cVar2;
                        j12 = (i19 + i18) / 2;
                        j13 = 1;
                    } else {
                        cVar = cVar2;
                        int i22 = xVar4.f51892b;
                        int i23 = xVar4.f51891a;
                        j12 = ((((i23 != i22 || i23 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i23) * xVar4.f51897g) * xVar4.f51898h) / 8;
                        j13 = 64;
                    }
                    androidx.media3.extractor.flac.a aVar2 = new androidx.media3.extractor.flac.a(cVar, bVar2, jB2, xVar4.f51900j, j16, j17, j12 + j13, Math.max(6, i18));
                    this.f50534l = aVar2;
                    bVar = aVar2.f50498a;
                }
            }
            rVar.e(bVar);
            this.f50529g = 5;
            return 0;
        }
        if (i12 != 5) {
            throw new IllegalStateException();
        }
        this.f50528f.getClass();
        this.f50531i.getClass();
        androidx.media3.extractor.flac.a aVar3 = this.f50534l;
        if (aVar3 != null && aVar3.f50500c != null) {
            return aVar3.a((C23191j) qVar, f12);
        }
        if (this.f50536n == -1) {
            x xVar5 = this.f50531i;
            ((C23191j) qVar).f50585f = 0;
            C23191j c23191j4 = (C23191j) qVar;
            c23191j4.k(1, false);
            byte[] bArr4 = new byte[1];
            c23191j4.a(bArr4, 0, 1, false);
            boolean z14 = (bArr4[0] & 1) == 1;
            c23191j4.k(2, false);
            i = z14 ? 7 : 6;
            z zVar6 = new z(i);
            byte[] bArr5 = zVar6.f47962a;
            int i24 = 0;
            while (i24 < i) {
                int iM2 = c23191j4.m(i24, i - i24, bArr5);
                if (iM2 == -1) {
                    break;
                }
                i24 += iM2;
            }
            zVar6.E(i24);
            c23191j4.f50585f = 0;
            u.a aVar4 = new u.a();
            try {
                long jA2 = zVar6.A();
                if (!z14) {
                    jA2 *= xVar5.f51892b;
                }
                aVar4.f51846a = jA2;
                this.f50536n = jA2;
                return 0;
            } catch (NumberFormatException unused) {
                throw ParserException.a(null, null);
            }
        }
        z zVar7 = this.f50524b;
        int i25 = zVar7.f47964c;
        if (i25 < 32768) {
            int i26 = ((C23191j) qVar).read(zVar7.f47962a, i25, 32768 - i25);
            z12 = i26 == -1;
            if (!z12) {
                zVar7.E(i25 + i26);
            } else if (zVar7.a() == 0) {
                long j18 = this.f50536n * 1000000;
                x xVar6 = this.f50531i;
                int i27 = androidx.media3.common.util.M.f47887a;
                this.f50528f.f(j18 / xVar6.f51895e, 1, this.f50535m, 0, null);
                return -1;
            }
        } else {
            z12 = false;
        }
        int i28 = zVar7.f47963b;
        int i29 = this.f50535m;
        int i32 = this.f50532j;
        if (i29 < i32) {
            zVar7.G(Math.min(i32 - i29, zVar7.a()));
        }
        this.f50531i.getClass();
        int i33 = zVar7.f47963b;
        while (true) {
            int i34 = zVar7.f47964c - 16;
            u.a aVar5 = this.f50526d;
            if (i33 <= i34) {
                zVar7.F(i33);
                if (u.a(zVar7, this.f50531i, this.f50533k, aVar5)) {
                    zVar7.F(i33);
                    j14 = aVar5.f51846a;
                    break;
                }
                i33++;
            } else {
                if (z12) {
                    while (true) {
                        int i35 = zVar7.f47964c;
                        if (i33 > i35 - this.f50532j) {
                            zVar7.F(i35);
                            break;
                        }
                        zVar7.F(i33);
                        try {
                            zA2 = u.a(zVar7, this.f50531i, this.f50533k, aVar5);
                        } catch (IndexOutOfBoundsException unused2) {
                            zA2 = false;
                        }
                        if (zVar7.f47963b > zVar7.f47964c) {
                            zA2 = false;
                        }
                        if (zA2) {
                            zVar7.F(i33);
                            j14 = aVar5.f51846a;
                            break;
                        }
                        i33++;
                    }
                } else {
                    zVar7.F(i33);
                }
                j14 = -1;
            }
        }
        int i36 = zVar7.f47963b - i28;
        zVar7.F(i28);
        this.f50528f.e(i36, zVar7);
        int i37 = i36 + this.f50535m;
        this.f50535m = i37;
        if (j14 != -1) {
            long j19 = this.f50536n * 1000000;
            x xVar7 = this.f50531i;
            int i38 = androidx.media3.common.util.M.f47887a;
            this.f50528f.f(j19 / xVar7.f51895e, 1, i37, 0, null);
            this.f50535m = 0;
            this.f50536n = j14;
        }
        if (zVar7.a() >= 16) {
            return 0;
        }
        int iA2 = zVar7.a();
        byte[] bArr6 = zVar7.f47962a;
        System.arraycopy(bArr6, zVar7.f47963b, bArr6, 0, iA2);
        zVar7.F(0);
        zVar7.E(iA2);
        return 0;
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        this.f50527e = rVar;
        this.f50528f = rVar.c(0, 1);
        rVar.b();
    }

    public c(int i12) {
        this.f50523a = new byte[42];
        this.f50524b = new z(new byte[32768], 0);
        this.f50525c = false;
        this.f50526d = new u.a();
        this.f50529g = 0;
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}
