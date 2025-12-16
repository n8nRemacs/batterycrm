package PL0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VisualVasOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LPL0/b;", "", "a", "b", "c", "d", "LPL0/b$a;", "LPL0/b$b;", "LPL0/b$c;", "LPL0/b$d;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: VisualVasOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPL0/b$a;", "LPL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13024a;

        public a() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f13024a == ((a) obj).f13024a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13024a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseScreen(forceFinishFlow="), this.f13024a, ')');
        }

        public a(boolean z12) {
            this.f13024a = z12;
        }

        public /* synthetic */ a(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: VisualVasOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPL0/b$b;", "LPL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: PL0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0842b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13025a;

        public C0842b(@k DeepLink deepLink) {
            this.f13025a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0842b) && L.f(this.f13025a, ((C0842b) obj).f13025a);
        }

        public final int hashCode() {
            return this.f13025a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f13025a, ')');
        }
    }

    /* compiled from: VisualVasOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPL0/b$c;", "LPL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13026a;

        public c(boolean z12) {
            this.f13026a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f13026a == ((c) obj).f13026a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13026a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("PutVideoVasSelectionParam(value="), this.f13026a, ')');
        }
    }

    /* compiled from: VisualVasOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPL0/b$d;", "LPL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f13027a;

        public d(@k ApiError apiError) {
            this.f13027a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f13027a, ((d) obj).f13027a);
        }

        public final int hashCode() {
            return this.f13027a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowErrorToast(error="), this.f13027a, ')');
        }
    }
}
