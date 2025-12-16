package com.avito.android.hotel_available_rooms.konveyor.amenity;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomAmenityView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/amenity/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_available_rooms/konveyor/amenity/f;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f162847b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f162848c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f162849d;

    public g(@k View view) {
        super(view);
        this.f162847b = view;
        View viewFindViewById = view.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f162848c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f162849d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.amenity.f
    public final void O4(@l Integer num) {
        FV.a.a(FV.a.f4720a, this.f162848c, num);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.amenity.f
    public final void a(@l Y41.a<G0> aVar) {
        D6.a(aVar, this.f162847b);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.amenity.f
    public final void setText(@l String str) {
        this.f162849d.setText(str);
    }
}
