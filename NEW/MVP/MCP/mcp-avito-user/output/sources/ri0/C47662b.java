package ri0;

import AK0.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RealtyAgencyStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lri0/b;", "Lri0/a;", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ri0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47662b implements InterfaceC47661a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f430151a;

    @Inject
    public C47662b(@k l lVar) {
        this.f430151a = lVar;
    }

    @Override // ri0.InterfaceC47661a
    public final boolean a() {
        return this.f430151a.getBoolean("developments-agency-search.isClientModeEnabled", false);
    }

    @Override // ri0.InterfaceC47661a
    public final boolean b() {
        return this.f430151a.getBoolean("developments-agency-search.isSelectionsOnboardingShown", false);
    }

    @Override // ri0.InterfaceC47661a
    public final void c(boolean z12) {
        this.f430151a.putBoolean("developments-agency-search.isClientModeEnabled", z12);
    }

    @Override // ri0.InterfaceC47661a
    public final void d() {
        this.f430151a.putBoolean("developments-agency-search.isSelectionsOnboardingShown", true);
    }

    @Override // ri0.InterfaceC47661a
    public final boolean e() {
        return this.f430151a.getBoolean("developments-agency-search.hideCommissionPromoBanner", false);
    }

    @Override // ri0.InterfaceC47661a
    public final void f() {
        this.f430151a.putBoolean("developments-agency-search.hideCommissionPromoBanner", true);
    }
}
