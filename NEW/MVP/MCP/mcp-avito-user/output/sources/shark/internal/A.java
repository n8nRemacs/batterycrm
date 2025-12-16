package shark.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import shark.C48240c2;
import shark.M1;
import shark.g3;
import shark.h3;
import shark.i3;

/* compiled from: ClassReferenceReader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lshark/internal/A;", "Lshark/internal/E0;", "Lshark/M1$b;", "shark"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class A implements E0<M1.b> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f438296a;

    public A(@Y61.k List list, @Y61.k C48240c2 c48240c2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = h3.a(list, c48240c2).iterator();
        while (it.hasNext()) {
            g3 g3Var = (g3) it.next();
            i3 f438839a = g3Var.getF438839a();
            if (f438839a instanceof i3.e) {
                i3.e eVar = (i3.e) f438839a;
                Map linkedHashMap2 = (Map) linkedHashMap.get(eVar.f438294b);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(eVar.f438294b, linkedHashMap2);
                }
                linkedHashMap2.put(eVar.f438295c, g3Var);
            }
        }
        this.f438296a = linkedHashMap;
    }

    @Override // shark.internal.E0
    public final InterfaceC43030m b(M1 m12) {
        M1.b bVar = (M1.b) m12;
        Map mapC = (Map) this.f438296a.get(bVar.g());
        if (mapC == null) {
            mapC = P0.c();
        }
        return C43033p.y(bVar.m(), new C48302z(mapC, bVar));
    }
}
