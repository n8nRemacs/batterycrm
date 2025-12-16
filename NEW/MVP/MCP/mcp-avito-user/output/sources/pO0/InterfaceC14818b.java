package Po0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.UserAdvertsLink;
import j.e0;
import kotlin.Metadata;

/* compiled from: SbcAutoDispatchesEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LPo0/b;", "", "a", "b", "LPo0/b$a;", "LPo0/b$b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Po0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14818b {

    /* compiled from: SbcAutoDispatchesEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPo0/b$a;", "LPo0/b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.b$a */
    public static final /* data */ class a implements InterfaceC14818b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAdvertsLink f13284a;

        public a(@k UserAdvertsLink userAdvertsLink) {
            this.f13284a = userAdvertsLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f13284a.equals(((a) obj).f13284a);
        }

        public final int hashCode() {
            return this.f13284a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDeeplinkEvent(deeplink=" + this.f13284a + ')';
        }
    }

    /* compiled from: SbcAutoDispatchesEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPo0/b$b;", "LPo0/b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0865b implements InterfaceC14818b {

        /* renamed from: a, reason: collision with root package name */
        public final int f13285a;

        public C0865b(@e0 int i12) {
            this.f13285a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0865b) && this.f13285a == ((C0865b) obj).f13285a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f13285a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ShowDispatchFinishedToast(resId="), this.f13285a, ')');
        }
    }
}
