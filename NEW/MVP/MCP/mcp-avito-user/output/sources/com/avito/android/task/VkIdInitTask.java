package com.avito.android.task;

import C11.a;
import Y61.k;
import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.vk.id.VKID;
import hD.C40806a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VkIdInitTask.kt */
@a
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/task/VkIdInitTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "LhD/a;", "features", "<init>", "(LhD/a;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "LhD/a;", "getFeatures", "()LhD/a;", "_common_social-vk-id_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VkIdInitTask implements ApplicationBlockingStartupTask {

    @k
    private final C40806a features;

    @Inject
    public VkIdInitTask(@k C40806a c40806a) {
        this.features = c40806a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public InterfaceC28559h.a execute(@k Application application) {
        if (this.features.w().invoke().booleanValue()) {
            VKID.Companion.init$default(VKID.INSTANCE, application, null, 2, null);
        }
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
