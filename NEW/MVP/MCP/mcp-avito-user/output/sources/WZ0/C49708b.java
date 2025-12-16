package wz0;

import Y61.k;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.util.C35755b0;
import hz0.p;
import hz0.q;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: StrSellerOrdersListResponseConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwz0/b;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49708b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C49708b f441898a = new C49708b();

    public static SuggestAnalyticsEvent a(p pVar) {
        Map mapC = null;
        if (pVar.getId() == null) {
            return null;
        }
        int iLongValue = (int) pVar.getId().longValue();
        q parameters = pVar.getParameters();
        if (parameters != null) {
            Q q12 = new Q("action_type", parameters.getActionType());
            Q q13 = new Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, parameters.getFrom());
            Q q14 = new Q("from_page", parameters.getFromPage());
            Long iid = parameters.getIid();
            Q q15 = new Q("iid", iid != null ? iid.toString() : null);
            Q q16 = new Q("orderid_string", parameters.getOrderidString());
            Q q17 = new Q("type", parameters.getType());
            Long uid = parameters.getUid();
            mapC = C35755b0.c(P0.g(q12, q13, q14, q15, q16, q17, new Q("uid", uid != null ? uid.toString() : null)));
        }
        if (mapC == null) {
            mapC = P0.c();
        }
        return new SuggestAnalyticsEvent(iLongValue, (int) pVar.getVersion(), mapC);
    }
}
