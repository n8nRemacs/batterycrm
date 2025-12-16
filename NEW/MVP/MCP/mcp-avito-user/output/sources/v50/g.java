package v50;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.paid_services_impl.n;
import com.avito.android.paid_services_impl.r;
import kotlin.Metadata;

/* compiled from: PaymentFlowInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lv50/g;", "", "b", "_avito_paid-services_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface g {

    /* compiled from: PaymentFlowInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: PaymentFlowInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv50/g$b;", "", "_avito_paid-services_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @k
        n a(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k String str);
    }

    @k
    r a();

    void b(@l DeepLink deepLink, @l DeepLink deepLink2);
}
