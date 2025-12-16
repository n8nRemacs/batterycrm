package com.avito.android.navigation_config.service;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NavigationConfigService.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/navigation_config/service/e;", "Lcom/avito/android/navigation_config/service/b;", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<X20.a> f207250a;

    @Inject
    public e(@k h31.e<X20.a> eVar) {
        this.f207250a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.navigation_config.service.b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.avito.android.navigation_config.service.c
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.navigation_config.service.c r0 = (com.avito.android.navigation_config.service.c) r0
            int r1 = r0.f207246s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207246s = r1
            goto L18
        L13:
            com.avito.android.navigation_config.service.c r0 = new com.avito.android.navigation_config.service.c
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f207244q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f207246s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r11)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r11 = move-exception
            goto L4e
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            kotlin.C42729a0.b(r11)
            int r11 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L29
            h31.e<X20.a> r11 = r10.f207250a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r11 = r11.get()     // Catch: java.lang.Throwable -> L29
            X20.a r11 = (X20.a) r11     // Catch: java.lang.Throwable -> L29
            r0.f207246s = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r11 = r11.b(r0)     // Catch: java.lang.Throwable -> L29
            if (r11 != r1) goto L49
            return r1
        L49:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11     // Catch: java.lang.Throwable -> L29
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L29
            goto L56
        L4e:
            int r0 = kotlin.Z.f406624c
            kotlin.Z$b r0 = new kotlin.Z$b
            r0.<init>(r11)
            r11 = r0
        L56:
            java.lang.Throwable r0 = kotlin.Z.b(r11)
            if (r0 != 0) goto L5d
            goto L75
        L5d:
            com.avito.android.remote.model.TypedResult$Error r11 = new com.avito.android.remote.model.TypedResult$Error
            com.avito.android.remote.error.ApiError$UnknownError r1 = new com.avito.android.remote.error.ApiError$UnknownError
            java.lang.String r2 = r0.getMessage()
            if (r2 != 0) goto L69
            java.lang.String r2 = ""
        L69:
            r5 = r2
            r9 = 0
            r6 = 0
            r8 = 2
            r4 = r1
            r7 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            r11.<init>(r1, r0)
        L75:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
            boolean r0 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto Lae
            com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
            java.lang.Object r11 = r11.getResult()
            com.avito.android.navigation_config.generated.api.get_navigation_config.GetNavigationConfigResponse r11 = (com.avito.android.navigation_config.generated.api.get_navigation_config.GetNavigationConfigResponse) r11
            U20.a r0 = new U20.a
            com.avito.android.navigation_config.generated.api.get_navigation_config.GetNavigationConfigResponse$AlternativeMain r11 = r11.getAlternativeMain()
            if (r11 == 0) goto La4
            int[] r1 = com.avito.android.navigation_config.service.a.C6179a.f207243a
            int r11 = r11.ordinal()
            r11 = r1[r11]
            if (r11 == r3) goto La1
            r1 = 2
            if (r11 != r1) goto L9b
            com.avito.android.bottom_navigation.space.BottomNavigationSpace r11 = com.avito.android.bottom_navigation.space.BottomNavigationSpace.f107066c
            goto La5
        L9b:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        La1:
            com.avito.android.bottom_navigation.space.BottomNavigationSpace r11 = com.avito.android.bottom_navigation.space.BottomNavigationSpace.f107065b
            goto La5
        La4:
            r11 = 0
        La5:
            r0.<init>(r11)
            com.avito.android.remote.model.TypedResult$Success r11 = new com.avito.android.remote.model.TypedResult$Success
            r11.<init>(r0)
            goto Lb2
        Lae:
            boolean r0 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto Lb3
        Lb2:
            return r11
        Lb3:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.navigation_config.service.e.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.navigation_config.service.b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k com.avito.android.bottom_navigation.space.BottomNavigationSpace r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.navigation_config.service.d
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.navigation_config.service.d r0 = (com.avito.android.navigation_config.service.d) r0
            int r1 = r0.f207249s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207249s = r1
            goto L18
        L13:
            com.avito.android.navigation_config.service.d r0 = new com.avito.android.navigation_config.service.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f207247q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f207249s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L5d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            h31.e<X20.a> r6 = r4.f207250a
            java.lang.Object r6 = r6.get()
            X20.a r6 = (X20.a) r6
            com.avito.android.navigation_config.generated.api.set_alternative_main.MainType r2 = new com.avito.android.navigation_config.generated.api.set_alternative_main.MainType
            int r5 = r5.ordinal()
            if (r5 == 0) goto L4f
            if (r5 != r3) goto L49
            com.avito.android.navigation_config.generated.api.set_alternative_main.MainType$Main r5 = com.avito.android.navigation_config.generated.api.set_alternative_main.MainType.Main.Business360
            goto L51
        L49:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L4f:
            com.avito.android.navigation_config.generated.api.set_alternative_main.MainType$Main r5 = com.avito.android.navigation_config.generated.api.set_alternative_main.MainType.Main.Avito
        L51:
            r2.<init>(r5)
            r0.f207249s = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L73
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            Y20.a r5 = (Y20.a) r5
            kotlin.G0 r5 = kotlin.G0.f406611a
            com.avito.android.remote.model.TypedResult$Success r6 = new com.avito.android.remote.model.TypedResult$Success
            r6.<init>(r5)
            goto L77
        L73:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L78
        L77:
            return r6
        L78:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.navigation_config.service.e.b(com.avito.android.bottom_navigation.space.BottomNavigationSpace, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
