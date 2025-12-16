package shark;

import com.yandex.div2.D8;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: HeapAnalysis.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/E1;", "Lshark/B1;", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final /* data */ class E1 extends B1 {
    private static final long serialVersionUID = 130453013437459642L;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final File f438018b;

    /* renamed from: c, reason: collision with root package name */
    public final long f438019c;

    /* renamed from: d, reason: collision with root package name */
    public final long f438020d;

    /* renamed from: e, reason: collision with root package name */
    public final long f438021e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f438022f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<C48333q1> f438023g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<M2> f438024h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<LeakTraceObject> f438025i;

    /* compiled from: HeapAnalysis.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lshark/E1$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "shark"}, k = 1, mv = {1, 4, 1})
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

    public /* synthetic */ E1(File file, long j12, long j13, long j14, Map map, List list, List list2, List list3, int i12, C42822w c42822w) {
        this(file, j12, (i12 & 4) != 0 ? -1L : j13, j14, map, list, list2, list3);
    }

    public static E1 d(E1 e12, long j12, long j13, LinkedHashMap linkedHashMap, int i12) {
        File file = e12.f438018b;
        long j14 = e12.f438019c;
        long j15 = (i12 & 4) != 0 ? e12.f438020d : j12;
        long j16 = (i12 & 8) != 0 ? e12.f438021e : j13;
        Map<String, String> map = (i12 & 16) != 0 ? e12.f438022f : linkedHashMap;
        List<C48333q1> list = e12.f438023g;
        List<M2> list2 = e12.f438024h;
        List<LeakTraceObject> list3 = e12.f438025i;
        e12.getClass();
        return new E1(file, j14, j15, j16, map, list, list2, list3);
    }

    @Override // shark.B1
    /* renamed from: a, reason: from getter */
    public final long getF438021e() {
        return this.f438021e;
    }

    @Override // shark.B1
    /* renamed from: b, reason: from getter */
    public final long getF438020d() {
        return this.f438020d;
    }

    @Override // shark.B1
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final File getF438018b() {
        return this.f438018b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E1)) {
            return false;
        }
        E1 e12 = (E1) obj;
        return kotlin.jvm.internal.L.f(this.f438018b, e12.f438018b) && this.f438019c == e12.f438019c && this.f438020d == e12.f438020d && this.f438021e == e12.f438021e && kotlin.jvm.internal.L.f(this.f438022f, e12.f438022f) && kotlin.jvm.internal.L.f(this.f438023g, e12.f438023g) && kotlin.jvm.internal.L.f(this.f438024h, e12.f438024h) && kotlin.jvm.internal.L.f(this.f438025i, e12.f438025i);
    }

    public final int hashCode() {
        File file = this.f438018b;
        int iHashCode = file != null ? file.hashCode() : 0;
        long j12 = this.f438019c;
        int i12 = ((iHashCode * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f438020d;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f438021e;
        int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        Map<String, String> map = this.f438022f;
        int iHashCode2 = (i14 + (map != null ? map.hashCode() : 0)) * 31;
        List<C48333q1> list = this.f438023g;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<M2> list2 = this.f438024h;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<LeakTraceObject> list3 = this.f438025i;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("====================================\nHEAP ANALYSIS RESULT\n====================================\n");
        List<C48333q1> list = this.f438023g;
        D8.r(list, sb2, " APPLICATION LEAKS\n\nReferences underlined with \"~~~\" are likely causes.\nLearn more at https://squ.re/leaks.\n");
        String string = "";
        sb2.append(!list.isEmpty() ? AK.c.s(new StringBuilder("\n"), C42745f0.O(list, "\n\n", null, null, null, 62), "\n") : "");
        sb2.append("====================================\n");
        List<M2> list2 = this.f438024h;
        D8.r(list2, sb2, " LIBRARY LEAKS\n\nA Library Leak is a leak caused by a known bug in 3rd party code that you do not have control over.\nSee https://square.github.io/leakcanary/fundamentals-how-leakcanary-works/#4-categorizing-leaks\n");
        sb2.append(!list2.isEmpty() ? AK.c.s(new StringBuilder("\n"), C42745f0.O(list2, "\n\n", null, null, null, 62), "\n") : "");
        sb2.append("====================================\n");
        List<LeakTraceObject> list3 = this.f438025i;
        D8.r(list3, sb2, " UNREACHABLE OBJECTS\n\nAn unreachable object is still in memory but LeakCanary could not find a strong reference path\nfrom GC roots.\n");
        sb2.append(!list3.isEmpty() ? AK.c.s(new StringBuilder("\n"), C42745f0.O(list3, "\n\n", null, null, null, 62), "\n") : "");
        sb2.append("====================================\nMETADATA\n\nPlease include this in bug reports and Stack Overflow questions.\n");
        Map<String, String> map = this.f438022f;
        if (!map.isEmpty()) {
            StringBuilder sb3 = new StringBuilder("\n");
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(entry.getKey() + ": " + entry.getValue());
            }
            sb3.append(C42745f0.O(arrayList, "\n", null, null, null, 62));
            string = sb3.toString();
        }
        sb2.append(string);
        sb2.append("\nAnalysis duration: ");
        sb2.append(this.f438021e);
        sb2.append(" ms\nHeap dump file path: ");
        sb2.append(this.f438018b.getAbsolutePath());
        sb2.append("\nHeap dump timestamp: ");
        sb2.append(this.f438019c);
        sb2.append("\nHeap dump duration: ");
        long j12 = this.f438020d;
        return AK.c.s(sb2, j12 != -1 ? j12 + " ms" : "Unknown", "\n====================================");
    }

    public E1(@Y61.k File file, long j12, long j13, long j14, @Y61.k Map<String, String> map, @Y61.k List<C48333q1> list, @Y61.k List<M2> list2, @Y61.k List<LeakTraceObject> list3) {
        super(null);
        this.f438018b = file;
        this.f438019c = j12;
        this.f438020d = j13;
        this.f438021e = j14;
        this.f438022f = map;
        this.f438023g = list;
        this.f438024h = list2;
        this.f438025i = list3;
    }
}
