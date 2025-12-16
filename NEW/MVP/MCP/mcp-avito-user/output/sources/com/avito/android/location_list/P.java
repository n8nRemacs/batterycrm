package com.avito.android.location_list;

import android.os.Bundle;
import androidx.collection.C20212g0;
import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.remote.model.Location;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocationListInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_list/P;", "Lcom/avito/android/location_list/G;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class P implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f181888a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30715a f181889b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.B f181890c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f181891d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f181892e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C20212g0<String, List<Location>> f181893f = new C20212g0<>(20);

    /* JADX WARN: Multi-variable type inference failed */
    public P(@Y61.l Bundle bundle, @Y61.k com.avito.android.geo_common.interactor.g gVar, @Y61.k InterfaceC30715a interfaceC30715a, @Y61.k com.avito.android.geo_common.interactor.B b12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar) {
        Bundle bundle2;
        this.f181888a = gVar;
        this.f181889b = interfaceC30715a;
        this.f181890c = b12;
        this.f181891d = interfaceC35745a5;
        this.f181892e = fVar;
        LinkedHashMap linkedHashMap = null;
        if (bundle != null && (bundle2 = bundle.getBundle("cache")) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (!bundle2.isEmpty()) {
                for (String str : bundle2.keySet()) {
                    Object obj = bundle2.get(str);
                    List list = obj instanceof List ? (List) obj : null;
                    if (list != null) {
                        linkedHashMap2.put(str, list);
                    }
                }
            }
            linkedHashMap = linkedHashMap2;
        }
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                this.f181893f.put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.avito.android.location_list.G
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.F a(@Y61.k Location location) {
        return new io.reactivex.rxjava3.internal.operators.observable.F(new J(this, location, 2));
    }

    @Override // com.avito.android.location_list.G
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.F b(@Y61.k String str) {
        return new io.reactivex.rxjava3.internal.operators.observable.F(new J(this, str, 1));
    }

    @Override // com.avito.android.location_list.G
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.F c(@Y61.k final String str, @Y61.k final String str2) {
        return new io.reactivex.rxjava3.internal.operators.observable.F(new l41.s() { // from class: com.avito.android.location_list.I
            @Override // l41.s
            public final Object get() {
                P p12 = this.f181866b;
                return p12.h(p12.f181888a.c(str, str2).d0(K.f181872b).x0(p12.f181891d.a()));
            }
        });
    }

    @Override // com.avito.android.location_list.G
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<List<Location>>> d(@Y61.k String str) {
        List<Location> list = this.f181893f.get(str);
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("search get query: ");
        sb2.append(str);
        sb2.append(' ');
        sb2.append(list != null);
        v22.c("LocationListInteractor", sb2.toString(), null);
        return list == null ? new io.reactivex.rxjava3.internal.operators.observable.F(new J(this, str, 0)) : io.reactivex.rxjava3.core.z.c0(new P2.b(list));
    }

    @Override // com.avito.android.location_list.G
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.F e() {
        return new io.reactivex.rxjava3.internal.operators.observable.F(new H(this, 0));
    }

    @Override // com.avito.android.location_list.G
    @Y61.l
    public final List<Location> f(@Y61.k String str) {
        return this.f181893f.get(str);
    }

    @Override // com.avito.android.location_list.G
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.F g() {
        return new io.reactivex.rxjava3.internal.operators.observable.F(new H(this, 1));
    }

    @Override // com.avito.android.location_list.G
    @Y61.k
    public final Bundle getState() {
        Bundle bundle = new Bundle();
        Map<String, List<Location>> mapSnapshot = this.f181893f.snapshot();
        if (mapSnapshot != null) {
            Bundle bundle2 = new Bundle(mapSnapshot.size());
            for (Map.Entry<String, List<Location>> entry : mapSnapshot.entrySet()) {
                com.avito.android.util.G.e(entry.getKey(), bundle2, entry.getValue());
            }
            bundle.putBundle("cache", bundle2);
        }
        return bundle;
    }

    public final L0 h(C41982q1 c41982q1) {
        return c41982q1.x0(this.f181891d.a()).d0(N.f181886b).r0(P2.c.f318721a).m0(new O(this));
    }
}
