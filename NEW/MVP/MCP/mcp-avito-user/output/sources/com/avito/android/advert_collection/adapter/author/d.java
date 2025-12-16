package com.avito.android.advert_collection.adapter.author;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AuthorItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f81262l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AuthorItem f81263m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, AuthorItem authorItem) {
        super(0);
        this.f81262l = eVar;
        this.f81263m = authorItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        l<? super DeepLink, G0> lVar = this.f81262l.f81264b;
        if (lVar != null) {
            lVar.invoke(this.f81263m.f81257i);
        }
        return G0.f406611a;
    }
}
