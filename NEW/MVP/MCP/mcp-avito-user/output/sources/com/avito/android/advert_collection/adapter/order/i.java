package com.avito.android.advert_collection.adapter.order;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrderView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/adapter/order/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_collection/adapter/order/g;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f81305c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItem f81306b;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.order);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItem");
        }
        this.f81306b = (ListItem) viewFindViewById;
    }

    @Override // com.avito.android.advert_collection.adapter.order.g
    public final void VJ(@k OrderItem orderItem) {
        this.f81306b.setTitle(orderItem.f81295b);
    }

    @Override // com.avito.android.advert_collection.adapter.order.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f81306b.setOnClickListener(new h(0, aVar));
    }
}
