package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.text.h;
import com.google.android.exoplayer2.util.C36585a;
import java.util.Collections;
import java.util.List;

/* compiled from: CeaSubtitle.java */
/* loaded from: classes6.dex */
final class f implements h {

    /* renamed from: b, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.text.a> f346845b;

    public f(List<com.google.android.exoplayer2.text.a> list) {
        this.f346845b = list;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final long a(int i12) {
        C36585a.b(i12 == 0);
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int b() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final int c(long j12) {
        return j12 < 0 ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.text.h
    public final List<com.google.android.exoplayer2.text.a> d(long j12) {
        return j12 >= 0 ? this.f346845b : Collections.emptyList();
    }
}
