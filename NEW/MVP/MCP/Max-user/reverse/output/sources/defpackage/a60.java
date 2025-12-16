package defpackage;

import android.content.Context;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public final class a60 {
    public final qee a;
    public final iv0 d;
    public final y00 e;
    public final long f;
    public boolean i;
    public Executor j;
    public enb k;
    public we5 l;
    public h79 m;
    public z50 n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public byte[] s;
    public double t;
    public final int v;
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public int g = 1;
    public dv0 h = dv0.b;
    public long u = 0;

    public a60(f90 f90Var, Executor executor, Context context) throws AudioSourceAccessException {
        qee qeeVar = new qee(executor);
        this.a = qeeVar;
        this.f = TimeUnit.MILLISECONDS.toNanos(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        try {
            iv0 iv0Var = new iv0(new d60(f90Var, context), f90Var);
            this.d = iv0Var;
            r5j r5jVar = new r5j(4, this);
            z5j.f("AudioStream can not be started when setCallback.", !iv0Var.a.get());
            iv0Var.a();
            iv0Var.d.execute(new cj(iv0Var, r5jVar, qeeVar, 4));
            y00 y00Var = new y00();
            y00Var.d = new AtomicBoolean(false);
            y00Var.e = new AtomicBoolean(false);
            y00Var.a = f90Var.a();
            y00Var.b = f90Var.b;
            this.e = y00Var;
            this.v = f90Var.d;
        } catch (AudioStream$AudioStreamException | IllegalArgumentException e) {
            throw new AudioSourceAccessException("Unable to create AudioStream", e);
        }
    }

    public final void a() {
        Executor executor = this.j;
        enb enbVar = this.k;
        if (executor == null || enbVar == null) {
            return;
        }
        boolean z = this.r || this.o || this.q;
        if (Objects.equals(this.b.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executor.execute(new ui(3, enbVar, z));
    }

    public final void b(we5 we5Var) {
        we5 we5Var2 = this.l;
        dv0 dv0Var = null;
        if (we5Var2 != null) {
            z50 z50Var = this.n;
            Objects.requireNonNull(z50Var);
            we5Var2.r(z50Var);
            this.l = null;
            this.n = null;
            this.m = null;
            this.h = dv0.b;
            f();
        }
        if (we5Var != null) {
            this.l = we5Var;
            this.n = new z50(this, we5Var);
            this.m = new h79(this, we5Var, false, 5);
            try {
                ha8 ha8VarP = we5Var.p();
                if (((wu1) ha8VarP).b.isDone()) {
                    dv0Var = (dv0) ((wu1) ha8VarP).b.get();
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
            if (dv0Var != null) {
                this.h = dv0Var;
                f();
            }
            this.l.f(this.a, this.n);
        }
    }

    public final void c() {
        we5 we5Var = this.l;
        Objects.requireNonNull(we5Var);
        wu1 wu1VarA = ixi.a(new te5(we5Var, 1));
        h79 h79Var = this.m;
        Objects.requireNonNull(h79Var);
        wsf.b(wu1VarA, h79Var, this.a);
    }

    public final void d(int i) {
        gri.a("AudioSource", "Transitioning internal state: " + az1.x(this.g) + " --> " + az1.x(i));
        this.g = i;
    }

    public final void e() {
        if (this.i) {
            this.i = false;
            gri.a("AudioSource", "stopSendingAudio");
            iv0 iv0Var = this.d;
            iv0Var.a();
            if (iv0Var.a.getAndSet(false)) {
                iv0Var.d.execute(new gv0(iv0Var, 0));
            }
        }
    }

    public final void f() {
        if (this.g != 2) {
            e();
            return;
        }
        boolean z = this.h == dv0.a;
        boolean z2 = !z;
        Executor executor = this.j;
        enb enbVar = this.k;
        if (executor != null && enbVar != null && this.c.getAndSet(z2) != z2) {
            executor.execute(new o3(enbVar, z2));
        }
        if (!z) {
            e();
            return;
        }
        if (this.i) {
            return;
        }
        try {
            gri.a("AudioSource", "startSendingAudio");
            this.d.c();
            this.o = false;
        } catch (AudioStream$AudioStreamException e) {
            gri.j("AudioSource", "Failed to start AudioStream", e);
            this.o = true;
            y00 y00Var = this.e;
            y00Var.a();
            if (!((AtomicBoolean) y00Var.d).getAndSet(true)) {
                y00Var.c = System.nanoTime();
            }
            this.p = System.nanoTime();
            a();
        }
        this.i = true;
        c();
    }
}
