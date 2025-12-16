package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.l;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ns.InterfaceC44470a;
import os.u;

/* compiled from: GetCpxPromoGeoUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/domain/b;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f127831a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44470a f127832b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f127833c;

    @Inject
    public b(@k R0 r02, @l @k String str, @k InterfaceC44470a interfaceC44470a) {
        this.f127831a = r02;
        this.f127832b = interfaceC44470a;
        this.f127833c = str;
    }

    @k
    public final InterfaceC43160i a(@Y61.l List list, @Y61.l ArrayList arrayList, @Y61.l u uVar, @Y61.l ArrayList arrayList2) {
        return C43175k.I(this.f127831a.a(), C43175k.G(new a(this, arrayList, uVar, arrayList2, list, null)));
    }
}
