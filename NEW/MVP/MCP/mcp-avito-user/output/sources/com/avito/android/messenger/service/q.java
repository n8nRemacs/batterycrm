package com.avito.android.messenger.service;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OpenErrorTrackerScheduler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/service/q;", "Lcom/avito/android/messenger/service/p;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service.short_task.j f197298a;

    @Inject
    public q(@Y61.k com.avito.android.service.short_task.j jVar) {
        this.f197298a = jVar;
    }

    @Override // com.avito.android.messenger.service.p
    public final void a() {
        ShortTask.NetworkState networkState = ShortTask.NetworkState.f274024c;
        t.f197300b.getClass();
        this.f197298a.c(t.class, networkState, false, false, false, false, 1000L, false, new Bundle(), ShortTask.BackoffPolicy.f274019b, 30000L);
        V2.f318762a.i("OpenErrorTrackerScheduler", "Enqueued OpenErrorTracker::trackChatListOpenError()", null);
    }

    @Override // com.avito.android.messenger.service.p
    public final void b(@Y61.k String str, @Y61.k String str2) {
        ShortTask.NetworkState networkState = ShortTask.NetworkState.f274024c;
        t.f197300b.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("channel_id", str);
        bundle.putString("case", str2);
        this.f197298a.c(t.class, networkState, false, false, false, false, 1000L, false, bundle, ShortTask.BackoffPolicy.f274019b, 30000L);
        V2.f318762a.i("OpenErrorTrackerScheduler", "Enqueued OpenErrorTracker::trackChatOpenError(channelId=" + str + ", case=" + str2 + ')', null);
    }
}
