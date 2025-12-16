package com.avito.android.select_districts.mvi;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectDistrictsBootstrap_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/mvi/o;", "Ldagger/internal/h;", "Lcom/avito/android/select_districts/mvi/n;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f267076e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.k f267077a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.select_districts.domain.d> f267078b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.c f267079c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f267080d;

    /* compiled from: SelectDistrictsBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/mvi/o$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(@Y61.k com.avito.android.select_districts.domain.k kVar, @Y61.k Provider provider, @Y61.k com.avito.android.select_districts.domain.c cVar, @Y61.k dagger.internal.l lVar) {
        this.f267077a = kVar;
        this.f267078b = provider;
        this.f267079c = cVar;
        this.f267080d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.select_districts.domain.j jVar = (com.avito.android.select_districts.domain.j) this.f267077a.get();
        com.avito.android.select_districts.domain.d dVar = this.f267078b.get();
        com.avito.android.select_districts.domain.b bVar = (com.avito.android.select_districts.domain.b) this.f267079c.get();
        int iIntValue = ((Number) this.f267080d.f393949a).intValue();
        f267076e.getClass();
        return new n(jVar, dVar, bVar, iIntValue);
    }
}
