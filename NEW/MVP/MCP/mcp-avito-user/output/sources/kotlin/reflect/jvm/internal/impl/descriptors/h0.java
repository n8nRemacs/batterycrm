package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: typeParameterUtils.kt */
@s0
/* loaded from: classes8.dex */
public final class h0 {

    /* compiled from: typeParameterUtils.kt */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC42882k, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f407543l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(InterfaceC42882k interfaceC42882k) {
            return Boolean.valueOf(interfaceC42882k instanceof InterfaceC42848a);
        }
    }

    /* compiled from: typeParameterUtils.kt */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<InterfaceC42882k, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f407544l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(InterfaceC42882k interfaceC42882k) {
            return Boolean.valueOf(!(interfaceC42882k instanceof InterfaceC42881j));
        }
    }

    /* compiled from: typeParameterUtils.kt */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<InterfaceC42882k, InterfaceC43030m<? extends g0>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f407545l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC43030m<? extends g0> invoke(InterfaceC42882k interfaceC42882k) {
            return new C42770s0(((InterfaceC42848a) interfaceC42882k).getTypeParameters());
        }
    }

    public static final S a(kotlin.reflect.jvm.internal.impl.types.Y y12, InterfaceC42854g interfaceC42854g, int i12) {
        if (interfaceC42854g == null || kotlin.reflect.jvm.internal.impl.types.error.h.e(interfaceC42854g)) {
            return null;
        }
        int size = interfaceC42854g.r().size() + i12;
        if (interfaceC42854g.Y()) {
            List<x0> listSubList = y12.F0().subList(i12, size);
            InterfaceC42882k interfaceC42882kF = interfaceC42854g.f();
            return new S(interfaceC42854g, listSubList, a(y12, interfaceC42882kF instanceof InterfaceC42854g ? (InterfaceC42854g) interfaceC42882kF : null, size));
        }
        if (size != y12.F0().size()) {
            kotlin.reflect.jvm.internal.impl.resolve.j.o(interfaceC42854g);
        }
        return new S(interfaceC42854g, y12.F0().subList(i12, y12.F0().size()), null);
    }

    @Y61.k
    public static final List<g0> b(@Y61.k InterfaceC42854g interfaceC42854g) {
        List<g0> parameters;
        Object next;
        q0 q0VarL;
        List<g0> listR = interfaceC42854g.r();
        if (!interfaceC42854g.Y() && !(interfaceC42854g.f() instanceof InterfaceC42848a)) {
            return listR;
        }
        List listD = C43033p.D(C43033p.o(C43033p.i(new kotlin.sequences.m0(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.h(interfaceC42854g), a.f407543l), b.f407544l), c.f407545l));
        Iterator it = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.h(interfaceC42854g).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC42851d) {
                break;
            }
        }
        InterfaceC42851d interfaceC42851d = (InterfaceC42851d) next;
        if (interfaceC42851d != null && (q0VarL = interfaceC42851d.l()) != null) {
            parameters = q0VarL.getParameters();
        }
        if (parameters == null) {
            parameters = C42784z0.f406748b;
        }
        if (listD.isEmpty() && parameters.isEmpty()) {
            return interfaceC42854g.r();
        }
        ArrayList arrayListH0 = C42745f0.h0(parameters, listD);
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListH0, 10));
        Iterator it2 = arrayListH0.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C42849b((g0) it2.next(), interfaceC42854g, listR.size()));
        }
        return C42745f0.h0(arrayList, listR);
    }
}
