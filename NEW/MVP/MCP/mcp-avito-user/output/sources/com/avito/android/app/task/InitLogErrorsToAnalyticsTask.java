package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import pc1.b;

/* compiled from: InitLogErrorsToAnalyticsTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/app/task/InitLogErrorsToAnalyticsTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/P;", "coreFeatures", "<init>", "(Lcom/avito/android/analytics/a;Lcom/avito/android/P;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/analytics/a;", "Lcom/avito/android/P;", "a", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InitLogErrorsToAnalyticsTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final InterfaceC28373a analytics;

    @Y61.k
    private final com.avito.android.P coreFeatures;

    /* compiled from: InitLogErrorsToAnalyticsTask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/InitLogErrorsToAnalyticsTask$a;", "Lpc1/b$c;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends b.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC28373a f91473b;

        public a(@Y61.k InterfaceC28373a interfaceC28373a) {
            this.f91473b = interfaceC28373a;
        }

        @Override // pc1.b.c
        public final boolean i(int i12) {
            return i12 == 6 || i12 == 7;
        }

        @Override // pc1.b.c
        public final void j(int i12, @Y61.l String str, @Y61.k String str2, @Y61.l Throwable th2) {
            NonFatalErrorEvent nonFatalErrorEvent = new NonFatalErrorEvent(androidx.compose.foundation.H.i(' ', str, str2), th2, null, null, 12, null);
            InterfaceC28373a interfaceC28373a = this.f91473b;
            interfaceC28373a.c(nonFatalErrorEvent);
            if (th2 == null) {
                return;
            }
            interfaceC28373a.c(new cc.g(th2, androidx.compose.foundation.H.i(' ', str, str2)));
        }
    }

    @Inject
    public InitLogErrorsToAnalyticsTask(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.P p12) {
        this.analytics = interfaceC28373a;
        this.coreFeatures = p12;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        com.avito.android.P p12 = this.coreFeatures;
        p12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[57];
        if (((Boolean) p12.f67388R.a().invoke()).booleanValue()) {
            pc1.b.f428696a.o(new a(this.analytics));
        }
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
