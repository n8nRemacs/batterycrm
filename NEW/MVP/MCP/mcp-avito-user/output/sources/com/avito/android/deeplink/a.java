package com.avito.android.deeplink;

import Ju.AbstractC14250d;
import Y61.k;
import android.os.Bundle;
import com.avito.android.ab_tests.configs.CrmNotificationCenterBeduinRedesignTestGroup;
import com.avito.android.beduin.v2.page.BeduinV2PageDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NotificationCenterLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import l41.g;
import l41.r;
import u3.l;

/* compiled from: NotificationCenterListDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/NotificationCenterLink;", "a", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<NotificationCenterLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A30.b f134095f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f134096g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f134097h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final l<CrmNotificationCenterBeduinRedesignTestGroup> f134098i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.notification_center.counter.a f134099j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f134100k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: NotificationCenterListDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deeplink/a$a;", "", "<init>", "()V", "", "BEDUIN_NC_REQUEST_KEY", "Ljava/lang/String;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.deeplink.a$a, reason: collision with other inner class name */
    public static final class C4034a {
        public /* synthetic */ C4034a(C42822w c42822w) {
            this();
        }

        public C4034a() {
        }
    }

    /* compiled from: NotificationCenterListDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f134101b = new b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return L.f(((C43501a) obj).f413260a.f134521b, "beduin_nc_request_key");
        }
    }

    /* compiled from: NotificationCenterListDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = a.this;
            try {
                aVar.f134099j.a();
            } finally {
                aVar.j(AbstractC14250d.c.f9171c);
            }
        }
    }

    static {
        new C4034a(null);
    }

    @Inject
    public a(@k A30.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k l<CrmNotificationCenterBeduinRedesignTestGroup> lVar, @k com.avito.android.notification_center.counter.a aVar2) {
        this.f134095f = bVar;
        this.f134096g = interfaceC4053a;
        this.f134097h = aVar;
        this.f134098i = lVar;
        this.f134099j = aVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        l<CrmNotificationCenterBeduinRedesignTestGroup> lVar = this.f134098i;
        CrmNotificationCenterBeduinRedesignTestGroup crmNotificationCenterBeduinRedesignTestGroup = lVar.f439745a.f439749b;
        crmNotificationCenterBeduinRedesignTestGroup.getClass();
        if (crmNotificationCenterBeduinRedesignTestGroup != CrmNotificationCenterBeduinRedesignTestGroup.f67788c) {
            lVar.b();
        }
        CrmNotificationCenterBeduinRedesignTestGroup crmNotificationCenterBeduinRedesignTestGroup2 = lVar.f439745a.f439749b;
        crmNotificationCenterBeduinRedesignTestGroup2.getClass();
        if (crmNotificationCenterBeduinRedesignTestGroup2 == CrmNotificationCenterBeduinRedesignTestGroup.f67790e || crmNotificationCenterBeduinRedesignTestGroup2 == CrmNotificationCenterBeduinRedesignTestGroup.f67791f) {
            this.f134097h.r6(bundle, new BeduinV2PageDeepLink("/api/2/notifications/bdui/categories", "NotificationCenterList", false, false, false, null, null, null, false, 480, null), "beduin_nc_request_key");
        } else {
            this.f134096g.R(this.f134095f.a(), com.avito.android.deeplink_handler.view.b.f134588l);
            j(AbstractC14250d.c.f9171c);
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f134100k.b(this.f134097h.d9().N(b.f134101b).t0(new c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f134100k.e();
    }
}
