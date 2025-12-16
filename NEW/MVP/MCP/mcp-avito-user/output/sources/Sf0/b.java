package SF0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoDateRangePickerOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LSF0/b;", "", "a", "b", "c", "LSF0/b$a;", "LSF0/b$b;", "LSF0/b$c;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TrxPromoDateRangePickerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSF0/b$a;", "LSF0/b;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LocalDate f14857a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LocalDate f14858b;

        public a(@k LocalDate localDate, @k LocalDate localDate2) {
            this.f14857a = localDate;
            this.f14858b = localDate2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f14857a, aVar.f14857a) && L.f(this.f14858b, aVar.f14858b);
        }

        public final int hashCode() {
            return this.f14858b.hashCode() + (this.f14857a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseWithSelectedDates(dateFrom=");
            sb2.append(this.f14857a);
            sb2.append(", dateTo=");
            return AK.c.t(sb2, this.f14858b, ')');
        }
    }

    /* compiled from: TrxPromoDateRangePickerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSF0/b$b;", "LSF0/b;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: SF0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1004b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14859a;

        public C1004b(@k DeepLink deepLink) {
            this.f14859a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1004b) && L.f(this.f14859a, ((C1004b) obj).f14859a);
        }

        public final int hashCode() {
            return this.f14859a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f14859a, ')');
        }
    }

    /* compiled from: TrxPromoDateRangePickerOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSF0/b$c;", "LSF0/b;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f14860a;

        public c(@k PrintableText printableText) {
            this.f14860a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f14860a, ((c) obj).f14860a);
        }

        public final int hashCode() {
            return this.f14860a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(message="), this.f14860a, ')');
        }
    }
}
