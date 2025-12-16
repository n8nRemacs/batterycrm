package v90;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.R;
import com.avito.android.profile.pro.impl.generated.api.api_2_sellers_dashboard_data_post.CptOrdersWidget;
import com.avito.android.profile.pro.impl.generated.api.api_2_sellers_dashboard_data_post.StatisticsGeneralWidgetV2;
import com.avito.android.profile.pro.impl.network.response.ProDashboardResponse;
import com.avito.android.profile.pro.impl.screen.item.dashboard.ProfileProDashboardItem;
import com.avito.android.profile.pro.impl.screen.item.dashboard_list_item.ProfileOtherDashboardItem;
import com.avito.android.profile.pro.impl.screen.item.dashboard_stats.ProfileProStatsItem;
import com.avito.android.profile.pro.impl.screen.item.group.title.ProfileProGroupTitleItem;
import com.avito.android.profile.pro.impl.screen.mvi.entity.CptOrders;
import com.avito.android.profile.pro.impl.screen.mvi.entity.DashboardAction;
import com.avito.android.remote.model.TypedResult;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import x90.C49797a;

/* compiled from: ProfileProDashboardConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lv90/b;", "Lv90/a;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements InterfaceC49182a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f440477a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final t90.d f440478b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h f440479c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f440480d;

    /* compiled from: ProfileProDashboardConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv90/b$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k Context context, @k t90.d dVar, @k h hVar, @k e eVar) {
        this.f440477a = context;
        this.f440478b = dVar;
        this.f440479c = hVar;
        this.f440480d = eVar;
    }

    @Override // v90.InterfaceC49182a
    @k
    public final ArrayList a(@l TypedResult typedResult) {
        ArrayList arrayList = new ArrayList();
        if (typedResult != null) {
            this.f440478b.c(typedResult);
        }
        if (typedResult == null || !(typedResult instanceof TypedResult.Success)) {
            String strE = e(null, null);
            arrayList.add(new ProfileProGroupTitleItem(strE, strE));
            arrayList.add(new ProfileProDashboardItem("dashboard", DashboardAction.LoadDashboard.f223700b));
        } else {
            ProDashboardResponse proDashboardResponseA = d.a(((C49797a) ((TypedResult.Success) typedResult).getResult()).getResult());
            String strE2 = e(typedResult, proDashboardResponseA);
            arrayList.add(new ProfileProGroupTitleItem(strE2, strE2));
            e eVar = this.f440480d;
            ProfileOtherDashboardItem profileOtherDashboardItemA = eVar.a(proDashboardResponseA);
            if (profileOtherDashboardItemA != null) {
                arrayList.add(profileOtherDashboardItemA);
            }
            arrayList.add(new ProfileProDashboardItem("dashboard", c(typedResult, proDashboardResponseA)));
            ProfileProStatsItem profileProStatsItemA = this.f440479c.a(proDashboardResponseA);
            if (profileProStatsItemA != null) {
                arrayList.add(profileProStatsItemA);
            }
            arrayList.addAll(eVar.c(proDashboardResponseA));
        }
        return arrayList;
    }

    @Override // v90.InterfaceC49182a
    public final boolean b(@k TypedResult<C49797a> typedResult) {
        CptOrdersWidget cptOrders;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        x90.f result = ((C49797a) ((TypedResult.Success) typedResult).getResult()).getResult();
        x90.h widgets = result != null ? result.getWidgets() : null;
        if (((widgets == null || (cptOrders = widgets.getCptOrders()) == null) ? null : cptOrders.getStatus()) == CptOrdersWidget.Status.Zero) {
            StatisticsGeneralWidgetV2 statisticsGeneral = widgets.getStatisticsGeneral();
            if ((statisticsGeneral != null ? statisticsGeneral.getStatus() : null) == StatisticsGeneralWidgetV2.Status.Zero) {
                return true;
            }
        }
        return false;
    }

    public final DashboardAction c(TypedResult<C49797a> typedResult, ProDashboardResponse proDashboardResponse) {
        ProDashboardResponse.Performed accepted;
        Double ordersValuesRelative;
        ProDashboardResponse.Performed accepted2;
        CptOrdersWidget cptOrders;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return new DashboardAction.Error(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
        x90.f result = ((C49797a) ((TypedResult.Success) typedResult).getResult()).getResult();
        Long lValueOf = null;
        x90.h widgets = result != null ? result.getWidgets() : null;
        if (((widgets == null || (cptOrders = widgets.getCptOrders()) == null) ? null : cptOrders.getStatus()) == CptOrdersWidget.Status.Zero) {
            StatisticsGeneralWidgetV2 statisticsGeneral = widgets.getStatisticsGeneral();
            if ((statisticsGeneral != null ? statisticsGeneral.getStatus() : null) == StatisticsGeneralWidgetV2.Status.Zero) {
                return new DashboardAction.Error(null);
            }
        }
        ProDashboardResponse.Data<ProDashboardResponse.CptOrders> dataC = proDashboardResponse.getWidgets().c();
        ProDashboardResponse.CptOrders cptOrders2 = dataC != null ? (ProDashboardResponse.CptOrders) dataC.c() : null;
        ProDashboardResponse.Period period = cptOrders2 != null ? cptOrders2.getPeriod() : null;
        Long lValueOf2 = (cptOrders2 == null || (accepted2 = cptOrders2.getAccepted()) == null) ? null : Long.valueOf(accepted2.getOrdersValue());
        if (cptOrders2 != null && (accepted = cptOrders2.getAccepted()) != null && (ordersValuesRelative = accepted.getOrdersValuesRelative()) != null) {
            lValueOf = Long.valueOf(kotlin.math.b.c(ordersValuesRelative.doubleValue()));
        }
        return new DashboardAction.Content(new CptOrders(d(period, 1), lValueOf2, lValueOf), proDashboardResponse.getPeriod());
    }

    public final String d(ProDashboardResponse.Period period, int i12) {
        if (period == null) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(period.getFrom());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(period.getTo());
        String strValueOf = String.valueOf(calendar.get(5));
        String strValueOf2 = String.valueOf(calendar2.get(5));
        String displayName = calendar.getDisplayName(2, i12, Locale.getDefault());
        String strA0 = displayName != null ? C43066x.a0(displayName, ".", "", false) : null;
        String displayName2 = calendar2.getDisplayName(2, i12, Locale.getDefault());
        String strA02 = displayName2 != null ? C43066x.a0(displayName2, ".", "", false) : null;
        StringBuilder sb2 = new StringBuilder("");
        boolean zF2 = L.f(strA0, strA02);
        Context context = this.f440477a;
        sb2.append(zF2 ? context.getResources().getString(R.string.profile_pro_dashboard_period_current_month_text, strValueOf, strValueOf2, strA02) : context.getResources().getString(R.string.profile_pro_dashboard_period_months_text, strValueOf, strA0, strValueOf2, strA02));
        return sb2.toString();
    }

    public final String e(TypedResult<C49797a> typedResult, ProDashboardResponse proDashboardResponse) {
        String strD = "";
        if (typedResult != null && proDashboardResponse != null) {
            DashboardAction dashboardActionC = c(typedResult, proDashboardResponse);
            if (dashboardActionC instanceof DashboardAction.Content) {
                strD = d(((DashboardAction.Content) dashboardActionC).f223698c, 2);
            }
        }
        return this.f440477a.getResources().getString(R.string.profile_pro_dashboard_prefix) + strD;
    }
}
