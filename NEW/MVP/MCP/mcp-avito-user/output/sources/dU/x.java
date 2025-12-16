package dU;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinComposeRendererModule_ProvideScreenStyleProviderFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LdU/x;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/theme/k;", "a", "_design-modules_beduin-v2_renderer-compose_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x implements dagger.internal.h<com.avito.beduin.v2.theme.k> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f393885b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f393886a;

    /* compiled from: BeduinComposeRendererModule_ProvideScreenStyleProviderFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdU/x$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public x(@Y61.k dagger.internal.u uVar) {
        this.f393886a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.lib.beduin_v2.theme.all.compose.a aVar = (com.avito.android.lib.beduin_v2.theme.all.compose.a) this.f393886a.get();
        f393885b.getClass();
        t.f393876a.getClass();
        return aVar.b();
    }
}
