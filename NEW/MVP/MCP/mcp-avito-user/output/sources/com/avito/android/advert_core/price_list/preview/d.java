package com.avito.android.advert_core.price_list.preview;

import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.avito.android.remote.model.imv_services.ImvServicesLabel;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertPriceListPreviewItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/price_list/preview/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/price_list/preview/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f84124f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f84125b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f84126c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f84127d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f84128e;

    public d(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.advert_price_list_preview_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f84125b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_price_list_preview_items_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f84126c = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advert_price_list_preview_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f84127d = (Button) viewFindViewById3;
        this.f84128e = LayoutInflater.from(view.getContext());
    }

    @Override // com.avito.android.advert_core.price_list.preview.c
    public final void Bn(@k PriceList.Value value, boolean z12, @k p<? super String, ? super ImvServices, G0> pVar) {
        ImvServicesLabel label;
        ImvServicesLabel label2;
        LayoutInflater layoutInflater = this.f84128e;
        LinearLayout linearLayout = this.f84126c;
        View viewInflate = layoutInflater.inflate(R.layout.advert_price_list_v2_item, (ViewGroup) linearLayout, false);
        com.avito.android.advert_core.price_list.v2.d dVar = new com.avito.android.advert_core.price_list.v2.d(viewInflate);
        dVar.setTitle(value.getTitle());
        if (!z12) {
            dVar.f(value.getSubTitle());
        }
        dVar.p(value.getPrice());
        if (!z12) {
            dVar.QC(value.getSubPrice());
            ImvServices imv = value.getImv();
            UniversalColor color = null;
            String text = (imv == null || (label2 = imv.getLabel()) == null) ? null : label2.getText();
            ImvServices imv2 = value.getImv();
            if (imv2 != null && (label = imv2.getLabel()) != null) {
                color = label.getColor();
            }
            dVar.u70(color, text);
        }
        viewInflate.setPadding(viewInflate.getPaddingLeft(), y6.b(6), viewInflate.getPaddingRight(), y6.b(6));
        viewInflate.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(15, pVar, value));
        linearLayout.addView(viewInflate, -1, viewInflate.getLayoutParams());
    }

    @Override // com.avito.android.advert_core.price_list.preview.c
    public final void c1(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f84127d, str, false);
    }

    @Override // com.avito.android.advert_core.price_list.preview.c
    public final void dV() {
        this.f84126c.removeAllViews();
    }

    @Override // com.avito.android.advert_core.price_list.preview.c
    @SuppressLint({"ResourceType"})
    public final void f60(boolean z12, boolean z13) {
        int i12 = R.attr.textH25;
        if (!z13 && z12) {
            i12 = R.attr.textH20;
        }
        TextView textView = this.f84125b;
        textView.setTextAppearance(C35835l0.j(i12, textView.getContext()));
    }

    @Override // com.avito.android.advert_core.price_list.preview.c
    public final void hs(@k Y41.a<G0> aVar) {
        this.f84127d.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(13, aVar));
    }

    @Override // com.avito.android.advert_core.price_list.preview.c
    public final void setTitle(@l String str) {
        I5.a(this.f84125b, str, false);
    }
}
