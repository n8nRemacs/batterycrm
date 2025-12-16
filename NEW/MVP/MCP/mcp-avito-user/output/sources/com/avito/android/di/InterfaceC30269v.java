package com.avito.android.di;

import com.avito.android.remote.notification.NotificationService;
import h31.d;
import kotlin.Metadata;

/* compiled from: NotificationServiceComponent.kt */
@D
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/di/v;", "", "a", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* renamed from: com.avito.android.di.v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30269v {

    /* compiled from: NotificationServiceComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/di/v$a;", "", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.v$a */
    public interface a {
        @h31.b
        @Y61.k
        a a();

        @h31.b
        @Y61.k
        a b(@Y61.k NotificationService notificationService);

        @Y61.k
        InterfaceC30269v build();

        @Y61.k
        a c(@Y61.k InterfaceC30270w interfaceC30270w);
    }

    void a(@Y61.k NotificationService notificationService);
}
