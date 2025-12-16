package Bv0;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.B2;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem;
import com.avito.android.services_transportation_widget.item.fields.disclaimer.ServicesTransportationWidgetDisclaimerItem;
import com.avito.android.services_transportation_widget.item.fields.empty_price.ServicesTransportationWidgetEmptyPriceItem;
import com.avito.android.services_transportation_widget.item.fields.price.ServicesTransportationWidgetPriceItem;
import com.avito.android.services_transportation_widget.item.fields.select.ServicesTransportationWidgetSelectItem;
import com.avito.android.services_transportation_widget.item.fields.switches.ServiceTransportationWidgetSwitchesItem;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: ServiceTransportationWidgetConverter.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LBv0/b;", "LBv0/a;", "a", "_avito_service-transportation-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13190b implements InterfaceC13189a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final B2 f1794a;

    /* compiled from: ServiceTransportationWidgetConverter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LBv0/b$a;", "", "<init>", "()V", "", "SERVICE_TRANSPORTATION_WIDGET_SPAN_COUNT", "I", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito_service-transportation-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bv0.b$a */
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
    public C13190b(@k B2 b22) {
        this.f1794a = b22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // Bv0.InterfaceC13189a
    @k
    public final ServiceTransportationWidgetItem a(@k ServiceTransportationWidget serviceTransportationWidget, @l Integer num, boolean z12) {
        ?? arrayList;
        Parcelable serviceTransportationWidgetSwitchesItem;
        StringBuilder sb2 = new StringBuilder("service_transportation_widget");
        String title = serviceTransportationWidget.getTitle();
        sb2.append(title != null ? title.hashCode() : 0);
        String string = sb2.toString();
        int iIntValue = num != null ? num.intValue() : 2;
        String title2 = serviceTransportationWidget.getTitle();
        AttributedText description = serviceTransportationWidget.getDescription();
        String bannerStyle = serviceTransportationWidget.getBannerStyle();
        List<ServiceTransportationWidget.Field<?>> fields = serviceTransportationWidget.getFields();
        if (fields != null) {
            List<ServiceTransportationWidget.Field<?>> list = fields;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ServiceTransportationWidget.Field field = (ServiceTransportationWidget.Field) it.next();
                if (field instanceof ServiceTransportationWidget.DisclaimerField) {
                    serviceTransportationWidgetSwitchesItem = new ServicesTransportationWidgetDisclaimerItem((ServiceTransportationWidget.DisclaimerField) field, false, false, 6, null);
                } else if (field instanceof ServiceTransportationWidget.LocationField) {
                    serviceTransportationWidgetSwitchesItem = new ServicesTransportationWidgetSelectItem((ServiceTransportationWidget.InputField) field, false, false, 6, null);
                } else if (field instanceof ServiceTransportationWidget.SelectField) {
                    serviceTransportationWidgetSwitchesItem = new ServicesTransportationWidgetSelectItem((ServiceTransportationWidget.InputField) field, false, false, 6, null);
                } else if (field instanceof ServiceTransportationWidget.CardSelectField) {
                    serviceTransportationWidgetSwitchesItem = new ServicesTransportationWidgetSelectItem((ServiceTransportationWidget.InputField) field, false, false, 6, null);
                } else if (field instanceof ServiceTransportationWidget.PriceField) {
                    serviceTransportationWidgetSwitchesItem = new ServicesTransportationWidgetPriceItem((ServiceTransportationWidget.PriceField) field, false, false, 6, null);
                } else if (field instanceof ServiceTransportationWidget.EmptyPriceField) {
                    serviceTransportationWidgetSwitchesItem = new ServicesTransportationWidgetEmptyPriceItem((ServiceTransportationWidget.EmptyPriceField) field, false, false, 6, null);
                } else {
                    if (!(field instanceof ServiceTransportationWidget.SwitchGroupField)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    serviceTransportationWidgetSwitchesItem = new ServiceTransportationWidgetSwitchesItem((ServiceTransportationWidget.SwitchGroupField) field, false, false, 6, null);
                }
                arrayList.add(serviceTransportationWidgetSwitchesItem);
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        ServiceTransportationWidget.Action action = serviceTransportationWidget.getAction();
        Map<String, String> queryExtParams = serviceTransportationWidget.getQueryExtParams();
        ServiceTransportationWidget.AnalyticParams analyticParams = serviceTransportationWidget.getAnalyticParams();
        B2 b22 = this.f1794a;
        n<Object> nVar = B2.f67184X[50];
        return new ServiceTransportationWidgetItem(string, iIntValue, title2, description, bannerStyle, arrayList, action, queryExtParams, analyticParams, ((Boolean) b22.f67207W.a().invoke()).booleanValue() ? serviceTransportationWidget.getSearchHeaderConfig() : null, z12, null, serviceTransportationWidget.getAnalytics(), serviceTransportationWidget.getSettings(), 2048, null);
    }
}
