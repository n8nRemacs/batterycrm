package com.avito.android.notification_center.list.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.notification.Notification;
import com.avito.android.util.InterfaceC35741a1;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NotificationCenterReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviState;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements u<NotificationCenterMviInternalAction, NotificationCenterMviState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification_center.list.f f207715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f207716c;

    @Inject
    public o(@Y61.k com.avito.android.notification_center.list.f fVar, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f207715b = fVar;
        this.f207716c = interfaceC35741a1;
    }

    @Override // com.avito.android.arch.mvi.u
    public final NotificationCenterMviState a(NotificationCenterMviInternalAction notificationCenterMviInternalAction, NotificationCenterMviState notificationCenterMviState) {
        NotificationCenterMviInternalAction notificationCenterMviInternalAction2 = notificationCenterMviInternalAction;
        NotificationCenterMviState notificationCenterMviState2 = notificationCenterMviState;
        if (notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.ChangeLoadingState) {
            return NotificationCenterMviState.a(notificationCenterMviState2, null, null, null, null, Boolean.valueOf(((NotificationCenterMviInternalAction.ChangeLoadingState) notificationCenterMviInternalAction2).f207666d), null, 47);
        }
        if (notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.ChangeRefreshLoadingState) {
            return NotificationCenterMviState.a(notificationCenterMviState2, null, null, null, null, null, Boolean.valueOf(((NotificationCenterMviInternalAction.ChangeRefreshLoadingState) notificationCenterMviInternalAction2).f207667b), 31);
        }
        if (notificationCenterMviInternalAction2.equals(NotificationCenterMviInternalAction.ClearError.f207668b)) {
            return NotificationCenterMviState.a(notificationCenterMviState2, null, null, null, null, null, null, 55);
        }
        boolean z12 = notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.Content;
        PrintableText printableText = notificationCenterMviState2.f207683e;
        com.avito.android.notification_center.list.f fVar = this.f207715b;
        if (z12) {
            NotificationCenterMviInternalAction.Content content = (NotificationCenterMviInternalAction.Content) notificationCenterMviInternalAction2;
            List<Notification> list = content.f207669b;
            return NotificationCenterMviState.a(notificationCenterMviState2, content.f207670c, fVar.a(printableText, list), list, null, null, null, 56);
        }
        if (notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.UpdateContent) {
            List<Notification> list2 = ((NotificationCenterMviInternalAction.UpdateContent) notificationCenterMviInternalAction2).f207677b;
            return NotificationCenterMviState.a(notificationCenterMviState2, null, fVar.a(printableText, list2), list2, null, null, null, 57);
        }
        if (notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.Error) {
            return NotificationCenterMviState.a(notificationCenterMviState2, null, null, null, InterfaceC35741a1.a.a(this.f207716c, ((NotificationCenterMviInternalAction.Error) notificationCenterMviInternalAction2).f207671b, null, null, 6), null, null, 55);
        }
        if ((notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.OpenDeeplink) || (notificationCenterMviInternalAction2 instanceof NotificationCenterMviInternalAction.OpenPromoLink)) {
            return notificationCenterMviState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
