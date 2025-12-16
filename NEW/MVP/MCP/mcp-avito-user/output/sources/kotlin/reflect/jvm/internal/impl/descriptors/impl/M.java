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

/* compiled from: PropertyGetterDescriptorImpl.java */
/* loaded from: classes8.dex */
public class M extends K implements kotlin.reflect.jvm.internal.impl.descriptors.V {

    /* renamed from: n, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.types.O f407611n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.V f407612o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.U u12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k Modality modality, @Y61.k AbstractC42900s abstractC42900s, boolean z12, boolean z13, boolean z14, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.l kotlin.reflect.jvm.internal.impl.descriptors.V v12, @Y61.k b0 b0Var) {
        M m12;
        M m13;
        super(modality, abstractC42900s, u12, gVar, kotlin.reflect.jvm.internal.impl.name.f.h("<get-" + u12.getName() + ">"), z12, z13, z14, kind, b0Var);
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
        if (v12 != 0) {
            m13 = this;
            m12 = v12;
        } else {
            m12 = this;
            m13 = m12;
        }
        m13.f407612o = m12;
    }

    public static /* synthetic */ void L(int i12) {
        String str = (i12 == 6 || i12 == 7 || i12 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 6 || i12 == 7 || i12 == 8) ? 2 : 3];
        switch (i12) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i12 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i12 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i12 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i12 != 6 && i12 != 7 && i12 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i12 != 6 && i12 != 7 && i12 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.k(this, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.K
    @Y61.k
    /* renamed from: G0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final kotlin.reflect.jvm.internal.impl.descriptors.V n0() {
        kotlin.reflect.jvm.internal.impl.descriptors.V v12 = this.f407612o;
        if (v12 != null) {
            return v12;
        }
        L(8);
        throw null;
    }

    public final void H0(kotlin.reflect.jvm.internal.impl.types.O o12) {
        if (o12 == null) {
            o12 = s0().getType();
        }
        this.f407611n = o12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final List<k0> g() {
        List<k0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        L(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    public final kotlin.reflect.jvm.internal.impl.types.O getReturnType() {
        return this.f407611n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.V> p() {
        return F0(true);
    }
}
