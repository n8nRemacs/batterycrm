package com.avito.android.notifications_permission_messenger.deeplink;

import Ck0.InterfaceC13317a;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.notifications_permission_messenger.j;
import com.avito.android.notifications_permission_messenger.n;
import com.avito.android.util.C;
import com.avito.android.util.C35868p2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import dagger.internal.f;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationPermissionMessengerDialogDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/c;", "Ldagger/internal/h;", "Lcom/avito/android/notifications_permission_messenger/deeplink/b;", "a", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final a f207967p = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f207968a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dv.b f207969b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dv.b f207970c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final dv.b f207971d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f207972e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final f f207973f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final V30.c f207974g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.server_time.f> f207975h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.notifications_settings.profile.a> f207976i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Provider<R0> f207977j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C35868p2 f207978k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final w30.b f207979l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Provider<F> f207980m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final L30.c f207981n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Provider<C> f207982o;

    /* compiled from: NotificationPermissionMessengerDialogDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/c$a;", "", "<init>", "()V", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k dv.b bVar, @k dv.b bVar2, @k dv.b bVar3, @k dv.b bVar4, @k j jVar, @k f fVar, @k V30.c cVar, @k Provider provider, @k Provider provider2, @k Provider provider3, @k C35868p2 c35868p2, @k w30.b bVar5, @k Provider provider4, @k L30.c cVar2, @k Provider provider5) {
        this.f207968a = bVar;
        this.f207969b = bVar2;
        this.f207970c = bVar3;
        this.f207971d = bVar4;
        this.f207972e = jVar;
        this.f207973f = fVar;
        this.f207974g = cVar;
        this.f207975h = provider;
        this.f207976i = provider2;
        this.f207977j = provider3;
        this.f207978k = c35868p2;
        this.f207979l = bVar5;
        this.f207980m = provider4;
        this.f207981n = cVar2;
        this.f207982o = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.f fVar = (a.f) this.f207968a.get();
        a.d dVar = (a.d) this.f207969b.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f207970c.get();
        a.i iVar = (a.i) this.f207971d.get();
        n nVar = (n) this.f207972e.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f207973f.get();
        V30.a aVar = (V30.a) this.f207974g.get();
        com.avito.android.server_time.f fVar2 = this.f207975h.get();
        com.avito.android.notifications_settings.profile.a aVar2 = this.f207976i.get();
        R0 r02 = this.f207977j.get();
        InterfaceC35845m2 interfaceC35845m2 = (InterfaceC35845m2) this.f207978k.get();
        InterfaceC13317a interfaceC13317a = (InterfaceC13317a) this.f207979l.get();
        F f12 = this.f207980m.get();
        L30.a aVar3 = (L30.a) this.f207981n.get();
        C c12 = this.f207982o.get();
        f207967p.getClass();
        return new b(fVar, dVar, interfaceC4053a, iVar, nVar, interfaceC28373a, aVar, fVar2, aVar2, r02, interfaceC35845m2, interfaceC13317a, f12, aVar3, c12);
    }
}
