package com.avito.android.app.task;

import android.app.Application;
import kotlin.Metadata;

/* compiled from: ShortcutsTask.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/app/task/NoOpShortcutsTask;", "Lcom/avito/android/app/task/ShortcutsTask;", "<init>", "()V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NoOpShortcutsTask implements ShortcutsTask {

    @Y61.k
    public static final NoOpShortcutsTask INSTANCE = new NoOpShortcutsTask();

    private NoOpShortcutsTask() {
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
    }
}
