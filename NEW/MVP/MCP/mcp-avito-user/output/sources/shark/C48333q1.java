package shark;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: HeapAnalysis.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/q1;", "Lshark/E2;", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.q1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* data */ class C48333q1 extends E2 {
    private static final long serialVersionUID = 524928276700576863L;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<LeakTrace> f438679b;

    /* compiled from: HeapAnalysis.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/q1$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.q1$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        new a(null);
    }

    public C48333q1(@Y61.k List<LeakTrace> list) {
        super(null);
        this.f438679b = list;
    }

    @Override // shark.E2
    @Y61.k
    public final List<LeakTrace> a() {
        return this.f438679b;
    }

    @Override // shark.E2
    @Y61.k
    public final String b() {
        return ((LeakTrace) C42745f0.E(this.f438679b)).c();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C48333q1) {
            return kotlin.jvm.internal.L.f(this.f438679b, ((C48333q1) obj).f438679b);
        }
        return false;
    }

    public final int hashCode() {
        List<LeakTrace> list = this.f438679b;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
