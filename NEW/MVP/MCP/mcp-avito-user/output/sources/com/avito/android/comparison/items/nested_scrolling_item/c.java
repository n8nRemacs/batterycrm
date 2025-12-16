package com.avito.android.comparison.items.nested_scrolling_item;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.comparison.di.u;
import com.avito.android.comparison.q;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NestedScrollingBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comparison/items/nested_scrolling_item/c;", "LTV0/b;", "Lcom/avito/android/comparison/items/nested_scrolling_item/h;", "Lcom/avito/android/comparison/items/nested_scrolling_item/e;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements TV0.b<h, e> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f124000a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q f124001b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f124002c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.b<Integer> f124003d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.comparison.text_measurer.a f124004e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f124005f = new g.a<>(R.layout.comparison_nested_scrolling_item_layout, new a());

    /* compiled from: NestedScrollingBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/comparison/items/nested_scrolling_item/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/comparison/items/nested_scrolling_item/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            c cVar = c.this;
            return new i(view2, cVar.f124002c, cVar.f124003d, cVar.f124004e, cVar.f124001b);
        }
    }

    @Inject
    public c(@k f fVar, @k q qVar, @u @k com.avito.konveyor.a aVar, @com.avito.android.comparison.di.i @k io.reactivex.rxjava3.subjects.b<Integer> bVar, @k com.avito.android.comparison.text_measurer.a aVar2) {
        this.f124000a = fVar;
        this.f124001b = qVar;
        this.f124002c = aVar;
        this.f124003d = bVar;
        this.f124004e = aVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f124000a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f124005f;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof e;
    }
}
