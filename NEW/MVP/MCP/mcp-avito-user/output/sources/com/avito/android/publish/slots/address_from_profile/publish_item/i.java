package com.avito.android.publish.slots.address_from_profile.publish_item;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.slots.address_from_profile.InterfaceC34118b;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: AddressListPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/i;", "Lcom/avito/android/publish/slots/address_from_profile/publish_item/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d2<k> f242906b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.slots.address_from_profile.g f242907c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34118b f242908d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f242909e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43238h f242910f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public N0 f242911g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final o f242912h = new o();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final e2 f242913i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final d2<k> f242914j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final d2<G0> f242915k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f242916l;

    @Inject
    public i(@Y61.k d2<k> d2Var, @Y61.k R0 r02, @Y61.k com.avito.android.publish.slots.address_from_profile.g gVar, @Y61.k InterfaceC34118b interfaceC34118b, @Y61.k com.avito.android.details.a aVar) {
        this.f242906b = d2Var;
        this.f242907c = gVar;
        this.f242908d = interfaceC34118b;
        this.f242909e = aVar;
        this.f242910f = U.a(r02.b());
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        e2 e2VarA = f2.a(0, 1, bufferOverflow);
        this.f242913i = e2VarA;
        this.f242914j = C43175k.a(e2VarA);
        this.f242915k = C43175k.a(f2.a(0, 1, bufferOverflow));
        this.f242916l = true;
    }

    public final ArrayList O(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(k.a((k) it.next(), V() == null, false, 95));
        }
        return arrayList;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((a) eVar, (s) aVar);
    }

    public final AddressParameter.Value V() {
        AddressParameter addressParameter;
        List<ParameterSlot> parameters;
        Object next;
        CategoryParameters categoryParametersC0 = this.f242909e.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
            addressParameter = null;
        } else {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof AddressParameter) {
                    break;
                }
            }
            if (!(next instanceof AddressParameter)) {
                next = null;
            }
            addressParameter = (AddressParameter) next;
        }
        if (addressParameter != null) {
            return addressParameter.getValue();
        }
        return null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        AddressParameter addressParameter;
        List<ParameterSlot> parameters;
        Object next;
        a aVar2 = (a) eVar;
        s sVar = (s) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof q) {
                obj = obj2;
            }
        }
        if (!(obj instanceof q)) {
            obj = null;
        }
        q qVar = (q) obj;
        if (qVar == null) {
            k(aVar2, sVar);
            return;
        }
        CategoryParameters categoryParametersC0 = this.f242909e.C0();
        if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
            addressParameter = null;
        } else {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next instanceof AddressParameter) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (!(next instanceof AddressParameter)) {
                next = null;
            }
            addressParameter = (AddressParameter) next;
        }
        HasError.Error error = addressParameter != null ? addressParameter.getError() : null;
        o oVar = this.f242912h;
        List<k> list2 = qVar.f242943a;
        if (error == null || addressParameter.getErrorPlace() != AddressParameter.EmptyValueErrorPlace.ADDRESSES_LIST) {
            oVar.c(list2);
            List<k> listB = oVar.b();
            if (listB != null) {
                aVar2.V40(listB);
            }
            aVar2.wK(null, false);
        } else {
            ArrayList arrayListO = O(list2);
            if (sVar instanceof r) {
                aVar2.wK(((r) sVar).f242952i, V() == null);
            }
            oVar.c(arrayListO);
            List<k> listB2 = oVar.b();
            if (listB2 != null) {
                aVar2.V40(listB2);
            }
        }
        Boolean bool = qVar.f242944b;
        aVar2.GF(bool != null ? bool.booleanValue() : false);
    }

    public final void k(@Y61.k a aVar, @Y61.k s sVar) {
        AddressParameter addressParameter;
        List<ParameterSlot> parameters;
        Object next;
        InterfaceC34118b interfaceC34118b = this.f242908d;
        aVar.VV(interfaceC34118b.getF242830a(), interfaceC34118b.getF242831b());
        if (sVar instanceof r) {
            r rVar = (r) sVar;
            aVar.yD(false);
            aVar.wj(false);
            aVar.kM(true);
            String f242830a = rVar.f242948e;
            if (f242830a == null || C43066x.K(f242830a)) {
                f242830a = interfaceC34118b.getF242830a();
            }
            aVar.VV(f242830a, interfaceC34118b.getF242831b());
            List<k> list = rVar.f242946c;
            if (list.size() == 1) {
                this.f242913i.K5((k) C42745f0.E(list));
                List<k> list2 = list;
                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(k.a((k) it.next(), false, true, 63));
                }
                list = arrayList;
            }
            boolean z12 = this.f242916l;
            o oVar = this.f242912h;
            if (z12) {
                oVar.c(list);
                List<k> listB = oVar.b();
                if (listB != null) {
                    aVar.pI(rVar, listB, new e(this, aVar));
                }
                this.f242916l = false;
            } else {
                oVar.c(list);
                List<k> listB2 = oVar.b();
                if (listB2 != null) {
                    CategoryParameters categoryParametersC0 = this.f242909e.C0();
                    if (categoryParametersC0 == null || (parameters = categoryParametersC0.getParameters()) == null) {
                        addressParameter = null;
                    } else {
                        Iterator<T> it2 = parameters.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it2.next();
                                if (next instanceof AddressParameter) {
                                    break;
                                }
                            }
                        }
                        if (!(next instanceof AddressParameter)) {
                            next = null;
                        }
                        addressParameter = (AddressParameter) next;
                    }
                    if (addressParameter != null && addressParameter.hasError() && addressParameter.getErrorPlace() == AddressParameter.EmptyValueErrorPlace.ADDRESSES_LIST) {
                        listB2 = O(listB2);
                        aVar.wK(rVar.f242952i, V() == null);
                    }
                    aVar.pI(rVar, listB2, new f(this, aVar));
                }
            }
            this.f242911g = C43259k.d(this.f242910f, null, null, new g(this, aVar, rVar, null), 3);
            aVar.d(new h(this));
        } else if (sVar instanceof p) {
            aVar.yD(true);
            aVar.kM(false);
            aVar.wK(null, false);
        } else if (sVar instanceof n) {
            aVar.wj(true);
            aVar.kM(false);
            aVar.wK(null, false);
        }
        aVar.gu(interfaceC34118b.getF242831b(), new d(this));
    }

    @Override // com.avito.android.publish.slots.address_from_profile.publish_item.c
    @Y61.k
    public final d2<k> v7() {
        return this.f242914j;
    }
}
