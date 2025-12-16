package wc;

import com.avito.android.analytics.inhouse_transport.k;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.service.short_task.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StatsdPendingFlushInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwc/c;", "Lcom/avito/android/analytics/inhouse_transport/k;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wc.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49595c implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f441670a;

    public C49595c(@Y61.k j jVar) {
        this.f441670a = jVar;
    }

    @Override // com.avito.android.analytics.inhouse_transport.k
    public final void flush() {
        this.f441670a.c(C49593a.class, ShortTask.NetworkState.f274024c, false, false, false, false, 1L, true, null, ShortTask.BackoffPolicy.f274019b, 30000L);
    }
}
