package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;

/* compiled from: ClassDescriptorBase.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42867k extends AbstractC42858b {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC42882k f407674g;

    /* renamed from: h, reason: collision with root package name */
    public final b0 f407675h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42867k(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k b0 b0Var) {
        super(pVar, fVar);
        if (pVar == null) {
            U(0);
            throw null;
        }
        if (interfaceC42882k == null) {
            U(1);
            throw null;
        }
        if (fVar == null) {
            U(2);
            throw null;
        }
        if (b0Var == null) {
            U(3);
            throw null;
        }
        this.f407674g = interfaceC42882k;
        this.f407675h = b0Var;
    }

    public static /* synthetic */ void U(int i12) {
        String str = (i12 == 4 || i12 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 4 || i12 == 5) ? 2 : 3];
        if (i12 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i12 == 2) {
            objArr[0] = "name";
        } else if (i12 == 3) {
            objArr[0] = SearchParamsConverterKt.SOURCE;
        } else if (i12 == 4 || i12 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i12 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i12 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i12 != 4 && i12 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i12 != 4 && i12 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n
    @Y61.k
    public final b0 e() {
        b0 b0Var = this.f407675h;
        if (b0Var != null) {
            return b0Var;
        }
        U(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    public final InterfaceC42882k f() {
        InterfaceC42882k interfaceC42882k = this.f407674g;
        if (interfaceC42882k != null) {
            return interfaceC42882k;
        }
        U(4);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}
