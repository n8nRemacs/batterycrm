package com.avito.android.serp.adapter.snippet;

import com.avito.android.serp.adapter.snippet.g;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: SnippetPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g.a f272355l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SnippetItem f272356m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f272357n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g.a aVar, SnippetItem snippetItem, int i12) {
        super(0);
        this.f272355l = aVar;
        this.f272356m = snippetItem;
        this.f272357n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f272355l.f272363b.accept(new Q<>(this.f272356m, Integer.valueOf(this.f272357n)));
        return G0.f406611a;
    }
}
