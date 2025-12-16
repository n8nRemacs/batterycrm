package com.avito.android.item_map.amenity;

import android.view.LayoutInflater;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.avito.android.R;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AmenityButtonsViewBinder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/amenity/m;", "Lcom/avito/android/item_map/amenity/l;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f173313a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f173314b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f173315c = new LinkedHashMap();

    public m(@Y61.k HorizontalScrollView horizontalScrollView) {
        this.f173313a = (LinearLayout) horizontalScrollView.findViewById(R.id.amenity_buttons);
        this.f173314b = LayoutInflater.from(horizontalScrollView.getContext());
        horizontalScrollView.setOnScrollChangeListener(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.e(horizontalScrollView, 1));
    }
}
