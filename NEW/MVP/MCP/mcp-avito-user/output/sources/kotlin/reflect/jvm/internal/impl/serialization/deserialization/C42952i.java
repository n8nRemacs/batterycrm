package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import f51.InterfaceC40236b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.h;

/* compiled from: ClassDeserializer.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42952i {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f409904c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Set<kotlin.reflect.jvm.internal.impl.name.b> f409905d = Collections.singleton(kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407377d.g()));

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C42954k f409906a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.j f409907b;

    /* compiled from: ClassDeserializer.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.b f409908a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final C42950g f409909b;

        public a(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.l C42950g c42950g) {
            this.f409908a = bVar;
            this.f409909b = c42950g;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof a) {
                if (kotlin.jvm.internal.L.f(this.f409908a, ((a) obj).f409908a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f409908a.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.i$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ClassDeserializer.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.i$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<a, InterfaceC42851d> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC42851d invoke(a aVar) {
            Object next;
            C42956m c42956m;
            InterfaceC42851d interfaceC42851dC;
            a aVar2 = aVar;
            b bVar = C42952i.f409904c;
            C42952i c42952i = C42952i.this;
            c42952i.getClass();
            C42954k c42954k = c42952i.f409906a;
            Iterator<InterfaceC40236b> it = c42954k.f409924k.iterator();
            do {
                boolean zHasNext = it.hasNext();
                kotlin.reflect.jvm.internal.impl.name.b bVar2 = aVar2.f409908a;
                if (!zHasNext) {
                    if (C42952i.f409905d.contains(bVar2)) {
                        return null;
                    }
                    C42950g c42950gA = aVar2.f409909b;
                    if (c42950gA == null && (c42950gA = c42954k.f409917d.a(bVar2)) == null) {
                        return null;
                    }
                    kotlin.reflect.jvm.internal.impl.name.b bVarF = bVar2.f();
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar = c42950gA.f409900a;
                    ProtoBuf.Class r12 = c42950gA.f409901b;
                    kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar3 = c42950gA.f409902c;
                    if (bVarF != null) {
                        InterfaceC42851d interfaceC42851dA = c42952i.a(bVarF, null);
                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVar = interfaceC42851dA instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) interfaceC42851dA : null;
                        if (eVar == null) {
                            return null;
                        }
                        if (!eVar.F0().m().contains(bVar2.i())) {
                            return null;
                        }
                        c42956m = eVar.f409808n;
                    } else {
                        kotlin.reflect.jvm.internal.impl.name.c cVarG = bVar2.g();
                        ArrayList arrayList = new ArrayList();
                        kotlin.reflect.jvm.internal.impl.descriptors.N.a(c42954k.f409919f, cVarG, arrayList);
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            kotlin.reflect.jvm.internal.impl.descriptors.K k12 = (kotlin.reflect.jvm.internal.impl.descriptors.K) next;
                            if (!(k12 instanceof AbstractC42958o)) {
                                break;
                            }
                            AbstractC42958o abstractC42958o = (AbstractC42958o) k12;
                            kotlin.reflect.jvm.internal.impl.name.f fVarI = bVar2.i();
                            abstractC42958o.getClass();
                            kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarN = ((q) abstractC42958o).n();
                            if ((jVarN instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l) && ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l) jVarN).m().contains(fVarI)) {
                                break;
                            }
                        }
                        kotlin.reflect.jvm.internal.impl.descriptors.K k13 = (kotlin.reflect.jvm.internal.impl.descriptors.K) next;
                        if (k13 == null) {
                            return null;
                        }
                        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(r12.f408634F);
                        h.a aVar4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f409142b;
                        ProtoBuf.m mVar = r12.f408636H;
                        aVar4.getClass();
                        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVarA = h.a.a(mVar);
                        c42954k.getClass();
                        c42956m = new C42956m(c42954k, cVar, k13, gVar, hVarA, aVar3, null, null, C42784z0.f406748b);
                    }
                    return new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e(c42956m, r12, cVar, aVar3, c42950gA.f409903d);
                }
                interfaceC42851dC = it.next().c(bVar2);
            } while (interfaceC42851dC == null);
            return interfaceC42851dC;
        }
    }

    public C42952i(@Y61.k C42954k c42954k) {
        this.f409906a = c42954k;
        this.f409907b = c42954k.f409914a.b(new c());
    }

    @Y61.l
    public final InterfaceC42851d a(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, @Y61.l C42950g c42950g) {
        return (InterfaceC42851d) this.f409907b.invoke(new a(bVar, c42950g));
    }
}
