package defpackage;

import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.function.IntSupplier;

/* loaded from: classes3.dex */
public final class vc7 {
    public final Clock a;
    public final ScheduledExecutorService b;
    public final int c;
    public volatile long d;
    public final ysc e;
    public volatile IntSupplier f;
    public volatile Instant g;
    public volatile boolean h;
    public volatile int i;
    public ScheduledFuture j;

    public vc7(ysc yscVar) {
        Clock clockSystemUTC = Clock.systemUTC();
        this.a = clockSystemUTC;
        this.e = yscVar;
        this.f = new uc7();
        this.c = 1000;
        this.b = Executors.newScheduledThreadPool(1, new pc4("idle-timer", 0));
        this.g = clockSystemUTC.instant();
        this.i = 1;
    }
}
