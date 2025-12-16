package shark.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.collections.b1;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import shark.A1;
import shark.AbstractC48368z1;
import shark.C48240c2;
import shark.C48369z2;
import shark.K1;
import shark.M1;
import shark.g3;
import shark.h3;
import shark.i3;
import shark.internal.C48298v;

/* compiled from: JavaLocalReferenceReader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/q0;", "Lshark/internal/v$a;", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class q0 implements C48298v.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f438584a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f438585b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C48240c2 f438586c;

    public q0(@Y61.k List list, @Y61.k C48240c2 c48240c2) {
        this.f438586c = c48240c2;
        M1.b bVarC = c48240c2.c(Thread.class.getName());
        this.f438584a = bVarC != null ? b1.h(Collections.singleton(Long.valueOf(bVarC.f438147e)), C43033p.F(new kotlin.sequences.o0(bVarC.h(), p0.f438582l))) : kotlin.collections.B0.f406639b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = h3.a(list, c48240c2).iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            i3 f438839a = g3Var.getF438839a();
            if (f438839a instanceof i3.c) {
                linkedHashMap.put(((i3.c) f438839a).f438292b, g3Var);
            }
        }
        this.f438585b = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    @Override // shark.internal.C48298v.a
    public final boolean a(@Y61.k M1.c cVar) {
        if (this.f438584a.contains(Long.valueOf(cVar.f438150d.f438474b))) {
            L0 l02 = L0.f438390a;
            C48240c2 c48240c2 = this.f438586c;
            l02.getClass();
            if (((AbstractC48368z1.m) ((Map) c48240c2.f438253b.a(L0.class.getName(), new K0(c48240c2))).get(Long.valueOf(cVar.f438151e))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // shark.internal.E0
    public final InterfaceC43030m b(M1 m12) {
        String strI;
        M1.c cVar = (M1.c) m12;
        kotlin.reflect.d dVarB = kotlin.jvm.internal.m0.f406844a.b(Thread.class);
        cVar.getClass();
        K1 k1J = cVar.j(((InterfaceC42819t) dVarB).f().getName(), "name");
        g3 g3Var = (k1J == null || (strI = k1J.f438095c.i()) == null) ? null : (g3) this.f438585b.get(strI);
        if (g3Var instanceof C48369z2) {
            return C43033p.h();
        }
        long j12 = cVar.f438150d.f438474b;
        C48290m0.f438574a.getClass();
        L0 l02 = L0.f438390a;
        C48240c2 c48240c2 = this.f438586c;
        l02.getClass();
        String name = L0.class.getName();
        K0 k02 = new K0(c48240c2);
        A1 a12 = c48240c2.f438253b;
        AbstractC48368z1.m mVar = (AbstractC48368z1.m) ((Map) a12.a(name, k02)).get(Long.valueOf(cVar.f438151e));
        List list = mVar != null ? (List) ((Map) a12.a(C48290m0.class.getName(), new C48288l0(c48240c2))).get(Integer.valueOf(mVar.f438834b)) : null;
        return list != null ? new kotlin.sequences.o0(new C42770s0(list), new o0(j12, g3Var)) : C43033p.h();
    }
}
