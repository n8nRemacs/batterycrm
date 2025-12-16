package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.phones_list.InterfaceC33421f;
import com.avito.android.remote.InterfaceC34401z0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PhonesListMviInteractor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/mvi/J;", "Lcom/avito/android/profile_phones/phones_list/mvi/G;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class J implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33421f f227924a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f227925b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NL.d f227926c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NL.e f227927d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final NL.f f227928e;

    @Inject
    public J(@Y61.k InterfaceC33421f interfaceC33421f, @Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k NL.d dVar, @Y61.k NL.e eVar, @Y61.k NL.f fVar) {
        this.f227924a = interfaceC33421f;
        this.f227925b = interfaceC34401z0;
        this.f227926c = dVar;
        this.f227927d = eVar;
        this.f227928e = fVar;
    }

    @Override // com.avito.android.profile_phones.phones_list.mvi.G
    @Y61.k
    public final C33432d a() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        NL.f fVar = this.f227928e;
        return new C33432d(false, c42784z0, fVar.c(), fVar.e(), this.f227927d.a(), null, true, 32, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.profile_phones.phones_list.mvi.G
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.profile_phones.phones_list.mvi.I
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.profile_phones.phones_list.mvi.I r0 = (com.avito.android.profile_phones.phones_list.mvi.I) r0
            int r1 = r0.f227923t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227923t = r1
            goto L18
        L13:
            com.avito.android.profile_phones.phones_list.mvi.I r0 = new com.avito.android.profile_phones.phones_list.mvi.I
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f227921r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f227923t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.profile_phones.phones_list.mvi.J r0 = r0.f227920q
            kotlin.C42729a0.b(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            r0.f227920q = r4
            r0.f227923t = r3
            com.avito.android.remote.z0 r5 = r4.f227925b
            java.lang.Object r5 = r5.C(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r1 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r1 == 0) goto L5d
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            com.avito.android.remote.model.user_profile.PhonesList r5 = (com.avito.android.remote.model.user_profile.PhonesList) r5
            com.avito.android.profile_phones.phones_list.f r0 = r0.f227924a
            java.util.List r5 = r5.getPhones()
            java.util.ArrayList r5 = r0.a(r5)
            return r5
        L5d:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L70
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r0 = r5.getError()
            java.lang.Throwable r5 = r5.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r0, r5)
            throw r5
        L70:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.mvi.J.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.profile_phones.phones_list.mvi.G
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.avito.android.profile_phones.phones_list.mvi.H
            if (r0 == 0) goto L13
            r0 = r15
            com.avito.android.profile_phones.phones_list.mvi.H r0 = (com.avito.android.profile_phones.phones_list.mvi.H) r0
            int r1 = r0.f227919t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227919t = r1
            goto L18
        L13:
            com.avito.android.profile_phones.phones_list.mvi.H r0 = new com.avito.android.profile_phones.phones_list.mvi.H
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.f227917r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f227919t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.avito.android.profile_phones.phones_list.mvi.J r0 = r0.f227916q
            kotlin.C42729a0.b(r15)
            kotlin.Z r15 = (kotlin.Z) r15
            java.lang.Object r15 = r15.f406625b
            goto L50
        L2f:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L37:
            kotlin.C42729a0.b(r15)
            java.lang.Boolean r15 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r0.f227916q = r14
            r0.f227919t = r3
            NL.d r4 = r14.f227926c
            java.lang.Object r15 = r4.b(r15, r2, r0)
            if (r15 != r1) goto L4f
            return r1
        L4f:
            r0 = r14
        L50:
            java.lang.Throwable r1 = kotlin.Z.b(r15)
            if (r1 != 0) goto L59
            NL.c r15 = (NL.c) r15
            goto L7b
        L59:
            NL.e r15 = r0.f227927d
            boolean r5 = r15.a()
            NL.f r15 = r0.f227928e
            org.threeten.bp.g r6 = r15.c()
            org.threeten.bp.g r7 = r15.e()
            kotlin.collections.z0 r8 = kotlin.collections.C42784z0.f406748b
            NL.c r15 = new NL.c
            r0 = 0
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r10 = 0
            r11 = 0
            r12 = 32
            r13 = 0
            r4 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L7b:
            java.util.List<NL.b> r6 = r15.f11382d
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            java.lang.Boolean r1 = r15.f11383e
            boolean r5 = kotlin.jvm.internal.L.f(r1, r0)
            boolean r0 = r15.f11385g
            r11 = r0 ^ 1
            com.avito.android.profile_phones.phones_list.mvi.d r0 = new com.avito.android.profile_phones.phones_list.mvi.d
            boolean r9 = r15.f11379a
            java.util.List<com.avito.android.iac_incoming_call_ability.public_module.iac_enable.ScheduleOption> r10 = r15.f11384f
            org.threeten.bp.g r7 = r15.f11380b
            org.threeten.bp.g r8 = r15.f11381c
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.mvi.J.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
