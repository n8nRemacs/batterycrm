package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: TypeParameterDescriptorImpl.java */
/* loaded from: classes8.dex */
public class U extends AbstractC42864h {

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f407627l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f407628m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z12, @Y61.k Variance variance, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, int i12, @Y61.k b0 b0Var, @Y61.k e0.a aVar, @Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar) {
        super(pVar, interfaceC42882k, gVar, fVar, variance, z12, i12, b0Var, aVar);
        if (interfaceC42882k == null) {
            L(19);
            throw null;
        }
        if (gVar == null) {
            L(20);
            throw null;
        }
        if (variance == null) {
            L(21);
            throw null;
        }
        if (fVar == null) {
            L(22);
            throw null;
        }
        if (b0Var == null) {
            L(23);
            throw null;
        }
        if (aVar == null) {
            L(24);
            throw null;
        }
        if (pVar == null) {
            L(25);
            throw null;
        }
        this.f407627l = new ArrayList(1);
        this.f407628m = false;
    }

    public static U H0(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, boolean z12, @Y61.k Variance variance, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, int i12, @Y61.k b0 b0Var, @Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar) {
        if (interfaceC42882k == null) {
            L(6);
            throw null;
        }
        if (gVar == null) {
            L(7);
            throw null;
        }
        if (variance == null) {
            L(8);
            throw null;
        }
        if (fVar == null) {
            L(9);
            throw null;
        }
        if (b0Var == null) {
            L(10);
            throw null;
        }
        if (pVar == null) {
            L(11);
            throw null;
        }
        e0.a aVar = e0.a.f407541a;
        if (aVar != null) {
            return new U(interfaceC42882k, gVar, z12, variance, fVar, i12, b0Var, aVar, pVar);
        }
        L(17);
        throw null;
    }

    @Y61.k
    public static U I0(@Y61.k AbstractC42858b abstractC42858b, @Y61.k g.a.C11652a c11652a, @Y61.k Variance variance, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, int i12, @Y61.k kotlin.reflect.jvm.internal.impl.storage.f fVar2) {
        if (abstractC42858b == null) {
            L(0);
            throw null;
        }
        if (c11652a == null) {
            L(1);
            throw null;
        }
        if (fVar2 == null) {
            L(4);
            throw null;
        }
        U uH02 = H0(abstractC42858b, c11652a, false, variance, fVar, i12, b0.f407539a, fVar2);
        kotlin.reflect.jvm.internal.impl.types.Y yN2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(abstractC42858b).n();
        if (uH02.f407628m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + uH02.J0());
        }
        if (!kotlin.reflect.jvm.internal.impl.types.Q.a(yN2)) {
            uH02.f407627l.add(yN2);
        }
        if (!uH02.f407628m) {
            uH02.f407628m = true;
            return uH02;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + uH02.J0());
    }

    public static /* synthetic */ void L(int i12) {
        String str = (i12 == 5 || i12 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 5 || i12 == 28) ? 2 : 3];
        switch (i12) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[0] = "storageManager";
                break;
            case 5:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[0] = "bound";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[0] = "type";
                break;
        }
        if (i12 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i12 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i12) {
            case 5:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[2] = "<init>";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                objArr[2] = "addUpperBound";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 != 5 && i12 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42864h
    public final void F0(@Y61.k kotlin.reflect.jvm.internal.impl.types.O o12) {
        if (o12 != null) {
            return;
        }
        L(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42864h
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.types.O> G0() {
        if (!this.f407628m) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + J0());
        }
        ArrayList arrayList = this.f407627l;
        if (arrayList != null) {
            return arrayList;
        }
        L(28);
        throw null;
    }

    public final String J0() {
        return getName() + " declared in " + kotlin.reflect.jvm.internal.impl.resolve.j.g(f());
    }
}
