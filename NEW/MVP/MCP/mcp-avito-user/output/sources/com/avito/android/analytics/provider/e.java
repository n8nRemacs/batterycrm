package com.avito.android.analytics.provider;

import Y61.k;
import java.util.Random;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TreeStateIdGenerator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/provider/e;", "", "<init>", "()V", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Random f90270a = new Random();

    @Inject
    public e() {
    }

    public final long a() {
        return Math.abs(this.f90270a.nextLong());
    }
}
