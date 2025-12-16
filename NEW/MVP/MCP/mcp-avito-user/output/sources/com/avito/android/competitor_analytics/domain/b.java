package com.avito.android.competitor_analytics.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.domain.model.ActionButton;
import com.avito.android.competitor_analytics.domain.model.ChartColor;
import com.avito.android.competitor_analytics.domain.model.ChartType;
import com.avito.android.competitor_analytics.domain.model.StateType;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.ApiButton;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.ApiButtonOpt;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.OkResponseSuccessLayoutPeriodsItem;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.OkResponseSuccessMetricsItemsItemChart;
import com.avito.android.competitor_analytics.generated.api.api_1_competitor_analytics_general.State;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.V2;
import cr.C39401b;
import cr.m;
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

/* compiled from: CompetitorAnalyticsMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/domain/b;", "Lcom/avito/android/competitor_analytics/domain/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.competitor_analytics.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.competitor_analytics.storage.a f124277a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final KO.a f124278b;

    /* compiled from: CompetitorAnalyticsMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124279a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f124280b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f124281c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f124282d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f124283e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f124284f;

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
            f124279a = iArr2;
            int[] iArr3 = new int[ApiButtonOpt.Style.values().length];
            try {
                iArr3[ApiButtonOpt.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ApiButtonOpt.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ApiButtonOpt.Style.Overlay.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f124280b = iArr3;
            int[] iArr4 = new int[OkResponseSuccessMetricsItemsItemChart.CurrentColor.values().length];
            try {
                iArr4[OkResponseSuccessMetricsItemsItemChart.CurrentColor.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[OkResponseSuccessMetricsItemsItemChart.CurrentColor.Violet.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[OkResponseSuccessMetricsItemsItemChart.CurrentColor.Blue.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[OkResponseSuccessMetricsItemsItemChart.CurrentColor.Orange.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f124281c = iArr4;
            int[] iArr5 = new int[OkResponseSuccessMetricsItemsItemChart.MicromarketColor.values().length];
            try {
                iArr5[OkResponseSuccessMetricsItemsItemChart.MicromarketColor.Green.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[OkResponseSuccessMetricsItemsItemChart.MicromarketColor.Violet.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[OkResponseSuccessMetricsItemsItemChart.MicromarketColor.Blue.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[OkResponseSuccessMetricsItemsItemChart.MicromarketColor.Orange.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            f124282d = iArr5;
            int[] iArr6 = new int[OkResponseSuccessMetricsItemsItemChart.Type.values().length];
            try {
                iArr6[OkResponseSuccessMetricsItemsItemChart.Type.Money.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[OkResponseSuccessMetricsItemsItemChart.Type.Conversion.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[OkResponseSuccessMetricsItemsItemChart.Type.Bonus.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[OkResponseSuccessMetricsItemsItemChart.Type.Regular.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            f124283e = iArr6;
            int[] iArr7 = new int[ApiButton.Style.values().length];
            try {
                iArr7[ApiButton.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[ApiButton.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr7[ApiButton.Style.Overlay.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            f124284f = iArr7;
        }
    }

    @Inject
    public b(@k com.avito.android.competitor_analytics.storage.a aVar, @k KO.a aVar2) {
        this.f124277a = aVar;
        this.f124278b = aVar2;
    }

    public static ActionButton h(ApiButton apiButton) {
        ActionButton.Style style;
        String title = apiButton.getTitle();
        DeepLink uri = apiButton.getUri();
        int i12 = a.f124284f[apiButton.getStyle().ordinal()];
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

    public static float i(long j12, OkResponseSuccessMetricsItemsItemChart.Type type) {
        float f12;
        int i12;
        int i13 = a.f124283e[type.ordinal()];
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

    @Override // com.avito.android.competitor_analytics.domain.a
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

    @Override // com.avito.android.competitor_analytics.domain.a
    @l
    public final b.h b(@k C39401b c39401b) {
        List<OkResponseSuccessLayoutPeriodsItem> listC;
        StateType stateType;
        cr.e layout = c39401b.getLayout();
        if (layout == null || (listC = layout.c()) == null) {
            return null;
        }
        List<OkResponseSuccessLayoutPeriodsItem> list = listC;
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
            int i12 = a.f124279a[okResponseSuccessLayoutPeriodsItem2.getSlug().ordinal()];
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
        Iterator<OkResponseSuccessLayoutPeriodsItem> it2 = listC.iterator();
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

    @Override // com.avito.android.competitor_analytics.domain.a
    @k
    public final b.f c(@k C39401b c39401b) {
        String strA;
        ActionButton actionButton;
        String str;
        Iterator it;
        b.g.C3713b c3713b;
        OkResponseSuccessMetricsItemsItemChart chart;
        ChartColor chartColor;
        ChartColor chartColor2;
        Map mapC;
        ChartType chartType;
        ActionButton.Style style;
        String iconName;
        cr.j metrics = c39401b.getMetrics();
        String title = metrics.getTitle();
        List<cr.k> listA = metrics.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator it2 = listA.iterator();
        while (it2.hasNext()) {
            cr.k kVar = (cr.k) it2.next();
            m titleHint = kVar.getTitleHint();
            if (titleHint == null || (iconName = titleHint.getIconName()) == null) {
                strA = null;
            } else {
                com.akita.compose.theme.re23.g.f65049a.getClass();
                strA = com.akita.compose.theme.re23.g.a(iconName);
            }
            String title2 = kVar.getTitle();
            b.g.c cVar = strA != null ? new b.g.c(strA, kVar.getTitleHint().getUri()) : null;
            b.g.a aVar = new b.g.a(kVar.getCurrent().getTitle(), kVar.getCurrent().getTotal(), kVar.getCurrent().getDiff());
            b.g.a aVar2 = new b.g.a(kVar.getMicromarket().getTitle(), kVar.getMicromarket().getTotal(), kVar.getMicromarket().getDiff());
            AttributedText description = kVar.getDescription();
            ApiButtonOpt action = kVar.getAction();
            if (action != null) {
                String title3 = action.getTitle();
                DeepLink uri = action.getUri();
                int i12 = a.f124280b[action.getStyle().ordinal()];
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
                actionButton = new ActionButton(title3, uri, style);
            } else {
                actionButton = null;
            }
            KO.a aVar3 = this.f124278b;
            aVar3.getClass();
            n<Object> nVar = KO.a.f9442h[4];
            if (!((Boolean) aVar3.f9447f.a().invoke()).booleanValue() || (chart = kVar.getChart()) == null) {
                str = title;
                it = it2;
                c3713b = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                List<cr.l> listG = chart.g();
                it = it2;
                ArrayList arrayList5 = new ArrayList(C42745f0.q(listG, 10));
                Iterator it3 = listG.iterator();
                while (it3.hasNext()) {
                    cr.l lVar = (cr.l) it3.next();
                    arrayList2.add(lVar.getDate());
                    Long currentValue = lVar.getCurrentValue();
                    Iterator it4 = it3;
                    String str2 = title;
                    arrayList3.add(currentValue != null ? Float.valueOf(i(currentValue.longValue(), chart.getType())) : null);
                    Long micromarketValue = lVar.getMicromarketValue();
                    arrayList5.add(Boolean.valueOf(arrayList4.add(micromarketValue != null ? Float.valueOf(i(micromarketValue.longValue(), chart.getType())) : null)));
                    it3 = it4;
                    title = str2;
                }
                str = title;
                float fMax = Math.max(C42745f0.Y(C42745f0.C(arrayList3)), C42745f0.Y(C42745f0.C(arrayList4)));
                Float fValueOf = Float.valueOf(fMax);
                if (fMax == 0.0f) {
                    fValueOf = null;
                }
                float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
                int i13 = a.f124281c[chart.getCurrentColor().ordinal()];
                if (i13 == 1) {
                    chartColor = ChartColor.f124323c;
                } else if (i13 == 2) {
                    chartColor = ChartColor.f124324d;
                } else if (i13 == 3) {
                    chartColor = ChartColor.f124325e;
                } else {
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    chartColor = ChartColor.f124326f;
                }
                ChartColor chartColor3 = chartColor;
                int i14 = a.f124282d[chart.getMicromarketColor().ordinal()];
                if (i14 == 1) {
                    chartColor2 = ChartColor.f124323c;
                } else if (i14 == 2) {
                    chartColor2 = ChartColor.f124324d;
                } else if (i14 == 3) {
                    chartColor2 = ChartColor.f124325e;
                } else {
                    if (i14 != 4) {
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
                int i15 = a.f124283e[chart.getType().ordinal()];
                if (i15 == 1) {
                    chartType = ChartType.f124330b;
                } else if (i15 == 2) {
                    chartType = ChartType.f124331c;
                } else if (i15 == 3) {
                    chartType = ChartType.f124332d;
                } else {
                    if (i15 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    chartType = ChartType.f124333e;
                }
                c3713b = new b.g.C3713b(chartColor3, chartColor4, metricSlug, mapC, symbol, chartType, arrayList2, arrayList3, arrayList4, fFloatValue);
            }
            arrayList.add(new b.g(title2, cVar, aVar, aVar2, description, actionButton, c3713b));
            it2 = it;
            title = str;
        }
        return new b.f(title, arrayList);
    }

    @Override // com.avito.android.competitor_analytics.domain.a
    @l
    public final b.j d(@k C39401b c39401b) {
        cr.h suggest;
        cr.e layout = c39401b.getLayout();
        if (layout == null || (suggest = layout.getSuggest()) == null) {
            return null;
        }
        String title = suggest.getTitle();
        List<cr.i> listA = suggest.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        for (cr.i iVar : listA) {
            String title2 = iVar.getTitle();
            String description = iVar.getDescription();
            cr.c background = iVar.getBackground();
            arrayList.add(new b.j.a(title2, description, background != null ? new UniversalImage(background.getValue(), background.getValueDark()) : null, h(iVar.getAction())));
        }
        return new b.j(title, arrayList);
    }

    @Override // com.avito.android.competitor_analytics.domain.a
    @l
    public final b.a e(@k C39401b c39401b) {
        cr.f banner;
        cr.e layout = c39401b.getLayout();
        if (layout == null || (banner = layout.getBanner()) == null || this.f124277a.b().contains(String.valueOf(banner.getBannerId()))) {
            return null;
        }
        return new b.a(banner.getBannerId(), banner.getClosable(), banner.getTitle(), banner.getDescription(), h(banner.getAction()));
    }

    @Override // com.avito.android.competitor_analytics.domain.a
    @l
    public final b.e f(@k C39401b c39401b) {
        cr.g footer;
        cr.e layout = c39401b.getLayout();
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
            arrayList.add(h((ApiButton) it.next()));
        }
        return new b.e(price, image, arrayList, title);
    }

    @Override // com.avito.android.competitor_analytics.domain.a
    @k
    public final b.c g(@k C39401b c39401b) {
        return new b.c(c39401b.getDetailsInfo().getTitle(), c39401b.getDetailsInfo().getText());
    }
}
