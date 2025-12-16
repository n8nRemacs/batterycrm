package com.avito.android.seller_promotions.network.remote.parsing;

import Sq0.c;
import Y61.k;
import com.avito.android.remote.model.category_parameters.BeduinParameter;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: PromotionComponentTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/seller_promotions/network/remote/parsing/PromotionComponentTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "LSq0/c;", "<init>", "()V", "_avito-discouraged_avito-network_seller-promotions"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PromotionComponentTypeAdapter extends RuntimeTypeAdapter<c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f268090a;

    public PromotionComponentTypeAdapter() {
        super(null, "content", null, 5, null);
        this.f268090a = P0.g(new Q(BeduinParameter.TYPE, c.a.class), new Q("snippet", c.b.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Class<? extends Sq0.c>>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Class<? extends c>> getMapping() {
        return this.f268090a;
    }
}
