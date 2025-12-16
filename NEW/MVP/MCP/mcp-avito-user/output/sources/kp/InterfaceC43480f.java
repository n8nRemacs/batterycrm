package kp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkp/f;", "", "a", "b", "Lkp/f$a;", "Lkp/f$b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kp.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC43480f {

    /* compiled from: ClientsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/f$a;", "Lkp/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.f$a */
    public static final /* data */ class a implements InterfaceC43480f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f413205a;

        public a(@k DeepLink deepLink) {
            this.f413205a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f413205a, ((a) obj).f413205a);
        }

        public final int hashCode() {
            return this.f413205a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f413205a, ')');
        }
    }

    /* compiled from: ClientsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkp/f$b;", "Lkp/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kp.f$b */
    public static final /* data */ class b implements InterfaceC43480f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f413206a;

        public b(@k String str) {
            this.f413206a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f413206a, ((b) obj).f413206a);
        }

        public final int hashCode() {
            return this.f413206a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenDeal(dealId="), this.f413206a, ')');
        }
    }
}
