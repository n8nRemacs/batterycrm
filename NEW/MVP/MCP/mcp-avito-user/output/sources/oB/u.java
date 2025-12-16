package oB;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileWidgetAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LoB/u;", "LoB/k;", "a", "b", "LoB/u$a;", "LoB/u$b;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface u extends k {

    /* compiled from: ExtendedProfileWidgetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/u$a;", "LoB/u;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements u {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f419531b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f419532c;

        public a(@Y61.k DeepLink deepLink, @Y61.l String str) {
            this.f419531b = deepLink;
            this.f419532c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f419531b, aVar.f419531b) && L.f(this.f419532c, aVar.f419532c);
        }

        public final int hashCode() {
            int iHashCode = this.f419531b.hashCode() * 31;
            String str = this.f419532c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnContactActionClickAction(deepLink=");
            sb2.append(this.f419531b);
            sb2.append(", categoryId=");
            return C22026a.c(sb2, this.f419532c, ')');
        }
    }

    /* compiled from: ExtendedProfileWidgetAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LoB/u$b;", "LoB/u;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements u {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f419533b;

        public b(@Y61.k DeepLink deepLink) {
            this.f419533b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f419533b, ((b) obj).f419533b);
        }

        public final int hashCode() {
            return this.f419533b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeeplinkClickAction(deepLink="), this.f419533b, ')');
        }
    }
}
