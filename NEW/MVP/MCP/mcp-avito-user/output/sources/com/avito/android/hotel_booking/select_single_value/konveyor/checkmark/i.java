package com.avito.android.hotel_booking.select_single_value.konveyor.checkmark;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckmarkView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/select_single_value/konveyor/checkmark/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_booking/select_single_value/konveyor/checkmark/h;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckmark f164093b;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.checkmark);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCheckmark");
        }
        this.f164093b = (ListItemCheckmark) viewFindViewById;
    }

    @Override // com.avito.android.hotel_booking.select_single_value.konveyor.checkmark.h
    public final void a(@l Y41.a<G0> aVar) {
        D6.a(aVar, this.f164093b);
    }

    @Override // com.avito.android.hotel_booking.select_single_value.konveyor.checkmark.h
    public final void f(@l String str) {
        this.f164093b.setSubtitle(str);
    }

    @Override // com.avito.android.hotel_booking.select_single_value.konveyor.checkmark.h
    public final void setChecked(boolean z12) {
        this.f164093b.setChecked(z12);
    }

    @Override // com.avito.android.hotel_booking.select_single_value.konveyor.checkmark.h
    public final void setTitle(@l String str) {
        this.f164093b.setTitle(str);
    }
}
