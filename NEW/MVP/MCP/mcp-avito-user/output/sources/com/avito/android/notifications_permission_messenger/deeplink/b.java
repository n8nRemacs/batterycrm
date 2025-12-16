package com.avito.android.notifications_permission_messenger.deeplink;

import Ck0.InterfaceC13317a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.notifications_permission_messenger.NotificationPermissionMessengerDialogResult;
import com.avito.android.notifications_permission_messenger.n;
import com.avito.android.server_time.f;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import rv.C47919b;

/* compiled from: NotificationPermissionMessengerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_permission_messenger/deeplink/b;", "Lev/a;", "Lcom/avito/android/notifications_permission_messenger/deeplink/NotificationPermissionMessengerDialogDeeplink;", "_avito_notifications-permission-messenger-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends AbstractC40161a<NotificationPermissionMessengerDialogDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.f f207951f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f207952g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f207953h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.i f207954i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final n f207955j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC28373a f207956k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final V30.a f207957l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final f f207958m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.avito.android.notifications_settings.profile.a f207959n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final R0 f207960o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final InterfaceC35845m2 f207961p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final InterfaceC13317a f207962q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final F f207963r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final L30.a f207964s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final C f207965t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final C43238h f207966u;

    /* compiled from: NotificationPermissionMessengerDialogDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @l
        public final Object a(@k C47919b c47919b) {
            b bVar = (b) this.receiver;
            bVar.getClass();
            NotificationPermissionMessengerDialogResult.a aVar = NotificationPermissionMessengerDialogResult.f207897V1;
            Bundle bundle = c47919b.f437159b;
            aVar.getClass();
            NotificationPermissionMessengerDialogResult notificationPermissionMessengerDialogResult = (NotificationPermissionMessengerDialogResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("notifications_permission_messenger.NotificationPermissionMessengerDialogResult", NotificationPermissionMessengerDialogResult.class) : bundle.getParcelable("notifications_permission_messenger.NotificationPermissionMessengerDialogResult"));
            if (notificationPermissionMessengerDialogResult != null) {
                boolean z12 = notificationPermissionMessengerDialogResult instanceof NotificationPermissionMessengerDialogResult.OnEnableClicked;
                F f12 = bVar.f207963r;
                InterfaceC28373a interfaceC28373a = bVar.f207956k;
                if (z12) {
                    interfaceC28373a.c(new y.a(f12.a("publishNotification.dialog.enable", "{{%app_ver%}}").f91030a, 1L));
                    C43259k.d(bVar.f207966u, null, null, new com.avito.android.notifications_permission_messenger.deeplink.a(((NotificationPermissionMessengerDialogResult.OnEnableClicked) notificationPermissionMessengerDialogResult).f207898b, bVar, null), 3);
                } else if (notificationPermissionMessengerDialogResult instanceof NotificationPermissionMessengerDialogResult.OnSkipClicked) {
                    interfaceC28373a.c(new y.a(f12.a("publishNotification.dialog.skip", "{{%app_ver%}}").f91030a, 1L));
                }
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return a(c47919b);
        }
    }

    @Inject
    public b(@k a.f fVar, @k a.d dVar, @k a.InterfaceC4053a interfaceC4053a, @k a.i iVar, @k n nVar, @k InterfaceC28373a interfaceC28373a, @k V30.a aVar, @k f fVar2, @k com.avito.android.notifications_settings.profile.a aVar2, @k R0 r02, @k InterfaceC35845m2 interfaceC35845m2, @k InterfaceC13317a interfaceC13317a, @k F f12, @k L30.a aVar3, @k C c12) {
        this.f207951f = fVar;
        this.f207952g = dVar;
        this.f207953h = interfaceC4053a;
        this.f207954i = iVar;
        this.f207955j = nVar;
        this.f207956k = interfaceC28373a;
        this.f207957l = aVar;
        this.f207958m = fVar2;
        this.f207959n = aVar2;
        this.f207960o = r02;
        this.f207961p = interfaceC35845m2;
        this.f207962q = interfaceC13317a;
        this.f207963r = f12;
        this.f207964s = aVar3;
        this.f207965t = c12;
        this.f207966u = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f207957l.b(this.f207958m.now());
        this.f207956k.c(new y.a(this.f207963r.a("publishNotification.dialog.show", "{{%app_ver%}}").f91030a, 1L));
        String str2 = this.f395444b;
        this.f207952g.w1(this.f207955j.c((NotificationPermissionMessengerDialogDeeplink) deepLink, str2), this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new a(2, this, b.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), kotlinx.coroutines.rx3.y.a(this.f207951f.l1(this.f395444b))), this.f207966u);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f207966u, null);
    }
}
