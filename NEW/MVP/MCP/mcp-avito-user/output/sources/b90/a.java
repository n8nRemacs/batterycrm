package B90;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileTabContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LB90/a;", "", "a", "b", "c", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final c f916a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final b f917b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f918c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f919d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<DeepLink> f920e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f921f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final C0036a f922g;

    /* compiled from: ProfileTabContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LB90/a$a;", "", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: B90.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0036a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final C0037a f923a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f924b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f925c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f926d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f927e;

        /* compiled from: ProfileTabContent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB90/a$a$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: B90.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0037a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f928a;

            public C0037a(@k String str) {
                this.f928a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0037a) && L.f(this.f928a, ((C0037a) obj).f928a);
            }

            public final int hashCode() {
                return this.f928a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Image(url="), this.f928a, ')');
            }
        }

        public C0036a(@l C0037a c0037a, @k String str, @k String str2, @k DeepLink deepLink, @l DeepLink deepLink2) {
            this.f923a = c0037a;
            this.f924b = str;
            this.f925c = str2;
            this.f926d = deepLink;
            this.f927e = deepLink2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0036a)) {
                return false;
            }
            C0036a c0036a = (C0036a) obj;
            return L.f(this.f923a, c0036a.f923a) && L.f(this.f924b, c0036a.f924b) && L.f(this.f925c, c0036a.f925c) && L.f(this.f926d, c0036a.f926d) && L.f(this.f927e, c0036a.f927e);
        }

        public final int hashCode() {
            C0037a c0037a = this.f923a;
            int iE2 = com.avito.android.actions_sheet.a.e(this.f926d, H.d(H.d((c0037a == null ? 0 : c0037a.f928a.hashCode()) * 31, 31, this.f924b), 31, this.f925c), 31);
            DeepLink deepLink = this.f927e;
            return iE2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AiAssistant(image=");
            sb2.append(this.f923a);
            sb2.append(", title=");
            sb2.append(this.f924b);
            sb2.append(", subtitle=");
            sb2.append(this.f925c);
            sb2.append(", uri=");
            sb2.append(this.f926d);
            sb2.append(", onShowClickstreamDeepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f927e, ')');
        }
    }

    /* compiled from: ProfileTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB90/a$b;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f929a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f930b;

        public b(@l String str, @l String str2) {
            this.f929a = str;
            this.f930b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f929a, bVar.f929a) && L.f(this.f930b, bVar.f930b);
        }

        public final int hashCode() {
            String str = this.f929a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f930b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Analytics(sharing=");
            sb2.append(this.f929a);
            sb2.append(", rating=");
            return C22026a.c(sb2, this.f930b, ')');
        }
    }

    /* compiled from: ProfileTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB90/a$c;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f931a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f932b;

        public c(@k String str, @k String str2) {
            this.f931a = str;
            this.f932b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f931a, cVar.f931a) && L.f(this.f932b, cVar.f932b);
        }

        public final int hashCode() {
            return this.f932b.hashCode() + (this.f931a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Sharing(title=");
            sb2.append(this.f931a);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f932b, ')');
        }
    }

    public a(@l c cVar, @l b bVar, @k ArrayList arrayList, @l Boolean bool, @l List list, @l DeepLink deepLink, @l C0036a c0036a) {
        this.f916a = cVar;
        this.f917b = bVar;
        this.f918c = arrayList;
        this.f919d = bool;
        this.f920e = list;
        this.f921f = deepLink;
        this.f922g = c0036a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f916a, aVar.f916a) && L.f(this.f917b, aVar.f917b) && this.f918c.equals(aVar.f918c) && L.f(this.f919d, aVar.f919d) && L.f(this.f920e, aVar.f920e) && L.f(this.f921f, aVar.f921f) && L.f(this.f922g, aVar.f922g);
    }

    public final int hashCode() {
        c cVar = this.f916a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        b bVar = this.f917b;
        int iG2 = e.g(this.f918c, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        Boolean bool = this.f919d;
        int iHashCode2 = (iG2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<DeepLink> list = this.f920e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        DeepLink deepLink = this.f921f;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        C0036a c0036a = this.f922g;
        return iHashCode4 + (c0036a != null ? c0036a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ProfileTabContent(sharing=" + this.f916a + ", analytics=" + this.f917b + ", items=" + this.f918c + ", hideNotifications=" + this.f919d + ", uxFeedbackDeepLinks=" + this.f920e + ", proDeclarationSuccessDeepLink=" + this.f921f + ", aiAssistant=" + this.f922g + ')';
    }
}
