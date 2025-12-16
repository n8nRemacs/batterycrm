package com.yandex.mobile.ads.impl;

import android.os.SystemClock;

/* loaded from: classes8.dex */
public final class bl {

    /* renamed from: a, reason: collision with root package name */
    private boolean f383976a;

    public bl() {
        this(0);
    }

    public final synchronized void a() {
        while (!this.f383976a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z12 = false;
        while (!this.f383976a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z12 = true;
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized void c() {
        this.f383976a = false;
    }

    public final synchronized boolean d() {
        return this.f383976a;
    }

    public final synchronized boolean e() {
        if (this.f383976a) {
            return false;
        }
        this.f383976a = true;
        notifyAll();
        return true;
    }

    public bl(int i12) {
    }

    public final synchronized boolean a(long j12) {
        if (j12 <= 0) {
            return this.f383976a;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = j12 + jElapsedRealtime;
        if (j13 < jElapsedRealtime) {
            a();
        } else {
            while (!this.f383976a && jElapsedRealtime < j13) {
                wait(j13 - jElapsedRealtime);
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        return this.f383976a;
    }
}
