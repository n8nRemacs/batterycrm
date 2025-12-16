package com.google.android.exoplayer2;

/* compiled from: DefaultMediaClock.java */
/* renamed from: com.google.android.exoplayer2.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36531l implements com.google.android.exoplayer2.util.x {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.K f345455b;

    /* renamed from: c, reason: collision with root package name */
    public final a f345456c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public h0 f345457d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public com.google.android.exoplayer2.util.x f345458e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f345459f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f345460g;

    /* compiled from: DefaultMediaClock.java */
    /* renamed from: com.google.android.exoplayer2.l$a */
    public interface a {
    }

    public C36531l(a aVar, com.google.android.exoplayer2.util.L l12) {
        this.f345456c = aVar;
        this.f345455b = new com.google.android.exoplayer2.util.K(l12);
    }

    @Override // com.google.android.exoplayer2.util.x
    public final long c() {
        if (this.f345459f) {
            return this.f345455b.c();
        }
        com.google.android.exoplayer2.util.x xVar = this.f345458e;
        xVar.getClass();
        return xVar.c();
    }

    @Override // com.google.android.exoplayer2.util.x
    public final void d(c0 c0Var) {
        com.google.android.exoplayer2.util.x xVar = this.f345458e;
        if (xVar != null) {
            xVar.d(c0Var);
            c0Var = this.f345458e.getPlaybackParameters();
        }
        this.f345455b.d(c0Var);
    }

    @Override // com.google.android.exoplayer2.util.x
    public final c0 getPlaybackParameters() {
        com.google.android.exoplayer2.util.x xVar = this.f345458e;
        return xVar != null ? xVar.getPlaybackParameters() : this.f345455b.f348091f;
    }
}
