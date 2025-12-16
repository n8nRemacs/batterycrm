package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.performance.PerformanceImageTracker;
import com.avito.android.remote.analytics.C34245b;
import com.avito.android.remote.analytics.image.l;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NetworkErrorTrackersInitTaskImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/app/task/NetworkErrorTrackersInitTaskImpl;", "Lcom/avito/android/app/task/NetworkErrorTrackersInitTask;", "Lcom/avito/android/remote/analytics/image/l;", "imagesAnalytics", "Lcom/avito/android/remote/analytics/image/n;", "imagesErrorsReporter", "Lcom/avito/android/analytics/dialogs/a;", "errorDialogsAnalytics", "Lcom/avito/android/remote/analytics/b;", "networkErrorsAnalytics", "Lcom/avito/android/remote/analytics/success_rate/b;", "successRateAnalytics", "Lcom/avito/android/remote/analytics/messenger/c;", "messengerNetworkErrorAnalytics", "<init>", "(Lcom/avito/android/remote/analytics/image/l;Lcom/avito/android/remote/analytics/image/n;Lcom/avito/android/analytics/dialogs/a;Lcom/avito/android/remote/analytics/b;Lcom/avito/android/remote/analytics/success_rate/b;Lcom/avito/android/remote/analytics/messenger/c;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/remote/analytics/image/l;", "Lcom/avito/android/remote/analytics/image/n;", "Lcom/avito/android/analytics/dialogs/a;", "Lcom/avito/android/remote/analytics/b;", "Lcom/avito/android/remote/analytics/success_rate/b;", "Lcom/avito/android/remote/analytics/messenger/c;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NetworkErrorTrackersInitTaskImpl implements NetworkErrorTrackersInitTask {

    @Y61.k
    private final com.avito.android.analytics.dialogs.a errorDialogsAnalytics;

    @Y61.k
    private final com.avito.android.remote.analytics.image.l imagesAnalytics;

    @Y61.k
    private final com.avito.android.remote.analytics.image.n imagesErrorsReporter;

    @Y61.k
    private final com.avito.android.remote.analytics.messenger.c messengerNetworkErrorAnalytics;

    @Y61.k
    private final C34245b networkErrorsAnalytics;

    @Y61.k
    private final com.avito.android.remote.analytics.success_rate.b successRateAnalytics;

    @Inject
    public NetworkErrorTrackersInitTaskImpl(@Y61.k com.avito.android.remote.analytics.image.l lVar, @Y61.k com.avito.android.remote.analytics.image.n nVar, @Y61.k com.avito.android.analytics.dialogs.a aVar, @Y61.k C34245b c34245b, @Y61.k com.avito.android.remote.analytics.success_rate.b bVar, @Y61.k com.avito.android.remote.analytics.messenger.c cVar) {
        this.imagesAnalytics = lVar;
        this.imagesErrorsReporter = nVar;
        this.errorDialogsAnalytics = aVar;
        this.networkErrorsAnalytics = c34245b;
        this.successRateAnalytics = bVar;
        this.messengerNetworkErrorAnalytics = cVar;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        com.avito.android.remote.analytics.image.l lVar = this.imagesAnalytics;
        lVar.getClass();
        J60.b.f8786a.getClass();
        PerformanceImageTracker performanceImageTracker = PerformanceImageTracker.f215083a;
        l.a aVar = lVar.f253137c;
        performanceImageTracker.getClass();
        PerformanceImageTracker.f215084b.add(aVar);
        this.imagesErrorsReporter.a();
        this.errorDialogsAnalytics.a();
        this.networkErrorsAnalytics.a();
        this.successRateAnalytics.a();
        this.messengerNetworkErrorAnalytics.a();
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
