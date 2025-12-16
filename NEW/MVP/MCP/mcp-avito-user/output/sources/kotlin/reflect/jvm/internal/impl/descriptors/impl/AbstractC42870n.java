package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;

/* compiled from: DeclarationDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42870n extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.b implements InterfaceC42882k {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f f407684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42870n(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(gVar);
        if (gVar == null) {
            L(0);
            throw null;
        }
        if (fVar == null) {
            L(1);
            throw null;
        }
        this.f407684c = fVar;
    }

    public static /* synthetic */ void L(int i12) {
        String str = (i12 == 2 || i12 == 3 || i12 == 5 || i12 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 2 || i12 == 3 || i12 == 5 || i12 == 6) ? 2 : 3];
        switch (i12) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i12 == 2) {
            objArr[1] = "getName";
        } else if (i12 == 3) {
            objArr[1] = "getOriginal";
        } else if (i12 == 5 || i12 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i12 != 2 && i12 != 3) {
            if (i12 == 4) {
                objArr[2] = "toString";
            } else if (i12 != 5 && i12 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i12 != 2 && i12 != 3 && i12 != 5 && i12 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Y61.k
    public static String N(@Y61.k InterfaceC42882k interfaceC42882k) {
        try {
            String str = kotlin.reflect.jvm.internal.impl.renderer.b.f409471d.x(interfaceC42882k) + "[" + interfaceC42882k.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC42882k)) + "]";
            if (str != null) {
                return str;
            }
            L(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = interfaceC42882k.getClass().getSimpleName() + " " + interfaceC42882k.getName();
            if (str2 != null) {
                return str2;
            }
            L(6);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.G
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f fVar = this.f407684c;
        if (fVar != null) {
            return fVar;
        }
        L(2);
        throw null;
    }

    public String toString() {
        return N(this);
    }

    @Y61.k
    /* renamed from: a */
    public InterfaceC42882k n0() {
        return this;
    }
}
