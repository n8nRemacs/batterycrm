package com.avito.android.account.plugin.rx;

import A3.a;
import Y61.k;
import android.app.Application;
import com.avito.android.account.G;
import com.avito.android.account.K;
import com.avito.android.account.M;
import com.avito.android.account.O;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import com.avito.android.remote.model.ProfileInfo;
import kotlin.Metadata;

/* compiled from: InitAuthorizationPluginRxTask.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/account/plugin/rx/InitAuthorizationPluginRxTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/account/G;", "accountStorageInteractor", "Lcom/avito/android/account/G;", "Lcom/avito/android/account/O;", "accountUpdateInteractor", "Lcom/avito/android/account/O;", "_avito_authorization-plugin-rx_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InitAuthorizationPluginRxTask implements ApplicationBackgroundStartupTask {

    @k
    private final G accountStorageInteractor;

    @k
    private final O accountUpdateInteractor;

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@k Application application) {
        K kI2 = this.accountStorageInteractor.i();
        M m12 = kI2.f68044a;
        if (!m12.b()) {
            this.accountUpdateInteractor.h();
            return;
        }
        String strC = kI2.c();
        ProfileInfo profileInfoE = m12.e();
        this.accountUpdateInteractor.c(new a.InterfaceC0003a.b(profileInfoE.getUserId(), profileInfoE.getUserHashId(), strC));
    }
}
