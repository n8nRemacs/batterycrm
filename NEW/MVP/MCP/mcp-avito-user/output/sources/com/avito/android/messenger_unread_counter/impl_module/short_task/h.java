package com.avito.android.messenger_unread_counter.impl_module.short_task;

import Y61.k;
import com.avito.android.service.short_task.ShortTask;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: UpdateUnreadMessagesCounterScheduler.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_unread_counter/impl_module/short_task/h;", "Lcom/avito/android/messenger_unread_counter/impl_module/short_task/g;", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.service.short_task.j f197747a;

    @Inject
    public h(@k com.avito.android.service.short_task.j jVar) {
        this.f197747a = jVar;
    }

    @Override // com.avito.android.messenger_unread_counter.impl_module.short_task.g
    public final void a() {
        this.f197747a.c(a.class, ShortTask.NetworkState.f274024c, false, false, false, false, 1000L, true, null, ShortTask.BackoffPolicy.f274019b, 30000L);
    }
}
