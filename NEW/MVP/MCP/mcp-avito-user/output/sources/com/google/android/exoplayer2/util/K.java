package com.google.android.exoplayer2.util;

import android.os.SystemClock;
import com.google.android.exoplayer2.c0;

/* compiled from: StandaloneMediaClock.java */
/* loaded from: classes6.dex */
public final class K implements x {

    /* renamed from: b, reason: collision with root package name */
    public final L f348087b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f348088c;

    /* renamed from: d, reason: collision with root package name */
    public long f348089d;

    /* renamed from: e, reason: collision with root package name */
    public long f348090e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f348091f = c0.f344179e;

    public K(L l12) {
        this.f348087b = l12;
    }

    public final void a(long j12) {
        this.f348089d = j12;
        if (this.f348088c) {
            this.f348087b.getClass();
            this.f348090e = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.exoplayer2.util.x
    public final long c() {
        long j12 = this.f348089d;
        if (!this.f348088c) {
            return j12;
        }
        this.f348087b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f348090e;
        return j12 + (this.f348091f.f344180b == 1.0f ? U.H(jElapsedRealtime) : jElapsedRealtime * r4.f344182d);
    }

    @Override // com.google.android.exoplayer2.util.x
    public final void d(c0 c0Var) {
        if (this.f348088c) {
            a(c());
        }
        this.f348091f = c0Var;
    }

    @Override // com.google.android.exoplayer2.util.x
    public final c0 getPlaybackParameters() {
        return this.f348091f;
    }
}
