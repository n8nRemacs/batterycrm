package Cw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomOneTimeEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LCw/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LCw/b$a;", "LCw/b$b;", "LCw/b$c;", "LCw/b$d;", "LCw/b$e;", "LCw/b$f;", "LCw/b$g;", "LCw/b$h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cw.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC13363b {

    /* compiled from: DealRoomOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCw/b$a;", "LCw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw.b$a */
    public static final /* data */ class a implements InterfaceC13363b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f2760a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1848126553;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: DealRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LCw/b$b;", "LCw/b;", "a", "b", "c", "d", "LCw/b$b$a;", "LCw/b$b$b;", "LCw/b$b$c;", "LCw/b$b$d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw.b$b, reason: collision with other inner class name */
    public interface InterfaceC0133b extends InterfaceC13363b {

        /* compiled from: DealRoomOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCw/b$b$a;", "LCw/b$b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Cw.b$b$a */
        public static final /* data */ class a implements InterfaceC0133b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f2761a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 716801931;
            }

            @k
            public final String toString() {
                return "CloseDialog";
            }
        }

        /* compiled from: DealRoomOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/b$b$b;", "LCw/b$b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Cw.b$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0134b implements InterfaceC0133b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f2762a;

            public C0134b(boolean z12) {
                this.f2762a = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0134b) && this.f2762a == ((C0134b) obj).f2762a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f2762a);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("SetSaveButtonSpinnerVisibility(visible="), this.f2762a, ')');
            }
        }

        /* compiled from: DealRoomOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/b$b$c;", "LCw/b$b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Cw.b$b$c */
        public static final /* data */ class c implements InterfaceC0133b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f2763a;

            public c(@l String str) {
                this.f2763a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f2763a, ((c) obj).f2763a);
            }

            public final int hashCode() {
                String str = this.f2763a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowDialog(initialText="), this.f2763a, ')');
            }
        }

        /* compiled from: DealRoomOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/b$b$d;", "LCw/b$b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Cw.b$b$d */
        public static final /* data */ class d implements InterfaceC0133b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f2764a;

            public d(@k PrintableText printableText) {
                this.f2764a = printableText;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f2764a, ((d) obj).f2764a);
            }

            public final int hashCode() {
                return this.f2764a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.m(new StringBuilder("ShowToastBarOnEditNoteDialog(text="), this.f2764a, ')');
            }
        }
    }

    /* compiled from: DealRoomOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LCw/b$c;", "LCw/b;", "a", "b", "c", "d", "LCw/b$c$a;", "LCw/b$c$b;", "LCw/b$c$c;", "LCw/b$c$d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw.b$c */
    public interface c extends InterfaceC13363b {

        /* compiled from: DealRoomOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCw/b$c$a;", "LCw/b$c;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Cw.b$c$a */
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f2765a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1955592578;
            }

            @k
            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: DealRoomOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/b$c$b;", "LCw/b$c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Cw.b$c$b, reason: collision with other inner class name */
        public static final /* data */ class C0135b implements c {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f2766a;

            public C0135b(boolean z12) {
                this.f2766a = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0135b) && this.f2766a == ((C0135b) obj).f2766a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f2766a);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("SetSaveButtonSpinnerVisibility(visible="), this.f2766a, ')');
            }
        }

        /* compiled from: DealRoomOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/b$c$c;", "LCw/b$c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Cw.b$c$c, reason: collision with other inner class name */
        public static final /* data */ class C0136c implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final com.avito.android.developments_agency_search.screen.deal_room.edit_client.e f2767a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f2768b;

            public C0136c(@k com.avito.android.developments_agency_search.screen.deal_room.edit_client.e eVar, @l String str) {
                this.f2767a = eVar;
                this.f2768b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0136c)) {
                    return false;
                }
                C0136c c0136c = (C0136c) obj;
                return L.f(this.f2767a, c0136c.f2767a) && L.f(this.f2768b, c0136c.f2768b);
            }

            public final int hashCode() {
                int iHashCode = this.f2767a.hashCode() * 31;
                String str = this.f2768b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Show(clientForm=");
                sb2.append(this.f2767a);
                sb2.append(", noteText=");
                return C22026a.c(sb2, this.f2768b, ')');
            }
        }

        /* compiled from: DealRoomOneTimeEvent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/b$c$d;", "LCw/b$c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Cw.b$c$d */
        public static final /* data */ class d implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f2769a;

            public d(@k PrintableText printableText) {
                this.f2769a = printableText;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f2769a, ((d) obj).f2769a);
            }

            public final int hashCode() {
                return this.f2769a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.m(new StringBuilder("ShowToast(text="), this.f2769a, ')');
            }
        }
    }

    /* compiled from: DealRoomOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/b$d;", "LCw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw.b$d */
    public static final /* data */ class d implements InterfaceC13363b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f2770a;

        public d(@k DeepLink deepLink) {
            this.f2770a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f2770a, ((d) obj).f2770a);
        }

        public final int hashCode() {
            return this.f2770a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f2770a, ')');
        }
    }

    /* compiled from: DealRoomOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/b$e;", "LCw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw.b$e */
    public static final /* data */ class e implements InterfaceC13363b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f2771a;

        public e(@k String str) {
            this.f2771a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f2771a, ((e) obj).f2771a);
        }

        public final int hashCode() {
            return this.f2771a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowAgencyCommissionTooltip(tooltipText="), this.f2771a, ')');
        }
    }

    /* compiled from: DealRoomOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/b$f;", "LCw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw.b$f */
    public static final /* data */ class f implements InterfaceC13363b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f2772a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GetDealRoomInfoResponse.Deal.SelectionHistory.Item f2773b;

        public f(@k String str, @k GetDealRoomInfoResponse.Deal.SelectionHistory.Item item) {
            this.f2772a = str;
            this.f2773b = item;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f2772a, fVar.f2772a) && L.f(this.f2773b, fVar.f2773b);
        }

        public final int hashCode() {
            return this.f2773b.hashCode() + (this.f2772a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowDealRoomDevelopmentScreen(clientId=" + this.f2772a + ", developmentItem=" + this.f2773b + ')';
        }
    }

    /* compiled from: DealRoomOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCw/b$g;", "LCw/b;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw.b$g */
    public static final /* data */ class g implements InterfaceC13363b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f2774a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1259589299;
        }

        @k
        public final String toString() {
            return "ShowDealStageDocumentPickerScreen";
        }
    }

    /* compiled from: DealRoomOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw/b$h;", "LCw/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cw.b$h */
    public static final /* data */ class h implements InterfaceC13363b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2775a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f2776b;

        public h(@k PrintableText printableText, boolean z12) {
            this.f2775a = z12;
            this.f2776b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f2775a == hVar.f2775a && this.f2776b.equals(hVar.f2776b);
        }

        public final int hashCode() {
            return this.f2776b.hashCode() + (Boolean.hashCode(this.f2775a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToast(isError=");
            sb2.append(this.f2775a);
            sb2.append(", text=");
            return AK.c.m(sb2, this.f2776b, ')');
        }
    }
}
