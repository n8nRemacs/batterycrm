package com.avito.android.list.list_snippet;

import com.avito.android.remote.model.search.suggest.SuggestSnippetItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListSnippetPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f181604l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SuggestSnippetItem f181605m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, SuggestSnippetItem suggestSnippetItem) {
        super(0);
        this.f181604l = hVar;
        this.f181605m = suggestSnippetItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f181604l.f181606b.h(this.f181605m.getActions());
        return G0.f406611a;
    }
}
