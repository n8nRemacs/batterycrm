package c90;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.ActionButton;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PositionInSearchState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lc90/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final b f57704o = new b(null);

    /* renamed from: p, reason: collision with root package name */
    @k
    public static final c f57705p = new c("", null, null, null, null, null, null, null, null, true, false, false, PositionInfoPeriodAction.f221449b);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f57706b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f57707c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final e.a f57708d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final e f57709e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final a f57710f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final C2034c f57711g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final d f57712h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Throwable f57713i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Throwable f57714j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f57715k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f57716l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f57717m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final PositionInfoPeriodAction f57718n;

    /* compiled from: PositionInSearchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/c$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57719a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57720b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f57721c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f57722d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final ActionButton f57723e;

        public a(@k String str, boolean z12, @k String str2, @k String str3, @l ActionButton actionButton) {
            this.f57719a = str;
            this.f57720b = z12;
            this.f57721c = str2;
            this.f57722d = str3;
            this.f57723e = actionButton;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f57719a, aVar.f57719a) && this.f57720b == aVar.f57720b && L.f(this.f57721c, aVar.f57721c) && L.f(this.f57722d, aVar.f57722d) && L.f(this.f57723e, aVar.f57723e);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(r.i(this.f57719a.hashCode() * 31, 31, this.f57720b), 31, this.f57721c), 31, this.f57722d);
            ActionButton actionButton = this.f57723e;
            return iD2 + (actionButton == null ? 0 : actionButton.hashCode());
        }

        @k
        public final String toString() {
            return "Banner(bannerId=" + this.f57719a + ", closable=" + this.f57720b + ", title=" + this.f57721c + ", description=" + this.f57722d + ", action=" + this.f57723e + ')';
        }
    }

    /* compiled from: PositionInSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc90/c$b;", "", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: PositionInSearchState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lc90/c$c;", "", "a", "b", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.c$c, reason: collision with other inner class name */
    public static final /* data */ class C2034c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57724a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f57725b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f57726c;

        /* compiled from: PositionInSearchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/c$c$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: c90.c$c$a */
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Image f57727a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f57728b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f57729c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f57730d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final b f57731e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final DeepLink f57732f;

            public a(@l Image image, @k String str, @k String str2, @k String str3, @l b bVar, @k DeepLink deepLink) {
                this.f57727a = image;
                this.f57728b = str;
                this.f57729c = str2;
                this.f57730d = str3;
                this.f57731e = bVar;
                this.f57732f = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f57727a, aVar.f57727a) && L.f(this.f57728b, aVar.f57728b) && L.f(this.f57729c, aVar.f57729c) && L.f(this.f57730d, aVar.f57730d) && L.f(this.f57731e, aVar.f57731e) && L.f(this.f57732f, aVar.f57732f);
            }

            public final int hashCode() {
                Image image = this.f57727a;
                int iD2 = H.d(H.d(H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f57728b), 31, this.f57729c), 31, this.f57730d);
                b bVar = this.f57731e;
                return this.f57732f.hashCode() + ((iD2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Item(image=");
                sb2.append(this.f57727a);
                sb2.append(", price=");
                sb2.append(this.f57728b);
                sb2.append(", title=");
                sb2.append(this.f57729c);
                sb2.append(", location=");
                sb2.append(this.f57730d);
                sb2.append(", views=");
                sb2.append(this.f57731e);
                sb2.append(", deeplink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f57732f, ')');
            }
        }

        /* compiled from: PositionInSearchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/c$c$b;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: c90.c$c$b */
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f57733a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f57734b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f57735c;

            public b(@l String str, @k String str2, @l String str3) {
                this.f57733a = str;
                this.f57734b = str2;
                this.f57735c = str3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f57733a, bVar.f57733a) && L.f(this.f57734b, bVar.f57734b) && L.f(this.f57735c, bVar.f57735c);
            }

            public final int hashCode() {
                String str = this.f57733a;
                int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f57734b);
                String str2 = this.f57735c;
                return iD2 + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Views(textIcon=");
                sb2.append(this.f57733a);
                sb2.append(", currentCount=");
                sb2.append(this.f57734b);
                sb2.append(", deltaCount=");
                return C22026a.c(sb2, this.f57735c, ')');
            }
        }

        public C2034c(@k AttributedText attributedText, @k String str, @k ArrayList arrayList) {
            this.f57724a = str;
            this.f57725b = attributedText;
            this.f57726c = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2034c)) {
                return false;
            }
            C2034c c2034c = (C2034c) obj;
            return L.f(this.f57724a, c2034c.f57724a) && L.f(this.f57725b, c2034c.f57725b) && this.f57726c.equals(c2034c.f57726c);
        }

        public final int hashCode() {
            return this.f57726c.hashCode() + com.avito.android.actions_sheet.a.b(this.f57724a.hashCode() * 31, 31, this.f57725b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Competitors(title=");
            sb2.append(this.f57724a);
            sb2.append(", description=");
            sb2.append(this.f57725b);
            sb2.append(", items=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f57726c, ')');
        }
    }

    /* compiled from: PositionInSearchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/c$d;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Image f57736a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f57737b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f57738c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f57739d;

        public d(@k String str, @l Image image, @k ArrayList arrayList, @k String str2) {
            this.f57736a = image;
            this.f57737b = str;
            this.f57738c = str2;
            this.f57739d = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f57736a, dVar.f57736a) && L.f(this.f57737b, dVar.f57737b) && L.f(this.f57738c, dVar.f57738c) && this.f57739d.equals(dVar.f57739d);
        }

        public final int hashCode() {
            Image image = this.f57736a;
            return this.f57739d.hashCode() + H.d(H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f57737b), 31, this.f57738c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Footer(image=");
            sb2.append(this.f57736a);
            sb2.append(", price=");
            sb2.append(this.f57737b);
            sb2.append(", title=");
            sb2.append(this.f57738c);
            sb2.append(", buttons=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f57739d, ')');
        }
    }

    /* compiled from: PositionInSearchState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lc90/c$e;", "", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f57740a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<a> f57741b;

        /* renamed from: c, reason: collision with root package name */
        public final int f57742c;

        /* compiled from: PositionInSearchState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lc90/c$e$a;", "", "a", "b", "c", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PeriodType f57743a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final C2035a f57744b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final a f57745c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final b f57746d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final C2036c f57747e;

            /* compiled from: PositionInSearchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/c$e$a$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: c90.c$e$a$a, reason: collision with other inner class name */
            public static final /* data */ class C2035a {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f57748a;

                /* renamed from: b, reason: collision with root package name */
                public final boolean f57749b;

                /* renamed from: c, reason: collision with root package name */
                @l
                public final AttributedText f57750c;

                public C2035a(@k String str, boolean z12, @l AttributedText attributedText) {
                    this.f57748a = str;
                    this.f57749b = z12;
                    this.f57750c = attributedText;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2035a)) {
                        return false;
                    }
                    C2035a c2035a = (C2035a) obj;
                    return L.f(this.f57748a, c2035a.f57748a) && this.f57749b == c2035a.f57749b && L.f(this.f57750c, c2035a.f57750c);
                }

                public final int hashCode() {
                    int i12 = r.i(this.f57748a.hashCode() * 31, 31, this.f57749b);
                    AttributedText attributedText = this.f57750c;
                    return i12 + (attributedText == null ? 0 : attributedText.hashCode());
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("PeriodInfo(periodTitle=");
                    sb2.append(this.f57748a);
                    sb2.append(", available=");
                    sb2.append(this.f57749b);
                    sb2.append(", unavailableHint=");
                    return com.avito.android.actions_sheet.a.w(sb2, this.f57750c, ')');
                }
            }

            /* compiled from: PositionInSearchState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/c$e$a$b;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class b {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f57751a;

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f57752b;

                /* renamed from: c, reason: collision with root package name */
                @l
                public final AttributedText f57753c;

                /* renamed from: d, reason: collision with root package name */
                @l
                public final AttributedText f57754d;

                /* renamed from: e, reason: collision with root package name */
                @l
                public final AttributedText f57755e;

                /* renamed from: f, reason: collision with root package name */
                @l
                public final String f57756f;

                public b(@l AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @k String str, @k String str2, @l String str3) {
                    this.f57751a = str;
                    this.f57752b = str2;
                    this.f57753c = attributedText;
                    this.f57754d = attributedText2;
                    this.f57755e = attributedText3;
                    this.f57756f = str3;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return L.f(this.f57751a, bVar.f57751a) && L.f(this.f57752b, bVar.f57752b) && L.f(this.f57753c, bVar.f57753c) && L.f(this.f57754d, bVar.f57754d) && L.f(this.f57755e, bVar.f57755e) && L.f(this.f57756f, bVar.f57756f);
                }

                public final int hashCode() {
                    int iD2 = H.d(this.f57751a.hashCode() * 31, 31, this.f57752b);
                    AttributedText attributedText = this.f57753c;
                    int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                    AttributedText attributedText2 = this.f57754d;
                    int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
                    AttributedText attributedText3 = this.f57755e;
                    int iHashCode3 = (iHashCode2 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
                    String str = this.f57756f;
                    return iHashCode3 + (str != null ? str.hashCode() : 0);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("PositionData(title=");
                    sb2.append(this.f57751a);
                    sb2.append(", subTitle=");
                    sb2.append(this.f57752b);
                    sb2.append(", description=");
                    sb2.append(this.f57753c);
                    sb2.append(", position=");
                    sb2.append(this.f57754d);
                    sb2.append(", delta=");
                    sb2.append(this.f57755e);
                    sb2.append(", tooltipText=");
                    return C22026a.c(sb2, this.f57756f, ')');
                }
            }

            /* compiled from: PositionInSearchState.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lc90/c$e$a$c;", "", "a", "b", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: c90.c$e$a$c, reason: collision with other inner class name */
            public static final /* data */ class C2036c {

                /* renamed from: a, reason: collision with root package name */
                @k
                public final String f57757a;

                /* renamed from: b, reason: collision with root package name */
                @l
                public final String f57758b;

                /* renamed from: c, reason: collision with root package name */
                @l
                public final String f57759c;

                /* renamed from: d, reason: collision with root package name */
                @l
                public final String f57760d;

                /* renamed from: e, reason: collision with root package name */
                @k
                public final List<b> f57761e;

                /* renamed from: f, reason: collision with root package name */
                @l
                public final C2037a f57762f;

                /* compiled from: PositionInSearchState.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/c$e$a$c$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: c90.c$e$a$c$a, reason: collision with other inner class name */
                public static final /* data */ class C2037a {

                    /* renamed from: a, reason: collision with root package name */
                    @k
                    public final String f57763a;

                    /* renamed from: b, reason: collision with root package name */
                    public final long f57764b;

                    public C2037a(@k String str, long j12) {
                        this.f57763a = str;
                        this.f57764b = j12;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C2037a)) {
                            return false;
                        }
                        C2037a c2037a = (C2037a) obj;
                        return L.f(this.f57763a, c2037a.f57763a) && this.f57764b == c2037a.f57764b;
                    }

                    public final int hashCode() {
                        return Long.hashCode(this.f57764b) + (this.f57763a.hashCode() * 31);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("NextPageButton(title=");
                        sb2.append(this.f57763a);
                        sb2.append(", nextPageOffset=");
                        return r.u(sb2, this.f57764b, ')');
                    }
                }

                /* compiled from: PositionInSearchState.kt */
                @P
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lc90/c$e$a$c$b;", "", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: c90.c$e$a$c$b */
                public static final /* data */ class b {

                    /* renamed from: a, reason: collision with root package name */
                    @k
                    public final String f57765a;

                    /* renamed from: b, reason: collision with root package name */
                    @l
                    public final AttributedText f57766b;

                    /* renamed from: c, reason: collision with root package name */
                    @k
                    public final String f57767c;

                    /* renamed from: d, reason: collision with root package name */
                    @l
                    public final AttributedText f57768d;

                    /* renamed from: e, reason: collision with root package name */
                    @l
                    public final AttributedText f57769e;

                    /* renamed from: f, reason: collision with root package name */
                    @k
                    public final ArrayList f57770f;

                    /* renamed from: g, reason: collision with root package name */
                    @l
                    public final String f57771g;

                    /* renamed from: h, reason: collision with root package name */
                    @l
                    public final DeepLink f57772h;

                    /* compiled from: PositionInSearchState.kt */
                    @P
                    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/c$e$a$c$b$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: c90.c$e$a$c$b$a, reason: collision with other inner class name */
                    public static final /* data */ class C2038a {

                        /* renamed from: a, reason: collision with root package name */
                        @k
                        public final String f57773a;

                        /* renamed from: b, reason: collision with root package name */
                        @k
                        public final String f57774b;

                        public C2038a(@k String str, @k String str2) {
                            this.f57773a = str;
                            this.f57774b = str2;
                        }

                        public final boolean equals(@l Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C2038a)) {
                                return false;
                            }
                            C2038a c2038a = (C2038a) obj;
                            return L.f(this.f57773a, c2038a.f57773a) && L.f(this.f57774b, c2038a.f57774b);
                        }

                        public final int hashCode() {
                            return this.f57774b.hashCode() + (this.f57773a.hashCode() * 31);
                        }

                        @k
                        public final String toString() {
                            StringBuilder sb2 = new StringBuilder("StatisticItem(title=");
                            sb2.append(this.f57773a);
                            sb2.append(", value=");
                            return C22026a.c(sb2, this.f57774b, ')');
                        }
                    }

                    public b(@k String str, @l AttributedText attributedText, @k String str2, @l AttributedText attributedText2, @l AttributedText attributedText3, @k ArrayList arrayList, @l String str3, @l DeepLink deepLink) {
                        this.f57765a = str;
                        this.f57766b = attributedText;
                        this.f57767c = str2;
                        this.f57768d = attributedText2;
                        this.f57769e = attributedText3;
                        this.f57770f = arrayList;
                        this.f57771g = str3;
                        this.f57772h = deepLink;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return L.f(this.f57765a, bVar.f57765a) && L.f(this.f57766b, bVar.f57766b) && L.f(this.f57767c, bVar.f57767c) && L.f(this.f57768d, bVar.f57768d) && L.f(this.f57769e, bVar.f57769e) && this.f57770f.equals(bVar.f57770f) && L.f(this.f57771g, bVar.f57771g) && L.f(this.f57772h, bVar.f57772h);
                    }

                    public final int hashCode() {
                        int iHashCode = this.f57765a.hashCode() * 31;
                        AttributedText attributedText = this.f57766b;
                        int iD2 = H.d((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f57767c);
                        AttributedText attributedText2 = this.f57768d;
                        int iHashCode2 = (iD2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
                        AttributedText attributedText3 = this.f57769e;
                        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f57770f, (iHashCode2 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31, 31);
                        String str = this.f57771g;
                        int iHashCode3 = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
                        DeepLink deepLink = this.f57772h;
                        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("QueryItem(title=");
                        sb2.append(this.f57765a);
                        sb2.append(", delta=");
                        sb2.append(this.f57766b);
                        sb2.append(", id=");
                        sb2.append(this.f57767c);
                        sb2.append(", link=");
                        sb2.append(this.f57768d);
                        sb2.append(", position=");
                        sb2.append(this.f57769e);
                        sb2.append(", statistics=");
                        sb2.append(this.f57770f);
                        sb2.append(", tooltipText=");
                        sb2.append(this.f57771g);
                        sb2.append(", expandQueryItemDeeplink=");
                        return com.avito.android.actions_sheet.a.v(sb2, this.f57772h, ')');
                    }
                }

                public C2036c(@k String str, @l String str2, @l String str3, @l String str4, @k List<b> list, @l C2037a c2037a) {
                    this.f57757a = str;
                    this.f57758b = str2;
                    this.f57759c = str3;
                    this.f57760d = str4;
                    this.f57761e = list;
                    this.f57762f = c2037a;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2036c)) {
                        return false;
                    }
                    C2036c c2036c = (C2036c) obj;
                    return L.f(this.f57757a, c2036c.f57757a) && L.f(this.f57758b, c2036c.f57758b) && L.f(this.f57759c, c2036c.f57759c) && L.f(this.f57760d, c2036c.f57760d) && L.f(this.f57761e, c2036c.f57761e) && L.f(this.f57762f, c2036c.f57762f);
                }

                public final int hashCode() {
                    int iHashCode = this.f57757a.hashCode() * 31;
                    String str = this.f57758b;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.f57759c;
                    int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.f57760d;
                    int iE2 = H.e((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f57761e);
                    C2037a c2037a = this.f57762f;
                    return iE2 + (c2037a != null ? c2037a.hashCode() : 0);
                }

                @k
                public final String toString() {
                    return "QueryData(title=" + this.f57757a + ", description=" + this.f57758b + ", leftColumnTitle=" + this.f57759c + ", rightColumnTitle=" + this.f57760d + ", items=" + this.f57761e + ", nextPageButton=" + this.f57762f + ')';
                }
            }

            public a(@k PeriodType periodType, @k C2035a c2035a, @l a aVar, @l b bVar, @l C2036c c2036c) {
                this.f57743a = periodType;
                this.f57744b = c2035a;
                this.f57745c = aVar;
                this.f57746d = bVar;
                this.f57747e = c2036c;
            }

            public static a a(a aVar, PeriodType periodType, a aVar2, b bVar, C2036c c2036c, int i12) {
                if ((i12 & 1) != 0) {
                    periodType = aVar.f57743a;
                }
                PeriodType periodType2 = periodType;
                C2035a c2035a = aVar.f57744b;
                if ((i12 & 4) != 0) {
                    aVar2 = aVar.f57745c;
                }
                a aVar3 = aVar2;
                if ((i12 & 8) != 0) {
                    bVar = aVar.f57746d;
                }
                b bVar2 = bVar;
                if ((i12 & 16) != 0) {
                    c2036c = aVar.f57747e;
                }
                aVar.getClass();
                return new a(periodType2, c2035a, aVar3, bVar2, c2036c);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f57743a == aVar.f57743a && L.f(this.f57744b, aVar.f57744b) && L.f(this.f57745c, aVar.f57745c) && L.f(this.f57746d, aVar.f57746d) && L.f(this.f57747e, aVar.f57747e);
            }

            public final int hashCode() {
                int iHashCode = (this.f57744b.hashCode() + (this.f57743a.hashCode() * 31)) * 31;
                a aVar = this.f57745c;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                b bVar = this.f57746d;
                int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                C2036c c2036c = this.f57747e;
                return iHashCode3 + (c2036c != null ? c2036c.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "Period(stateType=" + this.f57743a + ", mainInfo=" + this.f57744b + ", adviceBanner=" + this.f57745c + ", positionData=" + this.f57746d + ", queryData=" + this.f57747e + ')';
            }
        }

        public e(@k ArrayList arrayList, @k List list, int i12) {
            this.f57740a = arrayList;
            this.f57741b = list;
            this.f57742c = i12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static e a(e eVar, ArrayList arrayList, int i12, int i13) {
            ArrayList arrayList2 = eVar.f57740a;
            List list = arrayList;
            if ((i13 & 2) != 0) {
                list = eVar.f57741b;
            }
            if ((i13 & 4) != 0) {
                i12 = eVar.f57742c;
            }
            eVar.getClass();
            return new e(arrayList2, list, i12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f57740a.equals(eVar.f57740a) && L.f(this.f57741b, eVar.f57741b) && this.f57742c == eVar.f57742c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57742c) + H.e(this.f57740a.hashCode() * 31, 31, this.f57741b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PeriodsBlock(segments=");
            sb2.append(this.f57740a);
            sb2.append(", periods=");
            sb2.append(this.f57741b);
            sb2.append(", initSelectedPos=");
            return r.t(sb2, this.f57742c, ')');
        }
    }

    public c(@k String str, @l String str2, @l e.a aVar, @l e eVar, @l a aVar2, @l C2034c c2034c, @l d dVar, @l Throwable th2, @l Throwable th3, boolean z12, boolean z13, boolean z14, @k PositionInfoPeriodAction positionInfoPeriodAction) {
        this.f57706b = str;
        this.f57707c = str2;
        this.f57708d = aVar;
        this.f57709e = eVar;
        this.f57710f = aVar2;
        this.f57711g = c2034c;
        this.f57712h = dVar;
        this.f57713i = th2;
        this.f57714j = th3;
        this.f57715k = z12;
        this.f57716l = z13;
        this.f57717m = z14;
        this.f57718n = positionInfoPeriodAction;
    }

    public static c a(c cVar, String str, String str2, e.a aVar, e eVar, a aVar2, C2034c c2034c, d dVar, ApiException apiException, ApiException apiException2, boolean z12, boolean z13, boolean z14, int i12) {
        PositionInfoPeriodAction positionInfoPeriodAction = PositionInfoPeriodAction.f221450c;
        String str3 = (i12 & 1) != 0 ? cVar.f57706b : str;
        String str4 = (i12 & 2) != 0 ? cVar.f57707c : str2;
        e.a aVar3 = (i12 & 4) != 0 ? cVar.f57708d : aVar;
        e eVar2 = (i12 & 8) != 0 ? cVar.f57709e : eVar;
        a aVar4 = (i12 & 16) != 0 ? cVar.f57710f : aVar2;
        C2034c c2034c2 = (i12 & 32) != 0 ? cVar.f57711g : c2034c;
        d dVar2 = (i12 & 64) != 0 ? cVar.f57712h : dVar;
        Throwable th2 = (i12 & 128) != 0 ? cVar.f57713i : apiException;
        Throwable th3 = (i12 & 256) != 0 ? cVar.f57714j : apiException2;
        boolean z15 = (i12 & 512) != 0 ? cVar.f57715k : z12;
        boolean z16 = (i12 & 1024) != 0 ? cVar.f57716l : z13;
        boolean z17 = (i12 & 2048) != 0 ? cVar.f57717m : z14;
        if ((i12 & 4096) != 0) {
            positionInfoPeriodAction = cVar.f57718n;
        }
        cVar.getClass();
        return new c(str3, str4, aVar3, eVar2, aVar4, c2034c2, dVar2, th2, th3, z15, z16, z17, positionInfoPeriodAction);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f57706b, cVar.f57706b) && L.f(this.f57707c, cVar.f57707c) && L.f(this.f57708d, cVar.f57708d) && L.f(this.f57709e, cVar.f57709e) && L.f(this.f57710f, cVar.f57710f) && L.f(this.f57711g, cVar.f57711g) && L.f(this.f57712h, cVar.f57712h) && L.f(this.f57713i, cVar.f57713i) && L.f(this.f57714j, cVar.f57714j) && this.f57715k == cVar.f57715k && this.f57716l == cVar.f57716l && this.f57717m == cVar.f57717m && this.f57718n == cVar.f57718n;
    }

    public final int hashCode() {
        int iHashCode = this.f57706b.hashCode() * 31;
        String str = this.f57707c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e.a aVar = this.f57708d;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e eVar = this.f57709e;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        a aVar2 = this.f57710f;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C2034c c2034c = this.f57711g;
        int iHashCode6 = (iHashCode5 + (c2034c == null ? 0 : c2034c.hashCode())) * 31;
        d dVar = this.f57712h;
        int iHashCode7 = (iHashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Throwable th2 = this.f57713i;
        int iHashCode8 = (iHashCode7 + (th2 == null ? 0 : th2.hashCode())) * 31;
        Throwable th3 = this.f57714j;
        return this.f57718n.hashCode() + r.i(r.i(r.i((iHashCode8 + (th3 != null ? th3.hashCode() : 0)) * 31, 31, this.f57715k), 31, this.f57716l), 31, this.f57717m);
    }

    @k
    public final String toString() {
        return "PositionInSearchState(title=" + this.f57706b + ", screenPeriod=" + this.f57707c + ", currentPeriod=" + this.f57708d + ", periodsBlock=" + this.f57709e + ", banner=" + this.f57710f + ", competitors=" + this.f57711g + ", footer=" + this.f57712h + ", mainError=" + this.f57713i + ", periodError=" + this.f57714j + ", isMainLoading=" + this.f57715k + ", isPeriodLoading=" + this.f57716l + ", isPaginationLoading=" + this.f57717m + ", lastActionType=" + this.f57718n + ')';
    }
}
