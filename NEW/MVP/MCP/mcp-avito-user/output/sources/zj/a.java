package ZJ;

import Y61.k;
import Y61.l;
import aK.C19782a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CallsHistoryScreenEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"LZJ/a;", "", "a", "b", "c", "LZJ/a$b;", "LZJ/a$c;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: CallsHistoryScreenEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZJ/a$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ZJ.a$a, reason: collision with other inner class name */
    public static final class C1434a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C19782a<a> f20087a;

        static {
            new C1434a();
            f20087a = new C19782a<>(a.class);
        }
    }

    /* compiled from: CallsHistoryScreenEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZJ/a$b;", "LZJ/a;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f20088a;

        public b(@k DeepLink deepLink) {
            this.f20088a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f20088a, ((b) obj).f20088a);
        }

        public final int hashCode() {
            return this.f20088a.hashCode();
        }

        @k
        public final String toString() {
            return C1434a.f20087a.a(new String[]{"link=" + this.f20088a}, this);
        }
    }

    /* compiled from: CallsHistoryScreenEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZJ/a$c;", "LZJ/a;", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f20089a = new c();

        @k
        public final String toString() {
            return C1434a.f20087a.a(new String[0], this);
        }
    }
}
