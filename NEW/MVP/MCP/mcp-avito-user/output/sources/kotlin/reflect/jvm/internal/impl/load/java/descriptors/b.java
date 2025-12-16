package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.message.MessageBody;
import j51.InterfaceC42201a;
import java.util.ArrayList;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j;
import kotlin.reflect.jvm.internal.impl.resolve.i;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: JavaClassConstructorDescriptor.java */
/* loaded from: classes8.dex */
public class b extends C42866j implements a {

    /* renamed from: G, reason: collision with root package name */
    public Boolean f408041G;

    /* renamed from: H, reason: collision with root package name */
    public Boolean f408042H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k InterfaceC42851d interfaceC42851d, @l b bVar, @k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z12, @k CallableMemberDescriptor.Kind kind, @k b0 b0Var) {
        super(interfaceC42851d, bVar, gVar, z12, kind, b0Var);
        if (interfaceC42851d == null) {
            L(0);
            throw null;
        }
        if (gVar == null) {
            L(1);
            throw null;
        }
        if (kind == null) {
            L(2);
            throw null;
        }
        if (b0Var == null) {
            L(3);
            throw null;
        }
        this.f408041G = null;
        this.f408042H = null;
    }

    public static /* synthetic */ void L(int i12) {
        String str = (i12 == 11 || i12 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 11 || i12 == 18) ? 2 : 3];
        switch (i12) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = MessageBody.Location.KIND;
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i12 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i12 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i12) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 != 11 && i12 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @k
    public static b S0(@k InterfaceC42851d interfaceC42851d, @k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z12, @k InterfaceC42201a interfaceC42201a) {
        if (interfaceC42851d == null) {
            L(4);
            throw null;
        }
        if (gVar == null) {
            L(5);
            throw null;
        }
        if (interfaceC42201a != null) {
            return new b(interfaceC42851d, null, gVar, z12, CallableMemberDescriptor.Kind.f407408b, interfaceC42201a);
        }
        L(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @k
    public final a C0(@l O o12, @k ArrayList arrayList, @k O o13, @l Q q12) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.O oH2 = null;
        if (o13 == null) {
            L(17);
            throw null;
        }
        b bVarT0 = T0(f(), null, getKind(), getAnnotations(), e());
        if (o12 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            oH2 = i.h(bVarT0, o12, g.a.f407524b);
        }
        bVarT0.I0(oH2, this.f407712k, C42784z0.f406748b, getTypeParameters(), h.a(arrayList, g(), bVarT0), o13, i(), getVisibility());
        if (q12 != null) {
            bVarT0.K0((InterfaceC42848a.InterfaceC11651a) q12.f406619b, q12.f406620c);
        }
        return bVarT0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    @k
    public final /* bridge */ /* synthetic */ AbstractC42878w F0(@k CallableMemberDescriptor.Kind kind, @k InterfaceC42882k interfaceC42882k, @l InterfaceC42905x interfaceC42905x, @k b0 b0Var, @k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return T0(interfaceC42882k, interfaceC42905x, kind, gVar, b0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    public final boolean K() {
        return this.f408042H.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    public final void L0(boolean z12) {
        this.f408041G = Boolean.valueOf(z12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    public final void M0(boolean z12) {
        this.f408042H = Boolean.valueOf(z12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j
    @k
    /* renamed from: O0 */
    public final /* bridge */ /* synthetic */ C42866j F0(@k CallableMemberDescriptor.Kind kind, @k InterfaceC42882k interfaceC42882k, @l InterfaceC42905x interfaceC42905x, @k b0 b0Var, @k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return T0(interfaceC42882k, interfaceC42905x, kind, gVar, b0Var);
    }

    @k
    public final b T0(@k InterfaceC42882k interfaceC42882k, @l InterfaceC42905x interfaceC42905x, @k CallableMemberDescriptor.Kind kind, @k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @k b0 b0Var) {
        if (interfaceC42882k == null) {
            L(7);
            throw null;
        }
        if (kind == null) {
            L(8);
            throw null;
        }
        if (gVar == null) {
            L(9);
            throw null;
        }
        if (b0Var == null) {
            L(10);
            throw null;
        }
        if (kind != CallableMemberDescriptor.Kind.f407408b && kind != CallableMemberDescriptor.Kind.f407411e) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC42882k + "\nkind: " + kind);
        }
        b bVar = new b((InterfaceC42851d) interfaceC42882k, (b) interfaceC42905x, gVar, this.f407673F, kind, b0Var);
        Boolean bool = this.f408041G;
        bool.getClass();
        bVar.f408041G = bool;
        Boolean bool2 = this.f408042H;
        bool2.getClass();
        bVar.f408042H = bool2;
        return bVar;
    }
}
