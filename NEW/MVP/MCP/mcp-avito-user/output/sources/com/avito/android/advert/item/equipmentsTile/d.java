package com.avito.android.advert.item.equipmentsTile;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsEquipmentsTileItemAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/equipmentsTile/d;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends RecyclerView.C {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f75333b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f75334c;

    /* renamed from: d, reason: collision with root package name */
    public final int f75335d;

    public d(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.equipment_tile_item_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f75333b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.equipment_tile_item_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f75334c = (TextView) viewFindViewById2;
        this.f75335d = C35835l0.d(R.attr.black, view.getContext());
    }
}
