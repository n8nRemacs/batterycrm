package D30;

import Y61.k;
import Y61.l;
import com.avito.android.CalledFrom;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationCenterMviOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LD30/b;", "", "a", "b", "LD30/b$a;", "LD30/b$b;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: NotificationCenterMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD30/b$a;", "LD30/b;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f2872a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CalledFrom.NotificationCenter f2873b;

        public a(@k DeepLink deepLink, @k CalledFrom.NotificationCenter notificationCenter) {
            this.f2872a = deepLink;
            this.f2873b = notificationCenter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f2872a, aVar.f2872a) && L.f(this.f2873b, aVar.f2873b);
        }

        public final int hashCode() {
            return this.f2873b.f67243b.hashCode() + (this.f2872a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenDeeplink(deeplink=" + this.f2872a + ", calledFrom=" + this.f2873b + ')';
        }
    }

    /* compiled from: NotificationCenterMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD30/b$b;", "LD30/b;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: D30.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0147b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WebViewLink f2874a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CalledFrom.NotificationCenter f2875b;

        public C0147b(@k WebViewLink webViewLink, @k CalledFrom.NotificationCenter notificationCenter) {
            this.f2874a = webViewLink;
            this.f2875b = notificationCenter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0147b)) {
                return false;
            }
            C0147b c0147b = (C0147b) obj;
            return L.f(this.f2874a, c0147b.f2874a) && L.f(this.f2875b, c0147b.f2875b);
        }

        public final int hashCode() {
            return this.f2875b.f67243b.hashCode() + (this.f2874a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenPromoLink(deeplink=" + this.f2874a + ", calledFrom=" + this.f2875b + ')';
        }
    }
}
