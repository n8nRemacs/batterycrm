package com.avito.android.advert.deeplinks;

import Fc1.E0;
import com.avito.android.deep_linking.links.AddItemToCartLink;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import io.reactivex.rxjava3.internal.operators.single.C42023v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AddItemToCartDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f68895l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AddItemToCartLink f68896m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, AddItemToCartLink addItemToCartLink) {
        super(0);
        this.f68895l = aVar;
        this.f68896m = addItemToCartLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f68895l;
        AddItemToCartLink addItemToCartLink = this.f68896m;
        C42022u c42022uK = g1.a(aVar.f68884h.a(addItemToCartLink.f132936b, addItemToCartLink.f132937c)).k(new c(aVar, addItemToCartLink));
        InterfaceC35745a5 interfaceC35745a5 = aVar.f68887k;
        aVar.f68892p.b(new C42023v(c42022uK.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).j(new d(aVar)), new E0(aVar, 4)).x(new e(aVar), new g(aVar)));
        return G0.f406611a;
    }
}
