package ze0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.scanner.f;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.imei_recognition.ImeiRecognitionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScannerOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lze0/c;", "", "a", "b", "c", "d", "Lze0/c$a;", "Lze0/c$b;", "Lze0/c$c;", "Lze0/c$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ze0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC50555c {

    /* compiled from: ScannerOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze0/c$a;", "Lze0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.c$a */
    public static final class a implements InterfaceC50555c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f444123a = new a();
    }

    /* compiled from: ScannerOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lze0/c$b;", "Lze0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.c$b */
    public static final /* data */ class b implements InterfaceC50555c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f444124a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f444125b;

        public b(@k ApiError apiError, @k String str) {
            this.f444124a = str;
            this.f444125b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f444124a, bVar.f444124a) && L.f(this.f444125b, bVar.f444125b);
        }

        public final int hashCode() {
            return this.f444125b.hashCode() + (this.f444124a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowImeiRecognitionError(message=");
            sb2.append(this.f444124a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f444125b, ')');
        }
    }

    /* compiled from: ScannerOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lze0/c$c;", "Lze0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12963c implements InterfaceC50555c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final f f444126a;

        public C12963c(@k f fVar) {
            this.f444126a = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12963c) && L.f(this.f444126a, ((C12963c) obj).f444126a);
        }

        public final int hashCode() {
            return this.f444126a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowImeiRecognitionErrorDialog(errorTexts=" + this.f444126a + ')';
        }
    }

    /* compiled from: ScannerOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lze0/c$d;", "Lze0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ze0.c$d */
    public static final /* data */ class d implements InterfaceC50555c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ImeiRecognitionResult.Success f444127a;

        public d(@k ImeiRecognitionResult.Success success) {
            this.f444127a = success;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f444127a, ((d) obj).f444127a);
        }

        public final int hashCode() {
            return this.f444127a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateImeiFieldAndClose(result=" + this.f444127a + ')';
        }
    }
}
