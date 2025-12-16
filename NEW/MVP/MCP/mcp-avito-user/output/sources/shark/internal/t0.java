package shark.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import okhttp3.HttpUrl;
import shark.AbstractC48345t2;
import shark.M1;

/* compiled from: ObjectArrayReferenceReader.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lshark/internal/t0;", "Lshark/internal/E0;", "Lshark/M1$d;", "<init>", "()V", "a", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class t0 implements E0<M1.d> {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f438606a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f438607b = new a(null);

    /* compiled from: ObjectArrayReferenceReader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lshark/internal/t0$a;", "", "<init>", "()V", "", "", "skippablePrimitiveWrapperArrayTypes", "Ljava/util/List;", "shark"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        Class cls = Boolean.TYPE;
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        Set setL0 = C42756l.l0(new kotlin.reflect.d[]{n0Var.b(cls), n0Var.b(Character.TYPE), n0Var.b(Float.TYPE), n0Var.b(Double.TYPE), n0Var.b(Byte.TYPE), n0Var.b(Short.TYPE), n0Var.b(Integer.TYPE), n0Var.b(Long.TYPE)});
        ArrayList arrayList = new ArrayList(C42745f0.q(setL0, 10));
        Iterator it = setL0.iterator();
        while (it.hasNext()) {
            arrayList.add(X41.b.b((kotlin.reflect.d) it.next()).getName().concat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
        }
        f438606a = arrayList;
    }

    @Override // shark.internal.E0
    public final InterfaceC43030m b(M1 m12) {
        M1.d dVar = (M1.d) m12;
        f438607b.getClass();
        if (f438606a.contains(dVar.e())) {
            return C43033p.h();
        }
        AbstractC48345t2.b.c.C12639c c12639cD = dVar.d();
        long j12 = dVar.f438153d.f438477b;
        long[] jArr = c12639cD.f438732d;
        return new kotlin.sequences.n0(C43033p.i(jArr.length == 0 ? C43033p.h() : new kotlin.collections.K(jArr), new u0(dVar.f438152c)), new w0(j12));
    }
}
