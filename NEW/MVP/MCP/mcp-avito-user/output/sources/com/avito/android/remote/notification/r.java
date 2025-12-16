package com.avito.android.remote.notification;

import Ag.CallableC13028a;
import Bk0.InterfaceC13158a;
import Ru.b;
import Zf0.C19552a;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.app.K;
import androidx.core.app.z;
import androidx.core.content.pm.e;
import androidx.core.graphics.drawable.IconCompat;
import com.avito.android.C30277e1;
import com.avito.android.InterfaceC31091j1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_events.events.DeeplinkHandlingResultStatus;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.remote.model.notification.Payload;
import com.avito.android.remote.notification.InterfaceC34334a;
import com.avito.android.remote.notification.NotificationType;
import com.avito.android.remote.notification.analytics.NotificationEvent;
import com.avito.android.remote.notification.error.NotificationNotSupportedException;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import y30.InterfaceC50050d;

/* compiled from: NotificationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/notification/r;", "Lcom/avito/android/remote/notification/q;", "a", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class r implements InterfaceC34350q {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f254068z = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f254069a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification.m f254070b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34339f f254071c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34346m f254072d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A f254073e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notificationdeeplink.c f254074f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31091j1 f254075g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite_sellers.service.h f254076h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_advert.advert.service.f f254077i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f254078j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f254079k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.mapping.checker.c f254080l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34334a f254081m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13158a f254082n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_events.registry.d f254083o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.missed_calls.a f254084p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f254085q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification.parameters_factory.e f254086r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app_foreground_provider.util_module.a f254087s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Bk0.f f254088t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final C19552a f254089u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50050d f254090v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final HashMap<NotificationIdentifier, io.reactivex.rxjava3.disposables.d> f254091w = new HashMap<>();

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final CopyOnWriteArrayList<z> f254092x = new CopyOnWriteArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    public final int f254093y;

    /* compiled from: NotificationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/notification/r$a;", "", "<init>", "()V", "", "BLANK_PERSON_NAME", "Ljava/lang/String;", "EMPTY_PERSON_NAME", "KEY_DIRECT_REPLY", "SHORTCUT_ID_PREFIX", "TAG", "TAG_CHANNEL", "TAG_CHANNELS", "TAG_NC", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: NotificationInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "intercepted", "kotlin.jvm.PlatformType", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> implements l41.r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                r.this.f254082n.d(NotificationEvent.f254014n);
            }
            return !r3.booleanValue();
        }
    }

    /* compiled from: NotificationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PushParameters f254096c;

        public c(PushParameters pushParameters) {
            this.f254096c = pushParameters;
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
        @Override // l41.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void accept(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 675
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.notification.r.c.accept(java.lang.Object):void");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public r(@Y61.k Context context, @Y61.k com.avito.android.notification.m mVar, @Y61.k InterfaceC34339f interfaceC34339f, @Y61.k InterfaceC34346m interfaceC34346m, @Y61.k A a12, @Y61.k com.avito.android.notificationdeeplink.c cVar, @Y61.k InterfaceC31091j1 interfaceC31091j1, @Y61.k com.avito.android.favorite_sellers.service.h hVar, @Y61.k com.avito.android.user_advert.advert.service.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.mapping.checker.c cVar2, @Y61.k InterfaceC34334a interfaceC34334a, @Y61.k InterfaceC13158a interfaceC13158a, @Y61.k com.avito.android.deeplink_events.registry.d dVar, @Y61.k com.avito.android.missed_calls.a aVar, @Y61.k C30277e1 c30277e1, @Y61.k com.avito.android.notification.parameters_factory.e eVar, @Y61.k com.avito.android.app_foreground_provider.util_module.a aVar2, @Y61.k Bk0.f fVar2, @Y61.k C19552a c19552a, @Y61.k InterfaceC50050d interfaceC50050d) {
        this.f254069a = context;
        this.f254070b = mVar;
        this.f254071c = interfaceC34339f;
        this.f254072d = interfaceC34346m;
        this.f254073e = a12;
        this.f254074f = cVar;
        this.f254075g = interfaceC31091j1;
        this.f254076h = hVar;
        this.f254077i = fVar;
        this.f254078j = interfaceC35745a5;
        this.f254079k = interfaceC28373a;
        this.f254080l = cVar2;
        this.f254081m = interfaceC34334a;
        this.f254082n = interfaceC13158a;
        this.f254083o = dVar;
        this.f254084p = aVar;
        this.f254085q = c30277e1;
        this.f254086r = eVar;
        this.f254087s = aVar2;
        this.f254088t = fVar2;
        this.f254089u = c19552a;
        this.f254090v = interfaceC50050d;
        this.f254093y = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
    }

    public static final void g(r rVar, NotificationImages notificationImages, NotificationIdentifier notificationIdentifier, PushParameters pushParameters, z.b bVar, String str, Payload.Messenger.RedesignPushData redesignPushData) {
        Context context = rVar.f254069a;
        rVar.f254082n.d(NotificationEvent.f254017q);
        IconCompat iconCompatC = IconCompat.c(notificationImages.f253965d);
        K.c cVar = new K.c();
        cVar.f44500a = " ";
        cVar.f44501b = iconCompatC;
        androidx.core.app.K kA2 = cVar.a();
        K.c cVar2 = new K.c();
        cVar2.f44501b = kA2.f44498b;
        cVar2.f44502c = kA2.f44499c;
        cVar2.f44500a = "";
        androidx.core.app.K kA3 = cVar2.a();
        z.u uVar = new z.u(kA2);
        ArrayList arrayList = uVar.f44614d;
        uVar.f44617g = redesignPushData.getTitleRedesign();
        arrayList.add(new z.u.d(redesignPushData.getItemName(), 0L, kA3));
        if (arrayList.size() > 25) {
            arrayList.remove(0);
        }
        arrayList.add(new z.u.d(pushParameters.f253976c.getBody(), 1L, kA3));
        if (arrayList.size() > 25) {
            arrayList.remove(0);
        }
        androidx.core.content.pm.e eVar = new e.b(context, "scid_" + str).f44639a;
        eVar.f44637f = true;
        eVar.f44634c = new Intent[]{new Intent("android.intent.action.VIEW")};
        String titleRedesign = redesignPushData.getTitleRedesign();
        eVar.f44635d = titleRedesign;
        eVar.f44636e = iconCompatC;
        if (TextUtils.isEmpty(titleRedesign)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = eVar.f44634c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        androidx.core.content.pm.h.c(context, eVar);
        z.n nVarH = rVar.h(notificationIdentifier, pushParameters, str);
        nVarH.f44585e = z.n.c(redesignPushData.getTitleRedesign());
        nVarH.j(uVar);
        String str2 = eVar.f44633b;
        nVarH.f44604x = str2;
        if (nVarH.f44605y == null && str2 != null) {
            nVarH.f44605y = new androidx.core.content.h(str2);
        }
        if (nVarH.f44585e == null) {
            nVarH.e(eVar.f44635d);
        }
        if (bVar != null) {
            nVarH.a(bVar);
        }
        rVar.l(nVarH, notificationIdentifier, pushParameters, str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(Collections.singletonList(eVar.f44633b));
        androidx.core.content.pm.h.b(context).getClass();
        Iterator it = ((ArrayList) androidx.core.content.pm.h.a(context)).iterator();
        while (it.hasNext()) {
            ((androidx.core.content.pm.d) it.next()).getClass();
        }
        notificationImages.f253963b.recycle();
        notificationImages.f253964c.recycle();
        notificationImages.f253965d.recycle();
    }

    public static int i(PushParameters pushParameters) {
        PushNotification pushNotification = pushParameters.f253976c;
        String title = pushNotification.getTitle();
        int iHashCode = (pushParameters.f253975b.getPath().hashCode() + ((title != null ? title.hashCode() : 0) * 31)) * 31;
        String body = pushNotification.getBody();
        return iHashCode + (body != null ? body.hashCode() : 0);
    }

    public static NotificationType k(PushParameters pushParameters) {
        Map<String, Object> mapC = pushParameters.f253976c.c();
        Object obj = mapC != null ? mapC.get("notification_id") : null;
        return kotlin.jvm.internal.L.f(obj, "messenger.appCall") ? NotificationType.MissedCall.f253969b : kotlin.jvm.internal.L.f(obj, "messenger.text") ? NotificationType.NewMessage.f253970b : NotificationType.Other.f253971b;
    }

    @Override // com.avito.android.remote.notification.InterfaceC34350q
    public final void a(long j12, @Y61.k String str) {
        ArrayList arrayListA = this.f254081m.a(str.hashCode());
        if (arrayListA.size() != 1 || ((InterfaceC34334a.C7612a) C42745f0.E(arrayListA)).f253994b >= j12) {
            return;
        }
        d(new NotificationIdentifier("tag_channel", str.hashCode()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x013e, code lost:
    
        if (((java.lang.Boolean) r1.f20371d.a().invoke()).booleanValue() != false) goto L50;
     */
    @Override // com.avito.android.remote.notification.InterfaceC34350q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.k Qf0.C14891a r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.notification.r.b(Qf0.a):void");
    }

    @Override // com.avito.android.remote.notification.InterfaceC34350q
    public final void c(@Y61.k PushParameters pushParameters) {
        V2 v22 = V2.f318762a;
        v22.c("NotificationInteractor", "showNotification: parameters=" + pushParameters, null);
        com.avito.android.deeplink_handler.mapping.checker.c cVar = this.f254080l;
        DeepLink deepLink = pushParameters.f253975b;
        if (cVar.a(deepLink)) {
            io.reactivex.rxjava3.internal.operators.single.G g12 = new io.reactivex.rxjava3.internal.operators.single.G(new CallableC13028a(26, this, pushParameters));
            InterfaceC35745a5 interfaceC35745a5 = this.f254078j;
            g12.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).m(new b()).m(new c(pushParameters));
        } else {
            this.f254082n.d(NotificationEvent.f254006f);
            NotificationNotSupportedException notificationNotSupportedException = new NotificationNotSupportedException(deepLink);
            this.f254079k.c(new NonFatalErrorEvent(notificationNotSupportedException.f254049b, notificationNotSupportedException, null, null, 12, null));
            v22.d("NotificationInteractor", "showNotification: FORBID_LINK");
        }
    }

    @Override // com.avito.android.remote.notification.InterfaceC34350q
    public final void d(@Y61.k NotificationIdentifier notificationIdentifier) {
        this.f254070b.b().a(notificationIdentifier.f253962c, notificationIdentifier.f253961b);
        o(notificationIdentifier);
    }

    @Override // com.avito.android.remote.notification.InterfaceC34350q
    public final void e(@Y61.k String str) {
        d(new NotificationIdentifier("tag_nc", str.hashCode()));
    }

    @Override // com.avito.android.remote.notification.InterfaceC34350q
    public final void f(@Y61.k z zVar) {
        this.f254092x.add(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.core.app.z.n h(com.avito.android.remote.notification.NotificationIdentifier r24, com.avito.android.remote.notification.PushParameters r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.notification.r.h(com.avito.android.remote.notification.NotificationIdentifier, com.avito.android.remote.notification.PushParameters, java.lang.String):androidx.core.app.z$n");
    }

    public final String j(PushParameters pushParameters) {
        NotificationType notificationTypeK = k(pushParameters);
        boolean z12 = notificationTypeK instanceof NotificationType.MissedCall;
        A a12 = this.f254073e;
        return (z12 || (notificationTypeK instanceof NotificationType.NewMessage)) ? a12.a() : a12.b();
    }

    public final void l(z.n nVar, NotificationIdentifier notificationIdentifier, PushParameters pushParameters, String str) {
        String groupId;
        boolean soundAndVibrateEnabled = pushParameters.f253976c.getSoundAndVibrateEnabled();
        com.avito.android.notification.m mVar = this.f254070b;
        String str2 = notificationIdentifier.f253961b;
        int i12 = notificationIdentifier.f253962c;
        if (soundAndVibrateEnabled) {
            try {
                nVar.f(3);
                mVar.b().d(str2, i12, nVar.b());
            } catch (SecurityException unused) {
                nVar.f(0);
                mVar.b().d(str2, i12, nVar.b());
            }
        } else {
            nVar.f(0);
            mVar.b().d(str2, i12, nVar.b());
        }
        y.a aVar = new y.a("grouped_push.push", 0L, 2, null);
        InterfaceC28373a interfaceC28373a = this.f254079k;
        interfaceC28373a.c(aVar);
        PushNotification pushNotification = pushParameters.f253976c;
        if (kotlin.jvm.internal.L.f(pushNotification.getIsSilent(), Boolean.TRUE)) {
            interfaceC28373a.c(new y.a("sort_and_silence.silent", 0L, 2, null));
        }
        if (pushNotification.getSortPriority() != null) {
            interfaceC28373a.c(new y.a("sort_and_silence.sort", 0L, 2, null));
        }
        C19552a c19552a = this.f254089u;
        c19552a.getClass();
        kotlin.reflect.n<Object> nVar2 = C19552a.f20368e[0];
        if (!((Boolean) c19552a.f20369b.a().invoke()).booleanValue() || (groupId = pushNotification.getGroupId()) == null || groupId.length() == 0) {
            return;
        }
        interfaceC28373a.c(new y.a("grouped_push.push_with_group", 0L, 2, null));
        StatusBarNotification[] activeNotifications = mVar.a().getActiveNotifications();
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (kotlin.jvm.internal.L.f(statusBarNotification.getNotification().getGroup(), pushNotification.getGroupId())) {
                arrayList.add(statusBarNotification);
            }
        }
        if (arrayList.size() == 1) {
            z.n nVar3 = new z.n(this.f254069a, str);
            nVar3.f44596p = true;
            nVar3.g(16, true);
            nVar3.f44578B.icon = R.drawable.ic_notification;
            nVar3.f44601u = this.f254073e.getF253957d();
            nVar3.f44595o = pushNotification.getGroupId();
            Notification notificationB = nVar3.b();
            androidx.core.app.E eB2 = mVar.b();
            kotlin.random.f.f406882b.getClass();
            eB2.d(null, kotlin.random.f.f406883c.i(), notificationB);
        }
    }

    public final void m(DeepLink deepLink) {
        DeeplinkHandlingResultStatus deeplinkHandlingResultStatus = DeeplinkHandlingResultStatus.f134138c;
        this.f254083o.b(new b.a(deepLink));
    }

    public final void n(NotificationIdentifier notificationIdentifier, PushParameters pushParameters, z.b bVar, String str) {
        this.f254082n.d(NotificationEvent.f254015o);
        z.l lVar = new z.l();
        lVar.f44576d = z.n.c(pushParameters.f253976c.getBody());
        z.n nVarH = h(notificationIdentifier, pushParameters, str);
        nVarH.j(lVar);
        if (bVar != null) {
            nVarH.a(bVar);
        }
        l(nVarH, notificationIdentifier, pushParameters, str);
    }

    public final void o(NotificationIdentifier notificationIdentifier) {
        io.reactivex.rxjava3.disposables.d dVarRemove = this.f254091w.remove(notificationIdentifier);
        if (dVarRemove == null) {
            return;
        }
        dVarRemove.dispose();
    }
}
