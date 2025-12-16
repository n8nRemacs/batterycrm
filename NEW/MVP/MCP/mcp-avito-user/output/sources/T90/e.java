package t90;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.pro.impl.generated.api.api_2_sellers_dashboard_data_post.CptOrdersWidget;
import com.avito.android.profile.pro.impl.generated.api.api_2_sellers_dashboard_data_post.StatisticsGeneralWidgetV2;
import com.avito.android.remote.model.TypedResult;
import com.google.gson.Gson;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import org.json.JSONException;
import org.json.JSONObject;
import x90.C49797a;
import x90.h;
import x90.i;
import x90.n;

/* compiled from: ProfileProDashboardAnalyticsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lt90/e;", "Lt90/d;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f439178a;

    /* compiled from: ProfileProDashboardAnalyticsTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt90/e$a;", "", "<init>", "()V", "", "DEFAULT_TARGET_PAGE", "Ljava/lang/String;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SuppressLint({"HardcodeStringDetector"})
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
    public e(@k InterfaceC28373a interfaceC28373a) {
        this.f439178a = interfaceC28373a;
    }

    @Override // t90.d
    public final void a() {
        this.f439178a.c(new u90.d());
    }

    @Override // t90.d
    public final void b(@k String str, @l String str2) {
        if (str2 == null) {
            str2 = "main results";
        }
        this.f439178a.c(new u90.e(str, str2));
    }

    @Override // t90.d
    public final void c(@k TypedResult<C49797a> typedResult) throws JSONException {
        StatisticsGeneralWidgetV2 statisticsGeneral;
        i data;
        String string;
        CptOrdersWidget cptOrders;
        x90.c data2;
        boolean z12 = typedResult instanceof TypedResult.Success;
        InterfaceC28373a interfaceC28373a = this.f439178a;
        if (!z12) {
            if (typedResult instanceof TypedResult.Error) {
                interfaceC28373a.c(new u90.i("error"));
                return;
            }
            return;
        }
        interfaceC28373a.c(new u90.i("success"));
        x90.f result = ((C49797a) ((TypedResult.Success) typedResult).getResult()).getResult();
        h widgets = result != null ? result.getWidgets() : null;
        if (widgets != null && (cptOrders = widgets.getCptOrders()) != null && (data2 = cptOrders.getData()) != null) {
            interfaceC28373a.c(new u90.f("cptOrders", new Gson().l(data2)));
        }
        if (widgets == null || (statisticsGeneral = widgets.getStatisticsGeneral()) == null || (data = statisticsGeneral.getData()) == null) {
            return;
        }
        List<n> listC = data.c();
        if (listC == null) {
            string = "";
        } else {
            JSONObject jSONObject = new JSONObject();
            for (n nVar : listC) {
                jSONObject.put(nVar.getSlug(), nVar.getValue());
            }
            string = jSONObject.toString();
        }
        interfaceC28373a.c(new u90.f("statisticsGeneral", string));
    }
}
