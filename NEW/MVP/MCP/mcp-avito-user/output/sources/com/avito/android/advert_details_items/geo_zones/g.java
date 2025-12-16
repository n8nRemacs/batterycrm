package com.avito.android.advert_details_items.geo_zones;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsGeoZonesItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/geo_zones/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/geo_zones/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f84800b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.geo_zones_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84800b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.advert_details_items.geo_zones.f
    public final void Z4(@k String str) {
        I5.a(this.f84800b, str, false);
    }
}
