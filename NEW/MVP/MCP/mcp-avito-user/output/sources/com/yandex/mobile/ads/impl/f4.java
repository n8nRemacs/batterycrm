package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u6 f385164a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final h4 f385165b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final xu f385166c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final fh1 f385167d;

    public f4(@j.N t6 t6Var, @j.N xu xuVar, @j.N fh1 fh1Var) {
        this.f385166c = xuVar;
        this.f385167d = fh1Var;
        this.f385164a = t6Var.b();
        this.f385165b = t6Var.c();
    }

    public final void a(@j.N com.google.android.exoplayer2.d0 d0Var, boolean z12) {
        boolean zB2 = this.f385167d.b();
        int currentAdGroupIndex = d0Var.getCurrentAdGroupIndex();
        if (currentAdGroupIndex == -1) {
            com.google.android.exoplayer2.source.ads.a aVarA = this.f385165b.a();
            long contentPosition = d0Var.getContentPosition();
            long jI2 = d0Var.i();
            if (jI2 == -9223372036854775807L || contentPosition == -9223372036854775807L) {
                currentAdGroupIndex = -1;
            } else {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                currentAdGroupIndex = aVarA.c(timeUnit.toMicros(contentPosition), timeUnit.toMicros(jI2));
            }
        }
        boolean zC2 = this.f385164a.c();
        if (zB2 || z12 || currentAdGroupIndex == -1 || zC2) {
            return;
        }
        com.google.android.exoplayer2.source.ads.a aVarA2 = this.f385165b.a();
        if (aVarA2.a(currentAdGroupIndex).f346189b == Long.MIN_VALUE) {
            this.f385167d.a();
        } else {
            this.f385166c.a(aVarA2, currentAdGroupIndex);
        }
    }
}
