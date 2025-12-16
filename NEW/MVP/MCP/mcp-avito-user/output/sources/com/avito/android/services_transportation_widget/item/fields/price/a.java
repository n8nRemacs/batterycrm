package com.avito.android.services_transportation_widget.item.fields.price;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServicesTransportationWidgetPriceBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/price/a;", "LTV0/b;", "Lcom/avito/android/services_transportation_widget/item/fields/price/f;", "Lcom/avito/android/services_transportation_widget/item/fields/price/ServicesTransportationWidgetPriceItem;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<f, ServicesTransportationWidgetPriceItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f280583a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f280584b = new g.a<>(R.layout.item_services_transportation_widget_price, C8352a.f280585l);

    /* compiled from: ServicesTransportationWidgetPriceBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/services_transportation_widget/item/fields/price/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/services_transportation_widget/item/fields/price/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.services_transportation_widget.item.fields.price.a$a, reason: collision with other inner class name */
    public static final class C8352a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8352a f280585l = new C8352a();

        public C8352a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g((TextView) view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f280583a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f280583a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f280584b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ServicesTransportationWidgetPriceItem;
    }
}
