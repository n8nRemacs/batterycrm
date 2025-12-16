package com.avito.android.serp.adapter.suggest_address;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AddAddressAddress;
import com.avito.android.remote.model.AddAddressSuggest;
import kotlin.Metadata;

/* compiled from: SerpAddAddressSuggsetConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/suggest_address/t;", "Lcom/avito/android/serp/adapter/suggest_address/s;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements s {
    @Override // com.avito.android.serp.adapter.suggest_address.s
    @Y61.k
    public final AddAddressSuggestItem a(@Y61.k AddAddressSuggest addAddressSuggest) {
        String text;
        AddAddressAddress address = addAddressSuggest.getTitle().getAddress();
        if (address == null) {
            text = addAddressSuggest.getTitle().getText();
            if (text == null) {
                text = "";
            }
        } else {
            text = address.getLocality() + ' ' + address.getHouse();
        }
        return new AddAddressSuggestItem(addAddressSuggest.getCid(), addAddressSuggest.getMcid(), addAddressSuggest.getLid(), text, addAddressSuggest.getText(), new Action(addAddressSuggest.getAction().getText(), addAddressSuggest.getAction().getUri(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null), String.valueOf(addAddressSuggest.getCid()), 6, addAddressSuggest.getAnalytics(), addAddressSuggest.getSettings());
    }
}
