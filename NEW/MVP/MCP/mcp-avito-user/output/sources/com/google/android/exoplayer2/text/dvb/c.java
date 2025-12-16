package com.google.android.exoplayer2.text.dvb;

import com.google.android.exoplayer2.text.h;
import java.util.List;

/* compiled from: DvbSubtitle.java */
/* loaded from: classes6.dex */
final class c implements h {

    /* renamed from: b, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.text.a> f346899b;

    public c(List<com.google.android.exoplayer2.text.a> list) {
        this.f346899b = list;
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
        return this.f346899b;
    }
}
