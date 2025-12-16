package shark;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: HeapAnalysis.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lshark/E2;", "Ljava/io/Serializable;", "<init>", "()V", "a", "Lshark/M2;", "Lshark/q1;", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class E2 implements Serializable {
    private static final long serialVersionUID = -2287572510360910916L;

    /* compiled from: HeapAnalysis.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/E2$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
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

    public E2() {
    }

    @Y61.k
    public abstract List<LeakTrace> a();

    @Y61.k
    public abstract String b();

    @Y61.l
    public final Integer c() {
        if (((LeakTrace) C42745f0.E(a())).a() == null) {
            return null;
        }
        Iterator<T> it = a().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Integer numA = ((LeakTrace) it.next()).a();
            if (numA == null) {
                kotlin.jvm.internal.L.k();
                throw null;
            }
            iIntValue += numA.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @Y61.k
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (c() != null) {
            str = c() + " bytes retained by leaking objects\n";
        } else {
            str = "";
        }
        sb2.append(str);
        if (a().size() > 1) {
            str2 = "Displaying only 1 leak trace out of " + a().size() + " with the same signature\n";
        }
        sb2.append(str2);
        sb2.append("Signature: ");
        sb2.append(b());
        sb2.append('\n');
        sb2.append((LeakTrace) C42745f0.E(a()));
        return sb2.toString();
    }

    public /* synthetic */ E2(C42822w c42822w) {
        this();
    }
}
