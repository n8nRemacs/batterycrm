package com.avito.android.advert_details_items.price_description_button;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPriceDescriptionButtonView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/price_description_button/c;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/price_description_button/g;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final View f85298b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f85299c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ImageView f85300d;

    public c(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.item_price_description_button);
        this.f85298b = viewFindViewById;
        this.f85299c = viewFindViewById != null ? (TextView) viewFindViewById.findViewById(R.id.price_description) : null;
        this.f85300d = viewFindViewById != null ? (ImageView) viewFindViewById.findViewById(R.id.left_icon) : null;
    }

    @Override // com.avito.android.advert_details_items.price_description_button.g
    public final void lO() {
        ImageView imageView = this.f85300d;
        if (imageView != null) {
            D6.w(imageView);
        }
    }

    @Override // com.avito.android.advert_details_items.price_description_button.g
    public final void lV(@l com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g gVar) {
        this.f85298b.setOnClickListener(gVar);
    }

    @Override // com.avito.android.advert_details_items.price_description_button.g
    public final void rP(@l String str) {
        TextView textView = this.f85299c;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.advert_details_items.price_description_button.g
    public final void uP(int i12) {
        ImageView imageView = this.f85300d;
        if (imageView != null) {
            D6.H(imageView);
            C35821j2.a(imageView, C35835l0.h(i12, this.f85298b.getContext()));
        }
    }
}
