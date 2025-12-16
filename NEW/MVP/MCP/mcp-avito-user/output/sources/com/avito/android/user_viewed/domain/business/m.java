package com.avito.android.user_viewed.domain.business;

import iK0.InterfaceC41310a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserViewedRemoteInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/domain/business/m;", "Lcom/avito/android/user_viewed/domain/business/k;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41310a f318355a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_viewed.domain.mapper.g f318356b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_viewed.domain.mapper.a f318357c;

    @Inject
    public m(@Y61.k InterfaceC41310a interfaceC41310a, @Y61.k com.avito.android.user_viewed.domain.mapper.g gVar, @Y61.k com.avito.android.user_viewed.domain.mapper.a aVar) {
        this.f318355a = interfaceC41310a;
        this.f318356b = gVar;
        this.f318357c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.user_viewed.domain.business.k
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.util.List r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.avito.android.user_viewed.domain.business.l
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.user_viewed.domain.business.l r0 = (com.avito.android.user_viewed.domain.business.l) r0
            int r1 = r0.f318354t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f318354t = r1
            goto L18
        L13:
            com.avito.android.user_viewed.domain.business.l r0 = new com.avito.android.user_viewed.domain.business.l
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f318352r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f318354t
            r3 = 10
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.avito.android.user_viewed.domain.business.m r7 = r0.f318351q
            kotlin.C42729a0.b(r8)
            goto L70
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.C42729a0.b(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            int r2 = kotlin.collections.C42745f0.q(r7, r3)
            r8.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L47:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r7.next()
            com.avito.android.advert.viewed.persistance.a r2 = (com.avito.android.advert.viewed.persistance.a) r2
            com.avito.android.user_viewed.domain.mapper.g r5 = r6.f318356b
            jK0.d r2 = r5.a(r2)
            r8.add(r2)
            goto L47
        L5d:
            jK0.b r7 = new jK0.b
            r7.<init>(r8)
            r0.f318351q = r6
            r0.f318354t = r4
            iK0.a r8 = r6.f318355a
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r7 = r6
        L70:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r0 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto Lb7
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r8 = r8.getResult()
            jK0.a r8 = (jK0.C42271a) r8
            java.util.List r0 = r8.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.avito.android.user_viewed.domain.mapper.a r7 = r7.f318357c
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.C42745f0.q(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L93:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r0.next()
            jK0.e r2 = (jK0.C42275e) r2
            com.avito.android.user_viewed.domain.model.UserViewedAdvert r2 = r7.a(r2)
            r1.add(r2)
            goto L93
        La7:
            java.lang.String r7 = r8.getXHash()
            com.avito.android.user_viewed.domain.model.UserViewedData r8 = new com.avito.android.user_viewed.domain.model.UserViewedData
            r8.<init>(r1, r7)
            com.avito.android.remote.model.TypedResult$Success r7 = new com.avito.android.remote.model.TypedResult$Success
            r7.<init>(r8)
            r8 = r7
            goto Lbb
        Lb7:
            boolean r7 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r7 == 0) goto Lbc
        Lbb:
            return r8
        Lbc:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_viewed.domain.business.m.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
