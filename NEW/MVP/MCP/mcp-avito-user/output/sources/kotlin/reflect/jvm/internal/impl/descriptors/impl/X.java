package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.types.E0;

/* compiled from: VariableDescriptorImpl.java */
/* loaded from: classes8.dex */
public abstract class X extends AbstractC42871o implements m0 {

    /* renamed from: f, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.types.O f407638f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.l kotlin.reflect.jvm.internal.impl.types.O o12, @Y61.k b0 b0Var) {
        super(interfaceC42882k, gVar, fVar, b0Var);
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
        if (b0Var == null) {
            L(3);
            throw null;
        }
        this.f407638f = o12;
    }

    public static /* synthetic */ void L(int i12) {
        String str;
        int i13;
        switch (i12) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i12) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i13 = 2;
                break;
            default:
                i13 = 3;
                break;
        }
        Object[] objArr = new Object[i13];
        switch (i12) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i12) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i12) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i12) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.X F() {
        return null;
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.X H() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    public boolean K() {
        return false;
    }

    public /* bridge */ /* synthetic */ InterfaceC42883l b(E0 e02) {
        return b(e02);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final List<k0> g() {
        List<k0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        L(6);
        throw null;
    }

    @Y61.k
    public kotlin.reflect.jvm.internal.impl.types.O getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.O type = getType();
        if (type != null) {
            return type;
        }
        L(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.O getType() {
        kotlin.reflect.jvm.internal.impl.types.O o12 = this.f407638f;
        if (o12 != null) {
            return o12;
        }
        L(4);
        throw null;
    }

    @Y61.k
    public List<g0> getTypeParameters() {
        List<g0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        L(8);
        throw null;
    }

    @Y61.k
    public Collection<? extends InterfaceC42848a> p() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        L(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    public m0 n0() {
        return this;
    }
}
