package com.avito.android.advert_core.task;

import AK0.l;
import Fc1.E0;
import Y61.k;
import android.app.Application;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;

/* compiled from: FirstTimeRunTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/advert_core/task/FirstTimeRunTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "LAK0/l;", "preferences", "Lcom/avito/android/util/a5;", "schedulerFactory", "<init>", "(LAK0/l;Lcom/avito/android/util/a5;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "LAK0/l;", "Lcom/avito/android/util/a5;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FirstTimeRunTask implements ApplicationBackgroundStartupTask {

    @k
    private final l preferences;

    @k
    private final InterfaceC35745a5 schedulerFactory;

    /* compiled from: FirstTimeRunTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f84394b = new a<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.j("FirstTimeRunTask", "fail to execute", (Throwable) obj);
        }
    }

    @Inject
    public FirstTimeRunTask(@k l lVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.preferences = lVar;
        this.schedulerFactory = interfaceC35745a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(FirstTimeRunTask firstTimeRunTask) {
        if (firstTimeRunTask.preferences.contains("first_time_run")) {
            return;
        }
        firstTimeRunTask.preferences.putLong("first_time_run", System.currentTimeMillis());
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@k Application application) {
        new C41826q(new E0(this, 7)).x(this.schedulerFactory.a()).v(new com.avito.android.advert_core.task.a(0), a.f84394b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$1() {
    }
}
