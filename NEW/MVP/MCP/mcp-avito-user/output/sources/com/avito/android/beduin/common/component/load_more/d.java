package com.avito.android.beduin.common.component.load_more;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import ej.InterfaceC40116e;
import kotlin.Metadata;

/* compiled from: BeduinLoadMoreSpinnerViewContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/load_more/d;", "Lej/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f101723b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.spinner.Spinner f101724c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f101725d;

    public d(@k ViewGroup viewGroup) {
        View viewB = C0.b(viewGroup, R.layout.beduin_component_loadmore_container, viewGroup, false);
        this.f101723b = viewB;
        this.f101724c = (com.avito.android.lib.design.spinner.Spinner) viewB.findViewById(R.id.spinner);
        this.f101725d = (ViewGroup) viewB.findViewById(R.id.container);
    }

    @Override // ej.InterfaceC40116e
    @k
    /* renamed from: getRoot, reason: from getter */
    public final View getF101723b() {
        return this.f101723b;
    }
}
