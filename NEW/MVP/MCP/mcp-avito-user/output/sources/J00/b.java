package J00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneConfirmOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LJ00/b;", "", "a", "b", "LJ00/b$a;", "LJ00/b$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: PhoneConfirmOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJ00/b$a;", "LJ00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f8697a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -269101853;
        }

        @k
        public final String toString() {
            return "CloseWithSuccess";
        }
    }

    /* compiled from: PhoneConfirmOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ00/b$b;", "LJ00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: J00.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0501b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f8698a;

        public C0501b(@k ApiError apiError) {
            this.f8698a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0501b) && L.f(this.f8698a, ((C0501b) obj).f8698a);
        }

        public final int hashCode() {
            return this.f8698a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowError(error="), this.f8698a, ')');
        }
    }
}
