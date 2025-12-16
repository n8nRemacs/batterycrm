package com.avito.android.user_advert.soa_with_price;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SoaWithPriceResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/l;", "Lcom/avito/android/user_advert/soa_with_price/k;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f311935a;

    @Inject
    public l(@Y61.k Resources resources) {
        this.f311935a = resources.getString(R.string.choose_reason_sheet_title);
    }

    @Override // com.avito.android.user_advert.soa_with_price.k
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF311935a() {
        return this.f311935a;
    }
}
