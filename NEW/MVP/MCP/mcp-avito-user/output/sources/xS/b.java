package XS;

import Y61.k;
import com.avito.android.deep_linking.x;
import com.avito.android.lib.beduin_v2.component.webview.a;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.f;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WebViewComponentModule_ProvideComponentFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"LXS/b;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/android_view/n;", "LX41/o;", "a", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements h<n<?>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f18886b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f18887a;

    /* compiled from: WebViewComponentModule_ProvideComponentFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXS/b$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k f fVar) {
        this.f18887a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        x xVar = (x) this.f18887a.get();
        f18886b.getClass();
        XS.a.f18885a.getClass();
        return new a.C5208a(xVar);
    }
}
