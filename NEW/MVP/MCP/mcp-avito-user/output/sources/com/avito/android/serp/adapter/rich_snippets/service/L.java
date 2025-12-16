package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertXlRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class L extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f271273l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271274m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(AdvertXlItem advertXlItem, O o12) {
        super(0);
        this.f271273l = o12;
        this.f271274m = advertXlItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f271273l.f271284c.get().Ld(this.f271274m, null);
        return G0.f406611a;
    }
}
