package com.avito.android.advert_details_items.status_badge;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: AdvertDetailsClosingReasonView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/status_badge/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/status_badge/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f85712b;

    public g(@k View view) {
        super(view);
        this.f85712b = (TextView) view;
    }

    @Override // com.avito.android.advert_details_items.status_badge.f
    public final void kH(@k String str) {
        this.f85712b.setText(str);
    }
}
