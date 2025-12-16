package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: AnnotationsTypeAttribute.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42992q extends l0<C42992q> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f410238a;

    public C42992q(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        this.f410238a = gVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l0
    public final C42992q a(l0 l0Var) {
        C42992q c42992q = (C42992q) l0Var;
        if (c42992q == null) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g lVar = this.f410238a;
        boolean zIsEmpty = lVar.isEmpty();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = c42992q.f410238a;
        if (zIsEmpty) {
            lVar = gVar;
        } else if (!gVar.isEmpty()) {
            lVar = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l(lVar, gVar);
        }
        return new C42992q(lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l0
    @Y61.k
    public final kotlin.reflect.d<? extends C42992q> b() {
        return kotlin.jvm.internal.m0.f406844a.b(C42992q.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l0
    public final C42992q c(l0 l0Var) {
        if (kotlin.jvm.internal.L.f((C42992q) l0Var, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C42992q) {
            return kotlin.jvm.internal.L.f(((C42992q) obj).f410238a, this.f410238a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f410238a.hashCode();
    }
}
