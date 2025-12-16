package leakcanary;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import shark.B1;

/* compiled from: HeapAnalysisJob.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lleakcanary/r;", "", "a", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface r {

    /* compiled from: HeapAnalysisJob.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lleakcanary/r$a;", "", "<init>", "()V", "a", "b", "Lleakcanary/r$a$b;", "Lleakcanary/r$a$a;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
    public static abstract class a {

        /* compiled from: HeapAnalysisJob.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/r$a$a;", "Lleakcanary/r$a;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
        /* renamed from: leakcanary.r$a$a, reason: collision with other inner class name */
        public static final /* data */ class C11799a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f414118a;

            public C11799a(@Y61.k String str) {
                super(null);
                this.f414118a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this != obj) {
                    return (obj instanceof C11799a) && kotlin.jvm.internal.L.f(this.f414118a, ((C11799a) obj).f414118a);
                }
                return true;
            }

            public final int hashCode() {
                String str = this.f414118a;
                if (str != null) {
                    return str.hashCode();
                }
                return 0;
            }

            @Y61.k
            public final String toString() {
                return AK.c.s(new StringBuilder("Canceled(cancelReason="), this.f414118a, ")");
            }
        }

        /* compiled from: HeapAnalysisJob.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/r$a$b;", "Lleakcanary/r$a;", "leakcanary-android-release_release"}, k = 1, mv = {1, 4, 1})
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final B1 f414119a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Long f414120b;

            public /* synthetic */ b(B1 b12, Long l12, int i12, C42822w c42822w) {
                this(b12, (i12 & 2) != 0 ? null : l12);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.L.f(this.f414119a, bVar.f414119a) && kotlin.jvm.internal.L.f(this.f414120b, bVar.f414120b);
            }

            public final int hashCode() {
                B1 b12 = this.f414119a;
                int iHashCode = (b12 != null ? b12.hashCode() : 0) * 31;
                Long l12 = this.f414120b;
                return iHashCode + (l12 != null ? l12.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                return "Done(analysis=" + this.f414119a + ", stripHeapDumpDurationMillis=" + this.f414120b + ")";
            }

            public b(@Y61.k B1 b12, @Y61.l Long l12) {
                super(null);
                this.f414119a = b12;
                this.f414120b = l12;
            }
        }

        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }
}
