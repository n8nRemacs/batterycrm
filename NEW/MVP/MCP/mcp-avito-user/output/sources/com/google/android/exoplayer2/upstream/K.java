package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import j.P;
import java.util.List;
import java.util.Map;

/* compiled from: TeeDataSource.java */
/* loaded from: classes6.dex */
public final class K implements InterfaceC36583m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36583m f347755a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36582l f347756b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f347757c;

    /* renamed from: d, reason: collision with root package name */
    public long f347758d;

    public K(InterfaceC36583m interfaceC36583m, InterfaceC36582l interfaceC36582l) {
        this.f347755a = interfaceC36583m;
        this.f347756b = interfaceC36582l;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final Map<String, List<String>> c() {
        return this.f347755a.c();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        InterfaceC36582l interfaceC36582l = this.f347756b;
        try {
            this.f347755a.close();
        } finally {
            if (this.f347757c) {
                this.f347757c = false;
                interfaceC36582l.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) {
        long jE2 = this.f347755a.e(pVar);
        this.f347758d = jE2;
        if (jE2 == 0) {
            return 0L;
        }
        if (pVar.f347935g == -1 && jE2 != -1) {
            pVar = pVar.b(0L, jE2);
        }
        this.f347757c = true;
        this.f347756b.e(pVar);
        return this.f347758d;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return this.f347755a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void k(M m12) {
        m12.getClass();
        this.f347755a.k(m12);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) {
        if (this.f347758d == 0) {
            return -1;
        }
        int i14 = this.f347755a.read(bArr, i12, i13);
        if (i14 > 0) {
            this.f347756b.write(bArr, i12, i14);
            long j12 = this.f347758d;
            if (j12 != -1) {
                this.f347758d = j12 - i14;
            }
        }
        return i14;
    }
}
