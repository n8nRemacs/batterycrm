package com.avito.android.safedeal.universal_delivery_type;

import Hr.InterfaceC14024a;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.UniversalDeliveryTypePvzScreen;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.avito.android.safedeal.universal_delivery_type.courier.BeduinUniversalDeliveryTypeCourierFragment;
import com.avito.android.safedeal.universal_delivery_type.shipping_competition.UniversalDeliveryTypeShippingCompetitionFragment;
import com.avito.android.universal_map.UniversalMapParams;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryTypePagerAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/b;", "Landroidx/viewpager2/adapter/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends androidx.viewpager2.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.i f256435k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f256436l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public List<? extends UniversalDeliveryTypeContent.Tab> f256437m;

    public b(@Y61.k UniversalDeliveryTypeActivity universalDeliveryTypeActivity, @Y61.k com.avito.android.universal_map.i iVar, @Y61.k InterfaceC14024a interfaceC14024a) {
        super(universalDeliveryTypeActivity);
        this.f256435k = iVar;
        this.f256436l = interfaceC14024a;
        this.f256437m = C42784z0.f406748b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f256437m.size();
    }

    @Override // androidx.viewpager2.adapter.b, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return this.f256437m.get(i12).hashCode();
    }

    @Override // androidx.viewpager2.adapter.b
    public final boolean k(long j12) {
        List<? extends UniversalDeliveryTypeContent.Tab> list = this.f256437m;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((UniversalDeliveryTypeContent.Tab) it.next()).hashCode() == j12) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.viewpager2.adapter.b
    @Y61.k
    public final Fragment l(int i12) {
        UniversalDeliveryTypeContent.Tab tab = this.f256437m.get(i12);
        if (tab instanceof UniversalDeliveryTypeContent.Tab.ShippingCompetition) {
            UniversalDeliveryTypeShippingCompetitionFragment.f256744A0.getClass();
            UniversalDeliveryTypeShippingCompetitionFragment universalDeliveryTypeShippingCompetitionFragment = new UniversalDeliveryTypeShippingCompetitionFragment();
            universalDeliveryTypeShippingCompetitionFragment.setArguments(C22777e.b(new Q("initial_content_extra", (UniversalDeliveryTypeContent.Tab.ShippingCompetition) tab)));
            return universalDeliveryTypeShippingCompetitionFragment;
        }
        if (tab instanceof UniversalDeliveryTypeContent.Tab.Courier) {
            BeduinUniversalDeliveryTypeCourierFragment.f256442D0.getClass();
            BeduinUniversalDeliveryTypeCourierFragment beduinUniversalDeliveryTypeCourierFragment = new BeduinUniversalDeliveryTypeCourierFragment();
            beduinUniversalDeliveryTypeCourierFragment.setArguments(C22777e.b(new Q("initial_content_extra", (UniversalDeliveryTypeContent.Tab.Courier) tab)));
            return beduinUniversalDeliveryTypeCourierFragment;
        }
        if (!(tab instanceof UniversalDeliveryTypeContent.Tab.PvzOnUniversalMap)) {
            if (!(tab instanceof UniversalDeliveryTypeContent.Tab.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            AW.a aVar = AW.a.f430a;
            StringBuilder sb2 = new StringBuilder("Try to create unknown type=");
            sb2.append(tab.getTabType());
            sb2.append(" with title=");
            sb2.append(tab.getTitle());
            aVar.getClass();
            return new Fragment();
        }
        UniversalDeliveryTypeContent.Tab.PvzOnUniversalMap pvzOnUniversalMap = (UniversalDeliveryTypeContent.Tab.PvzOnUniversalMap) tab;
        UniversalDeliveryTypeContent.Tab.PvzOnUniversalMap.MapParams params = pvzOnUniversalMap.getParams();
        String pointListRequest = params.getPointListRequest();
        String pointInfoRequest = params.getPointInfoRequest();
        String filtersInfoRequest = params.getFiltersInfoRequest();
        UniversalMapParams.ToolbarSettings toolbarSettings = params.getToolbarSettings();
        new com.avito.android.universal_map.o();
        return this.f256435k.a(new UniversalMapParams(pointListRequest, pointInfoRequest, filtersInfoRequest, toolbarSettings, com.avito.android.universal_map.o.a(params.getMapSettings(), new a(this)), params.getExtraParameters(), new UniversalMapParams.TrackerSettings.TrackByHost(UniversalDeliveryTypePvzScreen.f90536d.f90471b), params.getOnOpenEvent(), pvzOnUniversalMap.getOnInitActions()), tab.getTabType());
    }
}
