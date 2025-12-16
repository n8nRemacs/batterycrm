package com.avito.android.hotel_available_rooms.konveyor.filter;

import Y61.k;
import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/filter/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_available_rooms/konveyor/filter/g;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f162923b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f162924c;

    public h(@k View view, @k Resources resources) {
        super(view);
        this.f162923b = resources;
        View viewFindViewById = view.findViewById(R.id.filter);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f162924c = (Button) viewFindViewById;
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.filter.g
    public final void a(@k Y41.a<G0> aVar) {
        D6.a(aVar, this.f162924c);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.filter.g
    public final void y(@k PrintableText printableText) {
        this.f162924c.setText(com.avito.android.printable_text.b.g(printableText, this.f162923b));
    }
}
