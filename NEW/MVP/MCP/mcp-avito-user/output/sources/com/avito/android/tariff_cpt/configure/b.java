package com.avito.android.tariff_cpt.configure;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCptConfigureActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_tariff-cpt_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {
    @k
    public static final Intent a(@k Context context, @l String str, @l String str2) {
        Intent intent = new Intent(context, (Class<?>) TariffCptConfigureActivity.class);
        intent.putExtra("tariff_cpt_configure_extra_screen", c.f297558b);
        intent.putExtra("tariff_cpt_extra_from", str);
        intent.putExtra("tariff_cpt_extra_remote_context", str2);
        return intent;
    }

    @k
    public static final Intent b(@k Context context, @l String str) {
        Intent intent = new Intent(context, (Class<?>) TariffCptConfigureActivity.class);
        intent.putExtra("tariff_cpt_configure_extra_screen", c.f297561e);
        intent.putExtra("tariff_cpt_extra_remote_context", str);
        return intent;
    }

    @k
    public static final Intent c(@k Context context, @l String str) {
        Intent intent = new Intent(context, (Class<?>) TariffCptConfigureActivity.class);
        intent.putExtra("tariff_cpt_configure_extra_screen", c.f297559c);
        intent.putExtra("tariff_cpt_extra_remote_context", str);
        return intent;
    }

    @k
    public static final Intent d(@k Context context, @l String str) {
        Intent intent = new Intent(context, (Class<?>) TariffCptConfigureActivity.class);
        intent.putExtra("tariff_cpt_configure_extra_screen", c.f297560d);
        intent.putExtra("tariff_cpt_extra_remote_context", str);
        return intent;
    }
}
