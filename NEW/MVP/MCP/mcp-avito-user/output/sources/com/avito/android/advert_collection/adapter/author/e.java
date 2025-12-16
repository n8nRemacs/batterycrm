package com.avito.android.advert_collection.adapter.author;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AuthorItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/adapter/author/e;", "Lcom/avito/android/advert_collection/adapter/author/c;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.l<? super DeepLink, G0> f81264b;

    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AuthorItem authorItem = (AuthorItem) aVar;
        gVar.Gf(authorItem);
        gVar.a(new d(this, authorItem));
    }

    @Override // com.avito.android.advert_collection.adapter.author.c
    public final void u0(@l Y41.l<? super DeepLink, G0> lVar) {
        this.f81264b = lVar;
    }
}
