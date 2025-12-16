package MI0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PanelSoaOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LMI0/c;", "", "a", "b", "LMI0/c$a;", "LMI0/c$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: PanelSoaOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/c$a;", "LMI0/c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final KI0.a f10574a;

        public a(@k KI0.a aVar) {
            this.f10574a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f10574a, ((a) obj).f10574a);
        }

        public final int hashCode() {
            return this.f10574a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenInfoDialog(soaInfoDialog=" + this.f10574a + ')';
        }
    }

    /* compiled from: PanelSoaOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMI0/c$b;", "LMI0/c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f10575a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f10576b;

        public b(@k ApiError apiError, @l Throwable th2) {
            this.f10575a = apiError;
            this.f10576b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f10575a, bVar.f10575a) && L.f(this.f10576b, bVar.f10576b);
        }

        public final int hashCode() {
            int iHashCode = this.f10575a.hashCode() * 31;
            Throwable th2 = this.f10576b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInfoDialogError(error=");
            sb2.append(this.f10575a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f10576b, ')');
        }
    }
}
