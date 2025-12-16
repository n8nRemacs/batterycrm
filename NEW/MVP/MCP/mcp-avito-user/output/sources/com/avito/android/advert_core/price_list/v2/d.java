package com.avito.android.advert_core.price_list.v2;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.ui.widget.WrapWidthTextView;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import sK0.C48065c;

/* compiled from: AdvertPriceListV2ItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/price_list/v2/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/price_list/v2/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f84145i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f84146b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f84147c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final WrapWidthTextView f84148d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final WrapWidthTextView f84149e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final WrapWidthTextView f84150f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final WrapWidthTextView f84151g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final WrapWidthTextView f84152h;

    public d(@k View view) {
        super(view);
        this.f84146b = view;
        this.f84147c = view.getContext();
        this.f84148d = (WrapWidthTextView) view.findViewById(R.id.advert_price_list_title);
        this.f84149e = (WrapWidthTextView) view.findViewById(R.id.advert_price_list_subtitle);
        this.f84150f = (WrapWidthTextView) view.findViewById(R.id.advert_price_list_price);
        this.f84151g = (WrapWidthTextView) view.findViewById(R.id.advert_price_list_subprice);
        this.f84152h = (WrapWidthTextView) view.findViewById(R.id.advert_price_list_imv);
    }

    @Override // com.avito.android.advert_core.price_list.v2.c
    public final void IK(@k Y41.a<G0> aVar) {
        this.f84146b.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(14, aVar));
    }

    @Override // com.avito.android.advert_core.price_list.v2.c
    public final void QC(@l String str) {
        I5.a(this.f84151g, str, false);
    }

    @Override // com.avito.android.advert_core.price_list.v2.c
    public final void f(@l String str) {
        I5.a(this.f84149e, str, false);
    }

    @Override // com.avito.android.advert_core.price_list.v2.c
    public final void p(@l String str) {
        I5.a(this.f84150f, str, false);
    }

    @Override // com.avito.android.advert_core.price_list.v2.c
    public final void setTitle(@l String str) {
        I5.a(this.f84148d, str, false);
    }

    @Override // com.avito.android.advert_core.price_list.v2.c
    public final void u70(@l UniversalColor universalColor, @l String str) {
        WrapWidthTextView wrapWidthTextView = this.f84152h;
        I5.a(wrapWidthTextView, str, false);
        wrapWidthTextView.setTextColor(C48065c.d(this.f84147c, universalColor, R.attr.green800));
    }
}
