package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import j.P;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: StatsDataSource.java */
/* loaded from: classes6.dex */
public final class J implements InterfaceC36583m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36583m f347751a;

    /* renamed from: b, reason: collision with root package name */
    public long f347752b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f347753c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f347754d;

    public J(InterfaceC36583m interfaceC36583m) {
        interfaceC36583m.getClass();
        this.f347751a = interfaceC36583m;
        this.f347753c = Uri.EMPTY;
        this.f347754d = Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final Map<String, List<String>> c() {
        return this.f347751a.c();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        this.f347751a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) {
        this.f347753c = pVar.f347929a;
        this.f347754d = Collections.emptyMap();
        InterfaceC36583m interfaceC36583m = this.f347751a;
        long jE2 = interfaceC36583m.e(pVar);
        Uri uri = interfaceC36583m.getUri();
        uri.getClass();
        this.f347753c = uri;
        this.f347754d = interfaceC36583m.c();
        return jE2;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return this.f347751a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void k(M m12) {
        m12.getClass();
        this.f347751a.k(m12);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) {
        int i14 = this.f347751a.read(bArr, i12, i13);
        if (i14 != -1) {
            this.f347752b += i14;
        }
        return i14;
    }
}
