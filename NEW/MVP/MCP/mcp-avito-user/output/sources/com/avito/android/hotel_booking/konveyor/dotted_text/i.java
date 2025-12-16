package com.avito.android.hotel_booking.konveyor.dotted_text;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormDottedTextView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/dotted_text/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_booking/konveyor/dotted_text/h;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f163663b;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.dotted_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f163663b = (DescriptionParameterItem) viewFindViewById;
    }

    @Override // com.avito.android.hotel_booking.konveyor.dotted_text.h
    public final void D9(@l AttributedText attributedText) {
        j.a(this.f163663b.getLeftTextView(), attributedText, null);
    }

    @Override // com.avito.android.hotel_booking.konveyor.dotted_text.h
    public final void ed(@l AttributedText attributedText) {
        j.a(this.f163663b.getRightTextView(), attributedText, null);
    }
}
