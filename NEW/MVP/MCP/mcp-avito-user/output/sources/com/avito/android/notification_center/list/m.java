package com.avito.android.notification_center.list;

import Ek0.InterfaceC13498a;
import com.avito.android.remote.model.notification.NotificationResponseMapper;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationCenterListInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/list/m;", "Lcom/avito/android/notification_center/list/j;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13498a f207644a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final NotificationResponseMapper f207645b;

    @Inject
    public m(@Y61.k InterfaceC13498a interfaceC13498a, @Y61.k NotificationResponseMapper notificationResponseMapper) {
        this.f207644a = interfaceC13498a;
        this.f207645b = notificationResponseMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.notification_center.list.j
    @Y61.l
    @android.annotation.SuppressLint({"HardcodeStringDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k android.net.Uri r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.notification_center.list.l
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.notification_center.list.l r0 = (com.avito.android.notification_center.list.l) r0
            int r1 = r0.f207643t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207643t = r1
            goto L18
        L13:
            com.avito.android.notification_center.list.l r0 = new com.avito.android.notification_center.list.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f207641r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f207643t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.notification_center.list.m r5 = r0.f207640q
            kotlin.C42729a0.b(r6)
            goto L5a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            java.lang.String r6 = "offset"
            java.lang.String r5 = r5.getQueryParameter(r6)
            if (r5 == 0) goto La4
            java.lang.Long r5 = kotlin.text.C43066x.z0(r5)
            if (r5 == 0) goto La4
            long r5 = r5.longValue()
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r0.f207640q = r4
            r0.f207643t = r3
            Ek0.a r6 = r4.f207644a
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r5 = r4
        L5a:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L74
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            Ik0.c r6 = (Ik0.c) r6
            com.avito.android.remote.model.notification.NotificationResponseMapper r5 = r5.f207645b
            com.avito.android.remote.model.notification.NotificationsResponse r5 = r5.mapToNotificationResponse(r6)
            com.avito.android.remote.model.TypedResult$Success r6 = new com.avito.android.remote.model.TypedResult$Success
            r6.<init>(r5)
            goto L78
        L74:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L9e
        L78:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L85
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            com.avito.android.remote.model.notification.NotificationsResponse r5 = (com.avito.android.remote.model.notification.NotificationsResponse) r5
            return r5
        L85:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L98
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r5 = r6.getError()
            java.lang.Throwable r6 = r6.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L98:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L9e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        La4:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Next page uri should contain \"offset\" argument of Long type"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notification_center.list.m.a(android.net.Uri, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.notification_center.list.j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.notification_center.list.k
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.notification_center.list.k r0 = (com.avito.android.notification_center.list.k) r0
            int r1 = r0.f207639t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207639t = r1
            goto L18
        L13:
            com.avito.android.notification_center.list.k r0 = new com.avito.android.notification_center.list.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f207637r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f207639t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.notification_center.list.m r0 = r0.f207636q
            kotlin.C42729a0.b(r5)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            r0.f207636q = r4
            r0.f207639t = r3
            Ek0.a r5 = r4.f207644a
            r2 = 0
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            r0 = r4
        L45:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r1 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto L60
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            Ik0.c r5 = (Ik0.c) r5
            com.avito.android.remote.model.notification.NotificationResponseMapper r0 = r0.f207645b
            com.avito.android.remote.model.notification.NotificationsResponse r5 = r0.mapToNotificationResponse(r5)
            com.avito.android.remote.model.TypedResult$Success r0 = new com.avito.android.remote.model.TypedResult$Success
            r0.<init>(r5)
            r5 = r0
            goto L64
        L60:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L8a
        L64:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L71
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            com.avito.android.remote.model.notification.NotificationsResponse r5 = (com.avito.android.remote.model.notification.NotificationsResponse) r5
            return r5
        L71:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L84
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r0 = r5.getError()
            java.lang.Throwable r5 = r5.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r0, r5)
            throw r5
        L84:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L8a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notification_center.list.m.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
