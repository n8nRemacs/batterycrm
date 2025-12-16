package YV;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LicenseState.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LYV/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "LYV/a$a;", "LYV/a$b;", "_avito_license_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class a extends q {

    /* compiled from: LicenseState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYV/a$a;", "LYV/a;", "<init>", "()V", "_avito_license_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: YV.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1380a extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C1380a f19485b = new C1380a();

        public C1380a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1380a);
        }

        public final int hashCode() {
            return 1048040387;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: LicenseState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYV/a$b;", "LYV/a;", "_avito_license_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f19486b;

        public b(@k String str) {
            super(null);
            this.f19486b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f19486b, ((b) obj).f19486b);
        }

        public final int hashCode() {
            return this.f19486b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Success(licensesHtml="), this.f19486b, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
