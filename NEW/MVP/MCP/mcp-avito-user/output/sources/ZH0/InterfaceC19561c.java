package Zh0;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import ci0.C27199a;
import com.avito.android.realty_agency.checkerboard.bottom_sheet.I;
import com.avito.android.realty_agency.checkerboard.model.LotSortingType;
import com.avito.android.realty_agency.checkerboard.mvi.entity.MainContentTab;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.ApiException;
import di0.C39735e;
import ei0.C40110a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckerboardInternalAction.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"LZh0/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "LZh0/c$a;", "LZh0/c$b;", "LZh0/c$c;", "LZh0/c$d;", "LZh0/c$e;", "LZh0/c$f;", "LZh0/c$g;", "LZh0/c$h;", "LZh0/c$i;", "LZh0/c$j;", "LZh0/c$k;", "LZh0/c$l;", "LZh0/c$m;", "LZh0/c$n;", "LZh0/c$o;", "LZh0/c$p;", "LZh0/c$q;", "LZh0/c$r;", "LZh0/c$s;", "LZh0/c$t;", "LZh0/c$u;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zh0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC19561c {

    /* compiled from: CheckerboardInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZh0/c$a;", "LZh0/c;", "a", "b", "c", "LZh0/c$a$a;", "LZh0/c$a$b;", "LZh0/c$a$c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$a */
    public interface a extends InterfaceC19561c {

        /* compiled from: CheckerboardInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$a$a;", "LZh0/c$a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1459a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f20421a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final C27199a f20422b;

            public C1459a(@Y61.k String str, @Y61.k C27199a c27199a) {
                this.f20421a = str;
                this.f20422b = c27199a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1459a)) {
                    return false;
                }
                C1459a c1459a = (C1459a) obj;
                return L.f(this.f20421a, c1459a.f20421a) && L.f(this.f20422b, c1459a.f20422b);
            }

            public final int hashCode() {
                return this.f20422b.hashCode() + (this.f20421a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "Loaded(sectionName=" + this.f20421a + ", data=" + this.f20422b + ')';
            }
        }

        /* compiled from: CheckerboardInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$a$b;", "LZh0/c$a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.c$a$b */
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ApiException f20423a;

            public b(@Y61.k ApiException apiException) {
                this.f20423a = apiException;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f20423a.equals(((b) obj).f20423a);
            }

            public final int hashCode() {
                return this.f20423a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.q(new StringBuilder("LoadingError(error="), this.f20423a, ')');
            }
        }

        /* compiled from: CheckerboardInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/c$a$c;", "LZh0/c$a;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.c$a$c, reason: collision with other inner class name */
        public static final /* data */ class C1460c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1460c f20424a = new C1460c();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C1460c);
            }

            public final int hashCode() {
                return -194362161;
            }

            @Y61.k
            public final String toString() {
                return "StartLoading";
            }
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/c$b;", "LZh0/c;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$b */
    public static final /* data */ class b implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f20425a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -267400046;
        }

        @Y61.k
        public final String toString() {
            return "CloseAdditionalOptionBottomSheet";
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/c$c;", "LZh0/c;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1461c implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C1461c f20426a = new C1461c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C1461c);
        }

        public final int hashCode() {
            return -237805462;
        }

        @Y61.k
        public final String toString() {
            return "CloseLotItemPreviewBottomSheet";
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZh0/c$d;", "LZh0/c;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$d */
    public static final /* data */ class d implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f20427a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -199106954;
        }

        @Y61.k
        public final String toString() {
            return "CloseSectionSelectorBottomSheet";
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$e;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$e */
    public static final /* data */ class e implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20428a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Long f20429b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Long f20430c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final SearchParams f20431d;

        public e(boolean z12, @Y61.l Long l12, @Y61.l Long l13, @Y61.k SearchParams searchParams) {
            this.f20428a = z12;
            this.f20429b = l12;
            this.f20430c = l13;
            this.f20431d = searchParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f20428a == eVar.f20428a && L.f(this.f20429b, eVar.f20429b) && L.f(this.f20430c, eVar.f20430c) && L.f(this.f20431d, eVar.f20431d);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f20428a) * 31;
            Long l12 = this.f20429b;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.f20430c;
            return this.f20431d.hashCode() + ((iHashCode2 + (l13 != null ? l13.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(isClientModeEnabled=");
            sb2.append(this.f20428a);
            sb2.append(", buildingId=");
            sb2.append(this.f20429b);
            sb2.append(", sectionId=");
            sb2.append(this.f20430c);
            sb2.append(", searchParams=");
            return com.avito.android.bxcontent.mvi.entity.f.m(sb2, this.f20431d, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZh0/c$f;", "LZh0/c;", "a", "b", "c", "LZh0/c$f$a;", "LZh0/c$f$b;", "LZh0/c$f$c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$f */
    public interface f extends InterfaceC19561c {

        /* compiled from: CheckerboardInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$f$a;", "LZh0/c$f;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.c$f$a */
        public static final /* data */ class a implements f {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final C40110a f20432a;

            /* renamed from: b, reason: collision with root package name */
            public final long f20433b;

            public a(@Y61.k C40110a c40110a, long j12) {
                this.f20432a = c40110a;
                this.f20433b = j12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f20432a, aVar.f20432a) && this.f20433b == aVar.f20433b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f20433b) + (this.f20432a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Loaded(data=");
                sb2.append(this.f20432a);
                sb2.append(", pageNumber=");
                return androidx.appcompat.app.r.u(sb2, this.f20433b, ')');
            }
        }

        /* compiled from: CheckerboardInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$f$b;", "LZh0/c$f;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.c$f$b */
        public static final /* data */ class b implements f {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ApiException f20434a;

            public b(@Y61.k ApiException apiException) {
                this.f20434a = apiException;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f20434a.equals(((b) obj).f20434a);
            }

            public final int hashCode() {
                return this.f20434a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.q(new StringBuilder("LoadingError(error="), this.f20434a, ')');
            }
        }

        /* compiled from: CheckerboardInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$f$c;", "LZh0/c$f;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Zh0.c$f$c, reason: collision with other inner class name */
        public static final /* data */ class C1462c implements f {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f20435a;

            public C1462c(boolean z12) {
                this.f20435a = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1462c) && this.f20435a == ((C1462c) obj).f20435a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f20435a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.x(new StringBuilder("StartLoading(clearPreviousData="), this.f20435a, ')');
            }
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$g;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$g */
    public static final /* data */ class g implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SearchParams f20436a;

        public g(@Y61.k SearchParams searchParams) {
            this.f20436a = searchParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f20436a, ((g) obj).f20436a);
        }

        public final int hashCode() {
            return this.f20436a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.bxcontent.mvi.entity.f.m(new StringBuilder("SearchParamsClarified(searchParams="), this.f20436a, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$h;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$h */
    public static final /* data */ class h implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20437a;

        public h(boolean z12) {
            this.f20437a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f20437a == ((h) obj).f20437a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f20437a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("SetLotSortingSelectorBottomSheetVisibility(visible="), this.f20437a, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$i;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$i */
    public static final /* data */ class i implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        public final long f20438a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20439b;

        public i(long j12, long j13) {
            this.f20438a = j12;
            this.f20439b = j13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f20438a == iVar.f20438a && this.f20439b == iVar.f20439b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f20439b) + (Long.hashCode(this.f20438a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowAdditionalOptionBottomSheet(developmentId=");
            sb2.append(this.f20438a);
            sb2.append(", lotId=");
            return androidx.appcompat.app.r.u(sb2, this.f20439b, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$j;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$j */
    public static final /* data */ class j implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        public final long f20440a;

        public j(long j12) {
            this.f20440a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f20440a == ((j) obj).f20440a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f20440a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("ShowClientBindingBottomSheetScreen(developmentId="), this.f20440a, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$k;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$k */
    public static final /* data */ class k implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f20441a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f20442b;

        public k(@Y61.k String str, @Y61.k String str2) {
            this.f20441a = str;
            this.f20442b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f20441a, kVar.f20441a) && L.f(this.f20442b, kVar.f20442b);
        }

        public final int hashCode() {
            return this.f20442b.hashCode() + (this.f20441a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowDealCabinetScreen(locationId=");
            sb2.append(this.f20441a);
            sb2.append(", parentScreen=");
            return C22026a.c(sb2, this.f20442b, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$l;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$l */
    public static final /* data */ class l implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        public final long f20443a;

        public l(long j12) {
            this.f20443a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f20443a == ((l) obj).f20443a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f20443a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("ShowLotBookingBottomSheetScreen(lotId="), this.f20443a, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$m;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$m */
    public static final /* data */ class m implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        public final long f20444a;

        public m(long j12) {
            this.f20444a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f20444a == ((m) obj).f20444a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f20444a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("ShowLotCardScreen(lotId="), this.f20444a, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$n;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$n */
    public static final /* data */ class n implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final I f20445a;

        public n(@Y61.k I i12) {
            this.f20445a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f20445a, ((n) obj).f20445a);
        }

        public final int hashCode() {
            return this.f20445a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowLotItemPreviewBottomSheet(data=" + this.f20445a + ')';
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$o;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$o */
    public static final /* data */ class o implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<C39735e> f20446a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20447b;

        public o(@Y61.k List<C39735e> list, long j12) {
            this.f20446a = list;
            this.f20447b = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return L.f(this.f20446a, oVar.f20446a) && this.f20447b == oVar.f20447b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f20447b) + (this.f20446a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSectionSelectorBottomSheet(sections=");
            sb2.append(this.f20446a);
            sb2.append(", selectedSectionId=");
            return androidx.appcompat.app.r.u(sb2, this.f20447b, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$p;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$p */
    public static final /* data */ class p implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        public final long f20448a;

        public p(long j12) {
            this.f20448a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f20448a == ((p) obj).f20448a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f20448a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("ShowSelectionClientPickerBottomSheetScreen(lotId="), this.f20448a, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$q;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$q */
    public static final /* data */ class q implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20449a;

        public q(boolean z12) {
            this.f20449a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f20449a == ((q) obj).f20449a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f20449a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("UpdateInlineFiltersLoadingState(loaded="), this.f20449a, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$r;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$r */
    public static final /* data */ class r implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LotSortingType f20450a;

        public r(@Y61.k LotSortingType lotSortingType) {
            this.f20450a = lotSortingType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f20450a == ((r) obj).f20450a;
        }

        public final int hashCode() {
            return this.f20450a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateLotSortingType(sortingType=" + this.f20450a + ')';
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$s;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$s */
    public static final /* data */ class s implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MainContentTab f20451a;

        public s(@Y61.k MainContentTab mainContentTab) {
            this.f20451a = mainContentTab;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f20451a == ((s) obj).f20451a;
        }

        public final int hashCode() {
            return this.f20451a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateMainContentTab(tab=" + this.f20451a + ')';
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$t;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$t */
    public static final /* data */ class t implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20452a;

        public t(boolean z12) {
            this.f20452a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f20452a == ((t) obj).f20452a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f20452a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("UpdateMeetingMode(isEnabled="), this.f20452a, ')');
        }
    }

    /* compiled from: CheckerboardInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/c$u;", "LZh0/c;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.c$u */
    public static final /* data */ class u implements InterfaceC19561c {

        /* renamed from: a, reason: collision with root package name */
        public final long f20453a;

        public u(long j12) {
            this.f20453a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.f20453a == ((u) obj).f20453a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f20453a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("UpdateSelectedSection(sectionId="), this.f20453a, ')');
        }
    }
}
