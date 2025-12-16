package com.avito.android.profile.edit;

import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.profile.edit.V;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Sublocation;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;

/* compiled from: LocationInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/b0;", "Lcom/avito/android/profile/edit/V;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b0 implements V {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30715a f222067a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.X f222068b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f222069c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final d0 f222070d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Profile f222071e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Location f222072f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Sublocation.Type f222073g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Sublocation f222074h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public List<? extends Sublocation> f222075i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public String f222076j;

    /* compiled from: LocationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/profile/edit/V$c;", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/profile/edit/V$b;", "apply", "(Lcom/avito/android/profile/edit/V$c;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            V.c cVar = (V.c) obj;
            Location location = cVar.f222012b;
            Profile profile = cVar.f222011a;
            String strValueOf = null;
            if (profile != null && location != null) {
                if (location.getHasMetro()) {
                    strValueOf = String.valueOf(profile.getMetroId());
                } else if (location.getHasDistricts()) {
                    strValueOf = String.valueOf(profile.getDistrictId());
                } else if (location.getHasDirections()) {
                    strValueOf = String.valueOf(profile.getLocationId());
                }
            }
            b0 b0Var = b0.this;
            b0Var.f222071e = profile;
            b0Var.f222072f = location;
            return b0Var.d(location, strValueOf);
        }
    }

    public b0(@Y61.k InterfaceC30715a interfaceC30715a, @Y61.k com.avito.android.remote.X x12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k d0 d0Var, @Y61.l Kundle kundle) {
        this.f222067a = interfaceC30715a;
        this.f222068b = x12;
        this.f222069c = interfaceC35745a5;
        this.f222070d = d0Var;
        if (kundle != null) {
            this.f222071e = (Profile) kundle.d("key_profile");
            this.f222072f = (Location) kundle.d("key_location");
            this.f222073g = (Sublocation.Type) kundle.d("key_sublocation_type");
            this.f222074h = (Sublocation) kundle.d("key_sublocation");
            this.f222075i = kundle.e("key_sublocations");
            this.f222076j = kundle.g("key_sublocation_title");
        }
    }

    @Override // com.avito.android.profile.edit.V
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Profile getF222071e() {
        return this.f222071e;
    }

    @Override // com.avito.android.profile.edit.V
    @Y61.k
    public final String b() {
        String str = this.f222076j;
        return str == null ? "" : str;
    }

    @Override // com.avito.android.profile.edit.V
    @Y61.k
    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        List<? extends Sublocation> list = this.f222075i;
        if (list != null) {
            for (Sublocation sublocation : list) {
                arrayList.add(new NameIdEntity(sublocation.getId(), sublocation.getF201827c()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.profile.edit.V
    @Y61.k
    public final C41982q1 d(@Y61.l Location location, @Y61.l String str) {
        io.reactivex.rxjava3.core.z zVarC0;
        io.reactivex.rxjava3.core.z<List<Metro>> zVarI;
        List<? extends Sublocation> list;
        Location location2 = this.f222072f;
        if (location == null) {
            location = location2;
        }
        InterfaceC35745a5 interfaceC35745a5 = this.f222069c;
        if (location != null) {
            this.f222072f = location;
            Sublocation.Type type = this.f222073g;
            Sublocation sublocation = null;
            Sublocation.Type metro = location.getHasMetro() ? new Sublocation.Type.Metro() : location.getHasDistricts() ? new Sublocation.Type.District() : location.getHasDirections() ? new Sublocation.Type.Direction() : null;
            if (metro == null) {
                this.f222073g = null;
                this.f222074h = null;
                this.f222076j = null;
                zVarC0 = io.reactivex.rxjava3.core.z.c0(new V.b.C6716b());
            } else if (kotlin.jvm.internal.L.f(location2, location) && kotlin.jvm.internal.L.f(type, metro) && (list = this.f222075i) != null) {
                if (str != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (kotlin.jvm.internal.L.f(((Sublocation) next).getId(), str)) {
                            sublocation = next;
                            break;
                        }
                    }
                    sublocation = sublocation;
                }
                this.f222074h = sublocation;
                zVarC0 = io.reactivex.rxjava3.core.z.c0(new V.b.C6716b());
            } else {
                this.f222073g = null;
                this.f222074h = null;
                this.f222076j = null;
                String id2 = location.getId();
                boolean z12 = metro instanceof Sublocation.Type.Metro;
                InterfaceC30715a interfaceC30715a = this.f222067a;
                if (z12) {
                    zVarI = interfaceC30715a.h(id2);
                } else if (metro instanceof Sublocation.Type.District) {
                    zVarI = interfaceC30715a.a(id2).d0(X.f222014b);
                } else {
                    if (!(metro instanceof Sublocation.Type.Direction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zVarI = interfaceC30715a.i(id2);
                }
                zVarC0 = io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(new V.b.c()), zVarI.d0(new Y(this, metro, str)).x0(interfaceC35745a5.a()).d0(W.f222013b));
            }
        } else {
            zVarC0 = io.reactivex.rxjava3.core.z.c0(new V.b.C6716b());
        }
        return zVarC0.x0(interfaceC35745a5.a());
    }

    @Override // com.avito.android.profile.edit.V
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f222071e, "key_profile");
        kundle.j(this.f222072f, "key_location");
        kundle.j(this.f222073g, "key_sublocation_type");
        kundle.j(this.f222074h, "key_sublocation");
        List list = this.f222075i;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        kundle.k("key_sublocations", list);
        kundle.m("key_sublocation_title", this.f222076j);
        return kundle;
    }

    @Override // com.avito.android.profile.edit.V
    public final int e() {
        Sublocation.Type type = this.f222073g;
        if (type instanceof Sublocation.Type.Metro) {
            return 1;
        }
        if (type instanceof Sublocation.Type.District) {
            return 4;
        }
        return type instanceof Sublocation.Type.Direction ? 2 : 0;
    }

    @Override // com.avito.android.profile.edit.V
    @Y61.l
    public final NameIdEntity f() {
        Sublocation sublocation = this.f222074h;
        if (sublocation == null) {
            return null;
        }
        return new NameIdEntity(sublocation.getId(), sublocation.getF201827c());
    }

    @Override // com.avito.android.profile.edit.V
    @Y61.k
    public final io.reactivex.rxjava3.core.z<V.b> g() {
        return this.f222071e != null ? io.reactivex.rxjava3.core.z.c0(new V.b.C6716b()) : this.f222068b.a().T(new a0(this), Integer.MAX_VALUE).T(new a(), Integer.MAX_VALUE);
    }

    @Override // com.avito.android.profile.edit.V
    public final void invalidate() {
        this.f222071e = null;
        this.f222072f = null;
        this.f222073g = null;
        this.f222074h = null;
        this.f222075i = null;
        this.f222076j = null;
    }

    @Override // com.avito.android.profile.edit.V
    @Y61.l
    /* renamed from: j, reason: from getter */
    public final Location getF222072f() {
        return this.f222072f;
    }
}
