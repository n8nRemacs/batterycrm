package com.avito.android.notifications_settings.profile;

import Ek0.InterfaceC13498a;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationsSettingsMessengerHelperImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_settings/profile/e;", "Lcom/avito/android/notifications_settings/profile/a;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes15.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC13498a f208022a;

    @Inject
    public e(@k InterfaceC13498a interfaceC13498a) {
        this.f208022a = interfaceC13498a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.notifications_settings.profile.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.util.List r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.avito.android.notifications_settings.profile.b
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.notifications_settings.profile.b r0 = (com.avito.android.notifications_settings.profile.b) r0
            int r1 = r0.f208014u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208014u = r1
            goto L18
        L13:
            com.avito.android.notifications_settings.profile.b r0 = new com.avito.android.notifications_settings.profile.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f208012s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f208014u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.Iterator r7 = r0.f208011r
            com.avito.android.notifications_settings.profile.e r2 = r0.f208010q
            kotlin.C42729a0.b(r8)
            goto L3f
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.C42729a0.b(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = r6
        L3f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            Ek0.a r4 = r2.f208022a
            r0.f208010q = r2
            r0.f208011r = r7
            r0.f208014u = r3
            java.lang.String r5 = "push"
            java.lang.Object r8 = r4.b(r5, r8, r3, r0)
            if (r8 != r1) goto L3f
            return r1
        L5c:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notifications_settings.profile.e.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.notifications_settings.profile.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.avito.android.notifications_settings.profile.c
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.notifications_settings.profile.c r0 = (com.avito.android.notifications_settings.profile.c) r0
            int r1 = r0.f208018t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208018t = r1
            goto L18
        L13:
            com.avito.android.notifications_settings.profile.c r0 = new com.avito.android.notifications_settings.profile.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f208016r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f208018t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.ArrayList r0 = r0.f208015q
            kotlin.C42729a0.b(r8)
            goto L49
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.C42729a0.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r0.f208015q = r8
            r0.f208018t = r3
            java.lang.Object r0 = r7.c(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r6 = r0
            r0 = r8
            r8 = r6
        L49:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r1 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto La6
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r8 = r8.getResult()
            com.avito.android.remote.model.notifications_settings.NotificationsSettings r8 = (com.avito.android.remote.model.notifications_settings.NotificationsSettings) r8
            java.util.List r8 = r8.getSections()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L61:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r8.next()
            com.avito.android.remote.model.notifications_settings.NotificationsSettings$Section r1 = (com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section) r1
            boolean r2 = r1.isSectionMessenger()
            if (r2 == 0) goto L61
            java.util.List r2 = r1.getChannels()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L7d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L95
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.avito.android.remote.model.notifications_settings.NotificationsSettings$Section$Channel r4 = (com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel) r4
            boolean r5 = r4 instanceof com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel.Push
            if (r5 == 0) goto L7d
            boolean r4 = r4.getValue()
            if (r4 != 0) goto L7d
            goto L96
        L95:
            r3 = 0
        L96:
            com.avito.android.remote.model.notifications_settings.NotificationsSettings$Section$Channel r3 = (com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel) r3
            if (r3 == 0) goto L61
            java.lang.String r1 = r1.getType()
            boolean r1 = r0.add(r1)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            goto L61
        La6:
            boolean r1 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r1 == 0) goto Lb8
            com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
            com.avito.android.remote.error.ApiError r1 = r8.getError()
            java.lang.Throwable r8 = r8.getCause()
            com.avito.android.util.C35936s.a(r1, r8)
        Lb7:
            return r0
        Lb8:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notifications_settings.profile.e.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.notifications_settings.profile.d
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.notifications_settings.profile.d r0 = (com.avito.android.notifications_settings.profile.d) r0
            int r1 = r0.f208021s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208021s = r1
            goto L18
        L13:
            com.avito.android.notifications_settings.profile.d r0 = new com.avito.android.notifications_settings.profile.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f208019q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f208021s
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
            r0.f208021s = r3
            Ek0.a r5 = r4.f208022a
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
            if (r0 == 0) goto L5d
        L5c:
            return r5
        L5d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.notifications_settings.profile.e.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
