package com.android.volley;

/* compiled from: CacheDispatcher.java */
/* loaded from: classes10.dex */
class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Request f67074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f67075c;

    public k(l lVar, Request request) {
        this.f67075c = lVar;
        this.f67074b = request;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.f67075c.f67078c.put(this.f67074b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
