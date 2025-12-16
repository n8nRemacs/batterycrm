package kotlin.reflect.jvm.internal.impl.resolve;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42858b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.L;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.M;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.N;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.O;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.V;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import kotlin.text.C43059p;

/* compiled from: DescriptorFactory.java */
/* loaded from: classes8.dex */
public class i {

    /* compiled from: DescriptorFactory.java */
    public static class a extends C42866j {
    }

    public static /* synthetic */ void a(int i12) {
        String str = (i12 == 12 || i12 == 23 || i12 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 12 || i12 == 23 || i12 == 25) ? 2 : 3];
        switch (i12) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 22:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[0] = "enumClass";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = SearchParamsConverterKt.OWNER;
                break;
        }
        if (i12 == 12) {
            objArr[1] = "createSetter";
        } else if (i12 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i12 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i12) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[2] = "isEnumValuesMethod";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 != 12 && i12 != 23 && i12 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Y61.l
    public static O b(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.l kotlin.reflect.jvm.internal.impl.types.O o12, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, int i12) {
        if (gVar == null) {
            a(33);
            throw null;
        }
        if (o12 == null) {
            return null;
        }
        r51.c cVar = new r51.c(interfaceC42848a, o12, fVar, null);
        C43059p c43059p = kotlin.reflect.jvm.internal.impl.name.g.f409254a;
        return new O(interfaceC42848a, cVar, gVar, kotlin.reflect.jvm.internal.impl.name.f.e(kotlin.reflect.jvm.internal.impl.name.g.f409255b + '_' + i12));
    }

    @Y61.k
    public static M c(@Y61.k U u12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (gVar != null) {
            return i(u12, gVar, true, u12.e());
        }
        a(14);
        throw null;
    }

    @Y61.k
    public static N d(@Y61.k U u12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k g.a.C11652a c11652a) {
        if (gVar == null) {
            a(1);
            throw null;
        }
        if (c11652a == null) {
            a(2);
            throw null;
        }
        b0 b0VarE = u12.e();
        if (b0VarE != null) {
            return k(u12, gVar, c11652a, true, u12.getVisibility(), b0VarE);
        }
        a(6);
        throw null;
    }

    @Y61.l
    public static L e(@Y61.k AbstractC42858b abstractC42858b) {
        if (abstractC42858b == null) {
            a(26);
            throw null;
        }
        E eD2 = j.d(abstractC42858b);
        A a12 = (A) eD2.o0(B.f409550a);
        if (a12 == null) {
            a12 = C42937c.f409575a;
        }
        InterfaceC42851d interfaceC42851dA = a12.a(eD2);
        if (interfaceC42851dA == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        g.a.C11652a c11652a = g.a.f407524b;
        Modality modality = Modality.f407439c;
        AbstractC42900s abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407789e;
        kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.builtins.n.f407329b;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.f407411e;
        L lH02 = L.H0(abstractC42858b, c11652a, modality, abstractC42900s, false, fVar, kind, abstractC42858b.e());
        M m12 = new M(lH02, c11652a, modality, abstractC42900s, false, false, false, kind, null, abstractC42858b.e());
        lH02.J0(m12, null, null, null);
        n0.f410236c.getClass();
        lH02.L0(P.e(n0.f410237d, interfaceC42851dA.l(), Collections.singletonList(new z0(abstractC42858b.q())), false, null), Collections.emptyList(), null, null, Collections.emptyList());
        m12.H0(lH02.getReturnType());
        return lH02;
    }

    @Y61.k
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.P f(@Y61.k AbstractC42858b abstractC42858b) {
        if (abstractC42858b == null) {
            a(24);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        g.a.C11652a c11652a = g.a.f407524b;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.P pP02 = kotlin.reflect.jvm.internal.impl.descriptors.impl.P.P0(abstractC42858b, c11652a, kotlin.reflect.jvm.internal.impl.builtins.n.f407330c, CallableMemberDescriptor.Kind.f407411e, abstractC42858b.e());
        return pP02.I0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new V(pP02, null, 0, c11652a, kotlin.reflect.jvm.internal.impl.name.f.e("value"), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(abstractC42858b).t(), false, false, false, null, abstractC42858b.e())), abstractC42858b.q(), Modality.f407439c, kotlin.reflect.jvm.internal.impl.descriptors.r.f407789e);
    }

    @Y61.k
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.P g(@Y61.k AbstractC42858b abstractC42858b) {
        if (abstractC42858b == null) {
            a(22);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        kotlin.reflect.jvm.internal.impl.descriptors.impl.P pP02 = kotlin.reflect.jvm.internal.impl.descriptors.impl.P.P0(abstractC42858b, g.a.f407524b, kotlin.reflect.jvm.internal.impl.builtins.n.f407328a, CallableMemberDescriptor.Kind.f407411e, abstractC42858b.e());
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        kotlin.reflect.jvm.internal.impl.builtins.k kVarE = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(abstractC42858b);
        Variance variance = Variance.f410069d;
        return pP02.I0(null, null, listEmptyList, listEmptyList2, listEmptyList3, kVarE.g(abstractC42858b.q()), Modality.f407439c, kotlin.reflect.jvm.internal.impl.descriptors.r.f407789e);
    }

    @Y61.l
    public static O h(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.l kotlin.reflect.jvm.internal.impl.types.O o12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (gVar == null) {
            a(31);
            throw null;
        }
        if (o12 == null) {
            return null;
        }
        return new O(interfaceC42848a, new r51.d(interfaceC42848a, o12, null), gVar);
    }

    @Y61.k
    public static M i(@Y61.k U u12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z12, @Y61.k b0 b0Var) {
        if (gVar == null) {
            a(18);
            throw null;
        }
        if (b0Var != null) {
            return new M(u12, gVar, u12.i(), u12.getVisibility(), z12, false, false, CallableMemberDescriptor.Kind.f407408b, null, b0Var);
        }
        a(19);
        throw null;
    }

    @Y61.k
    public static C42866j j(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.k b0 b0Var) {
        AbstractC42900s abstractC42900s;
        if (interfaceC42851d == null) {
            a(20);
            throw null;
        }
        if (b0Var == null) {
            a(21);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        a aVar = new a(interfaceC42851d, null, g.a.f407524b, true, CallableMemberDescriptor.Kind.f407408b, b0Var);
        List listEmptyList = Collections.emptyList();
        int i12 = j.f409625a;
        ClassKind kind = interfaceC42851d.getKind();
        if (kind == ClassKind.f407415d || kind.a()) {
            abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407785a;
            if (abstractC42900s == null) {
                j.a(49);
                throw null;
            }
        } else if (j.q(interfaceC42851d)) {
            abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407785a;
            if (abstractC42900s == null) {
                j.a(51);
                throw null;
            }
        } else if (j.k(interfaceC42851d)) {
            abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407796l;
            if (abstractC42900s == null) {
                j.a(52);
                throw null;
            }
        } else {
            abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407789e;
            if (abstractC42900s == null) {
                j.a(53);
                throw null;
            }
        }
        aVar.Q0(listEmptyList, abstractC42900s);
        return aVar;
    }

    @Y61.k
    public static N k(@Y61.k U u12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2, boolean z12, @Y61.k AbstractC42900s abstractC42900s, @Y61.k b0 b0Var) {
        if (gVar == null) {
            a(8);
            throw null;
        }
        if (gVar2 == null) {
            a(9);
            throw null;
        }
        if (abstractC42900s == null) {
            a(10);
            throw null;
        }
        if (b0Var == null) {
            a(11);
            throw null;
        }
        N n12 = new N(u12, gVar, u12.i(), abstractC42900s, z12, false, false, CallableMemberDescriptor.Kind.f407408b, null, b0Var);
        n12.f407613n = N.G0(n12, u12.getType(), gVar2);
        return n12;
    }

    public static boolean l(@Y61.k InterfaceC42905x interfaceC42905x) {
        if (interfaceC42905x.getKind() == CallableMemberDescriptor.Kind.f407411e) {
            InterfaceC42882k interfaceC42882kF = interfaceC42905x.f();
            int i12 = j.f409625a;
            if (j.n(interfaceC42882kF, ClassKind.f407415d)) {
                return true;
            }
        }
        return false;
    }
}
