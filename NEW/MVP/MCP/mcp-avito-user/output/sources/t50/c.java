package T50;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectSpecificState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LT50/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f15369f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f15370g = new c(null, false, false, null, 15, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f15371b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15372c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15373d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f15374e;

    /* compiled from: SelectSpecificState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LT50/c$a;", "", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(null, false, false, null, 15, null);
    }

    public static c a(c cVar, List list, boolean z12, boolean z13, Integer num, int i12) {
        if ((i12 & 1) != 0) {
            list = cVar.f15371b;
        }
        if ((i12 & 2) != 0) {
            z12 = cVar.f15372c;
        }
        if ((i12 & 4) != 0) {
            z13 = cVar.f15373d;
        }
        if ((i12 & 8) != 0) {
            num = cVar.f15374e;
        }
        cVar.getClass();
        return new c(list, z12, z13, num);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f15371b, cVar.f15371b) && this.f15372c == cVar.f15372c && this.f15373d == cVar.f15373d && L.f(this.f15374e, cVar.f15374e);
    }

    public final int hashCode() {
        int i12 = r.i(r.i(this.f15371b.hashCode() * 31, 31, this.f15372c), 31, this.f15373d);
        Integer num = this.f15374e;
        return i12 + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectSpecificState(content=");
        sb2.append(this.f15371b);
        sb2.append(", hasNewError=");
        sb2.append(this.f15372c);
        sb2.append(", isLoading=");
        sb2.append(this.f15373d);
        sb2.append(", selectedSpecificId=");
        return s.j(sb2, this.f15374e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k List<? extends com.avito.conveyor_item.a> list, boolean z12, boolean z13, @l Integer num) {
        this.f15371b = list;
        this.f15372c = z12;
        this.f15373d = z13;
        this.f15374e = num;
    }

    public c(List list, boolean z12, boolean z13, Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? null : num);
    }
}
