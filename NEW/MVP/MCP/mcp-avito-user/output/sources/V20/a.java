package V20;

import A3.a;
import Y61.k;
import Y61.l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NavigationConfigAuthorizationPlugin.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV20/a;", "LA3/b;", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements A3.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.navigation_config.manager.a f16899a;

    @Inject
    public a(@k com.avito.android.navigation_config.manager.a aVar) {
        this.f16899a = aVar;
    }

    @Override // A3.b
    public final void e(@k a.InterfaceC0003a.c cVar) {
        com.avito.android.navigation_config.manager.a aVar = this.f16899a;
        aVar.b();
        aVar.load();
    }

    @Override // A3.b
    public final void i(@k a.b bVar) {
        this.f16899a.b();
    }

    @Override // A3.b
    public final void l(@k a.InterfaceC0003a.b bVar) {
        this.f16899a.load();
    }

    @Override // A3.b
    public final void d(@k a.InterfaceC0003a.C0004a c0004a) {
    }

    @Override // A3.b
    public final void p(@k a.InterfaceC0003a.d dVar) {
    }

    @Override // A3.b
    public final void m(@l Boolean bool, @k String str) {
    }
}
