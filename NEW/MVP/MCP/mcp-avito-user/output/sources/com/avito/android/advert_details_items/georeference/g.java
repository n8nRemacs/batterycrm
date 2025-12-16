package com.avito.android.advert_details_items.georeference;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details_items.georeference.c;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import os0.C44933a;
import os0.C44934b;

/* compiled from: AdvertDetailsGeoReferenceView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/georeference/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/georeference/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f84821e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f84822b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84823c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f84824d;

    public g(@k View view, boolean z12) {
        super(view);
        this.f84822b = view;
        this.f84823c = z12;
        this.f84824d = (LinearLayout) view.findViewById(R.id.advert_details_geo_ref_container);
    }

    @Override // com.avito.android.advert_details_items.georeference.f
    public final void cz(@k AdvertDetailsGeoReferenceItem advertDetailsGeoReferenceItem, @k c.a aVar) {
        LinearLayout linearLayout = this.f84824d;
        linearLayout.removeAllViews();
        MultiAddressesInfo multiAddressesInfo = advertDetailsGeoReferenceItem.f84808i;
        String title = multiAddressesInfo != null ? multiAddressesInfo.getTitle() : null;
        if (title != null) {
            linearLayout.setOrientation(1);
            TextView textView = (TextView) LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.advert_details_multiaddress_header, (ViewGroup) linearLayout, false);
            I5.a(textView, title, false);
            D6.c(textView, null, null, null, Integer.valueOf(y6.b(8)), 7);
            linearLayout.addView(textView);
        }
        boolean z12 = this.f84823c;
        boolean z13 = advertDetailsGeoReferenceItem.f84812m;
        os0.g c44933a = z12 ? new C44933a(linearLayout, false, 2, null) : z13 ? new C44934b(linearLayout) : new os0.g(linearLayout, false, 2, null);
        List list = advertDetailsGeoReferenceItem.f84806g;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        c44933a.c(advertDetailsGeoReferenceItem.f84803d, advertDetailsGeoReferenceItem.f84804e, advertDetailsGeoReferenceItem.f84805f, list, false);
        if (z13 || advertDetailsGeoReferenceItem.f84809j == null) {
            return;
        }
        linearLayout.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(20, aVar, advertDetailsGeoReferenceItem));
    }
}
