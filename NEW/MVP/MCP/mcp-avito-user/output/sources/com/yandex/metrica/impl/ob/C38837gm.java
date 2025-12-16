package com.yandex.metrica.impl.ob;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.gm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38837gm {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.e f380667a;

    public C38837gm() {
        this(new com.yandex.metrica.coreutils.services.e());
    }

    public long a(long j12, @j.N TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long millis = timeUnit.toMillis(j12);
        this.f380667a.getClass();
        return timeUnit2.toSeconds(SystemClock.elapsedRealtime() - millis);
    }

    public long b(long j12, @j.N TimeUnit timeUnit) {
        if (j12 == 0) {
            return 0L;
        }
        return this.f380667a.c() - timeUnit.toSeconds(j12);
    }

    public long c(long j12, @j.N TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.f380667a.getClass();
        return timeUnit2.toSeconds(System.nanoTime() - timeUnit.toNanos(j12));
    }

    @j.k0
    public C38837gm(@j.N com.yandex.metrica.coreutils.services.e eVar) {
        this.f380667a = eVar;
    }
}
