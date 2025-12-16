package com.avito.android.mortgage_invite.client_form.domain;

import androidx.compose.runtime.internal.P;
import e20.InterfaceC39928a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CreateParticipantUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/domain/i;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39928a f205170a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.client_form.domain.mapper.a f205171b;

    @Inject
    public i(@Y61.k InterfaceC39928a interfaceC39928a, @Y61.k com.avito.android.mortgage_invite.client_form.domain.mapper.a aVar) {
        this.f205170a = interfaceC39928a;
        this.f205171b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.mortgage_invite.generated.api.api_2_mortgage_form_participant_create_post.CreateParticipantInV2 r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.mortgage_invite.client_form.domain.h
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.mortgage_invite.client_form.domain.h r0 = (com.avito.android.mortgage_invite.client_form.domain.h) r0
            int r1 = r0.f205169t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f205169t = r1
            goto L18
        L13:
            com.avito.android.mortgage_invite.client_form.domain.h r0 = new com.avito.android.mortgage_invite.client_form.domain.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f205167r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f205169t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.mortgage_invite.client_form.domain.i r5 = r0.f205166q
            kotlin.C42729a0.b(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            r0.f205166q = r4
            r0.f205169t = r3
            e20.a r6 = r4.f205170a
            java.lang.Object r6 = r6.f(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L59
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            k20.a r6 = (k20.C42477a) r6
            com.avito.android.mortgage_invite.client_form.domain.mapper.a r5 = r5.f205171b
            com.avito.android.mortgage_invite.client_form.domain.g r5 = r5.a(r6)
            goto L71
        L59:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L72
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r5 = r6.getError()
            java.lang.Throwable r6 = r6.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            com.avito.android.mortgage_invite.client_form.domain.g$a r6 = new com.avito.android.mortgage_invite.client_form.domain.g$a
            r6.<init>(r5)
            r5 = r6
        L71:
            return r5
        L72:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.client_form.domain.i.a(com.avito.android.mortgage_invite.generated.api.api_2_mortgage_form_participant_create_post.CreateParticipantInV2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
