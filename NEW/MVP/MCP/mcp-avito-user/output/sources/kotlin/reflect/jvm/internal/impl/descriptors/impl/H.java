package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.C42993s;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: MutableClassDescriptor.java */
/* loaded from: classes8.dex */
public class H extends AbstractC42867k {

    /* renamed from: i, reason: collision with root package name */
    public final ClassKind f407561i;

    /* renamed from: j, reason: collision with root package name */
    public Modality f407562j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC42900s f407563k;

    /* renamed from: l, reason: collision with root package name */
    public C42993s f407564l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f407565m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f407566n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.p f407567o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(@Y61.k C42873q c42873q, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k b0 b0Var, @Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar) {
        super(pVar, c42873q, fVar, b0Var);
        ClassKind classKind = ClassKind.f407414c;
        if (fVar == null) {
            U(2);
            throw null;
        }
        if (b0Var == null) {
            U(3);
            throw null;
        }
        if (pVar == null) {
            U(4);
            throw null;
        }
        this.f407566n = new ArrayList();
        this.f407567o = pVar;
        this.f407561i = classKind;
    }

    public static /* synthetic */ void U(int i12) {
        String str;
        int i13;
        switch (i12) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i12) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i13 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i13 = 3;
                break;
        }
        Object[] objArr = new Object[i13];
        switch (i12) {
            case 1:
                objArr[0] = MessageBody.Location.KIND;
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i12) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i12) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i12) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final Collection G() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        U(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final i0<kotlin.reflect.jvm.internal.impl.types.Y> I() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j N(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        if (iVar == null) {
            U(16);
            throw null;
        }
        j.c cVar = j.c.f409687b;
        if (cVar != null) {
            return cVar;
        }
        U(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean O() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j P() {
        j.c cVar = j.c.f409687b;
        if (cVar != null) {
            return cVar;
        }
        U(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean W() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    public final boolean Y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        g.a.C11652a c11652a = g.a.f407524b;
        if (c11652a != null) {
            return c11652a;
        }
        U(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final ClassKind getKind() {
        ClassKind classKind = this.f407561i;
        if (classKind != null) {
            return classKind;
        }
        U(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final AbstractC42900s getVisibility() {
        AbstractC42900s abstractC42900s = this.f407563k;
        if (abstractC42900s != null) {
            return abstractC42900s;
        }
        U(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final Modality i() {
        Modality modality = this.f407562j;
        if (modality != null) {
            return modality;
        }
        U(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final q0 l() {
        C42993s c42993s = this.f407564l;
        if (c42993s != null) {
            return c42993s;
        }
        U(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final Collection<InterfaceC42851d> q0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        U(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    @Y61.k
    public final List<g0> r() {
        ArrayList arrayList = this.f407565m;
        if (arrayList != null) {
            return arrayList;
        }
        U(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final InterfaceC42850c t() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean t0() {
        return false;
    }

    public final String toString() {
        return AbstractC42870n.N(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean v0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean w0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final InterfaceC42851d x0() {
        return null;
    }
}
