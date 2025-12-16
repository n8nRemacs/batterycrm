package ZC;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoritesApi_Module_ProvideFavoritesApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LZC/e;", "Ldagger/internal/h;", "LZC/c;", "a", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f19965b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f19966a;

    /* compiled from: FavoritesApi_Module_ProvideFavoritesApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZC/e$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k dagger.internal.f fVar) {
        this.f19966a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f19966a.get();
        f19965b.getClass();
        d.f19964a.getClass();
        c cVar = (c) r02.create(c.class);
        t.b(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
