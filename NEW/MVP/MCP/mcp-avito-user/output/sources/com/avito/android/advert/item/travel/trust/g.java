package com.avito.android.advert.item.travel.trust;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.parking.h;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsTravelTrustItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/travel/trust/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/travel/trust/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f80614c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f80615b;

    public g(@k View view) {
        super(view);
        this.f80615b = (TextView) view.findViewById(R.id.travel_trust_item_title);
    }

    @Override // com.avito.android.advert.item.travel.trust.f
    public final void a(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new h(23, aVar));
    }

    @Override // com.avito.android.advert.item.travel.trust.f
    public final void e(@k AttributedText attributedText) {
        j.c(this.f80615b, attributedText, null);
    }
}
