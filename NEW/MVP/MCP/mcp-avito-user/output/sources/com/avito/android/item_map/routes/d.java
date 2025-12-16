package com.avito.android.item_map.routes;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RouteItemsViewBinder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/routes/d;", "Lcom/avito/android/item_map/routes/c;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f173379a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f173380b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f173381c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f173382d = new LinkedHashMap();

    public d(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.android.util.text.a aVar) {
        this.f173379a = viewGroup;
        this.f173380b = aVar;
        this.f173381c = LayoutInflater.from(viewGroup.getContext());
    }
}
