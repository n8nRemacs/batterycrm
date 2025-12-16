package com.avito.android.analytics.screens;

import iR.C41336a;
import kotlin.Metadata;

/* compiled from: ScreenTimeProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/u;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final long f90959a;

    /* renamed from: b, reason: collision with root package name */
    public final long f90960b;

    public u(long j12) {
        this.f90959a = j12;
        C41336a.f398522a.getClass();
        long j13 = C41336a.f398523b;
        com.avito.android.time.c.f301452a.getClass();
        long jA2 = com.avito.android.time.c.f301453b.a() - j13;
        this.f90960b = (j13 == 0 || jA2 > 10000) ? 0L : jA2;
    }

    public static long a() {
        id.k.f398602a.getClass();
        return id.k.f398603b;
    }

    public static long b() {
        C41336a.f398522a.getClass();
        return C41336a.f398523b;
    }

    public static long c() {
        com.avito.android.time.c.f301452a.getClass();
        return com.avito.android.time.c.f301453b.a();
    }
}
