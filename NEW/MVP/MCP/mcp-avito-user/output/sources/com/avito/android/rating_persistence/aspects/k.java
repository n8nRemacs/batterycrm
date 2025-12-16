package com.avito.android.rating_persistence.aspects;

import kh0.C42694b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatingAspectsRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_persistence/aspects/k;", "Ldagger/internal/h;", "Lcom/avito/android/rating_persistence/aspects/j;", "a", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f249796b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C42694b f249797a;

    /* compiled from: RatingAspectsRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_persistence/aspects/k$a;", "", "<init>", "()V", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k C42694b c42694b) {
        this.f249797a = c42694b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating_persistence.aspects.a aVar = (com.avito.android.rating_persistence.aspects.a) this.f249797a.get();
        f249796b.getClass();
        return new j(aVar);
    }
}
