package com.google.android.exoplayer2;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.C36585a;
import java.util.concurrent.TimeoutException;

/* compiled from: PlayerMessage.java */
/* loaded from: classes6.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f344363a;

    /* renamed from: b, reason: collision with root package name */
    public final a f344364b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.L f344365c;

    /* renamed from: d, reason: collision with root package name */
    public int f344366d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public Object f344367e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f344368f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f344369g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f344370h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f344371i;

    /* compiled from: PlayerMessage.java */
    public interface a {
        void b(e0 e0Var);
    }

    /* compiled from: PlayerMessage.java */
    public interface b {
        void b(int i12, @j.P Object obj);
    }

    public e0(a aVar, b bVar, s0 s0Var, int i12, com.google.android.exoplayer2.util.L l12, Looper looper) {
        this.f344364b = aVar;
        this.f344363a = bVar;
        this.f344368f = looper;
        this.f344365c = l12;
    }

    public final synchronized void a(long j12) {
        boolean z12;
        C36585a.d(this.f344369g);
        C36585a.d(this.f344368f.getThread() != Thread.currentThread());
        this.f344365c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j12;
        while (true) {
            z12 = this.f344371i;
            if (z12 || j12 <= 0) {
                break;
            }
            this.f344365c.getClass();
            wait(j12);
            this.f344365c.getClass();
            j12 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z12) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z12) {
        this.f344370h = z12 | this.f344370h;
        this.f344371i = true;
        notifyAll();
    }

    public final void c() {
        C36585a.d(!this.f344369g);
        this.f344369g = true;
        this.f344364b.b(this);
    }
}
