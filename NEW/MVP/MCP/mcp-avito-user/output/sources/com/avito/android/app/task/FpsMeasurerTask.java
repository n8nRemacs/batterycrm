package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FpsMeasurerTask.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/app/task/FpsMeasurerTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/util/C;", "buildInfo", "Lcom/avito/android/I1;", "features", "Lh31/e;", "Lcom/avito/android/fps/e;", "framesListener", "<init>", "(Lcom/avito/android/util/C;Lcom/avito/android/I1;Lh31/e;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/util/C;", "Lcom/avito/android/I1;", "Lh31/e;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FpsMeasurerTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final com.avito.android.util.C buildInfo;

    @Y61.k
    private final com.avito.android.I1 features;

    @Y61.k
    private final h31.e<com.avito.android.fps.e> framesListener;

    @Inject
    public FpsMeasurerTask(@Y61.k com.avito.android.util.C c12, @Y61.k com.avito.android.I1 i12, @Y61.k h31.e<com.avito.android.fps.e> eVar) {
        this.buildInfo = c12;
        this.features = i12;
        this.framesListener = eVar;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        com.avito.android.I1 i12 = this.features;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.I1.f67278k0[11];
        if (((Boolean) i12.f67325l.a().invoke()).booleanValue() || com.avito.android.util.E.a(this.buildInfo.o())) {
            this.framesListener.get().a();
        }
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
