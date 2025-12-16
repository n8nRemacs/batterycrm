package kotlin.reflect.jvm.internal.impl.types;

import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StarProjectionImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42974e0 extends y0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.g0 f410131a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f410132b = C42727D.b(LazyThreadSafetyMode.f406615c, new a());

    /* compiled from: StarProjectionImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.e0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<O> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final O invoke() {
            return C42978g0.a(C42974e0.this.f410131a);
        }
    }

    public C42974e0(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var) {
        this.f410131a = g0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x0
    @Y61.k
    public final Variance a() {
        return Variance.f410071f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x0
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.impl.types.x0
    @Y61.k
    public final O getType() {
        return (O) this.f410132b.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.x0
    @Y61.k
    public final x0 b(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return this;
    }
}
