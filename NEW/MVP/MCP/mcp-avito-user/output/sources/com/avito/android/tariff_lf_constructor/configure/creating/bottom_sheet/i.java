package com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_lf_constructor.configure.creating.standard.ConstructorTariffActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import iD0.InterfaceC41271a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConstructorTariffIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/creating/bottom_sheet/i;", "LiD0/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements InterfaceC41271a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f299575a;

    @Inject
    public i(@Y61.k Context context) {
        this.f299575a = context;
    }

    @Override // iD0.InterfaceC41271a
    @Y61.k
    public final Intent a(@Y61.k DeepLink deepLink) {
        return new Intent(this.f299575a, (Class<?>) ConstructorTariffBottomSheetActivity.class).putExtra(Constants.DEEPLINK, deepLink);
    }

    @Override // iD0.InterfaceC41271a
    @Y61.k
    public final Intent b(@Y61.k DeepLink deepLink) {
        return new Intent(this.f299575a, (Class<?>) ConstructorTariffActivity.class).putExtra(Constants.DEEPLINK, deepLink);
    }
}
