package Lx0;

import Sx0.C15252a;
import Sx0.C15253b;
import Sx0.C15254c;
import Sx0.C15255d;
import Sx0.C15256e;
import Sx0.C15257f;
import Sx0.r;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.ButtonAction;
import com.avito.android.str_booking.network.models.common.Prompt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ActionButtonV4ActionConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLx0/a;", "", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lx0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14450a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C14450a f10290a = new C14450a();

    @Y61.k
    public static ButtonAction a(@Y61.k C15252a c15252a) {
        SuggestAnalyticsEvent suggestAnalyticsEventA;
        r clickstream;
        r clickstream2;
        C15253b content = c15252a.getContent();
        Prompt prompt = null;
        suggestAnalyticsEventA = null;
        SuggestAnalyticsEvent suggestAnalyticsEventA2 = null;
        Map mapG = null;
        Map mapG2 = content != null ? P0.g(new Q("action", content.getAction()), new Q("orderID", content.getOrderID())) : null;
        C15254c prompt2 = c15252a.getPrompt();
        if (prompt2 != null) {
            String approve = prompt2.getApprove();
            String cancel = prompt2.getCancel();
            AttributedText description = prompt2.getDescription();
            String header = prompt2.getHeader();
            C15255d analytics = prompt2.getAnalytics();
            if (analytics != null) {
                C15256e approve2 = analytics.getApprove();
                if (approve2 == null || (clickstream2 = approve2.getClickstream()) == null) {
                    suggestAnalyticsEventA = null;
                } else {
                    C14453d.f10293a.getClass();
                    suggestAnalyticsEventA = C14453d.a(clickstream2);
                }
                Q q12 = new Q("approve", suggestAnalyticsEventA);
                C15257f cancel2 = analytics.getCancel();
                if (cancel2 != null && (clickstream = cancel2.getClickstream()) != null) {
                    C14453d.f10293a.getClass();
                    suggestAnalyticsEventA2 = C14453d.a(clickstream);
                }
                mapG = P0.g(q12, new Q("cancel", suggestAnalyticsEventA2));
            }
            prompt = new Prompt(approve, cancel, header, description, mapG);
        }
        return new ButtonAction(mapG2, c15252a.getUrl(), prompt, null, null);
    }
}
