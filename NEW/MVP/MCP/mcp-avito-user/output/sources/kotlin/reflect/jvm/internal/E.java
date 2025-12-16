package kotlin.reflect.jvm.internal;

import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.N;
import kotlin.reflect.m;

/* compiled from: KProperty2Impl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/E;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/M;", "Lkotlin/reflect/m;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class E<D, E, V> extends M<D, E, V> implements kotlin.reflect.m<D, E, V> {

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Object f406983q;

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/E$a;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/N$d;", "Lkotlin/reflect/m$b;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<D, E, V> extends N.d<V> implements m.b<D, E, V> {

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final E<D, E, V> f406984k;

        public a(@Y61.k E<D, E, V> e12) {
            this.f406984k = e12;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.q
        public final G0 invoke(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            ((a) this.f406984k.f406983q.getValue()).call(obj, obj2, obj3);
            return G0.f406611a;
        }

        @Override // kotlin.reflect.jvm.internal.N.a
        public final N s() {
            return this.f406984k;
        }
    }

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"D", "E", "V", "Lkotlin/reflect/jvm/internal/E$a;", "invoke", "()Lkotlin/reflect/jvm/internal/E$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<a<D, E, V>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ E<D, E, V> f406985l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(E<D, E, V> e12) {
            super(0);
            this.f406985l = e12;
        }

        @Override // Y41.a
        public final Object invoke() {
            return new a(this.f406985l);
        }
    }

    public E(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k String str, @Y61.k String str2) {
        super(kDeclarationContainerImpl, str, str2);
        this.f406983q = C42727D.b(LazyThreadSafetyMode.f406615c, new b(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.j
    public final j.a c() {
        return (a) this.f406983q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.m, kotlin.reflect.j
    public final m.b c() {
        return (a) this.f406983q.getValue();
    }

    public E(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.impl.L l12) {
        super(kDeclarationContainerImpl, l12);
        this.f406983q = C42727D.b(LazyThreadSafetyMode.f406615c, new b(this));
    }
}
