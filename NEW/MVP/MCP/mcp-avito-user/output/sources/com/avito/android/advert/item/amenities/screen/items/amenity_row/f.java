package com.avito.android.advert.item.amenities.screen.items.amenity_row;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AmenityRowView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/amenities/screen/items/amenity_row/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/amenities/screen/items/amenity_row/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f72778b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f72779c;

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f72778b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f72779c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.advert.item.amenities.screen.items.amenity_row.e
    public final void O4(@l Integer num) {
        FV.a.a(FV.a.f4720a, this.f72778b, num);
    }

    @Override // com.avito.android.advert.item.amenities.screen.items.amenity_row.e
    public final void y(@k PrintableText printableText) {
        TextView textView = this.f72779c;
        textView.setText(printableText.k0(textView.getContext()));
    }
}
