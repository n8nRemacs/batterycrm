package shark;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import shark.LeakTraceObject;
import shark.M1;
import shark.internal.AndroidReferenceReaders;
import shark.internal.ApacheHarmonyInstanceRefReaders;
import shark.internal.C48298v;
import shark.internal.D0;
import shark.internal.OpenJdkInstanceRefReaders;

/* compiled from: HeapAnalyzer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lshark/F1;", "", "a", "b", "c", "d", "e", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class F1 {

    /* renamed from: a, reason: collision with root package name */
    public final OnAnalysisProgressListener f438028a;

    /* compiled from: HeapAnalyzer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/F1$a;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C48240c2 f438029a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<g3> f438030b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f438031c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<R2> f438032d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final shark.internal.B f438033e;

        public a(@Y61.k C48240c2 c48240c2, @Y61.k List list, boolean z12, @Y61.k List list2, @Y61.k shark.internal.B b12) {
            this.f438029a = c48240c2;
            this.f438030b = list;
            this.f438031c = z12;
            this.f438032d = list2;
            this.f438033e = b12;
        }
    }

    /* compiled from: HeapAnalyzer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/F1$b;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final M1 f438034a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LeakTraceObject.LeakingStatus f438035b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f438036c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LinkedHashSet f438037d;

        public b(@Y61.k M1 m12, @Y61.k LeakTraceObject.LeakingStatus leakingStatus, @Y61.k String str, @Y61.k LinkedHashSet linkedHashSet) {
            this.f438034a = m12;
            this.f438035b = leakingStatus;
            this.f438036c = str;
            this.f438037d = linkedHashSet;
        }
    }

    /* compiled from: HeapAnalyzer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/F1$c;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class c {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "LeaksAndUnreachableObjects(applicationLeaks=" + ((Object) null) + ", libraryLeaks=" + ((Object) null) + ", unreachableObjects=" + ((Object) null) + ")";
        }
    }

    /* compiled from: HeapAnalyzer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/F1$d;", "", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f438038a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final D0.b f438039b;

        public d(@Y61.k D0.b bVar, @Y61.k ArrayList arrayList) {
            this.f438039b = bVar;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                D0.a aVar = (D0.a) it.next();
                arrayList2.add(new kotlin.Q(aVar, aVar.f438344c.a()));
            }
            this.f438038a = arrayList2;
        }
    }

    /* compiled from: HeapAnalyzer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lshark/F1$e;", "", "<init>", "()V", "a", "b", "Lshark/F1$e$b;", "Lshark/F1$e$a;", "shark"}, k = 1, mv = {1, 4, 1})
    public static abstract class e {

        /* compiled from: HeapAnalyzer.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/F1$e$a;", "Lshark/F1$e;", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class a extends e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final shark.internal.D0 f438040a;

            public a(@Y61.k shark.internal.D0 d02) {
                super(null);
                this.f438040a = d02;
            }
        }

        /* compiled from: HeapAnalyzer.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/F1$e$b;", "Lshark/F1$e;", "shark"}, k = 1, mv = {1, 4, 1})
        public static final class b extends e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final LinkedHashMap f438041a;

            /* renamed from: b, reason: collision with root package name */
            public final long f438042b;

            public b(long j12) {
                super(null);
                this.f438042b = j12;
                this.f438041a = new LinkedHashMap();
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ParentNode(objectId=");
                sb2.append(this.f438042b);
                sb2.append(", children=");
                return org.webrtc.h.e(sb2, this.f438041a, ')');
            }
        }

        public e() {
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }
    }

    public F1(@Y61.k OnAnalysisProgressListener onAnalysisProgressListener) {
        this.f438028a = onAnalysisProgressListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList c(LinkedHashMap linkedHashMap, List list) {
        List<b> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (b bVar : list2) {
            M1 m12 = bVar.f438034a;
            String strE = e(m12);
            LeakTraceObject.ObjectType objectType = m12 instanceof M1.b ? LeakTraceObject.ObjectType.f438128b : ((m12 instanceof M1.d) || (m12 instanceof M1.e)) ? LeakTraceObject.ObjectType.f438129c : LeakTraceObject.ObjectType.f438130d;
            Integer num = null;
            kotlin.Q q12 = linkedHashMap != null ? (kotlin.Q) linkedHashMap.get(Long.valueOf(bVar.f438034a.getF438157e())) : null;
            Integer num2 = q12 != null ? (Integer) q12.f406619b : null;
            if (q12 != null) {
                num = (Integer) q12.f406620c;
            }
            arrayList.add(new LeakTraceObject(objectType, strE, bVar.f438037d, bVar.f438035b, bVar.f438036c, num2, num));
        }
        return arrayList;
    }

    public static void d(e.b bVar, ArrayList arrayList) {
        for (e eVar : bVar.f438041a.values()) {
            if (eVar instanceof e.b) {
                d((e.b) eVar, arrayList);
            } else if (eVar instanceof e.a) {
                arrayList.add(((e.a) eVar).f438040a);
            }
        }
    }

    public static String e(M1 m12) {
        if (m12 instanceof M1.b) {
            return ((M1.b) m12).g();
        }
        if (m12 instanceof M1.c) {
            return ((M1.c) m12).f();
        }
        if (m12 instanceof M1.d) {
            return ((M1.d) m12).e();
        }
        if (m12 instanceof M1.e) {
            return ((M1.e) m12).e();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static kotlin.Q f(U2 u22, boolean z12) {
        String strR;
        LeakTraceObject.LeakingStatus leakingStatus = LeakTraceObject.LeakingStatus.f438126d;
        boolean zIsEmpty = u22.f438217c.isEmpty();
        LeakTraceObject.LeakingStatus leakingStatus2 = LeakTraceObject.LeakingStatus.f438124b;
        if (zIsEmpty) {
            strR = "";
        } else {
            strR = C42745f0.O(u22.f438217c, " and ", null, null, null, 62);
            leakingStatus = leakingStatus2;
        }
        LinkedHashSet linkedHashSet = u22.f438216b;
        if (!linkedHashSet.isEmpty()) {
            String strO = C42745f0.O(linkedHashSet, " and ", null, null, null, 62);
            LeakTraceObject.LeakingStatus leakingStatus3 = LeakTraceObject.LeakingStatus.f438125c;
            if (leakingStatus != leakingStatus2) {
                strR = strO;
            } else if (z12) {
                strR = androidx.appcompat.app.r.r(strO, ". Conflicts with ", strR);
            } else {
                strR = androidx.appcompat.app.r.r(strR, ". Conflicts with ", strO);
            }
            leakingStatus = leakingStatus3;
        }
        return new kotlin.Q(leakingStatus, strR);
    }

    public static void g(shark.internal.D0 d02, ArrayList arrayList, int i12, e.b bVar) {
        long jLongValue = ((Number) arrayList.get(i12)).longValue();
        int size = arrayList.size() - 1;
        LinkedHashMap linkedHashMap = bVar.f438041a;
        if (i12 == size) {
            linkedHashMap.put(Long.valueOf(jLongValue), new e.a(d02));
            return;
        }
        Object bVar2 = (e) linkedHashMap.get(Long.valueOf(jLongValue));
        if (bVar2 == null) {
            bVar2 = new e.b(jLongValue);
            linkedHashMap.put(Long.valueOf(jLongValue), bVar2);
        }
        if (bVar2 instanceof e.b) {
            g(d02, arrayList, i12 + 1, (e.b) bVar2);
        }
    }

    @Y61.k
    public final B1 a(@Y61.k File file, @Y61.k C48240c2 c48240c2, @Y61.k L2 l22, @Y61.k List list, boolean z12, @Y61.k List list2, @Y61.k O2 o22) {
        B1 c12;
        long jNanoTime = System.nanoTime();
        shark.internal.A a12 = new shark.internal.A(list, c48240c2);
        List listSingletonList = Collections.singletonList(new shark.internal.q0(list, c48240c2));
        OpenJdkInstanceRefReaders[] openJdkInstanceRefReadersArrValues = OpenJdkInstanceRefReaders.values();
        ArrayList arrayList = new ArrayList();
        for (OpenJdkInstanceRefReaders openJdkInstanceRefReaders : openJdkInstanceRefReadersArrValues) {
            C48298v.a aVarA = openJdkInstanceRefReaders.a(c48240c2);
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        ArrayList arrayListH0 = C42745f0.h0(arrayList, listSingletonList);
        ApacheHarmonyInstanceRefReaders[] apacheHarmonyInstanceRefReadersArrValues = ApacheHarmonyInstanceRefReaders.values();
        ArrayList arrayList2 = new ArrayList();
        for (ApacheHarmonyInstanceRefReaders apacheHarmonyInstanceRefReaders : apacheHarmonyInstanceRefReadersArrValues) {
            C48298v.a aVarA2 = apacheHarmonyInstanceRefReaders.a(c48240c2);
            if (aVarA2 != null) {
                arrayList2.add(aVarA2);
            }
        }
        ArrayList arrayListH02 = C42745f0.h0(arrayList2, arrayListH0);
        AndroidReferenceReaders[] androidReferenceReadersArrValues = AndroidReferenceReaders.values();
        ArrayList arrayList3 = new ArrayList();
        for (AndroidReferenceReaders androidReferenceReaders : androidReferenceReadersArrValues) {
            C48298v.a aVarA3 = androidReferenceReaders.a(c48240c2);
            if (aVarA3 != null) {
                arrayList3.add(aVarA3);
            }
        }
        shark.internal.B b12 = new shark.internal.B(a12, new C48298v(C42745f0.h0(arrayList3, arrayListH02), new shark.internal.I(list, c48240c2)), new shark.internal.t0());
        long jNanoTime2 = System.nanoTime();
        try {
            c12 = b(new a(c48240c2, list, z12, list2, b12), o22, l22, file, jNanoTime2);
        } catch (Throwable th2) {
            c12 = new C1(file, System.currentTimeMillis(), 0L, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime2), new HeapAnalysisException(th2), 4, null);
        }
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        if (c12 instanceof E1) {
            return E1.d((E1) c12, 0L, millis, null, 247);
        }
        if (c12 instanceof C1) {
            return C1.d((C1) c12, 0L, millis, 23);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x043e, code lost:
    
        r24 = r4;
        r25 = r15;
        r15 = r21;
        r21 = r2;
        r2 = new java.util.ArrayList(kotlin.collections.C42745f0.q(r6, 10));
        r4 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0459, code lost:
    
        if (r4.hasNext() == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x045b, code lost:
    
        r9 = e(((shark.U2) r4.next()).f438218d);
        r22 = r4;
        r13 = kotlin.text.C43066x.M('.', 0, 6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0472, code lost:
    
        if (r13 != (-1)) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0475, code lost:
    
        r9 = r9.substring(r13 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x047b, code lost:
    
        r2.add(r9);
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0481, code lost:
    
        r4 = r10.f406840b;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0486, code lost:
    
        if (r9 >= r4) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0488, code lost:
    
        r14 = (kotlin.Q) r12.get(r9);
        r22 = r4;
        r4 = (shark.LeakTraceObject.LeakingStatus) r14.f406619b;
        r14 = (java.lang.String) r14.f406620c;
        r23 = r9 + 1;
        r0 = kotlin.sequences.C43033p.u(new shark.H1(r10), java.lang.Integer.valueOf(r23)).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04af, code lost:
    
        if (r0.hasNext() == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04b1, code lost:
    
        r1 = (java.lang.Number) r0.next();
        r26 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04c7, code lost:
    
        if (((shark.LeakTraceObject.LeakingStatus) ((kotlin.Q) r12.get(r1.intValue())).f406619b) != r7) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04c9, code lost:
    
        r0 = (java.lang.String) r2.get(r1.intValue());
        r1 = r4.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04d7, code lost:
    
        if (r1 == 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04da, code lost:
    
        if (r1 == 1) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04dd, code lost:
    
        if (r1 != 2) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04df, code lost:
    
        r1 = new kotlin.Q(r7, androidx.appcompat.app.r.q(r0, "↓ is not leaking"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04f0, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04f1, code lost:
    
        r1 = new kotlin.Q(r7, androidx.appcompat.app.r.r(r0, "↓ is not leaking. Conflicts with ", r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04fd, code lost:
    
        r1 = new kotlin.Q(r7, androidx.appcompat.app.r.r(r0, "↓ is not leaking and ", r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0508, code lost:
    
        r12.set(r9, r1);
        r4 = r22;
        r9 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0515, code lost:
    
        r0 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x051d, code lost:
    
        throw new java.util.NoSuchElementException("Sequence contains no element matching the predicate.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x051e, code lost:
    
        r0 = r11.f406840b;
        r8 = r8 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0522, code lost:
    
        if (r0 >= r8) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0524, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0526, code lost:
    
        if (r8 < r0) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0528, code lost:
    
        r1 = (kotlin.Q) r12.get(r8);
        r4 = (shark.LeakTraceObject.LeakingStatus) r1.f406619b;
        r1 = (java.lang.String) r1.f406620c;
        r7 = kotlin.sequences.C43033p.u(new shark.I1(r11), java.lang.Integer.valueOf(r8 - 1)).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x054d, code lost:
    
        if (r7.hasNext() == false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x054f, code lost:
    
        r9 = (java.lang.Number) r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0563, code lost:
    
        if (((shark.LeakTraceObject.LeakingStatus) ((kotlin.Q) r12.get(r9.intValue())).f406619b) != r15) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0565, code lost:
    
        r7 = (java.lang.String) r2.get(r9.intValue());
        r4 = r4.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0573, code lost:
    
        if (r4 == 0) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0576, code lost:
    
        if (r4 == 1) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0579, code lost:
    
        if (r4 != 2) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x057b, code lost:
    
        r4 = new kotlin.Q(r15, androidx.appcompat.app.r.q(r7, "↑ is leaking"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x058c, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x058d, code lost:
    
        r4 = new kotlin.Q(r15, androidx.appcompat.app.r.r(r7, "↑ is leaking and ", r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0598, code lost:
    
        r12.set(r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x059b, code lost:
    
        if (r8 == r0) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x059d, code lost:
    
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x05a7, code lost:
    
        throw new java.lang.IllegalStateException("Should never happen");
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x05ad, code lost:
    
        throw new java.util.NoSuchElementException("Sequence contains no element matching the predicate.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x05ae, code lost:
    
        r0 = new java.util.ArrayList(kotlin.collections.C42745f0.q(r6, 10));
        r1 = r6.iterator();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05c2, code lost:
    
        if (r1.hasNext() == false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x05c4, code lost:
    
        r4 = r1.next();
        r6 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x05ca, code lost:
    
        if (r2 < 0) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x05cc, code lost:
    
        r4 = (shark.U2) r4;
        r2 = (kotlin.Q) r12.get(r2);
        r0.add(new shark.F1.b(r4.f438218d, (shark.LeakTraceObject.LeakingStatus) r2.f406619b, (java.lang.String) r2.f406620c, r4.f438215a));
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x05ea, code lost:
    
        kotlin.collections.C42745f0.H0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x05ee, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x05ef, code lost:
    
        r5.add(r0);
        r2 = r21;
        r4 = r24;
        r21 = r15;
        r15 = r25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0427  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final shark.E1 b(shark.F1.a r28, shark.O2 r29, shark.L2 r30, java.io.File r31, long r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.F1.b(shark.F1$a, shark.O2, shark.L2, java.io.File, long):shark.E1");
    }
}
