package cv;

import X41.n;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeeplinkHandlerDependenciesModule_DeeplinkHandlerFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcv/e;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/handler/composite/a;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<com.avito.android.deeplink_handler.handler.composite.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f393033b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f393034a;

    /* compiled from: DeeplinkHandlerDependenciesModule_DeeplinkHandlerFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv/e$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @Y61.k
        public static com.avito.android.deeplink_handler.handler.composite.a a(@Y61.k d dVar) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = dVar.f393032a.u4();
            t.b(aVarU4, "Cannot return null from a non-@Nullable @Provides method");
            return aVarU4;
        }

        public a() {
        }
    }

    public e(@Y61.k d dVar) {
        this.f393034a = dVar;
    }

    @n
    @Y61.k
    public static final e a(@Y61.k d dVar) {
        f393033b.getClass();
        return new e(dVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f393033b.getClass();
        return a.a(this.f393034a);
    }
}
