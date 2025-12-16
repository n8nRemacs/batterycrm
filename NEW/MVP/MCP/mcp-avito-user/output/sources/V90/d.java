package v90;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.pro.impl.generated.api.api_2_sellers_dashboard_data_post.CptOrdersWidget;
import com.avito.android.profile.pro.impl.generated.api.api_2_sellers_dashboard_data_post.OtherWidget3;
import com.avito.android.profile.pro.impl.generated.api.api_2_sellers_dashboard_data_post.StatisticsGeneralWidgetV2;
import com.avito.android.profile.pro.impl.network.response.ProDashboardResponse;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import x90.m;
import x90.n;

/* compiled from: ProfileProDashboardConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-pro_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d {

    /* compiled from: ProfileProDashboardConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f440485a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f440486b;

        static {
            int[] iArr = new int[StatisticsGeneralWidgetV2.Status.values().length];
            try {
                iArr[StatisticsGeneralWidgetV2.Status.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatisticsGeneralWidgetV2.Status.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatisticsGeneralWidgetV2.Status.Zero.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f440485a = iArr;
            int[] iArr2 = new int[CptOrdersWidget.Status.values().length];
            try {
                iArr2[CptOrdersWidget.Status.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CptOrdersWidget.Status.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CptOrdersWidget.Status.Zero.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f440486b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @k
    public static final ProDashboardResponse a(@l x90.f fVar) {
        ProDashboardResponse.Widgets widgets;
        x90.h widgets2;
        ProDashboardResponse.Data data;
        ArrayList arrayList;
        ProDashboardResponse.Data data2;
        ProDashboardResponse.StatusData statusData;
        ?? arrayList2;
        ProDashboardResponse.MoreButton moreButton;
        m moreButton2;
        List<x90.j> listA;
        List<n> listC;
        ProDashboardResponse.ItemWidgetAttrText itemWidgetAttrText;
        ProDashboardResponse.StatusData statusData2;
        x90.b accepted;
        x90.b performed;
        x90.d period;
        x90.g period2;
        ProDashboardResponse.Period period3 = (fVar == null || (period2 = fVar.getPeriod()) == null) ? null : new ProDashboardResponse.Period(b(period2.getFrom()), b(period2.getTo()));
        if (fVar == null || (widgets2 = fVar.getWidgets()) == null) {
            widgets = new ProDashboardResponse.Widgets(null, null, null);
        } else {
            CptOrdersWidget cptOrders = widgets2.getCptOrders();
            if (cptOrders != null) {
                int i12 = a.f440486b[cptOrders.getStatus().ordinal()];
                if (i12 == 1) {
                    statusData2 = ProDashboardResponse.StatusData.f222844b;
                } else if (i12 == 2) {
                    statusData2 = ProDashboardResponse.StatusData.f222845c;
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    statusData2 = ProDashboardResponse.StatusData.f222846d;
                }
                x90.c data3 = cptOrders.getData();
                ProDashboardResponse.Period period4 = (data3 == null || (period = data3.getPeriod()) == null) ? null : new ProDashboardResponse.Period(b(period.getFrom()), b(period.getTo()));
                x90.c data4 = cptOrders.getData();
                ProDashboardResponse.Performed performed2 = (data4 == null || (performed = data4.getPerformed()) == null) ? null : new ProDashboardResponse.Performed(performed.getCount(), performed.getOrdersValue(), performed.getOrdersValuesRelative());
                x90.c data5 = cptOrders.getData();
                data = new ProDashboardResponse.Data(statusData2, new ProDashboardResponse.CptOrders(period4, performed2, (data5 == null || (accepted = data5.getAccepted()) == null) ? null : new ProDashboardResponse.Performed(accepted.getCount(), accepted.getOrdersValue(), accepted.getOrdersValuesRelative())));
            } else {
                data = null;
            }
            List<OtherWidget3> listB = widgets2.b();
            if (listB != null) {
                arrayList = new ArrayList();
                for (OtherWidget3 otherWidget3 : listB) {
                    if (otherWidget3 != null) {
                        String action = otherWidget3.getAction();
                        DeepLink deeplinkAction = otherWidget3.getDeeplinkAction();
                        AttributedText description = otherWidget3.getDescription();
                        x90.e icon = otherWidget3.getIcon();
                        itemWidgetAttrText = new ProDashboardResponse.ItemWidgetAttrText(action, deeplinkAction, description, icon != null ? new UniversalImage(icon.getValue(), icon.getValueDark()) : null, otherWidget3.getSeverity().f222661b, otherWidget3.getSlug(), otherWidget3.getSubValue(), otherWidget3.getTitle(), otherWidget3.getValue());
                    } else {
                        itemWidgetAttrText = null;
                    }
                    if (itemWidgetAttrText != null) {
                        arrayList.add(itemWidgetAttrText);
                    }
                }
            } else {
                arrayList = null;
            }
            StatisticsGeneralWidgetV2 statisticsGeneral = widgets2.getStatisticsGeneral();
            if (statisticsGeneral != null) {
                ArrayList arrayList3 = new ArrayList();
                x90.i data6 = statisticsGeneral.getData();
                if (data6 != null && (listC = data6.c()) != null) {
                    for (n nVar : listC) {
                        arrayList3.add(new ProDashboardResponse.Total(nVar.getSlug(), nVar.getValue()));
                    }
                }
                int i13 = a.f440485a[statisticsGeneral.getStatus().ordinal()];
                if (i13 == 1) {
                    statusData = ProDashboardResponse.StatusData.f222844b;
                } else if (i13 == 2) {
                    statusData = ProDashboardResponse.StatusData.f222845c;
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    statusData = ProDashboardResponse.StatusData.f222846d;
                }
                x90.i data7 = statisticsGeneral.getData();
                if (data7 == null || (listA = data7.a()) == null) {
                    arrayList2 = C42784z0.f406748b;
                } else {
                    List<x90.j> list = listA;
                    int i14 = 10;
                    arrayList2 = new ArrayList(C42745f0.q(list, 10));
                    for (x90.j jVar : list) {
                        List<x90.k> listA2 = jVar.a();
                        ArrayList arrayList4 = new ArrayList(C42745f0.q(listA2, i14));
                        for (x90.k kVar : listA2) {
                            arrayList4.add(new UniversalColor(kVar.getValue(), new Color(android.graphics.Color.parseColor(kVar.getValueDark())), new Color(android.graphics.Color.parseColor(kVar.getValue()))));
                        }
                        DeepLink deeplink = jVar.getDeeplink();
                        x90.e icon2 = jVar.getIcon();
                        UniversalImage universalImage = icon2 != null ? new UniversalImage(icon2.getValue(), icon2.getValueDark()) : null;
                        List<x90.l> listD = jVar.d();
                        ArrayList arrayList5 = new ArrayList(C42745f0.q(listD, i14));
                        for (Iterator it = listD.iterator(); it.hasNext(); it = it) {
                            x90.l lVar = (x90.l) it.next();
                            arrayList5.add(new ProDashboardResponse.ItemPeriod(lVar.getTitle(), lVar.b()));
                        }
                        arrayList2.add(new ProDashboardResponse.MetricItem(arrayList4, deeplink, universalImage, arrayList5, jVar.getRelativeValue(), jVar.getSlug(), jVar.getTitle(), jVar.getValue()));
                        i14 = 10;
                    }
                }
                x90.i data8 = statisticsGeneral.getData();
                if (data8 == null || (moreButton2 = data8.getMoreButton()) == null) {
                    moreButton = null;
                } else {
                    DeepLink deeplink2 = moreButton2.getDeeplink();
                    x90.e icon3 = moreButton2.getIcon();
                    moreButton = new ProDashboardResponse.MoreButton(deeplink2, icon3 != null ? new UniversalImage(icon3.getValue(), icon3.getValueDark()) : null, moreButton2.getText());
                }
                data2 = new ProDashboardResponse.Data(statusData, new ProDashboardResponse.StatisticsGeneral(arrayList2, moreButton, arrayList3));
            } else {
                data2 = null;
            }
            widgets = new ProDashboardResponse.Widgets(data, arrayList, data2);
        }
        return new ProDashboardResponse(period3, widgets);
    }

    public static final Date b(String str) {
        Date date = str != null ? new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, Locale.getDefault()).parse(str) : null;
        return date == null ? new Date() : date;
    }
}
