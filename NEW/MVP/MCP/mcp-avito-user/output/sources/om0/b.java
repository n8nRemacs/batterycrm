package OM0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.verification.inn.list.button.ButtonItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FetchInvoiceAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LOM0/b;", "", "a", "b", "c", "d", "e", "f", "g", "LOM0/b$a;", "LOM0/b$b;", "LOM0/b$c;", "LOM0/b$d;", "LOM0/b$e;", "LOM0/b$f;", "LOM0/b$g;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: FetchInvoiceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOM0/b$a;", "LOM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ActionButtonClick(deepLink=null)";
        }
    }

    /* compiled from: FetchInvoiceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOM0/b$b;", "LOM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: OM0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0787b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0787b f12207a = new C0787b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0787b);
        }

        public final int hashCode() {
            return -1640435209;
        }

        @k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: FetchInvoiceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOM0/b$c;", "LOM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ButtonItem f12208a;

        public c(@k ButtonItem buttonItem) {
            this.f12208a = buttonItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f12208a, ((c) obj).f12208a);
        }

        public final int hashCode() {
            return this.f12208a.hashCode();
        }

        @k
        public final String toString() {
            return "ButtonItemClick(item=" + this.f12208a + ')';
        }
    }

    /* compiled from: FetchInvoiceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOM0/b$d;", "LOM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f12209a;

        public d(@k DeepLink deepLink) {
            this.f12209a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f12209a, ((d) obj).f12209a);
        }

        public final int hashCode() {
            return this.f12209a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClick(deeplink="), this.f12209a, ')');
        }
    }

    /* compiled from: FetchInvoiceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOM0/b$e;", "LOM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f12210a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 972235870;
        }

        @k
        public final String toString() {
            return "DisclosureItemClick";
        }
    }

    /* compiled from: FetchInvoiceAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOM0/b$f;", "LOM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f12211a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1890784618;
        }

        @k
        public final String toString() {
            return "RetryClick";
        }
    }

    /* compiled from: FetchInvoiceAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOM0/b$g;", "LOM0/b;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f12212a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f12213b;

        public g(@k String str, boolean z12) {
            this.f12212a = str;
            this.f12213b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f12212a, gVar.f12212a) && this.f12213b == gVar.f12213b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12213b) + (this.f12212a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetButtonItemLoading(stringId=");
            sb2.append(this.f12212a);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f12213b, ')');
        }
    }
}
