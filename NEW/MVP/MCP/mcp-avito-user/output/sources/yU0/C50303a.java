package yu0;

import Au0.InterfaceC13083a;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.service_order_widget.DefaultServiceOrderWidget;
import com.avito.android.remote.model.service_order_widget.FormServiceOrderWidget;
import com.avito.android.remote.model.service_order_widget.ServiceOrderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.l1;
import com.avito.android.service_order_widget.item.form.c;
import com.avito.android.ux.feedback.link.UxFeedbackStartCampaignLink;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrderWidgetConverterImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyu0/a;", "LAu0/a;", "<init>", "()V", "a", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yu0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50303a implements InterfaceC13083a {

    /* compiled from: ServiceOrderWidgetConverterImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyu0/a$a;", "", "<init>", "()V", "", "SERVICE_ORDER_WIDGET_SPAN_COUNT", "I", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yu0.a$a, reason: collision with other inner class name */
    public static final class C12931a {
        public /* synthetic */ C12931a(C42822w c42822w) {
            this();
        }

        public C12931a() {
        }
    }

    static {
        new C12931a(null);
    }

    @Inject
    public C50303a() {
    }

    @Override // Au0.InterfaceC13083a
    @k
    public final l1 a(@k ServiceOrderWidget serviceOrderWidget) {
        ArrayList arrayList = null;
        if (serviceOrderWidget instanceof DefaultServiceOrderWidget) {
            DefaultServiceOrderWidget defaultServiceOrderWidget = (DefaultServiceOrderWidget) serviceOrderWidget;
            String str = "service_order_widget" + defaultServiceOrderWidget.hashCode();
            String title = defaultServiceOrderWidget.getTitle();
            ServiceOrderWidget.ServiceOrderWidgetAction primaryAction = defaultServiceOrderWidget.getPrimaryAction();
            ServiceOrderWidget.ServiceOrderWidgetAction secondaryAction = defaultServiceOrderWidget.getSecondaryAction();
            AttributedText description = defaultServiceOrderWidget.getDescription();
            DeepLink redirectDeeplink = defaultServiceOrderWidget.getRedirectDeeplink();
            return new com.avito.android.service_order_widget.item.a(str, title, primaryAction, secondaryAction, description, defaultServiceOrderWidget.getImage(), redirectDeeplink instanceof UxFeedbackStartCampaignLink ? (UxFeedbackStartCampaignLink) redirectDeeplink : null, defaultServiceOrderWidget.getDescriptionPromoLink(), defaultServiceOrderWidget.getAnalyticParams(), defaultServiceOrderWidget.getAnalytics(), defaultServiceOrderWidget.getSettings());
        }
        if (!(serviceOrderWidget instanceof FormServiceOrderWidget)) {
            throw new NoWhenBranchMatchedException();
        }
        FormServiceOrderWidget formServiceOrderWidget = (FormServiceOrderWidget) serviceOrderWidget;
        String str2 = "service_order_widget" + formServiceOrderWidget.hashCode();
        String title2 = formServiceOrderWidget.getTitle();
        ServiceOrderWidget.ServiceOrderWidgetAction primaryAction2 = formServiceOrderWidget.getPrimaryAction();
        AttributedText description2 = formServiceOrderWidget.getDescription();
        DeepLink redirectDeeplink2 = formServiceOrderWidget.getRedirectDeeplink();
        UxFeedbackStartCampaignLink uxFeedbackStartCampaignLink = redirectDeeplink2 instanceof UxFeedbackStartCampaignLink ? (UxFeedbackStartCampaignLink) redirectDeeplink2 : null;
        DeepLink descriptionPromoLink = formServiceOrderWidget.getDescriptionPromoLink();
        ServiceOrderWidget.AnalyticsParams analyticParams = formServiceOrderWidget.getAnalyticParams();
        List<FormServiceOrderWidget.FormOption> formOptions = formServiceOrderWidget.getFormOptions();
        if (formOptions != null) {
            List<FormServiceOrderWidget.FormOption> list = formOptions;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (FormServiceOrderWidget.FormOption formOption : list) {
                arrayList.add(new c.a(formOption.getTitle(), formOption.getUri()));
            }
        }
        return new com.avito.android.service_order_widget.item.form.c(str2, title2, description2, arrayList, formServiceOrderWidget.getProgress(), primaryAction2, uxFeedbackStartCampaignLink, descriptionPromoLink, analyticParams, formServiceOrderWidget.getAnalytics(), formServiceOrderWidget.getSettings());
    }
}
