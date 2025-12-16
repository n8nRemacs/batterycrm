package kotlin.reflect.jvm.internal.impl.resolve;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o;
import kotlin.reflect.jvm.internal.impl.descriptors.K;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.P;
import kotlin.reflect.jvm.internal.impl.descriptors.W;
import kotlin.reflect.jvm.internal.impl.descriptors.c0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: DescriptorUtils.java */
/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f409625a = 0;

    static {
        new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i12) {
        String str;
        int i13;
        switch (i12) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i12) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i13 = 2;
                break;
            default:
                i13 = 3;
                break;
        }
        Object[] objArr = new Object[i13];
        switch (i12) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "declarationDescriptor";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[0] = "subClass";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = PluralsKeys.OTHER;
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i12) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i12) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                objArr[2] = "getContainingClass";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[2] = "isAncestor";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[2] = "isDirectSubclass";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i12) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k LinkedHashSet linkedHashSet) {
        if (interfaceC42848a == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC42848a)) {
            return;
        }
        Iterator<? extends InterfaceC42848a> it = interfaceC42848a.n0().p().iterator();
        while (it.hasNext()) {
            InterfaceC42848a interfaceC42848aN0 = it.next().n0();
            b(interfaceC42848aN0, linkedHashSet);
            linkedHashSet.add(interfaceC42848aN0);
        }
    }

    @Y61.k
    public static InterfaceC42851d c(@Y61.k O o12) {
        if (o12 == null) {
            a(45);
            throw null;
        }
        q0 q0VarH0 = o12.H0();
        if (q0VarH0 == null) {
            a(46);
            throw null;
        }
        InterfaceC42851d interfaceC42851d = (InterfaceC42851d) q0VarH0.b();
        if (interfaceC42851d != null) {
            return interfaceC42851d;
        }
        a(47);
        throw null;
    }

    @Y61.k
    public static E d(@Y61.k InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k == null) {
            a(21);
            throw null;
        }
        E e12 = e(interfaceC42882k);
        if (e12 != null) {
            return e12;
        }
        a(22);
        throw null;
    }

    @Y61.l
    public static E e(@Y61.k InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k == null) {
            a(23);
            throw null;
        }
        while (interfaceC42882k != null) {
            if (interfaceC42882k instanceof E) {
                return (E) interfaceC42882k;
            }
            if (interfaceC42882k instanceof P) {
                return ((P) interfaceC42882k).h();
            }
            interfaceC42882k = interfaceC42882k.f();
        }
        return null;
    }

    @Y61.k
    public static c0 f(@Y61.k InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k == null) {
            a(82);
            throw null;
        }
        if (interfaceC42882k instanceof W) {
            interfaceC42882k = ((W) interfaceC42882k).s0();
        }
        if (interfaceC42882k instanceof InterfaceC42885n) {
            c0 c0VarA = ((InterfaceC42885n) interfaceC42882k).e().a();
            if (c0VarA != null) {
                return c0VarA;
            }
            a(83);
            throw null;
        }
        c0 c0Var = c0.f407540a;
        if (c0Var != null) {
            return c0Var;
        }
        a(84);
        throw null;
    }

    @Y61.k
    public static kotlin.reflect.jvm.internal.impl.name.d g(@Y61.k InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k != null) {
            kotlin.reflect.jvm.internal.impl.name.c cVarH = h(interfaceC42882k);
            return cVarH != null ? cVarH.i() : g(interfaceC42882k.f()).b(interfaceC42882k.getName());
        }
        a(2);
        throw null;
    }

    @Y61.l
    public static kotlin.reflect.jvm.internal.impl.name.c h(@Y61.k InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k == null) {
            a(5);
            throw null;
        }
        if ((interfaceC42882k instanceof E) || kotlin.reflect.jvm.internal.impl.types.error.h.e(interfaceC42882k)) {
            return kotlin.reflect.jvm.internal.impl.name.c.f409242c;
        }
        if (interfaceC42882k instanceof P) {
            return ((P) interfaceC42882k).d();
        }
        if (interfaceC42882k instanceof K) {
            return ((K) interfaceC42882k).d();
        }
        return null;
    }

    @Y61.l
    public static <D extends InterfaceC42882k> D i(@Y61.l InterfaceC42882k interfaceC42882k, @Y61.k Class<D> cls, boolean z12) {
        if (interfaceC42882k == null) {
            return null;
        }
        if (z12) {
            interfaceC42882k = (D) interfaceC42882k.f();
        }
        while (interfaceC42882k != null) {
            if (cls.isInstance(interfaceC42882k)) {
                return (D) interfaceC42882k;
            }
            interfaceC42882k = (D) interfaceC42882k.f();
        }
        return null;
    }

    @Y61.l
    public static InterfaceC42851d j(@Y61.k InterfaceC42851d interfaceC42851d) {
        if (interfaceC42851d == null) {
            a(44);
            throw null;
        }
        Iterator<O> it = interfaceC42851d.l().C().iterator();
        while (it.hasNext()) {
            InterfaceC42851d interfaceC42851dC = c(it.next());
            if (interfaceC42851dC.getKind() != ClassKind.f407414c) {
                return interfaceC42851dC;
            }
        }
        return null;
    }

    public static boolean k(@Y61.k InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k != null) {
            return n(interfaceC42882k, ClassKind.f407413b) && interfaceC42882k.getName().equals(kotlin.reflect.jvm.internal.impl.name.h.f409257b);
        }
        a(34);
        throw null;
    }

    public static boolean l(@Y61.l InterfaceC42882k interfaceC42882k) {
        return n(interfaceC42882k, ClassKind.f407418g) && ((InterfaceC42851d) interfaceC42882k).v0();
    }

    public static boolean m(@Y61.k InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k != null) {
            return n(interfaceC42882k, ClassKind.f407416e);
        }
        a(36);
        throw null;
    }

    public static boolean n(@Y61.l InterfaceC42882k interfaceC42882k, @Y61.k ClassKind classKind) {
        return (interfaceC42882k instanceof InterfaceC42851d) && ((InterfaceC42851d) interfaceC42882k).getKind() == classKind;
    }

    public static boolean o(@Y61.k InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k == null) {
            a(1);
            throw null;
        }
        while (interfaceC42882k != null) {
            if (k(interfaceC42882k) || ((interfaceC42882k instanceof InterfaceC42886o) && ((InterfaceC42886o) interfaceC42882k).getVisibility() == kotlin.reflect.jvm.internal.impl.descriptors.r.f407790f)) {
                return true;
            }
            interfaceC42882k = interfaceC42882k.f();
        }
        return false;
    }

    public static boolean p(@Y61.k O o12, @Y61.k InterfaceC42851d interfaceC42851d) {
        if (o12 == null) {
            a(30);
            throw null;
        }
        if (interfaceC42851d == null) {
            a(31);
            throw null;
        }
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        if (interfaceC42853fB == null) {
            return false;
        }
        InterfaceC42882k interfaceC42882kN0 = interfaceC42853fB.n0();
        return (interfaceC42882kN0 instanceof InterfaceC42853f) && interfaceC42851d.l().equals(((InterfaceC42853f) interfaceC42882kN0).l());
    }

    public static boolean q(@Y61.l InterfaceC42854g interfaceC42854g) {
        return (n(interfaceC42854g, ClassKind.f407413b) || n(interfaceC42854g, ClassKind.f407414c)) && ((InterfaceC42851d) interfaceC42854g).i() == Modality.f407440d;
    }

    public static boolean r(@Y61.k O o12, @Y61.k InterfaceC42851d interfaceC42851d) {
        if (o12 == null) {
            a(32);
            throw null;
        }
        if (interfaceC42851d == null) {
            a(33);
            throw null;
        }
        if (p(o12, interfaceC42851d)) {
            return true;
        }
        Iterator<O> it = o12.H0().C().iterator();
        while (it.hasNext()) {
            if (r(it.next(), interfaceC42851d)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(@Y61.l InterfaceC42882k interfaceC42882k) {
        return interfaceC42882k != null && (interfaceC42882k.f() instanceof K);
    }

    @Y61.k
    public static <D extends CallableMemberDescriptor> D t(@Y61.k D d12) {
        if (d12 == null) {
            a(59);
            throw null;
        }
        while (d12.getKind() == CallableMemberDescriptor.Kind.f407409c) {
            Collection<? extends CallableMemberDescriptor> collectionP = d12.p();
            if (collectionP.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d12);
            }
            d12 = (D) collectionP.iterator().next();
        }
        return d12;
    }
}
