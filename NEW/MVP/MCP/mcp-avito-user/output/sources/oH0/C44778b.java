package oh0;

import Y61.k;
import com.avito.android.rating_persistence.RatingDatabase;
import dagger.internal.h;
import dagger.internal.t;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatingSortModule_ProvideRatingSortDaoFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Loh0/b;", "Ldagger/internal/h;", "Lcom/avito/android/rating_persistence/sort/a;", "a", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oh0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44778b implements h<com.avito.android.rating_persistence.sort.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f419993b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<RatingDatabase> f419994a;

    /* compiled from: RatingSortModule_ProvideRatingSortDaoFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loh0/b$a;", "", "<init>", "()V", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oh0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44778b(@k C44777a c44777a, @k Provider<RatingDatabase> provider) {
        this.f419994a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        RatingDatabase ratingDatabase = this.f419994a.get();
        f419993b.getClass();
        com.avito.android.rating_persistence.sort.a aVarW = ratingDatabase.w();
        t.b(aVarW, "Cannot return null from a non-@Nullable @Provides method");
        return aVarW;
    }
}
