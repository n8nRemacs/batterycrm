package com.avito.android.rating_persistence.llm_summary;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mh0.C44083b;

/* compiled from: RatingLLMSummaryRepositoryImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_persistence/llm_summary/q;", "Ldagger/internal/h;", "Lcom/avito/android/rating_persistence/llm_summary/p;", "a", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f249836b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C44083b f249837a;

    /* compiled from: RatingLLMSummaryRepositoryImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_persistence/llm_summary/q$a;", "", "<init>", "()V", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public q(@Y61.k C44083b c44083b) {
        this.f249837a = c44083b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.rating_persistence.llm_summary.a aVar = (com.avito.android.rating_persistence.llm_summary.a) this.f249837a.get();
        f249836b.getClass();
        return new p(aVar);
    }
}
