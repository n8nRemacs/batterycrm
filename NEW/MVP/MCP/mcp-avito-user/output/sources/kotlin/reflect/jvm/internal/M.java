package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC42817q;
import kotlin.reflect.jvm.internal.N;
import kotlin.reflect.n;
import kotlin.reflect.q;

/* compiled from: KProperty2Impl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/M;", "D", "E", "V", "Lkotlin/reflect/q;", "Lkotlin/reflect/jvm/internal/N;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class M<D, E, V> extends N<V> implements kotlin.reflect.q<D, E, V> {

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Object f407032o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Object f407033p;

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/M$a;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/N$c;", "Lkotlin/reflect/q$b;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<D, E, V> extends N.c<V> implements q.b<D, E, V> {

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final M<D, E, V> f407034k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k M<D, E, ? extends V> m12) {
            this.f407034k = m12;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.p
        public final V invoke(D d12, E e12) {
            return ((a) this.f407034k.f407032o.getValue()).call(d12, e12);
        }

        @Override // kotlin.reflect.jvm.internal.N.a
        public final N s() {
            return this.f407034k;
        }
    }

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0006\b\u0002\u0010\u0002 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"D", "E", "V", "Lkotlin/reflect/jvm/internal/M$a;", "invoke", "()Lkotlin/reflect/jvm/internal/M$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<a<D, E, ? extends V>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ M<D, E, V> f407035l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(M<D, E, ? extends V> m12) {
            super(0);
            this.f407035l = m12;
        }

        @Override // Y41.a
        public final Object invoke() {
            return new a(this.f407035l);
        }
    }

    /* compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0006\b\u0002\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Member;", "D", "E", "V", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Member> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ M<D, E, V> f407036l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(M<D, E, ? extends V> m12) {
            super(0);
            this.f407036l = m12;
        }

        @Override // Y41.a
        public final Member invoke() {
            return this.f407036l.r();
        }
    }

    public M(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k String str, @Y61.k String str2) {
        super(kDeclarationContainerImpl, str, str2, null, AbstractC42817q.NO_RECEIVER);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406615c;
        this.f407032o = C42727D.b(lazyThreadSafetyMode, new b(this));
        this.f407033p = C42727D.b(lazyThreadSafetyMode, new c(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.n
    public final n.c getGetter() {
        return (a) this.f407032o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.p
    public final V invoke(D d12, E e12) {
        return ((a) this.f407032o.getValue()).call(d12, e12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.N
    public final N.c u() {
        return (a) this.f407032o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.n
    public final q.b getGetter() {
        return (a) this.f407032o.getValue();
    }

    public M(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.impl.L l12) {
        super(kDeclarationContainerImpl, l12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406615c;
        this.f407032o = C42727D.b(lazyThreadSafetyMode, new b(this));
        this.f407033p = C42727D.b(lazyThreadSafetyMode, new c(this));
    }
}
