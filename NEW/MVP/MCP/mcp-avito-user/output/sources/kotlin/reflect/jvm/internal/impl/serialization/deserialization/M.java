package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42952i;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: TypeDeserializer.kt */
@s0
/* loaded from: classes8.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C42956m f409758a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final M f409759b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f409760c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f409761d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.j f409762e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.j f409763f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f409764g;

    /* compiled from: TypeDeserializer.kt */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Integer, InterfaceC42853f> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC42853f invoke(Integer num) {
            int iIntValue = num.intValue();
            C42956m c42956m = M.this.f409758a;
            kotlin.reflect.jvm.internal.impl.name.b bVarA = G.a(c42956m.f409937b, iIntValue);
            boolean z12 = bVarA.f409241c;
            C42954k c42954k = c42956m.f409936a;
            if (!z12) {
                return C42904w.b(c42954k.f409915b, bVarA);
            }
            c42954k.getClass();
            C42952i.b bVar = C42952i.f409904c;
            return c42954k.f409934u.a(bVarA, null);
        }
    }

    /* compiled from: TypeDeserializer.kt */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ M f409766l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ProtoBuf.Type f409767m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ProtoBuf.Type type, M m12) {
            super(0);
            this.f409766l = m12;
            this.f409767m = type;
        }

        @Override // Y41.a
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            C42956m c42956m = this.f409766l.f409758a;
            return c42956m.f409936a.f409918e.e(this.f409767m, c42956m.f409937b);
        }
    }

    /* compiled from: TypeDeserializer.kt */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Integer, InterfaceC42853f> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC42853f invoke(Integer num) {
            int iIntValue = num.intValue();
            C42956m c42956m = M.this.f409758a;
            kotlin.reflect.jvm.internal.impl.name.b bVarA = G.a(c42956m.f409937b, iIntValue);
            if (bVarA.f409241c) {
                return null;
            }
            InterfaceC42853f interfaceC42853fB = C42904w.b(c42956m.f409936a.f409915b, bVarA);
            if (interfaceC42853fB instanceof f0) {
                return (f0) interfaceC42853fB;
            }
            return null;
        }
    }

    /* compiled from: TypeDeserializer.kt */
    public /* synthetic */ class d extends kotlin.jvm.internal.G implements Y41.l<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.name.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f409769b = new d();

        public d() {
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
            return m0.f406844a.b(kotlin.reflect.jvm.internal.impl.name.b.class);
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

    /* compiled from: TypeDeserializer.kt */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<ProtoBuf.Type, ProtoBuf.Type> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final ProtoBuf.Type invoke(ProtoBuf.Type type) {
            ProtoBuf.Type type2 = type;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = M.this.f409758a.f409939d;
            int i12 = type2.f408779d;
            if ((i12 & 256) == 256) {
                return type2.f408789n;
            }
            if ((i12 & 512) == 512) {
                return gVar.a(type2.f408790o);
            }
            return null;
        }
    }

    /* compiled from: TypeDeserializer.kt */
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<ProtoBuf.Type, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f409771l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final Integer invoke(ProtoBuf.Type type) {
            return Integer.valueOf(type.f408780e.size());
        }
    }

    public M(@Y61.k C42956m c42956m, @Y61.l M m12, @Y61.k List<ProtoBuf.TypeParameter> list, @Y61.k String str, @Y61.k String str2) {
        Map linkedHashMap;
        this.f409758a = c42956m;
        this.f409759b = m12;
        this.f409760c = str;
        this.f409761d = str2;
        C42954k c42954k = c42956m.f409936a;
        this.f409762e = c42954k.f409914a.b(new a());
        this.f409763f = c42954k.f409914a.b(new c());
        if (list.isEmpty()) {
            linkedHashMap = P0.c();
        } else {
            linkedHashMap = new LinkedHashMap();
            int i12 = 0;
            for (ProtoBuf.TypeParameter typeParameter : list) {
                linkedHashMap.put(Integer.valueOf(typeParameter.f408834e), new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.A(this.f409758a, typeParameter, i12));
                i12++;
            }
        }
        this.f409764g = linkedHashMap;
    }

    public static Y a(Y y12, kotlin.reflect.jvm.internal.impl.types.O o12) {
        kotlin.reflect.jvm.internal.impl.builtins.k kVarM = y12.H0().m();
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = y12.getAnnotations();
        kotlin.reflect.jvm.internal.impl.types.O oF2 = kotlin.reflect.jvm.internal.impl.builtins.g.f(y12);
        List<kotlin.reflect.jvm.internal.impl.types.O> listD = kotlin.reflect.jvm.internal.impl.builtins.g.d(y12);
        List listX = C42745f0.x(kotlin.reflect.jvm.internal.impl.builtins.g.g(y12));
        ArrayList arrayList = new ArrayList(C42745f0.q(listX, 10));
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            arrayList.add(((x0) it.next()).getType());
        }
        return kotlin.reflect.jvm.internal.impl.builtins.g.b(kVarM, annotations, oF2, listD, arrayList, o12, true).L0(y12.I0());
    }

    public static final ArrayList e(ProtoBuf.Type type, M m12) {
        List<ProtoBuf.Type.Argument> list = type.f408780e;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = m12.f409758a.f409939d;
        int i12 = type.f408779d;
        ProtoBuf.Type typeA = (i12 & 256) == 256 ? type.f408789n : (i12 & 512) == 512 ? gVar.a(type.f408790o) : null;
        Iterable iterableE = typeA != null ? e(typeA, m12) : null;
        if (iterableE == null) {
            iterableE = C42784z0.f406748b;
        }
        return C42745f0.h0(iterableE, list);
    }

    public static n0 f(List list, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, q0 q0Var, InterfaceC42882k interfaceC42882k) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.types.m0) it.next()).a(gVar));
        }
        ArrayList arrayListH = C42745f0.H(arrayList);
        n0.f410236c.getClass();
        return n0.a.c(arrayListH);
    }

    public static final InterfaceC42851d h(M m12, ProtoBuf.Type type, int i12) {
        kotlin.reflect.jvm.internal.impl.name.b bVarA = G.a(m12.f409758a.f409937b, i12);
        ArrayList arrayListE = C43033p.E(new o0(C43033p.u(m12.new e(), type), f.f409771l));
        int iD2 = C43033p.d(C43033p.u(d.f409769b, bVarA));
        while (arrayListE.size() < iD2) {
            arrayListE.add(0);
        }
        return m12.f409758a.f409936a.f409925l.a(bVarA, arrayListE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Y61.k
    public final List<g0> b() {
        return C42745f0.M0(this.f409764g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final g0 c(int i12) {
        g0 g0Var = (g0) this.f409764g.get(Integer.valueOf(i12));
        if (g0Var != null) {
            return g0Var;
        }
        M m12 = this.f409759b;
        if (m12 != null) {
            return m12.c(i12);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.types.Y d(@Y61.k kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.M.d(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, boolean):kotlin.reflect.jvm.internal.impl.types.Y");
    }

    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.O g(@Y61.k ProtoBuf.Type type) {
        if ((type.f408779d & 2) != 2) {
            return d(type, true);
        }
        C42956m c42956m = this.f409758a;
        String string = c42956m.f409937b.getString(type.f408782g);
        Y yD2 = d(type, true);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = c42956m.f409939d;
        int i12 = type.f408779d;
        return c42956m.f409936a.f409923j.a(type, string, yD2, d((i12 & 4) == 4 ? type.f408783h : (i12 & 8) == 8 ? gVar.a(type.f408784i) : null, true));
    }

    @Y61.k
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f409760c);
        M m12 = this.f409759b;
        if (m12 == null) {
            str = "";
        } else {
            str = ". Child of " + m12.f409760c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
