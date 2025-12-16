package com.avito.android.advert_details_items.show_description_button;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsShowDescriptionView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/show_description_button/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/show_description_button/g;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f85699c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f85700b;

    public h(@k View view) {
        super(view);
        this.f85700b = view;
    }

    @Override // com.avito.android.advert_details_items.show_description_button.g
    public final void c(@k Y41.a<G0> aVar) {
        this.f85700b.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(25, aVar));
    }
}
