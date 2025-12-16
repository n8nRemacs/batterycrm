package com.avito.android.tariff_lf.package_info.viewmodel;

import android.content.res.Resources;
import android.util.TypedValue;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffPackageInfoResourceProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/viewmodel/j;", "Lcom/avito/android/tariff_lf/package_info/viewmodel/i;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f299286a;

    @Inject
    public j(@Y61.k Resources resources) {
        this.f299286a = resources;
    }

    @Override // com.avito.android.tariff_lf.package_info.viewmodel.i
    public final int a() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f299286a.getColor(R.color.common_black, null);
    }

    @Override // com.avito.android.tariff_lf.package_info.viewmodel.i
    public final int b() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f299286a.getColor(R.color.common_gray_54, null);
    }
}
