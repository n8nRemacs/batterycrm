package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42944c;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42923a<A, C> extends AbstractC42926d<A, C42929g<? extends A, ? extends C>> implements InterfaceC42944c<A, C> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f408447d = 0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.i<z, C42929g<A, C>> f408448c;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$a, reason: collision with other inner class name */
    public static final class C11665a extends N implements Y41.p<C42929g<? extends A, ? extends C>, C, C> {

        /* renamed from: l, reason: collision with root package name */
        public static final C11665a f408449l = new C11665a();

        public C11665a() {
            super(2);
        }

        @Override // Y41.p
        public final Object invoke(Object obj, C c12) {
            return ((C42929g) obj).f408470c.get(c12);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$b */
    public static final class b extends N implements Y41.p<C42929g<? extends A, ? extends C>, C, C> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f408450l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final Object invoke(Object obj, C c12) {
            return ((C42929g) obj).f408469b.get(c12);
        }
    }

    public AbstractC42923a(@Y61.k kotlin.reflect.jvm.internal.impl.storage.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g gVar) {
        super(gVar);
        this.f408448c = fVar.c(new C42925c(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42944c
    @Y61.l
    public final C c(@Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.I i12, @Y61.k ProtoBuf.h hVar, @Y61.k O o12) {
        return v(i12, hVar, AnnotatedCallableKind.f409717c, o12, b.f408450l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42944c
    @Y61.l
    public final C g(@Y61.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.I i12, @Y61.k ProtoBuf.h hVar, @Y61.k O o12) {
        return v(i12, hVar, AnnotatedCallableKind.f409718d, o12, C11665a.f408449l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d
    public final C42929g n(z zVar) {
        return this.f408448c.invoke(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final C v(kotlin.reflect.jvm.internal.impl.serialization.deserialization.I r10, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.h r11, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r12, kotlin.reflect.jvm.internal.impl.types.O r13, Y41.p<? super kotlin.reflect.jvm.internal.impl.load.kotlin.C42929g<? extends A, ? extends C>, ? super kotlin.reflect.jvm.internal.impl.load.kotlin.C, ? extends C> r14) throws java.lang.ClassNotFoundException {
        /*
            r9 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.b$b r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409097B
            int r1 = r11.f408988e
            java.lang.Boolean r5 = r0.e(r1)
            boolean r6 = m51.i.d(r11)
            m51.e r8 = r9.p()
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g r7 = r9.f408460a
            kotlin.reflect.jvm.internal.impl.load.kotlin.d$b r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d.f408459b
            r0.getClass()
            r3 = 1
            r4 = 1
            r2 = r10
            kotlin.reflect.jvm.internal.impl.load.kotlin.z r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d.b.a(r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            if (r0 != 0) goto L38
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.I.a
            if (r0 == 0) goto L37
            r0 = r10
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.I$a r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.I.a) r0
            kotlin.reflect.jvm.internal.impl.descriptors.b0 r0 = r0.f409745c
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.B
            if (r2 == 0) goto L31
            kotlin.reflect.jvm.internal.impl.load.kotlin.B r0 = (kotlin.reflect.jvm.internal.impl.load.kotlin.B) r0
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L37
            kotlin.reflect.jvm.internal.impl.load.kotlin.z r0 = r0.f408429b
            goto L38
        L37:
            r0 = r1
        L38:
            if (r0 != 0) goto L3b
            return r1
        L3b:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2 = r0.a()
            m51.e r2 = r2.f408490b
            kotlin.reflect.jvm.internal.impl.load.kotlin.o$a r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.o.f408534b
            r3.getClass()
            m51.e r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.o.f408538f
            int r4 = r3.f409093c
            int r5 = r3.f409094d
            int r3 = r3.f409092b
            boolean r2 = r2.a(r3, r4, r5)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r3 = r10.f409743a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g r10 = r10.f409744b
            kotlin.reflect.jvm.internal.impl.load.kotlin.C r10 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42926d.o(r11, r3, r10, r12, r2)
            if (r10 != 0) goto L5d
            return r1
        L5d:
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.load.kotlin.z, kotlin.reflect.jvm.internal.impl.load.kotlin.g<A, C>> r11 = r9.f408448c
            java.lang.Object r11 = r11.invoke(r0)
            java.lang.Object r10 = r14.invoke(r11, r10)
            if (r10 != 0) goto L6a
            return r1
        L6a:
            boolean r11 = kotlin.reflect.jvm.internal.impl.builtins.p.a(r13)
            if (r11 == 0) goto L74
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r10 = r9.w(r10)
        L74:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractC42923a.v(kotlin.reflect.jvm.internal.impl.serialization.deserialization.I, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$h, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind, kotlin.reflect.jvm.internal.impl.types.O, Y41.p):java.lang.Object");
    }

    @Y61.l
    public abstract kotlin.reflect.jvm.internal.impl.resolve.constants.g w(@Y61.k Object obj);
}
