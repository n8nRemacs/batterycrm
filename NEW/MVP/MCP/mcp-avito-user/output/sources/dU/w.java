package dU;

import com.avito.beduin.v2.render.compose.C36352i;
import com.avito.beduin.v2.render.compose.G;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinComposeRendererModule_ProvideRendererContextFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LdU/w;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/compose/G;", "a", "_design-modules_beduin-v2_renderer-compose_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w implements dagger.internal.h<G> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f393881d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f393882a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f393883b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.component.exception.compose.c f393884c;

    /* compiled from: BeduinComposeRendererModule_ProvideRendererContextFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdU/w$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public w(@Y61.k dagger.internal.l lVar, @Y61.k dagger.internal.u uVar, @Y61.k com.avito.android.lib.beduin_v2.component.exception.compose.c cVar) {
        this.f393882a = lVar;
        this.f393883b = uVar;
        this.f393884c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.beduin.v2.engine.component.B b12 = (com.avito.beduin.v2.engine.component.B) this.f393882a.f393949a;
        C36352i c36352i = (C36352i) this.f393883b.get();
        com.avito.beduin.v2.render.compose.k kVar = (com.avito.beduin.v2.render.compose.k) this.f393884c.get();
        f393881d.getClass();
        t.f393876a.getClass();
        return new G(c36352i, b12, null, kVar, 4, null);
    }
}
