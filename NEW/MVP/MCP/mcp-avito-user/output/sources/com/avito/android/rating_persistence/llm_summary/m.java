package com.avito.android.rating_persistence.llm_summary;

import com.avito.android.account.E;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatingLLMSummaryInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_persistence/llm_summary/m;", "Ldagger/internal/h;", "Lcom/avito/android/rating_persistence/llm_summary/i;", "a", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<i> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f249832c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f249833a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<E> f249834b;

    /* compiled from: RatingLLMSummaryInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_persistence/llm_summary/m$a;", "", "<init>", "()V", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public m(@Y61.k q qVar, @Y61.k Provider provider) {
        this.f249833a = qVar;
        this.f249834b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        o oVar = (o) this.f249833a.get();
        E e12 = this.f249834b.get();
        f249832c.getClass();
        return new i(oVar, e12);
    }
}
