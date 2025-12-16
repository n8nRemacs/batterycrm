package com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink;

import Y41.p;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink.RegionSheetLink;
import com.avito.android.cpx_promo_geo.screens.region_sheet.ui.RegionSheetFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import rv.C47919b;

/* compiled from: RegionSheetDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/deeplink/a;", "Lev/a;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/deeplink/RegionSheetLink;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<RegionSheetLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.f f128255f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f128256g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f128257h;

    /* compiled from: RegionSheetDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3805a extends C42801a implements p<C47919b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            a aVar = (a) this.receiver;
            aVar.getClass();
            long[] longArray = c47919b.f437159b.getLongArray("cpx_promo_geo_region_sheet_result_ids");
            if (longArray != null) {
                aVar.j(new RegionSheetLink.b.C3804b(C42756l.f0(longArray)));
            } else {
                aVar.j(RegionSheetLink.b.a.f128253b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f128255f = fVar;
        this.f128256g = dVar;
        this.f128257h = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        RegionSheetLink regionSheetLink = (RegionSheetLink) deepLink;
        RegionSheetFragment.f128459l0.getClass();
        RegionSheetFragment regionSheetFragment = new RegionSheetFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("sheet_data", regionSheetLink.f128252d);
        bundle2.putString("context", regionSheetLink.f128250b);
        bundle2.putString("item_id", regionSheetLink.f128251c);
        regionSheetFragment.setArguments(bundle2);
        this.f128256g.w1(regionSheetFragment, "CpxPromoGeoRegionSheetDeeplinkHandler_" + this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new C3805a(2, this, a.class, "handleResult", "handleResult(Lcom/avito/android/deeplink_handler/view/result/FragmentResult;)V", 4), y.a(this.f128255f.l1("CpxPromoGeoRegionSheetDeeplinkHandler_" + this.f395444b))), this.f128257h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f128257h, null);
    }
}
