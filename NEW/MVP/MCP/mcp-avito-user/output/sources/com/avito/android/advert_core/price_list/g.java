package com.avito.android.advert_core.price_list;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: PriceListView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/price_list/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/price_list/f;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f84093b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f84094c;

    public g(@k View view) {
        super(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.price_list_container);
        this.f84093b = (TextView) viewGroup.findViewById(R.id.name);
        this.f84094c = (TextView) viewGroup.findViewById(R.id.price);
    }

    @Override // com.avito.android.advert_core.price_list.f
    public final void Ay(@k String str, @k String str2) {
        I5.a(this.f84093b, str, false);
        I5.a(this.f84094c, str2, false);
    }
}
