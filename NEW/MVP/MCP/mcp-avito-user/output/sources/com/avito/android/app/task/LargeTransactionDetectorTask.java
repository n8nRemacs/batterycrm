package com.avito.android.app.task;

import android.app.Application;
import android.os.Build;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.large_transaction.LargeTransactionException;
import com.avito.android.large_transaction.d;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LargeTransactionDetectorTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 ¨\u0006!"}, d2 = {"Lcom/avito/android/app/task/LargeTransactionDetectorTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/large_transaction/d;", "detector", "Lcom/avito/android/P;", "coreFeatures", "Lcom/avito/android/util/C;", "buildInfo", "<init>", "(Lcom/avito/android/analytics/a;Lcom/avito/android/large_transaction/d;Lcom/avito/android/P;Lcom/avito/android/util/C;)V", "Lcom/avito/android/large_transaction/LargeTransactionException;", "exception", "", "activity", "screenContext", "Lkotlin/G0;", "trackOrThrow", "(Lcom/avito/android/large_transaction/LargeTransactionException;Ljava/lang/String;Ljava/lang/String;)V", "", "error", "trackCreationError", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/analytics/a;", "Lcom/avito/android/large_transaction/d;", "Lcom/avito/android/P;", "Lcom/avito/android/util/C;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LargeTransactionDetectorTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final InterfaceC28373a analytics;

    @Y61.k
    private final com.avito.android.util.C buildInfo;

    @Y61.k
    private final com.avito.android.P coreFeatures;

    @Y61.k
    private final com.avito.android.large_transaction.d detector;

    /* compiled from: LargeTransactionDetectorTask.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/app/task/LargeTransactionDetectorTask$a", "Lcom/avito/android/large_transaction/d$c;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d.c {
        public a() {
        }

        public final void a(@Y61.k String str, @Y61.k String str2, @Y61.k Throwable th2) {
            LargeTransactionDetectorTask.this.trackCreationError(th2, str, str2);
        }
    }

    @Inject
    public LargeTransactionDetectorTask(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.large_transaction.d dVar, @Y61.k com.avito.android.P p12, @Y61.k com.avito.android.util.C c12) {
        this.analytics = interfaceC28373a;
        this.detector = dVar;
        this.coreFeatures = p12;
        this.buildInfo = c12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackCreationError(Throwable error, String activity, String screenContext) {
        String str = "Error while printing " + activity + ':' + screenContext;
        this.analytics.c(new NonFatalErrorEvent(str, error, null, new NonFatalErrorEvent.a.b(LargeTransactionDetectorTask.class, str, 0, 4, null), 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackOrThrow(LargeTransactionException exception, String activity, String screenContext) {
        String message = exception.getMessage();
        V2.f318762a.j("LargeTransactionDetector", message, null);
        this.buildInfo.o().getClass();
        InterfaceC28373a interfaceC28373a = this.analytics;
        NonFatalErrorEvent nonFatalErrorEvent = new NonFatalErrorEvent(message, new LargeTransactionException(androidx.compose.foundation.H.i(':', activity, screenContext)), null, new NonFatalErrorEvent.a.b(LargeTransactionException.class, androidx.compose.foundation.H.i(':', activity, screenContext), 0, 4, null), 4, null);
        nonFatalErrorEvent.setStackTrace(new StackTraceElement[0]);
        interfaceC28373a.c(nonFatalErrorEvent);
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        if (Build.VERSION.SDK_INT < 29) {
            return InterfaceC28559h.a.c.f91606a;
        }
        com.avito.android.P p12 = this.coreFeatures;
        p12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[58];
        if (!((Boolean) p12.f67389S.a().invoke()).booleanValue()) {
            return InterfaceC28559h.a.c.f91606a;
        }
        com.avito.android.large_transaction.d dVar = this.detector;
        dVar.f175039a.registerActivityLifecycleCallbacks(dVar.f175044f);
        this.detector.f175043e = new a();
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
