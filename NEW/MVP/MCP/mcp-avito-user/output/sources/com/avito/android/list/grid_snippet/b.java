package com.avito.android.list.grid_snippet;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GridSnippetsBlockBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/list/grid_snippet/b;", "Lcom/avito/android/list/grid_snippet/a;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.list.grid_snippet.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f181562a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.list.grid_snippet.item.a f181563b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<i> f181564c = new g.a<>(R.layout.grid_snippets_block_item, new a());

    /* compiled from: GridSnippetsBlockBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/list/grid_snippet/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/list/grid_snippet/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view, b.this.f181563b);
        }
    }

    @Inject
    public b(@k e eVar, @k com.avito.android.list.grid_snippet.item.a aVar) {
        this.f181562a = eVar;
        this.f181563b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f181562a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f181564c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof d;
    }
}
