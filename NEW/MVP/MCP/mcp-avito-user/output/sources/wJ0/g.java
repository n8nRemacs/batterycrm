package wJ0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertTooltips.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LwJ0/g;", "", "T", "a", "c", "d", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface g<T> {

    /* compiled from: UserAdvertTooltips.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"LwJ0/g$a;", "", "T", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final T f441373a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f441374b;

        public a(@k T t12, @l DeepLink deepLink) {
            this.f441373a = t12;
            this.f441374b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f441373a, aVar.f441373a) && L.f(this.f441374b, aVar.f441374b);
        }

        public final int hashCode() {
            int iHashCode = this.f441373a.hashCode() * 31;
            DeepLink deepLink = this.f441374b;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.f441373a);
            sb2.append(", btnLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f441374b, ')');
        }
    }

    /* compiled from: UserAdvertTooltips.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: UserAdvertTooltips.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LwJ0/g$c;", "LwJ0/g;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends g<Integer> {

        /* compiled from: UserAdvertTooltips.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }
    }

    /* compiled from: UserAdvertTooltips.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LwJ0/g$d;", "LwJ0/g;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends g<String> {

        /* compiled from: UserAdvertTooltips.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }
    }

    /* renamed from: a */
    boolean getF314777d();
}
