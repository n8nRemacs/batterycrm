package androidx.media3.extractor.flv;

import androidx.media3.common.util.J;
import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: FlvExtractor.java */
@J
/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: f, reason: collision with root package name */
    public r f50547f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f50549h;

    /* renamed from: i, reason: collision with root package name */
    public long f50550i;

    /* renamed from: j, reason: collision with root package name */
    public int f50551j;

    /* renamed from: k, reason: collision with root package name */
    public int f50552k;

    /* renamed from: l, reason: collision with root package name */
    public int f50553l;

    /* renamed from: m, reason: collision with root package name */
    public long f50554m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f50555n;

    /* renamed from: o, reason: collision with root package name */
    public a f50556o;

    /* renamed from: p, reason: collision with root package name */
    public d f50557p;

    /* renamed from: a, reason: collision with root package name */
    public final z f50542a = new z(4);

    /* renamed from: b, reason: collision with root package name */
    public final z f50543b = new z(9);

    /* renamed from: c, reason: collision with root package name */
    public final z f50544c = new z(11);

    /* renamed from: d, reason: collision with root package name */
    public final z f50545d = new z();

    /* renamed from: e, reason: collision with root package name */
    public final c f50546e = new c();

    /* renamed from: g, reason: collision with root package name */
    public int f50548g = 1;

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        if (j12 == 0) {
            this.f50548g = 1;
            this.f50549h = false;
        } else {
            this.f50548g = 3;
        }
        this.f50551j = 0;
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) throws EOFException, InterruptedIOException {
        z zVar = this.f50542a;
        C23191j c23191j = (C23191j) qVar;
        c23191j.a(zVar.f47962a, 0, 3, false);
        zVar.F(0);
        if (zVar.w() != 4607062) {
            return false;
        }
        c23191j.a(zVar.f47962a, 0, 2, false);
        zVar.F(0);
        if ((zVar.z() & 250) != 0) {
            return false;
        }
        c23191j.a(zVar.f47962a, 0, 4, false);
        zVar.F(0);
        int iG2 = zVar.g();
        c23191j.f50585f = 0;
        c23191j.k(iG2, false);
        c23191j.a(zVar.f47962a, 0, 4, false);
        zVar.F(0);
        return zVar.g() == 0;
    }

    public final z c(C23191j c23191j) throws EOFException, InterruptedIOException {
        int i12 = this.f50553l;
        z zVar = this.f50545d;
        byte[] bArr = zVar.f47962a;
        if (i12 > bArr.length) {
            zVar.D(0, new byte[Math.max(bArr.length * 2, i12)]);
        } else {
            zVar.F(0);
        }
        zVar.E(this.f50553l);
        c23191j.d(zVar.f47962a, 0, this.f50553l, false);
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0266  */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.media3.extractor.q r30, androidx.media3.extractor.F r31) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.flv.b.h(androidx.media3.extractor.q, androidx.media3.extractor.F):int");
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        this.f50547f = rVar;
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}
