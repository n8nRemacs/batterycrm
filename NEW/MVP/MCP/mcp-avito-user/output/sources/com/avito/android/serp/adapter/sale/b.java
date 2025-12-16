package com.avito.android.serp.adapter.sale;

import Hr0.InterfaceC14027a;
import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SaleHeaderBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/sale/b;", "LTV0/b;", "Lcom/avito/android/serp/adapter/sale/l;", "Lcom/avito/android/serp/adapter/sale/SaleHeaderItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements TV0.b<l, SaleHeaderItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f271482a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f271483b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f271484c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<m> f271485d = new g.a<>(R.layout.serp_sale_header_widget, new a());

    /* compiled from: SaleHeaderBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/sale/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/sale/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, m> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new m(view, bVar.f271483b, bVar.f271484c);
        }
    }

    @Inject
    public b(@Y61.k h hVar, @InterfaceC14027a @Y61.k com.avito.konveyor.adapter.h hVar2, @Hr0.g @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f271482a = hVar;
        this.f271483b = hVar2;
        this.f271484c = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f271482a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<m> b() {
        return this.f271485d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof SaleHeaderItem;
    }
}
