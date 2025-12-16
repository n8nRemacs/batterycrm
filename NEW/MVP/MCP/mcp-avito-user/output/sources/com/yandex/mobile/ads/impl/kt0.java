package com.yandex.mobile.ads.impl;

import android.os.Looper;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
public final class kt0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f387250a;

    /* renamed from: b, reason: collision with root package name */
    private final a f387251b;

    /* renamed from: c, reason: collision with root package name */
    private final hj f387252c;

    /* renamed from: d, reason: collision with root package name */
    private int f387253d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private Object f387254e;

    /* renamed from: f, reason: collision with root package name */
    private Looper f387255f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f387256g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f387257h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f387258i;

    public interface a {
    }

    public interface b {
        void a(int i12, @j.P Object obj);
    }

    public kt0(a aVar, b bVar, i91 i91Var, int i12, hj hjVar, Looper looper) {
        this.f387251b = aVar;
        this.f387250a = bVar;
        this.f387255f = looper;
        this.f387252c = hjVar;
    }

    public final kt0 a(int i12) {
        db.b(!this.f387256g);
        this.f387253d = i12;
        return this;
    }

    @j.P
    public final Object b() {
        return this.f387254e;
    }

    public final b c() {
        return this.f387250a;
    }

    public final int d() {
        return this.f387253d;
    }

    public final kt0 e() {
        db.b(!this.f387256g);
        this.f387256g = true;
        ((rt) this.f387251b).b(this);
        return this;
    }

    public final kt0 a(@j.P Object obj) {
        db.b(!this.f387256g);
        this.f387254e = obj;
        return this;
    }

    public final Looper a() {
        return this.f387255f;
    }

    public final synchronized void a(boolean z12) {
        this.f387257h = z12 | this.f387257h;
        this.f387258i = true;
        notifyAll();
    }

    public final synchronized void a(long j12) {
        boolean z12;
        db.b(this.f387256g);
        db.b(this.f387255f.getThread() != Thread.currentThread());
        long jC2 = this.f387252c.c() + j12;
        while (true) {
            z12 = this.f387258i;
            if (z12 || j12 <= 0) {
                break;
            }
            this.f387252c.b();
            wait(j12);
            j12 = jC2 - this.f387252c.c();
        }
        if (!z12) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }
}
