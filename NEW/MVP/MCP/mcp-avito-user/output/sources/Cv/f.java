package cv;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeeplinkHandlerDependenciesModule_DeeplinkViewActivityResultObserverFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcv/f;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_handler/view/a$b;", "a", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<a.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f393035b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f393036a;

    /* compiled from: DeeplinkHandlerDependenciesModule_DeeplinkViewActivityResultObserverFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv/f$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k d dVar) {
        this.f393036a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f393035b.getClass();
        a.b bVarB = this.f393036a.f393032a.b();
        t.b(bVarB, "Cannot return null from a non-@Nullable @Provides method");
        return bVarB;
    }
}
