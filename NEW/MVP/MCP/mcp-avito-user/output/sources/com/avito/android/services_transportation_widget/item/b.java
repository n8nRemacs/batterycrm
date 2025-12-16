package com.avito.android.services_transportation_widget.item;

import Ev0.InterfaceC13533a;
import Ev0.InterfaceC13534b;
import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceTransportationWidgetItemBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/b;", "Lcom/avito/android/services_transportation_widget/item/a;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.services_transportation_widget.item.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f280544a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f280545b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f280546c;

    /* compiled from: ServiceTransportationWidgetItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/services_transportation_widget/item/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/services_transportation_widget/item/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, k> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new k(view, bVar.f280546c, bVar.f280545b);
        }
    }

    @Inject
    public b(@Y61.k d dVar, @InterfaceC13533a @Y61.k com.avito.konveyor.adapter.j jVar, @InterfaceC13534b @Y61.k com.avito.konveyor.adapter.a aVar) {
        this.f280544a = dVar;
        this.f280545b = jVar;
        this.f280546c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f280544a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.service_transportation_widget, new a());
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ServiceTransportationWidgetItem;
    }
}
