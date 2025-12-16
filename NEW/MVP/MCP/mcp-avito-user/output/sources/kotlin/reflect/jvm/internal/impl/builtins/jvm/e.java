package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import f51.InterfaceC40236b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.K;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42868l;

/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes8.dex */
public final class e implements InterfaceC40236b {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f407257d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f407258e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.c f407259f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.f f407260g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.b f407261h;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f407262a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<E, InterfaceC42882k> f407263b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f407264c;

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    @s0
    public static final class a extends N implements Y41.l<E, kotlin.reflect.jvm.internal.impl.builtins.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f407265l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.reflect.jvm.internal.impl.builtins.b invoke(E e12) {
            List<K> listW = e12.i0(e.f407259f).w();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listW) {
                if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.b) {
                    arrayList.add(obj);
                }
            }
            return (kotlin.reflect.jvm.internal.impl.builtins.b) C42745f0.E(arrayList);
        }
    }

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f407258e = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        f407257d = new b(null);
        f407259f = kotlin.reflect.jvm.internal.impl.builtins.n.f407339l;
        kotlin.reflect.jvm.internal.impl.name.d dVar = n.a.f407377d;
        f407260g = dVar.f();
        f407261h = kotlin.reflect.jvm.internal.impl.name.b.j(dVar.g());
    }

    public e() {
        throw null;
    }

    public e(kotlin.reflect.jvm.internal.impl.storage.p pVar, E e12, Y41.l lVar, int i12, C42822w c42822w) {
        lVar = (i12 & 4) != 0 ? a.f407265l : lVar;
        this.f407262a = e12;
        this.f407263b = lVar;
        this.f407264c = pVar.g(new f(this, pVar));
    }

    @Override // f51.InterfaceC40236b
    public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return fVar.equals(f407260g) && cVar.equals(f407259f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f51.InterfaceC40236b
    @Y61.k
    public final Collection<InterfaceC42851d> b(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (!cVar.equals(f407259f)) {
            return B0.f406639b;
        }
        kotlin.reflect.n<Object> nVar = f407258e[0];
        return Collections.singleton((C42868l) this.f407264c.invoke());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f51.InterfaceC40236b
    @Y61.l
    public final InterfaceC42851d c(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar) {
        if (!bVar.equals(f407261h)) {
            return null;
        }
        kotlin.reflect.n<Object> nVar = f407258e[0];
        return (C42868l) this.f407264c.invoke();
    }
}
