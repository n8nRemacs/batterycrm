package gh0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: DialogAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lgh0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Lgh0/a$d;", "Lgh0/a$e;", "Lgh0/a$f;", "Lgh0/a$h;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gh0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC40682a {

    /* compiled from: DialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgh0/a$a;", "Lgh0/a$h;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11222a implements h {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f396701a;

        public C11222a(@l DeepLink deepLink) {
            this.f396701a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11222a) && L.f(this.f396701a, ((C11222a) obj).f396701a);
        }

        @Override // gh0.InterfaceC40682a.h
        @l
        /* renamed from: getAnalytics, reason: from getter */
        public final DeepLink getF396710b() {
            return this.f396701a;
        }

        public final int hashCode() {
            DeepLink deepLink = this.f396701a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("AuthDialog(analytics="), this.f396701a, ')');
        }
    }

    /* compiled from: DialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgh0/a$b;", "Lgh0/a$h;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.a$b */
    public static final /* data */ class b implements h {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final c f396702a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f396703b;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f396702a, bVar.f396702a) && L.f(this.f396703b, bVar.f396703b);
        }

        @Override // gh0.InterfaceC40682a.h
        @l
        /* renamed from: getAnalytics, reason: from getter */
        public final DeepLink getF396710b() {
            return this.f396703b;
        }

        public final int hashCode() {
            c cVar = this.f396702a;
            int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            DeepLink deepLink = this.f396703b;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseDialog(focusInfo=");
            sb2.append(this.f396702a);
            sb2.append(", analytics=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f396703b, ')');
        }

        public b(@l c cVar, @l DeepLink deepLink) {
            this.f396702a = cVar;
            this.f396703b = deepLink;
        }

        public /* synthetic */ b(c cVar, DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : cVar, (i12 & 2) != 0 ? null : deepLink);
        }
    }

    /* compiled from: DialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgh0/a$c;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.a$c */
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396704a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f396705b;

        public c(@k String str, @k String str2) {
            this.f396704a = str;
            this.f396705b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f396704a, cVar.f396704a) && L.f(this.f396705b, cVar.f396705b);
        }

        public final int hashCode() {
            return this.f396705b.hashCode() + (this.f396704a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FocusInfo(fieldSlug=");
            sb2.append(this.f396704a);
            sb2.append(", stepSlug=");
            return C22026a.c(sb2, this.f396705b, ')');
        }
    }

    /* compiled from: DialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgh0/a$d;", "Lgh0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.a$d */
    public static final /* data */ class d implements InterfaceC40682a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C43501a f396706a;

        public d(@k C43501a c43501a) {
            this.f396706a = c43501a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f396706a, ((d) obj).f396706a);
        }

        public final int hashCode() {
            return this.f396706a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleDeeplinkResult(event=" + this.f396706a + ')';
        }
    }

    /* compiled from: DialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgh0/a$e;", "Lgh0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.a$e */
    public static final /* data */ class e implements InterfaceC40682a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f396707a;

        public e(@k DeepLink deepLink) {
            this.f396707a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f396707a, ((e) obj).f396707a);
        }

        public final int hashCode() {
            return this.f396707a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deeplink="), this.f396707a, ')');
        }
    }

    /* compiled from: DialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgh0/a$f;", "Lgh0/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.a$f */
    public static final /* data */ class f implements InterfaceC40682a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396708a;

        public f(@k String str) {
            this.f396708a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f396708a, ((f) obj).f396708a);
        }

        public final int hashCode() {
            return this.f396708a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f396708a, ')');
        }
    }

    /* compiled from: DialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgh0/a$g;", "Lgh0/a$h;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.a$g */
    public static final /* data */ class g implements h {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f396709a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f396710b;

        public g(@k ArrayList arrayList, @l DeepLink deepLink) {
            this.f396709a = arrayList;
            this.f396710b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f396709a, gVar.f396709a) && L.f(this.f396710b, gVar.f396710b);
        }

        @Override // gh0.InterfaceC40682a.h
        @l
        /* renamed from: getAnalytics, reason: from getter */
        public final DeepLink getF396710b() {
            return this.f396710b;
        }

        public final int hashCode() {
            int iHashCode = this.f396709a.hashCode() * 31;
            DeepLink deepLink = this.f396710b;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateState(newStates=");
            sb2.append(this.f396709a);
            sb2.append(", analytics=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f396710b, ')');
        }
    }

    /* compiled from: DialogAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgh0/a$h;", "Lgh0/a;", "Lgh0/a$a;", "Lgh0/a$b;", "Lgh0/a$g;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.a$h */
    public interface h extends InterfaceC40682a {
        @l
        /* renamed from: getAnalytics */
        DeepLink getF396710b();
    }
}
