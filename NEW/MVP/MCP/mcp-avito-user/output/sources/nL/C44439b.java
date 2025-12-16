package nl;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.ui.status_bar.d;
import com.avito.android.util.C35838l3;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: NavigationBarStylePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/b;", "Lnl/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nl.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44439b implements InterfaceC44438a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C35838l3 f419134b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.search_view.k f419135c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f419136d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public InterfaceC44440c f419137e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Z1<com.avito.android.ui.status_bar.d> f419138f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final n2<com.avito.android.ui.status_bar.d> f419139g;

    public C44439b(@k C35838l3 c35838l3) {
        this.f419134b = c35838l3;
        Z1<com.avito.android.ui.status_bar.d> z1A = p2.a(null);
        this.f419138f = z1A;
        this.f419139g = z1A;
    }

    public final void a() {
        com.avito.android.search_view.k kVar = this.f419135c;
        boolean z12 = this.f419136d && this.f419134b.f318922a;
        Z1<com.avito.android.ui.status_bar.d> z13 = this.f419138f;
        if (kVar == null || z12) {
            InterfaceC44440c interfaceC44440c = this.f419137e;
            if (interfaceC44440c != null) {
                interfaceC44440c.b();
            }
            z13.setValue(null);
            return;
        }
        InterfaceC44440c interfaceC44440c2 = this.f419137e;
        if (interfaceC44440c2 != null) {
            interfaceC44440c2.a(kVar, 1.0f);
        }
        z13.setValue(new com.avito.android.ui.status_bar.d(kVar.f264560d, new d.a.e(kVar.f264557a)));
    }

    @Override // nl.InterfaceC44438a
    public final void b(@k InterfaceC44440c interfaceC44440c) {
        this.f419137e = interfaceC44440c;
    }

    @Override // com.avito.android.ui.status_bar.k
    @k
    public final n2<com.avito.android.ui.status_bar.d> e2() {
        return this.f419139g;
    }

    @Override // nl.InterfaceC44438a
    public final void f0() {
        this.f419135c = null;
        this.f419136d = false;
        this.f419137e = null;
        this.f419138f.setValue(null);
    }

    @Override // nl.InterfaceC44438a
    public final void i(boolean z12) {
        this.f419136d = z12;
        a();
    }

    @Override // nl.InterfaceC44438a
    public final void l3(@l NavigationBarStyle navigationBarStyle) {
        this.f419135c = navigationBarStyle != null ? C44441d.a(navigationBarStyle) : null;
        a();
    }
}
