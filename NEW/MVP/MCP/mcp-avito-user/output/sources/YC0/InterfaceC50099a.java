package yC0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoV2Action.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LyC0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LyC0/a$a;", "LyC0/a$b;", "LyC0/a$c;", "LyC0/a$d;", "LyC0/a$e;", "LyC0/a$f;", "LyC0/a$g;", "LyC0/a$h;", "LyC0/a$i;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC50099a {

    /* compiled from: CptInfoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyC0/a$a;", "LyC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12892a implements InterfaceC50099a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12892a f442966a = new C12892a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12892a);
        }

        public final int hashCode() {
            return -915405151;
        }

        @k
        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: CptInfoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyC0/a$b;", "LyC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.a$b */
    public static final /* data */ class b implements InterfaceC50099a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f442967a;

        public b(@k DeepLink deepLink) {
            this.f442967a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f442967a, ((b) obj).f442967a);
        }

        public final int hashCode() {
            return this.f442967a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeepLinkClicked(deeplink="), this.f442967a, ')');
        }
    }

    /* compiled from: CptInfoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyC0/a$c;", "LyC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.a$c */
    public static final /* data */ class c implements InterfaceC50099a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f442968a;

        public c(@k DeepLink deepLink) {
            this.f442968a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f442968a, ((c) obj).f442968a);
        }

        public final int hashCode() {
            return this.f442968a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnFeatureClicked(deeplink="), this.f442968a, ')');
        }
    }

    /* compiled from: CptInfoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyC0/a$d;", "LyC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.a$d */
    public static final /* data */ class d implements InterfaceC50099a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f442969a;

        public d(@l String str) {
            this.f442969a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f442969a, ((d) obj).f442969a);
        }

        public final int hashCode() {
            String str = this.f442969a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnFilterClicked(groupSlug="), this.f442969a, ')');
        }
    }

    /* compiled from: CptInfoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyC0/a$e;", "LyC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.a$e */
    public static final /* data */ class e implements InterfaceC50099a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f442970a;

        public e(boolean z12) {
            this.f442970a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f442970a == ((e) obj).f442970a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f442970a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnHeaderItemChangeState(isVisible="), this.f442970a, ')');
        }
    }

    /* compiled from: CptInfoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyC0/a$f;", "LyC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.a$f */
    public static final /* data */ class f implements InterfaceC50099a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f442971a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1592601755;
        }

        @k
        public final String toString() {
            return "OnHelp";
        }
    }

    /* compiled from: CptInfoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyC0/a$g;", "LyC0/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.a$g */
    public static final /* data */ class g implements InterfaceC50099a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f442972a;

        public g(@k DeepLink deepLink) {
            this.f442972a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f442972a, ((g) obj).f442972a);
        }

        public final int hashCode() {
            return this.f442972a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnLevelClicked(deeplink="), this.f442972a, ')');
        }
    }

    /* compiled from: CptInfoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyC0/a$h;", "LyC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.a$h */
    public static final /* data */ class h implements InterfaceC50099a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f442973a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1025114303;
        }

        @k
        public final String toString() {
            return "OnRefresh";
        }
    }

    /* compiled from: CptInfoV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LyC0/a$i;", "LyC0/a;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yC0.a$i */
    public static final /* data */ class i implements InterfaceC50099a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f442974a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1768222835;
        }

        @k
        public final String toString() {
            return "OnReload";
        }
    }
}
