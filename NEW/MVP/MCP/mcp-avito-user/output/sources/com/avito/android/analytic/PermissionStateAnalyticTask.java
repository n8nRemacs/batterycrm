package com.avito.android.analytic;

import Y61.k;
import Yb.InterfaceC18250a;
import Yb.e;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LocationPermissionStateAnalyticTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/analytic/PermissionStateAnalyticTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "LYb/a;", "locationAnalyticInteractor", "LYb/e;", "microAnalyticInteractor", "<init>", "(LYb/a;LYb/e;)V", "Lkotlin/G0;", "execute", "()V", "LYb/a;", "LYb/e;", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PermissionStateAnalyticTask implements ApplicationForegroundStartupTask {

    @k
    private final InterfaceC18250a locationAnalyticInteractor;

    @k
    private final e microAnalyticInteractor;

    @Inject
    public PermissionStateAnalyticTask(@k InterfaceC18250a interfaceC18250a, @k e eVar) {
        this.locationAnalyticInteractor = interfaceC18250a;
        this.microAnalyticInteractor = eVar;
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        V2.f318762a.c("PermissionStateProvider", "execute task", null);
        this.locationAnalyticInteractor.a();
        this.microAnalyticInteractor.a();
    }
}
