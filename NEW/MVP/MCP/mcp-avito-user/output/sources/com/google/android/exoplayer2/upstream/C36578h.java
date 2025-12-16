package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import j.P;

/* compiled from: ByteArrayDataSource.java */
/* renamed from: com.google.android.exoplayer2.upstream.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36578h extends AbstractC36575e {

    /* renamed from: e, reason: collision with root package name */
    @P
    public Uri f347916e;

    /* renamed from: f, reason: collision with root package name */
    public int f347917f;

    /* renamed from: g, reason: collision with root package name */
    public int f347918g;

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        this.f347916e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) {
        this.f347916e = pVar.f347929a;
        n(pVar);
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return this.f347916e;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        int i14 = this.f347918g;
        if (i14 == 0) {
            return -1;
        }
        int iMin = Math.min(i13, i14);
        System.arraycopy(null, this.f347917f, bArr, i12, iMin);
        this.f347917f += iMin;
        this.f347918g -= iMin;
        l(iMin);
        return iMin;
    }
}
