package com.avito.android.app.task;

import android.app.Application;
import android.content.Context;
import com.avito.android.service.short_task.fingerprint.FingerprintCalculationWorker;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FingerprintCalculationSchedulerTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/app/task/FingerprintCalculationSchedulerTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Landroid/content/Context;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FingerprintCalculationSchedulerTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final Context context;

    @Inject
    public FingerprintCalculationSchedulerTask(@Y61.k Context context) {
        this.context = context;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        FingerprintCalculationWorker.a aVar = FingerprintCalculationWorker.f274053c;
        Context context = this.context;
        TimeUnit timeUnit = TimeUnit.HOURS;
        aVar.getClass();
        FingerprintCalculationWorker.a.a(context, 0L, timeUnit);
    }
}
