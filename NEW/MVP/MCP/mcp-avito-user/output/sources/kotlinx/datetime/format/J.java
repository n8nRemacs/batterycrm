package kotlinx.datetime.format;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocalTimeFormat.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/J;", "Lkotlinx/datetime/internal/format/k;", "Lkotlinx/datetime/format/o0;", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class J extends kotlinx.datetime.internal.format.k<InterfaceC43351o0> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final List<Integer> f412343g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final List<Integer> f412344h;

    /* renamed from: e, reason: collision with root package name */
    public final int f412345e;

    /* renamed from: f, reason: collision with root package name */
    public final int f412346f;

    /* compiled from: LocalTimeFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/datetime/format/J$a;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f412343g = C42745f0.U(0, 0, 0, 0, 0, 0, 0, 0, 0);
        f412344h = C42745f0.U(2, 1, 0, 2, 1, 0, 2, 1, 0);
    }

    public J() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public J(int i12, int i13, List list, int i14, C42822w c42822w) {
        list = (i14 & 4) != 0 ? f412343g : list;
        C43353p0.f412450a.getClass();
        super(C43353p0.f412454e, i12, i13, list);
        this.f412345e = i12;
        this.f412346f = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof J) {
            J j12 = (J) obj;
            if (this.f412345e == j12.f412345e && this.f412346f == j12.f412346f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f412345e * 31) + this.f412346f;
    }
}
