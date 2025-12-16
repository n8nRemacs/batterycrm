package com.avito.android.beduin.common.form;

import Gh.C13880a;
import Ui.InterfaceC15523b;
import ci.InterfaceC27197a;
import cj.InterfaceC27205c;
import cj.InterfaceC27207e;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_shared.model.utils.q;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import ej.InterfaceC40116e;
import gj.C40692c;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;
import lj.d;
import mj.InterfaceC44087a;
import oj.InterfaceC44784a;
import qj.InterfaceC47406a;

/* compiled from: ComponentsFormImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/c;", "Llj/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC43779a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> f103333a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.form.store.b f103334b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f103335c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47406a<BeduinModel> f103336d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27197a f103337e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27207e f103338f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27205c f103339g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44784a<BeduinModel> f103340h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44087a f103341i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C13880a f103342j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f103343k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f103344l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public Object f103345m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public Object f103346n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> f103347o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f103348p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, Object> f103349q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public String f103350r;

    /* compiled from: ComponentsFormImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<BeduinModel, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f103351l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f103351l = str;
        }

        @Override // Y41.l
        public final Boolean invoke(BeduinModel beduinModel) {
            return Boolean.valueOf(L.f(beduinModel.getId(), this.f103351l));
        }
    }

    /* compiled from: ComponentsFormImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<BeduinModel, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set<String> f103352l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set<String> set) {
            super(1);
            this.f103352l = set;
        }

        @Override // Y41.l
        public final Boolean invoke(BeduinModel beduinModel) {
            return Boolean.valueOf(this.f103352l.contains(beduinModel.getId()));
        }
    }

    @Inject
    public c(@Y61.k InterfaceC40113b<BeduinModel, AbstractC40112a<BeduinModel, InterfaceC40116e>> interfaceC40113b, @Y61.k com.avito.android.beduin.common.form.store.b bVar, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k InterfaceC47406a<BeduinModel> interfaceC47406a, @Y61.k InterfaceC27197a interfaceC27197a, @Y61.k InterfaceC27207e interfaceC27207e, @Y61.k InterfaceC27205c interfaceC27205c, @Y61.k InterfaceC44784a<BeduinModel> interfaceC44784a, @Y61.k InterfaceC44087a interfaceC44087a, @Y61.k C13880a c13880a, @Y61.k C40692c c40692c) {
        this.f103333a = interfaceC40113b;
        this.f103334b = bVar;
        this.f103335c = interfaceC15523b;
        this.f103336d = interfaceC47406a;
        this.f103337e = interfaceC27197a;
        this.f103338f = interfaceC27207e;
        this.f103339g = interfaceC27205c;
        this.f103340h = interfaceC44784a;
        this.f103341i = interfaceC44087a;
        this.f103342j = c13880a;
        this.f103343k = !c40692c.f396753a;
        this.f103344l = !c40692c.f396754b;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f103345m = c42784z0;
        this.f103346n = c42784z0;
        io.reactivex.rxjava3.subjects.b<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> bVarN0 = io.reactivex.rxjava3.subjects.b.N0();
        this.f103347o = bVarN0;
        this.f103348p = new C41981q0(bVarN0);
        this.f103349q = new HashMap<>();
        this.f103350r = "unknown";
    }

    @Override // lj.InterfaceC43779a
    @Y61.k
    public final ArrayList a() {
        return C28809e.a(i.f103359l, e());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // lj.InterfaceC43779a
    @Y61.l
    public final BeduinModel b(@Y61.k String str) {
        return (BeduinModel) C42745f0.G(C28809e.b(new a(str), this.f103345m));
    }

    @Override // lj.e
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF103350r() {
        return this.f103350r;
    }

    @Override // lj.InterfaceC43779a
    @Y61.l
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> d() {
        return this.f103347o.P0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // lj.InterfaceC43779a
    @Y61.k
    public final ArrayList e() {
        ?? r02 = this.f103345m;
        LinkedHashMap parameters = getParameters();
        return C28809e.c(new h(parameters, P0.k(P0.k(parameters, this.f103337e.getF58109f()), this.f103341i.b())), r02);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.avito.android.beduin_models.BeduinModel>] */
    @Override // lj.InterfaceC43779a
    @Y61.k
    public final List<BeduinModel> f() {
        return this.f103345m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // lj.InterfaceC43779a
    public final boolean g(@Y61.k Set<String> set) {
        ArrayList arrayListB = C28809e.b(new b(set), this.f103345m);
        if (arrayListB.isEmpty()) {
            return true;
        }
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            if (!((BeduinModel) it.next()).isValid()) {
                return false;
            }
        }
        return true;
    }

    @Override // lj.InterfaceC43779a
    @Y61.k
    /* renamed from: getComponents, reason: from getter */
    public final C41981q0 getF103348p() {
        return this.f103348p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // lj.InterfaceC43779a
    @Y61.k
    public final LinkedHashMap getParameters() {
        return P0.k(q.a(this.f103345m, this.f103340h), this.f103349q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.List] */
    @Override // lj.e
    public final void h(@Y61.k lj.d dVar) {
        boolean z12 = dVar instanceof d.k;
        InterfaceC27197a interfaceC27197a = this.f103337e;
        boolean z13 = this.f103343k;
        if (z12) {
            d.k kVar = (d.k) dVar;
            l(kVar.f414167a);
            if (L.f(this.f103350r, "unknown")) {
                C13880a c13880a = this.f103342j;
                if (!c13880a.f6706c) {
                    c13880a.f6704a.b(c13880a.f6705b);
                    c13880a.f6706c = true;
                }
            }
            String str = kVar.f414168b;
            this.f103350r = str;
            this.f103334b.a(str, this);
            if (z13) {
                interfaceC27197a.a(this);
            }
            if (this.f103344l) {
                this.f103338f.a(this);
                this.f103339g.a(this);
            }
        } else if (dVar instanceof d.C11800d) {
            l(C42745f0.h0(((d.C11800d) dVar).f414159a, (Collection) this.f103345m));
        } else if (dVar instanceof d.c) {
            l(C42745f0.h0((Iterable) this.f103345m, ((d.c) dVar).f414158a));
        } else if (dVar instanceof d.b) {
            d.b bVar = (d.b) dVar;
            l(C28809e.c(new com.avito.android.beduin.common.form.a(bVar.f414157b, AddType.f103316b, bVar.f414156a), this.f103345m));
        } else if (dVar instanceof d.a) {
            d.a aVar = (d.a) dVar;
            l(C28809e.c(new com.avito.android.beduin.common.form.a(aVar.f414155b, AddType.f103317c, aVar.f414154a), this.f103345m));
        } else if (dVar instanceof d.h) {
            d.h hVar = (d.h) dVar;
            BeduinModel beduinModel = hVar.f414163a;
            BeduinModel beduinModel2 = hVar.f414164b;
            if (!L.f(beduinModel, beduinModel2)) {
                l(C28809e.c(new f(Collections.singletonMap(beduinModel, beduinModel2)), this.f103345m));
            }
        } else if (dVar instanceof d.i) {
            ArrayList<d.h> arrayList = ((d.i) dVar).f414165a;
            if (!arrayList.isEmpty()) {
                int iF2 = P0.f(C42745f0.q(arrayList, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                for (d.h hVar2 : arrayList) {
                    linkedHashMap.put(hVar2.f414163a, hVar2.f414164b);
                }
                l(C28809e.c(new f(linkedHashMap), this.f103345m));
            }
        } else if (dVar instanceof d.j) {
            Map<String, List<BeduinModel>> map = ((d.j) dVar).f414166a;
            if (!map.isEmpty()) {
                l(C28809e.c(new g(map), this.f103345m));
            }
        } else if (dVar instanceof d.e) {
            Map<String, List<BeduinModelTransform>> map2 = ((d.e) dVar).f414160a;
            if (!map2.isEmpty()) {
                l(C28809e.c(new com.avito.android.beduin.common.form.b(map2), this.f103345m));
            }
        } else if (dVar instanceof d.g) {
            List<String> list = ((d.g) dVar).f414162a;
            if (!list.isEmpty()) {
                l(C28809e.a(new e(C42745f0.P0(list)), this.f103345m));
            }
        } else {
            if (!(dVar instanceof d.f)) {
                throw new NoWhenBranchMatchedException();
            }
            l(this.f103345m);
        }
        G0 g02 = G0.f406611a;
        if (z13) {
            interfaceC27197a.c(this);
        }
    }

    @Override // lj.InterfaceC43779a
    @Y61.k
    /* renamed from: i, reason: from getter */
    public final HashMap getF103349q() {
        return this.f103349q;
    }

    @Override // lj.InterfaceC43779a
    public final boolean isValid() {
        Iterable iterable = (Iterable) this.f103345m;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((BeduinModel) it.next()).isValid()) {
                return false;
            }
        }
        return true;
    }

    @Override // lj.InterfaceC43779a
    public final void j(@Y61.k Map<String, ? extends Object> map) {
        this.f103349q.putAll(map);
        if (this.f103343k) {
            this.f103337e.c(this);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // lj.InterfaceC43779a
    public final void k() {
        ArrayList arrayListA = a();
        if (arrayListA.containsAll((Collection) this.f103346n) && this.f103346n.containsAll(arrayListA)) {
            return;
        }
        this.f103346n = arrayListA;
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f103333a.a((BeduinModel) it.next(), this, this.f103335c));
        }
        this.f103347o.onNext(arrayList);
    }

    public final void l(List<? extends BeduinModel> list) {
        this.f103345m = C28809e.c(new d(this), list);
        ArrayList arrayListA = a();
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f103333a.a((BeduinModel) it.next(), this, this.f103335c));
        }
        this.f103347o.onNext(arrayList);
    }
}
