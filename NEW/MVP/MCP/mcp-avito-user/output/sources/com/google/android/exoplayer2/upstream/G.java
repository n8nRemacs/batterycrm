package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import j.P;
import java.util.List;
import java.util.Map;

/* compiled from: ResolvingDataSource.java */
/* loaded from: classes6.dex */
public final class G implements InterfaceC36583m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f347732a;

    /* compiled from: ResolvingDataSource.java */
    public static final class a implements InterfaceC36583m.a {
        @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m.a
        public final InterfaceC36583m a() {
            throw null;
        }
    }

    /* compiled from: ResolvingDataSource.java */
    public interface b {
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final Map<String, List<String>> c() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        if (this.f347732a) {
            this.f347732a = false;
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void k(M m12) {
        m12.getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) {
        throw null;
    }
}
