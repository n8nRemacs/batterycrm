package com.avito.android.app_foreground_provider.util_module;

import Y61.k;
import android.app.Application;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppForegroundStatusProviderInitTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatusProviderInitTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/app_foreground_provider/util_module/a;", "appForegroundStatusProvider", "<init>", "(Lcom/avito/android/app_foreground_provider/util_module/a;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/app_foreground_provider/util_module/a;", "_avito_app-foreground-status-provider_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AppForegroundStatusProviderInitTask implements ApplicationBackgroundStartupTask {

    @k
    private final a appForegroundStatusProvider;

    @Inject
    public AppForegroundStatusProviderInitTask(@k a aVar) {
        this.appForegroundStatusProvider = aVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@k Application application) {
        this.appForegroundStatusProvider.c();
    }
}
