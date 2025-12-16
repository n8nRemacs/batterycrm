package com.avito.android.tariff.detailssheet;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffDetailsSheetIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/detailssheet/g;", "Lcom/avito/android/tariff/detailssheet/f;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f297423a;

    @Inject
    public g(@Y61.k Context context) {
        this.f297423a = context;
    }

    @Override // com.avito.android.tariff.detailssheet.f
    @Y61.k
    public final Intent a(@Y61.k DeepLink deepLink) {
        return new Intent(this.f297423a, (Class<?>) TariffDetailsSheetActivity.class).putExtra(Constants.DEEPLINK, deepLink);
    }
}
