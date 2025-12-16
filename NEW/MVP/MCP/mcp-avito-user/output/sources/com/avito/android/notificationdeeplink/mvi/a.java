package com.avito.android.notificationdeeplink.mvi;

import Bk0.InterfaceC13158a;
import K30.b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.AnalyticParams;
import com.avito.android.CalledFrom;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.v;
import com.avito.android.notification_center.counter.h;
import com.avito.android.remote.model.notification.Payload;
import com.avito.android.remote.notification.InterfaceC34350q;
import com.avito.android.remote.notification.NotificationIdentifier;
import com.avito.android.remote.notification.analytics.NotificationClickEvent;
import com.avito.android.remote.notification.analytics.NotificationPayloadEvent;
import com.avito.android.util.V2;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import oc.C44752a;
import oc.C44754c;

/* compiled from: NotificationDeepLinkBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notificationdeeplink/mvi/a;", "Lcom/avito/android/arch/mvi/b;", "LK30/b;", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.b<K30.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f207787a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.notification_center.push.c f207788b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h f207789c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC34350q f207790d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC13158a f207791e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f207792f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final NotificationIdentifier f207793g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Payload f207794h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AnalyticParams f207795i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f207796j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f207797k;

    /* compiled from: NotificationDeepLinkBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LK30/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.notificationdeeplink.mvi.NotificationDeepLinkBootstrap$produce$1", f = "NotificationDeepLinkBootstrap.kt", i = {}, l = {45, 54}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.notificationdeeplink.mvi.a$a, reason: collision with other inner class name */
    public static final class C6201a extends SuspendLambda implements p<InterfaceC43172j<? super K30.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207798q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f207799r;

        public C6201a(Continuation<? super C6201a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6201a c6201a = a.this.new C6201a(continuation);
            c6201a.f207799r = obj;
            return c6201a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super K30.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6201a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            NotificationIdentifier notificationIdentifier;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207798q;
            if (i12 != 0) {
                if (i12 == 1) {
                    C42729a0.b(obj);
                    V2.f318762a.c("NotificationDeeplinkActivityMvi", "emit CloseScreen", null);
                    return G0.f406611a;
                }
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f207799r;
            a aVar = a.this;
            aVar.f207791e.e(NotificationClickEvent.f253995c);
            String str = aVar.f207796j;
            InterfaceC28373a interfaceC28373a = aVar.f207787a;
            InterfaceC13158a interfaceC13158a = aVar.f207791e;
            AnalyticParams analyticParams = aVar.f207795i;
            if (analyticParams == null) {
                G0 g02 = G0.f406611a;
                interfaceC13158a.e(NotificationClickEvent.f253996d);
            } else {
                String str2 = analyticParams.f67182c;
                Map<String, String> mapC = analyticParams.f67181b;
                if (str2 == null && mapC != null) {
                    interfaceC13158a.e(NotificationClickEvent.f253999g);
                    interfaceC28373a.c(new C44754c(mapC, str));
                } else if (str2 != null) {
                    interfaceC13158a.e(NotificationClickEvent.f253998f);
                    if (mapC == null) {
                        mapC = P0.c();
                    }
                    interfaceC28373a.c(new C44752a(str2, mapC));
                } else {
                    interfaceC13158a.e(NotificationClickEvent.f253997e);
                }
            }
            DeepLink deepLink = aVar.f207792f;
            if (deepLink == null || (notificationIdentifier = aVar.f207793g) == null) {
                b.a aVar2 = b.a.f9234a;
                this.f207798q = 1;
                if (interfaceC43172j.emit(aVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                V2.f318762a.c("NotificationDeeplinkActivityMvi", "emit CloseScreen", null);
                return G0.f406611a;
            }
            String path = deepLink.getPath();
            Map<String, String> map = analyticParams != null ? analyticParams.f67181b : null;
            Payload payload = aVar.f207794h;
            CalledFrom.Push push = new CalledFrom.Push(path, payload, map);
            aVar.f207790d.d(notificationIdentifier);
            interfaceC13158a.a(NotificationPayloadEvent.f254037c);
            if (payload instanceof Payload.NotificationCenter) {
                aVar.f207788b.getClass();
                if (!(deepLink instanceof v)) {
                    aVar.f207789c.b(((Payload.NotificationCenter) payload).getId());
                }
                Map<String, String> analyticParams2 = ((Payload.NotificationCenter) payload).getAnalyticParams();
                if (analyticParams2 != null) {
                    interfaceC13158a.a(NotificationPayloadEvent.f254040f);
                    interfaceC28373a.c(new J30.a(analyticParams2));
                    interfaceC28373a.c(new C44754c(analyticParams2, str));
                } else {
                    interfaceC13158a.a(NotificationPayloadEvent.f254038d);
                }
            } else {
                interfaceC13158a.a(NotificationPayloadEvent.f254039e);
            }
            V2.f318762a.c("NotificationDeeplinkActivityMvi", "emit ProcessDeeplink", null);
            b.C0550b c0550b = new b.C0550b(deepLink, push, analyticParams, aVar.f207797k);
            this.f207798q = 2;
            if (interfaceC43172j.emit(c0550b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.notification_center.push.c cVar, @k h hVar, @k InterfaceC34350q interfaceC34350q, @k InterfaceC13158a interfaceC13158a, @l DeepLink deepLink, @l NotificationIdentifier notificationIdentifier, @l Payload payload, @l AnalyticParams analyticParams, @l String str, boolean z12) {
        this.f207787a = interfaceC28373a;
        this.f207788b = cVar;
        this.f207789c = hVar;
        this.f207790d = interfaceC34350q;
        this.f207791e = interfaceC13158a;
        this.f207792f = deepLink;
        this.f207793g = notificationIdentifier;
        this.f207794h = payload;
        this.f207795i = analyticParams;
        this.f207796j = str;
        this.f207797k = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @k
    public final InterfaceC43160i<K30.b> a() {
        V2.f318762a.c("NotificationDeeplinkActivityMvi", "bootstrap start", null);
        return C43175k.G(new C6201a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }

    public /* synthetic */ a(InterfaceC28373a interfaceC28373a, com.avito.android.notification_center.push.c cVar, h hVar, InterfaceC34350q interfaceC34350q, InterfaceC13158a interfaceC13158a, DeepLink deepLink, NotificationIdentifier notificationIdentifier, Payload payload, AnalyticParams analyticParams, String str, boolean z12, int i12, C42822w c42822w) {
        this(interfaceC28373a, cVar, hVar, interfaceC34350q, interfaceC13158a, deepLink, notificationIdentifier, payload, analyticParams, str, (i12 & 1024) != 0 ? false : z12);
    }
}
