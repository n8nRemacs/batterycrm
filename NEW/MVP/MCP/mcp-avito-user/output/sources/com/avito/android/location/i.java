package com.avito.android.location;

import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.location.r;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.LocationKt;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.U;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lW.InterfaceC43691a;

/* compiled from: LocationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/i;", "Lcom/avito/android/location/h;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements InterfaceC31506h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30715a f181781a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r f181782b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f181783c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final xI.e f181784d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43691a f181785e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Location f181786f;

    /* compiled from: LocationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/Location;", "it", "Lkotlin/Q;", "", "apply", "(Lcom/avito/android/remote/model/Location;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Location location = (Location) obj;
            Location location2 = i.this.f181786f;
            return new Q(location, Boolean.valueOf((location2 == null || location.equals(location2)) ? false : true));
        }
    }

    /* compiled from: LocationInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/location/a;", "it", "apply", "(Lcom/avito/android/location/a;)Lcom/avito/android/location/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Location location;
            C31497a c31497a = (C31497a) obj;
            InterfaceC43691a interfaceC43691a = i.this.f181785e;
            q qVar = c31497a.f181724c;
            interfaceC43691a.b(c31497a.f181722a, c31497a.f181723b, (qVar == null || (location = qVar.f181849a) == null) ? null : location.getId());
            return c31497a;
        }
    }

    /* compiled from: LocationInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location/a;", "wrappedLoc", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/Location;", "apply", "(Lcom/avito/android/location/a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {
        public c() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Object objK;
            q qVar = ((C31497a) obj).f181724c;
            Object obj2 = null;
            if (qVar != null) {
                i iVar = i.this;
                Location location = iVar.f181786f;
                Location location2 = qVar.f181849a;
                if (L.f(location2.getId(), "")) {
                    objK = io.reactivex.rxjava3.core.z.c0(location2);
                } else {
                    xI.e eVar = iVar.f181784d;
                    if (location != null && location2.equals(location)) {
                        eVar.L(null);
                        objK = io.reactivex.rxjava3.core.z.c0(location.copy((3839 & 1) != 0 ? location.id : null, (3839 & 2) != 0 ? location.names : null, (3839 & 4) != 0 ? location.hasMetro : false, (3839 & 8) != 0 ? location.hasChildren : false, (3839 & 16) != 0 ? location.hasDirections : false, (3839 & 32) != 0 ? location.hasDistricts : false, (3839 & 64) != 0 ? location.parent : null, (3839 & 128) != 0 ? location.from : null, (3839 & 256) != 0 ? location.forcedByUser : qVar.f181851c, (3839 & 512) != 0 ? location.coordinates : null, (3839 & 1024) != 0 ? location.forcedLocationForRecommendation : null, (3839 & 2048) != 0 ? location.internalId : null));
                    } else if (qVar.f181850b) {
                        eVar.L(null);
                        boolean z12 = qVar.f181851c;
                        Location location3 = qVar.f181849a;
                        objK = io.reactivex.rxjava3.core.z.c0(location3.copy((3839 & 1) != 0 ? location3.id : null, (3839 & 2) != 0 ? location3.names : null, (3839 & 4) != 0 ? location3.hasMetro : false, (3839 & 8) != 0 ? location3.hasChildren : false, (3839 & 16) != 0 ? location3.hasDirections : false, (3839 & 32) != 0 ? location3.hasDistricts : false, (3839 & 64) != 0 ? location3.parent : null, (3839 & 128) != 0 ? location3.from : null, (3839 & 256) != 0 ? location3.forcedByUser : z12, (3839 & 512) != 0 ? location3.coordinates : null, (3839 & 1024) != 0 ? location3.forcedLocationForRecommendation : null, (3839 & 2048) != 0 ? location3.internalId : null));
                    } else {
                        String id2 = location2.getId();
                        eVar.L(id2);
                        objK = iVar.f181781a.b(id2).K(new j(iVar));
                    }
                }
                obj2 = objK;
            }
            return obj2 == null ? U.f403867b : obj2;
        }
    }

    /* compiled from: LocationInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Location;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Location location = (Location) obj;
            i iVar = i.this;
            if (L.f(iVar.f181786f, location)) {
                return;
            }
            iVar.f181786f = location;
        }
    }

    @Inject
    public i(@Y61.k InterfaceC30715a interfaceC30715a, @Y61.k r rVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k xI.e eVar, @Y61.k InterfaceC43691a interfaceC43691a, @Y61.l LocationInteractorState locationInteractorState) {
        this.f181781a = interfaceC30715a;
        this.f181782b = rVar;
        this.f181783c = interfaceC35745a5;
        this.f181784d = eVar;
        this.f181785e = interfaceC43691a;
        this.f181786f = locationInteractorState != null ? locationInteractorState.f181707b : null;
    }

    @Override // com.avito.android.location.InterfaceC31506h
    public final boolean b(@Y61.k String str) {
        return this.f181782b.b(str);
    }

    @Override // com.avito.android.location.InterfaceC31506h
    public final void h(@Y61.k Location location) {
        this.f181786f = LocationKt.createLocation(location.getId(), "");
        r.a.a(this.f181782b, location, LocationSource.f181717i, 4);
    }

    @Override // com.avito.android.location.InterfaceC31506h
    public final void i(@Y61.k String str) {
        r.a.a(this.f181782b, LocationKt.createLocation(str, ""), LocationSource.f181718j, 4);
    }

    @Override // com.avito.android.location.InterfaceC31506h
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> j() {
        return this.f181782b.c();
    }

    @Override // com.avito.android.location.InterfaceC31506h
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Location> l() {
        return this.f181782b.d().x0(this.f181783c.a()).d0(new b()).T(new c(), Integer.MAX_VALUE).K(new d());
    }

    @Override // com.avito.android.location.InterfaceC31506h
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Q<Location, Boolean>> o(boolean z12) {
        return r.a.b(this.f181782b, z12, 2).d0(new a());
    }
}
