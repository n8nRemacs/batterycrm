package com.avito.android.saved_searches.presentation.items.name;

import Eo0.InterfaceC13515a;
import TV0.g;
import Y41.l;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: SavedSearchNameBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/name/a;", "LTV0/b;", "Lcom/avito/android/saved_searches/presentation/items/name/e;", "Lcom/avito/android/saved_searches/presentation/items/name/SavedSearchNameItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<e, SavedSearchNameItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f258506a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f258507b;

    /* compiled from: SavedSearchNameBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/saved_searches/presentation/items/name/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/saved_searches/presentation/items/name/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.saved_searches.presentation.items.name.a$a, reason: collision with other inner class name */
    public static final class C7762a extends N implements p<ViewGroup, View, f> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T f258508l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<InterfaceC13515a, G0> f258509m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.util.text.a f258510n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7762a(T t12, l<? super InterfaceC13515a, G0> lVar, com.avito.android.util.text.a aVar) {
            super(2);
            this.f258508l = t12;
            this.f258509m = lVar;
            this.f258510n = aVar;
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(this.f258508l, this.f258509m, view, this.f258510n);
        }
    }

    @Inject
    public a(@k com.avito.android.util.text.a aVar, @k T t12, @k l<? super InterfaceC13515a, G0> lVar, @k c cVar) {
        this.f258506a = cVar;
        this.f258507b = new g.a<>(R.layout.saved_search_name, new C7762a(t12, lVar, aVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f258506a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f258507b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof SavedSearchNameItem;
    }
}
