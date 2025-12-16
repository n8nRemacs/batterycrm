package com.avito.android.tariff.cpx.info.items.header;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCpxInfoHeaderItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f296512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f296513m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, i iVar) {
        super(0);
        this.f296512l = cVar;
        this.f296513m = iVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        b bVar = this.f296512l.f296506e;
        if (bVar != null && (deepLink = bVar.f296502b) != null) {
            this.f296513m.f296515b.invoke(deepLink);
        }
        return G0.f406611a;
    }
}
