package BU;

import com.avito.beduin.v2.repository.screen_lifecycle.k;
import com.avito.beduin.v2.repository.screen_lifecycle.l;
import com.avito.beduin.v2.repository.screen_lifecycle.r;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScreenLifecycleModule_ProvideClientFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LBU/e;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/repository/screen_lifecycle/k;", "a", "_design-modules_beduin-v2_interactions_repository_common_screen-lifecycle_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<k> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f1401d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f1402a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<r> f1403b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f1404c;

    /* compiled from: ScreenLifecycleModule_ProvideClientFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBU/e$a;", "", "<init>", "()V", "_design-modules_beduin-v2_interactions_repository_common_screen-lifecycle_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k h hVar, @Y61.k Provider provider, @Y61.k i iVar) {
        this.f1402a = hVar;
        this.f1403b = provider;
        this.f1404c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.repository.screen_lifecycle.f fVar = (com.avito.beduin.v2.repository.screen_lifecycle.f) this.f1402a.get();
        r rVar = this.f1403b.get();
        com.avito.beduin.v2.repository.screen_lifecycle.h hVar = (com.avito.beduin.v2.repository.screen_lifecycle.h) this.f1404c.get();
        f1401d.getClass();
        d.f1400a.getClass();
        return new l(fVar, rVar, hVar);
    }
}
