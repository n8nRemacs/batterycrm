package com.avito.android.service_order_widget.item;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.B2;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderWidgetItemBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_widget/item/c;", "Lcom/avito/android/service_order_widget/item/b;", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f278857a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B2 f278858b;

    /* compiled from: ServiceOrderWidgetItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/service_order_widget/item/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/service_order_widget/item/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f278859l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12) {
            super(2);
            this.f278859l = z12;
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view, this.f278859l);
        }
    }

    @Inject
    public c(@Y61.k f fVar, @Y61.k B2 b22) {
        this.f278857a = fVar;
        this.f278858b = b22;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f278857a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        B2 b22 = this.f278858b;
        b22.getClass();
        kotlin.reflect.n<Object> nVar = B2.f67184X[44];
        boolean zBooleanValue = ((Boolean) b22.f67201Q.a().invoke()).booleanValue();
        return new g.a<>(zBooleanValue ? R.layout.item_service_order_with_image_widget : R.layout.item_service_order_widget, new a(zBooleanValue));
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof com.avito.android.service_order_widget.item.a;
    }
}
