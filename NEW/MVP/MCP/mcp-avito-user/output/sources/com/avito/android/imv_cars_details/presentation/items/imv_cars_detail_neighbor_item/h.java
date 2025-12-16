package com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.imv_cars_details.models.NeighborParameter;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsNeighborView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_detail_neighbor_item/h;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_detail_neighbor_item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f170115b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f170116c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f170117d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f170118e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f170119f;

    public h(@k View view, @k c cVar) {
        super(view);
        this.f170115b = cVar;
        View viewFindViewById = view.findViewById(R.id.imv_cars_details_neighbor_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f170116c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.imv_cars_details_neighbor_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170117d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.imv_cars_details_neighbor_mileage);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170118e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.imv_cars_details_neighbor_parameters_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f170119f = (LinearLayout) viewFindViewById4;
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item.g
    public final void Ip(@l String str) {
        I5.a(this.f170118e, str, false);
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item.g
    public final void b(@l String str) {
        I5.a(this.f170117d, str, false);
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item.g
    public final void gC(@k List<NeighborParameter> list) {
        LinearLayout linearLayout = this.f170119f;
        linearLayout.removeAllViews();
        this.f170115b.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
        List<NeighborParameter> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (NeighborParameter neighborParameter : list2) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.imv_cars_details_parameter_item, (ViewGroup) linearLayout, false);
            View viewFindViewById = viewInflate.findViewById(R.id.neighbor_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.neighbor_value);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView2 = (TextView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(R.id.neighbor_description);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            I5.a(textView, neighborParameter.getTitle(), false);
            I5.a(textView2, neighborParameter.getValue(), false);
            I5.a((TextView) viewFindViewById3, neighborParameter.getDetails(), false);
            arrayList.add(viewInflate);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_detail_neighbor_item.g
    public final void z1(@l Image image) {
        G0 g02;
        SimpleDraweeView simpleDraweeView = this.f170116c;
        Uri uriB = C35829k2.c(image, simpleDraweeView, 1, 22).b();
        if (uriB != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.f(uriB);
            aVarA.c();
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            simpleDraweeView.setBackground(simpleDraweeView.getContext().getDrawable(R.drawable.imv_cars_details_placeholder));
        }
    }
}
