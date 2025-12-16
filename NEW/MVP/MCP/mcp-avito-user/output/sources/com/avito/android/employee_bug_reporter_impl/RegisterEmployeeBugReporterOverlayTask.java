package com.avito.android.employee_bug_reporter_impl;

import Oy.InterfaceC14755h;
import Y61.k;
import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RegisterEmployeeBugReporterOverlayTask.kt */
@C11.a
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/RegisterEmployeeBugReporterOverlayTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "LOy/h;", "callbacks", "<init>", "(LOy/h;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "LOy/h;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RegisterEmployeeBugReporterOverlayTask implements ApplicationBlockingStartupTask {

    @k
    private final InterfaceC14755h callbacks;

    @Inject
    public RegisterEmployeeBugReporterOverlayTask(@k InterfaceC14755h interfaceC14755h) {
        this.callbacks = interfaceC14755h;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public InterfaceC28559h.a execute(@k Application application) {
        this.callbacks.a(application);
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
