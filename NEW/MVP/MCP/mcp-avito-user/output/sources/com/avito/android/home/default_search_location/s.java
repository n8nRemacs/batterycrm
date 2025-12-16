package com.avito.android.home.default_search_location;

import Fc1.E0;
import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.location.r;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.model.Location;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.P;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import org.funktionale.option.a;

/* compiled from: DefaultSearchLocationPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/default_search_location/s;", "Lcom/avito/android/home/default_search_location/f;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f162396a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f162397b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f162398c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f162399d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo.j f162400e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final u f162401f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f162402g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33034d f162403h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.main_start_onboarding.a f162404i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f162405j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<org.funktionale.option.a<Boolean>> f162406k = com.jakewharton.rxrelay3.b.N0(a.b.f420401b);

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f162407l = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: m, reason: collision with root package name */
    public boolean f162408m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f162409n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Location f162410o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f162411p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Boolean f162412q;

    /* renamed from: r, reason: collision with root package name */
    public long f162413r;

    public s(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k c cVar, @Y61.k a aVar, @Y61.k com.avito.android.location.r rVar, @Y61.k com.avito.android.geo.j jVar, @Y61.k u uVar, @Y61.k com.avito.android.server_time.f fVar, @Y61.k InterfaceC33034d interfaceC33034d, @Y61.k com.avito.android.main_start_onboarding.a aVar2) {
        this.f162396a = interfaceC35745a5;
        this.f162397b = cVar;
        this.f162398c = aVar;
        this.f162399d = rVar;
        this.f162400e = jVar;
        this.f162401f = uVar;
        this.f162402g = fVar;
        this.f162403h = interfaceC33034d;
        this.f162404i = aVar2;
        this.f162409n = uVar.b();
    }

    @Override // com.avito.android.home.default_search_location.f
    public final void a(@Y61.l Location location) {
        r.a.a(this.f162399d, location, null, 2);
    }

    @Override // com.avito.android.home.default_search_location.e
    public final void b() {
        this.f162398c.b();
    }

    @Override // com.avito.android.home.default_search_location.e
    @Y61.k
    public final P c() {
        return this.f162406k.K(new m(this)).J(new E0(this, 22), io.reactivex.rxjava3.internal.functions.a.f401994d);
    }

    @Override // com.avito.android.home.default_search_location.e
    public final void d() {
        android.location.Location locationJ = this.f162400e.j();
        if (locationJ != null) {
            this.f162405j = true;
            FindLocationPage findLocationPage = FindLocationPage.f181725c;
            this.f162398c.e(locationJ, null);
        }
    }

    @Override // com.avito.android.home.default_search_location.e
    /* renamed from: e, reason: from getter */
    public final boolean getF162405j() {
        return this.f162405j;
    }
}
