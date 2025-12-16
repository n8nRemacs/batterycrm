package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.O;
import com.google.common.base.C37257c;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2;

/* compiled from: HlsMediaChunk.java */
/* loaded from: classes6.dex */
final class l extends com.google.android.exoplayer2.source.chunk.m {

    /* renamed from: M, reason: collision with root package name */
    public static final AtomicInteger f346323M = new AtomicInteger();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f346324A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f346325B;

    /* renamed from: C, reason: collision with root package name */
    public final com.google.android.exoplayer2.analytics.p f346326C;

    /* renamed from: D, reason: collision with root package name */
    public m f346327D;

    /* renamed from: E, reason: collision with root package name */
    public q f346328E;

    /* renamed from: F, reason: collision with root package name */
    public int f346329F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f346330G;

    /* renamed from: H, reason: collision with root package name */
    public volatile boolean f346331H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f346332I;

    /* renamed from: J, reason: collision with root package name */
    public AbstractC37401r1<Integer> f346333J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f346334K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f346335L;

    /* renamed from: k, reason: collision with root package name */
    public final int f346336k;

    /* renamed from: l, reason: collision with root package name */
    public final int f346337l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f346338m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f346339n;

    /* renamed from: o, reason: collision with root package name */
    public final int f346340o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public final InterfaceC36583m f346341p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public final com.google.android.exoplayer2.upstream.p f346342q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public final m f346343r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f346344s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f346345t;

    /* renamed from: u, reason: collision with root package name */
    public final O f346346u;

    /* renamed from: v, reason: collision with root package name */
    public final j f346347v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public final List<I> f346348w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public final DrmInitData f346349x;

    /* renamed from: y, reason: collision with root package name */
    public final com.google.android.exoplayer2.metadata.id3.a f346350y;

    /* renamed from: z, reason: collision with root package name */
    public final F f346351z;

    public l(j jVar, InterfaceC36583m interfaceC36583m, com.google.android.exoplayer2.upstream.p pVar, I i12, boolean z12, @P InterfaceC36583m interfaceC36583m2, @P com.google.android.exoplayer2.upstream.p pVar2, boolean z13, Uri uri, @P List<I> list, int i13, @P Object obj, long j12, long j13, long j14, int i14, boolean z14, int i15, boolean z15, boolean z16, O o12, @P DrmInitData drmInitData, @P m mVar, com.google.android.exoplayer2.metadata.id3.a aVar, F f12, boolean z17, com.google.android.exoplayer2.analytics.p pVar3) {
        super(interfaceC36583m, pVar, i12, i13, obj, j12, j13, j14);
        this.f346324A = z12;
        this.f346340o = i14;
        this.f346335L = z14;
        this.f346337l = i15;
        this.f346342q = pVar2;
        this.f346341p = interfaceC36583m2;
        this.f346330G = pVar2 != null;
        this.f346325B = z13;
        this.f346338m = uri;
        this.f346344s = z16;
        this.f346346u = o12;
        this.f346345t = z15;
        this.f346347v = jVar;
        this.f346348w = list;
        this.f346349x = drmInitData;
        this.f346343r = mVar;
        this.f346350y = aVar;
        this.f346351z = f12;
        this.f346339n = z17;
        this.f346326C = pVar3;
        this.f346333J = AbstractC37401r1.C();
        this.f346336k = f346323M.getAndIncrement();
    }

    public static byte[] c(String str) {
        if (C37257c.b(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
        this.f346331H = true;
    }

    @v61.m
    public final void b(InterfaceC36583m interfaceC36583m, com.google.android.exoplayer2.upstream.p pVar, boolean z12, boolean z13) {
        com.google.android.exoplayer2.upstream.p pVarB;
        long j12;
        long j13;
        if (z12) {
            z = this.f346329F != 0;
            pVarB = pVar;
        } else {
            long j14 = this.f346329F;
            long j15 = pVar.f347935g;
            pVarB = pVar.b(j14, j15 != -1 ? j15 - j14 : -1L);
        }
        try {
            com.google.android.exoplayer2.extractor.f fVarE = e(interfaceC36583m, pVarB, z13);
            if (z) {
                fVarE.i(this.f346329F);
            }
            while (!this.f346331H && this.f346327D.a(fVarE)) {
                try {
                    try {
                    } catch (Throwable th2) {
                        this.f346329F = (int) (fVarE.f344495d - pVar.f347934f);
                        throw th2;
                    }
                } catch (EOFException e12) {
                    if ((this.f346221d.f343469f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                        throw e12;
                    }
                    this.f346327D.f();
                    j12 = fVarE.f344495d;
                    j13 = pVar.f347934f;
                }
            }
            j12 = fVarE.f344495d;
            j13 = pVar.f347934f;
            this.f346329F = (int) (j12 - j13);
        } finally {
            com.google.android.exoplayer2.upstream.o.a(interfaceC36583m);
        }
    }

    public final int d(int i12) {
        C36585a.d(!this.f346339n);
        if (i12 >= this.f346333J.size()) {
            return 0;
        }
        return this.f346333J.get(i12).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    @v61.InterfaceC49173d
    @v61.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.extractor.f e(com.google.android.exoplayer2.upstream.InterfaceC36583m r21, com.google.android.exoplayer2.upstream.p r22, boolean r23) throws java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.l.e(com.google.android.exoplayer2.upstream.m, com.google.android.exoplayer2.upstream.p, boolean):com.google.android.exoplayer2.extractor.f");
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() {
        m mVar;
        this.f346328E.getClass();
        if (this.f346327D == null && (mVar = this.f346343r) != null && mVar.c()) {
            this.f346327D = this.f346343r;
            this.f346330G = false;
        }
        if (this.f346330G) {
            InterfaceC36583m interfaceC36583m = this.f346341p;
            interfaceC36583m.getClass();
            com.google.android.exoplayer2.upstream.p pVar = this.f346342q;
            pVar.getClass();
            b(interfaceC36583m, pVar, this.f346325B, false);
            this.f346329F = 0;
            this.f346330G = false;
        }
        if (this.f346331H) {
            return;
        }
        if (!this.f346345t) {
            b(this.f346226i, this.f346219b, this.f346324A, true);
        }
        this.f346332I = !this.f346331H;
    }
}
