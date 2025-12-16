package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.types.E0;

/* compiled from: SimpleFunctionDescriptorImpl.java */
/* loaded from: classes8.dex */
public class P extends AbstractC42878w implements a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.l a0 a0Var, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.k b0 b0Var) {
        super(kind, interfaceC42882k, a0Var, b0Var, gVar, fVar);
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
        if (b0Var != null) {
        } else {
            L(4);
            throw null;
        }
    }

    public static /* synthetic */ void L(int i12) {
        String str = (i12 == 13 || i12 == 18 || i12 == 23 || i12 == 24 || i12 == 29 || i12 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 13 || i12 == 18 || i12 == 23 || i12 == 24 || i12 == 29 || i12 == 30) ? 2 : 3];
        switch (i12) {
            case 1:
            case 6:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[0] = MessageBody.Location.KIND;
                break;
            case 4:
            case 9:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "newOwner";
                break;
        }
        if (i12 == 13 || i12 == 18 || i12 == 23) {
            objArr[1] = "initialize";
        } else if (i12 == 24) {
            objArr[1] = "getOriginal";
        } else if (i12 == 29) {
            objArr[1] = "copy";
        } else if (i12 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i12) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 30:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 != 13 && i12 != 18 && i12 != 23 && i12 != 24 && i12 != 29 && i12 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Y61.k
    public static P P0(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.k g.a.C11652a c11652a, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.k b0 b0Var) {
        if (interfaceC42851d == null) {
            L(5);
            throw null;
        }
        if (c11652a == null) {
            L(6);
            throw null;
        }
        if (fVar == null) {
            L(7);
            throw null;
        }
        if (b0Var != null) {
            return new P(interfaceC42851d, null, c11652a, fVar, kind, b0Var);
        }
        L(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    @Y61.k
    public AbstractC42878w F0(@Y61.k CallableMemberDescriptor.Kind kind, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.l InterfaceC42905x interfaceC42905x, @Y61.k b0 b0Var, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (interfaceC42882k == null) {
            L(25);
            throw null;
        }
        if (kind == null) {
            L(26);
            throw null;
        }
        if (gVar == null) {
            L(27);
            throw null;
        }
        a0 a0Var = (a0) interfaceC42905x;
        if (fVar == null) {
            fVar = getName();
        }
        return new P(interfaceC42882k, a0Var, gVar, fVar, kind, b0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    @Y61.k
    /* renamed from: O0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a0 n0(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p) {
        return (a0) super.n0(interfaceC42851d, modality, abstractC42887p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final a0 n0() {
        a0 a0Var = (a0) super.n0();
        if (a0Var != null) {
            return a0Var;
        }
        L(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    @Y61.k
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final P I0(@Y61.l O o12, @Y61.l kotlin.reflect.jvm.internal.impl.descriptors.X x12, @Y61.k List list, @Y61.k List list2, @Y61.k List list3, @Y61.l kotlin.reflect.jvm.internal.impl.types.O o13, @Y61.l Modality modality, @Y61.k AbstractC42900s abstractC42900s) {
        if (list == null) {
            L(14);
            throw null;
        }
        if (list2 == null) {
            L(15);
            throw null;
        }
        if (list3 == null) {
            L(16);
            throw null;
        }
        if (abstractC42900s != null) {
            return S0(o12, x12, list, list2, list3, o13, modality, abstractC42900s, null);
        }
        L(17);
        throw null;
    }

    @Y61.k
    public P S0(@Y61.l O o12, @Y61.l kotlin.reflect.jvm.internal.impl.descriptors.X x12, @Y61.k List list, @Y61.k List list2, @Y61.k List list3, @Y61.l kotlin.reflect.jvm.internal.impl.types.O o13, @Y61.l Modality modality, @Y61.k AbstractC42900s abstractC42900s, @Y61.l Map map) {
        if (list == null) {
            L(19);
            throw null;
        }
        if (list2 == null) {
            L(20);
            throw null;
        }
        if (list3 == null) {
            L(21);
            throw null;
        }
        if (abstractC42900s == null) {
            L(22);
            throw null;
        }
        super.I0(o12, x12, list, list2, list3, o13, modality, abstractC42900s);
        if (map != null && !map.isEmpty()) {
            this.f407706E = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    @Y61.k
    public InterfaceC42905x.a<? extends a0> m0() {
        return J0(E0.f410009b);
    }
}
