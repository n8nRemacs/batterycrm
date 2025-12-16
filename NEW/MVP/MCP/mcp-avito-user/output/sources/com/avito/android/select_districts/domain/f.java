package com.avito.android.select_districts.domain;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectDistrictsDataStoreImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/domain/f;", "Ldagger/internal/h;", "Lcom/avito/android/select_districts/domain/e;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f266925b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f266926a;

    /* compiled from: SelectDistrictsDataStoreImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/domain/f$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k dagger.internal.l lVar) {
        this.f266926a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set set = (Set) this.f266926a.f393949a;
        f266925b.getClass();
        return new e(set);
    }
}
