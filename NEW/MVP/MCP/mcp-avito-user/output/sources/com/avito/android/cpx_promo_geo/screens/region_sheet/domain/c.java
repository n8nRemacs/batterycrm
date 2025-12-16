package com.avito.android.cpx_promo_geo.screens.region_sheet.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo_geo.generated.api.api_cpx_promo_search_locations.GeoTreeItemApi;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetInternalAction;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43208v0;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.internal.m;
import ns.InterfaceC44470a;

/* compiled from: RegionSheetSearchUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/domain/c;", "", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f128293a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44470a f128294b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f128295c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a f128296d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public String f128297e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final kotlinx.coroutines.sync.d f128298f = new kotlinx.coroutines.sync.d();

    /* compiled from: RegionSheetSearchUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f128299a;

        static {
            int[] iArr = new int[GeoTreeItemApi.CheckboxState.values().length];
            try {
                iArr[GeoTreeItemApi.CheckboxState.NotSelected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GeoTreeItemApi.CheckboxState.IsHome.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GeoTreeItemApi.CheckboxState.PartialSelected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GeoTreeItemApi.CheckboxState.FullSelected.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f128299a = iArr;
        }
    }

    @Inject
    public c(@k R0 r02, @k InterfaceC44470a interfaceC44470a, @com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.di.l @k String str, @k com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.analytics.a aVar) {
        this.f128293a = r02;
        this.f128294b = interfaceC44470a;
        this.f128295c = str;
        this.f128296d = aVar;
    }

    public static RegionSheetState.Location b(GeoTreeItemApi geoTreeItemApi, boolean z12) {
        RegionSheetState.Location.CheckboxState checkboxState;
        Map mapG;
        long locationId = geoTreeItemApi.getLocationId();
        String title = geoTreeItemApi.getTitle();
        int i12 = a.f128299a[geoTreeItemApi.getCheckboxState().ordinal()];
        if (i12 == 1) {
            checkboxState = RegionSheetState.Location.CheckboxState.f128408e;
        } else if (i12 == 2) {
            checkboxState = RegionSheetState.Location.CheckboxState.f128405b;
        } else if (i12 == 3) {
            checkboxState = RegionSheetState.Location.CheckboxState.f128407d;
        } else {
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            checkboxState = RegionSheetState.Location.CheckboxState.f128406c;
        }
        RegionSheetState.Location.CheckboxState checkboxState2 = checkboxState;
        if (z12) {
            mapG = P0.c();
        } else {
            List<GeoTreeItemApi> listB = geoTreeItemApi.b();
            ArrayList arrayList = new ArrayList(C42745f0.q(listB, 10));
            for (GeoTreeItemApi geoTreeItemApi2 : listB) {
                arrayList.add(new Q(Long.valueOf(geoTreeItemApi2.getLocationId()), b(geoTreeItemApi2, true)));
            }
            Q[] qArr = (Q[]) arrayList.toArray(new Q[0]);
            mapG = P0.g((Q[]) Arrays.copyOf(qArr, qArr.length));
        }
        return new RegionSheetState.Location(locationId, title, checkboxState2, null, mapG, C42784z0.f406748b, false, false, 192, null);
    }

    @k
    public final m a(@k String str, @k List list, boolean z12) {
        return C43175k.N(C43175k.G(new d(this, str, null)), str.length() <= 2 ? new C43210w(RegionSheetInternalAction.SearchLoading.f128377b) : C43175k.I(this.f128293a.a(), new C43208v0(new f(this, str, null), C43175k.G(new e(z12, this, str, list, null)))));
    }
}
