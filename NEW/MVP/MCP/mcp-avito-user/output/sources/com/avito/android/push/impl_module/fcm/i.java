package com.avito.android.push.impl_module.fcm;

import android.content.Context;
import androidx.media3.common.C23088b;
import arrow.core.Y0;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.D;
import com.avito.android.analytics.statsd.y;
import com.avito.android.push.PushService;
import com.avito.android.push.PushToken;
import com.avito.android.util.E1;
import com.avito.android.util.V2;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RunnableC37621o;
import fg0.InterfaceC40420d;
import fg0.f;
import hg0.InterfaceC40932a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import l41.o;
import vZ0.InterfaceC49287a;

/* compiled from: FcmPushTokenProvider.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/i;", "Lfg0/d;", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements InterfaceC40420d {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f245950g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final Semaphore f245951h = new Semaphore(1, true);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FirebaseMessaging f245952a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f245953b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f245954c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final P f245955d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40932a f245956e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final e f245957f;

    /* compiled from: FcmPushTokenProvider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/i$a;", "", "<init>", "()V", "", "DEFAULT_ERROR_MESSAGE", "Ljava/lang/String;", "Ljava/util/concurrent/Semaphore;", "fcmTasksBinarySemaphore", "Ljava/util/concurrent/Semaphore;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final void a(a aVar, String str) {
            aVar.getClass();
            V2.f318762a.c("FcmPushTokenProvider", str, null);
        }

        public a() {
        }
    }

    /* compiled from: FcmPushTokenProvider.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f245959c;

        public b(String str) {
            this.f245959c = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Object objF;
            a aVar = i.f245950g;
            i iVar = i.this;
            iVar.getClass();
            StringBuilder sb2 = new StringBuilder("[");
            String str = this.f245959c;
            String strS = AK.c.s(sb2, str, "] checkFirebaseProjectChange()");
            a aVar2 = i.f245950g;
            a.a(aVar2, strS);
            int i12 = com.google.firebase.d.f361519a;
            com.google.firebase.g gVarC = com.google.firebase.g.c();
            gVarC.a();
            String str2 = gVarC.f361597c.f361725b;
            StringBuilder sbB = C23088b.b("[", str, "] currentApplicationId=", str2, ", saved=");
            e eVar = iVar.f245957f;
            sbB.append(eVar.a());
            a.a(aVar2, sbB.toString());
            if (iVar.f245956e.getF17351b()) {
                eVar.b(str2);
                a.a(aVar2, "[" + str + "] Old push token deleting is not needed, cause it's the first app launch");
                iVar.b("first_app_launch");
                return I.q(G0.f406611a);
            }
            if (eVar.a().equals(str2)) {
                a.a(aVar2, "[" + str + "] Old push token deleting is not needed, cause applicationId was not changed");
                iVar.b("app_id_is_not_changed");
                return I.q(G0.f406611a);
            }
            FirebaseMessaging firebaseMessaging = iVar.f245952a;
            if (firebaseMessaging.f361753b != null) {
                C37028k c37028k = new C37028k();
                firebaseMessaging.f361759h.execute(new RunnableC37621o(firebaseMessaging, c37028k, 1));
                objF = c37028k.f355672a;
            } else if (firebaseMessaging.e() == null) {
                objF = C37030m.f(null);
            } else {
                C37028k c37028k2 = new C37028k();
                Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.b("Firebase-Messaging-Network-Io")).execute(new RunnableC37621o(firebaseMessaging, c37028k2, 2));
                objF = c37028k2.f355672a;
            }
            return new C42006d(new E1(objF, 0)).k(new j(iVar, str)).r(new k(iVar, str2)).u(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.d(8, str, iVar));
        }
    }

    /* compiled from: FcmPushTokenProvider.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\b\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "Larrow/core/Y0;", "", "kotlin.jvm.PlatformType", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {
        public c() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Task<String> taskD;
            FirebaseMessaging firebaseMessaging = i.this.f245952a;
            InterfaceC49287a interfaceC49287a = firebaseMessaging.f361753b;
            if (interfaceC49287a != null) {
                taskD = interfaceC49287a.d();
            } else {
                C37028k c37028k = new C37028k();
                firebaseMessaging.f361759h.execute(new RunnableC37621o(firebaseMessaging, c37028k, 0));
                taskD = c37028k.f355672a;
            }
            return new C42006d(new E1(taskD, 0));
        }
    }

    /* compiled from: FcmPushTokenProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "", "kotlin.jvm.PlatformType", "tokenResult", "Lfg0/f;", "apply", "(Larrow/core/Y0;)Lfg0/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f245961b;

        public d(String str) {
            this.f245961b = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            String str = (String) ((Y0) obj).c();
            if (str == null) {
                return new f.a("fcm_token_is_null");
            }
            a.a(i.f245950g, "[" + this.f245961b + "] token: " + C43066x.y(8, str) + C43066x.Z(8, "*"));
            return new f.c(new PushToken(str, PushService.f245927b));
        }
    }

    @Inject
    public i(@Y61.k FirebaseMessaging firebaseMessaging, @Y61.k Context context, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k P p12, @Y61.k InterfaceC40932a interfaceC40932a, @Y61.k e eVar) {
        this.f245952a = firebaseMessaging;
        this.f245953b = context;
        this.f245954c = interfaceC28373a;
        this.f245955d = p12;
        this.f245956e = interfaceC40932a;
        this.f245957f = eVar;
    }

    @Override // fg0.InterfaceC40420d
    @Y61.k
    public final I<? extends fg0.f> a(@Y61.k String str) {
        com.avito.android.push.impl_module.fcm.b bVar = com.avito.android.push.impl_module.fcm.b.f245946a;
        Context context = this.f245953b;
        bVar.getClass();
        return C36687f.f349287e.c(C36688g.f349288a, context) == 0 ? new C42017o(new G(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.c(2)).n(new b(str)).n(new c()).r(new d(str)).u(new androidx.room.rxjava3.b(this, 18)), new com.avito.android.advert_core.task.a(18)) : I.q(f.b.f396039a);
    }

    public final void b(String str) {
        this.f245954c.c(new y.a("push.fcm_migration." + D.a(this.f245955d.f().invoke()) + '.' + str, 0L, 2, null));
    }

    @Override // fg0.InterfaceC40420d
    @Y61.k
    public final PushService getType() {
        return PushService.f245927b;
    }
}
