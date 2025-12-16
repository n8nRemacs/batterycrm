package VO0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.wallet.page.history.remote.dto.PaymentOrderStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryItem.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LVO0/b;", "", "a", "b", "c", "d", "LVO0/b$a;", "LVO0/b$b;", "LVO0/b$c;", "LVO0/b$d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: PaymentHistoryItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVO0/b$a;", "LVO0/b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f17109a = new a();
    }

    /* compiled from: PaymentHistoryItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVO0/b$b;", "LVO0/b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: VO0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1178b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17110a;

        public C1178b(@k String str) {
            this.f17110a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1178b) && L.f(this.f17110a, ((C1178b) obj).f17110a);
        }

        public final int hashCode() {
            return this.f17110a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Header(title="), this.f17110a, ')');
        }
    }

    /* compiled from: PaymentHistoryItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVO0/b$c;", "LVO0/b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f17111a;

        public c() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f17111a == ((c) obj).f17111a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f17111a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Loader(isError="), this.f17111a, ')');
        }

        public c(boolean z12) {
            this.f17111a = z12;
        }

        public /* synthetic */ c(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: PaymentHistoryItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVO0/b$d;", "LVO0/b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17112a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f17113b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f17114c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f17115d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f17116e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final PaymentOrderStatus f17117f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f17118g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f17119h;

        public d(@k String str, @k String str2, @k String str3, @l String str4, @k String str5, @k PaymentOrderStatus paymentOrderStatus, boolean z12, @l String str6) {
            this.f17112a = str;
            this.f17113b = str2;
            this.f17114c = str3;
            this.f17115d = str4;
            this.f17116e = str5;
            this.f17117f = paymentOrderStatus;
            this.f17118g = z12;
            this.f17119h = str6;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f17112a, dVar.f17112a) && L.f(this.f17113b, dVar.f17113b) && L.f(this.f17114c, dVar.f17114c) && L.f(this.f17115d, dVar.f17115d) && L.f(this.f17116e, dVar.f17116e) && this.f17117f == dVar.f17117f && this.f17118g == dVar.f17118g && L.f(this.f17119h, dVar.f17119h);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f17112a.hashCode() * 31, 31, this.f17113b), 31, this.f17114c);
            String str = this.f17115d;
            int i12 = r.i((this.f17117f.hashCode() + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f17116e)) * 31, 31, this.f17118g);
            String str2 = this.f17119h;
            return i12 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Operation(id=");
            sb2.append(this.f17112a);
            sb2.append(", title=");
            sb2.append(this.f17113b);
            sb2.append(", amount=");
            sb2.append(this.f17114c);
            sb2.append(", description=");
            sb2.append(this.f17115d);
            sb2.append(", date=");
            sb2.append(this.f17116e);
            sb2.append(", status=");
            sb2.append(this.f17117f);
            sb2.append(", refundAvailable=");
            sb2.append(this.f17118g);
            sb2.append(", refundSubtitle=");
            return C22026a.c(sb2, this.f17119h, ')');
        }
    }
}
