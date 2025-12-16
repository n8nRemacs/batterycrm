package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation;

import com.avito.android.remote.InterfaceC34401z0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReAgentShortFlowCreationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/f;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/d;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f211568a;

    @Inject
    public f(@Y61.k InterfaceC34401z0 interfaceC34401z0) {
        this.f211568a = interfaceC34401z0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, @Y61.l java.lang.Integer r10, @Y61.k java.lang.String r11, @Y61.l java.lang.String r12, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.e
            if (r0 == 0) goto L14
            r0 = r13
            com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.e r0 = (com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.e) r0
            int r1 = r0.f211567t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f211567t = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.e r0 = new com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.e
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.f211565r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f211567t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.f r9 = r7.f211564q
            kotlin.C42729a0.b(r13)
            goto L4b
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.C42729a0.b(r13)
            r7.f211564q = r8
            r7.f211567t = r2
            com.avito.android.remote.z0 r1 = r8.f211568a
            r5 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            java.lang.Object r13 = r1.v(r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L4a
            return r0
        L4a:
            r9 = r8
        L4b:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            boolean r10 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r10 == 0) goto L82
            com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
            java.lang.Object r10 = r13.getResult()
            com.avito.android.remote.model.CreateExtendedProfileResult r10 = (com.avito.android.remote.model.CreateExtendedProfileResult) r10
            r9.getClass()
            boolean r9 = r10 instanceof com.avito.android.remote.model.CreateExtendedProfileResult.Ok
            if (r9 == 0) goto L63
            X50.a$b r9 = X50.a.b.f18579a
            goto L76
        L63:
            boolean r9 = r10 instanceof com.avito.android.remote.model.CreateExtendedProfileResult.NeedVerification
            if (r9 == 0) goto L7c
            X50.a$c r9 = new X50.a$c
            com.avito.android.remote.model.CreateExtendedProfileResult$NeedVerification r10 = (com.avito.android.remote.model.CreateExtendedProfileResult.NeedVerification) r10
            com.avito.android.deep_linking.links.DeepLink r11 = r10.getVerificationDeeplink()
            com.avito.android.remote.model.VerificationDisclaimer r10 = r10.getVerificationDisclaimer()
            r9.<init>(r11, r10)
        L76:
            com.avito.android.remote.model.TypedResult$Success r13 = new com.avito.android.remote.model.TypedResult$Success
            r13.<init>(r9)
            goto L86
        L7c:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L82:
            boolean r9 = r13 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r9 == 0) goto L87
        L86:
            return r13
        L87:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.f.a(int, java.lang.Integer, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
