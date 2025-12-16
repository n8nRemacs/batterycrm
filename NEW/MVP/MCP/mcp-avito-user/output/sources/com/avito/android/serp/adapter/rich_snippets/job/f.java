package com.avito.android.serp.adapter.rich_snippets.job;

import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertRichJobItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f270792l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f270793m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, AdvertItem advertItem) {
        super(0);
        this.f270792l = jVar;
        this.f270793m = advertItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.serp.adapter.rich_snippets.a aVar = this.f270792l.f270804c.get();
        AdvertItem advertItem = this.f270793m;
        aVar.Ld(advertItem, new AbstractC30567a.l(advertItem.f268388K));
        return G0.f406611a;
    }
}
