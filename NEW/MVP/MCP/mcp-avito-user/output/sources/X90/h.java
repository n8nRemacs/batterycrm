package x90;

import com.avito.android.profile.pro.impl.generated.api.api_2_sellers_dashboard_data_post.CptOrdersWidget;
import com.avito.android.profile.pro.impl.generated.api.api_2_sellers_dashboard_data_post.OtherWidget3;
import com.avito.android.profile.pro.impl.generated.api.api_2_sellers_dashboard_data_post.StatisticsGeneralWidgetV2;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2SellersDashboardDataPostResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lx90/h;", "", "Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/CptOrdersWidget;", "cptOrders", "", "Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/OtherWidget3;", "other3", "Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/StatisticsGeneralWidgetV2;", "statisticsGeneral", "<init>", "(Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/CptOrdersWidget;Ljava/util/List;Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/StatisticsGeneralWidgetV2;)V", "Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/CptOrdersWidget;", "a", "()Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/CptOrdersWidget;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/StatisticsGeneralWidgetV2;", "c", "()Lcom/avito/android/profile/pro/impl/generated/api/api_2_sellers_dashboard_data_post/StatisticsGeneralWidgetV2;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h {

    @com.google.gson.annotations.c("cptOrders")
    @Y61.l
    private final CptOrdersWidget cptOrders;

    @com.google.gson.annotations.c("other3")
    @Y61.l
    private final List<OtherWidget3> other3;

    @com.google.gson.annotations.c("statisticsGeneral")
    @Y61.l
    private final StatisticsGeneralWidgetV2 statisticsGeneral;

    public h(@Y61.l CptOrdersWidget cptOrdersWidget, @Y61.l List<OtherWidget3> list, @Y61.l StatisticsGeneralWidgetV2 statisticsGeneralWidgetV2) {
        this.cptOrders = cptOrdersWidget;
        this.other3 = list;
        this.statisticsGeneral = statisticsGeneralWidgetV2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final CptOrdersWidget getCptOrders() {
        return this.cptOrders;
    }

    @Y61.l
    public final List<OtherWidget3> b() {
        return this.other3;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final StatisticsGeneralWidgetV2 getStatisticsGeneral() {
        return this.statisticsGeneral;
    }
}
