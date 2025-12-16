package com.avito.android.advert.deeplinks.delivery_order;

import com.avito.android.deep_linking.links.DeliveryOrderCreateLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;

/* compiled from: DeliveryOrderCreateDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f68985l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeliveryOrderCreateLink f68986m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, DeliveryOrderCreateLink deliveryOrderCreateLink) {
        super(0);
        this.f68985l = aVar;
        this.f68986m = deliveryOrderCreateLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f68985l;
        N0 n02 = aVar.f68981m;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        aVar.f68981m = C43259k.d(U.f(aVar.f68982n, new c(kotlinx.coroutines.N.f410714t2, aVar)), null, null, new e(aVar, this.f68986m, null), 3);
        return G0.f406611a;
    }
}
