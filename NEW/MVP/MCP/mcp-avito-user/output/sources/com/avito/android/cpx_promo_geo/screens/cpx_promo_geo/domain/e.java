package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.l;
import com.avito.android.util.R0;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ns.InterfaceC44470a;
import ps.C47136d;

/* compiled from: PostCpxPromoGeoSaveUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/domain/e;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC44470a f127844a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f127845b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f127846c;

    @Inject
    public e(@k R0 r02, @l @k String str, @k InterfaceC44470a interfaceC44470a) {
        this.f127844a = interfaceC44470a;
        this.f127845b = str;
        this.f127846c = r02;
    }

    @k
    public final InterfaceC43160i a(@Y61.l ArrayList arrayList, @Y61.l C47136d c47136d, @Y61.l ArrayList arrayList2) {
        return C43175k.I(this.f127846c.a(), C43175k.G(new d(this, arrayList, c47136d, arrayList2, null)));
    }
}
