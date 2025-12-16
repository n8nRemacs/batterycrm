package com.avito.android.advert.item.rating_publish;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsRatingPublishView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/rating_publish/h;", "Lcom/avito/android/advert/item/rating_publish/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f78311c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f78312b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.rating_publish_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f78312b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.advert.item.rating_publish.g
    public final void E9(@k String str) {
        this.f78312b.setText(str);
    }

    @Override // com.avito.android.advert.item.rating_publish.g
    public final void a(@l Y41.a<G0> aVar) {
        this.f78312b.setOnClickListener(new com.avito.android.advert.item.parking.h(5, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f78312b.setOnClickListener(null);
    }
}
