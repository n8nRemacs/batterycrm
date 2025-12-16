package com.avito.android.iac_problems.impl_module.deeplink.miui;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.iac_problems.public_module.deeplink.IacMiuiDisplayOnLockedScreenPermissionLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import nJ.C44263B;
import oM.C44664a;

/* compiled from: IacMiuiDisplayOnLockedScreenPermissionLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f168736l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar) {
        super(1);
        this.f168736l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        a aVar = this.f168736l;
        C44263B c44263b = new C44263B(C44664a.a(aVar.f168723l.c()), "miui_locked_screen");
        InterfaceC28373a interfaceC28373a = aVar.f168725n;
        aVar.f168726o.a(c44263b, new e(1, interfaceC28373a, InterfaceC28373a.class, "track", "track(Lcom/avito/android/analytics/Event;)V", 0));
        boolean zE2 = aVar.f168719h.e();
        F f12 = aVar.f168724m;
        if (zE2) {
            interfaceC28373a.c(new y.a(f12.a("calls", "miuiPermissionDialog", "{{%app_ver%}}", aVar.f168731t, "notGranted").f91030a, 1L));
            aVar.j(IacMiuiDisplayOnLockedScreenPermissionLink.b.d.f169086b);
        } else {
            aVar.f168727p.a();
            interfaceC28373a.c(new y.a(f12.a("calls", "miuiPermissionDialog", "{{%app_ver%}}", aVar.f168731t, "granted").f91030a, 1L));
            aVar.j(IacMiuiDisplayOnLockedScreenPermissionLink.b.C5003b.f169084b);
        }
        return G0.f406611a;
    }
}
