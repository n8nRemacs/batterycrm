package ww;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BigFiltersState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lww/d;", "", "a", "b", "c", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface d {

    /* compiled from: BigFiltersState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lww/d$a;", "Lww/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f441883a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k List<? extends com.avito.conveyor_item.a> list) {
            this.f441883a = list;
        }

        @Override // ww.d
        public final boolean a() {
            return true;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f441883a, ((a) obj).f441883a);
        }

        public final int hashCode() {
            return this.f441883a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Loaded(filterItems="), this.f441883a, ')');
        }
    }

    /* compiled from: BigFiltersState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/d$b;", "Lww/d;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f441884a = new b();

        @Override // ww.d
        public final boolean a() {
            return false;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -344952498;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: BigFiltersState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww/d$c;", "Lww/d;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f441885a = new c();

        @Override // ww.d
        public final boolean a() {
            return false;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 390730074;
        }

        @k
        public final String toString() {
            return "LoadingError";
        }
    }

    boolean a();
}
