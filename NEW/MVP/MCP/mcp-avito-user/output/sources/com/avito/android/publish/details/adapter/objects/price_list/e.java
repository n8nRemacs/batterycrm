package com.avito.android.publish.details.adapter.objects.price_list;

import TV0.g;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import t3.l0;

/* compiled from: PriceListPreviewItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/price_list/e;", "LTV0/b;", "Lcom/avito/android/publish/details/adapter/objects/price_list/k;", "Lcom/avito/android/category_parameters/ParameterElement$w;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements TV0.b<k, ParameterElement.w> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f233361a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f233362b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f233363c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f233364d = new g.a<>(R.layout.item_price_list_preview_container, new d(this));

    public e(@Y61.k f fVar, @Y61.k com.avito.android.util.text.a aVar, @l0 @Y61.k u3.l lVar) {
        this.f233361a = fVar;
        this.f233362b = aVar;
        this.f233363c = lVar;
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<k, ParameterElement.w> a() {
        return this.f233361a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f233364d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof ParameterElement.w) && L.f(((ParameterElement.w) aVar).f117573i, "priceList") && !this.f233363c.f439745a.f439749b.b();
    }
}
