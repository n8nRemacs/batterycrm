package com.avito.android.advert_core.price_list.header;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: PriceListHeaderView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/price_list/header/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/price_list/header/f;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f84106b;

    public g(@k View view) {
        super(view);
        this.f84106b = (TextView) view.findViewById(R.id.price_list_header);
    }

    @Override // com.avito.android.advert_core.price_list.header.f
    public final void U1(@k String str) {
        I5.a(this.f84106b, str, false);
    }
}
