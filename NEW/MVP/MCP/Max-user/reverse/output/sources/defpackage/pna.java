package defpackage;

import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;

/* loaded from: classes2.dex */
public final class pna extends q44 {
    public int X;
    public /* synthetic */ Object d;
    public final /* synthetic */ NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pna(NotificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker notificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker, q44 q44Var) {
        super(q44Var);
        this.o = notificationTrackerCleanupScheduler$NotificationTrackerCleanupWorker;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.d = obj;
        this.X |= Integer.MIN_VALUE;
        return this.o.doWork(this);
    }
}
