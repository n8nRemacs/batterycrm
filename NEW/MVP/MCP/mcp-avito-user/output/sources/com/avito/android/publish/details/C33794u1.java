package com.avito.android.publish.details;

import androidx.view.AbstractC22991Y;
import androidx.view.C23071x;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.K1;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.util.architecture_components.C35747a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PublishDetailsSlotManager.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/u1;", "Lcom/avito/android/publish/details/w1;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.details.u1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33794u1 implements InterfaceC33800w1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.y f235038a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33800w1 f235039b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f235040c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC33678b> f235041d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f235042e = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<K1.AbstractC33668b> f235043f = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: g, reason: collision with root package name */
    public boolean f235044g;

    @Inject
    public C33794u1(@Y61.k com.avito.android.publish.slots.y yVar, @Y61.k InterfaceC33800w1 interfaceC33800w1, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k h31.e<InterfaceC33678b> eVar) {
        this.f235038a = yVar;
        this.f235039b = interfaceC33800w1;
        this.f235040c = interfaceC33535v;
        this.f235041d = eVar;
    }

    @Override // com.avito.android.publish.details.InterfaceC33800w1
    @Y61.k
    public final AbstractC22991Y<K1.AbstractC33668b> a() {
        return new C35747a(this.f235043f, this.f235039b.a());
    }

    @Override // com.avito.android.publish.details.InterfaceC33800w1
    public final void b(@Y61.k Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.l<? super K1.C33667a, kotlin.G0> lVar) {
        this.f235039b.b(set, aVar, lVar);
    }

    @Override // com.avito.android.publish.details.InterfaceC33800w1
    @Y61.k
    public final InterfaceC43160i<K1.AbstractC33668b> c() {
        return C43175k.N(C23071x.a(this.f235043f), this.f235039b.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Set<? extends com.avito.android.category_parameters.j<? extends com.avito.android.remote.model.category_parameters.slot.Slot<?>>>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Set<com.avito.android.category_parameters.j<? extends com.avito.android.remote.model.category_parameters.slot.Slot<?>>>] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Set] */
    @Y61.k
    public final Set<com.avito.android.category_parameters.j<? extends Slot<?>>> d(@Y61.k Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set, @Y61.k ParametersTree parametersTree) {
        ArrayList arrayList = new ArrayList();
        for (ParameterSlot parameterSlot : parametersTree) {
            if (parameterSlot instanceof Slot) {
                arrayList.add(parameterSlot);
            }
        }
        Iterable iterable = (Iterable) set;
        List listM0 = C42745f0.M0(iterable);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listM0, 10));
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.avito.android.category_parameters.j) it.next()).g());
        }
        if (!arrayList2.equals(arrayList)) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : iterable) {
                if (obj instanceof com.avito.android.publish.slots.q) {
                    arrayList3.add(obj);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((com.avito.android.publish.slots.q) it2.next()).clear();
            }
            set = this.f235038a.a(parametersTree);
            io.reactivex.rxjava3.disposables.c cVar = this.f235042e;
            cVar.e();
            Iterable iterable2 = (Iterable) set;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : iterable2) {
                if (obj2 instanceof com.avito.android.deep_linking.K) {
                    arrayList4.add(obj2);
                }
            }
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                io.reactivex.rxjava3.core.z<DeepLink> zVarK = ((com.avito.android.deep_linking.K) it3.next()).k();
                C33783q1 c33783q1 = new C33783q1(this);
                C33785r1 c33785r1 = new C33785r1(this);
                zVarK.getClass();
                cVar.b(zVarK.v0(c33783q1, c33785r1, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : iterable2) {
                if (obj3 instanceof com.avito.android.publish.slots.q) {
                    arrayList5.add(obj3);
                }
            }
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                io.reactivex.rxjava3.core.z<com.avito.android.category_parameters.f> zVarA = ((com.avito.android.publish.slots.q) it4.next()).a();
                C33788s1 c33788s1 = new C33788s1(this, set);
                l41.g<? super Throwable> gVar = C33791t1.f234985b;
                zVarA.getClass();
                cVar.b(zVarA.v0(c33788s1, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : iterable2) {
                if (obj4 instanceof com.avito.android.publish.slots.k) {
                    arrayList6.add(obj4);
                }
            }
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                cVar.b(((com.avito.android.publish.slots.k) it5.next()).a().t0(new C33780p1(this, set)));
            }
        }
        return set;
    }
}
