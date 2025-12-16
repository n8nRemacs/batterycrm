package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertSellerInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47691c;

/* compiled from: AdvertXlRichServiceItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class K extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertSellerInfo f271271l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O f271272m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(AdvertSellerInfo advertSellerInfo, O o12) {
        super(0);
        this.f271271l = advertSellerInfo;
        this.f271272m = o12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink link;
        AdvertSellerInfo advertSellerInfo = this.f271271l;
        if (advertSellerInfo != null && (link = advertSellerInfo.getLink()) != null) {
            InterfaceC47691c.a.a(this.f271272m.f271283b.get(), link, null, 14);
        }
        return G0.f406611a;
    }
}
