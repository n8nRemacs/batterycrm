package wu0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServicesOrderWidgetAnalyticsImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwu0/e;", "Lwu0/d;", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f441849a;

    @Inject
    public e(@k InterfaceC28373a interfaceC28373a) {
        this.f441849a = interfaceC28373a;
    }

    @Override // wu0.d
    public final void a(@l ServiceOrderWidget.AnalyticsParams analyticsParams, @l String str, @l Integer num, @l String str2) {
        this.f441849a.c(new b(analyticsParams != null ? analyticsParams.getCategoryId() : null, analyticsParams != null ? analyticsParams.getMicroCategoryId() : null, analyticsParams != null ? analyticsParams.getFormRawParams() : null, str2, analyticsParams != null ? analyticsParams.getLocationId() : null, analyticsParams != null ? analyticsParams.getFromPage() : null, analyticsParams != null ? analyticsParams.getWidgetID() : null, analyticsParams != null ? analyticsParams.getQuery() : null, str, String.valueOf(num), analyticsParams != null ? analyticsParams.getRequestType() : null, analyticsParams != null ? analyticsParams.getFormVersion() : null));
    }

    @Override // wu0.d
    public final void b(@l ServiceOrderWidget.AnalyticsParams analyticsParams, @l String str, @l Integer num, @l String str2) {
        this.f441849a.c(new c(analyticsParams != null ? analyticsParams.getCategoryId() : null, analyticsParams != null ? analyticsParams.getMicroCategoryId() : null, analyticsParams != null ? analyticsParams.getFormRawParams() : null, str2, analyticsParams != null ? analyticsParams.getLocationId() : null, analyticsParams != null ? analyticsParams.getFromPage() : null, analyticsParams != null ? analyticsParams.getWidgetID() : null, analyticsParams != null ? analyticsParams.getQuery() : null, str, String.valueOf(num), analyticsParams != null ? analyticsParams.getRequestType() : null, analyticsParams != null ? analyticsParams.getFormVersion() : null));
    }
}
