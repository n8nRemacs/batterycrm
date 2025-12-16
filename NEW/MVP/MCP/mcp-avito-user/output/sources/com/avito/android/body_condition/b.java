package com.avito.android.body_condition;

import com.avito.android.deep_linking.links.InterfaceC29679e;
import com.avito.android.deep_linking.links.PointWithPosition;
import java.util.Collection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CarBodyConditionItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/e;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.l<InterfaceC29679e, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f106801l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f106802m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CarBodyConditionItem f106803n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, g gVar, CarBodyConditionItem carBodyConditionItem) {
        super(1);
        this.f106801l = cVar;
        this.f106802m = gVar;
        this.f106803n = carBodyConditionItem;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC29679e interfaceC29679e) {
        InterfaceC29679e interfaceC29679e2 = interfaceC29679e;
        c cVar = this.f106801l;
        cVar.f106808f = interfaceC29679e2;
        Collection<PointWithPosition> collectionK = cVar.k(interfaceC29679e2.getPoints());
        CarBodyConditionItem carBodyConditionItem = this.f106803n;
        boolean z12 = carBodyConditionItem.f106799d;
        g gVar = this.f106802m;
        gVar.fh(interfaceC29679e2, collectionK, z12);
        gVar.mq(carBodyConditionItem.f106798c.getSides().indexOf(interfaceC29679e2), carBodyConditionItem.f106799d);
        cVar.f106806d.accept(interfaceC29679e2);
        return G0.f406611a;
    }
}
