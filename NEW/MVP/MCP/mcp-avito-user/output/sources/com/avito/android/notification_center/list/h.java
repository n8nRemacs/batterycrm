package com.avito.android.notification_center.list;

import com.avito.android.notification_center.list.item.NotificationCenterListItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.notification.Notification;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationCenterListConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notification_center/list/h;", "Lcom/avito/android/notification_center/list/f;", "<init>", "()V", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements f {
    @Inject
    public h() {
    }

    @Override // com.avito.android.notification_center.list.f
    @Y61.k
    public final ArrayList a(@Y61.l PrintableText printableText, @Y61.k List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            Notification notification = (Notification) obj;
            arrayList.add(new NotificationCenterListItem.Notification(i12, notification.getId(), notification.getTitle(), notification.getDescription(), notification.getDate(), notification.getIsRead()));
            i12 = i13;
        }
        if (arrayList.isEmpty() || printableText == null) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            C42745f0.l0(g.f207596l, arrayList2);
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        C42745f0.l0(g.f207596l, arrayList3);
        return C42745f0.i0(new NotificationCenterListItem.ErrorSnippet(Long.MAX_VALUE, printableText), arrayList3);
    }
}
