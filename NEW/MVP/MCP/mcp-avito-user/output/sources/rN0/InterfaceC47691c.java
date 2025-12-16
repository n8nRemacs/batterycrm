package rn0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: GoToDeeplinkListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrn0/c;", "", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rn0.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC47691c {

    /* compiled from: GoToDeeplinkListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rn0.c$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC47691c interfaceC47691c, DeepLink deepLink, Bundle bundle, int i12) {
            Boolean bool = Boolean.TRUE;
            if ((i12 & 2) != 0) {
                bundle = null;
            }
            if ((i12 & 4) != 0) {
                bool = null;
            }
            interfaceC47691c.d(deepLink, bundle, bool, (i12 & 8) == 0 ? "service_order_widget_req" : null);
        }

        public static /* synthetic */ void b(InterfaceC47691c interfaceC47691c, DeepLink deepLink, int i12) {
            Boolean bool = Boolean.TRUE;
            if ((i12 & 4) != 0) {
                bool = null;
            }
            interfaceC47691c.q(deepLink, bool);
        }
    }

    void B(@k DeepLink deepLink);

    void d(@k DeepLink deepLink, @l Bundle bundle, @l Boolean bool, @l String str);

    void n(@k DeepLink deepLink);

    void q(@k DeepLink deepLink, @l Boolean bool);
}
