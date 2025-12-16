package kotlin.reflect.jvm.internal;

import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.N;
import kotlin.reflect.n;
import kotlin.reflect.o;

/* compiled from: KProperty0Impl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/I;", "V", "Lkotlin/reflect/o;", "Lkotlin/reflect/jvm/internal/N;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class I<V> extends N<V> implements kotlin.reflect.o<V> {

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Object f407012o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Object f407013p;

    /* compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/I$a;", "R", "Lkotlin/reflect/jvm/internal/N$c;", "Lkotlin/reflect/o$b;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<R> extends N.c<R> implements o.b<R> {

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final I<R> f407014k;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k I<? extends R> i12) {
            this.f407014k = i12;
        }

        @Override // Y41.a
        public final R invoke() {
            return this.f407014k.get();
        }

        @Override // kotlin.reflect.jvm.internal.N.a
        public final N s() {
            return this.f407014k;
        }
    }

    public I(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.impl.L l12) {
        super(kDeclarationContainerImpl, l12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406615c;
        this.f407012o = C42727D.b(lazyThreadSafetyMode, new J(this));
        this.f407013p = C42727D.b(lazyThreadSafetyMode, new K(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.o
    public final V get() {
        return (V) ((a) this.f407012o.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.n
    public final n.c getGetter() {
        return (a) this.f407012o.getValue();
    }

    @Override // Y41.a
    public final V invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.N
    public final N.c u() {
        return (a) this.f407012o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.n
    public final o.b getGetter() {
        return (a) this.f407012o.getValue();
    }

    public I(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k String str, @Y61.k String str2, @Y61.l Object obj) {
        super(kDeclarationContainerImpl, str, str2, null, obj);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406615c;
        this.f407012o = C42727D.b(lazyThreadSafetyMode, new J(this));
        this.f407013p = C42727D.b(lazyThreadSafetyMode, new K(this));
    }
}
