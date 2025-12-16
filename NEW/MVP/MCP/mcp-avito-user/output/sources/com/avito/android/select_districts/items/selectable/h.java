package com.avito.android.select_districts.items.selectable;

import Y61.k;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectableDistrictsItemPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/items/selectable/h;", "Ldagger/internal/h;", "Lcom/avito/android/select_districts/items/selectable/g;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f266972b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f266973a;

    /* compiled from: SelectableDistrictsItemPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/items/selectable/h$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@k l lVar) {
        this.f266973a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f266973a.f393949a;
        f266972b.getClass();
        return new g(dVar);
    }
}
