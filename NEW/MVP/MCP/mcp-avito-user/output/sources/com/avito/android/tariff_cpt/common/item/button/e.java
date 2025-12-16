package com.avito.android.tariff_cpt.common.item.button;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCptButtonItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f297526l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f297527m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, DeepLink deepLink) {
        super(0);
        this.f297526l = fVar;
        this.f297527m = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f297526l.f297528b.onNext(this.f297527m);
        return G0.f406611a;
    }
}
