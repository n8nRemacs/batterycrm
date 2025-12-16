package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.Z;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42868l;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42873q;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42952i;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42956m;
import kotlin.text.C43066x;

/* compiled from: KClassImpl.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001\u0015R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/r;", "", "T", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/d;", "Lkotlin/reflect/jvm/internal/v;", "Lkotlin/reflect/jvm/internal/W;", "Lkotlin/reflect/jvm/internal/impl/name/b;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/d;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class r<T> extends KDeclarationContainerImpl implements kotlin.reflect.d<T>, InterfaceC43012v, W {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f410412g = 0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Class<T> f410413e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f410414f = C42727D.b(LazyThreadSafetyMode.f406615c, new c(this));

    /* compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/r$a;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$b;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends KDeclarationContainerImpl.b {

        /* renamed from: q, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.n<Object>[] f410415q;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Z.a f410416c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Z.a f410417d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Z.a f410418e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Z.a f410419f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Z.a f410420g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final Object f410421h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final Z.a f410422i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final Z.a f410423j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final Z.a f410424k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.k
        public final Z.a f410425l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final Z.a f410426m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final Z.a f410427n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public final Z.a f410428o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.k
        public final Z.a f410429p;

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.reflect.jvm.internal.r$a$a, reason: collision with other inner class name */
        public static final class C11704a extends kotlin.jvm.internal.N implements Y41.a<List<? extends AbstractC43003l<?>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T>.a f410430l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11704a(r<T>.a aVar) {
                super(0);
                this.f410430l = aVar;
            }

            @Override // Y41.a
            public final List<? extends AbstractC43003l<?>> invoke() {
                r<T>.a aVar = this.f410430l;
                aVar.getClass();
                kotlin.reflect.n<Object>[] nVarArr = a.f410415q;
                kotlin.reflect.n<Object> nVar = nVarArr[13];
                Collection collection = (Collection) aVar.f410427n.invoke();
                kotlin.reflect.n<Object> nVar2 = nVarArr[14];
                return C42745f0.h0((Collection) aVar.f410428o.invoke(), collection);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends kotlin.jvm.internal.N implements Y41.a<List<? extends AbstractC43003l<?>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T>.a f410431l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(r<T>.a aVar) {
                super(0);
                this.f410431l = aVar;
            }

            @Override // Y41.a
            public final List<? extends AbstractC43003l<?>> invoke() {
                r<T>.a aVar = this.f410431l;
                aVar.getClass();
                kotlin.reflect.n<Object>[] nVarArr = a.f410415q;
                kotlin.reflect.n<Object> nVar = nVarArr[9];
                Collection collection = (Collection) aVar.f410423j.invoke();
                kotlin.reflect.n<Object> nVar2 = nVarArr[11];
                return C42745f0.h0((Collection) aVar.f410425l.invoke(), collection);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class c extends kotlin.jvm.internal.N implements Y41.a<List<? extends AbstractC43003l<?>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T>.a f410432l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(r<T>.a aVar) {
                super(0);
                this.f410432l = aVar;
            }

            @Override // Y41.a
            public final List<? extends AbstractC43003l<?>> invoke() {
                kotlin.reflect.n<Object>[] nVarArr = a.f410415q;
                r<T>.a aVar = this.f410432l;
                aVar.getClass();
                kotlin.reflect.n<Object>[] nVarArr2 = a.f410415q;
                kotlin.reflect.n<Object> nVar = nVarArr2[10];
                Collection collection = (Collection) aVar.f410424k.invoke();
                kotlin.reflect.n<Object> nVar2 = nVarArr2[12];
                return C42745f0.h0((Collection) aVar.f410426m.invoke(), collection);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class d extends kotlin.jvm.internal.N implements Y41.a<List<? extends Annotation>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T>.a f410433l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(r<T>.a aVar) {
                super(0);
                this.f410433l = aVar;
            }

            @Override // Y41.a
            public final List<? extends Annotation> invoke() {
                return i0.d(this.f410433l.a());
            }
        }

        /* compiled from: KClassImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/i;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class e extends kotlin.jvm.internal.N implements Y41.a<List<? extends kotlin.reflect.i<? extends T>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T> f410434l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(r<T> rVar) {
                super(0);
                this.f410434l = rVar;
            }

            @Override // Y41.a
            public final Object invoke() {
                r<T> rVar = this.f410434l;
                Collection<InterfaceC42881j> collectionJ = rVar.j();
                ArrayList arrayList = new ArrayList(C42745f0.q(collectionJ, 10));
                Iterator<T> it = collectionJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(new A(rVar, (InterfaceC42881j) it.next()));
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class f extends kotlin.jvm.internal.N implements Y41.a<List<? extends AbstractC43003l<?>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T>.a f410435l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(r<T>.a aVar) {
                super(0);
                this.f410435l = aVar;
            }

            @Override // Y41.a
            public final List<? extends AbstractC43003l<?>> invoke() {
                r<T>.a aVar = this.f410435l;
                aVar.getClass();
                kotlin.reflect.n<Object>[] nVarArr = a.f410415q;
                kotlin.reflect.n<Object> nVar = nVarArr[9];
                Collection collection = (Collection) aVar.f410423j.invoke();
                kotlin.reflect.n<Object> nVar2 = nVarArr[10];
                return C42745f0.h0((Collection) aVar.f410424k.invoke(), collection);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/Collection;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class g extends kotlin.jvm.internal.N implements Y41.a<Collection<? extends AbstractC43003l<?>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T> f410436l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(r<T> rVar) {
                super(0);
                this.f410436l = rVar;
            }

            @Override // Y41.a
            public final Collection<? extends AbstractC43003l<?>> invoke() {
                r<T> rVar = this.f410436l;
                return rVar.m(rVar.getDescriptor().q().n(), KDeclarationContainerImpl.MemberBelonginess.f407020b);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/Collection;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class h extends kotlin.jvm.internal.N implements Y41.a<Collection<? extends AbstractC43003l<?>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T> f410437l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(r<T> rVar) {
                super(0);
                this.f410437l = rVar;
            }

            @Override // Y41.a
            public final Collection<? extends AbstractC43003l<?>> invoke() {
                r<T> rVar = this.f410437l;
                return rVar.m(rVar.getDescriptor().P(), KDeclarationContainerImpl.MemberBelonginess.f407020b);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlin/reflect/jvm/internal/impl/descriptors/d;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/impl/descriptors/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class i extends kotlin.jvm.internal.N implements Y41.a<InterfaceC42851d> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T> f410438l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(r<T> rVar) {
                super(0);
                this.f410438l = rVar;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
            @Override // Y41.a
            public final InterfaceC42851d invoke() {
                InterfaceC42851d interfaceC42851dA;
                C42868l c42868lV;
                KotlinClassHeader kotlinClassHeader;
                int i12 = r.f410412g;
                r<T> rVar = this.f410438l;
                kotlin.reflect.jvm.internal.impl.name.b bVarW = rVar.w();
                a aVar = (a) rVar.f410414f.getValue();
                aVar.getClass();
                kotlin.reflect.n<Object> nVar = KDeclarationContainerImpl.b.f407024b[0];
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k kVar = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k) aVar.f407025a.invoke();
                C42954k c42954k = kVar.f407816a;
                kotlin.reflect.jvm.internal.impl.descriptors.E e12 = c42954k.f409915b;
                boolean z12 = bVarW.f409241c;
                KotlinClassHeader.Kind kind = null;
                Class<T> cls = rVar.f410413e;
                if (z12 && cls.isAnnotationPresent(Metadata.class)) {
                    C42952i.b bVar = C42952i.f409904c;
                    interfaceC42851dA = c42954k.f409934u.a(bVarW, null);
                } else {
                    interfaceC42851dA = C42904w.a(e12, bVarW);
                }
                if (interfaceC42851dA != null) {
                    return interfaceC42851dA;
                }
                if (cls.isSynthetic()) {
                    c42868lV = r.v(bVarW, kVar);
                } else {
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.f407808c.getClass();
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f fVarA = f.a.a(cls);
                    if (fVarA != null && (kotlinClassHeader = fVarA.f407810b) != null) {
                        kind = kotlinClassHeader.f408489a;
                    }
                    switch (kind == null ? -1 : b.f410452a[kind.ordinal()]) {
                        case -1:
                        case 6:
                            throw new X("Unresolved class: " + cls + " (kind = " + kind + ')');
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            c42868lV = r.v(bVarW, kVar);
                            break;
                        case 5:
                            throw new X("Unknown class: " + cls + " (kind = " + kind + ')');
                    }
                }
                return c42868lV;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/Collection;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class j extends kotlin.jvm.internal.N implements Y41.a<Collection<? extends AbstractC43003l<?>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T> f410439l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(r<T> rVar) {
                super(0);
                this.f410439l = rVar;
            }

            @Override // Y41.a
            public final Collection<? extends AbstractC43003l<?>> invoke() {
                r<T> rVar = this.f410439l;
                return rVar.m(rVar.getDescriptor().q().n(), KDeclarationContainerImpl.MemberBelonginess.f407021c);
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/Collection;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class k extends kotlin.jvm.internal.N implements Y41.a<Collection<? extends AbstractC43003l<?>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T> f410440l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(r<T> rVar) {
                super(0);
                this.f410440l = rVar;
            }

            @Override // Y41.a
            public final Collection<? extends AbstractC43003l<?>> invoke() {
                r<T> rVar = this.f410440l;
                return rVar.m(rVar.getDescriptor().P(), KDeclarationContainerImpl.MemberBelonginess.f407021c);
            }
        }

        /* compiled from: KClassImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/r;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class l extends kotlin.jvm.internal.N implements Y41.a<List<? extends r<? extends Object>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T>.a f410441l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(r<T>.a aVar) {
                super(0);
                this.f410441l = aVar;
            }

            @Override // Y41.a
            public final List<? extends r<? extends Object>> invoke() {
                Collection collectionA = m.a.a(this.f410441l.a().f0(), null, 3);
                ArrayList arrayList = new ArrayList();
                for (T t12 : collectionA) {
                    if (!kotlin.reflect.jvm.internal.impl.resolve.j.m((InterfaceC42882k) t12)) {
                        arrayList.add(t12);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC42882k interfaceC42882k = (InterfaceC42882k) it.next();
                    InterfaceC42851d interfaceC42851d = interfaceC42882k instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42882k : null;
                    Class<?> clsI = interfaceC42851d != null ? i0.i(interfaceC42851d) : null;
                    r rVar = clsI != null ? new r(clsI) : null;
                    if (rVar != null) {
                        arrayList2.add(rVar);
                    }
                }
                return arrayList2;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class m extends kotlin.jvm.internal.N implements Y41.a<T> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T>.a f410442l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ r<T> f410443m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(r<T>.a aVar, r<T> rVar) {
                super(0);
                this.f410442l = aVar;
                this.f410443m = rVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
            @Override // Y41.a
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final T invoke() throws java.lang.NoSuchFieldException {
                /*
                    r5 = this;
                    kotlin.reflect.jvm.internal.r<T>$a r0 = r5.f410442l
                    kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.a()
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = r0.getKind()
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.f407418g
                    r3 = 0
                    if (r1 == r2) goto L10
                    return r3
                L10:
                    boolean r1 = r0.v0()
                    kotlin.reflect.jvm.internal.r<T> r2 = r5.f410443m
                    if (r1 == 0) goto L48
                    kotlin.reflect.jvm.internal.impl.builtins.c r1 = kotlin.reflect.jvm.internal.impl.builtins.c.f407192a
                    boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.j.l(r0)
                    if (r1 == 0) goto L35
                    java.util.LinkedHashSet r1 = kotlin.reflect.jvm.internal.impl.builtins.c.f407193b
                    kotlin.reflect.jvm.internal.impl.name.b r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(r0)
                    if (r4 == 0) goto L2d
                    kotlin.reflect.jvm.internal.impl.name.b r4 = r4.f()
                    goto L2e
                L2d:
                    r4 = r3
                L2e:
                    boolean r1 = kotlin.collections.C42745f0.r(r1, r4)
                    if (r1 == 0) goto L35
                    goto L48
                L35:
                    java.lang.Class<T> r1 = r2.f410413e
                    java.lang.Class r1 = r1.getEnclosingClass()
                    kotlin.reflect.jvm.internal.impl.name.f r0 = r0.getName()
                    java.lang.String r0 = r0.b()
                    java.lang.reflect.Field r0 = r1.getDeclaredField(r0)
                    goto L50
                L48:
                    java.lang.Class<T> r0 = r2.f410413e
                    java.lang.String r1 = "INSTANCE"
                    java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
                L50:
                    java.lang.Object r0 = r0.get(r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.r.a.m.invoke():java.lang.Object");
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class n extends kotlin.jvm.internal.N implements Y41.a<String> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T> f410444l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(r<T> rVar) {
                super(0);
                this.f410444l = rVar;
            }

            @Override // Y41.a
            public final String invoke() {
                r<T> rVar = this.f410444l;
                if (rVar.f410413e.isAnonymousClass()) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.name.b bVarW = rVar.w();
                if (bVarW.f409241c) {
                    return null;
                }
                return bVarW.b().b();
            }
        }

        /* compiled from: KClassImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/r;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class o extends kotlin.jvm.internal.N implements Y41.a<List<? extends r<? extends T>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T>.a f410445l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(r<T>.a aVar) {
                super(0);
                this.f410445l = aVar;
            }

            @Override // Y41.a
            public final Object invoke() {
                Collection<InterfaceC42851d> collectionQ0 = this.f410445l.a().q0();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = collectionQ0.iterator();
                while (it.hasNext()) {
                    Class<?> clsI = i0.i((InterfaceC42851d) it.next());
                    r rVar = clsI != null ? new r(clsI) : null;
                    if (rVar != null) {
                        arrayList.add(rVar);
                    }
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class p extends kotlin.jvm.internal.N implements Y41.a<String> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T> f410446l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ r<T>.a f410447m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(a aVar, r rVar) {
                super(0);
                this.f410446l = rVar;
                this.f410447m = aVar;
            }

            @Override // Y41.a
            public final String invoke() {
                r<T> rVar = this.f410446l;
                if (rVar.f410413e.isAnonymousClass()) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.name.b bVarW = rVar.w();
                if (!bVarW.f409241c) {
                    return bVarW.i().b();
                }
                kotlin.reflect.n<Object>[] nVarArr = a.f410415q;
                this.f410447m.getClass();
                Class<T> cls = rVar.f410413e;
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return C43066x.m0(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return C43066x.l0('$', simpleName, simpleName);
                }
                return C43066x.m0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
        }

        /* compiled from: KClassImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/T;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class q extends kotlin.jvm.internal.N implements Y41.a<List<? extends T>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T>.a f410448l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ r<T> f410449m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public q(r<T>.a aVar, r<T> rVar) {
                super(0);
                this.f410448l = aVar;
                this.f410449m = rVar;
            }

            @Override // Y41.a
            public final List<? extends T> invoke() {
                r<T>.a aVar = this.f410448l;
                Collection<kotlin.reflect.jvm.internal.impl.types.O> collectionC = aVar.a().l().C();
                ArrayList arrayList = new ArrayList(collectionC.size());
                for (kotlin.reflect.jvm.internal.impl.types.O o12 : collectionC) {
                    arrayList.add(new T(o12, new C43009s(o12, aVar, this.f410449m)));
                }
                InterfaceC42851d interfaceC42851dA = aVar.a();
                kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.builtins.k.f407311f;
                if (!kotlin.reflect.jvm.internal.impl.builtins.k.b(interfaceC42851dA, n.a.f407373b) && !kotlin.reflect.jvm.internal.impl.builtins.k.b(interfaceC42851dA, n.a.f407375c)) {
                    if (arrayList.isEmpty()) {
                        arrayList.add(new T(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(aVar.a()).e(), C43010t.f410458l));
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ClassKind kind = kotlin.reflect.jvm.internal.impl.resolve.j.c(((T) it.next()).f407060b).getKind();
                            if (kind != ClassKind.f407414c && kind != ClassKind.f407417f) {
                                break;
                            }
                        }
                        arrayList.add(new T(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(aVar.a()).e(), C43010t.f410458l));
                    }
                }
                return kotlin.reflect.jvm.internal.impl.utils.a.b(arrayList);
            }
        }

        /* compiled from: KClassImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lkotlin/reflect/jvm/internal/V;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.reflect.jvm.internal.r$a$r, reason: collision with other inner class name */
        public static final class C11705r extends kotlin.jvm.internal.N implements Y41.a<List<? extends V>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r<T>.a f410450l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ r<T> f410451m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11705r(r<T>.a aVar, r<T> rVar) {
                super(0);
                this.f410450l = aVar;
                this.f410451m = rVar;
            }

            @Override // Y41.a
            public final List<? extends V> invoke() {
                List<kotlin.reflect.jvm.internal.impl.descriptors.g0> listR = this.f410450l.a().r();
                ArrayList arrayList = new ArrayList(C42745f0.q(listR, 10));
                Iterator<T> it = listR.iterator();
                while (it.hasNext()) {
                    arrayList.add(new V(this.f410451m, (kotlin.reflect.jvm.internal.impl.descriptors.g0) it.next()));
                }
                return arrayList;
            }
        }

        static {
            n0 n0Var = m0.f406844a;
            f410415q = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "annotations", "getAnnotations()Ljava/util/List;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "constructors", "getConstructors()Ljava/util/Collection;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "supertypes", "getSupertypes()Ljava/util/List;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        }

        public a(r rVar) {
            super(rVar);
            this.f410416c = Z.a(null, new i(rVar));
            Z.a(null, new d(this));
            this.f410417d = Z.a(null, new p(this, rVar));
            this.f410418e = Z.a(null, new n(rVar));
            this.f410419f = Z.a(null, new e(rVar));
            this.f410420g = Z.a(null, new l(this));
            this.f410421h = C42727D.b(LazyThreadSafetyMode.f406615c, new m(this, rVar));
            Z.a(null, new C11705r(this, rVar));
            this.f410422i = Z.a(null, new q(this, rVar));
            Z.a(null, new o(this));
            this.f410423j = Z.a(null, new g(rVar));
            this.f410424k = Z.a(null, new h(rVar));
            this.f410425l = Z.a(null, new j(rVar));
            this.f410426m = Z.a(null, new k(rVar));
            this.f410427n = Z.a(null, new b(this));
            this.f410428o = Z.a(null, new c(this));
            Z.a(null, new f(this));
            this.f410429p = Z.a(null, new C11704a(this));
        }

        @Y61.k
        public final InterfaceC42851d a() {
            kotlin.reflect.n<Object> nVar = f410415q[0];
            return (InterfaceC42851d) this.f410416c.invoke();
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f410452a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                KotlinClassHeader.Kind.a aVar = KotlinClassHeader.Kind.f408496c;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KotlinClassHeader.Kind.a aVar2 = KotlinClassHeader.Kind.f408496c;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KotlinClassHeader.Kind.a aVar3 = KotlinClassHeader.Kind.f408496c;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KotlinClassHeader.Kind.a aVar4 = KotlinClassHeader.Kind.f408496c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KotlinClassHeader.Kind.a aVar5 = KotlinClassHeader.Kind.f408496c;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                KotlinClassHeader.Kind.a aVar6 = KotlinClassHeader.Kind.f408496c;
                iArr[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f410452a = iArr;
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\f0\u0002R\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlin/reflect/jvm/internal/r$a;", "Lkotlin/reflect/jvm/internal/r;", "invoke", "()Lkotlin/reflect/jvm/internal/r$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<r<T>.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r<T> f410453l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r<T> rVar) {
            super(0);
            this.f410453l = rVar;
        }

        @Override // Y41.a
        public final Object invoke() {
            return new a(this.f410453l);
        }
    }

    /* compiled from: KClassImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.G implements Y41.p<kotlin.reflect.jvm.internal.impl.serialization.deserialization.z, ProtoBuf.h, kotlin.reflect.jvm.internal.impl.descriptors.U> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f410454b = new d();

        public d() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
        @Y61.k
        /* renamed from: getName */
        public final String getF407039i() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @Y61.k
        public final kotlin.reflect.h getOwner() {
            return m0.f406844a.b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @Y61.k
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // Y41.p
        public final kotlin.reflect.jvm.internal.impl.descriptors.U invoke(kotlin.reflect.jvm.internal.impl.serialization.deserialization.z zVar, ProtoBuf.h hVar) {
            return zVar.f(hVar);
        }
    }

    public r(@Y61.k Class<T> cls) {
        this.f410413e = cls;
    }

    public static C42868l v(kotlin.reflect.jvm.internal.impl.name.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k kVar) {
        C42954k c42954k = kVar.f407816a;
        C42868l c42868l = new C42868l(new C42873q(c42954k.f409915b, bVar.g()), bVar.i(), Modality.f407439c, ClassKind.f407413b, Collections.singletonList(c42954k.f409915b.m().j("Any").q()), kotlin.reflect.jvm.internal.impl.descriptors.b0.f407539a, c42954k.f409914a);
        c42868l.F0(new C43011u(c42954k.f409914a, c42868l), B0.f406639b, null);
        return c42868l;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.d
    @Y61.k
    public final List<kotlin.reflect.r> C() {
        a aVar = (a) this.f410414f.getValue();
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = a.f410415q[7];
        return (List) aVar.f410422i.invoke();
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof r) && X41.b.b(this).equals(X41.b.b((kotlin.reflect.d) obj));
    }

    @Override // kotlin.jvm.internal.InterfaceC42819t
    @Y61.k
    public final Class<T> f() {
        return this.f410413e;
    }

    @Override // kotlin.reflect.d
    public final int hashCode() {
        return X41.b.b(this).hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Y61.k
    public final Collection<InterfaceC42881j> j() {
        InterfaceC42851d descriptor = getDescriptor();
        return (descriptor.getKind() == ClassKind.f407414c || descriptor.getKind() == ClassKind.f407418g) ? C42784z0.f406748b : descriptor.G();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Y61.k
    public final Collection<InterfaceC42905x> k(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarN = getDescriptor().q().n();
        NoLookupLocation noLookupLocation = NoLookupLocation.f407885c;
        return C42745f0.h0(getDescriptor().P().d(fVar, noLookupLocation), jVarN.d(fVar, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.U l(int i12) {
        Class<?> declaringClass;
        Class<T> cls = this.f410413e;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((r) m0.f406844a.b(declaringClass)).l(i12);
        }
        InterfaceC42851d descriptor = getDescriptor();
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar = descriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) descriptor : null;
        if (eVar == null) {
            return null;
        }
        h.g<ProtoBuf.Class, List<ProtoBuf.h>> gVar = JvmProtoBuf.f409154j;
        ProtoBuf.Class r32 = eVar.f409801g;
        ProtoBuf.h hVar = (ProtoBuf.h) (i12 < r32.i(gVar) ? r32.h(gVar, i12) : null);
        if (hVar == null) {
            return null;
        }
        C42956m c42956m = eVar.f409808n;
        return (kotlin.reflect.jvm.internal.impl.descriptors.U) i0.f(this.f410413e, hVar, c42956m.f409937b, c42956m.f409939d, eVar.f409802h, d.f410454b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.d
    @Y61.l
    public final String l0() {
        a aVar = (a) this.f410414f.getValue();
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = a.f410415q[2];
        return (String) aVar.f410417d.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.d
    @Y61.k
    public final Collection<kotlin.reflect.d<?>> m0() {
        a aVar = (a) this.f410414f.getValue();
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = a.f410415q[5];
        return (Collection) aVar.f410420g.invoke();
    }

    @Override // kotlin.reflect.d
    public final boolean n0(@Y61.l Object obj) {
        Map<Class<? extends InterfaceC43072x<?>>, Integer> map = C42892d.f407852d;
        Class<T> cls = this.f410413e;
        Integer num = map.get(cls);
        if (num != null) {
            return v0.f(num.intValue(), obj);
        }
        Class<T> cls2 = (Class) C42892d.f407851c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.d
    @Y61.k
    public final Collection<kotlin.reflect.c<?>> o0() {
        a aVar = (a) this.f410414f.getValue();
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = a.f410415q[16];
        return (Collection) aVar.f410429p.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Y61.k
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.U> p(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarN = getDescriptor().q().n();
        NoLookupLocation noLookupLocation = NoLookupLocation.f407885c;
        return C42745f0.h0(getDescriptor().P().f(fVar, noLookupLocation), jVarN.f(fVar, noLookupLocation));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.d
    @Y61.l
    public final String p0() {
        a aVar = (a) this.f410414f.getValue();
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = a.f410415q[3];
        return (String) aVar.f410418e.invoke();
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("class ");
        kotlin.reflect.jvm.internal.impl.name.b bVarW = w();
        kotlin.reflect.jvm.internal.impl.name.c cVarG = bVarW.g();
        String strConcat = cVarG.d() ? "" : cVarG.b().concat(".");
        sb2.append(strConcat + bVarW.h().b().replace('.', '$'));
        return sb2.toString();
    }

    public final kotlin.reflect.jvm.internal.impl.name.b w() {
        PrimitiveType primitiveTypeD;
        d0.f407150a.getClass();
        Class<T> cls = this.f410413e;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            primitiveTypeD = componentType.isPrimitive() ? JvmPrimitiveType.b(componentType.getSimpleName()).d() : null;
            return primitiveTypeD != null ? new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.n.f407339l, primitiveTypeD.f407171c) : kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407382h.g());
        }
        if (cls.equals(Void.TYPE)) {
            return d0.f407151b;
        }
        primitiveTypeD = cls.isPrimitive() ? JvmPrimitiveType.b(cls.getSimpleName()).d() : null;
        if (primitiveTypeD != null) {
            return new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.n.f407339l, primitiveTypeD.f407170b);
        }
        kotlin.reflect.jvm.internal.impl.name.b bVarA = C42892d.a(cls);
        if (bVarA.f409241c) {
            return bVarA;
        }
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f407238a;
        kotlin.reflect.jvm.internal.impl.name.c cVarB = bVarA.b();
        cVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.b bVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f407246i.get(cVarB.i());
        return bVar != null ? bVar : bVarA;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.InterfaceC43012v
    @Y61.k
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final InterfaceC42851d getDescriptor() {
        return ((a) this.f410414f.getValue()).a();
    }
}
