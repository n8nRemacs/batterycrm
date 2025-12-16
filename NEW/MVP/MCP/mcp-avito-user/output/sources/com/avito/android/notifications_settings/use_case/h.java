package com.avito.android.notifications_settings.use_case;

import Ek0.InterfaceC13498a;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GetNotificationSettingsUseCaseImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_settings/use_case/h;", "Lcom/avito/android/notifications_settings/use_case/f;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes15.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC13498a f208202a;

    @Inject
    public h(@k InterfaceC13498a interfaceC13498a) {
        this.f208202a = interfaceC13498a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.notifications_settings.use_case.f
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.avito.android.notifications_settings.use_case.g
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.notifications_settings.use_case.g r0 = (com.avito.android.notifications_settings.use_case.g) r0
            int r1 = r0.f208201s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208201s = r1
            goto L18
        L13:
            com.avito.android.notifications_settings.use_case.g r0 = new com.avito.android.notifications_settings.use_case.g
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f208199q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f208201s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            kotlin.C42729a0.b(r8)
            r0.f208201s = r3
            Ek0.a r8 = r7.f208202a
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r0 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L58
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r8 = r8.getResult()
            Jk0.c r8 = (Jk0.C14209c) r8
            com.avito.android.remote.model.notifications_settings.NotificationsSettings r8 = com.avito.android.remote.model.notifications_settings.NotificationsSettingsEntityMapperKt.toNotificationsSettings(r8)
            com.avito.android.remote.model.TypedResult$Success r0 = new com.avito.android.remote.model.TypedResult$Success
            r0.<init>(r8)
            r8 = r0
            goto L5c
        L58:
            boolean r0 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lc7
        L5c:
            boolean r0 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            r1 = 0
            if (r0 == 0) goto L64
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            goto L65
        L64:
            r8 = r1
        L65:
            if (r8 == 0) goto L6e
            java.lang.Object r8 = r8.getResult()
            com.avito.android.remote.model.notifications_settings.NotificationsSettings r8 = (com.avito.android.remote.model.notifications_settings.NotificationsSettings) r8
            goto L6f
        L6e:
            r8 = r1
        L6f:
            if (r8 == 0) goto Lc2
            java.util.List r8 = r8.getSections()
            if (r8 == 0) goto Lc2
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L82:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lc1
            java.lang.Object r2 = r8.next()
            com.avito.android.remote.model.notifications_settings.NotificationsSettings$Section r2 = (com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section) r2
            java.util.List r3 = r2.getChannels()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L98:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb0
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.avito.android.remote.model.notifications_settings.NotificationsSettings$Section$Channel r5 = (com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel) r5
            boolean r6 = r5 instanceof com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel.Push
            if (r6 == 0) goto L98
            boolean r5 = r5.getValue()
            if (r5 != 0) goto L98
            goto Lb1
        Lb0:
            r4 = r1
        Lb1:
            com.avito.android.remote.model.notifications_settings.NotificationsSettings$Section$Channel r4 = (com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel) r4
            if (r4 == 0) goto Lba
            java.lang.String r2 = r2.getType()
            goto Lbb
        Lba:
            r2 = r1
        Lbb:
            if (r2 == 0) goto L82
            r0.add(r2)
            goto L82
        Lc1:
            r1 = r0
        Lc2:
            if (r1 != 0) goto Lc6
            kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
        Lc6:
            return r1
        Lc7:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notifications_settings.use_case.h.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
