package com.avito.android.delivery_location_suggest.konveyor.empty;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import j.e0;
import kotlin.Metadata;

/* compiled from: EmptyItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_location_suggest/konveyor/empty/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/delivery_location_suggest/konveyor/empty/f;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f135123b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f135124c;

    public g(@k View view) {
        super(view);
        this.f135123b = view;
        this.f135124c = (TextView) view.findViewById(R.id.text_view);
    }

    @Override // com.avito.android.delivery_location_suggest.konveyor.empty.f
    public final void U0(@e0 int i12) {
        this.f135124c.setText(i12);
    }
}
