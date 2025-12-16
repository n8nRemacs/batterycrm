package Pp0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchSuggestOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LPp0/c;", "", "a", "b", "c", "d", "e", "f", "LPp0/c$a;", "LPp0/c$b;", "LPp0/c$c;", "LPp0/c$d;", "LPp0/c$e;", "LPp0/c$f;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pp0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14825c {

    /* compiled from: SearchSuggestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPp0/c$a;", "LPp0/c;", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.c$a */
    public static final /* data */ class a implements InterfaceC14825c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f13316a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -960037989;
        }

        @k
        public final String toString() {
            return "CancelClicked";
        }
    }

    /* compiled from: SearchSuggestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPp0/c$b;", "LPp0/c;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.c$b */
    public static final /* data */ class b implements InterfaceC14825c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13317a;

        public b(@k DeepLink deepLink) {
            this.f13317a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f13317a, ((b) obj).f13317a);
        }

        public final int hashCode() {
            return this.f13317a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkAsNavigation(deeplink="), this.f13317a, ')');
        }
    }

    /* compiled from: SearchSuggestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPp0/c$c;", "LPp0/c;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0870c implements InterfaceC14825c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13318a;

        public C0870c(@k DeepLink deepLink) {
            this.f13318a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0870c) && L.f(this.f13318a, ((C0870c) obj).f13318a);
        }

        public final int hashCode() {
            return this.f13318a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkAsResult(deeplink="), this.f13318a, ')');
        }
    }

    /* compiled from: SearchSuggestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPp0/c$d;", "LPp0/c;", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.c$d */
    public static final /* data */ class d implements InterfaceC14825c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f13319a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1589605525;
        }

        @k
        public final String toString() {
            return "RequestInputFocus";
        }
    }

    /* compiled from: SearchSuggestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPp0/c$e;", "LPp0/c;", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.c$e */
    public static final /* data */ class e implements InterfaceC14825c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f13320a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1487754186;
        }

        @k
        public final String toString() {
            return "ResetScroll";
        }
    }

    /* compiled from: SearchSuggestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPp0/c$f;", "LPp0/c;", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.c$f */
    public static final /* data */ class f implements InterfaceC14825c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f13321a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1791182169;
        }

        @k
        public final String toString() {
            return "SearchDeeplinkLoadingFailed";
        }
    }
}
