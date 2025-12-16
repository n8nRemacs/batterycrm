package com.avito.android.iac_dialer_watcher.impl_module.logging.task;

import Y61.k;
import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.iac_dialer_watcher.impl_module.logging.writing.InterfaceC30919a;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacInitLogBufferStreamTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/task/IacInitLogBufferStreamTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/a;", "iacLogBufferInitializer", "Lcom/avito/android/util/C;", "buildInfo", "<init>", "(Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/a;Lcom/avito/android/util/C;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/a;", "Lcom/avito/android/util/C;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacInitLogBufferStreamTask implements ApplicationBlockingStartupTask {

    @k
    private final C buildInfo;

    @k
    private final InterfaceC30919a iacLogBufferInitializer;

    @Inject
    public IacInitLogBufferStreamTask(@k InterfaceC30919a interfaceC30919a, @k C c12) {
        this.iacLogBufferInitializer = interfaceC30919a;
        this.buildInfo = c12;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public InterfaceC28559h.a execute(@k Application application) {
        try {
            if (!this.buildInfo.l()) {
                com.avito.android.iac_dialer_models.abstract_module.b.INSTANCE.getClass();
                com.avito.android.iac_dialer_models.abstract_module.b.shouldMask = false;
            }
            this.iacLogBufferInitializer.b();
            return InterfaceC28559h.a.c.f91606a;
        } catch (Throwable th2) {
            return new InterfaceC28559h.a.b(th2);
        }
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
