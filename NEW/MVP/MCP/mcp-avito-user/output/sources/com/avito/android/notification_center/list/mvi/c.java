package com.avito.android.notification_center.list.mvi;

import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction;
import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: NotificationCenterActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.notification_center.list.mvi.NotificationCenterActor$loadNextPage$1", f = "NotificationCenterActor.kt", i = {0, 1}, l = {81, 82, 87}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super NotificationCenterMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f207652q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f207653r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f207654s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ NotificationCenterMviState f207655t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, NotificationCenterMviState notificationCenterMviState, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f207654s = hVar;
        this.f207655t = notificationCenterMviState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f207654s, this.f207655t, continuation);
        cVar.f207653r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super NotificationCenterMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f207652q
            com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviState r2 = r6.f207655t
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.C42729a0.b(r7)
            goto L87
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            java.lang.Object r1 = r6.f207653r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L55
        L27:
            java.lang.Object r1 = r6.f207653r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L44
        L2f:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f207653r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction$ClearError r1 = com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction.ClearError.f207668b
            r6.f207653r = r7
            r6.f207652q = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L43
            return r0
        L43:
            r1 = r7
        L44:
            com.avito.android.notification_center.list.mvi.h r7 = r6.f207654s
            com.avito.android.notification_center.list.j r7 = r7.f207693b
            android.net.Uri r5 = r2.f207680b
            r6.f207653r = r1
            r6.f207652q = r4
            java.lang.Object r7 = r7.a(r5, r6)
            if (r7 != r0) goto L55
            return r0
        L55:
            com.avito.android.remote.model.notification.NotificationsResponse r7 = (com.avito.android.remote.model.notification.NotificationsResponse) r7
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List<com.avito.android.remote.model.notification.Notification> r2 = r2.f207682d
            if (r2 == 0) goto L69
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r4.addAll(r2)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
        L69:
            java.util.List r2 = r7.getNotifications()
            java.util.Collection r2 = (java.util.Collection) r2
            r4.addAll(r2)
            com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction$Content r2 = new com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction$Content
            android.net.Uri r7 = r7.getNextPage()
            r2.<init>(r4, r7)
            r7 = 0
            r6.f207653r = r7
            r6.f207652q = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L87
            return r0
        L87:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notification_center.list.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
