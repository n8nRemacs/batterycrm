package com.avito.android.iac_dialer_watcher.impl_module.logging.task;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.app.Application;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacAppStatusLogTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/task/IacAppStatusLogTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/appStatus/b;", "iacAppStatusProvider", "<init>", "(Lcom/avito/android/iac_dialer_watcher/impl_module/logging/appStatus/b;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/appStatus/b;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacAppStatusLogTask implements ApplicationBackgroundStartupTask {

    @k
    private final com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.b iacAppStatusProvider;

    /* compiled from: IacAppStatusLogTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/appStatus/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer_watcher/impl_module/logging/appStatus/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f167941l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.a aVar) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacAppStatusProvider", "Application status changed: " + aVar, null);
            return G0.f406611a;
        }
    }

    @Inject
    public IacAppStatusLogTask(@k com.avito.android.iac_dialer_watcher.impl_module.logging.appStatus.b bVar) {
        this.iacAppStatusProvider = bVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    @SuppressLint({"CheckResult"})
    public void execute(@k Application application) {
        A1.h(this.iacAppStatusProvider.b(), null, a.f167941l, 3);
    }
}
