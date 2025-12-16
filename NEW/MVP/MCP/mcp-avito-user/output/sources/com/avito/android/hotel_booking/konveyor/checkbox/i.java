package com.avito.android.hotel_booking.konveyor.checkbox;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormCheckboxView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/checkbox/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_booking/konveyor/checkbox/h;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckbox f163644b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f163645c;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.checkbox);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCheckbox");
        }
        ListItemCheckbox listItemCheckbox = (ListItemCheckbox) viewFindViewById;
        this.f163644b = listItemCheckbox;
        listItemCheckbox.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 22));
    }

    @Override // com.avito.android.hotel_booking.konveyor.checkbox.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f163645c = aVar;
    }

    @Override // com.avito.android.hotel_booking.konveyor.checkbox.h
    public final void f(@l String str) {
        this.f163644b.setSubtitle(str);
    }

    @Override // com.avito.android.hotel_booking.konveyor.checkbox.h
    public final void setChecked(boolean z12) {
        this.f163644b.setChecked(z12);
    }

    @Override // com.avito.android.hotel_booking.konveyor.checkbox.h
    public final void setEnabled(boolean z12) {
        this.f163644b.setEnabled(z12);
    }

    @Override // com.avito.android.hotel_booking.konveyor.checkbox.h
    public final void setTitle(@l String str) {
        this.f163644b.setTitle(str);
    }
}
