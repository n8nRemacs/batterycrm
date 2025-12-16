package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertSellerInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47691c;

/* compiled from: AdvertRichServiceItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.service.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34817o extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertSellerInfo f271340l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f271341m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34817o(AdvertSellerInfo advertSellerInfo, s sVar) {
        super(0);
        this.f271340l = advertSellerInfo;
        this.f271341m = sVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink link;
        AdvertSellerInfo advertSellerInfo = this.f271340l;
        if (advertSellerInfo != null && (link = advertSellerInfo.getLink()) != null) {
            InterfaceC47691c.a.a(this.f271341m.f271371b.get(), link, null, 14);
        }
        return G0.f406611a;
    }
}
