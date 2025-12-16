package com.avito.android.notification_center.list.item;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.notification_center.list.item.NotificationCenterListItem;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NotificationCenterListItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/list/item/p;", "Lcom/avito/android/notification_center/list/item/m;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f207628b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f207629c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public p(@Y61.k Locale locale, @Y61.k Resources resources, @Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f207628b = lVar;
        this.f207629c = new SimpleDateFormat(resources.getString(R.string.notification_center_item_date_format), locale);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        r rVar = (r) eVar;
        NotificationCenterListItem.Notification notification = (NotificationCenterListItem.Notification) aVar;
        rVar.setTitle(notification.f207602d);
        rVar.h(notification.f207603e);
        rVar.b0(this.f207629c.format(Long.valueOf(TimeUnit.SECONDS.toMillis(notification.f207604f))));
        if (notification.f207605g) {
            rVar.R10();
        } else {
            rVar.St();
        }
        rVar.c(new n(this, i12));
        rVar.d(new o(rVar));
    }
}
