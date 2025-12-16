package com.avito.android.body_condition;

import android.view.View;
import com.avito.android.deep_linking.links.CarBodyCondition;
import com.avito.android.deep_linking.links.InterfaceC29679e;
import com.avito.android.deep_linking.links.PointWithPosition;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CarBodyConditionItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/body_condition/c;", "Lcom/avito/android/body_condition/f;", "<init>", "()V", "_avito_body-condition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class c implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<View, PointWithPosition>> f106804b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106805c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<InterfaceC29679e> f106806d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f106807e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public InterfaceC29679e f106808f;

    public c() {
        com.jakewharton.rxrelay3.c<Q<View, PointWithPosition>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106804b = cVar;
        this.f106805c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<InterfaceC29679e> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106806d = cVar2;
        this.f106807e = new C41981q0(cVar2);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CarBodyConditionItem carBodyConditionItem = (CarBodyConditionItem) aVar;
        boolean z12 = carBodyConditionItem.f106799d;
        gVar.rM(z12);
        CarBodyCondition carBodyCondition = carBodyConditionItem.f106798c;
        gVar.setTitle(carBodyCondition.getTitle());
        List<InterfaceC29679e> sides = carBodyCondition.getSides();
        InterfaceC29679e interfaceC29679e = this.f106808f;
        InterfaceC29679e interfaceC29679e2 = (interfaceC29679e == null || !C42745f0.r(sides, interfaceC29679e)) ? (InterfaceC29679e) C42745f0.E(sides) : this.f106808f;
        this.f106808f = interfaceC29679e2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sides.iterator();
        while (it.hasNext()) {
            C42745f0.h(k(((InterfaceC29679e) it.next()).getPoints()), arrayList);
        }
        gVar.fh(interfaceC29679e2, k(interfaceC29679e2.getPoints()), z12);
        gVar.UU(sides, arrayList, sides.indexOf(interfaceC29679e2), z12);
        gVar.GS(new a(this));
        gVar.a70(new b(this, gVar, carBodyConditionItem));
    }

    @Override // com.avito.android.body_condition.f
    @Y61.k
    /* renamed from: V0, reason: from getter */
    public final C41981q0 getF106807e() {
        return this.f106807e;
    }

    @Y61.k
    public abstract Collection<PointWithPosition> k(@Y61.k Collection<? extends PointWithPosition> collection);

    @Override // com.avito.android.body_condition.f
    @Y61.k
    /* renamed from: z1, reason: from getter */
    public final C41981q0 getF106805c() {
        return this.f106805c;
    }
}
