package Eo0;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.saved_searches.model.SavedSearchData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchMainAction.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"LEo0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "LEo0/a$a;", "LEo0/a$b;", "LEo0/a$c;", "LEo0/a$d;", "LEo0/a$e;", "LEo0/a$f;", "LEo0/a$g;", "LEo0/a$h;", "LEo0/a$i;", "LEo0/a$j;", "LEo0/a$k;", "LEo0/a$l;", "LEo0/a$m;", "LEo0/a$n;", "LEo0/a$o;", "LEo0/a$p;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Eo0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13515a {

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/a$a;", "LEo0/a;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0255a implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C0255a f4241a = new C0255a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C0255a);
        }

        public final int hashCode() {
            return -576792513;
        }

        @Y61.k
        public final String toString() {
            return "EmailSettingsClicked";
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEo0/a$b;", "LEo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$b */
    public static final /* data */ class b implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SavedSearchData.Settings.SettingsDetails f4242a;

        public b(@Y61.k SavedSearchData.Settings.SettingsDetails settingsDetails) {
            this.f4242a = settingsDetails;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f4242a, ((b) obj).f4242a);
        }

        public final int hashCode() {
            return this.f4242a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "EmailSettingsResult(settingsDetails=" + this.f4242a + ')';
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEo0/a$c;", "LEo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$c */
    public static final /* data */ class c implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4243a;

        public c(boolean z12) {
            this.f4243a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f4243a == ((c) obj).f4243a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4243a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("EmailToggleClicked(value="), this.f4243a, ')');
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/a$d;", "LEo0/a;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$d */
    public static final /* data */ class d implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f4244a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -288446354;
        }

        @Y61.k
        public final String toString() {
            return "EmailWarningBannerShown";
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEo0/a$e;", "LEo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$e */
    public static final /* data */ class e implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f4245a;

        public e(@Y61.l DeepLink deepLink) {
            this.f4245a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f4245a, ((e) obj).f4245a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f4245a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("EmailWarningClicked(deepLink="), this.f4245a, ')');
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/a$f;", "LEo0/a;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$f */
    public static final /* data */ class f implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f4246a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1340418619;
        }

        @Y61.k
        public final String toString() {
            return "MainButtonClicked";
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/a$g;", "LEo0/a;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$g */
    public static final /* data */ class g implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f4247a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1123044463;
        }

        @Y61.k
        public final String toString() {
            return "NameFieldClicked";
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEo0/a$h;", "LEo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$h */
    public static final /* data */ class h implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f4248a;

        public h(@Y61.k String str) {
            this.f4248a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f4248a, ((h) obj).f4248a);
        }

        public final int hashCode() {
            return this.f4248a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("NameValueChanged(value="), this.f4248a, ')');
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/a$i;", "LEo0/a;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$i */
    public static final /* data */ class i implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f4249a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -125060045;
        }

        @Y61.k
        public final String toString() {
            return "PushSettingsClicked";
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEo0/a$j;", "LEo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$j */
    public static final /* data */ class j implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SavedSearchData.Settings.SettingsDetails f4250a;

        public j(@Y61.k SavedSearchData.Settings.SettingsDetails settingsDetails) {
            this.f4250a = settingsDetails;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f4250a, ((j) obj).f4250a);
        }

        public final int hashCode() {
            return this.f4250a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PushSettingsResult(settingsDetails=" + this.f4250a + ')';
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEo0/a$k;", "LEo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$k */
    public static final /* data */ class k implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4251a;

        public k(boolean z12) {
            this.f4251a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f4251a == ((k) obj).f4251a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4251a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("PushToggleClicked(value="), this.f4251a, ')');
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/a$l;", "LEo0/a;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$l */
    public static final /* data */ class l implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f4252a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1140969466;
        }

        @Y61.k
        public final String toString() {
            return "PushWarningBannerShown";
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEo0/a$m;", "LEo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$m */
    public static final /* data */ class m implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f4253a;

        public m(@Y61.l DeepLink deepLink) {
            this.f4253a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f4253a, ((m) obj).f4253a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f4253a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("PushWarningClicked(deepLink="), this.f4253a, ')');
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/a$n;", "LEo0/a;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$n */
    public static final /* data */ class n implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f4254a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 734958260;
        }

        @Y61.k
        public final String toString() {
            return "ScreenResumed";
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/a$o;", "LEo0/a;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$o */
    public static final /* data */ class o implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f4255a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -2126920008;
        }

        @Y61.k
        public final String toString() {
            return "SecondaryButtonClicked";
        }
    }

    /* compiled from: SavedSearchMainAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEo0/a$p;", "LEo0/a;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eo0.a$p */
    public static final /* data */ class p implements InterfaceC13515a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f4256a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 171218939;
        }

        @Y61.k
        public final String toString() {
            return "UpdateScreenClicked";
        }
    }
}
