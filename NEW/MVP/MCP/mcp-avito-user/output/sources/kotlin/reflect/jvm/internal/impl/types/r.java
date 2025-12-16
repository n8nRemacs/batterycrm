package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* compiled from: AnnotationsTypeAttribute.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f410239a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.util.n f410240b;

    static {
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f410239a = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.c(r.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};
        f410240b = new kotlin.reflect.jvm.internal.impl.util.n(n0.f410236c.b(n0Var.b(C42992q.class)));
    }

    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g a(@Y61.k n0 n0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar;
        C42992q c42992q = (C42992q) f410240b.getValue(n0Var, f410239a[0]);
        if (c42992q != null && (gVar = c42992q.f410238a) != null) {
            return gVar;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        return g.a.f407524b;
    }
}
