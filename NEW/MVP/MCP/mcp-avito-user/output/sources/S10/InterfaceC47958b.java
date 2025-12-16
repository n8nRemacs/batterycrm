package s10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationFlowOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ls10/b;", "", "a", "b", "Ls10/b$a;", "Ls10/b$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC47958b {

    /* compiled from: VerificationFlowOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls10/b$a;", "Ls10/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s10.b$a */
    public static final /* data */ class a implements InterfaceC47958b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f437289a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -136452877;
        }

        @k
        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: VerificationFlowOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls10/b$b;", "Ls10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: s10.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12606b implements InterfaceC47958b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f437290a;

        public C12606b(@l DeepLink deepLink) {
            this.f437290a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12606b) && L.f(this.f437290a, ((C12606b) obj).f437290a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f437290a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeepLink(deepLink="), this.f437290a, ')');
        }
    }
}
