package Se;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuyContactsAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LSe/a;", "", "a", "LSe/a$a;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Se.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC15174a {

    /* compiled from: BuyContactsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSe/a$a;", "LSe/a;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Se.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1027a implements InterfaceC15174a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f15096a;

        public C1027a(@k DeepLink deepLink) {
            this.f15096a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1027a) && L.f(this.f15096a, ((C1027a) obj).f15096a);
        }

        public final int hashCode() {
            return this.f15096a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeepLinkClicked(uri="), this.f15096a, ')');
        }
    }
}
