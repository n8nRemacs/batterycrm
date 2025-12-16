package ZR;

import Y61.k;
import YR.c;
import com.avito.android.util.C;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.h;
import dagger.internal.t;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExceptionComponentModule_ProvideUnregisteredComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"LZR/c;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/android_view/n;", "LX41/o;", "a", "_design-modules_beduin-v2_renderer_component_exception"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements h<n<?>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f20166b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C> f20167a;

    /* compiled from: ExceptionComponentModule_ProvideUnregisteredComponentFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZR/c$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_exception"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k Provider<C> provider) {
        this.f20167a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f20167a.get();
        f20166b.getClass();
        ZR.a.f20163a.getClass();
        c12.o().getClass();
        c.a aVar = c.a.f19476c;
        t.b(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
