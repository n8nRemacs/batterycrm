package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;

/* compiled from: DeclarationDescriptorNonRootImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42871o extends AbstractC42870n implements InterfaceC42883l {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42882k f407685d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final b0 f407686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42871o(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k b0 b0Var) {
        super(gVar, fVar);
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
        this.f407685d = interfaceC42882k;
        this.f407686e = b0Var;
    }

    public static /* synthetic */ void L(int i12) {
        String str = (i12 == 4 || i12 == 5 || i12 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 4 || i12 == 5 || i12 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i12 == 4) {
            objArr[1] = "getOriginal";
        } else if (i12 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i12 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i12 != 4 && i12 != 5 && i12 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i12 != 4 && i12 != 5 && i12 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Y61.k
    public b0 e() {
        b0 b0Var = this.f407686e;
        if (b0Var != null) {
            return b0Var;
        }
        L(6);
        throw null;
    }

    @Y61.k
    public InterfaceC42882k f() {
        InterfaceC42882k interfaceC42882k = this.f407685d;
        if (interfaceC42882k != null) {
            return interfaceC42882k;
        }
        L(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public InterfaceC42885n n0() {
        return this;
    }
}
