package androidx.media3.extractor.mp3;

import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.J;
import androidx.media3.common.util.z;
import androidx.media3.extractor.B;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.C23196o;
import androidx.media3.extractor.D;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Mp3Extractor.java */
@J
/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f50879u = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f50880a;

    /* renamed from: b, reason: collision with root package name */
    public final long f50881b;

    /* renamed from: c, reason: collision with root package name */
    public final z f50882c;

    /* renamed from: d, reason: collision with root package name */
    public final D.a f50883d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.media3.extractor.z f50884e;

    /* renamed from: f, reason: collision with root package name */
    public final B f50885f;

    /* renamed from: g, reason: collision with root package name */
    public final C23196o f50886g;

    /* renamed from: h, reason: collision with root package name */
    public r f50887h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.media3.extractor.J f50888i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.media3.extractor.J f50889j;

    /* renamed from: k, reason: collision with root package name */
    public int f50890k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public Metadata f50891l;

    /* renamed from: m, reason: collision with root package name */
    public long f50892m;

    /* renamed from: n, reason: collision with root package name */
    public long f50893n;

    /* renamed from: o, reason: collision with root package name */
    public long f50894o;

    /* renamed from: p, reason: collision with root package name */
    public int f50895p;

    /* renamed from: q, reason: collision with root package name */
    public e f50896q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f50897r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f50898s;

    /* renamed from: t, reason: collision with root package name */
    public long f50899t;

    /* compiled from: Mp3Extractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public d() {
        this(0);
    }

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        this.f50890k = 0;
        this.f50892m = -9223372036854775807L;
        this.f50893n = 0L;
        this.f50895p = 0;
        this.f50899t = j13;
        e eVar = this.f50896q;
        if (!(eVar instanceof b) || ((b) eVar).a(j13)) {
            return;
        }
        this.f50898s = true;
        this.f50889j = this.f50886g;
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) {
        return e((C23191j) qVar, true);
    }

    public final androidx.media3.extractor.mp3.a c(C23191j c23191j, boolean z12) {
        z zVar = this.f50882c;
        c23191j.a(zVar.f47962a, 0, 4, false);
        zVar.F(0);
        int iG2 = zVar.g();
        D.a aVar = this.f50883d;
        aVar.a(iG2);
        return new androidx.media3.extractor.mp3.a(aVar.f50370f, aVar.f50367c, c23191j.f50582c, c23191j.f50583d, z12);
    }

    public final boolean d(C23191j c23191j) {
        e eVar = this.f50896q;
        if (eVar != null) {
            long jC2 = eVar.c();
            if (jC2 != -1 && c23191j.g() > jC2 - 4) {
                return true;
            }
        }
        try {
            return !c23191j.a(this.f50882c.f47962a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean e(C23191j c23191j, boolean z12) throws ParserException, EOFException, InterruptedIOException {
        int iG2;
        int i12;
        int iA2;
        int i13 = z12 ? 32768 : 131072;
        c23191j.f50585f = 0;
        if (c23191j.f50583d == 0) {
            Metadata metadataA = this.f50885f.a(c23191j, null);
            this.f50891l = metadataA;
            if (metadataA != null) {
                this.f50884e.b(metadataA);
            }
            iG2 = (int) c23191j.g();
            if (!z12) {
                c23191j.i(iG2);
            }
            i12 = 0;
        } else {
            iG2 = 0;
            i12 = 0;
        }
        int i14 = i12;
        int i15 = i14;
        while (true) {
            if (!d(c23191j)) {
                z zVar = this.f50882c;
                zVar.F(0);
                int iG3 = zVar.g();
                if ((i12 == 0 || ((-128000) & iG3) == (i12 & (-128000))) && (iA2 = D.a(iG3)) != -1) {
                    i14++;
                    if (i14 != 1) {
                        if (i14 == 4) {
                            break;
                        }
                    } else {
                        this.f50883d.a(iG3);
                        i12 = iG3;
                    }
                    c23191j.k(iA2 - 4, false);
                } else {
                    int i16 = i15 + 1;
                    if (i15 == i13) {
                        if (z12) {
                            return false;
                        }
                        throw ParserException.a("Searched too many bytes.", null);
                    }
                    if (z12) {
                        c23191j.f50585f = 0;
                        c23191j.k(iG2 + i16, false);
                    } else {
                        c23191j.i(1);
                    }
                    i14 = 0;
                    i15 = i16;
                    i12 = 0;
                }
            } else if (i14 <= 0) {
                throw new EOFException();
            }
        }
        if (z12) {
            c23191j.i(iG2 + i15);
        } else {
            c23191j.f50585f = 0;
        }
        this.f50890k = i12;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0289 A[LOOP:2: B:124:0x0287->B:125:0x0289, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.media3.extractor.q r39, androidx.media3.extractor.F r40) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp3.d.h(androidx.media3.extractor.q, androidx.media3.extractor.F):int");
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        this.f50887h = rVar;
        androidx.media3.extractor.J jC2 = rVar.c(0, 1);
        this.f50888i = jC2;
        this.f50889j = jC2;
        this.f50887h.b();
    }

    public d(int i12) {
        this.f50880a = i12;
        this.f50881b = -9223372036854775807L;
        this.f50882c = new z(10);
        this.f50883d = new D.a();
        this.f50884e = new androidx.media3.extractor.z();
        this.f50892m = -9223372036854775807L;
        this.f50885f = new B();
        C23196o c23196o = new C23196o();
        this.f50886g = c23196o;
        this.f50889j = c23196o;
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}
