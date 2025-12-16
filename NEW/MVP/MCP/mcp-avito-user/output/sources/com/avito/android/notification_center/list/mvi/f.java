package com.avito.android.notification_center.list.mvi;

import com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: NotificationCenterActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/notification_center/list/mvi/entity/NotificationCenterMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.notification_center.list.mvi.NotificationCenterActor$refresh$1", f = "NotificationCenterActor.kt", i = {0, 1, 2, 3}, l = {68, 69, 70, 71, 72}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super NotificationCenterMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f207686q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f207687r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f207688s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f207688s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f207688s, continuation);
        fVar.f207687r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super NotificationCenterMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f207686q
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L44
            if (r1 == r6) goto L3c
            if (r1 == r5) goto L34
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            kotlin.C42729a0.b(r8)
            goto La4
        L1c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L24:
            java.lang.Object r1 = r7.f207687r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L92
        L2c:
            java.lang.Object r1 = r7.f207687r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L78
        L34:
            java.lang.Object r1 = r7.f207687r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L69
        L3c:
            java.lang.Object r1 = r7.f207687r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L5c
        L44:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f207687r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction$ChangeRefreshLoadingState r1 = new com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction$ChangeRefreshLoadingState
            r1.<init>(r6)
            r7.f207687r = r8
            r7.f207686q = r6
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L5b
            return r0
        L5b:
            r1 = r8
        L5c:
            com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction$ClearError r8 = com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction.ClearError.f207668b
            r7.f207687r = r1
            r7.f207686q = r5
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L69
            return r0
        L69:
            com.avito.android.notification_center.list.mvi.h r8 = r7.f207688s
            com.avito.android.notification_center.list.j r8 = r8.f207693b
            r7.f207687r = r1
            r7.f207686q = r4
            java.lang.Object r8 = r8.b(r7)
            if (r8 != r0) goto L78
            return r0
        L78:
            com.avito.android.remote.model.notification.NotificationsResponse r8 = (com.avito.android.remote.model.notification.NotificationsResponse) r8
            com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction$Content r4 = new com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction$Content
            java.util.List r5 = r8.getNotifications()
            android.net.Uri r8 = r8.getNextPage()
            r4.<init>(r5, r8)
            r7.f207687r = r1
            r7.f207686q = r3
            java.lang.Object r8 = r1.emit(r4, r7)
            if (r8 != r0) goto L92
            return r0
        L92:
            com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction$ChangeRefreshLoadingState r8 = new com.avito.android.notification_center.list.mvi.entity.NotificationCenterMviInternalAction$ChangeRefreshLoadingState
            r3 = 0
            r8.<init>(r3)
            r3 = 0
            r7.f207687r = r3
            r7.f207686q = r2
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto La4
            return r0
        La4:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notification_center.list.mvi.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
