package com.avito.android.advert_collection_adding;

import com.avito.android.deep_linking.links.AddToCollectionLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AddToCollectionHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert_collection_adding.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28259b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28260c f81780l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AddToCollectionLink f81781m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28259b(C28260c c28260c, AddToCollectionLink addToCollectionLink) {
        super(0);
        this.f81780l = c28260c;
        this.f81781m = addToCollectionLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C28260c c28260c = this.f81780l;
        c28260c.f81784h.D0("AddToCollectionHandler", new C28258a(c28260c, this.f81781m));
        return G0.f406611a;
    }
}
