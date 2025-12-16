package com.avito.android.beduin.common.component.product_comparison.items;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: BeduinProductComparisonItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/items/d;", "LTV0/b;", "Lcom/avito/android/beduin/common/component/product_comparison/items/f;", "Lcom/avito/android/beduin/common/component/product_comparison/items/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.b<f, b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f102158a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<g> f102159b = new g.a<>(R.layout.beduin_component_product_comparison_item, c.f102157l);

    public d(@k e eVar) {
        this.f102158a = eVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<f, b> a() {
        return this.f102158a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f102159b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof b;
    }
}
