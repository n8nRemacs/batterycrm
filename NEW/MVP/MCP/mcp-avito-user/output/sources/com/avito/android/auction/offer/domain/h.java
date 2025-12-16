package com.avito.android.auction.offer.domain;

import Pd.InterfaceC14769a;
import Y61.l;
import com.avito.android.auction.remote.model.AuctionSendingResult;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.n;
import lD.C43617a;
import sj0.InterfaceC48373a;

/* compiled from: AuctionOfferInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auction/offer/domain/h;", "Lcom/avito/android/auction/offer/domain/d;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC14769a> f92510a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC48373a> f92511b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43617a f92512c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f92513d;

    @Inject
    public h(@Y61.k h31.e<InterfaceC14769a> eVar, @Y61.k h31.e<InterfaceC48373a> eVar2, @Y61.k C43617a c43617a, @Y61.k x xVar) {
        this.f92510a = eVar;
        this.f92511b = eVar2;
        this.f92512c = c43617a;
        this.f92513d = xVar;
    }

    @Override // com.avito.android.auction.offer.domain.d
    @l
    public final Object a(@Y61.k String str, @l String str2, @Y61.k Continuation<? super TypedResult<AuctionSendingResult>> continuation) {
        C43617a c43617a = this.f92512c;
        c43617a.getClass();
        n<Object> nVar = C43617a.f413588V[40];
        return ((Boolean) c43617a.f413604P.a().invoke()).booleanValue() ? e(str, str2, (ContinuationImpl) continuation) : this.f92510a.get().a(str, str2, continuation);
    }

    @Override // com.avito.android.auction.offer.domain.d
    @l
    public final Object b(@Y61.k String str, @Y61.k SuspendLambda suspendLambda) {
        return this.f92510a.get().e(str, suspendLambda);
    }

    @Override // com.avito.android.auction.offer.domain.d
    @l
    public final Object c(@Y61.k String str, @Y61.k SuspendLambda suspendLambda) {
        C43617a c43617a = this.f92512c;
        c43617a.getClass();
        n<Object> nVar = C43617a.f413588V[42];
        return ((Boolean) c43617a.f413606R.a().invoke()).booleanValue() ? d(str, suspendLambda) : this.f92510a.get().b(str, suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.avito.android.auction.offer.domain.e
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.auction.offer.domain.e r0 = (com.avito.android.auction.offer.domain.e) r0
            int r1 = r0.f92505s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92505s = r1
            goto L18
        L13:
            com.avito.android.auction.offer.domain.e r0 = new com.avito.android.auction.offer.domain.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f92503q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f92505s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.C42729a0.b(r9)
            goto L46
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            kotlin.C42729a0.b(r9)
            h31.e<sj0.a> r9 = r7.f92511b
            java.lang.Object r9 = r9.get()
            sj0.a r9 = (sj0.InterfaceC48373a) r9
            r0.f92505s = r3
            java.lang.Object r9 = r9.d(r4, r4, r8, r0)
            if (r9 != r1) goto L46
            return r1
        L46:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9
            boolean r8 = r9 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r8 == 0) goto Ld6
            com.google.gson.d r8 = new com.google.gson.d
            r8.<init>()
            com.avito.android.remote.parse.adapter.stream_gson.BeduinV2AdapterFactory r0 = new com.avito.android.remote.parse.adapter.stream_gson.BeduinV2AdapterFactory
            r0.<init>()
            r8.c(r0)
            com.google.gson.Gson r8 = r8.a()
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9
            java.lang.Object r0 = r9.getResult()
            wj0.a r0 = (wj0.C49640a) r0
            com.avito.android.remote.model.BeduinV2 r0 = r0.getComponents()
            java.lang.String r0 = r0.getJson()
            com.avito.android.auction.offer.domain.f r1 = new com.avito.android.auction.offer.domain.f
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r8 = r8.e(r0, r1)
            java.util.List r8 = (java.util.List) r8
            com.avito.android.remote.model.TypedResult$Success r0 = new com.avito.android.remote.model.TypedResult$Success
            com.avito.android.auction.remote.model.AuctionOfferV2Response r1 = new com.avito.android.auction.remote.model.AuctionOfferV2Response
            java.lang.Object r2 = r9.getResult()
            wj0.a r2 = (wj0.C49640a) r2
            long r2 = r2.getLocationId()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.avito.android.auction.remote.model.Button r3 = new com.avito.android.auction.remote.model.Button
            java.lang.Object r5 = r9.getResult()
            wj0.a r5 = (wj0.C49640a) r5
            wj0.b r5 = r5.getFooter()
            wj0.c r5 = r5.getApplyButton()
            java.lang.String r5 = r5.getText()
            r3.<init>(r5)
            com.avito.android.auction.remote.model.Button r5 = new com.avito.android.auction.remote.model.Button
            java.lang.Object r6 = r9.getResult()
            wj0.a r6 = (wj0.C49640a) r6
            wj0.b r6 = r6.getFooter()
            wj0.d r6 = r6.getCancelButton()
            java.lang.String r6 = r6.getText()
            r5.<init>(r6)
            java.lang.Object r9 = r9.getResult()
            wj0.a r9 = (wj0.C49640a) r9
            wj0.b r9 = r9.getFooter()
            com.avito.android.remote.model.text.AttributedText r9 = r9.getTerms()
            com.avito.android.auction.remote.model.AuctionFooter r6 = new com.avito.android.auction.remote.model.AuctionFooter
            r6.<init>(r4, r9, r3, r5)
            r1.<init>(r2, r8, r6)
            r0.<init>(r1)
            goto Ldd
        Ld6:
            boolean r8 = r9 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto Lde
            r0 = r9
            com.avito.android.remote.model.TypedResult$Error r0 = (com.avito.android.remote.model.TypedResult.Error) r0
        Ldd:
            return r0
        Lde:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auction.offer.domain.h.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.avito.android.auction.offer.domain.g
            if (r0 == 0) goto L14
            r0 = r10
            com.avito.android.auction.offer.domain.g r0 = (com.avito.android.auction.offer.domain.g) r0
            int r1 = r0.f92509t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f92509t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.avito.android.auction.offer.domain.g r0 = new com.avito.android.auction.offer.domain.g
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f92507r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f92509t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            com.avito.android.auction.offer.domain.h r8 = r6.f92506q
            kotlin.C42729a0.b(r10)
            goto L51
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r10)
            h31.e<sj0.a> r10 = r7.f92511b
            java.lang.Object r10 = r10.get()
            r1 = r10
            sj0.a r1 = (sj0.InterfaceC48373a) r1
            r6.f92506q = r7
            r6.f92509t = r2
            r2 = 0
            r3 = 0
            r4 = r8
            r5 = r9
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L50
            return r0
        L50:
            r8 = r7
        L51:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r9 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r9 == 0) goto L74
            com.avito.android.remote.model.TypedResult$Success r9 = new com.avito.android.remote.model.TypedResult$Success
            com.avito.android.auction.remote.model.AuctionSendingResult r0 = new com.avito.android.auction.remote.model.AuctionSendingResult
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r10 = r10.getResult()
            uj0.a r10 = (uj0.C49067a) r10
            java.lang.String r10 = r10.getDeepLinkUri()
            com.avito.android.deep_linking.x r8 = r8.f92513d
            com.avito.android.deep_linking.links.DeepLink r8 = r8.b(r10)
            r0.<init>(r8)
            r9.<init>(r0)
            goto L7b
        L74:
            boolean r8 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto L7c
            r9 = r10
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9
        L7b:
            return r9
        L7c:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auction.offer.domain.h.e(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
