package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.geo_control;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.serp_advert_card.i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalSearchFilterGeoControlItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/geo_control/h;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/geo_control/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e, g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f273485d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f273486b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f273487c;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f273486b = view;
        this.f273487c = aVar;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.geo_control.g
    public final void V3(@l CharSequence charSequence) {
        View viewFindViewById = this.f273486b.findViewById(R.id.address);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(charSequence);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.geo_control.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f273486b.setOnClickListener(new i(20, aVar));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.geo_control.g
    public final void e(@k AttributedText attributedText) {
        View view = this.f273486b;
        View viewFindViewById = view.findViewById(R.id.address);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(this.f273487c.c(view.getContext(), attributedText));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.geo_control.g
    public final void setEnabled(boolean z12) {
        this.f273486b.setEnabled(z12);
    }
}
