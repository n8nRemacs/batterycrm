package com.avito.android.api;

import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ApiErrorsHandlingTaskImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/api/ApiErrorsHandlingTaskImpl;", "Lcom/avito/android/api/ApiErrorsHandlingTask;", "Lcom/avito/android/api/k;", "apiErrorsHandler", "<init>", "(Lcom/avito/android/api/k;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/api/k;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApiErrorsHandlingTaskImpl implements ApiErrorsHandlingTask {

    @Y61.k
    private final k apiErrorsHandler;

    @Inject
    public ApiErrorsHandlingTaskImpl(@Y61.k k kVar) {
        this.apiErrorsHandler = kVar;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        k kVar = this.apiErrorsHandler;
        kVar.f91322c.b().N(new AJ.b(3, d.f91310l)).j0(kVar.f91323d.e()).C0(3L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).u0(new a(0, new h(kVar)), new a(1, new i(kVar)));
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
