package kotlin.sequences;

import androidx.core.view.C22829k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.InterfaceC42730b;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.text.C43066x;

@Metadata(d1 = {"kotlin/sequences/r", "kotlin/sequences/s", "kotlin/sequences/D", "kotlin/sequences/F", "kotlin/sequences/j0"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* renamed from: kotlin.sequences.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43033p extends j0 {
    @Y61.k
    public static C43026i A(@Y61.k InterfaceC43030m interfaceC43030m, @Y61.k InterfaceC43030m interfaceC43030m2) {
        return D.a(C42756l.f(new InterfaceC43030m[]{interfaceC43030m, interfaceC43030m2}), C43039w.f410563l);
    }

    @Y61.k
    public static C43026i B(@Y61.k o0 o0Var, Object obj) {
        return D.a(C42756l.f(new InterfaceC43030m[]{o0Var, C42756l.f(new Object[]{obj})}), C43039w.f410563l);
    }

    @Y61.k
    public static InterfaceC43030m C(@Y61.k InterfaceC43030m interfaceC43030m, int i12) {
        if (i12 >= 0) {
            return i12 == 0 ? C43024g.f410502a : interfaceC43030m instanceof InterfaceC43022e ? ((InterfaceC43022e) interfaceC43030m).a(i12) : new l0(interfaceC43030m, i12);
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested element count ", " is less than zero.").toString());
    }

    @Y61.k
    public static List D(@Y61.k InterfaceC43030m interfaceC43030m) {
        Iterator it = interfaceC43030m.iterator();
        if (!it.hasNext()) {
            return C42784z0.f406748b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Y61.k
    public static ArrayList E(@Y61.k InterfaceC43030m interfaceC43030m) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC43030m.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Y61.k
    public static Set F(@Y61.k InterfaceC43030m interfaceC43030m) {
        Iterator it = interfaceC43030m.iterator();
        if (!it.hasNext()) {
            return B0.f406639b;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singleton(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    @Y61.k
    public static C43029l G(@Y61.k C22829k0 c22829k0, @Y61.k InterfaceC43030m interfaceC43030m) {
        return new C43029l(c22829k0, interfaceC43030m, g0.f410503l);
    }

    @Y61.k
    public static C43018a b(@Y61.k Iterator it) {
        return new C43018a(new C43037u(it));
    }

    public static boolean c(@Y61.k InterfaceC43030m interfaceC43030m, Object obj) {
        Iterator it = interfaceC43030m.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            Object next = it.next();
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (kotlin.jvm.internal.L.f(obj, next)) {
                break;
            }
            i12++;
        }
        return i12 >= 0;
    }

    public static int d(@Y61.k InterfaceC43030m interfaceC43030m) {
        Iterator it = interfaceC43030m.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            it.next();
            i12++;
            if (i12 < 0) {
                C42745f0.G0();
                throw null;
            }
        }
        return i12;
    }

    @Y61.k
    public static C43020c e(@Y61.k C43025h c43025h) {
        return new C43020c(c43025h, H.f410480l);
    }

    @Y61.k
    public static InterfaceC43030m f(@Y61.k InterfaceC43030m interfaceC43030m, int i12) {
        if (i12 >= 0) {
            return i12 == 0 ? interfaceC43030m : interfaceC43030m instanceof InterfaceC43022e ? ((InterfaceC43022e) interfaceC43030m).drop(i12) : new C43021d(interfaceC43030m, i12);
        }
        throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Requested element count ", " is less than zero.").toString());
    }

    public static Object g(@Y61.k InterfaceC43030m interfaceC43030m, int i12) {
        I i13 = new I(i12);
        if (i12 < 0) {
            i13.invoke(Integer.valueOf(i12));
            throw null;
        }
        int i14 = 0;
        for (Object obj : interfaceC43030m) {
            int i15 = i14 + 1;
            if (i12 == i14) {
                return obj;
            }
            i14 = i15;
        }
        i13.invoke(Integer.valueOf(i12));
        throw null;
    }

    @Y61.k
    public static InterfaceC43030m h() {
        return C43024g.f410502a;
    }

    @Y61.k
    public static C43025h i(@Y61.k InterfaceC43030m interfaceC43030m, @Y61.k Y41.l lVar) {
        return new C43025h(interfaceC43030m, true, lVar);
    }

    @Y61.k
    public static o0 j(@Y61.k InterfaceC43030m interfaceC43030m, @Y61.k Y41.p pVar) {
        return new o0(new C43025h(new C43028k(interfaceC43030m), true, new J(pVar)), K.f410483l);
    }

    @Y61.k
    public static C43025h k(@Y61.k C42770s0 c42770s0, @Y61.k Class cls) {
        return i(c42770s0, new E(cls));
    }

    @Y61.k
    public static C43025h l(@Y61.k InterfaceC43030m interfaceC43030m, @Y61.k Y41.l lVar) {
        return new C43025h(interfaceC43030m, false, lVar);
    }

    @Y61.k
    public static C43025h m(@Y61.k InterfaceC43030m interfaceC43030m) {
        return l(interfaceC43030m, M.f410484l);
    }

    @Y61.l
    public static Object n(@Y61.k InterfaceC43030m interfaceC43030m) {
        Iterator it = interfaceC43030m.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @Y61.k
    public static C43026i o(@Y61.k InterfaceC43030m interfaceC43030m, @Y61.k Y41.l lVar) {
        return new C43026i(interfaceC43030m, lVar, O.f410486b);
    }

    @InterfaceC42733c0
    @kotlin.P
    @X41.i
    @Y61.k
    public static C43026i p(@Y61.k InterfaceC43030m interfaceC43030m, @Y61.k Y41.l lVar) {
        return new C43026i(interfaceC43030m, lVar, N.f410485b);
    }

    @Y61.k
    public static C43026i q(@Y61.k InterfaceC43030m interfaceC43030m) {
        return D.a(interfaceC43030m, C43039w.f410563l);
    }

    @X41.i
    @Y61.k
    public static C43026i r(@Y61.k InterfaceC43030m interfaceC43030m) {
        return D.a(interfaceC43030m, C43040x.f410564l);
    }

    @Y61.k
    public static C43018a s(@Y61.k Y41.a aVar) {
        return new C43018a(new C43027j(aVar, new C43042z(aVar)));
    }

    @Y61.k
    public static InterfaceC43030m t(@Y61.k Y41.a aVar, @Y61.k Y41.l lVar) {
        return new C43027j(aVar, lVar);
    }

    @kotlin.internal.h
    @Y61.k
    public static InterfaceC43030m u(@Y61.k Y41.l lVar, @Y61.l Object obj) {
        return obj == null ? C43024g.f410502a : new C43027j(new A(obj), lVar);
    }

    @InterfaceC42733c0
    @Y61.k
    public static Iterator v(@InterfaceC42730b @Y61.k Y41.p pVar) {
        C43031n c43031n = new C43031n();
        c43031n.f410551e = IntrinsicsKt.createCoroutineUnintercepted(pVar, c43031n, c43031n);
        return c43031n;
    }

    public static String w(InterfaceC43030m interfaceC43030m, String str, Y41.l lVar, int i12) throws IOException {
        String str2 = (i12 & 2) != 0 ? "" : "{";
        String str3 = (i12 & 4) == 0 ? "}" : "";
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i13 = 0;
        for (Object obj : interfaceC43030m) {
            i13++;
            if (i13 > 1) {
                sb2.append((CharSequence) str);
            }
            C43066x.l(sb2, obj, lVar);
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static Object x(@Y61.k InterfaceC43030m interfaceC43030m) {
        Iterator it = interfaceC43030m.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @Y61.k
    public static C43025h y(@Y61.k InterfaceC43030m interfaceC43030m, @Y61.k Y41.l lVar) {
        return l(new o0(interfaceC43030m, lVar), M.f410484l);
    }

    @Y61.k
    public static C43026i z(@Y61.k InterfaceC43030m interfaceC43030m, @Y61.k Iterable iterable) {
        return D.a(C42756l.f(new InterfaceC43030m[]{interfaceC43030m, new C42770s0(iterable)}), C43039w.f410563l);
    }
}
