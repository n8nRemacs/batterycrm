package F50;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.beduin.v2.engine.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PassportAuthSuggestState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LF50/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f4540c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final c f4541d = new c(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f4542b;

    /* compiled from: PassportAuthSuggestState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LF50/c$a;", "", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PassportAuthSuggestState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LF50/c$b;", "", "a", "b", "c", "LF50/c$b$a;", "LF50/c$b$b;", "LF50/c$b$c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PassportAuthSuggestState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF50/c$b$a;", "LF50/c$b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final D f4543a;

            public a(@k D d12) {
                this.f4543a = d12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f4543a, ((a) obj).f4543a);
            }

            public final int hashCode() {
                return this.f4543a.hashCode();
            }

            @k
            public final String toString() {
                return "Content(rendererState=" + this.f4543a + ')';
            }
        }

        /* compiled from: PassportAuthSuggestState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF50/c$b$b;", "LF50/c$b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: F50.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0275b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f4544a;

            public C0275b(@k ApiError apiError) {
                this.f4544a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0275b) && L.f(this.f4544a, ((C0275b) obj).f4544a);
            }

            public final int hashCode() {
                return this.f4544a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.n(new StringBuilder("Error(error="), this.f4544a, ')');
            }
        }

        /* compiled from: PassportAuthSuggestState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LF50/c$b$c;", "LF50/c$b;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: F50.c$b$c, reason: collision with other inner class name */
        public static final class C0276c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C0276c f4545a = new C0276c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f4542b, ((c) obj).f4542b);
    }

    public final int hashCode() {
        return this.f4542b.hashCode();
    }

    @k
    public final String toString() {
        return "PassportAuthSuggestState(viewState=" + this.f4542b + ')';
    }

    public /* synthetic */ c(b bVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? b.C0276c.f4545a : bVar);
    }

    public c(@k b bVar) {
        this.f4542b = bVar;
    }
}
