package qM0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_union.ui.items.tabs.c;
import com.avito.android.vas_union.ui.items.vas_bundle.c;
import com.avito.android.vas_union.ui.items.vas_performance_select.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2Action.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LqM0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LqM0/a$a;", "LqM0/a$b;", "LqM0/a$c;", "LqM0/a$d;", "LqM0/a$e;", "LqM0/a$f;", "LqM0/a$g;", "LqM0/a$h;", "LqM0/a$i;", "LqM0/a$j;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qM0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC47320a {

    /* compiled from: VasUnionV2Action.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqM0/a$a;", "LqM0/a;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12323a implements InterfaceC47320a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12323a f429205a = new C12323a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12323a);
        }

        public final int hashCode() {
            return -1846742461;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: VasUnionV2Action.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqM0/a$b;", "LqM0/a;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.a$b */
    public static final /* data */ class b implements InterfaceC47320a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final c.a f429206a;

        public b(@k c.a aVar) {
            this.f429206a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f429206a, ((b) obj).f429206a);
        }

        public final int hashCode() {
            return this.f429206a.hashCode();
        }

        @k
        public final String toString() {
            return "OnBundleCardSelected(item=" + this.f429206a + ')';
        }
    }

    /* compiled from: VasUnionV2Action.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqM0/a$c;", "LqM0/a;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.a$c */
    public static final /* data */ class c implements InterfaceC47320a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f429207a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f429208b;

        public c(@l Integer num, @l DeepLink deepLink) {
            this.f429207a = deepLink;
            this.f429208b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f429207a, cVar.f429207a) && L.f(this.f429208b, cVar.f429208b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f429207a;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Integer num = this.f429208b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnButtonClicked(deeplink=");
            sb2.append(this.f429207a);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f429208b, ')');
        }
    }

    /* compiled from: VasUnionV2Action.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqM0/a$d;", "LqM0/a;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.a$d */
    public static final /* data */ class d implements InterfaceC47320a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f429209a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1600149996;
        }

        @k
        public final String toString() {
            return "OnDataRequested";
        }
    }

    /* compiled from: VasUnionV2Action.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqM0/a$e;", "LqM0/a;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.a$e */
    public static final /* data */ class e implements InterfaceC47320a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f429210a;

        public e(@k DeepLink deepLink) {
            this.f429210a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f429210a, ((e) obj).f429210a);
        }

        public final int hashCode() {
            return this.f429210a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeepLinkClicked(deeplink="), this.f429210a, ')');
        }
    }

    /* compiled from: VasUnionV2Action.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqM0/a$f;", "LqM0/a;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.a$f */
    public static final /* data */ class f implements InterfaceC47320a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f429211a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -444160548;
        }

        @k
        public final String toString() {
            return "OnHelpButtonClicked";
        }
    }

    /* compiled from: VasUnionV2Action.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqM0/a$g;", "LqM0/a;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.a$g */
    public static final /* data */ class g implements InterfaceC47320a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final c.a f429212a;

        public g(@k c.a aVar) {
            this.f429212a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f429212a, ((g) obj).f429212a);
        }

        public final int hashCode() {
            return this.f429212a.hashCode();
        }

        @k
        public final String toString() {
            return "OnPerformanceCardSelected(item=" + this.f429212a + ')';
        }
    }

    /* compiled from: VasUnionV2Action.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqM0/a$h;", "LqM0/a;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.a$h */
    public static final /* data */ class h implements InterfaceC47320a {

        /* renamed from: a, reason: collision with root package name */
        public final int f429213a;

        public h(int i12) {
            this.f429213a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f429213a == ((h) obj).f429213a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f429213a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnPerformanceChipSelected(id="), this.f429213a, ')');
        }
    }

    /* compiled from: VasUnionV2Action.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqM0/a$i;", "LqM0/a;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.a$i */
    public static final /* data */ class i implements InterfaceC47320a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f429214a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f429215b;

        public i(boolean z12, @l Integer num) {
            this.f429214a = z12;
            this.f429215b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f429214a == iVar.f429214a && L.f(this.f429215b, iVar.f429215b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f429214a) * 31;
            Integer num = this.f429215b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnScreenLoadingChanged(isLoading=");
            sb2.append(this.f429214a);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f429215b, ')');
        }
    }

    /* compiled from: VasUnionV2Action.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqM0/a$j;", "LqM0/a;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qM0.a$j */
    public static final /* data */ class j implements InterfaceC47320a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final c.a f429216a;

        public j(@k c.a aVar) {
            this.f429216a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f429216a, ((j) obj).f429216a);
        }

        public final int hashCode() {
            return this.f429216a.hashCode();
        }

        @k
        public final String toString() {
            return "OnTabSelected(tab=" + this.f429216a + ')';
        }
    }
}
