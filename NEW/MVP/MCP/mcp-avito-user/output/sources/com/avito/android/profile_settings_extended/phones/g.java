package com.avito.android.profile_settings_extended.phones;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.D0;
import com.avito.android.util.InterfaceC35863o4;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileSettingsPhonesRepository.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/phones/g;", "Lcom/avito/android/profile_settings_extended/phones/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<D0> f230809a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<Gson> f230810b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f230811c;

    @Inject
    public g(@k h31.e<D0> eVar, @k h31.e<Gson> eVar2, @k InterfaceC35863o4 interfaceC35863o4) {
        this.f230809a = eVar;
        this.f230810b = eVar2;
        this.f230811c = interfaceC35863o4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.profile_settings_extended.phones.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws com.avito.android.util.ApiException {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.avito.android.profile_settings_extended.phones.e
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.profile_settings_extended.phones.e r0 = (com.avito.android.profile_settings_extended.phones.e) r0
            int r1 = r0.f230805s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230805s = r1
            goto L18
        L13:
            com.avito.android.profile_settings_extended.phones.e r0 = new com.avito.android.profile_settings_extended.phones.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f230803q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f230805s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r10)
            goto L76
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            kotlin.C42729a0.b(r10)
            h31.e<com.google.gson.Gson> r10 = r8.f230810b
            java.lang.Object r10 = r10.get()
            com.google.gson.Gson r10 = (com.google.gson.Gson) r10
            com.avito.android.remote.model.extended.modification.ModificationBody r2 = new com.avito.android.remote.model.extended.modification.ModificationBody
            com.avito.android.remote.model.extended.modification.PhoneModification r4 = new com.avito.android.remote.model.extended.modification.PhoneModification
            com.avito.android.util.o4 r5 = r8.f230811c
            java.lang.String r5 = r5.a()
            com.avito.android.remote.model.extended.modification.PhoneModification$OperationType r6 = com.avito.android.remote.model.extended.modification.PhoneModification.OperationType.ADD
            com.avito.android.remote.model.extended.modification.PhoneModification$Operation$PhoneValue r7 = new com.avito.android.remote.model.extended.modification.PhoneModification$Operation$PhoneValue
            r7.<init>(r9)
            com.avito.android.remote.model.extended.modification.PhoneModification$Operation r9 = new com.avito.android.remote.model.extended.modification.PhoneModification$Operation
            r9.<init>(r6, r5, r7)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r5 = 0
            r4.<init>(r5, r9, r3, r5)
            java.util.List r9 = java.util.Collections.singletonList(r4)
            r2.<init>(r9)
            java.lang.String r9 = r10.l(r2)
            h31.e<com.avito.android.remote.D0> r10 = r8.f230809a
            java.lang.Object r10 = r10.get()
            com.avito.android.remote.D0 r10 = (com.avito.android.remote.D0) r10
            r0.f230805s = r3
            java.lang.Object r10 = r10.e(r9, r0)
            if (r10 != r1) goto L76
            return r1
        L76:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r9 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r9 == 0) goto L85
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r9 = r10.getResult()
            com.avito.android.remote.model.extended.modification.ModificationResult r9 = (com.avito.android.remote.model.extended.modification.ModificationResult) r9
            return r9
        L85:
            boolean r9 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r9 == 0) goto L98
            com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
            com.avito.android.remote.error.ApiError r9 = r10.getError()
            java.lang.Throwable r10 = r10.getCause()
            com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r9, r10)
            throw r9
        L98:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.phones.g.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.profile_settings_extended.phones.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r8, @Y61.k java.lang.String r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws com.avito.android.util.ApiException {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.avito.android.profile_settings_extended.phones.f
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.profile_settings_extended.phones.f r0 = (com.avito.android.profile_settings_extended.phones.f) r0
            int r1 = r0.f230808s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230808s = r1
            goto L18
        L13:
            com.avito.android.profile_settings_extended.phones.f r0 = new com.avito.android.profile_settings_extended.phones.f
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f230806q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f230808s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r10)
            goto L70
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.C42729a0.b(r10)
            h31.e<com.google.gson.Gson> r10 = r7.f230810b
            java.lang.Object r10 = r10.get()
            com.google.gson.Gson r10 = (com.google.gson.Gson) r10
            com.avito.android.remote.model.extended.modification.ModificationBody r2 = new com.avito.android.remote.model.extended.modification.ModificationBody
            com.avito.android.remote.model.extended.modification.PhoneModification r4 = new com.avito.android.remote.model.extended.modification.PhoneModification
            com.avito.android.remote.model.extended.modification.PhoneModification$OperationType r5 = com.avito.android.remote.model.extended.modification.PhoneModification.OperationType.UPDATE
            com.avito.android.remote.model.extended.modification.PhoneModification$Operation$PhoneValue r6 = new com.avito.android.remote.model.extended.modification.PhoneModification$Operation$PhoneValue
            r6.<init>(r9)
            com.avito.android.remote.model.extended.modification.PhoneModification$Operation r9 = new com.avito.android.remote.model.extended.modification.PhoneModification$Operation
            r9.<init>(r5, r8, r6)
            java.util.List r8 = java.util.Collections.singletonList(r9)
            r9 = 0
            r4.<init>(r9, r8, r3, r9)
            java.util.List r8 = java.util.Collections.singletonList(r4)
            r2.<init>(r8)
            java.lang.String r8 = r10.l(r2)
            h31.e<com.avito.android.remote.D0> r9 = r7.f230809a
            java.lang.Object r9 = r9.get()
            com.avito.android.remote.D0 r9 = (com.avito.android.remote.D0) r9
            r0.f230808s = r3
            java.lang.Object r10 = r9.e(r8, r0)
            if (r10 != r1) goto L70
            return r1
        L70:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r8 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r8 == 0) goto L7f
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r8 = r10.getResult()
            com.avito.android.remote.model.extended.modification.ModificationResult r8 = (com.avito.android.remote.model.extended.modification.ModificationResult) r8
            return r8
        L7f:
            boolean r8 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto L92
            com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
            com.avito.android.remote.error.ApiError r8 = r10.getError()
            java.lang.Throwable r9 = r10.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r8, r9)
            throw r8
        L92:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.phones.g.b(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
