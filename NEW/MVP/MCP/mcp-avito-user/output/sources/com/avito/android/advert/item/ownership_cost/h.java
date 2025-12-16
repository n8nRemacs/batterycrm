package com.avito.android.advert.item.ownership_cost;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.OwnershipCostResponse;
import io.reactivex.rxjava3.internal.operators.observable.O;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OwnershipCostRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/h;", "Lcom/avito/android/advert/item/ownership_cost/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f77944a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public OwnershipCostResponse f77945b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f77946c;

    @Inject
    public h(@k a aVar) {
        this.f77944a = aVar;
    }

    @Override // com.avito.android.advert.item.ownership_cost.f
    @l
    /* renamed from: a, reason: from getter */
    public final OwnershipCostResponse getF77945b() {
        return this.f77945b;
    }

    @Override // com.avito.android.advert.item.ownership_cost.f
    public final void c(@l String str) {
        this.f77946c = str;
    }

    @Override // com.avito.android.advert.item.ownership_cost.f
    public final boolean d(@k AdvertDetails advertDetails) {
        return L.f(advertDetails.getCategoryId(), "9") && this.f77945b == null;
    }

    @Override // com.avito.android.advert.item.ownership_cost.f
    @k
    public final O e(@k String str, @l String str2, @l String str3) {
        return this.f77944a.a(str, str2, str3).K(new g(this));
    }

    @Override // com.avito.android.advert.item.ownership_cost.f
    public final void f(@l OwnershipCostResponse ownershipCostResponse) {
        this.f77945b = ownershipCostResponse;
    }

    @Override // com.avito.android.advert.item.ownership_cost.f
    @l
    /* renamed from: getAdvertId, reason: from getter */
    public final String getF77946c() {
        return this.f77946c;
    }
}
