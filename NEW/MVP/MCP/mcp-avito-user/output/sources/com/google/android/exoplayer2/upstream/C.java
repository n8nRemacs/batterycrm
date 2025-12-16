package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import j.P;
import java.io.IOException;

/* compiled from: PlaceholderDataSource.java */
/* loaded from: classes6.dex */
public final class C implements InterfaceC36583m {

    /* renamed from: a, reason: collision with root package name */
    public static final C f347716a = new C();

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void k(M m12) {
    }
}
