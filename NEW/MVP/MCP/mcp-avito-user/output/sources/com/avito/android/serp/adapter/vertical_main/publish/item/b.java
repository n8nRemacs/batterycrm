package com.avito.android.serp.adapter.vertical_main.publish.item;

import Oi0.C14700d;
import TV0.g;
import Y41.p;
import Y61.k;
import Zr0.InterfaceC19599a;
import Zr0.m;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.M;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.item.g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerticalPublishBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/publish/item/b;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/f;", "Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem$VerticalPublishItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements TV0.b<com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f, VerticalPromoBlockItem.VerticalPublishItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f273116a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f273117b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f273118c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final M f273119d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.vertical_main.c f273120e;

    /* compiled from: VerticalPublishBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, g> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            b bVar = b.this;
            com.avito.konveyor.a aVar = null;
            return new g(view2, bVar.f273117b, bVar.f273118c, bVar.f273119d, aVar, bVar.f273120e, 16, null);
        }
    }

    @Inject
    public b(@k d dVar, @k @InterfaceC19599a com.avito.konveyor.adapter.a aVar, @k @m C14700d c14700d, @k M m12, @k com.avito.android.serp.adapter.vertical_main.c cVar) {
        this.f273116a = dVar;
        this.f273117b = aVar;
        this.f273118c = c14700d;
        this.f273119d = m12;
        this.f273120e = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f273116a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.main_vertical_search_filter, new a());
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof VerticalPromoBlockItem.VerticalPublishItem;
    }
}
