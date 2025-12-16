package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;

/* compiled from: DescriptorResolverUtils.java */
/* loaded from: classes8.dex */
public final class b {
    public static /* synthetic */ void a(int i12) {
        String str = i12 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i12 != 18 ? 3 : 2];
        switch (i12) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i12 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i12) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    @Y61.l
    public static k0 b(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC42851d interfaceC42851d) {
        if (fVar == null) {
            a(19);
            throw null;
        }
        if (interfaceC42851d == null) {
            a(20);
            throw null;
        }
        Collection<InterfaceC42850c> collectionG = interfaceC42851d.G();
        if (collectionG.size() != 1) {
            return null;
        }
        for (k0 k0Var : collectionG.iterator().next().g()) {
            if (k0Var.getName().equals(fVar)) {
                return k0Var;
            }
        }
        return null;
    }

    @Y61.k
    public static LinkedHashSet c(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k Collection collection, @Y61.k Collection collection2, @Y61.k InterfaceC42851d interfaceC42851d, @Y61.k s sVar, @Y61.k OverridingUtil overridingUtil, boolean z12) {
        if (fVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (collection2 == null) {
            a(14);
            throw null;
        }
        if (interfaceC42851d == null) {
            a(15);
            throw null;
        }
        if (sVar == null) {
            a(16);
            throw null;
        }
        if (overridingUtil == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.h(fVar, collection, collection2, interfaceC42851d, new a(sVar, linkedHashSet, z12));
        return linkedHashSet;
    }

    @Y61.k
    public static LinkedHashSet d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k AbstractCollection abstractCollection, @Y61.k Collection collection, @Y61.k InterfaceC42851d interfaceC42851d, @Y61.k s sVar, @Y61.k OverridingUtil overridingUtil) {
        if (fVar == null) {
            a(0);
            throw null;
        }
        if (collection == null) {
            a(2);
            throw null;
        }
        if (interfaceC42851d == null) {
            a(3);
            throw null;
        }
        if (sVar == null) {
            a(4);
            throw null;
        }
        if (overridingUtil != null) {
            return c(fVar, abstractCollection, collection, interfaceC42851d, sVar, overridingUtil, false);
        }
        a(5);
        throw null;
    }

    @Y61.k
    public static LinkedHashSet e(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k Collection collection, @Y61.k AbstractCollection abstractCollection, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar2, @Y61.k s sVar, @Y61.k OverridingUtil overridingUtil) {
        if (fVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (fVar2 == null) {
            a(9);
            throw null;
        }
        if (sVar == null) {
            a(10);
            throw null;
        }
        if (overridingUtil != null) {
            return c(fVar, collection, abstractCollection, fVar2, sVar, overridingUtil, true);
        }
        a(11);
        throw null;
    }
}
