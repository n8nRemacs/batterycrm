package com.avito.android.extended_profile_widgets.adapter.banner;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.C44619e;

/* compiled from: BannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f154241l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BannerItem f154242m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, BannerItem bannerItem) {
        super(0);
        this.f154241l = eVar;
        this.f154242m = bannerItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f154241l;
        eVar.f154243b.invoke(new C44619e(this.f154242m));
        return G0.f406611a;
    }
}
