package com.google.android.exoplayer2.text.tx3g;

import com.google.android.exoplayer2.text.h;
import com.google.android.exoplayer2.util.C36585a;
import java.util.Collections;
import java.util.List;

/* compiled from: Tx3gSubtitle.java */
/* loaded from: classes6.dex */
final class b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final b f347074c = new b();

    /* renamed from: b, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.text.a> f347075b;

    public b(com.google.android.exoplayer2.text.a aVar) {
        this.f347075b = Collections.singletonList(aVar);
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
        return j12 >= 0 ? this.f347075b : Collections.emptyList();
    }

    public b() {
        this.f347075b = Collections.emptyList();
    }
}
