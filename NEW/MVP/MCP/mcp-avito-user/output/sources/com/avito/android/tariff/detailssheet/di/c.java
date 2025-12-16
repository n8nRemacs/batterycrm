package com.avito.android.tariff.detailssheet.di;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.B;
import com.avito.android.tariff.detailssheet.TariffDetailsSheetDialogFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: TariffDetailsSheetFragmentComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/detailssheet/di/c;", "", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: TariffDetailsSheetFragmentComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/detailssheet/di/c$a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        c a(@h31.b @k TariffDetailsSheetDialogFragment tariffDetailsSheetDialogFragment, @k b bVar, @h31.b @k DeepLink deepLink);
    }

    void a(@k TariffDetailsSheetDialogFragment tariffDetailsSheetDialogFragment);
}
