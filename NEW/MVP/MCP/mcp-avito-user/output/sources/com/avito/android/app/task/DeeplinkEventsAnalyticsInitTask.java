package com.avito.android.app.task;

import Nu.InterfaceC14612b;
import Ru.InterfaceC15081a;
import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.C35896f0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeeplinkEventsAnalyticsInitTask.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/app/task/DeeplinkEventsAnalyticsInitTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/deeplink_events/registry/e;", "deeplinkEventsObserver", "LNu/b;", "deeplinkAnalyticsTracker", "Lcom/avito/android/util/a5;", "schedulersFactory", "<init>", "(Lcom/avito/android/deeplink_events/registry/e;LNu/b;Lcom/avito/android/util/a5;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/deeplink_events/registry/e;", "LNu/b;", "Lcom/avito/android/util/a5;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeeplinkEventsAnalyticsInitTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final InterfaceC14612b deeplinkAnalyticsTracker;

    @Y61.k
    private final com.avito.android.deeplink_events.registry.e deeplinkEventsObserver;

    @Y61.k
    private final InterfaceC35745a5 schedulersFactory;

    @Inject
    public DeeplinkEventsAnalyticsInitTask(@Y61.k com.avito.android.deeplink_events.registry.e eVar, @Y61.k InterfaceC14612b interfaceC14612b, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.deeplinkEventsObserver = eVar;
        this.deeplinkAnalyticsTracker = interfaceC14612b;
        this.schedulersFactory = interfaceC35745a5;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        io.reactivex.rxjava3.internal.operators.observable.T0 t0A = this.deeplinkEventsObserver.a();
        final InterfaceC14612b interfaceC14612b = this.deeplinkAnalyticsTracker;
        C35896f0.f(t0A.K(new l41.g() { // from class: com.avito.android.app.task.DeeplinkEventsAnalyticsInitTask.a
            @Override // l41.g
            public final void accept(Object obj) {
                interfaceC14612b.a((InterfaceC15081a) obj);
            }
        }).x0(this.schedulersFactory.a()));
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
