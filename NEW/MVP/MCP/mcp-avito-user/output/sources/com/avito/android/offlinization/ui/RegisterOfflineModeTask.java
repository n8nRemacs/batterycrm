package com.avito.android.offlinization.ui;

import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.offlinization.p;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RegisterOfflineModeTask.kt */
@C11.a
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/offlinization/ui/RegisterOfflineModeTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/offlinization/ui/d;", "callbacks", "Lcom/avito/android/offlinization/analytics/a;", "offlineModeTracker", "Lcom/avito/android/offlinization/p;", "offlinizationFeatureStrategy", "<init>", "(Lcom/avito/android/offlinization/ui/d;Lcom/avito/android/offlinization/analytics/a;Lcom/avito/android/offlinization/p;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/offlinization/ui/d;", "Lcom/avito/android/offlinization/analytics/a;", "Lcom/avito/android/offlinization/p;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RegisterOfflineModeTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final d callbacks;

    @Y61.k
    private final com.avito.android.offlinization.analytics.a offlineModeTracker;

    @Y61.k
    private final p offlinizationFeatureStrategy;

    @Inject
    public RegisterOfflineModeTask(@Y61.k d dVar, @Y61.k com.avito.android.offlinization.analytics.a aVar, @Y61.k p pVar) {
        this.callbacks = dVar;
        this.offlineModeTracker = aVar;
        this.offlinizationFeatureStrategy = pVar;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        if (this.offlinizationFeatureStrategy.f()) {
            this.callbacks.b(application);
            this.offlineModeTracker.b();
        }
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
