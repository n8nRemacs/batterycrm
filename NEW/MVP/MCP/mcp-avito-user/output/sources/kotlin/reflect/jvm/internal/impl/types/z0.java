package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: TypeProjectionImpl.java */
/* loaded from: classes8.dex */
public class z0 extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Variance f410270a;

    /* renamed from: b, reason: collision with root package name */
    public final O f410271b;

    public z0(@Y61.k O o12, @Y61.k Variance variance) {
        if (variance == null) {
            d(0);
            throw null;
        }
        if (o12 == null) {
            d(1);
            throw null;
        }
        this.f410270a = variance;
        this.f410271b = o12;
    }

    public static /* synthetic */ void d(int i12) {
        String str = (i12 == 4 || i12 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 4 || i12 == 5) ? 2 : 3];
        switch (i12) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i12 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i12 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i12 == 3) {
            objArr[2] = "replaceType";
        } else if (i12 != 4 && i12 != 5) {
            if (i12 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i12 != 4 && i12 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x0
    @Y61.k
    public final Variance a() {
        Variance variance = this.f410270a;
        if (variance != null) {
            return variance;
        }
        d(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x0
    @Y61.k
    public final x0 b(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        if (iVar != null) {
            return new z0(iVar.c(this.f410271b), this.f410270a);
        }
        d(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x0
    public final boolean c() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x0
    @Y61.k
    public final O getType() {
        O o12 = this.f410271b;
        if (o12 != null) {
            return o12;
        }
        d(5);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z0(@Y61.k O o12) {
        this(o12, Variance.f410069d);
        if (o12 != null) {
        } else {
            d(2);
            throw null;
        }
    }
}
