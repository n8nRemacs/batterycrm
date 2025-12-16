package shark;

import java.util.EnumSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import shark.AbstractC48345t2;

/* compiled from: StreamingRecordReaderAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/l3;", "", "a", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class l3 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f438650b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final k3 f438651a;

    /* compiled from: StreamingRecordReaderAdapter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/l3$a;", "", "<init>", "()V", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public l3(@Y61.k k3 k3Var) {
        this.f438651a = k3Var;
    }

    public final void a(@Y61.k Set set, @Y61.k X2 x22) {
        EnumSet enumSetAllOf;
        f438650b.getClass();
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        if (set.contains(n0Var.b(AbstractC48345t2.class))) {
            enumSetAllOf = EnumSet.allOf(HprofRecordTag.class);
        } else {
            EnumSet enumSetNoneOf = EnumSet.noneOf(HprofRecordTag.class);
            if (set.contains(n0Var.b(AbstractC48345t2.f.class))) {
                enumSetNoneOf.add(HprofRecordTag.f438056b);
            }
            if (set.contains(n0Var.b(AbstractC48345t2.c.class))) {
                enumSetNoneOf.add(HprofRecordTag.f438057c);
            }
            if (set.contains(n0Var.b(AbstractC48345t2.a.class))) {
                enumSetNoneOf.add(HprofRecordTag.f438060f);
            }
            if (set.contains(n0Var.b(AbstractC48345t2.d.class))) {
                enumSetNoneOf.add(HprofRecordTag.f438058d);
            }
            if (set.contains(n0Var.b(AbstractC48345t2.e.class))) {
                enumSetNoneOf.add(HprofRecordTag.f438059e);
            }
            if (set.contains(n0Var.b(AbstractC48345t2.b.C12635b.class))) {
                enumSetNoneOf.add(HprofRecordTag.f438070p);
            }
            boolean zContains = set.contains(n0Var.b(AbstractC48345t2.b.class));
            if (zContains || set.contains(n0Var.b(AbstractC48345t2.b.a.class))) {
                HprofRecordTag.f438055E.getClass();
                enumSetNoneOf.addAll(HprofRecordTag.f438054D);
            }
            boolean z12 = zContains || set.contains(n0Var.b(AbstractC48345t2.b.c.class));
            if (z12 || set.contains(n0Var.b(AbstractC48345t2.b.c.a.class))) {
                enumSetNoneOf.add(HprofRecordTag.f438079y);
            }
            if (z12 || set.contains(n0Var.b(AbstractC48345t2.b.c.C12638b.class))) {
                enumSetNoneOf.add(HprofRecordTag.f438080z);
            }
            if (z12 || set.contains(n0Var.b(AbstractC48345t2.b.c.C12639c.class))) {
                enumSetNoneOf.add(HprofRecordTag.f438051A);
            }
            if (z12 || set.contains(n0Var.b(AbstractC48345t2.b.c.d.class))) {
                enumSetNoneOf.add(HprofRecordTag.f438052B);
            }
            enumSetAllOf = enumSetNoneOf;
        }
        this.f438651a.a(enumSetAllOf, new n3(x22));
    }
}
