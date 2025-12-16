package com.avito.android.hotel_available_rooms.konveyor.booking;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.hotel_available_rooms.domain.models.HotelBookingDiscount;
import com.avito.android.hotel_available_rooms.domain.models.HotelBookingInstallments;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import sK0.C48065c;

/* compiled from: HotelRoomBookingView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/booking/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_available_rooms/konveyor/booking/g;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f162867b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f162868c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f162869d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FlexboxLayout f162870e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final StrikethroughTextView f162871f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f162872g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinearLayout f162873h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f162874i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f162875j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Button f162876k;

    /* compiled from: HotelRoomBookingView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162877a;

        static {
            int[] iArr = new int[HotelBookingInstallments.HighlightType.values().length];
            try {
                HotelBookingInstallments.HighlightType.a aVar = HotelBookingInstallments.HighlightType.f162780b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f162877a = iArr;
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.price);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f162867b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.details);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f162868c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.condition_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f162869d = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.discount_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f162870e = (FlexboxLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.original_price);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.strikethrough.StrikethroughTextView");
        }
        this.f162871f = (StrikethroughTextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.percent);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f162872g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.installments);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f162873h = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.installments_left_part);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f162874i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.installments_right_part);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f162875j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.action);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f162876k = (Button) viewFindViewById10;
    }

    public static void B80(TextView textView, HotelBookingInstallments.HighlightType highlightType) {
        int i12 = highlightType == null ? -1 : a.f162877a[highlightType.ordinal()];
        if (i12 == -1) {
            D6.f(textView, 0, 0, 0, 0, 10);
            textView.setBackground(null);
        } else {
            if (i12 != 1) {
                return;
            }
            D6.f(textView, y6.b(4), 0, y6.b(4), 0, 10);
            textView.setBackgroundResource(R.drawable.bg_offer_flag);
        }
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.booking.g
    public final void EN(int i12) throws Resources.NotFoundException {
        Button button = this.f162876k;
        button.setAppearance(C35835l0.j(i12, button.getContext()));
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.booking.g
    public final void Nc(@l AttributedText attributedText) {
        j.a(this.f162868c, attributedText, null);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.booking.g
    public final void O40(@l HotelBookingInstallments hotelBookingInstallments) {
        Integer num;
        HotelBookingInstallments.Part part;
        HotelBookingInstallments.Part part2;
        HotelBookingInstallments.Part part3;
        HotelBookingInstallments.Part part4;
        int iB2 = 0;
        this.f162873h.setVisibility(hotelBookingInstallments != null ? 0 : 8);
        HotelBookingInstallments.HighlightType highlightType = null;
        AttributedText attributedText = (hotelBookingInstallments == null || (part4 = hotelBookingInstallments.f162777c) == null) ? null : part4.f162783b;
        TextView textView = this.f162874i;
        j.a(textView, attributedText, null);
        AttributedText attributedText2 = (hotelBookingInstallments == null || (part3 = hotelBookingInstallments.f162778d) == null) ? null : part3.f162783b;
        TextView textView2 = this.f162875j;
        j.a(textView2, attributedText2, null);
        B80(textView, (hotelBookingInstallments == null || (part2 = hotelBookingInstallments.f162777c) == null) ? null : part2.f162784c);
        if (hotelBookingInstallments != null && (part = hotelBookingInstallments.f162778d) != null) {
            highlightType = part.f162784c;
        }
        B80(textView2, highlightType);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (hotelBookingInstallments != null && (num = hotelBookingInstallments.f162779e) != null) {
            iB2 = y6.b(num.intValue());
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, iB2, marginLayoutParams.bottomMargin);
        textView.setLayoutParams(marginLayoutParams);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.booking.g
    public final void V0(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f162876k, str, false);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.booking.g
    public final void Wj(@l List<String> list) {
        LinearLayout linearLayout = this.f162869d;
        linearLayout.removeAllViews();
        if (list != null) {
            for (String str : list) {
                View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.hotel_room_text_item, (ViewGroup) null, false);
                View viewFindViewById = viewInflate.findViewById(R.id.title);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById;
                textView.setTextAppearance(C35835l0.j(R.attr.textM20, viewInflate.getContext()));
                textView.setText(str);
                linearLayout.addView(viewInflate);
            }
        }
        linearLayout.setVisibility(O2.a(list) ? 0 : 8);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.booking.g
    public final void Y(@k Y41.a<G0> aVar) {
        D6.a(aVar, this.f162876k);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.booking.g
    public final void dd(@l AttributedText attributedText) {
        j.a(this.f162867b, attributedText, null);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.booking.g
    public final void h4(@l Y41.a<G0> aVar) {
        D6.a(aVar, this.f162873h);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.booking.g
    public final void mu(@l HotelBookingDiscount hotelBookingDiscount) {
        CharSequence text;
        AttributedText attributedText = hotelBookingDiscount != null ? hotelBookingDiscount.f162773b : null;
        StrikethroughTextView strikethroughTextView = this.f162871f;
        j.a(strikethroughTextView, attributedText, null);
        AttributedText attributedText2 = hotelBookingDiscount != null ? hotelBookingDiscount.f162774c : null;
        TextView textView = this.f162872g;
        j.a(textView, attributedText2, null);
        com.akita.view.foundation.util.e.a(this.f162871f, null, null, Integer.valueOf(y6.b((hotelBookingDiscount != null ? hotelBookingDiscount.f162775d : null) != null ? 5 : 2)), null, 11);
        textView.setBackgroundTintList(ColorStateList.valueOf(C48065c.g(hotelBookingDiscount != null ? hotelBookingDiscount.f162775d : null, textView.getContext(), "transparentWhite")));
        this.f162870e.setVisibility((hotelBookingDiscount == null || (text = strikethroughTextView.getText()) == null || C43066x.K(text)) ? 8 : 0);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.booking.g
    public final void oB(boolean z12) {
        this.f162876k.setEnabled(z12);
    }
}
