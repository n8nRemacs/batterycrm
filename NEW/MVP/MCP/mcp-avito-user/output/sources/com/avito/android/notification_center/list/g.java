package com.avito.android.notification_center.list;

import com.avito.android.notification_center.list.item.NotificationCenterListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationCenterListConverter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/notification_center/list/item/NotificationCenterListItem;", "invoke", "(Lcom/avito/android/notification_center/list/item/NotificationCenterListItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class g extends N implements Y41.l<NotificationCenterListItem, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f207596l = new g();

    public g() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(NotificationCenterListItem notificationCenterListItem) {
        return Boolean.valueOf(notificationCenterListItem.getId() == Long.MAX_VALUE);
    }
}
