package com.avito.android.notification_center.list.mvi;

import D30.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NotificationCenterOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "LD30/b;", "<init>", "()V", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements t<NotificationCenterMviInternalAction, D30.b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final D30.b b(NotificationCenterMviInternalAction notificationCenterMviInternalAction) {
        NotificationCenterMviInternalAction notificationCenterMviInternalAction2 = notificationCenterMviInternalAction;
        if (notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.OpenPromoLink) {
            NotificationCenterMviInternalAction.OpenPromoLink openPromoLink = (NotificationCenterMviInternalAction.OpenPromoLink) notificationCenterMviInternalAction2;
            return new b.C0147b(openPromoLink.f207675b, openPromoLink.f207676c);
        }
        if (notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.OpenDeeplink) {
            NotificationCenterMviInternalAction.OpenDeeplink openDeeplink = (NotificationCenterMviInternalAction.OpenDeeplink) notificationCenterMviInternalAction2;
            return new b.a(openDeeplink.f207673b, openDeeplink.f207674c);
        }
        if (notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.ChangeLoadingState ? true : notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.ChangeRefreshLoadingState ? true : notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.Content ? true : notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.Error ? true : notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.UpdateContent ? true : notificationCenterMviInternalAction2.equals(NotificationCenterMviInternalAction.ClearError.f207668b)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
