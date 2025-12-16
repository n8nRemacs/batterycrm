package com.avito.android.bxcontent.garage;

import com.avito.android.advert.deeplinks.delivery.p;
import com.avito.android.deep_linking.links.AddCarToGarageLink;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AddCarToGarageDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f111101l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AddCarToGarageLink f111102m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, AddCarToGarageLink addCarToGarageLink) {
        super(0);
        this.f111101l = aVar;
        this.f111102m = addCarToGarageLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f111101l;
        AddCarToGarageLink addCarToGarageLink = this.f111102m;
        String str = addCarToGarageLink.f132934c;
        g gVar = aVar.f111096i;
        gVar.getClass();
        new C42007e(new p(gVar, addCarToGarageLink.f132935d, str, 5)).z(gVar.f111111b.a()).s(aVar.f111097j.e()).x(new b(aVar), new c(aVar));
        return G0.f406611a;
    }
}
