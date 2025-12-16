package com.avito.android.select_districts.items.selected;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectedDistrictsTagsItemPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/items/selected/k;", "Ldagger/internal/h;", "Lcom/avito/android/select_districts/items/selected/j;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f266990c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f266991a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f266992b;

    /* compiled from: SelectedDistrictsTagsItemPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/items/selected/k$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k dagger.internal.l lVar, @Y61.k dagger.internal.l lVar2) {
        this.f266991a = lVar;
        this.f266992b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f266991a.f393949a;
        com.avito.android.select_districts.items.selected.a aVar = (com.avito.android.select_districts.items.selected.a) this.f266992b.f393949a;
        f266990c.getClass();
        return new j(bVar, aVar);
    }
}
