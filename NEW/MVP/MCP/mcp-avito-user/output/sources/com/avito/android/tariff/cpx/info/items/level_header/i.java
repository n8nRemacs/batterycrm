package com.avito.android.tariff.cpx.info.items.level_header;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCpxInfoLevelHeaderItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f296545l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f296546m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, j jVar) {
        super(0);
        this.f296545l = aVar;
        this.f296546m = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f296545l.f296529d;
        if (deepLink != null) {
            this.f296546m.f296548c.invoke(deepLink);
        }
        return G0.f406611a;
    }
}
