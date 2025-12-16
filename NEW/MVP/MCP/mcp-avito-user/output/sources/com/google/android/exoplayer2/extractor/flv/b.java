package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.f;
import com.google.android.exoplayer2.extractor.j;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.util.F;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: FlvExtractor.java */
/* loaded from: classes6.dex */
public final class b implements j {

    /* renamed from: f, reason: collision with root package name */
    public l f344526f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f344528h;

    /* renamed from: i, reason: collision with root package name */
    public long f344529i;

    /* renamed from: j, reason: collision with root package name */
    public int f344530j;

    /* renamed from: k, reason: collision with root package name */
    public int f344531k;

    /* renamed from: l, reason: collision with root package name */
    public int f344532l;

    /* renamed from: m, reason: collision with root package name */
    public long f344533m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f344534n;

    /* renamed from: o, reason: collision with root package name */
    public a f344535o;

    /* renamed from: p, reason: collision with root package name */
    public d f344536p;

    /* renamed from: a, reason: collision with root package name */
    public final F f344521a = new F(4);

    /* renamed from: b, reason: collision with root package name */
    public final F f344522b = new F(9);

    /* renamed from: c, reason: collision with root package name */
    public final F f344523c = new F(11);

    /* renamed from: d, reason: collision with root package name */
    public final F f344524d = new F();

    /* renamed from: e, reason: collision with root package name */
    public final c f344525e = new c();

    /* renamed from: g, reason: collision with root package name */
    public int f344527g = 1;

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        if (j12 == 0) {
            this.f344527g = 1;
            this.f344528h = false;
        } else {
            this.f344527g = 3;
        }
        this.f344530j = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(l lVar) {
        this.f344526f = lVar;
    }

    public final F c(f fVar) throws EOFException, InterruptedIOException {
        int i12 = this.f344532l;
        F f12 = this.f344524d;
        byte[] bArr = f12.f348070a;
        if (i12 > bArr.length) {
            f12.z(0, new byte[Math.max(bArr.length * 2, i12)]);
        } else {
            f12.B(0);
        }
        f12.A(this.f344532l);
        fVar.d(f12.f348070a, 0, this.f344532l, false);
        return f12;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(k kVar) throws EOFException, InterruptedIOException {
        F f12 = this.f344521a;
        f fVar = (f) kVar;
        fVar.a(f12.f348070a, 0, 3, false);
        f12.B(0);
        if (f12.t() != 4607062) {
            return false;
        }
        fVar.a(f12.f348070a, 0, 2, false);
        f12.B(0);
        if ((f12.w() & 250) != 0) {
            return false;
        }
        fVar.a(f12.f348070a, 0, 4, false);
        f12.B(0);
        int iD2 = f12.d();
        fVar.f344497f = 0;
        fVar.l(iD2, false);
        fVar.a(f12.f348070a, 0, 4, false);
        f12.B(0);
        return f12.d() == 0;
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
    @Override // com.google.android.exoplayer2.extractor.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.exoplayer2.extractor.k r30, com.google.android.exoplayer2.extractor.w r31) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flv.b.i(com.google.android.exoplayer2.extractor.k, com.google.android.exoplayer2.extractor.w):int");
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
