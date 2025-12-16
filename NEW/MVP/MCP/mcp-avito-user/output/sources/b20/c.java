package b20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationContactInfoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lb20/c;", "", "a", "b", "c", "d", "Lb20/c$a;", "Lb20/c$b;", "Lb20/c$c;", "Lb20/c$d;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: ApplicationContactInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb20/c$a;", "Lb20/c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f56836a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f56837b;

        public a(@k String str, @l DeepLink deepLink) {
            this.f56836a = str;
            this.f56837b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f56836a, aVar.f56836a) && L.f(this.f56837b, aVar.f56837b);
        }

        public final int hashCode() {
            int iHashCode = this.f56836a.hashCode() * 31;
            DeepLink deepLink = this.f56837b;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplicationCreated(applicationId=");
            sb2.append(this.f56836a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f56837b, ')');
        }
    }

    /* compiled from: ApplicationContactInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb20/c$b;", "Lb20/c;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f56838a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -589222969;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ApplicationContactInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb20/c$c;", "Lb20/c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b20.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1987c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final MortgageClientSearchArguments f56839a;

        public C1987c(@k MortgageClientSearchArguments mortgageClientSearchArguments) {
            this.f56839a = mortgageClientSearchArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1987c) && L.f(this.f56839a, ((C1987c) obj).f56839a);
        }

        public final int hashCode() {
            return this.f56839a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenClientSearch(arguments=" + this.f56839a + ')';
        }
    }

    /* compiled from: ApplicationContactInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb20/c$d;", "Lb20/c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f56840a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f56841b;

        public d(@k PrintableText printableText, @l PrintableText printableText2) {
            this.f56840a = printableText;
            this.f56841b = printableText2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f56840a, dVar.f56840a) && L.f(this.f56841b, dVar.f56841b);
        }

        public final int hashCode() {
            int iHashCode = this.f56840a.hashCode() * 31;
            PrintableText printableText = this.f56841b;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToast(message=");
            sb2.append(this.f56840a);
            sb2.append(", action=");
            return AK.c.m(sb2, this.f56841b, ')');
        }
    }
}
