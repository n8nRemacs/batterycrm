package kotlin.reflect.jvm.internal;

import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.N;
import kotlin.reflect.l;

/* compiled from: KProperty1Impl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/D;", "T", "V", "Lkotlin/reflect/jvm/internal/L;", "Lkotlin/reflect/l;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D<T, V> extends L<T, V> implements kotlin.reflect.l<T, V> {

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Object f406980q;

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/D$a;", "T", "V", "Lkotlin/reflect/jvm/internal/N$d;", "Lkotlin/reflect/l$b;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, V> extends N.d<V> implements l.b<T, V> {

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final D<T, V> f406981k;

        public a(@Y61.k D<T, V> d12) {
            this.f406981k = d12;
        }

        @Override // Y41.p
        public final G0 invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            this.f406981k.e(obj, obj2);
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.N.a
        public final N s() {
            return this.f406981k;
        }
    }

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "V", "Lkotlin/reflect/jvm/internal/D$a;", "invoke", "()Lkotlin/reflect/jvm/internal/D$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<a<T, V>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ D<T, V> f406982l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D<T, V> d12) {
            super(0);
            this.f406982l = d12;
        }

        @Override // Y41.a
        public final Object invoke() {
            return new a(this.f406982l);
        }
    }

    public D(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k String str, @Y61.k String str2, @Y61.l Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        this.f406980q = C42727D.b(LazyThreadSafetyMode.f406615c, new b(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.j
    public final j.a c() {
        return (a) this.f406980q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.l
    public final void e(T t12, V v12) throws IllegalCallableAccessException {
        ((a) this.f406980q.getValue()).call(t12, v12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.l, kotlin.reflect.j
    public final l.b c() {
        return (a) this.f406980q.getValue();
    }

    public D(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.impl.L l12) {
        super(kDeclarationContainerImpl, l12);
        this.f406980q = C42727D.b(LazyThreadSafetyMode.f406615c, new b(this));
    }
}
