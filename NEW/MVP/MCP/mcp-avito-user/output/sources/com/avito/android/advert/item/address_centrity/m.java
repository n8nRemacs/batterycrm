package com.avito.android.advert.item.address_centrity;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAddressCentrityResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/address_centrity/m;", "Lcom/avito/android/advert/item/address_centrity/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f72663a;

    @Inject
    public m(@Y61.k Resources resources) {
        this.f72663a = resources;
    }

    @Override // com.avito.android.advert.item.address_centrity.l
    @Y61.k
    public final String a() {
        return this.f72663a.getString(R.string.advert_details_address_centrity_toast_pattern_success_added_default_address);
    }

    @Override // com.avito.android.advert.item.address_centrity.l
    @Y61.k
    public final String b(@Y61.k String str) {
        return this.f72663a.getString(R.string.advert_details_address_centrity_toast_pattern_success_added_address, str);
    }
}
