package SO0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryDetailsAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LSO0/a;", "", "a", "b", "c", "d", "e", "f", "LSO0/a$a;", "LSO0/a$b;", "LSO0/a$c;", "LSO0/a$d;", "LSO0/a$e;", "LSO0/a$f;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: PaymentHistoryDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSO0/a$a;", "LSO0/a;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: SO0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1010a implements a {
        static {
            new C1010a();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1010a);
        }

        public final int hashCode() {
            return -1768219414;
        }

        @k
        public final String toString() {
            return "CloseRefund";
        }
    }

    /* compiled from: PaymentHistoryDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSO0/a$b;", "LSO0/a;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f14951a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1210089778;
        }

        @k
        public final String toString() {
            return "ConfirmRefund";
        }
    }

    /* compiled from: PaymentHistoryDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSO0/a$c;", "LSO0/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UO0.c f14952a;

        public c(@k UO0.c cVar) {
            this.f14952a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f14952a, ((c) obj).f14952a);
        }

        public final int hashCode() {
            return this.f14952a.hashCode();
        }

        @k
        public final String toString() {
            return "ReceiptButtonClick(receipt=" + this.f14952a + ')';
        }
    }

    /* compiled from: PaymentHistoryDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSO0/a$d;", "LSO0/a;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f14953a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1004083021;
        }

        @k
        public final String toString() {
            return "RefreshDetails";
        }
    }

    /* compiled from: PaymentHistoryDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSO0/a$e;", "LSO0/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14954a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f14955b;

        public e(@k String str, @k String str2) {
            this.f14954a = str;
            this.f14955b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f14954a, eVar.f14954a) && L.f(this.f14955b, eVar.f14955b);
        }

        public final int hashCode() {
            return this.f14955b.hashCode() + (this.f14954a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RefundButtonClick(amount=");
            sb2.append(this.f14954a);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.f14955b, ')');
        }
    }

    /* compiled from: PaymentHistoryDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSO0/a$f;", "LSO0/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14956a;

        public f(@k DeepLink deepLink) {
            this.f14956a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f14956a, ((f) obj).f14956a);
        }

        public final int hashCode() {
            return this.f14956a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("TextLinkClick(link="), this.f14956a, ')');
        }
    }
}
