package rc;

import com.avito.android.analytics.inhouse_transport.k;
import com.avito.android.service.short_task.ShortTask;
import com.avito.android.service.short_task.j;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import xs0.C49993c;

/* compiled from: ClickStreamPendingFlushInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrc/b;", "Lcom/avito/android/analytics/inhouse_transport/k;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rc.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47635b implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f429896a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C f429897b;

    @Inject
    public C47635b(@Y61.k j jVar, @Y61.k C c12) {
        this.f429896a = jVar;
        this.f429897b = c12;
    }

    @Override // com.avito.android.analytics.inhouse_transport.k
    public final void flush() {
        this.f429896a.c(C49993c.class, !this.f429897b.l() ? ShortTask.NetworkState.f274023b : ShortTask.NetworkState.f274024c, false, false, false, false, 1L, true, null, ShortTask.BackoffPolicy.f274019b, 30000L);
    }
}
