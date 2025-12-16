package com.avito.android.publish.price_list.items.group;

import TV0.g;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;
import t3.l0;

/* compiled from: SelectPriceListGroupItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/items/group/d;", "LTV0/b;", "Lcom/avito/android/publish/price_list/items/group/k;", "Lcom/avito/android/publish/price_list/items/group/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements TV0.b<k, a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f238635a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f238636b;

    @Inject
    public d(@Y61.k f fVar, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f238635a = fVar;
        this.f238636b = lVar.f439745a.f439749b.b() ? new g.a<>(R.layout.item_select_price_list_group_re23, b.f238633l) : new g.a<>(R.layout.item_select_price_list_group, c.f238634l);
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f238635a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f238636b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof a;
    }
}
