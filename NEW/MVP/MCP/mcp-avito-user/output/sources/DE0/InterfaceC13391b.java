package De0;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VinScannerInternalAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LDe0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LDe0/b$a;", "LDe0/b$b;", "LDe0/b$c;", "LDe0/b$d;", "LDe0/b$e;", "LDe0/b$f;", "LDe0/b$g;", "LDe0/b$h;", "LDe0/b$i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: De0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC13391b {

    /* compiled from: VinScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDe0/b$a;", "LDe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: De0.b$a */
    public static final /* data */ class a implements InterfaceC13391b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f3320a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -440020845;
        }

        @k
        public final String toString() {
            return "CloseAndSavePublishClicked";
        }
    }

    /* compiled from: VinScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDe0/b$b;", "LDe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: De0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0177b implements InterfaceC13391b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0177b f3321a = new C0177b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0177b);
        }

        public final int hashCode() {
            return 1935306149;
        }

        @k
        public final String toString() {
            return "CloseScanner";
        }
    }

    /* compiled from: VinScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDe0/b$c;", "LDe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: De0.b$c */
    public static final /* data */ class c implements InterfaceC13391b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f3322a;

        public c(@l String str) {
            this.f3322a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3322a, ((c) obj).f3322a);
        }

        public final int hashCode() {
            String str = this.f3322a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HideScannerLoading(title="), this.f3322a, ')');
        }
    }

    /* compiled from: VinScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDe0/b$d;", "LDe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: De0.b$d */
    public static final /* data */ class d implements InterfaceC13391b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f3323a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 868530454;
        }

        @k
        public final String toString() {
            return "OnHelpButtonClicked";
        }
    }

    /* compiled from: VinScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDe0/b$e;", "LDe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: De0.b$e */
    public static final /* data */ class e implements InterfaceC13391b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f3324a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1700758311;
        }

        @k
        public final String toString() {
            return "OnOpenInstructionBottomSheetClicked";
        }
    }

    /* compiled from: VinScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDe0/b$f;", "LDe0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: De0.b$f */
    public static final /* data */ class f implements InterfaceC13391b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f3325a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -118151956;
        }

        @k
        public final String toString() {
            return "OnRetryScanningClicked";
        }
    }

    /* compiled from: VinScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDe0/b$g;", "LDe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: De0.b$g */
    public static final /* data */ class g implements InterfaceC13391b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f3326a;

        public g(@l String str) {
            this.f3326a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f3326a, ((g) obj).f3326a);
        }

        public final int hashCode() {
            String str = this.f3326a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RecognitionError(message="), this.f3326a, ')');
        }
    }

    /* compiled from: VinScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDe0/b$h;", "LDe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: De0.b$h */
    public static final /* data */ class h implements InterfaceC13391b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CategoryParameters f3327a;

        public h(@k CategoryParameters categoryParameters) {
            this.f3327a = categoryParameters;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f3327a, ((h) obj).f3327a);
        }

        public final int hashCode() {
            return this.f3327a.hashCode();
        }

        @k
        public final String toString() {
            return "RecognitionSuccess(publishParams=" + this.f3327a + ')';
        }
    }

    /* compiled from: VinScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDe0/b$i;", "LDe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: De0.b$i */
    public static final /* data */ class i implements InterfaceC13391b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f3328a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f3329b;

        public i(@k Uri uri, @l String str) {
            this.f3328a = uri;
            this.f3329b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f3328a, iVar.f3328a) && L.f(this.f3329b, iVar.f3329b);
        }

        public final int hashCode() {
            int iHashCode = this.f3328a.hashCode() * 31;
            String str = this.f3329b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetScannerLoading(uri=");
            sb2.append(this.f3328a);
            sb2.append(", loadingTitle=");
            return C22026a.c(sb2, this.f3329b, ')');
        }
    }
}
