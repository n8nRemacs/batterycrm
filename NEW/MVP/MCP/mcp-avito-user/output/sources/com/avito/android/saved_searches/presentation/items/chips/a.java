package com.avito.android.saved_searches.presentation.items.chips;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SavedSearchChipsBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/chips/a;", "LTV0/b;", "Lcom/avito/android/saved_searches/presentation/items/chips/j;", "Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<j, SavedSearchChipsItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f258452a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f258453b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f258454c = new g.a<>(R.layout.saved_search_chips, new C7759a());

    /* compiled from: SavedSearchChipsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/saved_searches/presentation/items/chips/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/saved_searches/presentation/items/chips/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.saved_searches.presentation.items.chips.a$a, reason: collision with other inner class name */
    public static final class C7759a extends N implements p<ViewGroup, View, k> {
        public C7759a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view, a.this.f258452a);
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.util.text.a aVar, @Y61.k h hVar) {
        this.f258452a = aVar;
        this.f258453b = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f258453b;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f258454c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof SavedSearchChipsItem;
    }
}
