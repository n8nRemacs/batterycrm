package com.avito.android.tariff_lf.bar;

import Y61.l;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.paid_services.routing.TariffCountStatus;
import kotlin.Metadata;

/* compiled from: BarItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/bar/g;", "LTV0/e;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface g extends TV0.e {

    /* compiled from: BarItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void PI(@Y61.k ProgressState progressState);

    void j(@l String str);

    void n(@l String str);

    void n5(float f12);

    void setTitle(@Y61.k String str);

    void uS(@Y61.k TariffCountStatus tariffCountStatus);
}
