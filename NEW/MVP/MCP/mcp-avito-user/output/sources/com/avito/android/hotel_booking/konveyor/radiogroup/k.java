package com.avito.android.hotel_booking.konveyor.radiogroup;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.hotel.model.HotelBookingRadioGroupItem;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: BookingFormRadioOptionView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/radiogroup/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_booking/konveyor/radiogroup/j;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f163746b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f163747c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f163748d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f163749e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f163750f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Checkmark f163751g;

    public k(@Y61.k View view) {
        super(view);
        this.f163746b = view;
        this.f163747c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f163748d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f163749e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f163750f = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.checkmark);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkmark");
        }
        this.f163751g = (Checkmark) viewFindViewById4;
    }

    @Override // com.avito.android.hotel_booking.konveyor.radiogroup.j
    public final void DL(@Y61.l HotelBookingRadioGroupItem.OptionIcon optionIcon) {
        String name;
        int i12 = optionIcon != null ? 0 : 8;
        ImageView imageView = this.f163750f;
        imageView.setVisibility(i12);
        Integer numA = (optionIcon == null || (name = optionIcon.getName()) == null) ? null : q.a(name);
        UniversalColor color = optionIcon != null ? optionIcon.getColor() : null;
        Context context = this.f163747c;
        imageView.setImageDrawable(numA != null ? C35835l0.n(context, numA.intValue(), C48065c.d(context, color, R.attr.black)) : null);
    }

    @Override // com.avito.android.hotel_booking.konveyor.radiogroup.j
    public final void Un(@Y61.l AttributedText attributedText, boolean z12) {
        TextView textView = this.f163748d;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        if (z12) {
            CharSequence text = textView.getText();
            if (attributedText == null) {
                text = null;
            }
            if (text == null) {
                text = "";
            }
            String str = attributedText != null ? "  " : null;
            String str2 = str == null ? "" : str;
            Context context = this.f163747c;
            com.avito.android.lib.design.badge.e.a(textView, text, context.getString(R.string.hotel_booking_new_badge_text), str2, com.avito.android.lib.util.f.a(context, "textRedXS"), null, null);
        }
    }

    @Override // com.avito.android.hotel_booking.konveyor.radiogroup.j
    public final void aI(@Y61.k Y41.a<G0> aVar) {
        D6.a(aVar, this.f163746b);
    }

    @Override // com.avito.android.hotel_booking.konveyor.radiogroup.j
    public final void q(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f163749e, attributedText, null);
    }

    @Override // com.avito.android.hotel_booking.konveyor.radiogroup.j
    public final void setSelected(boolean z12) {
        this.f163751g.setChecked(z12);
    }
}
