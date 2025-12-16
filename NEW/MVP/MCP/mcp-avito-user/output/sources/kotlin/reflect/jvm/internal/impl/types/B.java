package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C42822w;

/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* loaded from: classes8.dex */
public final class B extends A0 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f410004d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0 f410005b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0 f410006c;

    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public B(A0 a02, A0 a03, C42822w c42822w) {
        this.f410005b = a02;
        this.f410006c = a03;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    public final boolean a() {
        return this.f410005b.a() || this.f410006c.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    public final boolean b() {
        return this.f410005b.b() || this.f410006c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g c(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        return this.f410006c.c(this.f410005b.c(gVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    @Y61.l
    public final x0 d(@Y61.k O o12) {
        x0 x0VarD = this.f410005b.d(o12);
        return x0VarD == null ? this.f410006c.d(o12) : x0VarD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    @Y61.k
    public final O f(@Y61.k O o12, @Y61.k Variance variance) {
        return this.f410006c.f(this.f410005b.f(o12, variance), variance);
    }
}
