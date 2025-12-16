package com.avito.android.competitor_analytics.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.domain.model.ActionButton;
import com.avito.android.competitor_analytics.domain.model.ChartColor;
import com.avito.android.competitor_analytics.domain.model.ChartType;
import com.avito.android.competitor_analytics.domain.model.StateType;
import com.avito.android.competitor_analytics.domain.model.SuggestsStatus;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.ApiButton;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.ApiButtonOpt;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.OkResponseSuccessLayoutPeriodsItem;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.OkResponseSuccessMetricsItemChart;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.OkResponseSuccessSuggests;
import com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general.State;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.V2;
import dr.C39787b;
import dr.C39788c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: CompetitorAnalyticsV2Mapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/domain/i;", "Lcom/avito/android/competitor_analytics/domain/h;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.competitor_analytics.storage.a f124304a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final KO.a f124305b;

    /* compiled from: CompetitorAnalyticsV2Mapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124306a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f124307b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f124308c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f124309d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f124310e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f124311f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f124312g;

        static {
            int[] iArr = new int[StateType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StateType stateType = StateType.f124336c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StateType stateType2 = StateType.f124336c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                StateType stateType3 = StateType.f124336c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OkResponseSuccessLayoutPeriodsItem.Slug.values().length];
            try {
                iArr2[OkResponseSuccessLayoutPeriodsItem.Slug.Day.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OkResponseSuccessLayoutPeriodsItem.Slug.Week.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OkResponseSuccessLayoutPeriodsItem.Slug.Month.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f124306a = iArr2;
            int[] iArr3 = new int[OkResponseSuccessSuggests.Status.values().length];
            try {
                iArr3[OkResponseSuccessSuggests.Status.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OkResponseSuccessSuggests.Status.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OkResponseSuccessSuggests.Status.Alert.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f124307b = iArr3;
            int[] iArr4 = new int[ApiButtonOpt.Style.values().length];
            try {
                iArr4[ApiButtonOpt.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[ApiButtonOpt.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[ApiButtonOpt.Style.Overlay.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f124308c = iArr4;
            int[] iArr5 = new int[OkResponseSuccessMetricsItemChart.CurrentColor.values().length];
            try {
                iArr5[OkResponseSuccessMetricsItemChart.CurrentColor.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[OkResponseSuccessMetricsItemChart.CurrentColor.Violet.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[OkResponseSuccessMetricsItemChart.CurrentColor.Blue.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[OkResponseSuccessMetricsItemChart.CurrentColor.Orange.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            f124309d = iArr5;
            int[] iArr6 = new int[OkResponseSuccessMetricsItemChart.MicromarketColor.values().length];
            try {
                iArr6[OkResponseSuccessMetricsItemChart.MicromarketColor.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[OkResponseSuccessMetricsItemChart.MicromarketColor.Violet.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[OkResponseSuccessMetricsItemChart.MicromarketColor.Blue.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[OkResponseSuccessMetricsItemChart.MicromarketColor.Orange.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            f124310e = iArr6;
            int[] iArr7 = new int[OkResponseSuccessMetricsItemChart.Type.values().length];
            try {
                iArr7[OkResponseSuccessMetricsItemChart.Type.Money.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[OkResponseSuccessMetricsItemChart.Type.Conversion.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[OkResponseSuccessMetricsItemChart.Type.Bonus.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr7[OkResponseSuccessMetricsItemChart.Type.Regular.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            f124311f = iArr7;
            int[] iArr8 = new int[ApiButton.Style.values().length];
            try {
                iArr8[ApiButton.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[ApiButton.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr8[ApiButton.Style.Overlay.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            f124312g = iArr8;
        }
    }

    @Inject
    public i(@k com.avito.android.competitor_analytics.storage.a aVar, @k KO.a aVar2) {
        this.f124304a = aVar;
        this.f124305b = aVar2;
    }

    public static ActionButton i(ApiButton apiButton) {
        ActionButton.Style style;
        String title = apiButton.getTitle();
        DeepLink uri = apiButton.getUri();
        int i12 = a.f124312g[apiButton.getStyle().ordinal()];
        if (i12 == 1) {
            style = ActionButton.Style.f124318b;
        } else if (i12 == 2) {
            style = ActionButton.Style.f124319c;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            style = ActionButton.Style.f124320d;
        }
        return new ActionButton(title, uri, style);
    }

    public static float j(long j12, OkResponseSuccessMetricsItemChart.Type type) {
        float f12;
        int i12;
        int i13 = a.f124311f[type.ordinal()];
        if (i13 == 1) {
            f12 = j12;
            i12 = 100;
        } else if (i13 != 2) {
            if (i13 != 3) {
                if (i13 == 4) {
                    return j12;
                }
                throw new NoWhenBranchMatchedException();
            }
            f12 = j12;
            i12 = 100;
        } else {
            f12 = j12;
            i12 = 10;
        }
        return f12 / i12;
    }

    @Override // com.avito.android.competitor_analytics.domain.h
    @k
    public final State a(@k StateType stateType) {
        int iOrdinal = stateType.ordinal();
        if (iOrdinal == 0) {
            return State.Default;
        }
        if (iOrdinal == 1) {
            return State.Day;
        }
        if (iOrdinal == 2) {
            return State.Week;
        }
        if (iOrdinal == 3) {
            return State.Month;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.competitor_analytics.domain.h
    @l
    public final b.k b(@k C39787b c39787b) {
        SuggestsStatus suggestsStatus;
        OkResponseSuccessSuggests suggests = c39787b.getSuggests();
        if (suggests == null) {
            return null;
        }
        String title = suggests.getTitle();
        int i12 = a.f124307b[suggests.getStatus().ordinal()];
        if (i12 == 1) {
            suggestsStatus = SuggestsStatus.f124343e;
        } else if (i12 == 2) {
            suggestsStatus = SuggestsStatus.f124344f;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            suggestsStatus = SuggestsStatus.f124345g;
        }
        String statusText = suggests.getStatusText();
        List<dr.j> listA = suggests.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        for (dr.j jVar : listA) {
            arrayList.add(new b.k.a(jVar.getTitle(), jVar.getDescription(), (jVar.getUri() == null || (jVar.getUri() instanceof NoMatchLink)) ? null : jVar.getUri()));
        }
        return new b.k(title, suggestsStatus, statusText, arrayList);
    }

    @Override // com.avito.android.competitor_analytics.domain.h
    @l
    public final b.i c(@k C39787b c39787b) {
        C39788c layout = c39787b.getLayout();
        if (layout == null) {
            return null;
        }
        return new b.i(layout.getRecommendationTitle(), layout.getRecommendationSubtitle());
    }

    @Override // com.avito.android.competitor_analytics.domain.h
    @l
    public final b.a d(@k C39787b c39787b) {
        dr.d banner;
        C39788c layout = c39787b.getLayout();
        if (layout == null || (banner = layout.getBanner()) == null || this.f124304a.b().contains(String.valueOf(banner.getBannerId()))) {
            return null;
        }
        return new b.a(banner.getBannerId(), banner.getClosable(), banner.getTitle(), banner.getDescription(), i(banner.getAction()));
    }

    @Override // com.avito.android.competitor_analytics.domain.h
    @l
    public final b.e e(@k C39787b c39787b) {
        dr.f footer;
        C39788c layout = c39787b.getLayout();
        if (layout == null || (footer = layout.getFooter()) == null) {
            return null;
        }
        Image image = footer.getImage();
        String price = footer.getPrice();
        String title = footer.getTitle();
        List<ApiButton> listA = footer.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ApiButton) it.next()));
        }
        return new b.e(price, image, arrayList, title);
    }

    @Override // com.avito.android.competitor_analytics.domain.h
    @k
    public final ArrayList f(@k C39787b c39787b) {
        String strA;
        ActionButton actionButton;
        ArrayList arrayList;
        Iterator it;
        b.g.C3713b c3713b;
        OkResponseSuccessMetricsItemChart chart;
        ChartColor chartColor;
        ChartColor chartColor2;
        Map mapC;
        ChartType chartType;
        ActionButton.Style style;
        String iconName;
        List<dr.g> listC = c39787b.c();
        int i12 = 10;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listC, 10));
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            dr.g gVar = (dr.g) it2.next();
            dr.i titleHint = gVar.getTitleHint();
            if (titleHint == null || (iconName = titleHint.getIconName()) == null) {
                strA = null;
            } else {
                com.akita.compose.theme.re23.g.f65049a.getClass();
                strA = com.akita.compose.theme.re23.g.a(iconName);
            }
            String title = gVar.getTitle();
            b.g.c cVar = strA != null ? new b.g.c(strA, gVar.getTitleHint().getUri()) : null;
            b.g.a aVar = new b.g.a(gVar.getCurrent().getTitle(), gVar.getCurrent().getTotal(), gVar.getCurrent().getDiff());
            b.g.a aVar2 = new b.g.a(gVar.getMicromarket().getTitle(), gVar.getMicromarket().getTotal(), gVar.getMicromarket().getDiff());
            AttributedText description = gVar.getDescription();
            ApiButtonOpt action = gVar.getAction();
            if (action != null) {
                String title2 = action.getTitle();
                DeepLink uri = action.getUri();
                int i13 = a.f124308c[action.getStyle().ordinal()];
                if (i13 == 1) {
                    style = ActionButton.Style.f124318b;
                } else if (i13 == 2) {
                    style = ActionButton.Style.f124319c;
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    style = ActionButton.Style.f124320d;
                }
                actionButton = new ActionButton(title2, uri, style);
            } else {
                actionButton = null;
            }
            KO.a aVar3 = this.f124305b;
            aVar3.getClass();
            n<Object> nVar = KO.a.f9442h[4];
            if (!((Boolean) aVar3.f9447f.a().invoke()).booleanValue() || (chart = gVar.getChart()) == null) {
                arrayList = arrayList2;
                it = it2;
                c3713b = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                List<dr.h> listG = chart.g();
                it = it2;
                ArrayList arrayList6 = new ArrayList(C42745f0.q(listG, i12));
                Iterator it3 = listG.iterator();
                while (it3.hasNext()) {
                    dr.h hVar = (dr.h) it3.next();
                    arrayList3.add(hVar.getDate());
                    Long currentValue = hVar.getCurrentValue();
                    Iterator it4 = it3;
                    ArrayList arrayList7 = arrayList2;
                    arrayList4.add(currentValue != null ? Float.valueOf(j(currentValue.longValue(), chart.getType())) : null);
                    Long micromarketValue = hVar.getMicromarketValue();
                    arrayList6.add(Boolean.valueOf(arrayList5.add(micromarketValue != null ? Float.valueOf(j(micromarketValue.longValue(), chart.getType())) : null)));
                    it3 = it4;
                    arrayList2 = arrayList7;
                }
                arrayList = arrayList2;
                float fMax = Math.max(C42745f0.Y(C42745f0.C(arrayList4)), C42745f0.Y(C42745f0.C(arrayList5)));
                Float fValueOf = Float.valueOf(fMax);
                if (fMax == 0.0f) {
                    fValueOf = null;
                }
                float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                int i14 = a.f124309d[chart.getCurrentColor().ordinal()];
                if (i14 == 1) {
                    chartColor = ChartColor.f124323c;
                } else if (i14 == 2) {
                    chartColor = ChartColor.f124324d;
                } else if (i14 == 3) {
                    chartColor = ChartColor.f124325e;
                } else {
                    if (i14 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    chartColor = ChartColor.f124326f;
                }
                ChartColor chartColor3 = chartColor;
                int i15 = a.f124310e[chart.getMicromarketColor().ordinal()];
                if (i15 == 1) {
                    chartColor2 = ChartColor.f124323c;
                } else if (i15 == 2) {
                    chartColor2 = ChartColor.f124324d;
                } else if (i15 == 3) {
                    chartColor2 = ChartColor.f124325e;
                } else {
                    if (i15 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    chartColor2 = ChartColor.f124326f;
                }
                ChartColor chartColor4 = chartColor2;
                String metricSlug = chart.getMetricSlug();
                try {
                    Map<String, String> mapD = chart.d();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(mapD.size()));
                    Iterator it5 = mapD.entrySet().iterator();
                    while (it5.hasNext()) {
                        Object next = it5.next();
                        Iterator it6 = it5;
                        linkedHashMap.put(Integer.valueOf(Integer.parseInt((String) ((Map.Entry) next).getKey())), ((Map.Entry) next).getValue());
                        it5 = it6;
                    }
                    mapC = linkedHashMap;
                } catch (NumberFormatException e12) {
                    V2.f318762a.f(e12);
                    mapC = P0.c();
                }
                String symbol = chart.getSymbol();
                int i16 = a.f124311f[chart.getType().ordinal()];
                if (i16 == 1) {
                    chartType = ChartType.f124330b;
                } else if (i16 == 2) {
                    chartType = ChartType.f124331c;
                } else if (i16 == 3) {
                    chartType = ChartType.f124332d;
                } else {
                    if (i16 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    chartType = ChartType.f124333e;
                }
                c3713b = new b.g.C3713b(chartColor3, chartColor4, metricSlug, mapC, symbol, chartType, arrayList3, arrayList4, arrayList5, fFloatValue);
            }
            arrayList2 = arrayList;
            arrayList2.add(new b.g(title, cVar, aVar, aVar2, description, actionButton, c3713b));
            it2 = it;
            i12 = 10;
        }
        return arrayList2;
    }

    @Override // com.avito.android.competitor_analytics.domain.h
    @l
    public final b.d g(@k C39787b c39787b) {
        dr.e faqHint;
        C39788c layout = c39787b.getLayout();
        if (layout == null || (faqHint = layout.getFaqHint()) == null) {
            return null;
        }
        String iconName = faqHint.getIconName();
        com.akita.compose.theme.re23.g.f65049a.getClass();
        return new b.d(com.akita.compose.theme.re23.g.a(iconName), faqHint.getUri());
    }

    @Override // com.avito.android.competitor_analytics.domain.h
    @l
    public final b.h h(@k C39787b c39787b) {
        List<OkResponseSuccessLayoutPeriodsItem> listD;
        StateType stateType;
        C39788c layout = c39787b.getLayout();
        if (layout == null || (listD = layout.d()) == null) {
            return null;
        }
        List<OkResponseSuccessLayoutPeriodsItem> list = listD;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z12 = true;
            if (!it.hasNext()) {
                break;
            }
            OkResponseSuccessLayoutPeriodsItem okResponseSuccessLayoutPeriodsItem = (OkResponseSuccessLayoutPeriodsItem) it.next();
            String title = okResponseSuccessLayoutPeriodsItem.getTitle();
            if (okResponseSuccessLayoutPeriodsItem.getUnavailableHint() != null) {
                z12 = false;
            }
            arrayList.add(new SegmentedControl.c(z12, title));
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
        for (OkResponseSuccessLayoutPeriodsItem okResponseSuccessLayoutPeriodsItem2 : list) {
            int i12 = a.f124306a[okResponseSuccessLayoutPeriodsItem2.getSlug().ordinal()];
            if (i12 == 1) {
                stateType = StateType.f124337d;
            } else if (i12 == 2) {
                stateType = StateType.f124338e;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                stateType = StateType.f124339f;
            }
            arrayList2.add(new b.h.a(stateType, okResponseSuccessLayoutPeriodsItem2.getUnavailableHint(), null, null, null, null, null, C42784z0.f406748b));
        }
        Iterator<OkResponseSuccessLayoutPeriodsItem> it2 = listD.iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            }
            if (it2.next().getIsSelected()) {
                break;
            }
            i13++;
        }
        Integer numValueOf = i13 >= 0 ? Integer.valueOf(i13) : null;
        return new b.h(arrayList, arrayList2, numValueOf != null ? numValueOf.intValue() : 0);
    }
}
