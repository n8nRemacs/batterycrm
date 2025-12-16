package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.message.MessageBody;
import j51.InterfaceC42201a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.P;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.resolve.i;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.util.g;
import kotlin.reflect.jvm.internal.impl.util.p;
import kotlin.text.C43059p;

/* compiled from: JavaMethodDescriptor.java */
/* loaded from: classes8.dex */
public class e extends P implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.a {

    /* renamed from: H, reason: collision with root package name */
    public static final InterfaceC42848a.InterfaceC11651a<k0> f408046H = new a();

    /* renamed from: I, reason: collision with root package name */
    public static final InterfaceC42848a.InterfaceC11651a<Boolean> f408047I = new b();

    /* renamed from: F, reason: collision with root package name */
    public c f408048F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f408049G;

    /* compiled from: JavaMethodDescriptor.java */
    public static class a implements InterfaceC42848a.InterfaceC11651a<k0> {
    }

    /* compiled from: JavaMethodDescriptor.java */
    public static class b implements InterfaceC42848a.InterfaceC11651a<Boolean> {
    }

    /* compiled from: JavaMethodDescriptor.java */
    public enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* renamed from: b, reason: collision with root package name */
        public final boolean f408055b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f408056c;

        c(boolean z12, boolean z13) {
            this.f408055b = z12;
            this.f408056c = z13;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@k InterfaceC42882k interfaceC42882k, @l a0 a0Var, @k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @k kotlin.reflect.jvm.internal.impl.name.f fVar, @k CallableMemberDescriptor.Kind kind, @k b0 b0Var, boolean z12) {
        super(interfaceC42882k, a0Var, gVar, fVar, kind, b0Var);
        if (interfaceC42882k == null) {
            L(0);
            throw null;
        }
        if (gVar == null) {
            L(1);
            throw null;
        }
        if (fVar == null) {
            L(2);
            throw null;
        }
        if (kind == null) {
            L(3);
            throw null;
        }
        if (b0Var == null) {
            L(4);
            throw null;
        }
        this.f408048F = null;
        this.f408049G = z12;
    }

    public static /* synthetic */ void L(int i12) {
        String str = (i12 == 13 || i12 == 18 || i12 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 13 || i12 == 18 || i12 == 21) ? 2 : 3];
        switch (i12) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = MessageBody.Location.KIND;
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i12 == 13) {
            objArr[1] = "initialize";
        } else if (i12 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i12 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i12) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 != 13 && i12 != 18 && i12 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @k
    public static e T0(@k InterfaceC42882k interfaceC42882k, @k kotlin.reflect.jvm.internal.impl.load.java.lazy.e eVar, @k kotlin.reflect.jvm.internal.impl.name.f fVar, @k InterfaceC42201a interfaceC42201a, boolean z12) {
        if (interfaceC42882k == null) {
            L(5);
            throw null;
        }
        if (fVar == null) {
            L(7);
            throw null;
        }
        if (interfaceC42201a != null) {
            return new e(interfaceC42882k, null, eVar, fVar, CallableMemberDescriptor.Kind.f407408b, interfaceC42201a, z12);
        }
        L(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @k
    public final kotlin.reflect.jvm.internal.impl.load.java.descriptors.a C0(@l O o12, @k ArrayList arrayList, @k O o13, @l Q q12) {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.O oH2;
        if (o13 == null) {
            L(20);
            throw null;
        }
        ArrayList arrayListA = h.a(arrayList, g(), this);
        if (o12 == null) {
            oH2 = null;
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            oH2 = i.h(this, o12, g.a.f407524b);
        }
        AbstractC42878w.a aVarJ0 = J0(E0.f410009b);
        aVarJ0.f407734g = arrayListA;
        aVarJ0.f407738k = o13;
        aVarJ0.f407736i = oH2;
        aVarJ0.f407743p = true;
        aVarJ0.f407742o = true;
        e eVar = (e) aVarJ0.f407751x.G0(aVarJ0);
        if (q12 != null) {
            eVar.K0((InterfaceC42848a.InterfaceC11651a) q12.f406619b, q12.f406620c);
        }
        if (eVar != null) {
            return eVar;
        }
        L(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.P, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    @k
    public final AbstractC42878w F0(@k CallableMemberDescriptor.Kind kind, @k InterfaceC42882k interfaceC42882k, @l InterfaceC42905x interfaceC42905x, @k b0 b0Var, @k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (interfaceC42882k == null) {
            L(14);
            throw null;
        }
        if (kind == null) {
            L(15);
            throw null;
        }
        if (gVar == null) {
            L(16);
            throw null;
        }
        a0 a0Var = (a0) interfaceC42905x;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(interfaceC42882k, a0Var, gVar, fVar, kind, b0Var, this.f408049G);
        c cVar = this.f408048F;
        eVar.U0(cVar.f408055b, cVar.f408056c);
        return eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    public final boolean K() {
        return this.f408048F.f408056c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.P
    @k
    public final P S0(@l kotlin.reflect.jvm.internal.impl.descriptors.impl.O o12, @l X x12, @k List list, @k List list2, @k List list3, @l O o13, @l Modality modality, @k AbstractC42900s abstractC42900s, @l Map map) {
        kotlin.reflect.jvm.internal.impl.util.g bVar;
        if (list == null) {
            L(9);
            throw null;
        }
        if (list2 == null) {
            L(10);
            throw null;
        }
        if (list3 == null) {
            L(11);
            throw null;
        }
        if (abstractC42900s == null) {
            L(12);
            throw null;
        }
        super.S0(o12, x12, list, list2, list3, o13, modality, abstractC42900s, map);
        p.f410302a.getClass();
        for (kotlin.reflect.jvm.internal.impl.util.h hVar : p.f410303b) {
            kotlin.reflect.jvm.internal.impl.name.f fVar = hVar.f410281a;
            if (fVar == null || L.f(getName(), fVar)) {
                C43059p c43059p = hVar.f410282b;
                if (c43059p == null || c43059p.e(getName().b())) {
                    Collection<kotlin.reflect.jvm.internal.impl.name.f> collection = hVar.f410283c;
                    if (collection == null || collection.contains(getName())) {
                        kotlin.reflect.jvm.internal.impl.util.f[] fVarArr = hVar.f410285e;
                        int length = fVarArr.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                bVar = hVar.f410284d.invoke(this) != null ? new g.b() : g.c.f410280b;
                            } else {
                                if (fVarArr[i12].b(this) != null) {
                                    bVar = new g.b();
                                    break;
                                }
                                i12++;
                            }
                        }
                        this.f407715n = bVar.f410278a;
                        return this;
                    }
                }
            }
        }
        bVar = g.a.f410279b;
        this.f407715n = bVar.f410278a;
        return this;
    }

    public final void U0(boolean z12, boolean z13) {
        this.f408048F = z12 ? z13 ? c.STABLE_SYNTHESIZED : c.STABLE_DECLARED : z13 ? c.NON_STABLE_SYNTHESIZED : c.NON_STABLE_DECLARED;
    }
}
