package com.avito.android.iac_dialer.impl_module.notifications.new_impl;

import android.app.Notification;
import com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotification;
import kotlin.Metadata;

/* compiled from: IacNotificationBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/a;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {
    @Y61.k
    Notification a();

    @Y61.k
    Notification b(@Y61.k IacNotification.CallInitializing callInitializing);

    @Y61.k
    Notification c(@Y61.k IacNotification.Call call);
}
