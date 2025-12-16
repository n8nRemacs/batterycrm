package com.avito.android.notification_center.list.mvi;

import D30.a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.S;
import com.avito.android.arch.mvi.a;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviState;
import com.avito.android.preloading.coroutines.AbstractC33302a;
import com.avito.android.remote.model.notification.Notification;
import com.avito.android.remote.model.notification.NotificationsResponse;
import com.avito.android.remote.notification.InterfaceC34350q;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: NotificationCenterActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/notification_center/list/mvi/h;", "Lcom/avito/android/arch/mvi/a;", "LD30/a;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviState;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements com.avito.android.arch.mvi.a<D30.a, NotificationCenterMviInternalAction, NotificationCenterMviState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f207692a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification_center.list.j f207693b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AbstractC33302a<G0, NotificationsResponse> f207694c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34350q f207695d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification_center.push.b f207696e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification_center.counter.b f207697f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification_center.counter.h f207698g;

    @Inject
    public h(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.notification_center.list.j jVar, @Y61.k AbstractC33302a<G0, NotificationsResponse> abstractC33302a, @Y61.k InterfaceC34350q interfaceC34350q, @Y61.k com.avito.android.notification_center.push.b bVar, @Y61.k com.avito.android.notification_center.counter.b bVar2, @Y61.k com.avito.android.notification_center.counter.h hVar) {
        this.f207692a = interfaceC28373a;
        this.f207693b = jVar;
        this.f207694c = abstractC33302a;
        this.f207695d = interfaceC34350q;
        this.f207696e = bVar;
        this.f207697f = bVar2;
        this.f207698g = hVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<NotificationCenterMviInternalAction> b(D30.a aVar, NotificationCenterMviState notificationCenterMviState) {
        InterfaceC43160i<NotificationCenterMviInternalAction> interfaceC43160iW;
        List<Notification> list;
        D30.a aVar2 = aVar;
        NotificationCenterMviState notificationCenterMviState2 = notificationCenterMviState;
        if (aVar2.equals(a.b.f2868a)) {
            this.f207692a.c(new S());
            return new C43152f0(C43175k.G(new a(this, null)), new b(3, null));
        }
        if (aVar2.equals(a.C0146a.f2867a)) {
            return new C43152f0(C43175k.G(new a(this, null)), new b(3, null));
        }
        if (aVar2.equals(a.e.f2871a)) {
            return new C43152f0(C43175k.G(new f(this, null)), new g(3, null));
        }
        if (aVar2.equals(a.c.f2869a)) {
            if (notificationCenterMviState2.f207680b != null) {
                return new C43152f0(C43175k.G(new c(this, notificationCenterMviState2, null)), new d(3, null));
            }
            interfaceC43160iW = C43175k.w();
        } else {
            if (!(aVar2 instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            int i12 = ((a.d) aVar2).f2870a;
            interfaceC43160iW = (i12 < 0 || (list = notificationCenterMviState2.f207682d) == null || i12 >= list.size()) ? C43175k.w() : C43175k.G(new e(notificationCenterMviState2, i12, this, null));
        }
        return interfaceC43160iW;
    }
}
