package SO0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryDetailsViewState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LSO0/d;", "", "a", "b", "c", "d", "LSO0/d$a;", "LSO0/d$b;", "LSO0/d$c;", "LSO0/d$d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d {

    /* compiled from: PaymentHistoryDetailsViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSO0/d$a;", "LSO0/d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14973a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f14974b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final kotlin.collections.builders.b f14975c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final TO0.b f14976d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final TO0.c f14977e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f14978f;

        public a(@k String str, @k String str2, @k kotlin.collections.builders.b bVar, @l TO0.b bVar2, @l TO0.c cVar, @l String str3) {
            this.f14973a = str;
            this.f14974b = str2;
            this.f14975c = bVar;
            this.f14976d = bVar2;
            this.f14977e = cVar;
            this.f14978f = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f14973a, aVar.f14973a) && L.f(this.f14974b, aVar.f14974b) && L.f(this.f14975c, aVar.f14975c) && L.f(this.f14976d, aVar.f14976d) && this.f14977e.equals(aVar.f14977e) && L.f(this.f14978f, aVar.f14978f);
        }

        public final int hashCode() {
            int iHashCode = (this.f14975c.hashCode() + H.d(this.f14973a.hashCode() * 31, 31, this.f14974b)) * 31;
            TO0.b bVar = this.f14976d;
            int iHashCode2 = (this.f14977e.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            String str = this.f14978f;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f14973a);
            sb2.append(", subtitle=");
            sb2.append(this.f14974b);
            sb2.append(", items=");
            sb2.append(this.f14975c);
            sb2.append(", receiptButton=");
            sb2.append(this.f14976d);
            sb2.append(", refundData=");
            sb2.append(this.f14977e);
            sb2.append(", explanationText=");
            return C22026a.c(sb2, this.f14978f, ')');
        }
    }

    /* compiled from: PaymentHistoryDetailsViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSO0/d$b;", "LSO0/d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiException f14979a;

        public b(@k ApiException apiException) {
            this.f14979a = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f14979a.equals(((b) obj).f14979a);
        }

        public final int hashCode() {
            return this.f14979a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("Error(error="), this.f14979a, ')');
        }
    }

    /* compiled from: PaymentHistoryDetailsViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSO0/d$c;", "LSO0/d;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f14980a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1556403880;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: PaymentHistoryDetailsViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSO0/d$d;", "LSO0/d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: SO0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C1014d implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14981a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f14982b;

        public C1014d(@k String str, @k String str2) {
            this.f14981a = str;
            this.f14982b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1014d)) {
                return false;
            }
            C1014d c1014d = (C1014d) obj;
            return L.f(this.f14981a, c1014d.f14981a) && L.f(this.f14982b, c1014d.f14982b);
        }

        public final int hashCode() {
            return this.f14982b.hashCode() + (this.f14981a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Refund(amount=");
            sb2.append(this.f14981a);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.f14982b, ')');
        }
    }
}
