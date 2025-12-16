package shark;

import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okio.C44805o;

/* compiled from: HeapAnalysis.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/M2;", "Lshark/E2;", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* data */ class M2 extends E2 {
    private static final long serialVersionUID = 3943636164568681903L;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<LeakTrace> f438158b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i3 f438159c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f438160d;

    /* compiled from: HeapAnalysis.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/M2$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
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

    public M2(@Y61.k List<LeakTrace> list, @Y61.k i3 i3Var, @Y61.k String str) {
        super(null);
        this.f438158b = list;
        this.f438159c = i3Var;
        this.f438160d = str;
    }

    @Override // shark.E2
    @Y61.k
    public final List<LeakTrace> a() {
        return this.f438158b;
    }

    @Override // shark.E2
    @Y61.k
    public final String b() {
        String string = this.f438159c.toString();
        C44805o.f420139e.getClass();
        return C44805o.a.c(string).c("SHA-1").e();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2)) {
            return false;
        }
        M2 m22 = (M2) obj;
        return kotlin.jvm.internal.L.f(this.f438158b, m22.f438158b) && kotlin.jvm.internal.L.f(this.f438159c, m22.f438159c) && kotlin.jvm.internal.L.f(this.f438160d, m22.f438160d);
    }

    public final int hashCode() {
        List<LeakTrace> list = this.f438158b;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        i3 i3Var = this.f438159c;
        int iHashCode2 = (iHashCode + (i3Var != null ? i3Var.hashCode() : 0)) * 31;
        String str = this.f438160d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // shark.E2
    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Leak pattern: ");
        sb2.append(this.f438159c);
        sb2.append("\nDescription: ");
        sb2.append(this.f438160d);
        sb2.append('\n');
        return C22026a.c(sb2, super.toString(), '\n');
    }
}
