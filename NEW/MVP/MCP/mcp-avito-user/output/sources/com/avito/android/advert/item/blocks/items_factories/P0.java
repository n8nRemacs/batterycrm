package com.avito.android.advert.item.blocks.items_factories;

import android.text.SpannableString;
import com.avito.android.advert.item.description_header.AdvertDetailsDescriptionHeaderItem;
import com.avito.android.advert_details_items.description.AdvertDetailsDescriptionItem;
import com.avito.android.html_formatter.HtmlCharSequence;
import j.InterfaceC42150f;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDescriptionItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/P0;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.J0 f73827a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73828b;

    @Inject
    public P0(@Y61.k com.avito.android.J0 j02, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73827a = j02;
        this.f73828b = jVar;
    }

    @Y61.k
    public final AdvertDetailsDescriptionHeaderItem a(@Y61.l Integer num, @InterfaceC42150f @Y61.l Integer num2, @j.f0 @Y61.l Integer num3, @Y61.k String str) {
        return new AdvertDetailsDescriptionHeaderItem(this.f73827a.a(), null, str, num, num2, num3, this.f73828b.a(), null, null, 386, null);
    }

    @Y61.l
    public final AdvertDetailsDescriptionItem b(@Y61.l String str, @Y61.l HtmlCharSequence htmlCharSequence, boolean z12, boolean z13, boolean z14, boolean z15, @Y61.l Integer num, boolean z16) {
        HtmlCharSequence htmlCharSequence2;
        HtmlCharSequence htmlCharSequence3 = htmlCharSequence;
        if (str == null || str.length() == 0) {
            String string = htmlCharSequence3 != null ? htmlCharSequence3.f164164b.toString() : null;
            if (string == null || string.length() == 0) {
                return null;
            }
        }
        if (htmlCharSequence3 != null) {
            htmlCharSequence2 = htmlCharSequence3;
        } else if (str != null) {
            htmlCharSequence3 = new HtmlCharSequence(new SpannableString(str));
            htmlCharSequence2 = htmlCharSequence3;
        } else {
            htmlCharSequence2 = null;
        }
        return new AdvertDetailsDescriptionItem(0L, null, htmlCharSequence2, false, null, num != null ? num.intValue() : 4, z12, z13, z14, z15, z16, this.f73828b.a(), null, null, 12315, null);
    }
}
