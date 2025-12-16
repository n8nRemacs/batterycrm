package lh0;

import Y61.k;
import android.app.Application;
import androidx.room.RoomDatabase;
import androidx.room.x0;
import com.avito.android.rating_persistence.RatingDatabase;
import dagger.internal.h;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatingDatabaseModule_ProvideDatabaseFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Llh0/c;", "Ldagger/internal/h;", "Lcom/avito/android/rating_persistence/RatingDatabase;", "a", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lh0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C43775c implements h<RatingDatabase> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f414151b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f414152a;

    /* compiled from: RatingDatabaseModule_ProvideDatabaseFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llh0/c$a;", "", "<init>", "()V", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lh0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43775c(@k C43773a c43773a, @k l lVar) {
        this.f414152a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f414152a.f393949a;
        f414151b.getClass();
        RoomDatabase.a aVarA = x0.a(application, "rating.db", RatingDatabase.class);
        aVarA.a(com.avito.android.rating_persistence.a.f249782c);
        aVarA.a(com.avito.android.rating_persistence.b.f249798c);
        aVarA.a(com.avito.android.rating_persistence.c.f249799c);
        aVarA.c();
        return (RatingDatabase) aVarA.b();
    }
}
