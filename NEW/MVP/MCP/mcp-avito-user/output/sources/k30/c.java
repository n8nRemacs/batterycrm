package K30;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.AnalyticParams;
import com.avito.android.CalledFrom;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationDeepLinkOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LK30/c;", "", "a", "b", "LK30/c$a;", "LK30/c$b;", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: NotificationDeepLinkOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LK30/c$a;", "LK30/c;", "<init>", "()V", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f9239a = new a();
    }

    /* compiled from: NotificationDeepLinkOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK30/c$b;", "LK30/c;", "_avito_notification-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f9240a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CalledFrom.Push f9241b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AnalyticParams f9242c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f9243d;

        public b(@k DeepLink deepLink, @k CalledFrom.Push push, @l AnalyticParams analyticParams, boolean z12) {
            this.f9240a = deepLink;
            this.f9241b = push;
            this.f9242c = analyticParams;
            this.f9243d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f9240a, bVar.f9240a) && L.f(this.f9241b, bVar.f9241b) && L.f(this.f9242c, bVar.f9242c) && this.f9243d == bVar.f9243d;
        }

        public final int hashCode() {
            int iHashCode = (this.f9241b.hashCode() + (this.f9240a.hashCode() * 31)) * 31;
            AnalyticParams analyticParams = this.f9242c;
            return Boolean.hashCode(this.f9243d) + ((iHashCode + (analyticParams == null ? 0 : analyticParams.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProcessDeeplink(deeplink=");
            sb2.append(this.f9240a);
            sb2.append(", calledFrom=");
            sb2.append(this.f9241b);
            sb2.append(", analytics=");
            sb2.append(this.f9242c);
            sb2.append(", isTaskRoot=");
            return r.x(sb2, this.f9243d, ')');
        }
    }
}
