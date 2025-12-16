package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;

/* compiled from: DescriptorSubstitutor.java */
/* loaded from: classes8.dex */
public class A {
    public static /* synthetic */ void a(int i12) {
        String str = i12 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i12 != 4 ? 3 : 2];
        switch (i12) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i12 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i12 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i12 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    @Y61.k
    public static E0 b(@Y61.k List list, @Y61.k A0 a02, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.k ArrayList arrayList) {
        if (a02 == null) {
            a(1);
            throw null;
        }
        if (interfaceC42882k == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        E0 e0C = c(list, a02, interfaceC42882k, arrayList, null);
        if (e0C != null) {
            return e0C;
        }
        throw new AssertionError("Substitution failed");
    }

    @Y61.l
    public static E0 c(@Y61.k List list, @Y61.k A0 a02, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.k ArrayList arrayList, @Y61.l boolean[] zArr) {
        if (a02 == null) {
            a(6);
            throw null;
        }
        if (interfaceC42882k == null) {
            a(7);
            throw null;
        }
        if (arrayList == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var = (kotlin.reflect.jvm.internal.impl.descriptors.g0) it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.impl.U uH02 = kotlin.reflect.jvm.internal.impl.descriptors.impl.U.H0(interfaceC42882k, g0Var.getAnnotations(), g0Var.s(), g0Var.o(), g0Var.getName(), i12, kotlin.reflect.jvm.internal.impl.descriptors.b0.f407539a, g0Var.getStorageManager());
            map.put(g0Var.l(), new z0(uH02.q()));
            map2.put(g0Var, uH02);
            arrayList.add(uH02);
            i12++;
        }
        s0.f410245b.getClass();
        r0 r0Var = new r0(map);
        E0 e0F = E0.f(a02, r0Var);
        E0 e0F2 = E0.f(new B0(a02), r0Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var2 = (kotlin.reflect.jvm.internal.impl.descriptors.g0) it2.next();
            kotlin.reflect.jvm.internal.impl.descriptors.impl.U u12 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.U) map2.get(g0Var2);
            for (O o12 : g0Var2.getUpperBounds()) {
                InterfaceC42853f interfaceC42853fB = o12.H0().b();
                O oJ2 = (((interfaceC42853fB instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0) && kotlin.reflect.jvm.internal.impl.types.typeUtil.a.h((kotlin.reflect.jvm.internal.impl.descriptors.g0) interfaceC42853fB, null, 6)) ? e0F : e0F2).j(o12, Variance.f410071f);
                if (oJ2 == null) {
                    return null;
                }
                if (oJ2 != o12 && zArr != null) {
                    zArr[0] = true;
                }
                if (u12.f407628m) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + u12.J0());
                }
                if (!Q.a(oJ2)) {
                    u12.f407627l.add(oJ2);
                }
            }
            if (u12.f407628m) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + u12.J0());
            }
            u12.f407628m = true;
        }
        return e0F;
    }
}
