package cf;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectBookingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcf/c;", "", "a", "b", "c", "Lcf/c$a;", "Lcf/c$b;", "Lcf/c$c;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    /* compiled from: AutoSelectBookingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf/c$a;", "Lcf/c;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f58076a;

        public a() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f58076a == ((a) obj).f58076a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f58076a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseDialog(isReloadOnClose="), this.f58076a, ')');
        }

        public a(boolean z12) {
            this.f58076a = z12;
        }

        public /* synthetic */ a(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: AutoSelectBookingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf/c$b;", "Lcf/c;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f58077a;

        public b(@k DeepLink deepLink) {
            this.f58077a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f58077a, ((b) obj).f58077a);
        }

        public final int hashCode() {
            return this.f58077a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeeplink(deepLink="), this.f58077a, ')');
        }
    }

    /* compiled from: AutoSelectBookingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf/c$c;", "Lcf/c;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cf.c$c, reason: collision with other inner class name */
    public static final /* data */ class C2054c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f58078a;

        public C2054c(@k String str) {
            this.f58078a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2054c) && L.f(this.f58078a, ((C2054c) obj).f58078a);
        }

        public final int hashCode() {
            return this.f58078a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(errorMessage="), this.f58078a, ')');
        }
    }
}
