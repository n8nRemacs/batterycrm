package com.iab.omid.library.corpmailru.walking.a;

import com.iab.omid.library.corpmailru.walking.a.b;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class c implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f364049a;

    /* renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f364050b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f364051c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private b f364052d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f364049a = linkedBlockingQueue;
        this.f364050b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f364051c.poll();
        this.f364052d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f364050b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f364051c.add(bVar);
        if (this.f364052d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.corpmailru.walking.a.b.a
    public void a(b bVar) {
        this.f364052d = null;
        a();
    }
}
