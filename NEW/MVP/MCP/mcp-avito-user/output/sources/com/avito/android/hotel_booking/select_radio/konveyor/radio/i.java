package com.avito.android.hotel_booking.select_radio.konveyor.radio;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.hotel_booking.Insight;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectRadioView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/konveyor/radio/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_booking/select_radio/konveyor/radio/h;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f164015b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RadioButton f164016c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f164017d;

    public i(@k View view) {
        super(view);
        this.f164015b = view;
        View viewFindViewById = view.findViewById(R.id.radio);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.RadioButton");
        }
        this.f164016c = (RadioButton) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.insights);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f164017d = (LinearLayout) viewFindViewById2;
    }

    @Override // com.avito.android.hotel_booking.select_radio.konveyor.radio.h
    public final void a(@k Y41.a<G0> aVar) {
        D6.a(aVar, this.f164015b);
    }

    @Override // com.avito.android.hotel_booking.select_radio.konveyor.radio.h
    public final void fp(@k Insight insight) {
        View viewInflate = LayoutInflater.from(this.f164015b.getContext()).inflate(R.layout.select_radio_insight, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(R.id.icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById2;
        FV.a aVar = FV.a.f4720a;
        String iconName = insight.getIconName();
        FV.a.a(aVar, textView, iconName != null ? com.avito.android.lib.util.f.m(iconName) : null);
        I5.a(textView2, insight.getText(), false);
        this.f164017d.addView(viewInflate);
    }

    @Override // com.avito.android.hotel_booking.select_radio.konveyor.radio.h
    public final void setSelected(boolean z12) {
        this.f164016c.setChecked(z12);
        this.f164015b.setBackgroundResource(z12 ? R.drawable.bg_selected_radio : R.drawable.bg_unselected_radio);
    }

    @Override // com.avito.android.hotel_booking.select_radio.konveyor.radio.h
    public final void uU() {
        this.f164017d.removeAllViews();
    }
}
