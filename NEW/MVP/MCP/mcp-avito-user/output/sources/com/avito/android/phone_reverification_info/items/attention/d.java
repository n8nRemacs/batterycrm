package com.avito.android.phone_reverification_info.items.attention;

import com.avito.android.lib.design.alert_banner.AlertBanner;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AttentionItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/phone_reverification_info/items/attention/d;", "LTV0/d;", "Lcom/avito/android/phone_reverification_info/items/attention/f;", "Lcom/avito/android/phone_reverification_info/items/attention/a;", "<init>", "()V", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.d<f, a> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        AlertBanner alertBanner = ((f) eVar).f216114b;
        alertBanner.getContent().a(((a) aVar).f216108c.k0(alertBanner.getContext()));
    }
}
