package dU;

import com.avito.beduin.v2.render.compose.AbstractC36347d;
import dU.s;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinComposeLocalComponentsProviderModule_LocalComponentRenderersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0017\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LdU/o;", "Ldagger/internal/h;", "", "Lcom/avito/beduin/v2/render/compose/d;", "LX41/o;", "a", "_design-modules_beduin-v2_renderer-compose_di_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements dagger.internal.h<Set<AbstractC36347d<?>>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f393872b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f393873a;

    /* compiled from: BeduinComposeLocalComponentsProviderModule_LocalComponentRenderersFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdU/o$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer-compose_di_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(@Y61.k m mVar) {
        this.f393873a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f393872b.getClass();
        s.a aVar = this.f393873a.f393871a;
        B0 b02 = B0.f406639b;
        dagger.internal.t.b(b02, "Cannot return null from a non-@Nullable @Provides method");
        return b02;
    }
}
