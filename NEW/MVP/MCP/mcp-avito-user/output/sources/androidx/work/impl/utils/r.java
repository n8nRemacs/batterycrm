package androidx.work.impl.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkRequestCompat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/utils/r;", "", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f56026b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Object f56027a;

    /* compiled from: NetworkRequestCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/utils/r$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        androidx.work.G.b("NetworkRequestCompat");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r() {
        C42822w c42822w = null;
        this(c42822w, 1, c42822w);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && kotlin.jvm.internal.L.f(this.f56027a, ((r) obj).f56027a);
    }

    public final int hashCode() {
        Object obj = this.f56027a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.foundation.H.n(new StringBuilder("NetworkRequestCompat(wrapped="), this.f56027a, ')');
    }

    public r(@Y61.l Object obj) {
        this.f56027a = obj;
    }

    public /* synthetic */ r(Object obj, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : obj);
    }
}
