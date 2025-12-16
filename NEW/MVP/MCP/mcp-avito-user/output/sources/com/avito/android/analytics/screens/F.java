package com.avito.android.analytics.screens;

import j.InterfaceC42148d;
import kotlin.Metadata;

/* compiled from: Timer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/F;", "Lcom/avito/android/analytics/screens/C;", "<init>", "()V", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42148d
/* loaded from: classes11.dex */
public final class F implements C {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f90354a;

    @Override // com.avito.android.analytics.screens.C
    public final void a() {
        c();
    }

    @Override // com.avito.android.analytics.screens.C
    public final long b() {
        com.avito.android.time.c.f301452a.getClass();
        return com.avito.android.time.c.f301453b.a() - this.f90354a;
    }

    public final void c() {
        com.avito.android.time.c.f301452a.getClass();
        this.f90354a = com.avito.android.time.c.f301453b.a();
    }
}
