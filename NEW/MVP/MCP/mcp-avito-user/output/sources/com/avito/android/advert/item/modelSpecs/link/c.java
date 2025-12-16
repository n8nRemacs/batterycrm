package com.avito.android.advert.item.modelSpecs.link;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.advert.item.modelSpecs.e;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ModelSpecsItemViewImpl.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/modelSpecs/link/c;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/modelSpecs/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f77641c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f77642b;

    public c(@k View view) {
        super(view);
        this.f77642b = (TextView) view;
    }

    @Override // com.avito.android.advert.item.modelSpecs.e
    public final void a(@k Y41.a<G0> aVar) {
        this.f77642b.setOnClickListener(new n(26, aVar));
    }

    @Override // com.avito.android.advert.item.modelSpecs.e
    public final void setTitle(@l String str) {
        this.f77642b.setText(str);
    }
}
