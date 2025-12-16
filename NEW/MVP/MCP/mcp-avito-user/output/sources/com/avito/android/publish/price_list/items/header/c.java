package com.avito.android.publish.price_list.items.header;

import TV0.g;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import javax.inject.Inject;
import kotlin.Metadata;
import t3.l0;
import u3.l;

/* compiled from: SelfServicesHeaderBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/items/header/c;", "LTV0/b;", "Lcom/avito/android/publish/price_list/items/header/f;", "Lcom/avito/android/publish/price_list/items/header/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements TV0.b<f, e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f238655a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f238656b;

    @Inject
    public c(@Y61.k g gVar, @l0 @Y61.k l<SimpleTestGroupWithNone> lVar) {
        this.f238655a = gVar;
        this.f238656b = lVar.f439745a.f439749b.b() ? new g.a<>(R.layout.item_self_services_header_re23, a.f238653l) : new g.a<>(R.layout.item_self_services_header, b.f238654l);
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f238655a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f238656b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof e;
    }
}
