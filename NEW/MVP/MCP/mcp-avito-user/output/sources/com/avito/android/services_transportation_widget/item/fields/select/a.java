package com.avito.android.services_transportation_widget.item.fields.select;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServicesTransportationWidgetSelectBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/select/a;", "LTV0/b;", "Lcom/avito/android/services_transportation_widget/item/fields/select/g;", "Lcom/avito/android/services_transportation_widget/item/fields/select/ServicesTransportationWidgetSelectItem;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<g, ServicesTransportationWidgetSelectItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f280593a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f280594b = new g.a<>(R.layout.item_services_transportation_widget_select, C8353a.f280595l);

    /* compiled from: ServicesTransportationWidgetSelectBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/services_transportation_widget/item/fields/select/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/services_transportation_widget/item/fields/select/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.services_transportation_widget.item.fields.select.a$a, reason: collision with other inner class name */
    public static final class C8353a extends N implements p<ViewGroup, View, b> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8353a f280595l = new C8353a();

        public C8353a() {
            super(2);
        }

        @Override // Y41.p
        public final b invoke(ViewGroup viewGroup, View view) {
            return new b((Input) view);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f280593a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f280593a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f280594b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ServicesTransportationWidgetSelectItem;
    }
}
