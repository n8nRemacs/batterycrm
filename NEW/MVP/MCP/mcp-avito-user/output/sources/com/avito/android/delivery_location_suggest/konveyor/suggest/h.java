package com.avito.android.delivery_location_suggest.konveyor.suggest;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SuggestItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_location_suggest/konveyor/suggest/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/delivery_location_suggest/konveyor/suggest/g;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f135136e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f135137b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f135138c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f135139d;

    public h(@k View view) {
        super(view);
        this.f135137b = view;
        this.f135138c = (TextView) view.findViewById(R.id.title);
        this.f135139d = (TextView) view.findViewById(R.id.sub_title);
    }

    @Override // com.avito.android.delivery_location_suggest.konveyor.suggest.g
    public final void JS(@k String str, @k String str2) {
        this.f135138c.setText(str);
        this.f135139d.setText(str2);
    }

    @Override // com.avito.android.delivery_location_suggest.konveyor.suggest.g
    public final void u1(@k Y41.a<G0> aVar) {
        this.f135137b.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(4, aVar));
    }
}
