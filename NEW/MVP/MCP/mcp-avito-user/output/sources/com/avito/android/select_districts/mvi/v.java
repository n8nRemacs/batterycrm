package com.avito.android.select_districts.mvi;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectDistrictsReducer_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/mvi/v;", "Ldagger/internal/h;", "Lcom/avito/android/select_districts/mvi/u;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f267095c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.h f267096a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.select_districts.domain.d> f267097b;

    /* compiled from: SelectDistrictsReducer_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/mvi/v$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public v(@Y61.k com.avito.android.select_districts.domain.h hVar, @Y61.k Provider provider) {
        this.f267096a = hVar;
        this.f267097b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.select_districts.domain.g gVar = (com.avito.android.select_districts.domain.g) this.f267096a.get();
        com.avito.android.select_districts.domain.d dVar = this.f267097b.get();
        f267095c.getClass();
        return new u(gVar, dVar);
    }
}
