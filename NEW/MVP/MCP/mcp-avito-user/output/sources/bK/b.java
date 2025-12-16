package Bk;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripSelectOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LBk/b;", "", "a", "b", "c", "d", "e", "LBk/b$a;", "LBk/b$b;", "LBk/b$c;", "LBk/b$d;", "LBk/b$e;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: B2bBusinessTripSelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBk/b$a;", "LBk/b;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WebViewLink.AnyDomain f1645a;

        public a(@k WebViewLink.AnyDomain anyDomain) {
            this.f1645a = anyDomain;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f1645a.equals(((a) obj).f1645a);
        }

        public final int hashCode() {
            return this.f1645a.hashCode();
        }

        @k
        public final String toString() {
            return "DeeplinkLaunch(deepLink=" + this.f1645a + ')';
        }
    }

    /* compiled from: B2bBusinessTripSelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBk/b$b;", "LBk/b;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bk.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0070b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0070b f1646a = new C0070b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0070b);
        }

        public final int hashCode() {
            return -835624324;
        }

        @k
        public final String toString() {
            return "Exit";
        }
    }

    /* compiled from: B2bBusinessTripSelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBk/b$c;", "LBk/b;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f1647a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1597486762;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: B2bBusinessTripSelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBk/b$d;", "LBk/b;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f1648a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1829916613;
        }

        @k
        public final String toString() {
            return "NavigateToSuccessScreen";
        }
    }

    /* compiled from: B2bBusinessTripSelectOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBk/b$e;", "LBk/b;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f1649a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f1650b;

        public e(@k ApiError apiError, @k String str) {
            this.f1649a = str;
            this.f1650b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f1649a, eVar.f1649a) && L.f(this.f1650b, eVar.f1650b);
        }

        public final int hashCode() {
            return this.f1650b.hashCode() + (this.f1649a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToast(message=");
            sb2.append(this.f1649a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f1650b, ')');
        }
    }
}
