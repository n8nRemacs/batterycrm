package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC43017s;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;
import kotlin.text.C43066x;
import okhttp3.HttpUrl;

/* compiled from: TypesJVM.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class y {

    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f410473a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.f406947b;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.f406947b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.f406947b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f410473a = iArr;
        }
    }

    public static final String a(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        InterfaceC43030m interfaceC43030mU = C43033p.u(z.f410474b, type);
        return ((Class) C43033p.x(interfaceC43030mU)).getName() + C43066x.Z(C43033p.d(interfaceC43030mU), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
    }

    @InterfaceC43017s
    public static final Type b(r rVar, boolean z12) {
        g gVarK = rVar.K();
        if (gVarK instanceof s) {
            return new x((s) gVarK);
        }
        if (!(gVarK instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + rVar);
        }
        d dVar = (d) gVarK;
        Class<?> clsB = z12 ? X41.b.b(dVar) : ((InterfaceC42819t) dVar).f();
        List<t> listD = rVar.D();
        if (listD.isEmpty()) {
            return clsB;
        }
        if (!clsB.isArray()) {
            return c(clsB, listD);
        }
        if (clsB.getComponentType().isPrimitive()) {
            return clsB;
        }
        t tVar = (t) C42745f0.w0(listD);
        if (tVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + rVar);
        }
        KVariance kVariance = tVar.f410465a;
        int i12 = kVariance == null ? -1 : a.f410473a[kVariance.ordinal()];
        if (i12 == -1 || i12 == 1) {
            return clsB;
        }
        if (i12 != 2 && i12 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Type typeB = b(tVar.f410466b, false);
        return typeB instanceof Class ? clsB : new C42838a(typeB);
    }

    @InterfaceC43017s
    public static final Type c(Class<?> cls, List<t> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<t> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(e((t) it.next()));
            }
            return new u(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<t> list3 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(e((t) it2.next()));
            }
            return new u(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeC = c(declaringClass, list.subList(length, list.size()));
        List<t> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(C42745f0.q(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(e((t) it3.next()));
        }
        return new u(cls, typeC, arrayList3);
    }

    @Y61.k
    public static final Type d(@Y61.k r rVar) {
        Type typeG;
        return (!(rVar instanceof M) || (typeG = ((M) rVar).g()) == null) ? b(rVar, false) : typeG;
    }

    public static final Type e(t tVar) {
        KVariance kVariance = tVar.f410465a;
        if (kVariance == null) {
            A.f406938d.getClass();
            return A.f406939e;
        }
        r rVar = tVar.f410466b;
        int iOrdinal = kVariance.ordinal();
        if (iOrdinal == 0) {
            return b(rVar, true);
        }
        if (iOrdinal == 1) {
            return new A(null, b(rVar, true));
        }
        if (iOrdinal == 2) {
            return new A(b(rVar, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
