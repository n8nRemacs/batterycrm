package kotlin.reflect.jvm.internal;

import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.N;
import kotlin.reflect.k;

/* compiled from: KProperty0Impl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/B;", "V", "Lkotlin/reflect/jvm/internal/I;", "Lkotlin/reflect/k;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class B<V> extends I<V> implements kotlin.reflect.k<V> {

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Object f406977q;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/B$a;", "R", "Lkotlin/reflect/jvm/internal/N$d;", "Lkotlin/reflect/k$b;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<R> extends N.d<R> implements k.b<R> {

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final B<R> f406978k;

        public a(@Y61.k B<R> b12) {
            this.f406978k = b12;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.l
        public final G0 invoke(Object obj) throws IllegalCallableAccessException {
            ((a) this.f406978k.f406977q.getValue()).call(obj);
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.N.a
        public final N s() {
            return this.f406978k;
        }
    }

    public B(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.impl.L l12) {
        super(kDeclarationContainerImpl, l12);
        this.f406977q = C42727D.b(LazyThreadSafetyMode.f406615c, new C(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.j
    public final j.a c() {
        return (a) this.f406977q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.k, kotlin.reflect.j
    public final k.b c() {
        return (a) this.f406977q.getValue();
    }

    public B(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k String str, @Y61.k String str2, @Y61.l Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        this.f406977q = C42727D.b(LazyThreadSafetyMode.f406615c, new C(this));
    }
}
