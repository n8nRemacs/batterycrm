package com.avito.android.leasing_calculator;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.LeasingApplicationCreationResponse;
import com.avito.android.remote.model.LeasingApplicationRequest;
import com.avito.android.remote.model.LeasingCalculator;
import com.avito.android.remote.model.LeasingOffersResponse;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LeasingCalculatorRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leasing_calculator/n;", "Lcom/avito/android/leasing_calculator/m;", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f175115a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Resources f175116b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f175117c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public String f175118d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public String f175119e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public LeasingCalculator f175120f;

    /* compiled from: LeasingCalculatorRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/LeasingOffersResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            LeasingCalculator leasingCalculator;
            P2 p22 = (P2) obj;
            if (!(p22 instanceof P2.b) || (leasingCalculator = n.this.f175120f) == null) {
                return;
            }
            T t12 = ((P2.b) p22).f318720a;
            LeasingOffersResponse.Ok ok2 = t12 instanceof LeasingOffersResponse.Ok ? (LeasingOffersResponse.Ok) t12 : null;
            leasingCalculator.setOffers(ok2 != null ? ok2.getOffers() : null);
        }
    }

    @Inject
    public n(@Y61.k i iVar, @Y61.k Resources resources) {
        this.f175115a = iVar;
        this.f175116b = resources;
    }

    @Override // com.avito.android.leasing_calculator.m
    public final void a(@Y61.l String str) {
        this.f175118d = str;
    }

    @Override // com.avito.android.leasing_calculator.m
    @Y61.k
    public final z<P2<LeasingApplicationCreationResponse>> b(@Y61.k String str, @Y61.k LeasingApplicationRequest leasingApplicationRequest) {
        return this.f175115a.b(str, leasingApplicationRequest);
    }

    @Override // com.avito.android.leasing_calculator.m
    public final void c(@Y61.l String str) {
        this.f175117c = str;
    }

    @Override // com.avito.android.leasing_calculator.m
    public final void d(@Y61.l LeasingCalculator leasingCalculator) {
        this.f175120f = leasingCalculator;
    }

    @Override // com.avito.android.leasing_calculator.m
    @Y61.k
    public final z<P2<LeasingOffersResponse>> e() {
        LeasingCalculator.LeasingInputTerm period;
        LeasingCalculator.LeasingInputTerm downPayment;
        String str = this.f175117c;
        LeasingCalculator leasingCalculator = this.f175120f;
        Long value = null;
        Long value2 = (leasingCalculator == null || (downPayment = leasingCalculator.getDownPayment()) == null) ? null : downPayment.getValue();
        LeasingCalculator leasingCalculator2 = this.f175120f;
        if (leasingCalculator2 != null && (period = leasingCalculator2.getPeriod()) != null) {
            value = period.getValue();
        }
        return (str == null || value2 == null || value == null) ? z.c0(new P2.a(new ApiError.UnknownError(this.f175116b.getString(R.string.leasing_unknown_error), null, null, 6, null))) : this.f175115a.c(value2.longValue(), value.longValue(), str).K(new a());
    }

    @Override // com.avito.android.leasing_calculator.m
    @Y61.l
    public final Long f() {
        List<LeasingCalculator.LeasingOffer> offers;
        LeasingCalculator.LeasingOffer leasingOffer;
        LeasingCalculator.LeasingOffer.OfferPayment monthlyPayment;
        LeasingCalculator leasingCalculator = this.f175120f;
        if (leasingCalculator == null || (offers = leasingCalculator.getOffers()) == null || (leasingOffer = (LeasingCalculator.LeasingOffer) C42745f0.G(offers)) == null || (monthlyPayment = leasingOffer.getMonthlyPayment()) == null) {
            return null;
        }
        return monthlyPayment.getValue();
    }

    @Override // com.avito.android.leasing_calculator.m
    public final void g(@Y61.l String str) {
        this.f175119e = str;
    }

    @Override // com.avito.android.leasing_calculator.m
    @Y61.l
    /* renamed from: getAdvertId, reason: from getter */
    public final String getF175117c() {
        return this.f175117c;
    }

    @Override // com.avito.android.leasing_calculator.m
    @Y61.l
    /* renamed from: getCategoryId, reason: from getter */
    public final String getF175118d() {
        return this.f175118d;
    }

    @Override // com.avito.android.leasing_calculator.m
    @Y61.l
    /* renamed from: getData, reason: from getter */
    public final LeasingCalculator getF175120f() {
        return this.f175120f;
    }

    @Override // com.avito.android.leasing_calculator.m
    @Y61.l
    /* renamed from: getMicroCategoryId, reason: from getter */
    public final String getF175119e() {
        return this.f175119e;
    }
}
