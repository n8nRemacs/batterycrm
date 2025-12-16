package com.avito.android.serp.adapter.recommendations_vacancy;

import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RdsAdvertVacancyItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f270584l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f270585m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, AdvertItem advertItem) {
        super(0);
        this.f270584l = hVar;
        this.f270585m = advertItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC34863v interfaceC34863v = this.f270584l.f270595b.get();
        AdvertItem advertItem = this.f270585m;
        interfaceC34863v.Ld(advertItem, new AbstractC30567a.k(advertItem.f268388K));
        return G0.f406611a;
    }
}
