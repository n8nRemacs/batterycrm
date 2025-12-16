package com.avito.android.favorites.adapter.banner;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SalesPromoItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f156540l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f156541m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f156542n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, DeepLink deepLink, LinkedHashMap linkedHashMap) {
        super(0);
        this.f156540l = eVar;
        this.f156541m = deepLink;
        this.f156542n = linkedHashMap;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f156540l;
        eVar.f156538b.f(this.f156541m);
        eVar.f156539c.O(new ParametrizedEvent(12266, 1, this.f156542n));
        return G0.f406611a;
    }
}
