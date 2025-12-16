package com.avito.android.profile_settings_extended;

import com.avito.android.remote.D0;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileSettingsToggleInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/V;", "Lcom/avito/android/profile_settings_extended/T;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class V implements T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f229079a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gson f229080b;

    @Inject
    public V(@Y61.k Gson gson, @Y61.k h31.e eVar) {
        this.f229079a = eVar;
        this.f229080b = gson;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.profile_settings_extended.T
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7, boolean r8) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.profile_settings_extended.U
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.profile_settings_extended.U r0 = (com.avito.android.profile_settings_extended.U) r0
            int r1 = r0.f229078s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f229078s = r1
            goto L18
        L13:
            com.avito.android.profile_settings_extended.U r0 = new com.avito.android.profile_settings_extended.U
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f229076q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f229078s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L64
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            com.avito.android.remote.model.extended.modification.ToggleModification$Operation r7 = new com.avito.android.remote.model.extended.modification.ToggleModification$Operation
            com.avito.android.remote.model.extended.modification.ToggleModification$OperationType r2 = com.avito.android.remote.model.extended.modification.ToggleModification.OperationType.UPDATE
            r7.<init>(r6, r2, r8)
            com.avito.android.remote.model.extended.modification.ModificationBody r6 = new com.avito.android.remote.model.extended.modification.ModificationBody
            com.avito.android.remote.model.extended.modification.ToggleModification r8 = new com.avito.android.remote.model.extended.modification.ToggleModification
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r8.<init>(r5, r7)
            java.util.List r5 = java.util.Collections.singletonList(r8)
            r6.<init>(r5)
            com.google.gson.Gson r5 = r4.f229080b
            java.lang.String r5 = r5.l(r6)
            h31.e<com.avito.android.remote.D0> r6 = r4.f229079a
            java.lang.Object r6 = r6.get()
            com.avito.android.remote.D0 r6 = (com.avito.android.remote.D0) r6
            r0.f229078s = r3
            java.lang.Object r7 = r6.e(r5, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L75
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r5 = r7.getResult()
            com.avito.android.remote.model.extended.modification.ModificationResult r5 = (com.avito.android.remote.model.extended.modification.ModificationResult) r5
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L75:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L88
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r5 = r7.getError()
            java.lang.Throwable r6 = r7.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L88:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.V.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }
}
