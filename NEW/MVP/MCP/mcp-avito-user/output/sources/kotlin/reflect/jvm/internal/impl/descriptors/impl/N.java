package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;

/* compiled from: PropertySetterDescriptorImpl.java */
/* loaded from: classes8.dex */
public class N extends K implements kotlin.reflect.jvm.internal.impl.descriptors.W {

    /* renamed from: n, reason: collision with root package name */
    public k0 f407613n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.W f407614o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public N(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.U u12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k Modality modality, @Y61.k AbstractC42900s abstractC42900s, boolean z12, boolean z13, boolean z14, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.l kotlin.reflect.jvm.internal.impl.descriptors.W w12, @Y61.k b0 b0Var) {
        N n12;
        N n13;
        super(modality, abstractC42900s, u12, gVar, kotlin.reflect.jvm.internal.impl.name.f.h("<set-" + u12.getName() + ">"), z12, z13, z14, kind, b0Var);
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
        if (kind == null) {
            L(4);
            throw null;
        }
        if (b0Var == null) {
            L(5);
            throw null;
        }
        if (w12 != 0) {
            n13 = this;
            n12 = w12;
        } else {
            n12 = this;
            n13 = n12;
        }
        n13.f407614o = n12;
    }

    public static V G0(@Y61.k N n12, @Y61.k kotlin.reflect.jvm.internal.impl.types.O o12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (o12 == null) {
            L(8);
            throw null;
        }
        if (gVar != null) {
            return new V(n12, null, 0, gVar, kotlin.reflect.jvm.internal.impl.name.h.f409263h, o12, false, false, false, null, b0.f407539a);
        }
        L(9);
        throw null;
    }

    public static /* synthetic */ void L(int i12) {
        String str;
        int i13;
        switch (i12) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i12) {
            case 10:
            case 11:
            case 12:
            case 13:
                i13 = 2;
                break;
            default:
                i13 = 3;
                break;
        }
        Object[] objArr = new Object[i13];
        switch (i12) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = MessageBody.Location.KIND;
                break;
            case 5:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i12) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i12) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i12) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.f(this, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.K
    @Y61.k
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final kotlin.reflect.jvm.internal.impl.descriptors.W n0() {
        kotlin.reflect.jvm.internal.impl.descriptors.W w12 = this.f407614o;
        if (w12 != null) {
            return w12;
        }
        L(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final List<k0> g() {
        k0 k0Var = this.f407613n;
        if (k0Var == null) {
            throw new IllegalStateException();
        }
        List<k0> listSingletonList = Collections.singletonList(k0Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        L(11);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.O getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.Y yV2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(this).v();
        if (yV2 != null) {
            return yV2;
        }
        L(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.W> p() {
        return F0(false);
    }
}
