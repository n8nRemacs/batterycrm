package SO0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryDetailsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LSO0/b;", "", "a", "b", "c", "d", "e", "f", "LSO0/b$a;", "LSO0/b$b;", "LSO0/b$c;", "LSO0/b$d;", "LSO0/b$e;", "LSO0/b$f;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: PaymentHistoryDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSO0/b$a;", "LSO0/b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f14957a = new a();
    }

    /* compiled from: PaymentHistoryDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSO0/b$b;", "LSO0/b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: SO0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1011b implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f14958a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f14959b;

        public C1011b(@l String str, @l String str2) {
            this.f14958a = str;
            this.f14959b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1011b)) {
                return false;
            }
            C1011b c1011b = (C1011b) obj;
            return L.f(this.f14958a, c1011b.f14958a) && L.f(this.f14959b, c1011b.f14959b);
        }

        public final int hashCode() {
            String str = this.f14958a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f14959b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RunChromeCustomTabs(url=");
            sb2.append(this.f14958a);
            sb2.append(", intentPackage=");
            return C22026a.c(sb2, this.f14959b, ')');
        }
    }

    /* compiled from: PaymentHistoryDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSO0/b$c;", "LSO0/b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f14960a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -344092676;
        }

        @k
        public final String toString() {
            return "ShowFiscalizationErrorDialog";
        }
    }

    /* compiled from: PaymentHistoryDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSO0/b$d;", "LSO0/b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f14961a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -110475442;
        }

        @k
        public final String toString() {
            return "ShowFiscalizationInProgressDialog";
        }
    }

    /* compiled from: PaymentHistoryDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSO0/b$e;", "LSO0/b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f14962a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 398522590;
        }

        @k
        public final String toString() {
            return "ShowRefundError";
        }
    }

    /* compiled from: PaymentHistoryDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSO0/b$f;", "LSO0/b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14963a;

        public f(@k String str) {
            this.f14963a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f14963a, ((f) obj).f14963a);
        }

        public final int hashCode() {
            return this.f14963a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowRefundSuccess(deeplink="), this.f14963a, ')');
        }
    }
}
