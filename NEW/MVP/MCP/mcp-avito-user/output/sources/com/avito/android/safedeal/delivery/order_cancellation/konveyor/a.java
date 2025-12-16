package com.avito.android.safedeal.delivery.order_cancellation.konveyor;

import Y61.k;
import kotlin.Metadata;

/* compiled from: ReasonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/konveyor/a;", "Lcom/avito/conveyor_item/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f256362b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f256363c;

    public a(@k String str, @k String str2) {
        this.f256362b = str;
        this.f256363c = str2;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF256362b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF256362b() {
        return this.f256362b;
    }
}
