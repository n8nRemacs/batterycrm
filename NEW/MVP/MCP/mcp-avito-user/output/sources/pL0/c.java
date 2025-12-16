package PL0;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VisualVasState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LPL0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f13028j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final c f13029k = new c(true, null, C42784z0.f406748b, null, null, null, null, "");

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13030b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ApiError f13031c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f13032d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C23424o.e f13033e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C0844c f13034f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final b f13035g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f13036h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f13037i;

    /* compiled from: VisualVasState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPL0/c$a;", "", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VisualVasState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPL0/c$c;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: PL0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0844c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f13049a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f13050b;

        public C0844c(@l DeepLink deepLink, @l PrintableText printableText) {
            this.f13049a = deepLink;
            this.f13050b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0844c)) {
                return false;
            }
            C0844c c0844c = (C0844c) obj;
            return L.f(this.f13049a, c0844c.f13049a) && L.f(this.f13050b, c0844c.f13050b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f13049a;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            PrintableText printableText = this.f13050b;
            return iHashCode + (printableText != null ? printableText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HelpButtonState(deepLink=");
            sb2.append(this.f13049a);
            sb2.append(", title=");
            return AK.c.m(sb2, this.f13050b, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z12, @l ApiError apiError, @k List<? extends com.avito.conveyor_item.a> list, @l C23424o.e eVar, @l C0844c c0844c, @l b bVar, @l DeepLink deepLink, @k String str) {
        this.f13030b = z12;
        this.f13031c = apiError;
        this.f13032d = list;
        this.f13033e = eVar;
        this.f13034f = c0844c;
        this.f13035g = bVar;
        this.f13036h = deepLink;
        this.f13037i = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c a(c cVar, boolean z12, ApiError apiError, ArrayList arrayList, C23424o.e eVar, b bVar, int i12) {
        if ((i12 & 1) != 0) {
            z12 = cVar.f13030b;
        }
        boolean z13 = z12;
        if ((i12 & 2) != 0) {
            apiError = cVar.f13031c;
        }
        ApiError apiError2 = apiError;
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = cVar.f13032d;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            eVar = cVar.f13033e;
        }
        C23424o.e eVar2 = eVar;
        C0844c c0844c = cVar.f13034f;
        if ((i12 & 32) != 0) {
            bVar = cVar.f13035g;
        }
        DeepLink deepLink = cVar.f13036h;
        String str = cVar.f13037i;
        cVar.getClass();
        return new c(z13, apiError2, list2, eVar2, c0844c, bVar, deepLink, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13030b == cVar.f13030b && L.f(this.f13031c, cVar.f13031c) && L.f(this.f13032d, cVar.f13032d) && L.f(this.f13033e, cVar.f13033e) && L.f(this.f13034f, cVar.f13034f) && L.f(this.f13035g, cVar.f13035g) && L.f(this.f13036h, cVar.f13036h) && L.f(this.f13037i, cVar.f13037i);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f13030b) * 31;
        ApiError apiError = this.f13031c;
        int iE2 = H.e((iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31, 31, this.f13032d);
        C23424o.e eVar = this.f13033e;
        int iHashCode2 = (iE2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        C0844c c0844c = this.f13034f;
        int iHashCode3 = (iHashCode2 + (c0844c == null ? 0 : c0844c.hashCode())) * 31;
        b bVar = this.f13035g;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        DeepLink deepLink = this.f13036h;
        return this.f13037i.hashCode() + ((iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VisualVasState(isLoading=");
        sb2.append(this.f13030b);
        sb2.append(", error=");
        sb2.append(this.f13031c);
        sb2.append(", items=");
        sb2.append(this.f13032d);
        sb2.append(", diffResult=");
        sb2.append(this.f13033e);
        sb2.append(", helpButtonState=");
        sb2.append(this.f13034f);
        sb2.append(", footerState=");
        sb2.append(this.f13035g);
        sb2.append(", noItemsDeepLink=");
        sb2.append(this.f13036h);
        sb2.append(", checkoutContext=");
        return C22026a.c(sb2, this.f13037i, ')');
    }

    /* compiled from: VisualVasState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LPL0/c$b;", "", "a", "b", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final a f13038a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C0843b f13039b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f13040c;

        /* compiled from: VisualVasState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LPL0/c$b$b;", "", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: PL0.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0843b {

            /* renamed from: a, reason: collision with root package name */
            public final int f13044a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final a f13045b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f13046c;

            /* compiled from: VisualVasState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPL0/c$b$b$a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: PL0.c$b$b$a */
            public static final /* data */ class a {

                /* renamed from: a, reason: collision with root package name */
                @l
                public final String f13047a;

                /* renamed from: b, reason: collision with root package name */
                @l
                public final String f13048b;

                public a(@l String str, @l String str2) {
                    this.f13047a = str;
                    this.f13048b = str2;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return L.f(this.f13047a, aVar.f13047a) && L.f(this.f13048b, aVar.f13048b);
                }

                public final int hashCode() {
                    String str = this.f13047a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f13048b;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ContinueButtonTexts(hasSelectedItemsText=");
                    sb2.append(this.f13047a);
                    sb2.append(", hasNoSelectedItemsText=");
                    return C22026a.c(sb2, this.f13048b, ')');
                }
            }

            public C0843b(@InterfaceC42150f int i12, @l a aVar, @k String str) {
                this.f13044a = i12;
                this.f13045b = aVar;
                this.f13046c = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0843b)) {
                    return false;
                }
                C0843b c0843b = (C0843b) obj;
                return this.f13044a == c0843b.f13044a && L.f(this.f13045b, c0843b.f13045b) && L.f(this.f13046c, c0843b.f13046c);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f13044a) * 31;
                a aVar = this.f13045b;
                return this.f13046c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ContinueButtonState(appearanceAttr=");
                sb2.append(this.f13044a);
                sb2.append(", texts=");
                sb2.append(this.f13045b);
                sb2.append(", currentText=");
                return C22026a.c(sb2, this.f13046c, ')');
            }
        }

        static {
            Parcelable.Creator<MnzFloatingFooter> creator = MnzFloatingFooter.CREATOR;
        }

        public b(@l a aVar, @l C0843b c0843b, boolean z12) {
            this.f13038a = aVar;
            this.f13039b = c0843b;
            this.f13040c = z12;
        }

        public static b a(b bVar, a aVar, C0843b c0843b, boolean z12, int i12) {
            if ((i12 & 2) != 0) {
                c0843b = bVar.f13039b;
            }
            if ((i12 & 4) != 0) {
                z12 = bVar.f13040c;
            }
            bVar.getClass();
            return new b(aVar, c0843b, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f13038a, bVar.f13038a) && L.f(this.f13039b, bVar.f13039b) && this.f13040c == bVar.f13040c;
        }

        public final int hashCode() {
            a aVar = this.f13038a;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            C0843b c0843b = this.f13039b;
            return Boolean.hashCode(this.f13040c) + ((iHashCode + (c0843b != null ? c0843b.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FooterState(bblFooterState=");
            sb2.append(this.f13038a);
            sb2.append(", continueButtonState=");
            sb2.append(this.f13039b);
            sb2.append(", showLoading=");
            return r.x(sb2, this.f13040c, ')');
        }

        /* compiled from: VisualVasState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPL0/c$b$a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final MnzFloatingFooter f13041a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final MnzFloatingFooter f13042b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Integer f13043c;

            static {
                Parcelable.Creator<MnzFloatingFooter> creator = MnzFloatingFooter.CREATOR;
            }

            public a(@l MnzFloatingFooter mnzFloatingFooter, @l MnzFloatingFooter mnzFloatingFooter2, @l Integer num) {
                this.f13041a = mnzFloatingFooter;
                this.f13042b = mnzFloatingFooter2;
                this.f13043c = num;
            }

            public static a a(a aVar, MnzFloatingFooter mnzFloatingFooter, Integer num, int i12) {
                MnzFloatingFooter mnzFloatingFooter2 = aVar.f13041a;
                if ((i12 & 2) != 0) {
                    mnzFloatingFooter = aVar.f13042b;
                }
                if ((i12 & 4) != 0) {
                    num = aVar.f13043c;
                }
                aVar.getClass();
                return new a(mnzFloatingFooter2, mnzFloatingFooter, num);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f13041a, aVar.f13041a) && L.f(this.f13042b, aVar.f13042b) && L.f(this.f13043c, aVar.f13043c);
            }

            public final int hashCode() {
                MnzFloatingFooter mnzFloatingFooter = this.f13041a;
                int iHashCode = (mnzFloatingFooter == null ? 0 : mnzFloatingFooter.hashCode()) * 31;
                MnzFloatingFooter mnzFloatingFooter2 = this.f13042b;
                int iHashCode2 = (iHashCode + (mnzFloatingFooter2 == null ? 0 : mnzFloatingFooter2.hashCode())) * 31;
                Integer num = this.f13043c;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("BblFooterState(defaultBblFooter=");
                sb2.append(this.f13041a);
                sb2.append(", currentBblFooter=");
                sb2.append(this.f13042b);
                sb2.append(", buttonId=");
                return s.j(sb2, this.f13043c, ')');
            }

            public /* synthetic */ a(MnzFloatingFooter mnzFloatingFooter, MnzFloatingFooter mnzFloatingFooter2, Integer num, int i12, C42822w c42822w) {
                this(mnzFloatingFooter, mnzFloatingFooter2, (i12 & 4) != 0 ? null : num);
            }
        }
    }
}
