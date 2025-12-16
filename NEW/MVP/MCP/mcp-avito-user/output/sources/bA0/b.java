package BA0;

import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.sx_address.address_video_verification.domain.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressVideoVerificationInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LBA0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "LBA0/b$a;", "LBA0/b$b;", "LBA0/b$c;", "LBA0/b$d;", "LBA0/b$e;", "LBA0/b$f;", "LBA0/b$g;", "LBA0/b$h;", "LBA0/b$i;", "LBA0/b$j;", "LBA0/b$k;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: SxAddressVideoVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBA0/b$a;", "LBA0/b;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f1213a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1203796378;
        }

        @Y61.k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SxAddressVideoVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBA0/b$b;", "LBA0/b;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: BA0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0043b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C0043b f1214a = new C0043b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0043b);
        }

        public final int hashCode() {
            return 709332862;
        }

        @Y61.k
        public final String toString() {
            return "DeleteVideo";
        }
    }

    /* compiled from: SxAddressVideoVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBA0/b$c;", "LBA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f1215a;

        public c(@Y61.k ArrayList arrayList) {
            this.f1215a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f1215a.equals(((c) obj).f1215a);
        }

        public final int hashCode() {
            return this.f1215a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("OpenVideoPicker(mimeTypes="), this.f1215a, ')');
        }
    }

    /* compiled from: SxAddressVideoVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBA0/b$d;", "LBA0/b;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f1216a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 459779525;
        }

        @Y61.k
        public final String toString() {
            return "ScrollToBottom";
        }
    }

    /* compiled from: SxAddressVideoVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBA0/b$e;", "LBA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f1217a;

        public e(@Y61.k Throwable th2) {
            this.f1217a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f1217a, ((e) obj).f1217a);
        }

        public final int hashCode() {
            return this.f1217a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowError(throwable="), this.f1217a, ')');
        }
    }

    /* compiled from: SxAddressVideoVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBA0/b$f;", "LBA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f1218a;

        public f(@Y61.k String str) {
            this.f1218a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f1218a, ((f) obj).f1218a);
        }

        public final int hashCode() {
            return this.f1218a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(text="), this.f1218a, ')');
        }
    }

    /* compiled from: SxAddressVideoVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBA0/b$g;", "LBA0/b;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f1219a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1730357907;
        }

        @Y61.k
        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: SxAddressVideoVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBA0/b$h;", "LBA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f1220a;

        public h(@Y61.k String str) {
            this.f1220a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f1220a, ((h) obj).f1220a);
        }

        public final int hashCode() {
            return this.f1220a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowUploadingVideoError(errorMessage="), this.f1220a, ')');
        }
    }

    /* compiled from: SxAddressVideoVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBA0/b$i;", "LBA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f1221a;

        public i(@l DeepLink deepLink) {
            this.f1221a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f1221a, ((i) obj).f1221a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f1221a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SuccessFinish(redirectDeeplink="), this.f1221a, ')');
        }
    }

    /* compiled from: SxAddressVideoVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBA0/b$j;", "LBA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final File f1222a;

        public j(@Y61.k File file) {
            this.f1222a = file;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f1222a, ((j) obj).f1222a);
        }

        public final int hashCode() {
            return this.f1222a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UploadingVideo(video=" + this.f1222a + ')';
        }
    }

    /* compiled from: SxAddressVideoVerificationInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBA0/b$k;", "LBA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final NA0.a f1223a;

        public k(@Y61.k NA0.a aVar) {
            this.f1223a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f1223a, ((k) obj).f1223a);
        }

        public final int hashCode() {
            return this.f1223a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "VerificationInfoLoaded(response=" + this.f1223a + ')';
        }
    }
}
