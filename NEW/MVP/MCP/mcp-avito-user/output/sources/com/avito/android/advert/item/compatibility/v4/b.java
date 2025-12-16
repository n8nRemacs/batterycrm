package com.avito.android.advert.item.compatibility.v4;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GarageCompatibilityV4Analytics.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v4/b;", "Lcom/avito/android/advert/item/compatibility/v4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f74530a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f74531b;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k @InterfaceC30174s String str) {
        this.f74530a = interfaceC28373a;
        this.f74531b = str;
    }

    @Override // com.avito.android.advert.item.compatibility.v4.a
    public final void a(@Y61.l String str, @Y61.l String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        this.f74530a.c(new k(this.f74531b, str, str2));
    }
}
