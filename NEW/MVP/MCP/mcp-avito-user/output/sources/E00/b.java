package E00;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonFormAction.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f\u0082\u0001\u001e !\"#$%&'()*+,-./0123456789:;<=¨\u0006>"}, d2 = {"LE00/b;", "LE00/a;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "LE00/b$a;", "LE00/b$b;", "LE00/b$c;", "LE00/b$d;", "LE00/b$e;", "LE00/b$f;", "LE00/b$g;", "LE00/b$h;", "LE00/b$i;", "LE00/b$j;", "LE00/b$k;", "LE00/b$l;", "LE00/b$m;", "LE00/b$n;", "LE00/b$o;", "LE00/b$p;", "LE00/b$q;", "LE00/b$r;", "LE00/b$s;", "LE00/b$t;", "LE00/b$u;", "LE00/b$v;", "LE00/b$w;", "LE00/b$x;", "LE00/b$y;", "LE00/b$z;", "LE00/b$A;", "LE00/b$B;", "LE00/b$C;", "LE00/b$D;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b extends a {

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$A;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class A implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3608b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final SuggestionContainer<? extends Suggestion> f3609c;

        public A(@Y61.k String str, @Y61.l SuggestionContainer<? extends Suggestion> suggestionContainer) {
            this.f3608b = str;
            this.f3609c = suggestionContainer;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof A)) {
                return false;
            }
            A a12 = (A) obj;
            return L.f(this.f3608b, a12.f3608b) && L.f(this.f3609c, a12.f3609c);
        }

        public final int hashCode() {
            int iHashCode = this.f3608b.hashCode() * 31;
            SuggestionContainer<? extends Suggestion> suggestionContainer = this.f3609c;
            return iHashCode + (suggestionContainer == null ? 0 : suggestionContainer.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "UpdateFieldSuggestion(fieldId=" + this.f3608b + ", lastSuggestion=" + this.f3609c + ')';
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$B;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class B implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3610b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f3611c;

        public B(@Y61.k String str, @Y61.k String str2) {
            this.f3610b = str;
            this.f3611c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof B)) {
                return false;
            }
            B b12 = (B) obj;
            return L.f(this.f3610b, b12.f3610b) && L.f(this.f3611c, b12.f3611c);
        }

        public final int hashCode() {
            return this.f3611c.hashCode() + (this.f3610b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateInputFieldValue(fieldId=");
            sb2.append(this.f3610b);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f3611c, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$C;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class C implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3612b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f3613c;

        public C(@Y61.k String str, @Y61.k ArrayList arrayList) {
            this.f3612b = str;
            this.f3613c = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C)) {
                return false;
            }
            C c12 = (C) obj;
            return L.f(this.f3612b, c12.f3612b) && this.f3613c.equals(c12.f3613c);
        }

        public final int hashCode() {
            return this.f3613c.hashCode() + (this.f3612b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateSelectionValue(fieldId=");
            sb2.append(this.f3612b);
            sb2.append(", newValues=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f3613c, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/b$D;", "LE00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class D implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final D f3614b = new D();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof D);
        }

        public final int hashCode() {
            return 1720742968;
        }

        @Y61.k
        public final String toString() {
            return "VerificationBannerClick";
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE00/b$a;", "LE00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: E00.b$a, reason: case insensitive filesystem */
    public static final /* data */ class C13464a implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f3615b;

        public C13464a(@Y61.k DeepLink deepLink) {
            this.f3615b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13464a) && L.f(this.f3615b, ((C13464a) obj).f3615b);
        }

        public final int hashCode() {
            return this.f3615b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ActionBannerClick(link="), this.f3615b, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$b;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: E00.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0208b implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3616b;

        public C0208b(@Y61.k String str) {
            this.f3616b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0208b) && L.f(this.f3616b, ((C0208b) obj).f3616b);
        }

        public final int hashCode() {
            return this.f3616b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddChildClick(childrenId="), this.f3616b, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/b$c;", "LE00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: E00.b$c, reason: case insensitive filesystem */
    public static final /* data */ class C13465c implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C13465c f3617b = new C13465c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C13465c);
        }

        public final int hashCode() {
            return 32743898;
        }

        @Y61.k
        public final String toString() {
            return "ButtonNextClick";
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$d;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: E00.b$d, reason: case insensitive filesystem */
    public static final /* data */ class C13466d implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3618b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f3619c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f3620d;

        public C13466d(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f3618b = str;
            this.f3619c = str2;
            this.f3620d = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13466d)) {
                return false;
            }
            C13466d c13466d = (C13466d) obj;
            return L.f(this.f3618b, c13466d.f3618b) && L.f(this.f3619c, c13466d.f3619c) && L.f(this.f3620d, c13466d.f3620d);
        }

        public final int hashCode() {
            return this.f3620d.hashCode() + H.d(this.f3618b.hashCode() * 31, 31, this.f3619c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChildInputFieldClicked(childId=");
            sb2.append(this.f3618b);
            sb2.append(", childParentId=");
            sb2.append(this.f3619c);
            sb2.append(", inputId=");
            return C22026a.c(sb2, this.f3620d, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$e;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3621b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f3622c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f3623d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f3624e;

        public e(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
            this.f3621b = str;
            this.f3622c = str2;
            this.f3623d = str3;
            this.f3624e = str4;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f3621b, eVar.f3621b) && L.f(this.f3622c, eVar.f3622c) && L.f(this.f3623d, eVar.f3623d) && L.f(this.f3624e, eVar.f3624e);
        }

        public final int hashCode() {
            return this.f3624e.hashCode() + H.d(H.d(this.f3621b.hashCode() * 31, 31, this.f3622c), 31, this.f3623d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChildInputFieldUnfocused(childId=");
            sb2.append(this.f3621b);
            sb2.append(", childParentId=");
            sb2.append(this.f3622c);
            sb2.append(", inputId=");
            sb2.append(this.f3623d);
            sb2.append(", inputName=");
            return C22026a.c(sb2, this.f3624e, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/b$f;", "LE00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final f f3625b = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1295145877;
        }

        @Y61.k
        public final String toString() {
            return "CloseFlowClick";
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$g;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3626b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Suggestion f3627c;

        public g(@Y61.l Suggestion suggestion, @Y61.k String str) {
            this.f3626b = str;
            this.f3627c = suggestion;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f3626b, gVar.f3626b) && L.f(this.f3627c, gVar.f3627c);
        }

        public final int hashCode() {
            int iHashCode = this.f3626b.hashCode() * 31;
            Suggestion suggestion = this.f3627c;
            return iHashCode + (suggestion == null ? 0 : suggestion.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "DiscloseSuggestion(fieldId=" + this.f3626b + ", suggestion=" + this.f3627c + ')';
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/b$h;", "LE00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final h f3628b = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1083815184;
        }

        @Y61.k
        public final String toString() {
            return "GoBackClick";
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$i;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3629b;

        public i(@Y61.k String str) {
            this.f3629b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f3629b, ((i) obj).f3629b);
        }

        public final int hashCode() {
            return this.f3629b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputClick(fieldId="), this.f3629b, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$j;", "LE00/b;", "LF00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b, F00.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3630b;

        public j(@Y61.k String str) {
            this.f3630b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f3630b, ((j) obj).f3630b);
        }

        public final int hashCode() {
            return this.f3630b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputUnfocused(fieldId="), this.f3630b, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$k;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3631b;

        public k(boolean z12) {
            this.f3631b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f3631b == ((k) obj).f3631b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3631b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("KeyboardVisibilityChanged(isVisible="), this.f3631b, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/b$l;", "LE00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final l f3632b = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1247216457;
        }

        @Y61.k
        public final String toString() {
            return "Paused";
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/b$m;", "LE00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final m f3633b = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1282069478;
        }

        @Y61.k
        public final String toString() {
            return "PhoneConfirmed";
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$n;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3634b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f3635c;

        public n(@Y61.k String str, @Y61.k String str2) {
            this.f3634b = str;
            this.f3635c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.f3634b, nVar.f3634b) && L.f(this.f3635c, nVar.f3635c);
        }

        public final int hashCode() {
            return this.f3635c.hashCode() + (this.f3634b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoveChildClick(childId=");
            sb2.append(this.f3634b);
            sb2.append(", childParentId=");
            return C22026a.c(sb2, this.f3635c, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LE00/b$o;", "LE00/b;", "LF00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final o f3636b = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 257467029;
        }

        @Y61.k
        public final String toString() {
            return "ResetErrorScrollerState";
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/b$p;", "LE00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final p f3637b = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 1878739822;
        }

        @Y61.k
        public final String toString() {
            return "Resumed";
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/b$q;", "LE00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final q f3638b = new q();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 267018813;
        }

        @Y61.k
        public final String toString() {
            return "RetryLoading";
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/b$r;", "LE00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final r f3639b = new r();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -1851825845;
        }

        @Y61.k
        public final String toString() {
            return "ScrollStarted";
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LE00/b$s;", "LE00/b;", "LF00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final s f3640b = new s();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 2026638948;
        }

        @Y61.k
        public final String toString() {
            return "ScrollToNextError";
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$t;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PersonFormItem f3641b;

        public t(@Y61.k PersonFormItem personFormItem) {
            this.f3641b = personFormItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && L.f(this.f3641b, ((t) obj).f3641b);
        }

        public final int hashCode() {
            return this.f3641b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SelectOptionsClick(item=" + this.f3641b + ')';
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$u;", "LE00/b;", "LF00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u implements b, F00.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3642b;

        public u(@Y61.k String str) {
            this.f3642b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && L.f(this.f3642b, ((u) obj).f3642b);
        }

        public final int hashCode() {
            return this.f3642b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectionCancelled(fieldId="), this.f3642b, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$v;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class v implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3643b;

        public v(@Y61.k String str) {
            this.f3643b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && L.f(this.f3643b, ((v) obj).f3643b);
        }

        public final int hashCode() {
            return this.f3643b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SuggestionBannerClicked(suggestionId="), this.f3643b, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$w;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class w implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3644b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f3645c;

        public w(@Y61.k String str, boolean z12) {
            this.f3644b = str;
            this.f3645c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return L.f(this.f3644b, wVar.f3644b) && this.f3645c == wVar.f3645c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3645c) + (this.f3644b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateBooleanFieldValue(fieldId=");
            sb2.append(this.f3644b);
            sb2.append(", newValue=");
            return androidx.appcompat.app.r.x(sb2, this.f3645c, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$x;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class x implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3646b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f3647c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f3648d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f3649e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f3650f;

        public x(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, boolean z12) {
            this.f3646b = str;
            this.f3647c = str2;
            this.f3648d = str3;
            this.f3649e = str4;
            this.f3650f = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return L.f(this.f3646b, xVar.f3646b) && L.f(this.f3647c, xVar.f3647c) && L.f(this.f3648d, xVar.f3648d) && L.f(this.f3649e, xVar.f3649e) && this.f3650f == xVar.f3650f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f3650f) + H.d(H.d(H.d(this.f3646b.hashCode() * 31, 31, this.f3647c), 31, this.f3648d), 31, this.f3649e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateChildCheckboxFieldValue(childId=");
            sb2.append(this.f3646b);
            sb2.append(", childParentId=");
            sb2.append(this.f3647c);
            sb2.append(", checkboxId=");
            sb2.append(this.f3648d);
            sb2.append(", checkboxName=");
            sb2.append(this.f3649e);
            sb2.append(", newValue=");
            return androidx.appcompat.app.r.x(sb2, this.f3650f, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$y;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class y implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3651b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f3652c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f3653d;

        public y(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f3651b = str;
            this.f3652c = str2;
            this.f3653d = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return L.f(this.f3651b, yVar.f3651b) && L.f(this.f3652c, yVar.f3652c) && L.f(this.f3653d, yVar.f3653d);
        }

        public final int hashCode() {
            return this.f3653d.hashCode() + H.d(this.f3651b.hashCode() * 31, 31, this.f3652c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateChildInputFieldValue(childId=");
            sb2.append(this.f3651b);
            sb2.append(", childParentId=");
            sb2.append(this.f3652c);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f3653d, ')');
        }
    }

    /* compiled from: PersonFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LE00/b$z;", "LE00/b;", "LF00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class z implements b, F00.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f3654b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f3655c;

        public z(@Y61.k String str, @Y61.k String str2) {
            this.f3654b = str;
            this.f3655c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return L.f(this.f3654b, zVar.f3654b) && L.f(this.f3655c, zVar.f3655c);
        }

        public final int hashCode() {
            return this.f3655c.hashCode() + (this.f3654b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateChipsFieldValue(fieldId=");
            sb2.append(this.f3654b);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f3655c, ')');
        }
    }
}
