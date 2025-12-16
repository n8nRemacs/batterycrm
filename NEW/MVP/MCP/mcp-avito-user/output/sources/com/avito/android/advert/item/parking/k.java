package com.avito.android.advert.item.parking;

import Y41.l;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import os0.C44934b;

/* compiled from: AdvertDetailsParkingAddressView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/parking/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/parking/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f78171g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f78172b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Chips f78173c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f78174d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f78175e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f78176f;

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.parking_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78172b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.parking_chips_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f78173c = (Chips) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.parking_address);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78174d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.parking_geo_ref_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f78175e = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.show_on_map_parking_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78176f = (TextView) viewFindViewById5;
    }

    @Override // com.avito.android.advert.item.parking.g
    public final void KM(@Y61.k String str, @Y61.k Y41.a<G0> aVar, @Y61.k l<? super String, G0> lVar) {
        TextView textView = this.f78174d;
        textView.setText(str);
        textView.setOnClickListener(new h(0, aVar));
        textView.setOnLongClickListener(new i(0, lVar, this));
    }

    @Override // com.avito.android.advert.item.parking.g
    public final void L00(@Y61.k String str) {
        this.f78172b.setText(str);
    }

    @Override // com.avito.android.advert.item.parking.g
    public final void LE(@Y61.k l lVar, @Y61.l ArrayList arrayList) {
        boolean z12 = arrayList != null;
        Chips chips = this.f78173c;
        D6.G(chips, z12);
        if (arrayList != null) {
            chips.setData(arrayList);
            chips.p(0, false);
        }
        chips.setChipsSelectedListener(new j(lVar));
    }

    @Override // com.avito.android.advert.item.parking.g
    public final void fO(@Y61.k Y41.a aVar, @Y61.l List list) {
        LinearLayout linearLayout = this.f78175e;
        linearLayout.removeAllViews();
        if (!O2.a(list)) {
            D6.w(linearLayout);
            return;
        }
        linearLayout.setOnClickListener(new h(2, aVar));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GeoReference geoReference = (GeoReference) it.next();
                LinearLayout linearLayout2 = new LinearLayout(this.itemView.getContext());
                linearLayout2.setOrientation(0);
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.addView(linearLayout2);
                new C44934b(linearLayout2).b(geoReference);
            }
        }
        D6.H(linearLayout);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f78173c.setOnClickListener(null);
        TextView textView = this.f78174d;
        textView.setOnClickListener(null);
        textView.setOnClickListener(null);
        this.f78175e.setOnClickListener(null);
        this.f78176f.setOnClickListener(null);
    }

    @Override // com.avito.android.advert.item.parking.g
    public final void mN(@Y61.l String str, @Y61.k Y41.a<G0> aVar) {
        TextView textView = this.f78176f;
        I5.a(textView, str, false);
        textView.setOnClickListener(new h(1, aVar));
    }
}
