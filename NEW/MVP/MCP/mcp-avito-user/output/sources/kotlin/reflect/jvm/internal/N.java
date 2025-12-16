package kotlin.reflect.jvm.internal;

import androidx.compose.runtime.C22026a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC42817q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.AbstractC43002k;
import kotlin.reflect.jvm.internal.Z;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.n;

/* compiled from: KPropertyImpl.kt */
@s0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0013\u0014\u0015\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/jvm/internal/N;", "V", "Lkotlin/reflect/jvm/internal/l;", "Lkotlin/reflect/n;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "descriptorInitialValue", "", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "a", "b", "c", "d", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class N<V> extends AbstractC43003l<V> implements kotlin.reflect.n<V> {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final Object f407037n;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final KDeclarationContainerImpl f407038h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f407039i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f407040j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Object f407041k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Object f407042l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Z.a<kotlin.reflect.jvm.internal.impl.descriptors.U> f407043m;

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/N$a;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/l;", "Lkotlin/reflect/n$a;", "Lkotlin/reflect/i;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/descriptors/T;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a<PropertyType, ReturnType> extends AbstractC43003l<ReturnType> implements kotlin.reflect.i<ReturnType>, n.a<PropertyType> {
        @Override // kotlin.reflect.i
        public final boolean isExternal() {
            return r().isExternal();
        }

        @Override // kotlin.reflect.i
        public final boolean isInfix() {
            return r().isInfix();
        }

        @Override // kotlin.reflect.i
        public final boolean isInline() {
            return r().isInline();
        }

        @Override // kotlin.reflect.i
        public final boolean isOperator() {
            return r().isOperator();
        }

        @Override // kotlin.reflect.c, kotlin.reflect.i
        public final boolean isSuspend() {
            return r().isSuspend();
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43003l
        @Y61.k
        /* renamed from: l */
        public final KDeclarationContainerImpl getF406967h() {
            return s().f407038h;
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43003l
        @Y61.l
        public final kotlin.reflect.jvm.internal.calls.e<?> m() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43003l
        public final boolean q() {
            return s().q();
        }

        @Y61.k
        public abstract kotlin.reflect.jvm.internal.impl.descriptors.T r();

        @Y61.k
        public abstract N<PropertyType> s();
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/N$b;", "", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/N$c;", "V", "Lkotlin/reflect/jvm/internal/N$a;", "Lkotlin/reflect/n$c;", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c<V> extends a<V, V> implements n.c<V> {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.n<Object>[] f407044j;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final Z.a f407045h = Z.a(null, new b(this));

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final Object f407046i = C42727D.b(LazyThreadSafetyMode.f406615c, new a(this));

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/calls/e;", "invoke", "()Lkotlin/reflect/jvm/internal/calls/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.calls.e<?>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ c<V> f407047l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? extends V> cVar) {
                super(0);
                this.f407047l = cVar;
            }

            @Override // Y41.a
            public final kotlin.reflect.jvm.internal.calls.e<?> invoke() {
                return Q.a(this.f407047l, true);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/V;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/impl/descriptors/V;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.impl.descriptors.V> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ c<V> f407048l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(c<? extends V> cVar) {
                super(0);
                this.f407048l = cVar;
            }

            @Override // Y41.a
            public final kotlin.reflect.jvm.internal.impl.descriptors.V invoke() {
                c<V> cVar = this.f407048l;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.M getter = cVar.s().n().getGetter();
                if (getter != null) {
                    return getter;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.U uN2 = cVar.s().n();
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
                return kotlin.reflect.jvm.internal.impl.resolve.i.c(uN2, g.a.f407524b);
            }
        }

        static {
            n0 n0Var = m0.f406844a;
            f407044j = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
        }

        public final boolean equals(@Y61.l Object obj) {
            return (obj instanceof c) && kotlin.jvm.internal.L.f(s(), ((c) obj).s());
        }

        @Override // kotlin.reflect.c
        @Y61.k
        /* renamed from: getName */
        public final String getF407039i() {
            return C22026a.c(new StringBuilder("<get-"), s().f407039i, '>');
        }

        public final int hashCode() {
            return s().hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // kotlin.reflect.jvm.internal.AbstractC43003l
        @Y61.k
        public final kotlin.reflect.jvm.internal.calls.e<?> j() {
            return (kotlin.reflect.jvm.internal.calls.e) this.f407046i.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43003l
        public final CallableMemberDescriptor n() {
            kotlin.reflect.n<Object> nVar = f407044j[0];
            return (kotlin.reflect.jvm.internal.impl.descriptors.V) this.f407045h.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.N.a
        public final kotlin.reflect.jvm.internal.impl.descriptors.T r() {
            kotlin.reflect.n<Object> nVar = f407044j[0];
            return (kotlin.reflect.jvm.internal.impl.descriptors.V) this.f407045h.invoke();
        }

        @Y61.k
        public final String toString() {
            return "getter of " + s();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/N$d;", "V", "Lkotlin/reflect/jvm/internal/N$a;", "Lkotlin/G0;", "Lkotlin/reflect/j$a;", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d<V> extends a<V, G0> implements j.a<V> {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.n<Object>[] f407049j;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final Z.a f407050h = Z.a(null, new b(this));

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final Object f407051i = C42727D.b(LazyThreadSafetyMode.f406615c, new a(this));

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/calls/e;", "invoke", "()Lkotlin/reflect/jvm/internal/calls/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.calls.e<?>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ d<V> f407052l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d<V> dVar) {
                super(0);
                this.f407052l = dVar;
            }

            @Override // Y41.a
            public final kotlin.reflect.jvm.internal.calls.e<?> invoke() {
                return Q.a(this.f407052l, false);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/W;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/impl/descriptors/W;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.impl.descriptors.W> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ d<V> f407053l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d<V> dVar) {
                super(0);
                this.f407053l = dVar;
            }

            @Override // Y41.a
            public final kotlin.reflect.jvm.internal.impl.descriptors.W invoke() {
                d<V> dVar = this.f407053l;
                kotlin.reflect.jvm.internal.impl.descriptors.W wC2 = dVar.s().n().c();
                if (wC2 != null) {
                    return wC2;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.U uN2 = dVar.s().n();
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
                g.a.C11652a c11652a = g.a.f407524b;
                return kotlin.reflect.jvm.internal.impl.resolve.i.d(uN2, c11652a, c11652a);
            }
        }

        static {
            n0 n0Var = m0.f406844a;
            f407049j = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
        }

        public final boolean equals(@Y61.l Object obj) {
            return (obj instanceof d) && kotlin.jvm.internal.L.f(s(), ((d) obj).s());
        }

        @Override // kotlin.reflect.c
        @Y61.k
        /* renamed from: getName */
        public final String getF407039i() {
            return C22026a.c(new StringBuilder("<set-"), s().f407039i, '>');
        }

        public final int hashCode() {
            return s().hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // kotlin.reflect.jvm.internal.AbstractC43003l
        @Y61.k
        public final kotlin.reflect.jvm.internal.calls.e<?> j() {
            return (kotlin.reflect.jvm.internal.calls.e) this.f407051i.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43003l
        public final CallableMemberDescriptor n() {
            kotlin.reflect.n<Object> nVar = f407049j[0];
            return (kotlin.reflect.jvm.internal.impl.descriptors.W) this.f407050h.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.N.a
        public final kotlin.reflect.jvm.internal.impl.descriptors.T r() {
            kotlin.reflect.n<Object> nVar = f407049j[0];
            return (kotlin.reflect.jvm.internal.impl.descriptors.W) this.f407050h.invoke();
        }

        @Y61.k
        public final String toString() {
            return "setter of " + s();
        }
    }

    static {
        new b(null);
        f407037n = new Object();
    }

    public N(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, kotlin.reflect.jvm.internal.impl.descriptors.impl.L l12, Object obj) {
        this.f407038h = kDeclarationContainerImpl;
        this.f407039i = str;
        this.f407040j = str2;
        this.f407041k = obj;
        this.f407042l = C42727D.b(LazyThreadSafetyMode.f406615c, new P(this));
        this.f407043m = Z.a(l12, new O(this));
    }

    public final boolean equals(@Y61.l Object obj) {
        N<?> nC2 = i0.c(obj);
        return nC2 != null && kotlin.jvm.internal.L.f(this.f407038h, nC2.f407038h) && kotlin.jvm.internal.L.f(this.f407039i, nC2.f407039i) && kotlin.jvm.internal.L.f(this.f407040j, nC2.f407040j) && kotlin.jvm.internal.L.f(this.f407041k, nC2.f407041k);
    }

    @Override // kotlin.reflect.c
    @Y61.k
    /* renamed from: getName, reason: from getter */
    public final String getF407039i() {
        return this.f407039i;
    }

    public final int hashCode() {
        return this.f407040j.hashCode() + androidx.compose.foundation.H.d(this.f407038h.hashCode() * 31, 31, this.f407039i);
    }

    @Override // kotlin.reflect.n
    public final boolean isConst() {
        return n().isConst();
    }

    @Override // kotlin.reflect.n
    public final boolean isLateinit() {
        return n().D0();
    }

    @Override // kotlin.reflect.c, kotlin.reflect.i
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC43003l
    @Y61.k
    public final kotlin.reflect.jvm.internal.calls.e<?> j() {
        return u().j();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC43003l
    @Y61.k
    /* renamed from: l, reason: from getter */
    public final KDeclarationContainerImpl getF406967h() {
        return this.f407038h;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC43003l
    @Y61.l
    public final kotlin.reflect.jvm.internal.calls.e<?> m() {
        u().getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC43003l
    public final boolean q() {
        return !kotlin.jvm.internal.L.f(this.f407041k, AbstractC42817q.NO_RECEIVER);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.C] */
    @Y61.l
    public final Member r() {
        if (!n().r0()) {
            return null;
        }
        d0 d0Var = d0.f407150a;
        kotlin.reflect.jvm.internal.impl.descriptors.U uN2 = n();
        d0Var.getClass();
        AbstractC43002k abstractC43002kB = d0.b(uN2);
        if (abstractC43002kB instanceof AbstractC43002k.c) {
            AbstractC43002k.c cVar = (AbstractC43002k.c) abstractC43002kB;
            JvmProtoBuf.d dVar = cVar.f410389c;
            if ((dVar.f409221c & 16) == 16) {
                JvmProtoBuf.c cVar2 = dVar.f409226h;
                int i12 = cVar2.f409210c;
                if ((i12 & 1) != 1 || (i12 & 2) != 2) {
                    return null;
                }
                int i13 = cVar2.f409211d;
                kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar3 = cVar.f410390d;
                return this.f407038h.i(cVar3.getString(i13), cVar3.getString(cVar2.f409212e));
            }
        }
        return (Field) this.f407042l.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public final Object s(@Y61.l Member member, @Y61.l Object obj) throws IllegalPropertyDelegateAccessException, SecurityException {
        try {
            Object obj2 = f407037n;
            if ((obj == obj2 || obj2 == null) && n().H() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objA = q() ? kotlin.reflect.jvm.internal.calls.l.a(this.f407041k, n()) : obj;
            if (objA == obj2) {
                objA = null;
            }
            if (!q()) {
                obj = null;
            }
            if (obj == obj2) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(kotlin.reflect.jvm.b.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objA);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, new Object[0]);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objA == null) {
                    objA = i0.e(((Method) member).getParameterTypes()[0]);
                }
                return method.invoke(null, objA);
            }
            if (length == 2) {
                Method method2 = (Method) member;
                if (obj == null) {
                    obj = i0.e(((Method) member).getParameterTypes()[1]);
                }
                return method2.invoke(null, objA, obj);
            }
            throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
        } catch (IllegalAccessException e12) {
            throw new IllegalPropertyDelegateAccessException("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e12);
        }
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC43003l
    @Y61.k
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final kotlin.reflect.jvm.internal.impl.descriptors.U n() {
        return this.f407043m.invoke();
    }

    @Y61.k
    public final String toString() {
        b0 b0Var = b0.f407078a;
        kotlin.reflect.jvm.internal.impl.descriptors.U uN2 = n();
        b0Var.getClass();
        return b0.c(uN2);
    }

    @Y61.k
    public abstract c<V> u();

    /* JADX WARN: Illegal instructions before constructor call */
    public N(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.impl.L l12) {
        String strB = l12.getName().b();
        d0.f407150a.getClass();
        this(kDeclarationContainerImpl, strB, d0.b(l12).getF410392f(), l12, AbstractC42817q.NO_RECEIVER);
    }
}
