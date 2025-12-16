package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.HostViewState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: HostViewRenderer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class p extends H implements Y41.l<Integer, G0> {
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        HostViewState.e eVar;
        boolean z12;
        int iIntValue = num.intValue();
        j jVar = (j) this.receiver;
        HostViewState.a.C9588a c9588aF = jVar.f();
        if (c9588aF != null && !(z12 = (eVar = c9588aF.f312972b).f312984a)) {
            SwipeRefreshLayout swipeRefreshLayout = jVar.f313022d;
            if (iIntValue == 0) {
                swipeRefreshLayout.setRefreshing(z12);
                swipeRefreshLayout.setEnabled(eVar.f312985b);
            } else {
                swipeRefreshLayout.setRefreshing(false);
                swipeRefreshLayout.setEnabled(false);
            }
        }
        return G0.f406611a;
    }
}
