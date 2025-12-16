package com.avito.android.loyalty.ui.quality_service_gray.items.button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.w;
import com.avito.android.job.cv_info_actualization.ui.items.radio.h;
import com.avito.android.lib.design.button.Button;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ButtonItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/items/button/d;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/quality_service_gray/items/button/f;", "Lcom/avito/android/loyalty/ui/quality_service_gray/items/button/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.d<f, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f184076b;

    @Inject
    public d(@k w wVar) {
        this.f184076b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) aVar;
        String str = aVar2.f184070c;
        Button button = ((f) eVar).f184079b;
        button.setText(str);
        button.setOnClickListener(new h(14, this.f184076b, aVar2));
    }
}
