package WN;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsFormOneTimeEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LWN/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LWN/b$a;", "LWN/b$b;", "LWN/b$c;", "LWN/b$d;", "LWN/b$e;", "LWN/b$f;", "LWN/b$g;", "LWN/b$h;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: InstallmentsFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWN/b$a;", "LWN/b;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f17903a;

        public a(@k ArrayList arrayList) {
            this.f17903a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f17903a, ((a) obj).f17903a);
        }

        public final int hashCode() {
            return this.f17903a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("CloseScreenWithCancelResult(onCloseActionJsonList="), this.f17903a, ')');
        }
    }

    /* compiled from: InstallmentsFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWN/b$b;", "LWN/b;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: WN.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1269b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1269b f17904a = new C1269b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1269b);
        }

        public final int hashCode() {
            return -1728433885;
        }

        @k
        public final String toString() {
            return "CloseScreenWithSuccessResult";
        }
    }

    /* compiled from: InstallmentsFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWN/b$c;", "LWN/b;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17905a;

        public c(@k String str) {
            this.f17905a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f17905a, ((c) obj).f17905a);
        }

        public final int hashCode() {
            return this.f17905a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadUrl(url="), this.f17905a, ')');
        }
    }

    /* compiled from: InstallmentsFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWN/b$d;", "LWN/b;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f17906a;

        public d(@k Uri uri) {
            this.f17906a = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f17906a, ((d) obj).f17906a);
        }

        public final int hashCode() {
            return this.f17906a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("OpenExternalUrl(url="), this.f17906a, ')');
        }
    }

    /* compiled from: InstallmentsFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWN/b$e;", "LWN/b;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f17907a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1514398155;
        }

        @k
        public final String toString() {
            return "ShowCancellationDialog";
        }
    }

    /* compiled from: InstallmentsFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWN/b$f;", "LWN/b;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f17908a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -238109746;
        }

        @k
        public final String toString() {
            return "ShowPermissionToast";
        }
    }

    /* compiled from: InstallmentsFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWN/b$g;", "LWN/b;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17909a;

        public g(@k String str) {
            this.f17909a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            gVar.getClass();
            return L.f(this.f17909a, gVar.f17909a);
        }

        public final int hashCode() {
            return this.f17909a.hashCode() + 1393424521;
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowPostMessageDialog(title=New Post Message 🍺, subtitle="), this.f17909a, ')');
        }
    }

    /* compiled from: InstallmentsFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWN/b$h;", "LWN/b;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ValueCallback<Uri[]> f17910a;

        public h(@k ValueCallback<Uri[]> valueCallback) {
            this.f17910a = valueCallback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f17910a, ((h) obj).f17910a);
        }

        public final int hashCode() {
            return this.f17910a.hashCode();
        }

        @k
        public final String toString() {
            return "TryToOpenCamera(filePathCallback=" + this.f17910a + ')';
        }
    }
}
