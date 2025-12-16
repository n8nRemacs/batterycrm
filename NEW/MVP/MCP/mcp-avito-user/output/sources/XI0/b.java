package XI0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvailableActionsResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LXI0/b;", "", "a", "b", "LXI0/b$a;", "LXI0/b$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: AvailableActionsResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXI0/b$a;", "LXI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AvailableActionsDomain f18823a;

        public a(@k AvailableActionsDomain availableActionsDomain) {
            this.f18823a = availableActionsDomain;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f18823a, ((a) obj).f18823a);
        }

        public final int hashCode() {
            return this.f18823a.f314259b.hashCode();
        }

        @k
        public final String toString() {
            return "Data(content=" + this.f18823a + ')';
        }
    }

    /* compiled from: AvailableActionsResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXI0/b$b;", "LXI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: XI0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1327b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f18824a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f18825b;

        public C1327b(@k ApiError apiError, @l Throwable th2) {
            this.f18824a = apiError;
            this.f18825b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1327b)) {
                return false;
            }
            C1327b c1327b = (C1327b) obj;
            return L.f(this.f18824a, c1327b.f18824a) && L.f(this.f18825b, c1327b.f18825b);
        }

        public final int hashCode() {
            int iHashCode = this.f18824a.hashCode() * 31;
            Throwable th2 = this.f18825b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(apiError=");
            sb2.append(this.f18824a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f18825b, ')');
        }
    }
}
