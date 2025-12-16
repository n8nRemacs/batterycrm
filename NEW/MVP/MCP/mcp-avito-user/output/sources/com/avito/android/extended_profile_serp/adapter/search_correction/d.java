package com.avito.android.extended_profile_serp.adapter.search_correction;

import bB.InterfaceC25487a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SearchCorrectionItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchCorrectionItem f152620l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f152621m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SearchCorrectionItem searchCorrectionItem, e eVar) {
        super(0);
        this.f152620l = searchCorrectionItem;
        this.f152621m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f152620l.f152615f;
        if (deepLink != null) {
            this.f152621m.f152622b.invoke(new InterfaceC25487a.m(deepLink));
        }
        return G0.f406611a;
    }
}
