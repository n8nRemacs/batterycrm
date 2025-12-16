package com.avito.android.advert_amenities.amenity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advert_amenities.Amenities;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AmenityViewFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_amenities/amenity/k;", "Lcom/avito/android/advert_amenities/amenity/j;", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f81139a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f81140b;

    @Inject
    public k(@Y61.k f fVar, @Y61.k c cVar) {
        this.f81139a = fVar;
        this.f81140b = cVar;
    }

    @Override // com.avito.android.advert_amenities.amenity.j
    @Y61.k
    public final View a(@Y61.k Context context, @Y61.k Amenities.Amenity amenity) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.advert_amenities_public_advert_item, (ViewGroup) null);
        this.f81139a.O5(new m(viewInflate), this.f81140b.a(amenity), 0);
        return viewInflate;
    }
}
