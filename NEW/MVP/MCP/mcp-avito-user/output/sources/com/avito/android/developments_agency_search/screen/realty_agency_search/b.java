package com.avito.android.developments_agency_search.screen.realty_agency_search;

import Lw.c;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.developments_agency_search.domain.GetMapMarkersResponse;
import com.avito.android.developments_agency_search.domain.Metro;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.a;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_lots_search_get.OrderBy;
import com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_lots_search_get.OrderDirection;
import com.avito.android.lib.design.map.state.MapState;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import dx.C39815c;
import dx.C39819g;
import dx.C39820h;
import dx.C39821i;
import ex.C40176c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyAgencySearchConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/b;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/a;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.developments_agency_search.screen.realty_agency_search.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f138468a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ContextThemeWrapper f138469b;

    /* compiled from: RealtyAgencySearchConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/b$a;", "", "<init>", "()V", "", "DEFAULT_PIN_Z_INDEX", "F", "SELECTED_PIN_Z_INDEX", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RealtyAgencySearchConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C4180b {
        static {
            int[] iArr = new int[DevelopmentSort.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DevelopmentSort.a aVar = DevelopmentSort.f138655b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DevelopmentSort.a aVar2 = DevelopmentSort.f138655b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DevelopmentSort.a aVar3 = DevelopmentSort.f138655b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DevelopmentSort.a aVar4 = DevelopmentSort.f138655b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[LotSort.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                LotSort.a aVar5 = LotSort.f138659b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                LotSort.a aVar6 = LotSort.f138659b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@Y61.k Context context, @Y61.k l lVar) {
        this.f138468a = lVar;
        this.f138469b = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.a
    @Y61.k
    public final String a(@Y61.k LotSort lotSort) {
        int iOrdinal = lotSort.ordinal();
        ContextThemeWrapper contextThemeWrapper = this.f138469b;
        if (iOrdinal == 0) {
            return contextThemeWrapper.getString(R.string.das_search_sorting_lot_by_price_asc);
        }
        if (iOrdinal == 1) {
            return contextThemeWrapper.getString(R.string.das_search_sorting_lot_by_price_desc);
        }
        if (iOrdinal == 2) {
            return contextThemeWrapper.getString(R.string.das_search_sorting_lot_by_completion_quarter);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.a
    @Y61.k
    public final Q<OrderBy, OrderDirection> b(@Y61.k LotSort lotSort) {
        int iOrdinal = lotSort.ordinal();
        if (iOrdinal == 0) {
            return new Q<>(OrderBy.Price, OrderDirection.Asc);
        }
        if (iOrdinal == 1) {
            return new Q<>(OrderBy.Price, OrderDirection.Desc);
        }
        if (iOrdinal == 2) {
            return new Q<>(OrderBy.CompletionDate, OrderDirection.Asc);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.a
    @Y61.k
    public final ArrayList c(@Y61.k c.e eVar) {
        boolean z12;
        PrintableText printableTextE;
        ArrayList arrayList = eVar.f10264d;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C40176c c40176c = (C40176c) it.next();
            String strValueOf = String.valueOf(c40176c.getId());
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) c40176c.getTitle()).append((CharSequence) " ");
            String number = c40176c.getNumber();
            ContextThemeWrapper contextThemeWrapper = this.f138469b;
            PrintableText printableTextE2 = com.avito.android.printable_text.b.e(spannableStringBuilderAppend.append(number, new ForegroundColorSpan(C35835l0.d(R.attr.gray54, contextThemeWrapper)), 33));
            a.b bVar = new a.b(c40176c.getPrice().getMain(), c40176c.getPriceTooltip() != null);
            if (c40176c.getIsBestAgentCommission()) {
                SpannableStringBuilder spannableStringBuilderAppend2 = new SpannableStringBuilder().append((CharSequence) contextThemeWrapper.getString(R.string.das_search_result_lot_item_agent_commission_prefix)).append((CharSequence) " ");
                FV.a.f4720a.getClass();
                z12 = false;
                SpannableStringBuilder spannableStringBuilderAppend3 = spannableStringBuilderAppend2.append(FV.a.b(R.attr.textIconFlashFilled, contextThemeWrapper), Ow.c.a(contextThemeWrapper, R.attr.textM20, null, R.attr.green700, null, 20), 33);
                String commissionValue = c40176c.getCommissionValue();
                printableTextE = com.avito.android.printable_text.b.e(spannableStringBuilderAppend3.append(commissionValue != null ? commissionValue : "", Ow.c.a(contextThemeWrapper, R.attr.textM20, null, R.attr.green700, Integer.valueOf(com.avito.android.lib.util.f.g(contextThemeWrapper, "medium")), 4), 33));
            } else {
                String agentCommissionFullValue = c40176c.getAgentCommissionFullValue();
                printableTextE = com.avito.android.printable_text.b.f(agentCommissionFullValue != null ? agentCommissionFullValue : "");
                z12 = false;
            }
            c40176c.getId();
            eVar.f10263c.getClass();
            a.C4179a c4179a = new a.C4179a(z12);
            List<ex.h> listI = c40176c.i();
            ArrayList arrayList3 = new ArrayList(C42745f0.q(listI, 10));
            for (ex.h hVar : listI) {
                long id2 = hVar.getId();
                String name = hVar.getName();
                String district = hVar.getDistrict();
                String distance = hVar.getDistance();
                ex.i distanceInTime = hVar.getDistanceInTime();
                Metro.DistanceInTime distanceInTime2 = distanceInTime != null ? new Metro.DistanceInTime(distanceInTime.getText(), distanceInTime.getIconName()) : null;
                List<ex.j> listE = hVar.e();
                ArrayList arrayList4 = new ArrayList(C42745f0.q(listE, 10));
                Iterator<T> it2 = listE.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new Metro.MetroLine(((ex.j) it2.next()).getColor()));
                }
                arrayList3.add(new Metro(id2, name, district, distance, distanceInTime2, arrayList4));
            }
            arrayList2.add(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.lot.a(strValueOf, c40176c, printableTextE2, bVar, printableTextE, c4179a, arrayList3));
        }
        return arrayList2;
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.a
    @Y61.k
    public final ArrayList d(@Y61.k ArrayList arrayList) {
        PrintableText printableTextE;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C39815c c39815c = (C39815c) it.next();
            String strValueOf = String.valueOf(c39815c.getId());
            boolean zF2 = L.f(c39815c.getIsBestAgentCommission(), Boolean.TRUE);
            ContextThemeWrapper contextThemeWrapper = this.f138469b;
            if (zF2) {
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) contextThemeWrapper.getString(R.string.das_search_result_development_item_agent_commission_prefix)).append((CharSequence) " ");
                FV.a.f4720a.getClass();
                SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilderAppend.append(FV.a.b(R.attr.textIconFlashFilled, contextThemeWrapper), Ow.c.a(contextThemeWrapper, R.attr.textM20, null, R.attr.green700, null, 20), 33);
                String commissionValue = c39815c.getCommissionValue();
                if (commissionValue == null) {
                    commissionValue = "";
                }
                printableTextE = com.avito.android.printable_text.b.e(spannableStringBuilderAppend2.append(commissionValue, Ow.c.a(contextThemeWrapper, R.attr.textM20, null, R.attr.green700, Integer.valueOf(com.avito.android.lib.util.f.g(contextThemeWrapper, "medium")), 4), 33));
            } else {
                printableTextE = com.avito.android.printable_text.b.f(c39815c.getAgentCommission());
            }
            a.C4173a c4173a = new a.C4173a(printableTextE, c39815c.getCommissionTooltip() != null);
            String string = contextThemeWrapper.getString(R.string.das_search_result_development_gallery_client_fixation);
            List<C39819g> listI = c39815c.i();
            if (listI == null) {
                listI = C42784z0.f406748b;
            }
            List<C39819g> list = listI;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
            for (C39819g c39819g : list) {
                long id2 = c39819g.getId();
                String name = c39819g.getName();
                String district = c39819g.getDistrict();
                String distance = c39819g.getDistance();
                C39820h distanceInTime = c39819g.getDistanceInTime();
                Metro.DistanceInTime distanceInTime2 = distanceInTime != null ? new Metro.DistanceInTime(distanceInTime.getText(), distanceInTime.getIconName()) : null;
                List<C39821i> listE = c39819g.e();
                ArrayList arrayList4 = new ArrayList(C42745f0.q(listE, 10));
                Iterator<T> it2 = listE.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new Metro.MetroLine(((C39821i) it2.next()).getColor()));
                }
                arrayList3.add(new Metro(id2, name, district, distance, distanceInTime2, arrayList4));
            }
            arrayList2.add(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development.a(strValueOf, c39815c, c4173a, string, arrayList3));
        }
        return arrayList2;
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.a
    @Y61.k
    public final ArrayList e(@Y61.k kotlin.enums.a aVar, @Y61.k DevelopmentSort developmentSort) {
        ArrayList arrayList = new ArrayList(C42745f0.q(aVar, 10));
        Iterator<E> it = aVar.iterator();
        while (it.hasNext()) {
            DevelopmentSort developmentSort2 = (DevelopmentSort) it.next();
            arrayList.add(new com.avito.android.developments_agency_search.adapter.checkable_item.a(developmentSort2.name(), f(developmentSort2), developmentSort2 == developmentSort));
        }
        return arrayList;
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.a
    @Y61.k
    public final String f(@Y61.k DevelopmentSort developmentSort) {
        int iOrdinal = developmentSort.ordinal();
        ContextThemeWrapper contextThemeWrapper = this.f138469b;
        if (iOrdinal == 0) {
            return contextThemeWrapper.getString(R.string.das_search_sorting_development_by_popularity);
        }
        if (iOrdinal == 1) {
            return contextThemeWrapper.getString(R.string.das_search_sorting_development_by_name);
        }
        if (iOrdinal == 2) {
            return contextThemeWrapper.getString(R.string.das_search_sorting_development_by_completion_quarter);
        }
        if (iOrdinal == 3) {
            return contextThemeWrapper.getString(R.string.das_search_sorting_development_by_price_asc);
        }
        if (iOrdinal == 4) {
            return contextThemeWrapper.getString(R.string.das_search_sorting_development_by_price_desc);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.a
    @Y61.k
    public final ArrayList g(@Y61.k kotlin.enums.a aVar, @Y61.k LotSort lotSort) {
        ArrayList arrayList = new ArrayList(C42745f0.q(aVar, 10));
        Iterator<E> it = aVar.iterator();
        while (it.hasNext()) {
            LotSort lotSort2 = (LotSort) it.next();
            arrayList.add(new com.avito.android.developments_agency_search.adapter.checkable_item.a(lotSort2.name(), a(lotSort2), lotSort2 == lotSort));
        }
        return arrayList;
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.a
    @Y61.k
    public final ArrayList h(@Y61.l String str, @Y61.l List list) {
        List<GetMapMarkersResponse.Marker> list2 = list == null ? C42784z0.f406748b : list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (GetMapMarkersResponse.Marker marker : list2) {
            boolean zF2 = L.f(str, String.valueOf(marker.getId()));
            float f12 = zF2 ? 2.0f : 1.0f;
            arrayList.add(new MapState.a(String.valueOf(marker.getId()), new AvitoMapPoint(marker.getLatitude(), marker.getLongitude(), null, 4, null), this.f138468a.a(marker, zF2), AvitoMapMarker.Anchor.BOTTOM_CENTER, f12, marker.getId() + '-' + marker.getType() + '-' + marker.getTitle() + '-' + marker.getSubtitle() + '-' + zF2, false));
        }
        return arrayList;
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.a
    @Y61.k
    public final Q<com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderBy, com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderDirection> i(@Y61.k DevelopmentSort developmentSort) {
        int iOrdinal = developmentSort.ordinal();
        if (iOrdinal == 0) {
            return new Q<>(com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderBy.DevelopmentViewCount, com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderDirection.Desc);
        }
        if (iOrdinal == 1) {
            return new Q<>(com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderBy.DevelopmentName, com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderDirection.Asc);
        }
        if (iOrdinal == 2) {
            return new Q<>(com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderBy.CompletionDate, com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderDirection.Asc);
        }
        if (iOrdinal == 3) {
            return new Q<>(com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderBy.Price, com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderDirection.Asc);
        }
        if (iOrdinal == 4) {
            return new Q<>(com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderBy.Price, com.avito.android.developments_agency_search_impl.generated.api.api_2_nd_trx_developments_search_get.OrderDirection.Desc);
        }
        throw new NoWhenBranchMatchedException();
    }
}
