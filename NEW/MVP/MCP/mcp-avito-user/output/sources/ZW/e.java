package zw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DealCabinetState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lzw/e;", "", "a", "b", "Lzw/e$a;", "Lzw/e$b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface e {

    /* compiled from: DealCabinetState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/e$b;", "Lzw/e;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f444390a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1837587012;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: DealCabinetState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/e$a;", "Lzw/e;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f444388a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f444389b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k List<? extends com.avito.conveyor_item.a> list, boolean z12) {
            this.f444388a = list;
            this.f444389b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f444388a, aVar.f444388a) && this.f444389b == aVar.f444389b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f444389b) + (this.f444388a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(items=");
            sb2.append(this.f444388a);
            sb2.append(", footerButtonIsVisible=");
            return r.x(sb2, this.f444389b, ')');
        }

        public /* synthetic */ a(List list, boolean z12, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? false : z12);
        }
    }
}
