package com.avito.android.advert_collection_adding;

import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.AddToCollectionLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.CreateAdvertCollectionResult;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47919b;

/* compiled from: AddToCollectionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_adding/c;", "Lev/a;", "Lcom/avito/android/deep_linking/links/AddToCollectionLink;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_collection_adding.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28260c extends AbstractC40161a<AddToCollectionLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.f f81782f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h f81783g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.d f81784h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C25719a f81785i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f81786j = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public C28260c(@Y61.k a.f fVar, @Y61.k h hVar, @Y61.k a.d dVar, @Y61.k C25719a c25719a) {
        this.f81782f = fVar;
        this.f81783g = hVar;
        this.f81784h = dVar;
        this.f81785i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AddToCollectionLink addToCollectionLink = (AddToCollectionLink) deepLink;
        this.f81785i.b(addToCollectionLink, this, null, new C28259b(this, addToCollectionLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f81782f.l1("AddToCollectionHandler");
        l41.g gVar = new l41.g() { // from class: com.avito.android.advert_collection_adding.c.a
            @Override // l41.g
            public final void accept(Object obj) {
                C28260c c28260c = C28260c.this;
                Bundle bundle = ((C47919b) obj).f437159b;
                DeepLink deepLink = (DeepLink) bundle.getParcelable("collection_id");
                CreateAdvertCollectionResult.Created created = (CreateAdvertCollectionResult.Created) bundle.getParcelable("advert_collection");
                c28260c.j(deepLink != null ? new AddToCollectionLink.b.a(deepLink) : created != null ? new AddToCollectionLink.b.c(created.getDeepLink(), created.getId(), created.getName()) : AddToCollectionLink.b.C3983b.f132941b);
            }
        };
        final V2 v22 = V2.f318762a;
        this.f81786j.b(wL1.v0(gVar, new l41.g() { // from class: com.avito.android.advert_collection_adding.c.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f81786j.e();
    }
}
