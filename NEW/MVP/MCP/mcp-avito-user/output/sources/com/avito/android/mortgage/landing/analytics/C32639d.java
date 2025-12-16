package com.avito.android.mortgage.landing.analytics;

import com.avito.android.mortgage.api.model.OfferBadge;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LandingAnalyticsHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/mortgage/api/model/OfferBadge;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage.landing.analytics.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32639d extends N implements Y41.l<OfferBadge, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final C32639d f199520l = new C32639d();

    public C32639d() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(OfferBadge offerBadge) {
        return offerBadge.getText();
    }
}
