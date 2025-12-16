package com.avito.android.push.impl_module.token.sending.short_task;

import Y61.k;
import android.os.Bundle;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.service.short_task.j;
import com.squareup.anvil.annotations.ContributesBinding;
import ig0.AbstractC41398a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SendPushTokenShortTaskScheduler.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/short_task/d;", "Lcom/avito/android/push/impl_module/token/sending/short_task/c;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f246082a;

    @Inject
    public d(@k j jVar) {
        this.f246082a = jVar;
    }

    @Override // com.avito.android.push.impl_module.token.sending.short_task.c
    public final void a(@k AbstractC41398a abstractC41398a) {
        ShortTask.NetworkState networkState = ShortTask.NetworkState.f274024c;
        a.f246078c.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("key_reason", abstractC41398a.f398614a);
        this.f246082a.c(a.class, networkState, false, false, false, false, 0L, false, bundle, ShortTask.BackoffPolicy.f274019b, 30000L);
    }
}
