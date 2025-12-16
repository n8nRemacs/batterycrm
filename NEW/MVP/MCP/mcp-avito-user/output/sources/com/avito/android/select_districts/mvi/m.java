package com.avito.android.select_districts.mvi;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectDistrictsActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/mvi/m;", "Ldagger/internal/h;", "Lcom/avito/android/select_districts/mvi/k;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f267058f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.k f267059a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f267060b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.c f267061c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.select_districts.domain.d> f267062d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.n f267063e;

    /* compiled from: SelectDistrictsActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/mvi/m$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(@Y61.k com.avito.android.select_districts.domain.k kVar, @Y61.k dagger.internal.u uVar, @Y61.k com.avito.android.select_districts.domain.c cVar, @Y61.k Provider provider, @Y61.k com.avito.android.select_districts.domain.n nVar) {
        this.f267059a = kVar;
        this.f267060b = uVar;
        this.f267061c = cVar;
        this.f267062d = provider;
        this.f267063e = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.select_districts.domain.j jVar = (com.avito.android.select_districts.domain.j) this.f267059a.get();
        com.avito.android.select_districts.domain.o oVar = (com.avito.android.select_districts.domain.o) this.f267060b.get();
        com.avito.android.select_districts.domain.b bVar = (com.avito.android.select_districts.domain.b) this.f267061c.get();
        com.avito.android.select_districts.domain.d dVar = this.f267062d.get();
        this.f267063e.getClass();
        com.avito.android.select_districts.domain.m mVar = new com.avito.android.select_districts.domain.m();
        f267058f.getClass();
        return new k(jVar, oVar, bVar, dVar, mVar);
    }
}
