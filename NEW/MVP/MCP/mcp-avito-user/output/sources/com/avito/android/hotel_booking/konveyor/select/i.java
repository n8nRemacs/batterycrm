package com.avito.android.hotel_booking.konveyor.select;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormSelectView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/select/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_booking/konveyor/select/h;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Input f163772b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ComponentContainer f163773c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f163774d;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.select);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        this.f163772b = input;
        View viewFindViewById2 = view.findViewById(R.id.select_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f163773c = (ComponentContainer) viewFindViewById2;
        input.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 23));
    }

    @Override // com.avito.android.hotel_booking.konveyor.select.h
    public final void G() {
        ComponentContainer componentContainer = this.f163773c;
        componentContainer.q(componentContainer.f178848i);
    }

    @Override // com.avito.android.hotel_booking.konveyor.select.h
    public final void G1(@k PrintableText printableText) {
        ComponentContainer componentContainer = this.f163773c;
        ComponentContainer.n(componentContainer, printableText.k0(componentContainer.getContext()), 2);
    }

    @Override // com.avito.android.hotel_booking.konveyor.select.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f163774d = aVar;
    }

    @Override // com.avito.android.hotel_booking.konveyor.select.h
    public final void setEnabled(boolean z12) {
        this.f163772b.setEnabled(z12);
    }

    @Override // com.avito.android.hotel_booking.konveyor.select.h
    public final void setHint(@l String str) {
        this.f163772b.setHint(str);
    }

    @Override // com.avito.android.hotel_booking.konveyor.select.h
    public final void setText(@l String str) {
        Input.t(this.f163772b, str, false, 6);
    }
}
