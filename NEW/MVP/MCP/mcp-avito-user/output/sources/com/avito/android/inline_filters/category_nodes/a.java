package com.avito.android.inline_filters.category_nodes;

import com.avito.android.inline_filters.category_nodes.i;
import com.avito.android.remote.model.category_tree.CategoryTreeResponse;
import kotlin.Metadata;

/* compiled from: CategoryTreeLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_tree/CategoryTreeResponse;", "response", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/category_tree/CategoryTreeResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f171071b;

    public a(c cVar) {
        this.f171071b = cVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f171071b.j(new i.b((CategoryTreeResponse) obj));
    }
}
