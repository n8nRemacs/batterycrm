package js0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.widget_analytics.Analytics;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VerticalWidgetsActionTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljs0/d;", "", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: VerticalWidgetsActionTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(d dVar, Integer num, String str, String str2, String str3, Integer num2, Long l12, Map map, Analytics analytics, int i12) {
            if ((i12 & 1) != 0) {
                num = null;
            }
            if ((i12 & 2) != 0) {
                str = null;
            }
            if ((i12 & 4) != 0) {
                str2 = null;
            }
            if ((i12 & 8) != 0) {
                str3 = null;
            }
            if ((i12 & 16) != 0) {
                num2 = null;
            }
            if ((i12 & 32) != 0) {
                l12 = null;
            }
            if ((i12 & 64) != 0) {
                map = null;
            }
            if ((i12 & 128) != 0) {
                analytics = null;
            }
            dVar.e(num, str, str2, str3, num2, l12, map, analytics);
        }
    }

    void e(@l Integer num, @l String str, @l String str2, @l String str3, @l Integer num2, @l Long l12, @l Map<String, String> map, @l Analytics analytics);

    void h(int i12, @l String str, @l String str2, @l String str3, @l Long l12, @l Map<String, String> map, @l Analytics analytics);

    void j(@k String str, @l String str2);
}
