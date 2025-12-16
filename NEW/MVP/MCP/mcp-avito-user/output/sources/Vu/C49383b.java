package vu;

import Y61.k;
import com.avito.android.db.f;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DatabaseModule_ProvideDatabase$_avito_discouraged_persistence_coreFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lvu/b;", "Ldagger/internal/h;", "Lcom/avito/android/db/sqlbrite/a;", "a", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vu.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49383b implements h<com.avito.android.db.sqlbrite.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f441036b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<f> f441037a;

    /* compiled from: DatabaseModule_ProvideDatabase$_avito_discouraged_persistence_coreFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/db/sqlbrite/di/DatabaseModule_ProvideDatabase$_avito_discouraged_persistence_coreFactory.Companion", "", "<init>", "()V", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vu.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49383b(@k Provider<f> provider) {
        this.f441037a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = this.f441037a.get();
        f441036b.getClass();
        C49382a.f441035a.getClass();
        return new com.avito.android.db.sqlbrite.a(fVar);
    }
}
