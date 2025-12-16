package shark;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.sequences.C43033p;

/* compiled from: FilteringLeakingObjectFinder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/w1;", "Lshark/L2;", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.w1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48356w1 implements L2 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f438797a;

    /* compiled from: FilteringLeakingObjectFinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/w1$a;", "", "shark"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.w1$a */
    public interface a {
        boolean a(@Y61.k M1 m12);
    }

    public C48356w1(@Y61.k ArrayList arrayList) {
        this.f438797a = arrayList;
    }

    @Override // shark.L2
    @Y61.k
    public final Set a(@Y61.k C48240c2 c48240c2) {
        return C43033p.F(new kotlin.sequences.o0(C43033p.i(c48240c2.j(), new C48360x1(this)), C48364y1.f438807l));
    }
}
