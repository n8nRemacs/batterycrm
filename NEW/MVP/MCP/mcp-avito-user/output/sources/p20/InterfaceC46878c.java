package p20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParticipantOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lp20/c;", "", "a", "b", "c", "d", "e", "Lp20/c$a;", "Lp20/c$b;", "Lp20/c$c;", "Lp20/c$d;", "Lp20/c$e;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: p20.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC46878c {

    /* compiled from: ParticipantOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp20/c$a;", "Lp20/c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.c$a */
    public static final /* data */ class a implements InterfaceC46878c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f428137a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f428138b;

        public a(@l DeepLink deepLink, @k String str) {
            this.f428137a = deepLink;
            this.f428138b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f428137a, aVar.f428137a) && L.f(this.f428138b, aVar.f428138b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f428137a;
            return this.f428138b.hashCode() + ((deepLink == null ? 0 : deepLink.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplicationCreated(deepLink=");
            sb2.append(this.f428137a);
            sb2.append(", applicationId=");
            return C22026a.c(sb2, this.f428138b, ')');
        }
    }

    /* compiled from: ParticipantOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp20/c$b;", "Lp20/c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.c$b */
    public static final /* data */ class b implements InterfaceC46878c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final o20.b f428139a;

        public b(@k o20.b bVar) {
            this.f428139a = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f428139a, ((b) obj).f428139a);
        }

        public final int hashCode() {
            return this.f428139a.hashCode();
        }

        @k
        public final String toString() {
            return "Back(data=" + this.f428139a + ')';
        }
    }

    /* compiled from: ParticipantOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp20/c$c;", "Lp20/c;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12253c implements InterfaceC46878c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12253c f428140a = new C12253c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12253c);
        }

        public final int hashCode() {
            return 1088199695;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ParticipantOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp20/c$d;", "Lp20/c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.c$d */
    public static final /* data */ class d implements InterfaceC46878c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final MortgageClientSearchArguments f428141a;

        public d(@k MortgageClientSearchArguments mortgageClientSearchArguments) {
            this.f428141a = mortgageClientSearchArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f428141a, ((d) obj).f428141a);
        }

        public final int hashCode() {
            return this.f428141a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenClientSearch(arguments=" + this.f428141a + ')';
        }
    }

    /* compiled from: ParticipantOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp20/c$e;", "Lp20/c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.c$e */
    public static final /* data */ class e implements InterfaceC46878c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f428142a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f428143b;

        public e(@k PrintableText printableText, @l PrintableText printableText2) {
            this.f428142a = printableText;
            this.f428143b = printableText2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f428142a, eVar.f428142a) && L.f(this.f428143b, eVar.f428143b);
        }

        public final int hashCode() {
            int iHashCode = this.f428142a.hashCode() * 31;
            PrintableText printableText = this.f428143b;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToast(message=");
            sb2.append(this.f428142a);
            sb2.append(", action=");
            return AK.c.m(sb2, this.f428143b, ')');
        }
    }
}
