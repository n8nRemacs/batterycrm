package com.avito.android.serp.adapter.brandspace_widget;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BrandspaceWidgetItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/brandspace_widget/b;", "LTV0/b;", "Lcom/avito/android/serp/adapter/brandspace_widget/q;", "Lcom/avito/android/serp/adapter/brandspace_widget/BrandspaceWidgetItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements TV0.b<q, BrandspaceWidgetItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f269035a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f269036b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<u> f269037c = new g.a<>(R.layout.brandspace_widget, new a());

    /* compiled from: BrandspaceWidgetItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/brandspace_widget/u;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/brandspace_widget/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, u> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final u invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            com.avito.konveyor.a aVar = bVar.f269036b;
            com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
            return new u(view, new com.avito.konveyor.adapter.j(hVar, bVar.f269036b), hVar, bVar.f269035a);
        }
    }

    @Inject
    public b(@Y61.k i iVar, @kr0.b @Y61.k com.avito.konveyor.a aVar) {
        this.f269035a = iVar;
        this.f269036b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f269035a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<u> b() {
        return this.f269037c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof BrandspaceWidgetItem;
    }
}
