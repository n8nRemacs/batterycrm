package com.avito.android.deep_linking;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: AppLinkView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/r;", "Lcom/avito/android/deep_linking/q;", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements InterfaceC29694q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f134032a;

    public r(@Y61.k View view, @Y61.k InterfaceC28373a interfaceC28373a) {
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.container), R.id.content, interfaceC28373a, R.layout.part_network_problem, C35835l0.d(R.attr.transparentWhite, view.getContext()));
        this.f134032a = lVar;
        lVar.e();
    }
}
