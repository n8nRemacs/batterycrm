package com.avito.android.select_districts.items.selectable;

import Y61.k;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectableDistrictsBlueprint_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/items/selectable/b;", "Ldagger/internal/h;", "Lcom/avito/android/select_districts/items/selectable/a;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<com.avito.android.select_districts.items.selectable.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f266964b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f266965a;

    /* compiled from: SelectableDistrictsBlueprint_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/items/selectable/b$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k u uVar) {
        this.f266965a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f266965a.get();
        f266964b.getClass();
        return new com.avito.android.select_districts.items.selectable.a(eVar);
    }
}
