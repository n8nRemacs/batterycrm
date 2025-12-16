package com.avito.android.user_advert.advert.items.multiaddresses;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.user_address.CompositeLocationTextView;
import com.avito.android.user_address_public.api.AddressComponents;
import com.avito.android.user_address_public.api.MultiAddressesItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import m.C43852a;

/* compiled from: MultiAddressItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/multiaddresses/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f309734i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f309735b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f309736c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f309737d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f309738e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f309739f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f309740g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f309741h;

    public j(@Y61.k View view) {
        super(view);
        this.f309735b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309736c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.addresses_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309737d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.location_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309738e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.location);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309739f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f309740g = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.show_all_addresses);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309741h = (TextView) viewFindViewById6;
    }

    @Override // com.avito.android.user_advert.advert.items.multiaddresses.i
    public final void Cg(@Y61.k Y41.a aVar, @Y61.k List list) {
        View view;
        LinearLayout linearLayout = this.f309740g;
        linearLayout.removeAllViews();
        Iterator it = C42745f0.E0(list, 3).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            view = this.f309735b;
            if (!zHasNext) {
                break;
            }
            MultiAddressesItem multiAddressesItem = (MultiAddressesItem) it.next();
            k kVar = new k(view.getContext(), null, 0, 0, 14, null);
            AddressComponents components = multiAddressesItem.getComponents();
            String locality = components.getLocality();
            String house = components.getHouse();
            String house2 = components.getHouse();
            if (house2 != null && !C43066x.K(house2)) {
                G0 g02 = G0.f406611a;
            }
            String deliveryInfo = multiAddressesItem.getDeliveryInfo();
            String strConcat = locality.concat(", ");
            CompositeLocationTextView compositeLocationTextView = kVar.f309743c;
            compositeLocationTextView.setFirstText(strConcat);
            if (house != null) {
                compositeLocationTextView.setSecondText(house);
            }
            I5.a(kVar.f309744d, deliveryInfo, false);
            linearLayout.addView(kVar);
        }
        if (list.size() > 3) {
            TextView textView = new TextView(view.getContext());
            textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            textView.setText("Еще " + (list.size() - 3));
            textView.setTextAppearance(C35835l0.j(R.attr.textM20, view.getContext()));
            Drawable drawableA = C43852a.a(view.getContext(), R.drawable.ic_arrow_8_16);
            Drawable drawableH = C35835l0.h(R.attr.ic_hollowPin16, view.getContext());
            textView.setPaddingRelative(0, y6.b(3), 0, y6.b(3));
            textView.setCompoundDrawablesWithIntrinsicBounds(drawableH, (Drawable) null, drawableA, (Drawable) null);
            textView.setCompoundDrawablePadding(y6.b(6));
            textView.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(17, aVar));
            linearLayout.addView(textView);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.multiaddresses.i
    public final void LY(@Y61.k String str) {
        I5.a(this.f309738e, str, false);
    }

    @Override // com.avito.android.user_advert.advert.items.multiaddresses.i
    public final void Nn(@Y61.k String str) {
        I5.a(this.f309739f, str, false);
    }

    @Override // com.avito.android.user_advert.advert.items.multiaddresses.i
    public final void b(@Y61.k String str) {
        I5.a(this.f309736c, str, false);
    }

    @Override // com.avito.android.user_advert.advert.items.multiaddresses.i
    public final void bp(@Y61.k String str) {
        I5.a(this.f309737d, str, false);
    }

    @Override // com.avito.android.user_advert.advert.items.multiaddresses.i
    public final void dk(@Y61.k Y41.a<G0> aVar) {
        this.f309741h.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(18, aVar));
    }
}
