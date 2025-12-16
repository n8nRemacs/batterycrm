package com.avito.android.advert.item.show_on_map;

import Ca1.ViewOnClickListenerC13236c;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.show_on_map.i;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsShowOnMapView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/show_on_map/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/show_on_map/i;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f80203c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f80204b;

    public j(@k View view) {
        super(view);
        this.f80204b = view;
    }

    @Override // com.avito.android.advert.item.show_on_map.i
    public final void ZI(@k AdvertDetailsShowOnMapItem advertDetailsShowOnMapItem, @k i.b bVar, @k String str) {
        this.f80204b.setOnClickListener(new ViewOnClickListenerC13236c(bVar, advertDetailsShowOnMapItem, str, 8));
    }

    @Override // com.avito.android.advert.item.show_on_map.i
    public final void gS(@k String str) {
        View viewFindViewById = this.f80204b.findViewById(R.id.show_on_map_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(str);
    }
}
