package com.avito.android.hotel_booking.enter_data.konveyor.text;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EnterDataTextView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/konveyor/text/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_booking/enter_data/konveyor/text/f;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f163540b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f163540b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.hotel_booking.enter_data.konveyor.text.f
    public final void setText(@k String str) {
        this.f163540b.setText(str);
    }
}
