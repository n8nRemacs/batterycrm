package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: findClassInModule.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42904w {

    /* compiled from: findClassInModule.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.w$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.G implements Y41.l<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f407879b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
        @Y61.k
        /* renamed from: getName */
        public final String getF407039i() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @Y61.k
        public final kotlin.reflect.h getOwner() {
            return kotlin.jvm.internal.m0.f406844a.b(kotlin.reflect.jvm.internal.impl.name.b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @Y61.k
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // Y41.l
        public final kotlin.reflect.jvm.internal.impl.name.b invoke(kotlin.reflect.jvm.internal.impl.name.b bVar) {
            return bVar.f();
        }
    }

    /* compiled from: findClassInModule.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.w$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.b, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f407880l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Integer invoke(kotlin.reflect.jvm.internal.impl.name.b bVar) {
            return 0;
        }
    }

    @Y61.l
    public static final InterfaceC42851d a(@Y61.k E e12, @Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar) {
        InterfaceC42853f interfaceC42853fB = b(e12, bVar);
        if (interfaceC42853fB instanceof InterfaceC42851d) {
            return (InterfaceC42851d) interfaceC42853fB;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f b(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.E r7, @Y61.k kotlin.reflect.jvm.internal.impl.name.b r8) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.C42904w.b(kotlin.reflect.jvm.internal.impl.descriptors.E, kotlin.reflect.jvm.internal.impl.name.b):kotlin.reflect.jvm.internal.impl.descriptors.f");
    }

    @Y61.k
    public static final InterfaceC42851d c(@Y61.k E e12, @Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.k H h12) {
        InterfaceC42851d interfaceC42851dA = a(e12, bVar);
        return interfaceC42851dA != null ? interfaceC42851dA : h12.a(bVar, C43033p.D(new kotlin.sequences.o0(C43033p.u(a.f407879b, bVar), b.f407880l)));
    }
}
