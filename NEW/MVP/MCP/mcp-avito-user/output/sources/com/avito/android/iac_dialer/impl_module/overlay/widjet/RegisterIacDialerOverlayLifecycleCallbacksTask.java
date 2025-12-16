package com.avito.android.iac_dialer.impl_module.overlay.widjet;

import Y61.k;
import android.app.Application;
import androidx.compose.runtime.internal.P;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.L0;
import javax.inject.Inject;
import kotlin.Metadata;
import lL.InterfaceC43652a;
import pK.InterfaceC46970a;

/* compiled from: RegisterIacDialerOverlayLifecycleCallbacksTask.kt */
@P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/widjet/RegisterIacDialerOverlayLifecycleCallbacksTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lh31/e;", "Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/a;", "stateProvider", "LpK/a;", "currentTime", "LlL/a;", "iacCallActivityIntentFactory", "Lcom/avito/android/util/L0;", "deviceMetrics", "<init>", "(Lh31/e;Lh31/e;Lh31/e;Lcom/avito/android/util/L0;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lh31/e;", "Lcom/avito/android/util/L0;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RegisterIacDialerOverlayLifecycleCallbacksTask implements ApplicationBlockingStartupTask {

    @k
    private final h31.e<InterfaceC46970a> currentTime;

    @k
    private final L0 deviceMetrics;

    @k
    private final h31.e<InterfaceC43652a> iacCallActivityIntentFactory;

    @k
    private final h31.e<com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.a> stateProvider;

    @Inject
    public RegisterIacDialerOverlayLifecycleCallbacksTask(@k h31.e<com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.a> eVar, @k h31.e<InterfaceC46970a> eVar2, @k h31.e<InterfaceC43652a> eVar3, @k L0 l02) {
        this.stateProvider = eVar;
        this.currentTime = eVar2;
        this.iacCallActivityIntentFactory = eVar3;
        this.deviceMetrics = l02;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public InterfaceC28559h.a execute(@k Application application) {
        application.registerActivityLifecycleCallbacks(new a(this.stateProvider, this.currentTime, this.iacCallActivityIntentFactory, this.deviceMetrics).f318859a);
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
