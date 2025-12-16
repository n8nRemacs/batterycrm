package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

/* compiled from: SimpleCache.java */
/* loaded from: classes6.dex */
class p extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f347890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f347891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f347891c = qVar;
        this.f347890b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f347891c) {
            this.f347890b.open();
            q.j(this.f347891c);
            this.f347891c.f347894b.getClass();
        }
    }
}
