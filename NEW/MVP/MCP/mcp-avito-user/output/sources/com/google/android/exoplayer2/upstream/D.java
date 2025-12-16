package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import j.P;
import java.util.List;
import java.util.Map;

/* compiled from: PriorityDataSource.java */
/* loaded from: classes6.dex */
public final class D implements InterfaceC36583m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36583m f347723a;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityTaskManager f347724b;

    /* renamed from: c, reason: collision with root package name */
    public final int f347725c;

    /* compiled from: PriorityDataSource.java */
    public static final class a implements InterfaceC36583m.a {
        @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m.a
        public final InterfaceC36583m a() {
            throw null;
        }
    }

    public D(InterfaceC36583m interfaceC36583m, PriorityTaskManager priorityTaskManager, int i12) {
        this.f347723a = interfaceC36583m;
        this.f347724b = priorityTaskManager;
        this.f347725c = i12;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final Map<String, List<String>> c() {
        return this.f347723a.c();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        this.f347723a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) {
        this.f347724b.a(this.f347725c);
        return this.f347723a.e(pVar);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return this.f347723a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void k(M m12) {
        m12.getClass();
        this.f347723a.k(m12);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) {
        this.f347724b.a(this.f347725c);
        return this.f347723a.read(bArr, i12, i13);
    }
}
