package com.avito.android.advert.item.sparePartsCost;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SparePartsCostItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/sparePartsCost/a;", "LTV0/b;", "Lcom/avito/android/advert/item/sparePartsCost/g;", "Lcom/avito/android/advert/item/sparePartsCost/SparePartsCostItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<g, SparePartsCostItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f80375a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f80376b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f80377c = new g.a<>(R.layout.advert_details_spare_parts_cost_view, new C2377a());

    /* compiled from: SparePartsCostItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/konveyor/adapter/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/konveyor/adapter/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.sparePartsCost.a$a, reason: collision with other inner class name */
    public static final class C2377a extends N implements p<ViewGroup, View, com.avito.konveyor.adapter.b> {
        public C2377a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.konveyor.adapter.b invoke(ViewGroup viewGroup, View view) {
            return new h(view, a.this.f80376b);
        }
    }

    @Inject
    public a(@k e eVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f80375a = eVar;
        this.f80376b = interfaceC35745a5;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f80375a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f80377c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof SparePartsCostItem;
    }
}
