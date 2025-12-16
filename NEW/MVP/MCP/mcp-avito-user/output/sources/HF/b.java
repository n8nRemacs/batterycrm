package Hf;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.autoteka.helpers.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaChoosingPurchaseOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LHf/b;", "", "a", "b", "c", "d", "e", "f", "g", "LHf/b$a;", "LHf/b$b;", "LHf/b$c;", "LHf/b$d;", "LHf/b$e;", "LHf/b$f;", "LHf/b$g;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: AutotekaChoosingPurchaseOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHf/b$a;", "LHf/b;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f7577a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -42279309;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHf/b$b;", "LHf/b;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hf.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0430b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0430b f7578a = new C0430b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0430b);
        }

        public final int hashCode() {
            return 21220519;
        }

        @k
        public final String toString() {
            return "CloseScreenWithSuccessResult";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHf/b$c;", "LHf/b;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f7579a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -447303217;
        }

        @k
        public final String toString() {
            return "OpenAuthScreen";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/b$d;", "LHf/b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f7580a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f7581b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f7582c;

        public d(@l String str, @k String str2, @k String str3) {
            this.f7580a = str;
            this.f7581b = str2;
            this.f7582c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f7580a, dVar.f7580a) && L.f(this.f7581b, dVar.f7581b) && L.f(this.f7582c, dVar.f7582c);
        }

        public final int hashCode() {
            String str = this.f7580a;
            return this.f7582c.hashCode() + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f7581b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenPayment(searchKey=");
            sb2.append(this.f7580a);
            sb2.append(", productId=");
            sb2.append(this.f7581b);
            sb2.append(", autotekaX=");
            return C22026a.c(sb2, this.f7582c, ')');
        }
    }

    /* compiled from: AutotekaChoosingPurchaseOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/b$e;", "LHf/b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "OpenStandalone(url=null)";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHf/b$f;", "LHf/b;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f7583a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1707816154;
        }

        @k
        public final String toString() {
            return "PurchaseViaPackageOnSuccess";
        }
    }

    /* compiled from: AutotekaChoosingPurchaseOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHf/b$g;", "LHf/b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final l.a f7584a;

        public g(@k l.a aVar) {
            this.f7584a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f7584a, ((g) obj).f7584a);
        }

        public final int hashCode() {
            return this.f7584a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowToast(toast=" + this.f7584a + ')';
        }
    }
}
