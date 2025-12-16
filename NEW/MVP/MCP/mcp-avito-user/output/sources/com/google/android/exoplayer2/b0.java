package com.google.android.exoplayer2;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.y;
import com.google.common.collect.AbstractC37401r1;
import j.InterfaceC42154j;
import java.util.List;

/* compiled from: PlaybackInfo.java */
/* loaded from: classes6.dex */
final class b0 {

    /* renamed from: t, reason: collision with root package name */
    public static final y.b f344157t = new y.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final s0 f344158a;

    /* renamed from: b, reason: collision with root package name */
    public final y.b f344159b;

    /* renamed from: c, reason: collision with root package name */
    public final long f344160c;

    /* renamed from: d, reason: collision with root package name */
    public final long f344161d;

    /* renamed from: e, reason: collision with root package name */
    public final int f344162e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final ExoPlaybackException f344163f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f344164g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.W f344165h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.trackselection.u f344166i;

    /* renamed from: j, reason: collision with root package name */
    public final List<Metadata> f344167j;

    /* renamed from: k, reason: collision with root package name */
    public final y.b f344168k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f344169l;

    /* renamed from: m, reason: collision with root package name */
    public final int f344170m;

    /* renamed from: n, reason: collision with root package name */
    public final c0 f344171n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f344172o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f344173p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f344174q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f344175r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f344176s;

    public b0(s0 s0Var, y.b bVar, long j12, long j13, int i12, @j.P ExoPlaybackException exoPlaybackException, boolean z12, com.google.android.exoplayer2.source.W w12, com.google.android.exoplayer2.trackselection.u uVar, List<Metadata> list, y.b bVar2, boolean z13, int i13, c0 c0Var, long j14, long j15, long j16, boolean z14, boolean z15) {
        this.f344158a = s0Var;
        this.f344159b = bVar;
        this.f344160c = j12;
        this.f344161d = j13;
        this.f344162e = i12;
        this.f344163f = exoPlaybackException;
        this.f344164g = z12;
        this.f344165h = w12;
        this.f344166i = uVar;
        this.f344167j = list;
        this.f344168k = bVar2;
        this.f344169l = z13;
        this.f344170m = i13;
        this.f344171n = c0Var;
        this.f344174q = j14;
        this.f344175r = j15;
        this.f344176s = j16;
        this.f344172o = z14;
        this.f344173p = z15;
    }

    public static b0 i(com.google.android.exoplayer2.trackselection.u uVar) {
        s0 s0Var = s0.f345869b;
        y.b bVar = f344157t;
        return new b0(s0Var, bVar, -9223372036854775807L, 0L, 1, null, false, com.google.android.exoplayer2.source.W.f346153e, uVar, AbstractC37401r1.C(), bVar, false, 0, c0.f344179e, 0L, 0L, 0L, false, false);
    }

    @InterfaceC42154j
    public final b0 a(y.b bVar) {
        return new b0(this.f344158a, this.f344159b, this.f344160c, this.f344161d, this.f344162e, this.f344163f, this.f344164g, this.f344165h, this.f344166i, this.f344167j, bVar, this.f344169l, this.f344170m, this.f344171n, this.f344174q, this.f344175r, this.f344176s, this.f344172o, this.f344173p);
    }

    @InterfaceC42154j
    public final b0 b(y.b bVar, long j12, long j13, long j14, long j15, com.google.android.exoplayer2.source.W w12, com.google.android.exoplayer2.trackselection.u uVar, List<Metadata> list) {
        return new b0(this.f344158a, bVar, j13, j14, this.f344162e, this.f344163f, this.f344164g, w12, uVar, list, this.f344168k, this.f344169l, this.f344170m, this.f344171n, this.f344174q, j15, j12, this.f344172o, this.f344173p);
    }

    @InterfaceC42154j
    public final b0 c(boolean z12) {
        return new b0(this.f344158a, this.f344159b, this.f344160c, this.f344161d, this.f344162e, this.f344163f, this.f344164g, this.f344165h, this.f344166i, this.f344167j, this.f344168k, this.f344169l, this.f344170m, this.f344171n, this.f344174q, this.f344175r, this.f344176s, z12, this.f344173p);
    }

    @InterfaceC42154j
    public final b0 d(int i12, boolean z12) {
        return new b0(this.f344158a, this.f344159b, this.f344160c, this.f344161d, this.f344162e, this.f344163f, this.f344164g, this.f344165h, this.f344166i, this.f344167j, this.f344168k, z12, i12, this.f344171n, this.f344174q, this.f344175r, this.f344176s, this.f344172o, this.f344173p);
    }

    @InterfaceC42154j
    public final b0 e(@j.P ExoPlaybackException exoPlaybackException) {
        return new b0(this.f344158a, this.f344159b, this.f344160c, this.f344161d, this.f344162e, exoPlaybackException, this.f344164g, this.f344165h, this.f344166i, this.f344167j, this.f344168k, this.f344169l, this.f344170m, this.f344171n, this.f344174q, this.f344175r, this.f344176s, this.f344172o, this.f344173p);
    }

    @InterfaceC42154j
    public final b0 f(c0 c0Var) {
        return new b0(this.f344158a, this.f344159b, this.f344160c, this.f344161d, this.f344162e, this.f344163f, this.f344164g, this.f344165h, this.f344166i, this.f344167j, this.f344168k, this.f344169l, this.f344170m, c0Var, this.f344174q, this.f344175r, this.f344176s, this.f344172o, this.f344173p);
    }

    @InterfaceC42154j
    public final b0 g(int i12) {
        return new b0(this.f344158a, this.f344159b, this.f344160c, this.f344161d, i12, this.f344163f, this.f344164g, this.f344165h, this.f344166i, this.f344167j, this.f344168k, this.f344169l, this.f344170m, this.f344171n, this.f344174q, this.f344175r, this.f344176s, this.f344172o, this.f344173p);
    }

    @InterfaceC42154j
    public final b0 h(s0 s0Var) {
        return new b0(s0Var, this.f344159b, this.f344160c, this.f344161d, this.f344162e, this.f344163f, this.f344164g, this.f344165h, this.f344166i, this.f344167j, this.f344168k, this.f344169l, this.f344170m, this.f344171n, this.f344174q, this.f344175r, this.f344176s, this.f344172o, this.f344173p);
    }
}
