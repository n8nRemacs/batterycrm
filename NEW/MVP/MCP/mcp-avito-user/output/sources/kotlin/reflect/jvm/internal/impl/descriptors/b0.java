package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: SourceElement.java */
/* loaded from: classes8.dex */
public interface b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f407539a = new a();

    /* compiled from: SourceElement.java */
    public static class a implements b0 {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.b0
        @Y61.k
        public final c0 a() {
            c0 c0Var = c0.f407540a;
            if (c0Var != null) {
                return c0Var;
            }
            throw new IllegalStateException("@NotNull method kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1.getContainingFile must not return null");
        }

        public final String toString() {
            return "NO_SOURCE";
        }
    }

    @Y61.k
    c0 a();
}
