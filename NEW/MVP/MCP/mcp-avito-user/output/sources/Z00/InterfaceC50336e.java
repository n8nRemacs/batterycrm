package z00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ManagerUspState.kt */
@F3
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lz00/e;", "", "a", "b", "c", "Lz00/e$a;", "Lz00/e$b;", "Lz00/e$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z00.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC50336e {

    /* compiled from: ManagerUspState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz00/e$a;", "Lz00/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z00.e$a */
    public static final /* data */ class a implements InterfaceC50336e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final f f443692a;

        public a(@k f fVar) {
            this.f443692a = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f443692a, ((a) obj).f443692a);
        }

        public final int hashCode() {
            return this.f443692a.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f443692a + ')';
        }
    }

    /* compiled from: ManagerUspState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz00/e$b;", "Lz00/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z00.e$b */
    public static final /* data */ class b implements InterfaceC50336e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f443693a;

        public b(@k ApiError apiError) {
            this.f443693a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443693a, ((b) obj).f443693a);
        }

        public final int hashCode() {
            return this.f443693a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f443693a, ')');
        }
    }

    /* compiled from: ManagerUspState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz00/e$c;", "Lz00/e;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z00.e$c */
    public static final /* data */ class c implements InterfaceC50336e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f443694a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 393133069;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
