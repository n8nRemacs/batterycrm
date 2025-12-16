package com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OtherAdvertsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/advert_list/adapter/other_adverts/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorite_sellers/adapter/advert_list/adapter/other_adverts/g;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f155516e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f155517b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f155518c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f155519d;

    public h(@k View view) {
        super(view);
        this.f155517b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f155518c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f155519d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f155517b.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(15, aVar));
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts.g
    public final void f5(int i12) {
        View view = this.f155517b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i12;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f155517b.setOnClickListener(null);
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts.g
    public final void setSubtitle(@l CharSequence charSequence) {
        I5.a(this.f155519d, charSequence, false);
    }

    @Override // com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts.g
    public final void setTitle(@l CharSequence charSequence) {
        I5.a(this.f155518c, charSequence, false);
    }
}
