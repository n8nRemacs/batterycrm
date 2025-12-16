package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: AbstractLazyTypeParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42859c extends AbstractC42864h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42859c(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k Variance variance, boolean z12, int i12, @Y61.k b0 b0Var, @Y61.k e0 e0Var) {
        super(pVar, interfaceC42882k, gVar, fVar, variance, z12, i12, b0Var, e0Var);
        if (pVar == null) {
            L(0);
            throw null;
        }
        if (interfaceC42882k == null) {
            L(1);
            throw null;
        }
        if (gVar == null) {
            L(2);
            throw null;
        }
        if (fVar == null) {
            L(3);
            throw null;
        }
        if (b0Var == null) {
            L(5);
            throw null;
        }
        if (e0Var != null) {
        } else {
            L(6);
            throw null;
        }
    }

    public static /* synthetic */ void L(int i12) {
        Object[] objArr = new Object[3];
        switch (i12) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n
    public final String toString() {
        String str = "";
        String str2 = this.f407660g ? "reified " : "";
        if (o() != Variance.f410069d) {
            str = o() + " ";
        }
        return str2 + str + getName();
    }
}
