package c90;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInSearchOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lc90/b;", "", "a", "b", "c", "d", "e", "Lc90/b$a;", "Lc90/b$b;", "Lc90/b$c;", "Lc90/b$d;", "Lc90/b$e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c90.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC26961b {

    /* compiled from: PositionInSearchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc90/b$a;", "Lc90/b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.b$a */
    public static final /* data */ class a implements InterfaceC26961b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f57697a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1645802014;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: PositionInSearchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/b$b;", "Lc90/b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2033b implements InterfaceC26961b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f57698a;

        public C2033b(@k DeepLink deepLink) {
            this.f57698a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2033b) && L.f(this.f57698a, ((C2033b) obj).f57698a);
        }

        public final int hashCode() {
            return this.f57698a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f57698a, ')');
        }
    }

    /* compiled from: PositionInSearchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc90/b$c;", "Lc90/b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.b$c */
    public static final /* data */ class c implements InterfaceC26961b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f57699a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 46042123;
        }

        @k
        public final String toString() {
            return "HideMessage";
        }
    }

    /* compiled from: PositionInSearchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/b$d;", "Lc90/b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.b$d */
    public static final /* data */ class d implements InterfaceC26961b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57700a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57701b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f57702c;

        public d(@k String str, boolean z12, boolean z13) {
            this.f57700a = str;
            this.f57701b = z12;
            this.f57702c = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f57700a, dVar.f57700a) && this.f57701b == dVar.f57701b && this.f57702c == dVar.f57702c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57702c) + r.i(this.f57700a.hashCode() * 31, 31, this.f57701b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorMessage(message=");
            sb2.append(this.f57700a);
            sb2.append(", isClosable=");
            sb2.append(this.f57701b);
            sb2.append(", showRefreshButton=");
            return r.x(sb2, this.f57702c, ')');
        }
    }

    /* compiled from: PositionInSearchOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/b$e;", "Lc90/b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.b$e */
    public static final /* data */ class e implements InterfaceC26961b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57703a;

        public e(@k String str) {
            this.f57703a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f57703a, ((e) obj).f57703a);
        }

        public final int hashCode() {
            return this.f57703a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowInfoMessage(message="), this.f57703a, ')');
        }
    }
}
