package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: AnnotatedImpl.java */
/* loaded from: classes8.dex */
public class b implements a {

    /* renamed from: b, reason: collision with root package name */
    public final g f407512b;

    public b(@Y61.k g gVar) {
        if (gVar != null) {
            this.f407512b = gVar;
        } else {
            L(0);
            throw null;
        }
    }

    public static /* synthetic */ void L(int i12) {
        String str = i12 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i12 != 1 ? 3 : 2];
        if (i12 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i12 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i12 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i12 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @Y61.k
    public g getAnnotations() {
        g gVar = this.f407512b;
        if (gVar != null) {
            return gVar;
        }
        L(1);
        throw null;
    }
}
