package com.avito.android.ux.feedback.impl;

import android.app.Application;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import f90.InterfaceC40256e;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppSessionStartTimeSaverTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/ux/feedback/impl/AppSessionStartTimeSaverTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lf90/e;", "appStartTimeStorage", "<init>", "(Lf90/e;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lf90/e;", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppSessionStartTimeSaverTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final InterfaceC40256e appStartTimeStorage;

    @Inject
    public AppSessionStartTimeSaverTask(@Y61.k InterfaceC40256e interfaceC40256e) {
        this.appStartTimeStorage = interfaceC40256e;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        this.appStartTimeStorage.a(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
    }
}
