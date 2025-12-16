package c60;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeRequestEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lc60/b;", "", "a", "b", "Lc60/b$a;", "Lc60/b$b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: CodeRequestEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc60/b$a;", "Lc60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f57652a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f57653b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f57654c;

        public a() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f57652a, aVar.f57652a) && L.f(this.f57653b, aVar.f57653b) && L.f(this.f57654c, aVar.f57654c);
        }

        public final int hashCode() {
            String str = this.f57652a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ApiError apiError = this.f57653b;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f57654c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f57652a);
            sb2.append(", apiError=");
            sb2.append(this.f57653b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f57654c, ')');
        }

        public a(String str, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            apiError = (i12 & 2) != 0 ? null : apiError;
            th2 = (i12 & 4) != 0 ? null : th2;
            this.f57652a = str;
            this.f57653b = apiError;
            this.f57654c = th2;
        }
    }

    /* compiled from: CodeRequestEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc60/b$b;", "Lc60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c60.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2031b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57655a;

        /* renamed from: b, reason: collision with root package name */
        public final long f57656b;

        public C2031b(@k String str, long j12) {
            this.f57655a = str;
            this.f57656b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2031b)) {
                return false;
            }
            C2031b c2031b = (C2031b) obj;
            return L.f(this.f57655a, c2031b.f57655a) && this.f57656b == c2031b.f57656b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f57656b) + (this.f57655a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Finished(phoneNumber=");
            sb2.append(this.f57655a);
            sb2.append(", timeoutEndTimestampSeconds=");
            return r.u(sb2, this.f57656b, ')');
        }
    }
}
