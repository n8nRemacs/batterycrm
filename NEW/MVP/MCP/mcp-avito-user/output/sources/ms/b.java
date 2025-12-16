package MS;

import KS.a;
import Y61.k;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;

/* compiled from: SurfaceComponentModule_ProvideComponentFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LMS/b;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/android_view/n;", "LX41/o;", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_surface"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements h<n<?>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f10689a = new b();

    @Override // javax.inject.Provider
    public final Object get() {
        a.f10688a.getClass();
        a.C0570a c0570a = a.C0570a.f9459c;
        t.b(c0570a, "Cannot return null from a non-@Nullable @Provides method");
        return c0570a;
    }
}
