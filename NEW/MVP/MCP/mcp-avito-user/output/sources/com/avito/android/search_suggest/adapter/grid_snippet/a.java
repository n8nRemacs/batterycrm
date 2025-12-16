package com.avito.android.search_suggest.adapter.grid_snippet;

import Pp0.InterfaceC14824b;
import com.avito.android.remote.model.search.suggest.GridSuggestSnippetItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GridSnippetPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f264149l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GridSuggestSnippetItem f264150m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.list.grid_snippet.item.c f264151n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, GridSuggestSnippetItem gridSuggestSnippetItem, com.avito.android.list.grid_snippet.item.c cVar) {
        super(0);
        this.f264149l = bVar;
        this.f264150m = gridSuggestSnippetItem;
        this.f264151n = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f264149l.f264152b.invoke(new InterfaceC14824b.C0869b(this.f264150m.getActions(), this.f264151n));
        return G0.f406611a;
    }
}
