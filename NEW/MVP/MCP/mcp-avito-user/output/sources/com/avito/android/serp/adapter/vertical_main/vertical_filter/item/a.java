package com.avito.android.serp.adapter.vertical_main.vertical_filter.item;

import Oi0.C14701e;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.M;
import hs0.r;
import hs0.s;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerticalFilterItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/f;", "Lcom/avito/android/serp/adapter/vertical_main/VerticalPromoBlockItem$VerticalFilterItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<f, VerticalPromoBlockItem.VerticalFilterItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f273540a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f273541b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f273542c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final M f273543d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C14701e f273544e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.vertical_main.c f273545f;

    /* compiled from: VerticalFilterItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.item.a$a, reason: collision with other inner class name */
    public static final class C8119a extends N implements p<ViewGroup, View, g> {
        public C8119a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a aVar = a.this;
            com.avito.konveyor.adapter.h hVar = aVar.f273541b;
            return new g(view2, hVar, aVar.f273544e.a(hVar), aVar.f273543d, aVar.f273542c, aVar.f273545f);
        }
    }

    @Inject
    public a(@k c cVar, @hs0.p @k com.avito.konveyor.adapter.h hVar, @k @r com.avito.konveyor.a aVar, @k M m12, @s @k C14701e c14701e, @k com.avito.android.serp.adapter.vertical_main.c cVar2) {
        this.f273540a = cVar;
        this.f273541b = hVar;
        this.f273542c = aVar;
        this.f273543d = m12;
        this.f273544e = c14701e;
        this.f273545f = cVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f273540a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.main_vertical_search_filter, new C8119a());
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof VerticalPromoBlockItem.VerticalFilterItem;
    }
}
