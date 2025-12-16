package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.source.G;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.util.C36585a;
import java.util.List;
import java.util.Map;

/* compiled from: IcyDataSource.java */
/* renamed from: com.google.android.exoplayer2.source.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36553p implements InterfaceC36583m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36583m f346656a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346657b;

    /* renamed from: c, reason: collision with root package name */
    public final a f346658c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f346659d;

    /* renamed from: e, reason: collision with root package name */
    public int f346660e;

    /* compiled from: IcyDataSource.java */
    /* renamed from: com.google.android.exoplayer2.source.p$a */
    public interface a {
    }

    public C36553p(InterfaceC36583m interfaceC36583m, int i12, a aVar) {
        C36585a.b(i12 > 0);
        this.f346656a = interfaceC36583m;
        this.f346657b = i12;
        this.f346658c = aVar;
        this.f346659d = new byte[1];
        this.f346660e = i12;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final Map<String, List<String>> c() {
        return this.f346656a.c();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(com.google.android.exoplayer2.upstream.p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @j.P
    public final Uri getUri() {
        return this.f346656a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void k(com.google.android.exoplayer2.upstream.M m12) {
        m12.getClass();
        this.f346656a.k(m12);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) {
        long jMax;
        int i14 = this.f346660e;
        InterfaceC36583m interfaceC36583m = this.f346656a;
        if (i14 == 0) {
            byte[] bArr2 = this.f346659d;
            int i15 = 0;
            if (interfaceC36583m.read(bArr2, 0, 1) != -1) {
                int i16 = (bArr2[0] & 255) << 4;
                if (i16 != 0) {
                    byte[] bArr3 = new byte[i16];
                    int i17 = i16;
                    while (i17 > 0) {
                        int i18 = interfaceC36583m.read(bArr3, i15, i17);
                        if (i18 != -1) {
                            i15 += i18;
                            i17 -= i18;
                        }
                    }
                    while (i16 > 0 && bArr3[i16 - 1] == 0) {
                        i16--;
                    }
                    if (i16 > 0) {
                        com.google.android.exoplayer2.util.F f12 = new com.google.android.exoplayer2.util.F(bArr3, i16);
                        G.a aVar = (G.a) this.f346658c;
                        if (aVar.f345996n) {
                            Map<String, String> map = G.f345943N;
                            jMax = Math.max(G.this.n(), aVar.f345992j);
                        } else {
                            jMax = aVar.f345992j;
                        }
                        long j12 = jMax;
                        int iA2 = f12.a();
                        L l12 = aVar.f345995m;
                        l12.getClass();
                        l12.e(iA2, f12);
                        l12.f(j12, 1, iA2, 0, null);
                        aVar.f345996n = true;
                    }
                }
                this.f346660e = this.f346657b;
            }
            return -1;
        }
        int i19 = interfaceC36583m.read(bArr, i12, Math.min(this.f346660e, i13));
        if (i19 != -1) {
            this.f346660e -= i19;
        }
        return i19;
    }
}
