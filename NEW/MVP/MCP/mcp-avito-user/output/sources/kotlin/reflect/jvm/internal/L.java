package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.N;
import kotlin.reflect.n;
import kotlin.reflect.p;

/* compiled from: KProperty1Impl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/L;", "T", "V", "Lkotlin/reflect/p;", "Lkotlin/reflect/jvm/internal/N;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class L<T, V> extends N<V> implements kotlin.reflect.p<T, V> {

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Object f407027o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Object f407028p;

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/L$a;", "T", "V", "Lkotlin/reflect/jvm/internal/N$c;", "Lkotlin/reflect/p$b;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, V> extends N.c<V> implements p.b<T, V> {

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final L<T, V> f407029k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k L<T, ? extends V> l12) {
            this.f407029k = l12;
        }

        @Override // Y41.l
        public final V invoke(T t12) {
            return this.f407029k.get(t12);
        }

        @Override // kotlin.reflect.jvm.internal.N.a
        public final N s() {
            return this.f407029k;
        }
    }

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "V", "Lkotlin/reflect/jvm/internal/L$a;", "invoke", "()Lkotlin/reflect/jvm/internal/L$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<a<T, ? extends V>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ L<T, V> f407030l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(L<T, ? extends V> l12) {
            super(0);
            this.f407030l = l12;
        }

        @Override // Y41.a
        public final Object invoke() {
            return new a(this.f407030l);
        }
    }

    /* compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Member;", "T", "V", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Member> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ L<T, V> f407031l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(L<T, ? extends V> l12) {
            super(0);
            this.f407031l = l12;
        }

        @Override // Y41.a
        public final Member invoke() {
            return this.f407031l.r();
        }
    }

    public L(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.impl.L l12) {
        super(kDeclarationContainerImpl, l12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406615c;
        this.f407027o = C42727D.b(lazyThreadSafetyMode, new b(this));
        this.f407028p = C42727D.b(lazyThreadSafetyMode, new c(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.p
    public final V get(T t12) {
        return ((a) this.f407027o.getValue()).call(t12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.p
    @Y61.l
    public final Object getDelegate(T t12) {
        return s((Member) this.f407028p.getValue(), t12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.n
    public final n.c getGetter() {
        return (a) this.f407027o.getValue();
    }

    @Override // Y41.l
    public final V invoke(T t12) {
        return get(t12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.N
    public final N.c u() {
        return (a) this.f407027o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.n
    public final p.b getGetter() {
        return (a) this.f407027o.getValue();
    }

    public L(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k String str, @Y61.k String str2, @Y61.l Object obj) {
        super(kDeclarationContainerImpl, str, str2, null, obj);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406615c;
        this.f407027o = C42727D.b(lazyThreadSafetyMode, new b(this));
        this.f407028p = C42727D.b(lazyThreadSafetyMode, new c(this));
    }
}
