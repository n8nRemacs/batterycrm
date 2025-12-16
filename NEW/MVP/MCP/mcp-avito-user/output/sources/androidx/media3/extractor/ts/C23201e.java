package androidx.media3.extractor.ts;

import androidx.media3.common.util.J;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.ts.D;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: AdtsExtractor.java */
@J
/* renamed from: androidx.media3.extractor.ts.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23201e implements androidx.media3.extractor.p {

    /* renamed from: a, reason: collision with root package name */
    public final int f51575a;

    /* renamed from: b, reason: collision with root package name */
    public final C23202f f51576b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.util.z f51577c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.common.util.z f51578d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.media3.common.util.y f51579e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.media3.extractor.r f51580f;

    /* renamed from: g, reason: collision with root package name */
    public long f51581g;

    /* renamed from: h, reason: collision with root package name */
    public long f51582h;

    /* renamed from: i, reason: collision with root package name */
    public int f51583i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f51584j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f51585k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f51586l;

    /* compiled from: AdtsExtractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.extractor.ts.e$a */
    public @interface a {
    }

    public C23201e() {
        this(0);
    }

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        this.f51585k = false;
        this.f51576b.a();
        this.f51581g = j13;
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(androidx.media3.extractor.q qVar) throws EOFException, InterruptedIOException {
        C23191j c23191j = (C23191j) qVar;
        int iC2 = c(c23191j);
        int i12 = iC2;
        int i13 = 0;
        int i14 = 0;
        do {
            androidx.media3.common.util.z zVar = this.f51578d;
            c23191j.a(zVar.f47962a, 0, 2, false);
            zVar.F(0);
            if ((zVar.z() & 65526) == 65520) {
                i13++;
                if (i13 >= 4 && i14 > 188) {
                    return true;
                }
                c23191j.a(zVar.f47962a, 0, 4, false);
                androidx.media3.common.util.y yVar = this.f51579e;
                yVar.l(14);
                int iG2 = yVar.g(13);
                if (iG2 <= 6) {
                    i12++;
                    c23191j.f50585f = 0;
                    c23191j.k(i12, false);
                } else {
                    c23191j.k(iG2 - 6, false);
                    i14 += iG2;
                }
            } else {
                i12++;
                c23191j.f50585f = 0;
                c23191j.k(i12, false);
            }
            i13 = 0;
            i14 = 0;
        } while (i12 - iC2 < 8192);
        return false;
    }

    public final int c(C23191j c23191j) throws EOFException, InterruptedIOException {
        int i12 = 0;
        while (true) {
            androidx.media3.common.util.z zVar = this.f51578d;
            c23191j.a(zVar.f47962a, 0, 10, false);
            zVar.F(0);
            if (zVar.w() != 4801587) {
                break;
            }
            zVar.G(3);
            int iT2 = zVar.t();
            i12 += iT2 + 10;
            c23191j.k(iT2, false);
        }
        c23191j.f50585f = 0;
        c23191j.k(i12, false);
        if (this.f51582h == -1) {
            this.f51582h = i12;
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.media3.extractor.q r19, androidx.media3.extractor.F r20) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.C23201e.h(androidx.media3.extractor.q, androidx.media3.extractor.F):int");
    }

    @Override // androidx.media3.extractor.p
    public final void i(androidx.media3.extractor.r rVar) {
        this.f51580f = rVar;
        this.f51576b.e(rVar, new D.e(0, 1));
        rVar.b();
    }

    public C23201e(int i12) {
        this.f51575a = i12;
        this.f51576b = new C23202f(true, null);
        this.f51577c = new androidx.media3.common.util.z(2048);
        this.f51583i = -1;
        this.f51582h = -1L;
        androidx.media3.common.util.z zVar = new androidx.media3.common.util.z(10);
        this.f51578d = zVar;
        byte[] bArr = zVar.f47962a;
        this.f51579e = new androidx.media3.common.util.y(bArr, bArr.length);
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}
