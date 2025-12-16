package com.avito.android.saved_searches.presentation.items.info;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SavedSearchInfoBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/info/a;", "LTV0/b;", "Lcom/avito/android/saved_searches/presentation/items/info/e;", "Lcom/avito/android/saved_searches/presentation/items/info/SavedSearchInfoItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<e, SavedSearchInfoItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f258491a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f258492b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f258493c = new g.a<>(R.layout.saved_search_info, new C7761a());

    /* compiled from: SavedSearchInfoBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/saved_searches/presentation/items/info/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/saved_searches/presentation/items/info/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.saved_searches.presentation.items.info.a$a, reason: collision with other inner class name */
    public static final class C7761a extends N implements p<ViewGroup, View, f> {
        public C7761a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view, a.this.f258492b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar) {
        this.f258491a = cVar;
        this.f258492b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f258491a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f258493c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof SavedSearchInfoItem;
    }
}
