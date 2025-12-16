package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.message.MessageBody;
import j51.InterfaceC42201a;
import java.util.ArrayList;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.builtins.p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.C42855h;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.L;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.M;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.N;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.load.java.E;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.w;
import kotlin.reflect.jvm.internal.impl.resolve.i;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.checker.u;

/* compiled from: JavaPropertyDescriptor.java */
/* loaded from: classes8.dex */
public class f extends L implements a {

    /* renamed from: B, reason: collision with root package name */
    public final boolean f408057B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public final Q<InterfaceC42848a.InterfaceC11651a<?>, ?> f408058C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@k InterfaceC42882k interfaceC42882k, @k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @k Modality modality, @k AbstractC42900s abstractC42900s, boolean z12, @k kotlin.reflect.jvm.internal.impl.name.f fVar, @k b0 b0Var, @l U u12, @k CallableMemberDescriptor.Kind kind, boolean z13, @l Q<InterfaceC42848a.InterfaceC11651a<?>, ?> q12) {
        super(interfaceC42882k, u12, gVar, modality, abstractC42900s, z12, fVar, kind, b0Var, false, false, false, false, false);
        if (interfaceC42882k == null) {
            L(0);
            throw null;
        }
        if (gVar == null) {
            L(1);
            throw null;
        }
        if (modality == null) {
            L(2);
            throw null;
        }
        if (abstractC42900s == null) {
            L(3);
            throw null;
        }
        if (fVar == null) {
            L(4);
            throw null;
        }
        if (b0Var == null) {
            L(5);
            throw null;
        }
        if (kind == null) {
            L(6);
            throw null;
        }
        this.f408057B = z13;
        this.f408058C = q12;
    }

    public static /* synthetic */ void L(int i12) {
        String str = i12 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i12 != 21 ? 3 : 2];
        switch (i12) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 6:
            case 16:
                objArr[0] = MessageBody.Location.KIND;
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i12 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i12) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @k
    public static f M0(@k InterfaceC42882k interfaceC42882k, @k kotlin.reflect.jvm.internal.impl.load.java.lazy.e eVar, @k AbstractC42900s abstractC42900s, boolean z12, @k kotlin.reflect.jvm.internal.impl.name.f fVar, @k InterfaceC42201a interfaceC42201a, boolean z13) {
        Modality modality = Modality.f407439c;
        if (interfaceC42882k == null) {
            L(7);
            throw null;
        }
        if (fVar == null) {
            L(11);
            throw null;
        }
        if (interfaceC42201a != null) {
            return new f(interfaceC42882k, eVar, modality, abstractC42900s, z12, fVar, interfaceC42201a, null, CallableMemberDescriptor.Kind.f407408b, z13, null);
        }
        L(12);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @k
    public final a C0(@l O o12, @k ArrayList arrayList, @k O o13, @l Q q12) {
        M m12;
        N n12;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.O oH2;
        if (o13 == null) {
            L(20);
            throw null;
        }
        U uN02 = n0() == this ? null : n0();
        f fVar = new f(f(), getAnnotations(), i(), getVisibility(), this.f407639g, getName(), e(), uN02, getKind(), this.f408057B, q12);
        M m13 = this.f407597x;
        if (m13 != null) {
            m12 = m;
            M m14 = new M(fVar, m13.getAnnotations(), m13.i(), m13.getVisibility(), m13.f407574f, m13.f407575g, m13.f407578j, getKind(), uN02 == null ? null : uN02.getGetter(), m13.e());
            m12.f407581m = m13.f407581m;
            m12.f407611n = o13;
        } else {
            m12 = null;
        }
        N n13 = this.f407598y;
        if (n13 != null) {
            N n14 = new N(fVar, n13.getAnnotations(), n13.i(), n13.getVisibility(), n13.f407574f, n13.f407575g, n13.f407578j, getKind(), uN02 == null ? null : uN02.c(), n13.e());
            n14.f407581m = n14.f407581m;
            k0 k0Var = n13.g().get(0);
            if (k0Var == null) {
                N.L(6);
                throw null;
            }
            n14.f407613n = k0Var;
            n12 = n14;
        } else {
            n12 = null;
        }
        fVar.J0(m12, n12, this.f407599z, this.f407582A);
        ?? r12 = this.f407641i;
        if (r12 != 0) {
            fVar.F0(this.f407640h, r12);
        }
        fVar.l0(p());
        if (o12 == null) {
            oH2 = null;
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            oH2 = i.h(this, o12, g.a.f407524b);
        }
        fVar.L0(o13, getTypeParameters(), this.f407594u, oH2, C42784z0.f406748b);
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.L
    @k
    public final L I0(@k InterfaceC42882k interfaceC42882k, @k Modality modality, @k AbstractC42900s abstractC42900s, @l U u12, @k CallableMemberDescriptor.Kind kind, @k kotlin.reflect.jvm.internal.impl.name.f fVar, @k b0 b0Var) {
        if (interfaceC42882k == null) {
            L(13);
            throw null;
        }
        if (modality == null) {
            L(14);
            throw null;
        }
        if (abstractC42900s == null) {
            L(15);
            throw null;
        }
        if (kind == null) {
            L(16);
            throw null;
        }
        if (fVar == null) {
            L(17);
            throw null;
        }
        if (b0Var == null) {
            L(18);
            throw null;
        }
        return new f(interfaceC42882k, getAnnotations(), modality, abstractC42900s, this.f407639g, fVar, b0Var, u12, kind, this.f408057B, this.f408058C);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    public final boolean K() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.L, kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final boolean isConst() {
        O type = getType();
        if (this.f408057B) {
            int i12 = C42855h.f407542a;
            if (((kotlin.reflect.jvm.internal.impl.builtins.k.F(type) || p.a(type)) && !G0.f(type)) || kotlin.reflect.jvm.internal.impl.builtins.k.C(type, n.a.f407381g)) {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = w.f408405a;
                if (!u.f410124a.o0(type, E.f407929p) || kotlin.reflect.jvm.internal.impl.builtins.k.C(type, n.a.f407381g)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.L, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @l
    public final <V> V x(InterfaceC42848a.InterfaceC11651a<V> interfaceC11651a) {
        Q<InterfaceC42848a.InterfaceC11651a<?>, ?> q12 = this.f408058C;
        if (q12 == null || !q12.f406619b.equals(interfaceC11651a)) {
            return null;
        }
        return (V) q12.f406620c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.L
    public final void K0(@k O o12) {
    }
}
