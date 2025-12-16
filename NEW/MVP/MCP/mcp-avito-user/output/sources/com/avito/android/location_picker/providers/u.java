package com.avito.android.location_picker.providers;

import androidx.collection.o1;
import com.avito.android.analytics.clickstream.I;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.geo_common.model.location_picker.LocationFlowType;
import io.reactivex.rxjava3.internal.operators.maybe.i0;
import io.reactivex.rxjava3.internal.operators.single.U;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import tF.AbstractC48544a;
import uF.AbstractC48888a;

/* compiled from: AddressGeoCoder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/providers/u;", "Lcom/avito/android/location_picker/providers/a;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class u implements InterfaceC31564a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f182478a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o1<AvitoMapPoint, AbstractC48888a> f182479b = new o1<>(0, 1, null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final o1<String, uF.d> f182480c = new o1<>(0, 1, null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o1<String, AbstractC48544a> f182481d = new o1<>(0, 1, null);

    @Inject
    public u(@Y61.k com.avito.android.geo_common.interactor.g gVar) {
        this.f182478a = gVar;
    }

    @Override // com.avito.android.location_picker.providers.InterfaceC31564a
    @Y61.k
    public final U a(@Y61.k AvitoMapPoint avitoMapPoint, @Y61.l String str) {
        return this.f182478a.A(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude(), str).S().r(t.f182477b).u(new I(21));
    }

    @Override // com.avito.android.location_picker.providers.InterfaceC31564a
    @Y61.k
    public final U b() {
        return this.f182478a.z().S().r(o.f182463b).u(new I(25));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.location_picker.providers.InterfaceC31564a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws com.avito.android.util.ApiException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.location_picker.providers.n
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.location_picker.providers.n r0 = (com.avito.android.location_picker.providers.n) r0
            int r1 = r0.f182462s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182462s = r1
            goto L18
        L13:
            com.avito.android.location_picker.providers.n r0 = new com.avito.android.location_picker.providers.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f182460q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f182462s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            r0.f182462s = r3
            com.avito.android.geo_common.interactor.g r6 = r4.f182478a
            java.lang.Object r6 = r6.o(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L4e
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            com.avito.android.geo_common.model.CoordsByAddressResult r5 = (com.avito.android.geo_common.model.CoordsByAddressResult) r5
            return r5
        L4e:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L61
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r5 = r6.getError()
            java.lang.Throwable r6 = r6.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r5, r6)
            throw r5
        L61:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.location_picker.providers.u.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.location_picker.providers.InterfaceC31564a
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.maybe.s0 d(@Y61.k String str, @Y61.k AvitoMapBounds avitoMapBounds) {
        io.reactivex.rxjava3.core.q qVarA = com.avito.android.util.rx3.A.a(this.f182480c.get(str + ' ' + avitoMapBounds));
        io.reactivex.rxjava3.core.q<T> qVarE = this.f182478a.y(str, (62 & 2) != 0 ? null : Double.valueOf(avitoMapBounds.getTopLeft().getLongitude()), (62 & 4) != 0 ? null : Double.valueOf(avitoMapBounds.getBottomRight().getLatitude()), (62 & 8) != 0 ? null : Double.valueOf(avitoMapBounds.getBottomRight().getLongitude()), (62 & 16) != 0 ? null : Double.valueOf(avitoMapBounds.getTopLeft().getLatitude()), (62 & 32) != 0 ? P0.c() : null).S().r(q.f182467b).u(new I(22)).k(new p(this, str, avitoMapBounds)).E();
        qVarA.getClass();
        return new i0(qVarA, qVarE).r();
    }

    @Override // com.avito.android.location_picker.providers.InterfaceC31564a
    @Y61.k
    public final U e(@Y61.k String str) {
        return this.f182478a.k(str).S().r(m.f182459b).u(new I(23));
    }

    @Override // com.avito.android.location_picker.providers.InterfaceC31564a
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.maybe.s0 f(@Y61.k AvitoMapPoint avitoMapPoint, @Y61.k LocationFlowType locationFlowType) {
        io.reactivex.rxjava3.core.q qVarA = com.avito.android.util.rx3.A.a(this.f182479b.get(avitoMapPoint));
        io.reactivex.rxjava3.core.q<T> qVarE = this.f182478a.q(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude(), locationFlowType.f159422b).S().r(l.f182458b).u(new I(24)).k(new k(this, avitoMapPoint)).E();
        qVarA.getClass();
        return new i0(qVarA, qVarE).r();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.location_picker.providers.InterfaceC31564a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@Y61.k java.lang.String r6, @Y61.k com.avito.android.avito_map.AvitoMapBounds r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.avito.android.location_picker.providers.s
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.location_picker.providers.s r0 = (com.avito.android.location_picker.providers.s) r0
            int r1 = r0.f182476v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182476v = r1
            goto L18
        L13:
            com.avito.android.location_picker.providers.s r0 = new com.avito.android.location_picker.providers.s
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f182474t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f182476v
            r3 = 32
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            com.avito.android.avito_map.AvitoMapBounds r7 = r0.f182473s
            java.lang.String r6 = r0.f182472r
            com.avito.android.location_picker.providers.u r0 = r0.f182471q
            kotlin.C42729a0.b(r8)
            goto L68
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.C42729a0.b(r8)
            androidx.collection.o1<java.lang.String, tF.a> r8 = r5.f182481d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.Object r8 = r8.get(r2)
            tF.a r8 = (tF.AbstractC48544a) r8
            if (r8 != 0) goto L85
            r0.f182471q = r5
            r0.f182472r = r6
            r0.f182473s = r7
            r0.f182476v = r4
            java.lang.Object r8 = r5.h(r6, r7, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r0 = r5
        L68:
            tF.a r8 = (tF.AbstractC48544a) r8
            boolean r1 = r8 instanceof tF.AbstractC48544a.c
            if (r1 == 0) goto L85
            androidx.collection.o1<java.lang.String, tF.a> r0 = r0.f182481d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r3)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            r0.put(r6, r8)
        L85:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.location_picker.providers.u.g(java.lang.String, com.avito.android.avito_map.AvitoMapBounds, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r10, com.avito.android.avito_map.AvitoMapBounds r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.avito.android.location_picker.providers.r
            if (r0 == 0) goto L14
            r0 = r12
            com.avito.android.location_picker.providers.r r0 = (com.avito.android.location_picker.providers.r) r0
            int r1 = r0.f182470s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f182470s = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.avito.android.location_picker.providers.r r0 = new com.avito.android.location_picker.providers.r
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f182468q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f182470s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.C42729a0.b(r12)
            goto L74
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            kotlin.C42729a0.b(r12)
            com.avito.android.avito_map.AvitoMapPoint r12 = r11.getTopLeft()
            double r3 = r12.getLongitude()
            java.lang.Double r3 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r3)
            com.avito.android.avito_map.AvitoMapPoint r12 = r11.getBottomRight()
            double r4 = r12.getLatitude()
            java.lang.Double r4 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r4)
            com.avito.android.avito_map.AvitoMapPoint r12 = r11.getBottomRight()
            double r5 = r12.getLongitude()
            java.lang.Double r5 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r5)
            com.avito.android.avito_map.AvitoMapPoint r11 = r11.getTopLeft()
            double r11 = r11.getLatitude()
            java.lang.Double r6 = kotlin.coroutines.jvm.internal.Boxing.boxDouble(r11)
            r7.f182470s = r2
            com.avito.android.geo_common.interactor.g r1 = r9.f182478a
            r8 = 224(0xe0, float:3.14E-43)
            r2 = r10
            java.lang.Object r12 = com.avito.android.geo_common.interactor.g.a.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L74
            return r0
        L74:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r10 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r10 == 0) goto L83
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r10 = r12.getResult()
            tF.a$c r10 = (tF.AbstractC48544a.c) r10
            goto Lbe
        L83:
            boolean r10 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r10 == 0) goto Lbf
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r10 = r12.getError()
            java.lang.Throwable r11 = r12.getCause()
            com.avito.android.util.ApiException r10 = com.avito.android.util.C35936s.a(r10, r11)
            boolean r11 = r10 instanceof com.avito.android.util.NetworkException
            if (r11 == 0) goto La4
            tF.a$b r11 = new tF.a$b
            java.lang.Throwable r10 = r10.getCause()
            r11.<init>(r10)
        La2:
            r10 = r11
            goto Lbe
        La4:
            tF.a$a r11 = new tF.a$a
            java.lang.String r12 = r10.getMessage()
            if (r12 != 0) goto Lb6
            r12 = 3
            r0 = 0
            com.avito.android.remote.error.ApiError$UnknownError r12 = com.avito.android.remote.error.j.d(r12, r0)
            java.lang.String r12 = r12.getF244063c()
        Lb6:
            java.lang.Throwable r10 = r10.getCause()
            r11.<init>(r12, r10)
            goto La2
        Lbe:
            return r10
        Lbf:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.location_picker.providers.u.h(java.lang.String, com.avito.android.avito_map.AvitoMapBounds, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
