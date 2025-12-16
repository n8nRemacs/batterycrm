package com.avito.android.credits.models;

import Y61.k;
import Y61.l;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import com.avito.android.remote.model.credit_broker.InstallmentsProduct;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: InstallmentsCalculator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/models/c;", "Lcom/avito/android/credits/models/CreditCalculator;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends CreditCalculator {

    /* renamed from: A, reason: collision with root package name */
    @l
    public final DeepLink f128988A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final EntryPoint f128989B;

    /* renamed from: C, reason: collision with root package name */
    @k
    public final String f128990C;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(@k InstallmentsProduct installmentsProduct) {
        String title = installmentsProduct.getTitle();
        String str = title == null ? "" : title;
        String subtitle = installmentsProduct.getSubtitle();
        AttributedText attributedSubtitle = installmentsProduct.getAttributedSubtitle();
        String buttonTitle = installmentsProduct.getButtonTitle();
        super(str, attributedSubtitle, subtitle, buttonTitle == null ? "" : buttonTitle, installmentsProduct.getButtonStyle(), installmentsProduct.getAgreementInfo(), CreditCalculator.Type.f128979d, 0, 0.0f, 0, 0, 0, null, null, false, 0, 0, 0, null, 524160, null);
        this.f128988A = installmentsProduct.getDeepLink();
        this.f128989B = installmentsProduct.getEntryPoint();
        String analyticsSlug = installmentsProduct.getAnalyticsSlug();
        this.f128990C = analyticsSlug == null ? AdvertDetailsBlockIdKt.BLOCK_ID_CREDIT_CALCULATOR : analyticsSlug;
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @k
    /* renamed from: d, reason: from getter */
    public final String getF129007C() {
        return this.f128990C;
    }

    @Override // com.avito.android.credits.models.CreditCalculator
    @l
    /* renamed from: e, reason: from getter */
    public final EntryPoint getF129006B() {
        return this.f128989B;
    }
}
