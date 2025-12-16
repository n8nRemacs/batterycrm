package com.avito.android.messenger.conversation;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C23503n;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.deprecated_design.NetworkProblemView;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: ChannelProgressOverlay.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/X1;", "Lcom/avito/android/progress_overlay/l;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class X1 extends com.avito.android.progress_overlay.l {
    public X1(@Y61.k ViewGroup viewGroup, @Y61.k InterfaceC28373a interfaceC28373a) {
        super(viewGroup, 0, interfaceC28373a, 0, 0, 26, null);
    }

    @Override // com.avito.android.progress_overlay.l
    public final void f(@Y61.l View view, @Y61.k ViewGroup viewGroup) {
        if (view != null) {
            C23503n c23503n = new C23503n();
            c23503n.f54670g.add(view);
            androidx.transition.Q.a(viewGroup, c23503n);
            D6.g(view);
        }
    }

    @Override // com.avito.android.progress_overlay.l
    public final void l(@Y61.k ViewGroup viewGroup, @Y61.k NetworkProblemView networkProblemView) {
        C23503n c23503n = new C23503n();
        c23503n.f54670g.add(networkProblemView);
        androidx.transition.Q.a(viewGroup, c23503n);
        D6.H(networkProblemView);
    }
}
