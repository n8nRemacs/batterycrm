package com.avito.android.advert.item.amenities.screen.items.amenity_row;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AmenityRowPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/amenities/screen/items/amenity_row/c;", "LTV0/d;", "Lcom/avito/android/advert/item/amenities/screen/items/amenity_row/e;", "Lcom/avito/android/advert/item/amenities/screen/items/amenity_row/AmenityRowItem;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.d<e, AmenityRowItem> {
    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        PrintableText printableTextF;
        e eVar2 = (e) eVar;
        AmenityRowItem amenityRowItem = (AmenityRowItem) aVar;
        String str = amenityRowItem.f72770c;
        eVar2.O4(str != null ? com.avito.android.lib.util.f.m(str) : null);
        String str2 = amenityRowItem.f72772e;
        boolean z12 = str2 == null || str2.length() == 0;
        String str3 = amenityRowItem.f72771d;
        if (z12) {
            printableTextF = com.avito.android.printable_text.b.f(str3 != null ? str3 : "");
        } else {
            if (str3 == null) {
                str3 = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            printableTextF = com.avito.android.printable_text.b.c(R.string.advert_details_amenity_row_title, str3, str2);
        }
        eVar2.y(printableTextF);
    }
}
