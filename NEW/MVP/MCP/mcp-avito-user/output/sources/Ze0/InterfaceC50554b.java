package ze0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.imei_recognition.ImeiRecognitionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScannerInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lze0/b;", "", "a", "b", "c", "d", "e", "f", "g", "Lze0/b$a;", "Lze0/b$b;", "Lze0/b$c;", "Lze0/b$d;", "Lze0/b$e;", "Lze0/b$f;", "Lze0/b$g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ze0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC50554b {

    /* compiled from: ScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze0/b$a;", "Lze0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.b$a */
    public static final class a implements InterfaceC50554b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f444115a = new a();
    }

    /* compiled from: ScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze0/b$b;", "Lze0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.b$b, reason: collision with other inner class name */
    public static final class C12962b implements InterfaceC50554b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12962b f444116a = new C12962b();
    }

    /* compiled from: ScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lze0/b$c;", "Lze0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.b$c */
    public static final /* data */ class c implements InterfaceC50554b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.publish.scanner.f f444117a;

        public c(@k com.avito.android.publish.scanner.f fVar) {
            this.f444117a = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f444117a, ((c) obj).f444117a);
        }

        public final int hashCode() {
            return this.f444117a.hashCode();
        }

        @k
        public final String toString() {
            return "ImeiRecognitionError(errorTexts=" + this.f444117a + ')';
        }
    }

    /* compiled from: ScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lze0/b$d;", "Lze0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.b$d */
    public static final /* data */ class d implements InterfaceC50554b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f444118a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f444119b;

        public d(@k ApiError apiError, @k String str) {
            this.f444118a = str;
            this.f444119b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f444118a, dVar.f444118a) && L.f(this.f444119b, dVar.f444119b);
        }

        public final int hashCode() {
            return this.f444119b.hashCode() + (this.f444118a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImeiRecognitionRequestError(message=");
            sb2.append(this.f444118a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f444119b, ')');
        }
    }

    /* compiled from: ScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lze0/b$e;", "Lze0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.b$e */
    public static final /* data */ class e implements InterfaceC50554b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ImeiRecognitionResult.Success f444120a;

        public e(@k ImeiRecognitionResult.Success success) {
            this.f444120a = success;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f444120a, ((e) obj).f444120a);
        }

        public final int hashCode() {
            return this.f444120a.hashCode();
        }

        @k
        public final String toString() {
            return "ImeiRecognitionSuccess(imeiResult=" + this.f444120a + ')';
        }
    }

    /* compiled from: ScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze0/b$f;", "Lze0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.b$f */
    public static final class f implements InterfaceC50554b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f444121a = new f();
    }

    /* compiled from: ScannerInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze0/b$g;", "Lze0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.b$g */
    public static final class g implements InterfaceC50554b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f444122a = new g();
    }
}
