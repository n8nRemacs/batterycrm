package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;

/* compiled from: VariableDescriptorWithInitializerImpl.java */
/* loaded from: classes8.dex */
public abstract class Y extends X {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f407639g;

    /* renamed from: h, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.storage.l<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f407640h;

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.N f407641i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, boolean z12, @Y61.k b0 b0Var) {
        super(interfaceC42882k, gVar, fVar, null, b0Var);
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
        this.f407639g = z12;
    }

    public static /* synthetic */ void L(int i12) {
        Object[] objArr = new Object[3];
        if (i12 == 1) {
            objArr[0] = "annotations";
        } else if (i12 == 2) {
            objArr[0] = "name";
        } else if (i12 == 3) {
            objArr[0] = SearchParamsConverterKt.SOURCE;
        } else if (i12 == 4 || i12 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i12 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i12 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F0(@Y61.l kotlin.reflect.jvm.internal.impl.storage.l<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> lVar, @Y61.k Y41.a<kotlin.reflect.jvm.internal.impl.storage.l<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> aVar) {
        if (aVar == 0) {
            L(5);
            throw null;
        }
        this.f407641i = (kotlin.jvm.internal.N) aVar;
        if (lVar == null) {
            lVar = (kotlin.reflect.jvm.internal.impl.storage.l) aVar.invoke();
        }
        this.f407640h = lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> Q() {
        kotlin.reflect.jvm.internal.impl.storage.l<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> lVar = this.f407640h;
        if (lVar != null) {
            return lVar.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final boolean c0() {
        return this.f407639g;
    }
}
