package com.avito.android.advert.item.promo_mechanics;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoMechanicsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/promo_mechanics/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/promo_mechanics/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f78265d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f78266b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f78267c;

    public h(@k View view) {
        super(view);
        this.f78266b = view;
        View viewFindViewById = view.findViewById(R.id.entry_point_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f78267c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.advert.item.promo_mechanics.g
    public final void Fl(@l AttributedText attributedText) {
        j.a(this.f78267c, attributedText, null);
    }

    @Override // com.avito.android.advert.item.promo_mechanics.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f78266b.setOnClickListener(new com.avito.android.advert.item.parking.h(4, aVar));
    }
}
