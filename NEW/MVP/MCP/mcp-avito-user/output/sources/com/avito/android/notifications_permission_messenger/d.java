package com.avito.android.notifications_permission_messenger;

import Ck0.InterfaceC13317a;
import com.avito.android.permissions.G;
import com.avito.android.permissions.I;
import com.avito.android.util.C;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationPermissionMessengerDialogDeeplinkProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/d;", "Ldagger/internal/h;", "Lcom/avito/android/notifications_permission_messenger/c;", "a", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final a f207928l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final U30.c f207929a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final V30.c f207930b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.server_time.f> f207931c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final w30.b f207932d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.notifications_settings.profile.a> f207933e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f207934f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final T30.c f207935g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final I f207936h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final P30.c f207937i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final I30.b f207938j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Provider<C> f207939k;

    /* compiled from: NotificationPermissionMessengerDialogDeeplinkProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/d$a;", "", "<init>", "()V", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k U30.c cVar, @Y61.k V30.c cVar2, @Y61.k Provider provider, @Y61.k w30.b bVar, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k T30.c cVar3, @Y61.k I i12, @Y61.k P30.c cVar4, @Y61.k I30.b bVar2, @Y61.k Provider provider4) {
        this.f207929a = cVar;
        this.f207930b = cVar2;
        this.f207931c = provider;
        this.f207932d = bVar;
        this.f207933e = provider2;
        this.f207934f = provider3;
        this.f207935g = cVar3;
        this.f207936h = i12;
        this.f207937i = cVar4;
        this.f207938j = bVar2;
        this.f207939k = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        U30.a aVar = (U30.a) this.f207929a.get();
        V30.a aVar2 = (V30.a) this.f207930b.get();
        com.avito.android.server_time.f fVar = this.f207931c.get();
        InterfaceC13317a interfaceC13317a = (InterfaceC13317a) this.f207932d.get();
        com.avito.android.notifications_settings.profile.a aVar3 = this.f207933e.get();
        R0 r02 = this.f207934f.get();
        T30.a aVar4 = (T30.a) this.f207935g.get();
        G g12 = (G) this.f207936h.get();
        P30.a aVar5 = (P30.a) this.f207937i.get();
        I30.d dVar = (I30.d) this.f207938j.get();
        C c12 = this.f207939k.get();
        f207928l.getClass();
        return new c(aVar, aVar2, fVar, interfaceC13317a, aVar3, r02, aVar4, g12, aVar5, dVar, c12);
    }
}
