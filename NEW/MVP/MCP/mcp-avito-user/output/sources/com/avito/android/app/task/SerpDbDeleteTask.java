package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SerpDbDeleteTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/app/task/SerpDbDeleteTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/util/a5;", "schedulers", "<init>", "(Lcom/avito/android/util/a5;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/util/a5;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SerpDbDeleteTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final InterfaceC35745a5 schedulers;

    @Inject
    public SerpDbDeleteTask(@Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.schedulers = interfaceC35745a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object execute$lambda$0(Application application) {
        return Boolean.valueOf(application.deleteDatabase("avito_brite.db"));
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        new io.reactivex.rxjava3.internal.operators.completable.r(new VH0.c(application, 10)).x(this.schedulers.a()).u();
    }
}
