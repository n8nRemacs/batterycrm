package com.avito.android.advert.item.ownership_cost.items.input_form;

import com.avito.android.remote.model.OwnershipCostResponse;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OwnershipCostInputsItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f77980l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f77981m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ OwnershipCostInputsItem f77982n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ OwnershipCostResponse.OwnershipCostForm f77983o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, k kVar, OwnershipCostInputsItem ownershipCostInputsItem, OwnershipCostResponse.OwnershipCostForm ownershipCostForm) {
        super(0);
        this.f77980l = hVar;
        this.f77981m = kVar;
        this.f77982n = ownershipCostInputsItem;
        this.f77983o = ownershipCostForm;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    @Override // Y41.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke() {
        /*
            r12 = this;
            com.avito.android.advert.item.ownership_cost.items.input_form.OwnershipCostInputsItem r0 = r12.f77982n
            java.lang.String r1 = r0.f77977d
            com.avito.android.advert.item.ownership_cost.items.input_form.h r2 = r12.f77980l
            com.avito.android.remote.model.OwnershipCostResponse$OwnershipCostForm r3 = r12.f77983o
            com.avito.android.remote.model.OwnershipCostResponse$OwnershipCostForm$DistanceInput r4 = r3.getDistanceInput()
            com.avito.android.remote.model.OwnershipCostResponse$OwnershipCostForm$DistanceInput$Validation r5 = r4.getValidation()
            r6 = 0
            com.avito.android.advert.item.ownership_cost.items.input_form.k r7 = r12.f77981m
            if (r5 != 0) goto L16
            goto L3e
        L16:
            java.lang.Long r4 = r4.getValue()
            if (r4 == 0) goto L7b
            long r8 = r4.longValue()
            java.lang.Long r4 = r5.getMinValue()
            if (r4 == 0) goto L2f
            long r10 = r4.longValue()
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 >= 0) goto L2f
            goto L7b
        L2f:
            java.lang.Long r4 = r5.getMaxValue()
            if (r4 == 0) goto L3e
            long r4 = r4.longValue()
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 <= 0) goto L3e
            goto L7b
        L3e:
            io.reactivex.rxjava3.internal.observers.y r4 = r2.f78001i
            if (r4 == 0) goto L45
            io.reactivex.rxjava3.internal.disposables.DisposableHelper.a(r4)
        L45:
            com.avito.android.remote.model.OwnershipCostResponse$OwnershipCostForm$DistanceInput r4 = r3.getDistanceInput()
            java.lang.Long r4 = r4.getValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.avito.android.remote.model.OwnershipCostResponse$OwnershipCostForm$RegionSelect r3 = r3.getRegionSelect()
            long r8 = r3.getValue()
            java.lang.String r3 = java.lang.String.valueOf(r8)
            com.avito.android.advert.item.ownership_cost.f r5 = r2.f77996d
            io.reactivex.rxjava3.internal.operators.observable.O r1 = r5.e(r1, r4, r3)
            com.avito.android.util.a5 r3 = r2.f77997e
            io.reactivex.rxjava3.core.H r3 = r3.e()
            io.reactivex.rxjava3.internal.operators.observable.I0 r1 = r1.j0(r3)
            com.avito.android.advert.item.ownership_cost.items.input_form.g r3 = new com.avito.android.advert.item.ownership_cost.items.input_form.g
            r3.<init>(r2, r7)
            io.reactivex.rxjava3.disposables.d r1 = r1.t0(r3)
            io.reactivex.rxjava3.internal.observers.y r1 = (io.reactivex.rxjava3.internal.observers.y) r1
            r2.f78001i = r1
            goto L8e
        L7b:
            com.avito.android.remote.model.OwnershipCostResponse$OwnershipCostForm$DistanceInput r1 = r3.getDistanceInput()
            com.avito.android.remote.model.OwnershipCostResponse$OwnershipCostForm$DistanceInput$Validation r1 = r1.getValidation()
            if (r1 == 0) goto L8a
            java.lang.String r1 = r1.getErrorText()
            goto L8b
        L8a:
            r1 = r6
        L8b:
            r7.sY(r1)
        L8e:
            com.avito.android.remote.model.OwnershipCostResponse r1 = r0.f77979f
            com.avito.android.remote.model.OwnershipCostResponse$OwnershipCostForm r1 = r1.getOwnershipCostForm()
            com.avito.android.remote.model.OwnershipCostButton r3 = r1.getCalculateButton()
            java.lang.String r3 = r3.getLabel()
            boolean r4 = r0.f77978e
            if (r4 == 0) goto La3
            com.avito.android.advert_core.analytics.ownership_cost.OwnershipCostEventBlockType r4 = com.avito.android.advert_core.analytics.ownership_cost.OwnershipCostEventBlockType.f82834d
            goto La5
        La3:
            com.avito.android.advert_core.analytics.ownership_cost.OwnershipCostEventBlockType r4 = com.avito.android.advert_core.analytics.ownership_cost.OwnershipCostEventBlockType.f82833c
        La5:
            com.avito.android.remote.model.OwnershipCostResponse$OwnershipCostForm$RegionSelect r5 = r1.getRegionSelect()
            long r7 = r5.getValue()
            java.lang.String r5 = java.lang.String.valueOf(r7)
            kotlin.Q r7 = new kotlin.Q
            java.lang.String r8 = "Region"
            r7.<init>(r8, r5)
            com.avito.android.remote.model.OwnershipCostResponse$OwnershipCostForm$DistanceInput r1 = r1.getDistanceInput()
            java.lang.Long r1 = r1.getValue()
            if (r1 == 0) goto Lc6
            java.lang.String r6 = r1.toString()
        Lc6:
            kotlin.Q r1 = new kotlin.Q
            java.lang.String r5 = "mileage"
            r1.<init>(r5, r6)
            kotlin.Q[] r1 = new kotlin.Q[]{r7, r1}
            java.util.Map r1 = kotlin.collections.P0.g(r1)
            java.util.LinkedHashMap r1 = com.avito.android.util.C35755b0.c(r1)
            com.avito.android.advert_core.analytics.a r5 = r2.f77998f
            java.lang.String r0 = r0.f77977d
            r5.x1(r0, r4, r3, r1)
            k6.a$b r0 = k6.AbstractC42523a.b.f406093b
            k6.b r1 = r2.f77999g
            r1.a(r0)
            kotlin.G0 r0 = kotlin.G0.f406611a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.ownership_cost.items.input_form.b.invoke():java.lang.Object");
    }
}
