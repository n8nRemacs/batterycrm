package com.avito.android.user_adverts.expired_count.di;

import android.os.Bundle;
import com.avito.android.service.short_task.ShortTask;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsInfoUpdateRunnerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/expired_count/di/h;", "LeH0/k;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements eH0.k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service.short_task.j f312138a;

    @Inject
    public h(@Y61.k com.avito.android.service.short_task.j jVar) {
        this.f312138a = jVar;
    }

    @Override // eH0.k
    public final void a() {
        c(true);
    }

    @Override // eH0.k
    public final void b() {
        c(false);
    }

    public final void c(boolean z12) {
        ShortTask.NetworkState networkState = ShortTask.NetworkState.f274024c;
        com.avito.android.user_adverts.expired_count.h.f312144b.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("extra_force_update", z12);
        this.f312138a.c(com.avito.android.user_adverts.expired_count.h.class, networkState, false, false, false, false, 0L, false, bundle, ShortTask.BackoffPolicy.f274019b, 30000L);
    }
}
