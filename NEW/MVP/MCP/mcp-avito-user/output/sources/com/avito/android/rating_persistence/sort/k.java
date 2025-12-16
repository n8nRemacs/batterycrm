package com.avito.android.rating_persistence.sort;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import oh0.C44778b;

/* compiled from: RatingSortRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_persistence/sort/k;", "Ldagger/internal/h;", "Lcom/avito/android/rating_persistence/sort/j;", "a", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f249851b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C44778b f249852a;

    /* compiled from: RatingSortRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_persistence/sort/k$a;", "", "<init>", "()V", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k C44778b c44778b) {
        this.f249852a = c44778b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating_persistence.sort.a aVar = (com.avito.android.rating_persistence.sort.a) this.f249852a.get();
        f249851b.getClass();
        return new j(aVar);
    }
}
