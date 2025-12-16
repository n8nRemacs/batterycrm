package com.google.android.exoplayer2.text.pgs;

import com.google.android.exoplayer2.text.h;
import java.util.List;

/* compiled from: PgsSubtitle.java */
/* loaded from: classes6.dex */
final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.text.a> f346946b;

    public b(List<com.google.android.exoplayer2.text.a> list) {
        this.f346946b = list;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final long a(int i12) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int b() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int c(long j12) {
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final List<com.google.android.exoplayer2.text.a> d(long j12) {
        return this.f346946b;
    }
}
