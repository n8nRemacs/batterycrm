package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.analytics.m;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.util.C36599o;
import java.io.IOException;

/* compiled from: PlaybackStatsListener.java */
/* loaded from: classes6.dex */
public final class o implements com.google.android.exoplayer2.analytics.b, m.a {

    /* compiled from: PlaybackStatsListener.java */
    public interface a {
    }

    /* compiled from: PlaybackStatsListener.java */
    public static final class b {
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void QW(d0 d0Var, b.c cVar) {
        C36599o c36599o = cVar.f343753a;
        if (c36599o.f348141a.size() == 0) {
            return;
        }
        if (c36599o.f348141a.size() <= 0) {
            throw null;
        }
        int iA2 = c36599o.a(0);
        cVar.b(iA2);
        if (iA2 != 0 && iA2 != 11) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void jp(b.C10568b c10568b, d0.k kVar, d0.k kVar2, int i12) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void ZT(b.C10568b c10568b, int i12) {
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void at(b.C10568b c10568b, Exception exc) {
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void jC(b.C10568b c10568b, com.google.android.exoplayer2.video.o oVar) {
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void nR(b.C10568b c10568b, C36557u c36557u) {
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void Uz(int i12, long j12, b.C10568b c10568b) {
    }

    @Override // com.google.android.exoplayer2.analytics.b
    public final void mt(b.C10568b c10568b, C36557u c36557u, IOException iOException) {
    }
}
