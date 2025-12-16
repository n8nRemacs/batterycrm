package com.google.android.exoplayer2.upstream.cache;

import j.P;

/* compiled from: CacheWriter.java */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.cache.a f347848a;

    /* renamed from: b, reason: collision with root package name */
    public final Cache f347849b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.p f347850c;

    /* renamed from: d, reason: collision with root package name */
    public final String f347851d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f347852e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final a f347853f;

    /* renamed from: g, reason: collision with root package name */
    public long f347854g;

    /* renamed from: h, reason: collision with root package name */
    public long f347855h;

    /* renamed from: i, reason: collision with root package name */
    public long f347856i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f347857j;

    /* compiled from: CacheWriter.java */
    public interface a {
        void a(long j12, long j13, long j14);
    }

    public g(com.google.android.exoplayer2.upstream.cache.a aVar, com.google.android.exoplayer2.upstream.p pVar, @P byte[] bArr, @P a aVar2) {
        this.f347848a = aVar;
        this.f347849b = aVar.f347810a;
        this.f347850c = pVar;
        this.f347852e = bArr == null ? new byte[131072] : bArr;
        this.f347853f = aVar2;
        this.f347851d = aVar.f347814e.d(pVar);
        this.f347854g = pVar.f347934f;
    }

    public final long a() {
        long j12 = this.f347855h;
        if (j12 == -1) {
            return -1L;
        }
        return j12 - this.f347850c.f347934f;
    }
}
