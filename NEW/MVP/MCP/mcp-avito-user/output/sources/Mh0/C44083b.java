package mh0;

import Y61.k;
import com.avito.android.rating_persistence.RatingDatabase;
import dagger.internal.h;
import dagger.internal.t;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatingLLMSummaryModule_ProvideRatingLLMSummaryDaoFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lmh0/b;", "Ldagger/internal/h;", "Lcom/avito/android/rating_persistence/llm_summary/a;", "a", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mh0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44083b implements h<com.avito.android.rating_persistence.llm_summary.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f414664b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<RatingDatabase> f414665a;

    /* compiled from: RatingLLMSummaryModule_ProvideRatingLLMSummaryDaoFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmh0/b$a;", "", "<init>", "()V", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mh0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44083b(@k C44082a c44082a, @k Provider<RatingDatabase> provider) {
        this.f414665a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        RatingDatabase ratingDatabase = this.f414665a.get();
        f414664b.getClass();
        com.avito.android.rating_persistence.llm_summary.a aVarV = ratingDatabase.v();
        t.b(aVarV, "Cannot return null from a non-@Nullable @Provides method");
        return aVarV;
    }
}
