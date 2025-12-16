package com.avito.android.inline_filters.dialog.category_nodes.adapter;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NodeItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f171434l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NodeItem f171435m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, NodeItem nodeItem) {
        super(0);
        this.f171434l = jVar;
        this.f171435m = nodeItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f171434l.f171436b.f171509i.accept(this.f171435m);
        return G0.f406611a;
    }
}
