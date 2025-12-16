package Bk0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.notification.analytics.NotificationClickEvent;
import com.avito.android.remote.notification.analytics.NotificationEvent;
import com.avito.android.remote.notification.analytics.NotificationImageLoadEvent;
import com.avito.android.remote.notification.analytics.NotificationMessengerIconLoadEvent;
import com.avito.android.remote.notification.analytics.NotificationPayloadEvent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationGrafanaTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBk0/b;", "LBk0/a;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class b implements InterfaceC13158a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f1667a;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a) {
        this.f1667a = interfaceC28373a;
    }

    @Override // Bk0.InterfaceC13158a
    public final void a(@k NotificationPayloadEvent notificationPayloadEvent) {
        this.f1667a.c(new y.a("push_payload.".concat(notificationPayloadEvent.f254043b), 0L, 2, null));
    }

    @Override // Bk0.InterfaceC13158a
    public final void b(@k e eVar) {
        this.f1667a.c(eVar);
    }

    @Override // Bk0.InterfaceC13158a
    public final void c(@k NotificationImageLoadEvent notificationImageLoadEvent) {
        this.f1667a.c(new y.a("push_image.".concat(notificationImageLoadEvent.f254028b), 0L, 2, null));
    }

    @Override // Bk0.InterfaceC13158a
    public final void d(@k NotificationEvent notificationEvent) {
        this.f1667a.c(new y.a("push_cr." + notificationEvent.f254021b, 0L, 2, null));
    }

    @Override // Bk0.InterfaceC13158a
    public final void e(@k NotificationClickEvent notificationClickEvent) {
        this.f1667a.c(new y.a("push_click.".concat(notificationClickEvent.f254002b), 0L, 2, null));
    }

    @Override // Bk0.InterfaceC13158a
    public final void f(@k NotificationMessengerIconLoadEvent notificationMessengerIconLoadEvent) {
        this.f1667a.c(new y.a("push_msg_image.".concat(notificationMessengerIconLoadEvent.f254036b), 0L, 2, null));
    }

    @Override // Bk0.InterfaceC13158a
    public final void g(@k String str) {
        this.f1667a.c(new y.a("push_receive_".concat(str), 0L, 2, null));
    }

    @Override // Bk0.InterfaceC13158a
    public final void h() {
        this.f1667a.c(new y.a("msg_payload.without_id", 0L, 2, null));
    }
}
