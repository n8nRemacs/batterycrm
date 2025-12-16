package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import ts.C48709c;
import ts.InterfaceC48707a;

/* compiled from: CpxPromoGeoActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Lts/a;", "Lcom/avito/android/cpx_promo_geo/screens/cpx_promo_geo/mvi/entity/CpxPromoGeoInternalAction;", "Lts/c;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC48707a, CpxPromoGeoInternalAction, C48709c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.b f127865a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a f127866b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.e f127867c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f127868d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public C48709c f127869e;

    @Inject
    public e(@Y61.k com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.b bVar, @Y61.k com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a aVar, @Y61.k com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.domain.e eVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f127865a = bVar;
        this.f127866b = aVar;
        this.f127867c = eVar;
        this.f127868d = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new d(this, null), new a(new b(y.a(this.f127868d.V9())))), C43175k.C(new c(this, aVar, null), c43197r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bd  */
    /* JADX WARN: Type inference failed for: r13v14, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object] */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.entity.CpxPromoGeoInternalAction> b(@Y61.k ts.InterfaceC48707a r23, @Y61.k ts.C48709c r24) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.mvi.e.b(ts.a, ts.c):kotlinx.coroutines.flow.i");
    }
}
