package TN;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FakedoorState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LTN/c;", "", "a", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f15631d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f15632e = new c(null, true, false);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final SN.a f15633a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15634b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15635c;

    /* compiled from: FakedoorState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTN/c$a;", "", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l SN.a aVar, boolean z12, boolean z13) {
        this.f15633a = aVar;
        this.f15634b = z12;
        this.f15635c = z13;
    }

    public static c a(c cVar, boolean z12, boolean z13) {
        SN.a aVar = cVar.f15633a;
        cVar.getClass();
        return new c(aVar, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f15633a, cVar.f15633a) && this.f15634b == cVar.f15634b && this.f15635c == cVar.f15635c;
    }

    public final int hashCode() {
        SN.a aVar = this.f15633a;
        return Boolean.hashCode(this.f15635c) + r.i((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f15634b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FakedoorState(fakedoorData=");
        sb2.append(this.f15633a);
        sb2.append(", isLoading=");
        sb2.append(this.f15634b);
        sb2.append(", isError=");
        return r.x(sb2, this.f15635c, ')');
    }
}
