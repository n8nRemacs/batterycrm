package com.avito.android.saved_searches.presentation.items.switcher;

import Bo0.InterfaceC13172a;
import Eo0.InterfaceC13515a;
import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SavedSearchSwitcherBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/switcher/a;", "LTV0/b;", "Lcom/avito/android/saved_searches/presentation/items/switcher/i;", "Lcom/avito/android/saved_searches/presentation/items/switcher/SavedSearchSwitcherItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<i, SavedSearchSwitcherItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13515a, G0> f258559a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f258560b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f258561c = new g.a<>(R.layout.saved_search_switcher, new C7766a());

    /* compiled from: SavedSearchSwitcherBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/saved_searches/presentation/items/switcher/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/saved_searches/presentation/items/switcher/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.saved_searches.presentation.items.switcher.a$a, reason: collision with other inner class name */
    public static final class C7766a extends N implements p<ViewGroup, View, j> {
        public C7766a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, a.this.f258559a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public a(@Y61.k Y41.l<? super InterfaceC13515a, G0> lVar, @InterfaceC13172a @Y61.k f fVar) {
        this.f258559a = lVar;
        this.f258560b = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f258560b;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f258561c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof SavedSearchSwitcherItem;
    }
}
