package SM;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesSelectionAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LSM/a;", "", "a", "b", "c", "LSM/a$a;", "LSM/a$b;", "LSM/a$c;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: ImportantAddressesSelectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSM/a$a;", "LSM/a;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: SM.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1007a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14918a;

        public C1007a(@k DeepLink deepLink) {
            this.f14918a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1007a) && L.f(this.f14918a, ((C1007a) obj).f14918a);
        }

        public final int hashCode() {
            return this.f14918a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("AdditionalActionClicked(deepLink="), this.f14918a, ')');
        }
    }

    /* compiled from: ImportantAddressesSelectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSM/a$b;", "LSM/a;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14919a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14920b;

        public b(int i12, boolean z12) {
            this.f14919a = i12;
            this.f14920b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f14919a == bVar.f14919a && this.f14920b == bVar.f14920b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14920b) + (Integer.hashCode(this.f14919a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddressChecked(id=");
            sb2.append(this.f14919a);
            sb2.append(", checked=");
            return r.x(sb2, this.f14920b, ')');
        }
    }

    /* compiled from: ImportantAddressesSelectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSM/a$c;", "LSM/a;", "<init>", "()V", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f14921a = new c();
    }
}
