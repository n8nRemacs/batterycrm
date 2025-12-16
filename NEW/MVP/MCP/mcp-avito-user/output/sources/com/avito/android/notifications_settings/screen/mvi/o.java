package com.avito.android.notifications_settings.screen.mvi;

import Ek0.InterfaceC13498a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationsSettingsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/o;", "Lcom/avito/android/notifications_settings/screen/mvi/l;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13498a f208160a;

    @Inject
    public o(@Y61.k InterfaceC13498a interfaceC13498a) {
        this.f208160a = interfaceC13498a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.notifications_settings.screen.mvi.l
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7, boolean r8) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.notifications_settings.screen.mvi.n
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.notifications_settings.screen.mvi.n r0 = (com.avito.android.notifications_settings.screen.mvi.n) r0
            int r1 = r0.f208159s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208159s = r1
            goto L18
        L13:
            com.avito.android.notifications_settings.screen.mvi.n r0 = new com.avito.android.notifications_settings.screen.mvi.n
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f208157q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f208159s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            r0.f208159s = r3
            Ek0.a r7 = r4.f208160a
            java.lang.Object r7 = r7.b(r6, r5, r8, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L50
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r5 = r7.getResult()
            Lk0.a r5 = (Lk0.C14405a) r5
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L50:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L63
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r5 = r7.getError()
            java.lang.Throwable r6 = r7.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L63:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notifications_settings.screen.mvi.o.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.notifications_settings.screen.mvi.l
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.notifications_settings.screen.mvi.m
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.notifications_settings.screen.mvi.m r0 = (com.avito.android.notifications_settings.screen.mvi.m) r0
            int r1 = r0.f208156s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208156s = r1
            goto L18
        L13:
            com.avito.android.notifications_settings.screen.mvi.m r0 = new com.avito.android.notifications_settings.screen.mvi.m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f208154q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f208156s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            r0.f208156s = r3
            Ek0.a r5 = r4.f208160a
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L58
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            Jk0.c r5 = (Jk0.C14209c) r5
            com.avito.android.remote.model.notifications_settings.NotificationsSettings r5 = com.avito.android.remote.model.notifications_settings.NotificationsSettingsEntityMapperKt.toNotificationsSettings(r5)
            com.avito.android.remote.model.TypedResult$Success r0 = new com.avito.android.remote.model.TypedResult$Success
            r0.<init>(r5)
            r5 = r0
            goto L5c
        L58:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L82
        L5c:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L69
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            com.avito.android.remote.model.notifications_settings.NotificationsSettings r5 = (com.avito.android.remote.model.notifications_settings.NotificationsSettings) r5
            return r5
        L69:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L7c
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r0 = r5.getError()
            java.lang.Throwable r5 = r5.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r0, r5)
            throw r5
        L7c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L82:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notifications_settings.screen.mvi.o.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
