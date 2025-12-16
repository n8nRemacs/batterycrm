package com.avito.android.suggest_addresses.presentation;

import android.app.Application;
import android.content.Intent;
import com.avito.android.suggest_addresses.SuggestAddressesActivity;
import com.avito.android.suggest_addresses.entity.SuggestAddressesParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuggestAddressesIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/presentation/c;", "Lcom/avito/android/suggest_addresses/g;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.suggest_addresses.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f291966a;

    @Inject
    public c(@Y61.k Application application) {
        this.f291966a = application;
    }

    @Override // com.avito.android.suggest_addresses.g
    @Y61.k
    public final Intent a(@Y61.k SuggestAddressesParams suggestAddressesParams) {
        SuggestAddressesActivity.f291781m.getClass();
        Intent intent = new Intent(this.f291966a, (Class<?>) SuggestAddressesActivity.class);
        intent.putExtra("new_addresses_arguments", suggestAddressesParams);
        return intent;
    }
}
