package com.avito.android.favorites;

import android.os.Bundle;
import com.avito.android.service.short_task.ShortTask;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsSyncRunner.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/X;", "Lcom/avito/android/favorites/W;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class X implements W {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service.short_task.j f156336a;

    @Inject
    public X(@Y61.k com.avito.android.service.short_task.j jVar) {
        this.f156336a = jVar;
    }

    @Override // com.avito.android.favorites.W
    public final void a(long j12) {
        Z.f156339b.getClass();
        Bundle bundle = Z.f156340c;
        this.f156336a.c(Z.class, ShortTask.NetworkState.f274023b, false, false, false, false, j12, true, bundle, ShortTask.BackoffPolicy.f274019b, 30000L);
    }

    @Override // com.avito.android.favorites.W
    public final void b() {
        Z.f156339b.getClass();
        Bundle bundle = Z.f156341d;
        this.f156336a.c(Z.class, ShortTask.NetworkState.f274023b, false, false, false, false, 0L, true, bundle, ShortTask.BackoffPolicy.f274019b, 30000L);
    }
}
