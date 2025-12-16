package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import com.avito.android.user_adverts.root_screen.adverts_host.host_view.HostViewState;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: HostViewRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class o extends H implements Y41.l<Integer, G0> {
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        HostViewState.d dVar;
        int iIntValue = num.intValue();
        j jVar = (j) this.receiver;
        jVar.f313038t.d(new a.b(iIntValue, jVar.f313040v != iIntValue));
        jVar.f313040v = -1;
        HostViewState.a.C9588a c9588aF = jVar.f();
        if (c9588aF != null && (dVar = c9588aF.f312974d) != null && dVar.f312981a && dVar.f312982b) {
            jVar.j(dVar);
        }
        return G0.f406611a;
    }
}
