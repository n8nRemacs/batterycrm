package com.avito.android.toggle_comparison_state.deep_linking;

import android.os.Bundle;
import com.avito.android.toggle_comparison_state.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ToggleComparisonStateLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ToggleComparisonStateLink f301587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f301588m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f301589n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ToggleComparisonStateLink toggleComparisonStateLink, Bundle bundle, d dVar) {
        super(0);
        this.f301587l = toggleComparisonStateLink;
        this.f301588m = bundle;
        this.f301589n = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        boolean z12;
        boolean zBooleanValue;
        ToggleComparisonStateLink toggleComparisonStateLink = this.f301587l;
        Boolean bool = toggleComparisonStateLink.f301577f;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Bundle bundle = this.f301588m;
            if (bundle == null) {
                z12 = false;
                d dVar = this.f301589n;
                dVar.f301584i.b(dVar.f301582g.a(new p(toggleComparisonStateLink.f301574c, toggleComparisonStateLink.f301573b, toggleComparisonStateLink.f301576e, z12, false, toggleComparisonStateLink.f301575d, 16, null)).s(dVar.f301583h.e()).x(new f(dVar), new g(dVar)));
                return G0.f406611a;
            }
            zBooleanValue = bundle.getBoolean("isAdded", false);
        }
        z12 = zBooleanValue;
        d dVar2 = this.f301589n;
        dVar2.f301584i.b(dVar2.f301582g.a(new p(toggleComparisonStateLink.f301574c, toggleComparisonStateLink.f301573b, toggleComparisonStateLink.f301576e, z12, false, toggleComparisonStateLink.f301575d, 16, null)).s(dVar2.f301583h.e()).x(new f(dVar2), new g(dVar2)));
        return G0.f406611a;
    }
}
