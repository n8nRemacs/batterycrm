package com.avito.android.advert_details_items.sellerprofile;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerTypeOnboardingInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/Y;", "Lcom/avito/android/advert_details_items/sellerprofile/X;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Y implements X {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.f f85599a;

    @Inject
    public Y(@Y61.k com.avito.android.onboarding_manager.f fVar) {
        this.f85599a = fVar;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.X
    public final boolean a(@Y61.k String str) {
        return !this.f85599a.b(str);
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.X
    public final void b(@Y61.k String str) {
        this.f85599a.e(str);
    }
}
