package Hp;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.end_deal.model.EndDealResult;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EndDealOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LHp/b;", "", "a", "b", "c", "d", "e", "LHp/b$a;", "LHp/b$b;", "LHp/b$c;", "LHp/b$d;", "LHp/b$e;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: EndDealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/b$a;", "LHp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final EndDealResult f7724a;

        public a(@k EndDealResult endDealResult) {
            this.f7724a = endDealResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f7724a, ((a) obj).f7724a);
        }

        public final int hashCode() {
            return this.f7724a.hashCode();
        }

        @k
        public final String toString() {
            return "Close(result=" + this.f7724a + ')';
        }
    }

    /* compiled from: EndDealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/b$b;", "LHp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hp.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0441b implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final LocalDate f7725a;

        public C0441b(@l LocalDate localDate) {
            this.f7725a = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0441b) && L.f(this.f7725a, ((C0441b) obj).f7725a);
        }

        public final int hashCode() {
            LocalDate localDate = this.f7725a;
            if (localDate == null) {
                return 0;
            }
            return localDate.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.t(new StringBuilder("OpenCalendar(date="), this.f7725a, ')');
        }
    }

    /* compiled from: EndDealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/b$c;", "LHp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f7726a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f7727b;

        public c(@k DeepLink deepLink, @l Bundle bundle) {
            this.f7726a = deepLink;
            this.f7727b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f7726a, cVar.f7726a) && L.f(this.f7727b, cVar.f7727b);
        }

        public final int hashCode() {
            int iHashCode = this.f7726a.hashCode() * 31;
            Bundle bundle = this.f7727b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deeplink=");
            sb2.append(this.f7726a);
            sb2.append(", args=");
            return H.m(sb2, this.f7727b, ')');
        }
    }

    /* compiled from: EndDealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/b$d;", "LHp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f7728a;

        public d(@k PrintableText printableText) {
            this.f7728a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f7728a, ((d) obj).f7728a);
        }

        public final int hashCode() {
            return this.f7728a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(text="), this.f7728a, ')');
        }
    }

    /* compiled from: EndDealOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHp/b$e;", "LHp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f7729a;

        public e(@k PrintableText printableText) {
            this.f7729a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f7729a, ((e) obj).f7729a);
        }

        public final int hashCode() {
            return this.f7729a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowMessage(text="), this.f7729a, ')');
        }
    }
}
