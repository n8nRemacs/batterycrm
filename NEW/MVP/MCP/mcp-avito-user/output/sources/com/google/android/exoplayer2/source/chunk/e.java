package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.source.C36554q;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.J;
import com.google.android.exoplayer2.upstream.Loader;
import j.P;

/* compiled from: Chunk.java */
/* loaded from: classes6.dex */
public abstract class e implements Loader.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f346218a = C36554q.f346661b.getAndIncrement();

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.p f346219b;

    /* renamed from: c, reason: collision with root package name */
    public final int f346220c;

    /* renamed from: d, reason: collision with root package name */
    public final I f346221d;

    /* renamed from: e, reason: collision with root package name */
    public final int f346222e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final Object f346223f;

    /* renamed from: g, reason: collision with root package name */
    public final long f346224g;

    /* renamed from: h, reason: collision with root package name */
    public final long f346225h;

    /* renamed from: i, reason: collision with root package name */
    public final J f346226i;

    public e(InterfaceC36583m interfaceC36583m, com.google.android.exoplayer2.upstream.p pVar, int i12, I i13, int i14, @P Object obj, long j12, long j13) {
        this.f346226i = new J(interfaceC36583m);
        this.f346219b = pVar;
        this.f346220c = i12;
        this.f346221d = i13;
        this.f346222e = i14;
        this.f346223f = obj;
        this.f346224g = j12;
        this.f346225h = j13;
    }
}
