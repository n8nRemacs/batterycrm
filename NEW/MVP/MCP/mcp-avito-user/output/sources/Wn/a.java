package WN;

import Y61.l;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsFormAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LWN/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "LWN/a$a;", "LWN/a$b;", "LWN/a$c;", "LWN/a$d;", "LWN/a$e;", "LWN/a$f;", "LWN/a$g;", "LWN/a$h;", "LWN/a$i;", "LWN/a$j;", "LWN/a$k;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: InstallmentsFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWN/a$a;", "LWN/a;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: WN.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1268a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C1268a f17891a = new C1268a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1268a);
        }

        public final int hashCode() {
            return -646643215;
        }

        @Y61.k
        public final String toString() {
            return "OnBackButtonClicked";
        }
    }

    /* compiled from: InstallmentsFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWN/a$b;", "LWN/a;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ValueCallback<Uri[]> f17892a;

        public b(@l ValueCallback<Uri[]> valueCallback) {
            this.f17892a = valueCallback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f17892a, ((b) obj).f17892a);
        }

        public final int hashCode() {
            ValueCallback<Uri[]> valueCallback = this.f17892a;
            if (valueCallback == null) {
                return 0;
            }
            return valueCallback.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnCameraPermissionGranted(filePathCallback=" + this.f17892a + ')';
        }
    }

    /* compiled from: InstallmentsFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWN/a$c;", "LWN/a;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f17893a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 2054336185;
        }

        @Y61.k
        public final String toString() {
            return "OnCameraPermissionNotGranted";
        }
    }

    /* compiled from: InstallmentsFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWN/a$d;", "LWN/a;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f17894a;

        public d(@Y61.k DeepLink deepLink) {
            this.f17894a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f17894a, ((d) obj).f17894a);
        }

        public final int hashCode() {
            return this.f17894a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeeplink(deeplink="), this.f17894a, ')');
        }
    }

    /* compiled from: InstallmentsFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWN/a$e;", "LWN/a;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f17895a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1234615166;
        }

        @Y61.k
        public final String toString() {
            return "OnDialogCloseButtonClicked";
        }
    }

    /* compiled from: InstallmentsFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWN/a$f;", "LWN/a;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f17896a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1681353800;
        }

        @Y61.k
        public final String toString() {
            return "OnErrorRetryButtonClicked";
        }
    }

    /* compiled from: InstallmentsFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWN/a$g;", "LWN/a;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f17897a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -2048729513;
        }

        @Y61.k
        public final String toString() {
            return "OnPostMessageDialogDismissed";
        }
    }

    /* compiled from: InstallmentsFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWN/a$h;", "LWN/a;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f17898a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f17899b;

        public h(@Y61.k String str, @l String str2) {
            this.f17898a = str;
            this.f17899b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f17898a, hVar.f17898a) && L.f(this.f17899b, hVar.f17899b);
        }

        public final int hashCode() {
            int iHashCode = this.f17898a.hashCode() * 31;
            String str = this.f17899b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnPostMessageReceived(type=");
            sb2.append(this.f17898a);
            sb2.append(", content=");
            return C22026a.c(sb2, this.f17899b, ')');
        }
    }

    /* compiled from: InstallmentsFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWN/a$i;", "LWN/a;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f17900a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 741465168;
        }

        @Y61.k
        public final String toString() {
            return "OnToolbarBackButtonClicked";
        }
    }

    /* compiled from: InstallmentsFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWN/a$j;", "LWN/a;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ValueCallback<Uri[]> f17901a;

        public j(@Y61.k ValueCallback<Uri[]> valueCallback) {
            this.f17901a = valueCallback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f17901a, ((j) obj).f17901a);
        }

        public final int hashCode() {
            return this.f17901a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnWebShowFileChooserCalled(filePathCallback=" + this.f17901a + ')';
        }
    }

    /* compiled from: InstallmentsFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWN/a$k;", "LWN/a;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PowerWebViewStateChangeEvent f17902a;

        public k(@Y61.k PowerWebViewStateChangeEvent powerWebViewStateChangeEvent) {
            this.f17902a = powerWebViewStateChangeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f17902a, ((k) obj).f17902a);
        }

        public final int hashCode() {
            return this.f17902a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnWebViewStateChanged(state=" + this.f17902a + ')';
        }
    }
}
