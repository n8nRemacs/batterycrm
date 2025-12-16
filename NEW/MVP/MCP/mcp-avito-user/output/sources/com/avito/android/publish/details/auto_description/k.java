package com.avito.android.publish.details.auto_description;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.transition.C23503n;
import androidx.transition.Q;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.deprecated_design.NetworkProblemView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import j.D;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PublishLoadingOverlay.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/auto_description/k;", "Lcom/avito/android/progress_overlay/l;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.android.progress_overlay.l {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f233551l;

    public /* synthetic */ k(ViewGroup viewGroup, int i12, InterfaceC28373a interfaceC28373a, int i13, C42822w c42822w) {
        this(viewGroup, (i13 & 2) != 0 ? -1 : i12, (i13 & 4) != 0 ? null : interfaceC28373a);
    }

    @Override // com.avito.android.progress_overlay.l
    public final void f(@Y61.l View view, @Y61.k ViewGroup viewGroup) {
        if (view != null) {
            C23503n c23503n = new C23503n();
            c23503n.f54670g.add(view);
            Q.a(viewGroup, c23503n);
            D6.g(view);
        }
    }

    @Override // com.avito.android.progress_overlay.l
    public final void l(@Y61.k ViewGroup viewGroup, @Y61.k NetworkProblemView networkProblemView) {
        C23503n c23503n = new C23503n();
        c23503n.f54670g.add(networkProblemView);
        Q.a(viewGroup, c23503n);
        D6.H(networkProblemView);
    }

    public final void m(@Y61.k String str, @Y61.k Y41.l<? super Boolean, G0> lVar) {
        Button button = (Button) this.f233551l.findViewById(R.id.interrupt_button);
        if (button != null) {
            button.setText(str);
            button.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(this, lVar));
        }
    }

    public k(@Y61.k ViewGroup viewGroup, @D int i12, @Y61.l InterfaceC28373a interfaceC28373a) {
        super(viewGroup, i12, interfaceC28373a, R.layout.publish_loading_overlay, 0, 16, null);
        this.f233551l = viewGroup;
    }
}
