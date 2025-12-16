package com.avito.android.advert_amenities.amenity;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AmenityView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_amenities/amenity/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_amenities/amenity/i;", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f81143b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f81144c;

    public m(@Y61.k View view) {
        super(view);
        this.f81143b = (TextView) view.findViewById(R.id.icon);
        this.f81144c = (TextView) view.findViewById(R.id.text);
    }

    @Override // com.avito.android.advert_amenities.amenity.i
    public final void O4(@Y61.l Integer num) {
        FV.a.a(FV.a.f4720a, this.f81143b, num);
    }

    @Override // com.avito.android.advert_amenities.amenity.i
    public final void r(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f81144c, attributedText, null);
    }
}
