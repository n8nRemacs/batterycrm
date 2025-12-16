package com.avito.android.advert.item.amenities;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.hotel.model.Amenities;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAmenitiesView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/amenities/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/amenities/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f72761e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f72762b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f72763c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f72764d;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.header);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f72762b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.expand_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f72763c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.amenities);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f72764d = (LinearLayout) viewFindViewById3;
    }

    @Override // com.avito.android.advert.item.amenities.g
    public final void HD(@k PrintableText printableText) {
        TextView textView = this.f72763c;
        textView.setText(printableText.k0(textView.getContext()));
    }

    @Override // com.avito.android.advert.item.amenities.g
    public final void b(@l String str) {
        I5.a(this.f72762b, str, false);
    }

    @Override // com.avito.android.advert.item.amenities.g
    public final void dN(boolean z12) {
        this.f72763c.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.advert.item.amenities.g
    public final void qn(@k Y41.a<G0> aVar) {
        this.f72763c.setOnClickListener(new n(4, aVar));
    }

    @Override // com.avito.android.advert.item.amenities.g
    public final void s1(@l List<Amenities.Amenity> list) {
        Integer numM;
        int i12 = O2.a(list) ? 0 : 8;
        LinearLayout linearLayout = this.f72764d;
        linearLayout.setVisibility(i12);
        linearLayout.removeAllViews();
        if (list != null) {
            for (Amenities.Amenity amenity : list) {
                View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.advert_details_amenity_item, (ViewGroup) null);
                View viewFindViewById = viewInflate.findViewById(R.id.icon);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById;
                View viewFindViewById2 = viewInflate.findViewById(R.id.title);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView2 = (TextView) viewFindViewById2;
                String icon = amenity.getIcon();
                int iIntValue = (icon == null || (numM = com.avito.android.lib.util.f.m(icon)) == null) ? R.attr.textIconDone : numM.intValue();
                String price = amenity.getPrice();
                String title = (price == null || price.length() == 0) ? amenity.getTitle() : textView2.getResources().getString(R.string.advert_details_amenity_row_title, amenity.getTitle(), amenity.getPrice());
                FV.a.a(FV.a.f4720a, textView, Integer.valueOf(iIntValue));
                I5.a(textView2, title, false);
                linearLayout.addView(viewInflate);
            }
        }
    }
}
