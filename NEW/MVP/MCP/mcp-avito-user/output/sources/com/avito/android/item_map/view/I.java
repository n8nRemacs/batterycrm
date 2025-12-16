package com.avito.android.item_map.view;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.item_map.ItemMapFragment;
import com.avito.android.item_map.view.Q;
import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.util.InterfaceC35745a5;
import com.jakewharton.rxbinding4.view.C37722i;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import l41.InterfaceC43543a;
import lW.InterfaceC43691a;
import pO.InterfaceC46983a;

/* compiled from: ItemMapPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/I;", "Lcom/avito/android/item_map/view/k;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class I implements InterfaceC31074k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public ItemMapState f173414a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L f173415b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f173416c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33034d f173417d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.find.o f173418e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.item_map.routes.k f173419f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43691a f173420g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46983a f173421h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final B2 f173422i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public V f173423j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public ItemMapFragment f173424k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f173425l = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public I(@Y61.k ItemMapState itemMapState, @Y61.k L l12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC33034d interfaceC33034d, @Y61.k com.avito.android.location.find.o oVar, @Y61.k com.avito.android.item_map.routes.k kVar, @Y61.k InterfaceC43691a interfaceC43691a, @Y61.k InterfaceC46983a interfaceC46983a, @Y61.k B2 b22) {
        this.f173414a = itemMapState;
        this.f173415b = l12;
        this.f173416c = interfaceC35745a5;
        this.f173417d = interfaceC33034d;
        this.f173418e = oVar;
        this.f173419f = kVar;
        this.f173420g = interfaceC43691a;
        this.f173421h = interfaceC46983a;
        this.f173422i = b22;
    }

    public static void g(I i12, int i13) {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = (i13 & 1) != 0 ? null : bool;
        if ((i13 & 2) != 0) {
            bool = null;
        }
        String str = i12.f173414a.f173444q;
        if (str == null) {
            FindLocationPage findLocationPage = FindLocationPage.f181725c;
            str = "buyer_item_map";
        }
        i12.f173420g.e(str);
        ItemMapState itemMapState = i12.f173414a;
        i12.f173414a = ItemMapState.a(itemMapState, null, false, null, 0.0f, null, bool2 != null ? bool2.booleanValue() : itemMapState.f173445r, bool != null ? bool.booleanValue() : i12.f173414a.f173446s, 268238847);
        i12.f173425l.b(i12.f173417d.g());
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    public final void S() {
        String str;
        ItemMapState itemMapState = this.f173414a;
        if (itemMapState.f173446s && (str = itemMapState.f173429b) != null) {
            this.f173421h.f(null, str);
        }
        this.f173420g.f(null, "PERMISSION DENIED");
        this.f173419f.d(false);
        ItemMapState itemMapState2 = this.f173414a;
        if (itemMapState2.f173446s || itemMapState2.f173445r) {
            this.f173425l.b(this.f173417d.h());
        }
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    public final void a() {
        AvitoMap avitoMap;
        V v12 = this.f173423j;
        if (v12 == null || (avitoMap = v12.f173582q) == null) {
            return;
        }
        avitoMap.onStop(false);
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    public final void b() {
        this.f173420g.g();
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    public final void b0(@Y61.k ActivityC22955m activityC22955m) {
        io.reactivex.rxjava3.core.z zVarB = this.f173418e.b(activityC22955m, (4 & 2) == 0, (4 & 4) == 0);
        com.avito.android.api.a aVar = new com.avito.android.api.a(23, new G(this));
        C31075l c31075l = new C31075l(4, new H(this));
        zVarB.getClass();
        this.f173425l.b(zVarB.v0(aVar, c31075l, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    public final void c() {
        V v12 = this.f173423j;
        if (v12 != null) {
            AvitoMap avitoMap = v12.f173582q;
            if (avitoMap != null) {
                avitoMap.onStop(true);
            }
            v12.f173582q = null;
        }
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    public final void c0() {
        this.f173424k = null;
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    public final void d(@Y61.k V v12) {
        this.f173423j = v12;
        com.jakewharton.rxrelay3.b f177856o = v12.f173547C.getF177856o();
        InterfaceC35745a5 interfaceC35745a5 = this.f173416c;
        io.reactivex.rxjava3.core.z<T> zVarQ0 = f177856o.j0(interfaceC35745a5.e()).q0(1L);
        C31075l c31075l = new C31075l(7, new C31085w(this, v12));
        l41.g<? super Throwable> aVar = new com.avito.android.api.a(27, C31087y.f173641l);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = zVarQ0.v0(c31075l, aVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = this.f173425l;
        cVar.b(dVarV0);
        cVar.b(C37722i.a(v12.f173552H).j0(interfaceC35745a5.e()).v0(new com.avito.android.api.a(28, new C31088z(this)), new com.avito.android.api.a(29, A.f173406l), interfaceC43543a));
        io.reactivex.rxjava3.core.z<G0> zVarA = C37722i.a(v12.f173550F);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.core.H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        cVar.b(zVarA.C0(1000L, timeUnit, h12).j0(interfaceC35745a5.e()).v0(new C31075l(0, new B(this)), new C31075l(1, new C(this)), interfaceC43543a));
        cVar.b(C37722i.a(v12.f173553I).C0(1000L, timeUnit, h12).j0(interfaceC35745a5.e()).v0(new C31075l(2, new D(this)), new C31075l(3, E.f173410l), interfaceC43543a));
        cVar.b(C37722i.a(v12.f173554J).C0(1000L, timeUnit, h12).j0(interfaceC35745a5.e()).v0(new C31075l(5, new F(this)), new C31075l(6, C31076m.f173628l), interfaceC43543a));
        com.jakewharton.rxrelay3.c<G0> cVar2 = v12.f173590y;
        cVar2.getClass();
        cVar.b(cVar2.C0(1000L, timeUnit, h12).j0(interfaceC35745a5.e()).v0(new C31075l(8, new C31077n(this)), new C31075l(9, C31078o.f173630l), interfaceC43543a));
        cVar.b(v12.f173588w.j0(interfaceC35745a5.e()).v0(new C31075l(10, new C31079p(this)), new C31075l(11, C31080q.f173632l), interfaceC43543a));
        cVar.b(v12.f173589x.j0(interfaceC35745a5.e()).v0(new C31075l(12, new r(v12)), new C31075l(13, C31081s.f173634l), interfaceC43543a));
        S s5 = v12.f173569d;
        cVar.b(s5.f173501n.d0(new com.avito.android.blueprints.publish.reg_number.d(8, new Y(v12))).j0(interfaceC35745a5.e()).v0(new C31075l(14, new C31082t(this)), new com.avito.android.api.a(24, C31083u.f173636l), interfaceC43543a));
        cVar.b(s5.f173502o.d0(new com.avito.android.blueprints.publish.reg_number.d(9, new X(v12))).j0(interfaceC35745a5.e()).v0(new com.avito.android.api.a(25, new C31084v(this)), new com.avito.android.api.a(26, C31086x.f173640l), interfaceC43543a));
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    @Y61.k
    /* renamed from: d0, reason: from getter */
    public final ItemMapState getF173414a() {
        return this.f173414a;
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    public final void e() {
        AvitoMap avitoMap;
        V v12 = this.f173423j;
        if (v12 != null && (avitoMap = v12.f173582q) != null) {
            avitoMap.onStart();
        }
        RouteButtons routeButtons = this.f173414a.f173442o;
        if (routeButtons != null && routeButtons.getHasCreateRouteButton() && routeButtons.getNeedToNewRouteFlow()) {
            this.f173421h.c(routeButtons.getAbToken());
            this.f173425l.b(this.f173417d.d());
        }
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    public final void e0() {
        this.f173423j = null;
        this.f173425l.e();
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    public final void e1(@Y61.l String str) {
        if (str != null) {
            this.f173420g.f(null, str);
            V v12 = this.f173423j;
            if (v12 != null) {
                Q.a.a(v12, R.string.location_not_found);
            }
        }
        this.f173419f.d(false);
    }

    @Override // com.avito.android.item_map.view.InterfaceC31074k
    public final void f(@Y61.k ItemMapFragment itemMapFragment) {
        this.f173424k = itemMapFragment;
    }
}
