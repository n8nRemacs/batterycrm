package com.avito.android.extended_profile_serp.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSerpActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.mvi.ExtendedProfileSerpActor$handleContactsClick$1", f = "ExtendedProfileSerpActor.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSerpInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f152893q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f152894r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSerpState f152895s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ DeepLink f152896t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f152897u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n nVar, ExtendedProfileSerpState extendedProfileSerpState, DeepLink deepLink, String str, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f152894r = nVar;
        this.f152895s = extendedProfileSerpState;
        this.f152896t = deepLink;
        this.f152897u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new a(this.f152894r, this.f152895s, this.f152896t, this.f152897u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSerpInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f152893q
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.C42729a0.b(r8)
            goto L9b
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            kotlin.C42729a0.b(r8)
            r7.f152893q = r2
            com.avito.android.extended_profile_serp.mvi.n r1 = r7.f152894r
            r1.getClass()
            com.avito.android.deep_linking.links.DeepLink r8 = r7.f152896t
            boolean r2 = r8 instanceof com.avito.android.deep_linking.links.CreateChannelByOpponentUserLink
            com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState r3 = r7.f152895s
            if (r2 == 0) goto L30
            r8 = 0
            r1.d(r3, r8, r8)
            goto L96
        L30:
            boolean r2 = r8 instanceof com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink
            if (r2 == 0) goto L4c
            com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink r8 = (com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink) r8
            r5 = 0
            java.lang.String r4 = r8.f133320c
            java.lang.String r8 = r8.f133319b
            r2 = r3
            r3 = r8
            r6 = r7
            java.lang.Object r8 = r1.c(r2, r3, r4, r5, r6)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r1) goto L49
            goto L98
        L49:
            kotlin.G0 r8 = kotlin.G0.f406611a
            goto L98
        L4c:
            boolean r2 = r8 instanceof com.avito.android.deep_linking.links.PhoneLink.Call
            com.avito.android.extended_profile_serp.ExtendedProfileSerpConfig r4 = r1.f153021a
            if (r2 == 0) goto L6b
            java.lang.String r4 = r4.f152442b
            com.avito.android.deep_linking.links.PhoneLink$Call r8 = (com.avito.android.deep_linking.links.PhoneLink.Call) r8
            r5 = 0
            java.lang.String r8 = r8.f133575d
            r2 = r3
            r3 = r4
            r4 = r8
            r6 = r7
            java.lang.Object r8 = r1.c(r2, r3, r4, r5, r6)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r1) goto L68
            goto L98
        L68:
            kotlin.G0 r8 = kotlin.G0.f406611a
            goto L98
        L6b:
            boolean r2 = r8 instanceof com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink
            if (r2 == 0) goto L89
            java.lang.String r4 = r4.f152442b
            com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink r8 = (com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink) r8
            java.lang.String r5 = r8.f92281b
            java.lang.String r8 = r8.f92282c
            r2 = r3
            r3 = r4
            r4 = r8
            r6 = r7
            java.lang.Object r8 = r1.c(r2, r3, r4, r5, r6)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r1) goto L86
            goto L98
        L86:
            kotlin.G0 r8 = kotlin.G0.f406611a
            goto L98
        L89:
            boolean r2 = r8 instanceof com.avito.android.deeplink.JobApplyCreateLink
            if (r2 == 0) goto L96
            com.avito.android.deeplink.JobApplyCreateLink r8 = (com.avito.android.deeplink.JobApplyCreateLink) r8
            java.lang.String r2 = r7.f152897u
            java.lang.String r8 = r8.f134079b
            r1.d(r3, r8, r2)
        L96:
            kotlin.G0 r8 = kotlin.G0.f406611a
        L98:
            if (r8 != r0) goto L9b
            return r0
        L9b:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_serp.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
