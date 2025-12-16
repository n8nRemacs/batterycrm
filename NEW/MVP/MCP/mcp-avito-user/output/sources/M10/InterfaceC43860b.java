package m10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendingConfirmOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lm10/b;", "", "a", "b", "Lm10/b$a;", "Lm10/b$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m10.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC43860b {

    /* compiled from: SendingConfirmOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm10/b$a;", "Lm10/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m10.b$a */
    public static final /* data */ class a implements InterfaceC43860b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f414259a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -431985309;
        }

        @k
        public final String toString() {
            return "CloseWithSuccess";
        }
    }

    /* compiled from: SendingConfirmOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm10/b$b;", "Lm10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m10.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11813b implements InterfaceC43860b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f414260a;

        public C11813b(@k ApiError apiError) {
            this.f414260a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11813b) && L.f(this.f414260a, ((C11813b) obj).f414260a);
        }

        public final int hashCode() {
            return this.f414260a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowError(error="), this.f414260a, ')');
        }
    }
}
