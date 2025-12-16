package RL0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VisualVasV2OneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LRL0/b;", "", "a", "b", "c", "LRL0/b$a;", "LRL0/b$b;", "LRL0/b$c;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: VisualVasV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRL0/b$a;", "LRL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14349a;

        public a(boolean z12) {
            this.f14349a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f14349a == ((a) obj).f14349a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14349a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseScreen(finishFlow="), this.f14349a, ')');
        }
    }

    /* compiled from: VisualVasV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRL0/b$b;", "LRL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: RL0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0956b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14350a;

        public C0956b(@k DeepLink deepLink) {
            this.f14350a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0956b) && L.f(this.f14350a, ((C0956b) obj).f14350a);
        }

        public final int hashCode() {
            return this.f14350a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f14350a, ')');
        }
    }

    /* compiled from: VisualVasV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRL0/b$c;", "LRL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f14351a;

        public c(@k ApiError apiError) {
            this.f14351a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f14351a, ((c) obj).f14351a);
        }

        public final int hashCode() {
            return this.f14351a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowErrorToast(error="), this.f14351a, ')');
        }
    }
}
