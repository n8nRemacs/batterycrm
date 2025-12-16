package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: SendCrashRecordsToClickStreamTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/app/task/SendCrashRecordsToClickStreamTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/error_reporting/error_reporter/a;", "crashRecorder", "Lcom/avito/android/analytics/a;", "analytics", "<init>", "(Lcom/avito/android/error_reporting/error_reporter/a;Lcom/avito/android/analytics/a;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/error_reporting/error_reporter/a;", "Lcom/avito/android/analytics/a;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SendCrashRecordsToClickStreamTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final InterfaceC28373a analytics;

    @Y61.k
    private final com.avito.android.error_reporting.error_reporter.a crashRecorder;

    public SendCrashRecordsToClickStreamTask(@Y61.k com.avito.android.error_reporting.error_reporter.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.crashRecorder = aVar;
        this.analytics = interfaceC28373a;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        long jA2 = this.crashRecorder.a();
        if (jA2 != 0) {
            this.analytics.c(new ParametrizedClickStreamEvent(2638, 0, Collections.singletonMap("cdtm", Long.valueOf(jA2)), null, 8, null));
            this.crashRecorder.b();
        }
    }
}
