package com.avito.android.notifications_permission_messenger.deeplink;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.R;
import com.avito.android.analytics.statsd.y;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplink;
import com.avito.android.util.InterfaceC35845m2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: NotificationPermissionMessengerDialogDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplinkHandler$enableNotifications$1", f = "NotificationPermissionMessengerDialogDeeplinkHandler.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f207945q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ NotificationPermissionMessengerDialogDeeplink f207946r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f207947s;

    /* compiled from: NotificationPermissionMessengerDialogDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.notifications_permission_messenger.deeplink.NotificationPermissionMessengerDialogDeeplinkHandler$enableNotifications$1$2$1", f = "NotificationPermissionMessengerDialogDeeplinkHandler.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.notifications_permission_messenger.deeplink.a$a, reason: collision with other inner class name */
    public static final class C6205a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f207948q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f207949r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ NotificationPermissionMessengerDialogDeeplink.Problem.ProfileMessengerPushDisabled f207950s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6205a(b bVar, NotificationPermissionMessengerDialogDeeplink.Problem.ProfileMessengerPushDisabled profileMessengerPushDisabled, Continuation<? super C6205a> continuation) {
            super(2, continuation);
            this.f207949r = bVar;
            this.f207950s = profileMessengerPushDisabled;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C6205a(this.f207949r, this.f207950s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C6205a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f207948q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.notifications_settings.profile.a aVar = this.f207949r.f207959n;
                NotificationPermissionMessengerDialogDeeplink.Problem.ProfileMessengerPushDisabled profileMessengerPushDisabled = this.f207950s;
                this.f207948q = 1;
                if (aVar.a(profileMessengerPushDisabled.f207942b, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NotificationPermissionMessengerDialogDeeplink notificationPermissionMessengerDialogDeeplink, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f207946r = notificationPermissionMessengerDialogDeeplink;
        this.f207947s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f207946r, this.f207947s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object next;
        NotificationPermissionMessengerDialogDeeplink.Problem.SystemPermissionDisabled next2;
        Object next3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f207945q;
        NotificationPermissionMessengerDialogDeeplink notificationPermissionMessengerDialogDeeplink = this.f207946r;
        b bVar = this.f207947s;
        if (i12 == 0) {
            C42729a0.b(obj);
            Iterator it = notificationPermissionMessengerDialogDeeplink.f207940b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((NotificationPermissionMessengerDialogDeeplink.Problem) next) instanceof NotificationPermissionMessengerDialogDeeplink.Problem.ProfileMessengerPushDisabled) {
                    break;
                }
            }
            NotificationPermissionMessengerDialogDeeplink.Problem.ProfileMessengerPushDisabled profileMessengerPushDisabled = next instanceof NotificationPermissionMessengerDialogDeeplink.Problem.ProfileMessengerPushDisabled ? (NotificationPermissionMessengerDialogDeeplink.Problem.ProfileMessengerPushDisabled) next : null;
            if (profileMessengerPushDisabled != null) {
                bVar.f207956k.c(new y.a(bVar.f207963r.a("publishNotification.notificationEnable.profile", "{{%app_ver%}}").f91030a, 1L));
                kotlinx.coroutines.scheduling.b bVarA = bVar.f207960o.a();
                C6205a c6205a = new C6205a(bVar, profileMessengerPushDisabled, null);
                this.f207945q = 1;
                if (C43259k.g(bVarA, c6205a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        int size = notificationPermissionMessengerDialogDeeplink.f207940b.size();
        ArrayList arrayList = notificationPermissionMessengerDialogDeeplink.f207940b;
        if (size == 1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
                if (((NotificationPermissionMessengerDialogDeeplink.Problem) next3) instanceof NotificationPermissionMessengerDialogDeeplink.Problem.ProfileMessengerPushDisabled) {
                    break;
                }
            }
            if (next3 != null) {
                a.i.C4057a.d(bVar.f207954i, com.avito.android.printable_text.b.c(R.string.notification_permission_messenger_success_toast, new Serializable[0]), Collections.singletonList(bVar.f207955j.a()), null, null, 0, null, null, null, 2044);
            }
        }
        if (arrayList.contains(NotificationPermissionMessengerDialogDeeplink.Problem.MessengerNotificationChannelDisabled.f207941b)) {
            bVar.f207956k.c(new y.a(bVar.f207963r.a("publishNotification.notificationEnable.settings", "{{%app_ver%}}").f91030a, 1L));
            InterfaceC35845m2 interfaceC35845m2 = bVar.f207961p;
            a.InterfaceC4053a interfaceC4053a = bVar.f207953h;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((NotificationPermissionMessengerDialogDeeplink.Problem) it3.next()) instanceof NotificationPermissionMessengerDialogDeeplink.Problem.SystemPermissionDisabled) {
                        interfaceC4053a.R(interfaceC35845m2.a(), com.avito.android.deeplink_handler.view.b.f134588l);
                        break;
                    }
                }
                interfaceC4053a.R(interfaceC35845m2.g(bVar.f207962q.a()), com.avito.android.deeplink_handler.view.b.f134588l);
            } else {
                interfaceC4053a.R(interfaceC35845m2.g(bVar.f207962q.a()), com.avito.android.deeplink_handler.view.b.f134588l);
            }
            bVar.j(NotificationPermissionMessengerDialogDeeplink.b.c.f207944b);
            return G0.f406611a;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next2 = 0;
                break;
            }
            next2 = it4.next();
            if (((NotificationPermissionMessengerDialogDeeplink.Problem) next2) instanceof NotificationPermissionMessengerDialogDeeplink.Problem.SystemPermissionDisabled) {
                break;
            }
        }
        NotificationPermissionMessengerDialogDeeplink.Problem.SystemPermissionDisabled systemPermissionDisabled = next2 instanceof NotificationPermissionMessengerDialogDeeplink.Problem.SystemPermissionDisabled ? next2 : null;
        if (systemPermissionDisabled != null) {
            if (systemPermissionDisabled.f207943b || bVar.f207965t.getF125487g() < 33) {
                bVar.f207956k.c(new y.a(bVar.f207963r.a("publishNotification.notificationEnable.settings", "{{%app_ver%}}").f91030a, 1L));
                bVar.f207953h.R(bVar.f207961p.a(), com.avito.android.deeplink_handler.view.b.f134588l);
            } else {
                bVar.f207953h.R(bVar.f207964s.a(), com.avito.android.deeplink_handler.view.b.f134588l);
                bVar.f207956k.c(new y.a(bVar.f207963r.a("publishNotification.notificationEnable.system", "{{%app_ver%}}").f91030a, 1L));
            }
        }
        bVar.j(NotificationPermissionMessengerDialogDeeplink.b.c.f207944b);
        return G0.f406611a;
    }
}
