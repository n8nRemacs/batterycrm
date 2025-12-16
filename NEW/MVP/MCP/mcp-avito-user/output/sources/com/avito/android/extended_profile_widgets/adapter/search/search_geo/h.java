package com.avito.android.extended_profile_widgets.adapter.search.search_geo;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchGeoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_geo/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/search/search_geo/g;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f154821d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f154822b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f154823c;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f154822b = aVar;
        View viewFindViewById = view.findViewById(R.id.geo_address);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154823c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_geo.g
    public final void Fa(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(12, aVar));
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.search.search_geo.g
    public final void w(@k AttributedText attributedText) {
        this.f154823c.setText(this.f154822b.c(this.itemView.getContext(), attributedText));
    }
}
