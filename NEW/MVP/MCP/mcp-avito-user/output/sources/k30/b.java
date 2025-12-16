package K30;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.AnalyticParams;
import com.avito.android.CalledFrom;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationDeepLinkInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LK30/b;", "", "a", "b", "LK30/b$a;", "LK30/b$b;", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: NotificationDeepLinkInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LK30/b$a;", "LK30/b;", "<init>", "()V", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f9234a = new a();
    }

    /* compiled from: NotificationDeepLinkInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK30/b$b;", "LK30/b;", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: K30.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0550b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f9235a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CalledFrom.Push f9236b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AnalyticParams f9237c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f9238d;

        public C0550b(@k DeepLink deepLink, @k CalledFrom.Push push, @l AnalyticParams analyticParams, boolean z12) {
            this.f9235a = deepLink;
            this.f9236b = push;
            this.f9237c = analyticParams;
            this.f9238d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0550b)) {
                return false;
            }
            C0550b c0550b = (C0550b) obj;
            return L.f(this.f9235a, c0550b.f9235a) && L.f(this.f9236b, c0550b.f9236b) && L.f(this.f9237c, c0550b.f9237c) && this.f9238d == c0550b.f9238d;
        }

        public final int hashCode() {
            int iHashCode = (this.f9236b.hashCode() + (this.f9235a.hashCode() * 31)) * 31;
            AnalyticParams analyticParams = this.f9237c;
            return Boolean.hashCode(this.f9238d) + ((iHashCode + (analyticParams == null ? 0 : analyticParams.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProcessDeeplink(deeplink=");
            sb2.append(this.f9235a);
            sb2.append(", calledFrom=");
            sb2.append(this.f9236b);
            sb2.append(", analytics=");
            sb2.append(this.f9237c);
            sb2.append(", isTaskRoot=");
            return r.x(sb2, this.f9238d, ')');
        }
    }
}
