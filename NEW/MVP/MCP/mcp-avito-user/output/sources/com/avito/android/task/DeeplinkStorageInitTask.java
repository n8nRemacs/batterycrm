package com.avito.android.task;

import Y61.k;
import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.deep_linking.links.ComposedGeneratedDeeplinkMetaStorage;
import com.avito.android.deep_linking.links.storage.a;
import com.avito.android.util.InterfaceC35745a5;
import com.vk.id.captcha.web.h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeeplinkStorageInitTask.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/task/DeeplinkStorageInitTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/util/a5;", "schedulersFactory", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/analytics/screens/D;", "timerFactory", "<init>", "(Lcom/avito/android/util/a5;Lcom/avito/android/analytics/a;Lcom/avito/android/analytics/screens/D;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/util/a5;", "Lcom/avito/android/analytics/a;", "Lcom/avito/android/analytics/screens/D;", "_avito-apps_shared_di"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeeplinkStorageInitTask implements ApplicationBlockingStartupTask {

    @k
    private final InterfaceC28373a analytics;

    @k
    private final InterfaceC35745a5 schedulersFactory;

    @k
    private final D timerFactory;

    @Inject
    public DeeplinkStorageInitTask(@k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC28373a interfaceC28373a, @k D d12) {
        this.schedulersFactory = interfaceC35745a5;
        this.analytics = interfaceC28373a;
        this.timerFactory = d12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$4(C c12, DeeplinkStorageInitTask deeplinkStorageInitTask) {
        c12.a();
        a.f134018a.getClassesToMetaInfo();
        deeplinkStorageInitTask.analytics.c(new y.c("deeplink-initialization.classes-to-meta-info", Long.valueOf(c12.b()), null));
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public InterfaceC28559h.a execute(@k Application application) {
        this.timerFactory.getClass();
        F f12 = new F();
        f12.c();
        a aVar = a.f134018a;
        a.AbstractC4029a.b bVar = new a.AbstractC4029a.b(new ComposedGeneratedDeeplinkMetaStorage());
        aVar.getClass();
        a.f134019b = bVar;
        this.analytics.c(new y.c("deeplink-initialization.set-init-strategy", Long.valueOf(f12.b()), null));
        this.schedulersFactory.a().d(new h(19, f12, this));
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
