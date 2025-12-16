package p31;

import androidx.compose.runtime.internal.C22096n;
import androidx.view.C23326c0;
import androidx.view.C23404y0;
import androidx.view.compose.C23354t;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class p extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23404y0 f428182l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f428183m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(C23404y0 c23404y0, Y41.a aVar, int i12) {
        super(1);
        this.f428182l = c23404y0;
        this.f428183m = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final Object invoke(Object obj) {
        C23326c0 c23326c0 = (C23326c0) obj;
        C23354t.a(c23326c0, "loading_sso_screen", new C22096n(1693225312, new k(this.f428182l), true));
        ?? r12 = this.f428183m;
        C23354t.a(c23326c0, "web_view_sso_screen", new C22096n(1062423305, new m(r12), true));
        C23354t.a(c23326c0, "custom_tab_sso_screen", new C22096n(647096488, new o(r12), true));
        return G0.f406611a;
    }
}
