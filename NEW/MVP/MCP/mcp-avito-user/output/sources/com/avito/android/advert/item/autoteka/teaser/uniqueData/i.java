package com.avito.android.advert.item.autoteka.teaser.uniqueData;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import j.e0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutotekaUniqueDataView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/uniqueData/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/autoteka/teaser/uniqueData/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f73069g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f73070b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f73071c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f73072d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ConstraintLayout f73073e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f73074f;

    public i(@k View view) {
        super(view);
        this.f73070b = view;
        this.f73071c = (TextView) view.findViewById(R.id.unique_data_item_title);
        this.f73072d = (TextView) view.findViewById(R.id.unique_data_item_description);
        this.f73073e = (ConstraintLayout) view.findViewById(R.id.unique_data_container);
        this.f73074f = (ImageView) view.findViewById(R.id.unique_data_item_image);
    }

    @Override // com.avito.android.advert.item.autoteka.teaser.uniqueData.h
    public final void Nr(@k Y41.a<G0> aVar) {
        this.f73070b.setOnClickListener(new n(5, aVar));
    }

    @Override // com.avito.android.advert.item.autoteka.teaser.uniqueData.h
    public final void P00(@InterfaceC42150f int i12) {
        View view = this.f73070b;
        AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(view.getContext(), i12, C35835l0.j(i12, view.getContext()));
        c5275a.f179264a = y6.b(20);
        this.f73073e.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
    }

    @Override // com.avito.android.advert.item.autoteka.teaser.uniqueData.h
    public final void Wu(@e0 int i12) {
        this.f73072d.setText(this.f73070b.getContext().getString(i12));
    }

    @Override // com.avito.android.advert.item.autoteka.teaser.uniqueData.h
    public final void setImage(@InterfaceC42165v int i12) {
        this.f73074f.setImageResource(i12);
    }

    @Override // com.avito.android.advert.item.autoteka.teaser.uniqueData.h
    public final void setTitle(@e0 int i12) {
        this.f73071c.setText(this.f73070b.getContext().getString(i12));
    }
}
