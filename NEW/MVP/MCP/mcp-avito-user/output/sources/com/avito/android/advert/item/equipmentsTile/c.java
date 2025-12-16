package com.avito.android.advert.item.equipmentsTile;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.OptionsTile;
import com.avito.android.util.C35949t5;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: AdvertDetailsEquipmentsTileItemAdapter.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/equipmentsTile/c;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/advert/item/equipmentsTile/d;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends RecyclerView.Adapter<d> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f75332c = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f75332c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        d dVar = (d) c12;
        OptionsTile optionsTile = (OptionsTile) this.f75332c.get(i12);
        dVar.f75334c.setText(optionsTile.getTitle());
        Image optionIcon = optionsTile.getOptionIcon();
        SimpleDraweeView simpleDraweeView = dVar.f75333b;
        if (optionIcon != null) {
            simpleDraweeView.setVisibility(0);
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(optionIcon), null, null, null, 14);
            GW0.a hierarchy = simpleDraweeView.getHierarchy();
            hierarchy.o(hierarchy.f6530b.getDrawable(R.drawable.advert_details_equipments_tile_placeholder), 1);
        } else {
            simpleDraweeView.setVisibility(8);
        }
        simpleDraweeView.setColorFilter(dVar.f75335d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new d(C0.b(viewGroup, R.layout.advert_details_equipments_tile_item, viewGroup, false));
    }
}
