package com.avito.android.extended_profile.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile.mvi.C30451a;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$handleContactsClick$1", f = "ExtendedProfileActor.kt", i = {}, l = {885}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30455e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150154q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C30451a f150155r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f150156s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ DeepLink f150157t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C30451a.b f150158u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f150159v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30455e(C30451a c30451a, com.avito.android.extended_profile.mvi.entity.a aVar, DeepLink deepLink, C30451a.b bVar, String str, Continuation<? super C30455e> continuation) {
        super(2, continuation);
        this.f150155r = c30451a;
        this.f150156s = aVar;
        this.f150157t = deepLink;
        this.f150158u = bVar;
        this.f150159v = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C30455e(this.f150155r, this.f150156s, this.f150157t, this.f150158u, this.f150159v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30455e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f150154q
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.C42729a0.b(r9)
            goto L9b
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            kotlin.C42729a0.b(r9)
            r8.f150154q = r2
            com.avito.android.extended_profile.mvi.a r1 = r8.f150155r
            r1.getClass()
            com.avito.android.deep_linking.links.DeepLink r9 = r8.f150157t
            boolean r2 = r9 instanceof com.avito.android.deep_linking.links.CreateChannelByOpponentUserLink
            com.avito.android.extended_profile.mvi.a$b r5 = r8.f150158u
            com.avito.android.extended_profile.mvi.entity.a r3 = r8.f150156s
            if (r2 == 0) goto L32
            r9 = 0
            r1.j(r3, r5, r9, r9)
            goto L96
        L32:
            boolean r2 = r9 instanceof com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink
            if (r2 == 0) goto L4f
            com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink r9 = (com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink) r9
            java.lang.String r4 = r9.f133319b
            r6 = 0
            java.lang.String r9 = r9.f133320c
            r2 = r3
            r3 = r4
            r4 = r9
            r7 = r8
            java.lang.Object r9 = r1.i(r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r1) goto L4c
            goto L98
        L4c:
            kotlin.G0 r9 = kotlin.G0.f406611a
            goto L98
        L4f:
            boolean r2 = r9 instanceof com.avito.android.deep_linking.links.PhoneLink.Call
            if (r2 == 0) goto L6b
            com.avito.android.deep_linking.links.PhoneLink$Call r9 = (com.avito.android.deep_linking.links.PhoneLink.Call) r9
            java.lang.String r4 = r9.f133575d
            r6 = 0
            java.lang.String r9 = r1.f150067a
            r2 = r3
            r3 = r9
            r7 = r8
            java.lang.Object r9 = r1.i(r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r1) goto L68
            goto L98
        L68:
            kotlin.G0 r9 = kotlin.G0.f406611a
            goto L98
        L6b:
            boolean r2 = r9 instanceof com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink
            if (r2 == 0) goto L89
            com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink r9 = (com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink) r9
            java.lang.String r4 = r9.f92282c
            java.lang.String r6 = r1.f150067a
            java.lang.String r9 = r9.f92281b
            r2 = r3
            r3 = r6
            r6 = r9
            r7 = r8
            java.lang.Object r9 = r1.i(r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r1) goto L86
            goto L98
        L86:
            kotlin.G0 r9 = kotlin.G0.f406611a
            goto L98
        L89:
            boolean r2 = r9 instanceof com.avito.android.deeplink.JobApplyCreateLink
            if (r2 == 0) goto L96
            com.avito.android.deeplink.JobApplyCreateLink r9 = (com.avito.android.deeplink.JobApplyCreateLink) r9
            java.lang.String r9 = r9.f134079b
            java.lang.String r2 = r8.f150159v
            r1.j(r3, r5, r9, r2)
        L96:
            kotlin.G0 r9 = kotlin.G0.f406611a
        L98:
            if (r9 != r0) goto L9b
            return r0
        L9b:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.mvi.C30455e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
