package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import javax.inject.Inject;
import kotlin.Metadata;
import s41.C47998a;

/* compiled from: InitRxTask.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/app/task/InitRxTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "<init>", "()V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "priority", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "getPriority", "()Lcom/avito/android/app/task/ApplicationBlockingStartupTask$Priority;", "RxJavaUnhandledException", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InitRxTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final ApplicationBlockingStartupTask.Priority priority = ApplicationBlockingStartupTask.Priority.f91379c;

    /* compiled from: InitRxTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/app/task/InitRxTask$RxJavaUnhandledException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RxJavaUnhandledException extends RuntimeException {
    }

    /* compiled from: InitRxTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f91474b = new a<>();

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            if (!(th2 instanceof UndeliverableException)) {
                throw new RxJavaUnhandledException(th2);
            }
            V2.f318762a.a("InitRx3Task", "Undeliverable exception handled", th2);
        }
    }

    @Inject
    public InitRxTask() {
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        C47998a.f437472a = a.f91474b;
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return this.priority;
    }
}
