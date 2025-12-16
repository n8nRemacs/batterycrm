package PI0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SafetyInfoState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LPI0/b;", "", "a", "b", "LPI0/b$a;", "LPI0/b$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: SafetyInfoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPI0/b$a;", "LPI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f12955a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -731161664;
        }

        @k
        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: SafetyInfoState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPI0/b$b;", "LPI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: PI0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0840b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DetailsSheetLink f12956a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f12957b;

        public C0840b(@k DetailsSheetLink detailsSheetLink, @k String str) {
            this.f12956a = detailsSheetLink;
            this.f12957b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0840b)) {
                return false;
            }
            C0840b c0840b = (C0840b) obj;
            return this.f12956a.equals(c0840b.f12956a) && L.f(this.f12957b, c0840b.f12957b);
        }

        public final int hashCode() {
            return this.f12957b.hashCode() + (this.f12956a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Show(deepLink=");
            sb2.append(this.f12956a);
            sb2.append(", categoryId=");
            return C22026a.c(sb2, this.f12957b, ')');
        }
    }
}
