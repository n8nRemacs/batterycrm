package com.avito.android.push.rustore;

import Zf0.C19552a;
import android.app.Application;
import com.avito.android.R;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RuStoreInitBlockingTask.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/push/rustore/RuStoreInitBlockingTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "LZf0/a;", "pushFeatures", "<init>", "(LZf0/a;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "LZf0/a;", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RuStoreInitBlockingTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final C19552a pushFeatures;

    @Inject
    public RuStoreInitBlockingTask(@Y61.k C19552a c19552a) {
        this.pushFeatures = c19552a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        Pa1.c cVar = Pa1.c.f13143a;
        String string = application.getString(R.string.rustorePushSdkId);
        e eVar = new e("AvitoRustorePushClient");
        cVar.getClass();
        Pa1.c.b(application, string, eVar);
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
