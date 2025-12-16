package com.avito.android.ux.feedback.impl;

import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvitoUxFeedbackWarmupTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/ux/feedback/impl/AvitoUxFeedbackWarmupTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "LVK0/a;", "features", "Lcom/avito/android/ux/feedback/impl/b;", "factory", "<init>", "(LVK0/a;Lcom/avito/android/ux/feedback/impl/b;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "LVK0/a;", "Lcom/avito/android/ux/feedback/impl/b;", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AvitoUxFeedbackWarmupTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final b factory;

    @Y61.k
    private final VK0.a features;

    @Inject
    public AvitoUxFeedbackWarmupTask(@Y61.k VK0.a aVar, @Y61.k b bVar) {
        this.features = aVar;
        this.factory = bVar;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        VK0.a aVar = this.features;
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = VK0.a.f17075f[1];
        if (((Boolean) aVar.f17077c.a().invoke()).booleanValue()) {
            this.factory.f319137b.getValue();
            G0 g02 = G0.f406611a;
        }
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
