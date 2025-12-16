package com.avito.android.select_districts;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.T;

/* compiled from: SelectDistrictsViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/m;", "Ldagger/internal/h;", "Lcom/avito/android/select_districts/l;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f267009d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.mvi.r f267010a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.select_districts.domain.o> f267011b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<T> f267012c;

    /* compiled from: SelectDistrictsViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/m$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(@Y61.k com.avito.android.select_districts.mvi.r rVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f267010a = rVar;
        this.f267011b = provider;
        this.f267012c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.select_districts.mvi.q qVar = (com.avito.android.select_districts.mvi.q) this.f267010a.get();
        com.avito.android.select_districts.domain.o oVar = this.f267011b.get();
        T t12 = this.f267012c.get();
        f267009d.getClass();
        return new l(qVar, oVar, t12);
    }
}
