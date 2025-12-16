package com.google.android.exoplayer2.upstream.cache;

import androidx.camera.core.impl.r0;
import com.google.android.exoplayer2.util.C36585a;
import java.util.TreeSet;

/* compiled from: LeastRecentlyUsedCacheEvictor.java */
/* loaded from: classes6.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final long f347886a;

    /* renamed from: b, reason: collision with root package name */
    public final TreeSet<f> f347887b = new TreeSet<>(new r0(5));

    /* renamed from: c, reason: collision with root package name */
    public long f347888c;

    public m(long j12) {
        this.f347886a = j12;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public final void a(f fVar) {
        this.f347887b.remove(fVar);
        this.f347888c -= fVar.f347844d;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public final void b(q qVar, f fVar, f fVar2) {
        a(fVar);
        c(qVar, fVar2);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public final void c(q qVar, f fVar) {
        this.f347887b.add(fVar);
        this.f347888c += fVar.f347844d;
        while (this.f347888c > this.f347886a) {
            TreeSet<f> treeSet = this.f347887b;
            if (treeSet.isEmpty()) {
                return;
            }
            f fVarFirst = treeSet.first();
            synchronized (qVar) {
                C36585a.d(!qVar.f347902j);
                qVar.r(fVarFirst);
            }
        }
    }
}
