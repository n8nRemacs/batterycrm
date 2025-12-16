package com.avito.android.beduin.common.component.payment_type_selector.item;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PaymentMethodItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/item/b;", "LTV0/b;", "Lcom/avito/android/beduin/common/component/payment_type_selector/item/e;", "Lcom/avito/android/beduin/common/component/payment_type_selector/item/PaymentMethodItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements TV0.b<e, PaymentMethodItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f101822a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<f> f101823b = new g.a<>(R.layout.beduin_component_payment_method_item, a.f101821l);

    public b(@k d dVar) {
        this.f101822a = dVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<e, PaymentMethodItem> a() {
        return this.f101822a;
    }

    @Override // TV0.b
    @k
    public final g.a<f> b() {
        return this.f101823b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof PaymentMethodItem;
    }
}
