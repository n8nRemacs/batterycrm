package com.avito.android.notification_center.list.mvi;

import com.avito.android.CalledFrom;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.M;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.v;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviState;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.notification.Notification;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import oc.C44754c;

/* compiled from: NotificationCenterActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.notification_center.list.mvi.NotificationCenterActor$openItem$1", f = "NotificationCenterActor.kt", i = {0, 0, 0}, l = {UpdateStatusCode.DialogButton.CONFIRM, 109, 114, 116}, m = "invokeSuspend", n = {"$this$flow", NotificationsSettings.Section.SECTION_PAID_SERVICES, ContextActionHandler.Link.DEEPLINK}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super NotificationCenterMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Notification f207659q;

    /* renamed from: r, reason: collision with root package name */
    public DeepLink f207660r;

    /* renamed from: s, reason: collision with root package name */
    public int f207661s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f207662t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ NotificationCenterMviState f207663u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f207664v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f207665w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NotificationCenterMviState notificationCenterMviState, int i12, h hVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f207663u = notificationCenterMviState;
        this.f207664v = i12;
        this.f207665w = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f207663u, this.f207664v, this.f207665w, continuation);
        eVar.f207662t = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super NotificationCenterMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Notification notification;
        DeepLink deepLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f207661s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f207662t;
            NotificationCenterMviState notificationCenterMviState = this.f207663u;
            Notification notification2 = notificationCenterMviState.f207682d.get(this.f207664v);
            DeepLink uri = notification2.getUri();
            notification2.setRead(true);
            NotificationCenterMviInternalAction.UpdateContent updateContent = new NotificationCenterMviInternalAction.UpdateContent(notificationCenterMviState.f207682d);
            this.f207662t = interfaceC43172j;
            this.f207659q = notification2;
            this.f207660r = uri;
            this.f207661s = 1;
            if (interfaceC43172j.emit(updateContent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            notification = notification2;
            deepLink = uri;
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3 && i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            deepLink = this.f207660r;
            notification = this.f207659q;
            interfaceC43172j = (InterfaceC43172j) this.f207662t;
            C42729a0.b(obj);
        }
        h hVar = this.f207665w;
        hVar.f207695d.e(notification.getId());
        if (!(deepLink instanceof v)) {
            hVar.f207698g.b(notification.getId());
        }
        Map<String, String> analyticParams = notification.getAnalyticParams();
        CalledFrom.NotificationCenter notificationCenter = new CalledFrom.NotificationCenter(analyticParams == null ? P0.c() : analyticParams);
        if (analyticParams == null) {
            NotificationCenterMviInternalAction.OpenDeeplink openDeeplink = new NotificationCenterMviInternalAction.OpenDeeplink(deepLink, notificationCenter);
            this.f207662t = null;
            this.f207659q = null;
            this.f207660r = null;
            this.f207661s = 2;
            if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            M m12 = new M(analyticParams);
            InterfaceC28373a interfaceC28373a = hVar.f207692a;
            interfaceC28373a.c(m12);
            interfaceC28373a.c(new C44754c(analyticParams, null, 2, null));
            if (deepLink instanceof WebViewLink) {
                NotificationCenterMviInternalAction.OpenPromoLink openPromoLink = new NotificationCenterMviInternalAction.OpenPromoLink((WebViewLink) deepLink, notificationCenter);
                this.f207662t = null;
                this.f207659q = null;
                this.f207660r = null;
                this.f207661s = 3;
                if (interfaceC43172j.emit(openPromoLink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                NotificationCenterMviInternalAction.OpenDeeplink openDeeplink2 = new NotificationCenterMviInternalAction.OpenDeeplink(deepLink, notificationCenter);
                this.f207662t = null;
                this.f207659q = null;
                this.f207660r = null;
                this.f207661s = 4;
                if (interfaceC43172j.emit(openDeeplink2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return G0.f406611a;
    }
}
