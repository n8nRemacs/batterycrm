package com.avito.android.extended_profile_phone_dialog;

import com.avito.android.remote.N;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfilePhoneInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/j;", "Lcom/avito/android/extended_profile_phone_dialog/g;", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<N> f151607a;

    @Inject
    public j(@Y61.k h31.e<N> eVar) {
        this.f151607a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.extended_profile_phone_dialog.g
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.l java.lang.String r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.extended_profile_phone_dialog.i
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.extended_profile_phone_dialog.i r0 = (com.avito.android.extended_profile_phone_dialog.i) r0
            int r1 = r0.f151606s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151606s = r1
            goto L18
        L13:
            com.avito.android.extended_profile_phone_dialog.i r0 = new com.avito.android.extended_profile_phone_dialog.i
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f151604q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f151606s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            h31.e<com.avito.android.remote.N> r7 = r4.f151607a
            java.lang.Object r7 = r7.get()
            com.avito.android.remote.N r7 = (com.avito.android.remote.N) r7
            r0.f151606s = r3
            java.lang.Object r7 = r7.a(r5, r6, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L56
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r5 = r7.getResult()
            kotlin.G0 r5 = (kotlin.G0) r5
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L56:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L69
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r5 = r7.getError()
            java.lang.Throwable r6 = r7.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L69:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_phone_dialog.j.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.extended_profile_phone_dialog.g
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r8, @Y61.l java.lang.String r9, @Y61.l java.lang.String r10, @Y61.l java.lang.String r11, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws com.avito.android.util.ApiException {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.avito.android.extended_profile_phone_dialog.h
            if (r0 == 0) goto L14
            r0 = r12
            com.avito.android.extended_profile_phone_dialog.h r0 = (com.avito.android.extended_profile_phone_dialog.h) r0
            int r1 = r0.f151603s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f151603s = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.extended_profile_phone_dialog.h r0 = new com.avito.android.extended_profile_phone_dialog.h
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f151601q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f151603s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r12)
            goto L4c
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.C42729a0.b(r12)
            h31.e<com.avito.android.remote.N> r12 = r7.f151607a
            java.lang.Object r12 = r12.get()
            r1 = r12
            com.avito.android.remote.N r1 = (com.avito.android.remote.N) r1
            r6.f151603s = r2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r12 = r1.e(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L4c
            return r0
        L4c:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r8 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r8 == 0) goto L5b
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r8 = r12.getResult()
            com.avito.android.remote.model.ExtendedProfilePhoneResponse r8 = (com.avito.android.remote.model.ExtendedProfilePhoneResponse) r8
            return r8
        L5b:
            boolean r8 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto L6e
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r8 = r12.getError()
            java.lang.Throwable r9 = r12.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r8, r9)
            throw r8
        L6e:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_phone_dialog.j.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
