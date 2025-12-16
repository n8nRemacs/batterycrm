package GN;

import com.avito.android.inline_filters.category_nodes.CategoryTreeLink;
import com.avito.android.inline_filters.category_nodes.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CategoryTreeLinkHandlerModule_ProvideCategoryTreeLinkMapperFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.inline_filters.category_nodes.e f6472a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.inline_filters.category_nodes.h f6473b;

    public b(com.avito.android.inline_filters.category_nodes.e eVar, com.avito.android.inline_filters.category_nodes.h hVar) {
        this.f6472a = eVar;
        this.f6473b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f6473b.get();
        com.avito.android.inline_filters.category_nodes.e eVar = this.f6472a;
        a.f6471a.getClass();
        return new C43834a(CategoryTreeLink.class, gVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CategoryTreeLink.class), eVar));
    }
}
