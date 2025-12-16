package com.avito.android.iac_avcalls_network_test.impl_module.interactor;

import Y61.k;
import android.annotation.SuppressLint;
import android.app.Application;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AvCallsNetworkTestStartupTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/AvCallsNetworkTestStartupTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/a;", "interactor", "<init>", "(Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/a;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/iac_avcalls_network_test/impl_module/interactor/a;", "_avito_iac-avcalls-network-test_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AvCallsNetworkTestStartupTask implements ApplicationBackgroundStartupTask {

    @k
    private final a interactor;

    @Inject
    public AvCallsNetworkTestStartupTask(@k a aVar) {
        this.interactor = aVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    @SuppressLint({"CheckResult"})
    public void execute(@k Application application) {
        this.interactor.a();
    }
}
