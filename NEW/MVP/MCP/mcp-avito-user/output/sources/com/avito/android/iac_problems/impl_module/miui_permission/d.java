package com.avito.android.iac_problems.impl_module.miui_permission;

import PL.i;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.iac_problems.public_module.deeplink.IacMiuiDisplayOnLockedScreenPermissionLink;
import com.avito.android.iac_problems.public_module.models.IacProblem;
import com.squareup.anvil.annotations.ContributesBinding;
import hM.InterfaceC40849a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kM.AbstractC42601e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.reflect.n;
import nM.InterfaceC44291a;
import vN.C49237a;

/* compiled from: IacMiuiPermissionInteractorImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/miui_permission/d;", "LnM/a;", "a", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class d implements InterfaceC44291a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC42601e f168787a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final NL.e f168788b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C49237a f168789c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC40849a f168790d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.f f168791e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final F f168792f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC28373a f168793g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final i f168794h;

    /* compiled from: IacMiuiPermissionInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/miui_permission/d$a;", "", "<init>", "()V", "", "DISPLAYING_PERIOD", "J", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k AbstractC42601e abstractC42601e, @k NL.e eVar, @k C49237a c49237a, @k InterfaceC40849a interfaceC40849a, @k com.avito.android.server_time.f fVar, @k F f12, @k InterfaceC28373a interfaceC28373a, @k i iVar) {
        this.f168787a = abstractC42601e;
        this.f168788b = eVar;
        this.f168789c = c49237a;
        this.f168790d = interfaceC40849a;
        this.f168791e = fVar;
        this.f168792f = f12;
        this.f168793g = interfaceC28373a;
        this.f168794h = iVar;
    }

    @Override // nM.InterfaceC44291a
    @l
    public final IacMiuiDisplayOnLockedScreenPermissionLink a() {
        i iVar = this.f168794h;
        Boolean boolA = iVar.a();
        Boolean bool = Boolean.TRUE;
        if (!L.f(boolA, bool) || L.f(iVar.b(), bool)) {
            return null;
        }
        C49237a c49237a = this.f168789c;
        c49237a.getClass();
        n<Object> nVar = C49237a.f440707l[4];
        if (((Boolean) c49237a.f440712e.a().invoke()).booleanValue() || this.f168791e.now() >= this.f168790d.c("miui_locked_screen_onboarding")) {
            return new IacMiuiDisplayOnLockedScreenPermissionLink("main_start_onboarding");
        }
        return null;
    }

    @Override // nM.InterfaceC44291a
    @k
    public final IacMiuiDisplayOnLockedScreenPermissionLink b() {
        this.f168790d.e(this.f168791e.now() + 604800000, "miui_locked_screen");
        return new IacMiuiDisplayOnLockedScreenPermissionLink("publish");
    }

    @Override // nM.InterfaceC44291a
    public final boolean c() {
        boolean z12 = e() && this.f168791e.now() >= this.f168790d.c("miui_locked_screen") && this.f168788b.a();
        if (L.f(this.f168794h.a(), Boolean.TRUE)) {
            F f12 = this.f168792f;
            y.a aVar = new y.a(f12.a("calls", "miuiPermissionDialog", "{{%app_ver%}}", "publish", "itemPublished").f91030a, 1L);
            InterfaceC28373a interfaceC28373a = this.f168793g;
            interfaceC28373a.c(aVar);
            if (z12) {
                interfaceC28373a.c(new y.a(f12.a("calls", "miuiPermissionDialog", "{{%app_ver%}}", "publish", "shouldShowDialog").f91030a, 1L));
            }
        }
        return z12;
    }

    @Override // nM.InterfaceC44291a
    public final void d() {
        this.f168790d.e(this.f168791e.now() + 604800000, "miui_locked_screen_onboarding");
    }

    @Override // nM.InterfaceC44291a
    public final boolean e() {
        return this.f168787a.b() == IacProblem.f169095h;
    }
}
