package com.avito.android.app.task;

import Oq.InterfaceC14725a;
import android.app.Application;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.MessengerDbException;
import com.avito.android.util.X2;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.InterfaceC43069u;
import kotlin.Metadata;

/* compiled from: MessengerDbMaintenanceTask.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/app/task/MessengerDbMaintenanceTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/e1;", "messengerFeatures", "<init>", "(Lcom/avito/android/analytics/a;Lcom/avito/android/e1;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lcom/avito/android/messenger/analytics/x;", "tracker", "Lcom/avito/android/messenger/analytics/x;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MessengerDbMaintenanceTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final C31667x tracker;

    @Inject
    public MessengerDbMaintenanceTask(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C30277e1 c30277e1) {
        this.tracker = new C31667x(interfaceC28373a, c30277e1);
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    @InterfaceC43069u
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        X2 x22 = X2.f318778a;
        x22.i("MessengerDbMaintenanceTask", "execute MessengerDbMaintenanceTask", null);
        com.avito.android.messenger.util.d dVar = new com.avito.android.messenger.util.d(application, "messenger.db");
        if (!dVar.f197434a) {
            return InterfaceC28559h.a.c.f91606a;
        }
        x22.i("MessengerDbMaintenanceTask", "DB was corrupt on application start", null);
        LinkedHashMap linkedHashMapA = dVar.a(true);
        if (!dVar.f197435b) {
            return new InterfaceC28559h.a.C2695a("DB was corrupt on application start", null, 2, null);
        }
        InterfaceC14725a.C0808a.a(this.tracker, new MessengerDbException(dVar.f197436c, "DB was corrupt on application start", null, 4, null), linkedHashMapA, 2);
        return new InterfaceC28559h.a.C2695a("DB was corrupt on application start. File exists", null, 2, null);
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
