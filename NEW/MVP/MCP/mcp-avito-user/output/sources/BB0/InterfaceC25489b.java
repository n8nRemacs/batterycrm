package bB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpaInfoOneTimeEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LbB0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LbB0/b$a;", "LbB0/b$b;", "LbB0/b$c;", "LbB0/b$d;", "LbB0/b$e;", "LbB0/b$f;", "LbB0/b$g;", "LbB0/b$h;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bB0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC25489b {

    /* compiled from: CpaInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbB0/b$a;", "LbB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.b$a */
    public static final class a implements InterfaceC25489b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f56987a = new a();
    }

    /* compiled from: CpaInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbB0/b$b;", "LbB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.b$b, reason: collision with other inner class name */
    public static final class C1996b implements InterfaceC25489b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1996b f56988a = new C1996b();
    }

    /* compiled from: CpaInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB0/b$c;", "LbB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.b$c */
    public static final /* data */ class c implements InterfaceC25489b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f56989a;

        public c(@k DeepLink deepLink) {
            this.f56989a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f56989a, ((c) obj).f56989a);
        }

        public final int hashCode() {
            return this.f56989a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f56989a, ')');
        }
    }

    /* compiled from: CpaInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB0/b$d;", "LbB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.b$d */
    public static final /* data */ class d implements InterfaceC25489b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f56990a;

        public d(@k DeepLink deepLink) {
            this.f56990a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f56990a, ((d) obj).f56990a);
        }

        public final int hashCode() {
            return this.f56990a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Redirect(deeplink="), this.f56990a, ')');
        }
    }

    /* compiled from: CpaInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB0/b$e;", "LbB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.b$e */
    public static final /* data */ class e implements InterfaceC25489b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.tariff.cpa.info.ui.items.balance_info.a f56991a;

        public e(@k com.avito.android.tariff.cpa.info.ui.items.balance_info.a aVar) {
            this.f56991a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f56991a, ((e) obj).f56991a);
        }

        public final int hashCode() {
            return this.f56991a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDialog(data=" + this.f56991a + ')';
        }
    }

    /* compiled from: CpaInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB0/b$f;", "LbB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.b$f */
    public static final /* data */ class f implements InterfaceC25489b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f56992a;

        public f(boolean z12) {
            this.f56992a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f56992a == ((f) obj).f56992a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f56992a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowLoading(isShow="), this.f56992a, ')');
        }
    }

    /* compiled from: CpaInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB0/b$g;", "LbB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.b$g */
    public static final /* data */ class g implements InterfaceC25489b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f56993a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ToastBarPosition f56994b;

        public g(@k String str, @k ToastBarPosition toastBarPosition) {
            this.f56993a = str;
            this.f56994b = toastBarPosition;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f56993a, gVar.f56993a) && this.f56994b == gVar.f56994b;
        }

        public final int hashCode() {
            return this.f56994b.hashCode() + (this.f56993a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowMessage(text=" + this.f56993a + ", position=" + this.f56994b + ')';
        }
    }

    /* compiled from: CpaInfoOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB0/b$h;", "LbB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB0.b$h */
    public static final /* data */ class h implements InterfaceC25489b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f56995a;

        public h(boolean z12) {
            this.f56995a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f56995a == ((h) obj).f56995a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f56995a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ValidateInput(isValid="), this.f56995a, ')');
        }
    }
}
