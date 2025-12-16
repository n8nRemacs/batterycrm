package com.avito.android.silent_update.permissions;

import com.avito.android.app.task.ApplicationForegroundStartupTask;
import kotlin.Metadata;

/* compiled from: SilentUpdatePermissionsCheckTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/silent_update/permissions/SilentUpdatePermissionsCheckTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/silent_update/permissions/i;", "permissionChecker", "LEw0/c;", "analytics", "<init>", "(Lcom/avito/android/silent_update/permissions/i;LEw0/c;)V", "Lkotlin/G0;", "execute", "()V", "Lcom/avito/android/silent_update/permissions/i;", "LEw0/c;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SilentUpdatePermissionsCheckTask implements ApplicationForegroundStartupTask {

    @Y61.k
    private final Ew0.c analytics;

    @Y61.k
    private final i permissionChecker;

    public SilentUpdatePermissionsCheckTask(@Y61.k i iVar, @Y61.k Ew0.c cVar) {
        this.permissionChecker = iVar;
        this.analytics = cVar;
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        boolean zC2 = this.permissionChecker.c();
        boolean zA2 = this.permissionChecker.a();
        boolean zB2 = this.permissionChecker.b();
        Ew0.c cVar = this.analytics;
        cVar.getClass();
        cVar.f4414a.c(new Ew0.e(zC2, zA2, zB2));
    }
}
