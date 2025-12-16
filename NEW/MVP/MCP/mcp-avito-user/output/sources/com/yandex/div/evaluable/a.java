package com.yandex.div.evaluable;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.yandex.div.evaluable.e;
import com.yandex.div.evaluable.function.C38060d;
import com.yandex.div.evaluable.internal.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Evaluable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/div/evaluable/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f369377c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f369378a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f369379b = true;

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/a$a;", "Lcom/yandex/div/evaluable/a;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.evaluable.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10891a extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final b.d.a f369380d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final a f369381e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final a f369382f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f369383g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final ArrayList f369384h;

        public C10891a(@k b.d.a aVar, @k a aVar2, @k a aVar3, @k String str) {
            super(str);
            this.f369380d = aVar;
            this.f369381e = aVar2;
            this.f369382f = aVar3;
            this.f369383g = str;
            this.f369384h = C42745f0.h0(aVar3.b(), aVar2.b());
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final Object a(@k com.yandex.div.evaluable.e eVar) {
            Object objB;
            a aVar = this.f369381e;
            Object objA = eVar.a(aVar);
            c(aVar.f369379b);
            b.d.a aVar2 = this.f369380d;
            boolean zEquals = false;
            if (aVar2 instanceof b.d.a.InterfaceC10911d) {
                b.d.a.InterfaceC10911d interfaceC10911d = (b.d.a.InterfaceC10911d) aVar2;
                com.yandex.div.evaluable.f fVar = new com.yandex.div.evaluable.f(eVar, this);
                if (!(objA instanceof Boolean)) {
                    com.yandex.div.evaluable.d.b(objA + ' ' + interfaceC10911d + " ...", "'" + interfaceC10911d + "' must be called with boolean operands.");
                    throw null;
                }
                boolean z12 = interfaceC10911d instanceof b.d.a.InterfaceC10911d.C10913b;
                if (z12 && ((Boolean) objA).booleanValue()) {
                    return objA;
                }
                if ((interfaceC10911d instanceof b.d.a.InterfaceC10911d.C10912a) && !((Boolean) objA).booleanValue()) {
                    return objA;
                }
                Object objInvoke = fVar.invoke();
                if (!(objInvoke instanceof Boolean)) {
                    com.yandex.div.evaluable.d.a(interfaceC10911d, objA, objInvoke);
                    throw null;
                }
                if (!z12 ? !(!((Boolean) objA).booleanValue() || !((Boolean) objInvoke).booleanValue()) : !(!((Boolean) objA).booleanValue() && !((Boolean) objInvoke).booleanValue())) {
                    zEquals = true;
                }
                return Boolean.valueOf(zEquals);
            }
            a aVar3 = this.f369382f;
            Object objA2 = eVar.a(aVar3);
            c(aVar3.f369379b);
            if (!objA.getClass().equals(objA2.getClass())) {
                com.yandex.div.evaluable.d.a(aVar2, objA, objA2);
                throw null;
            }
            if (aVar2 instanceof b.d.a.InterfaceC10905b) {
                b.d.a.InterfaceC10905b interfaceC10905b = (b.d.a.InterfaceC10905b) aVar2;
                if (interfaceC10905b instanceof b.d.a.InterfaceC10905b.C10906a) {
                    zEquals = objA.equals(objA2);
                } else {
                    if (!(interfaceC10905b instanceof b.d.a.InterfaceC10905b.C10907b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!objA.equals(objA2)) {
                        zEquals = true;
                    }
                }
                objB = Boolean.valueOf(zEquals);
            } else {
                boolean z13 = aVar2 instanceof b.d.a.f;
                e.a aVar4 = com.yandex.div.evaluable.e.f369413c;
                if (z13) {
                    aVar4.getClass();
                    objB = e.a.b((b.d.a.f) aVar2, objA, objA2);
                } else if (aVar2 instanceof b.d.a.c) {
                    aVar4.getClass();
                    objB = e.a.a((b.d.a.c) aVar2, objA, objA2);
                } else {
                    if (!(aVar2 instanceof b.d.a.InterfaceC10901a)) {
                        com.yandex.div.evaluable.d.a(aVar2, objA, objA2);
                        throw null;
                    }
                    b.d.a.InterfaceC10901a interfaceC10901a = (b.d.a.InterfaceC10901a) aVar2;
                    if ((objA instanceof Double) && (objA2 instanceof Double)) {
                        objB = com.yandex.div.evaluable.e.b(interfaceC10901a, (Comparable) objA, (Comparable) objA2);
                    } else if ((objA instanceof Long) && (objA2 instanceof Long)) {
                        objB = com.yandex.div.evaluable.e.b(interfaceC10901a, (Comparable) objA, (Comparable) objA2);
                    } else {
                        if (!(objA instanceof com.yandex.div.evaluable.types.b) || !(objA2 instanceof com.yandex.div.evaluable.types.b)) {
                            com.yandex.div.evaluable.d.a(interfaceC10901a, objA, objA2);
                            throw null;
                        }
                        objB = com.yandex.div.evaluable.e.b(interfaceC10901a, (Comparable) objA, (Comparable) objA2);
                    }
                }
            }
            return objB;
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final List<String> b() {
            return this.f369384h;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10891a)) {
                return false;
            }
            C10891a c10891a = (C10891a) obj;
            return L.f(this.f369380d, c10891a.f369380d) && L.f(this.f369381e, c10891a.f369381e) && L.f(this.f369382f, c10891a.f369382f) && L.f(this.f369383g, c10891a.f369383g);
        }

        public final int hashCode() {
            return this.f369383g.hashCode() + ((this.f369382f.hashCode() + ((this.f369381e.hashCode() + (this.f369380d.hashCode() * 31)) * 31)) * 31);
        }

        @k
        public final String toString() {
            return "(" + this.f369381e + ' ' + this.f369380d + ' ' + this.f369382f + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/a$b;", "", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/a$c;", "Lcom/yandex/div/evaluable/a;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final b.C10896b f369385d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ArrayList f369386e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f369387f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<String> f369388g;

        public c(@k b.C10896b c10896b, @k ArrayList arrayList, @k String str) {
            Object obj;
            super(str);
            this.f369385d = c10896b;
            this.f369386e = arrayList;
            this.f369387f = str;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a) it.next()).b());
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = C42745f0.h0((List) it2.next(), (List) next);
                }
                obj = next;
            } else {
                obj = null;
            }
            List<String> list = (List) obj;
            this.f369388g = list == null ? C42784z0.f406748b : list;
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final Object a(@k com.yandex.div.evaluable.e eVar) {
            EvaluableType evaluableType;
            b.C10896b c10896b = this.f369385d;
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f369386e.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                arrayList.add(eVar.a(aVar));
                c(aVar.f369379b);
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                EvaluableType evaluableType2 = EvaluableType.INTEGER;
                if (next instanceof Long) {
                    evaluableType = EvaluableType.INTEGER;
                } else if (next instanceof Double) {
                    evaluableType = EvaluableType.NUMBER;
                } else if (next instanceof Boolean) {
                    evaluableType = EvaluableType.BOOLEAN;
                } else if (next instanceof String) {
                    evaluableType = EvaluableType.STRING;
                } else if (next instanceof com.yandex.div.evaluable.types.b) {
                    evaluableType = EvaluableType.DATETIME;
                } else {
                    if (!(next instanceof com.yandex.div.evaluable.types.a)) {
                        if (next == null) {
                            throw new EvaluableException("Unable to find type for null", null, 2, null);
                        }
                        throw new EvaluableException(L.j(next.getClass().getName(), "Unable to find type for "), null, 2, null);
                    }
                    evaluableType = EvaluableType.COLOR;
                }
                arrayList2.add(evaluableType);
            }
            try {
                C38060d c38060d = eVar.f369415b;
                com.yandex.div.evaluable.g gVarA = c38060d.f369685a.a(c10896b.f369955a, arrayList2);
                c(gVarA.getF369902e());
                try {
                    return gVarA.e(arrayList);
                } catch (IntegerOverflow unused) {
                    throw new IntegerOverflow(C42745f0.O(arrayList, null, L.j("(", gVarA.getF369935b()), ")", com.yandex.div.evaluable.b.f369411l, 25), null, 2, null);
                }
            } catch (EvaluableException e12) {
                String str = c10896b.f369955a;
                String message = e12.getMessage();
                if (message == null) {
                    message = "";
                }
                com.yandex.div.evaluable.d.d(str, message, arrayList);
                throw null;
            }
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final List<String> b() {
            return this.f369388g;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f369385d, cVar.f369385d) && this.f369386e.equals(cVar.f369386e) && L.f(this.f369387f, cVar.f369387f);
        }

        public final int hashCode() {
            return this.f369387f.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f369386e, this.f369385d.f369955a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            ArrayList arrayList = this.f369386e;
            b.C10896b.a.f369956a.getClass();
            return this.f369385d.f369955a + '(' + C42745f0.O(arrayList, ",", null, null, null, 62) + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/a$d;", "Lcom/yandex/div/evaluable/a;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f369389d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ArrayList f369390e;

        /* renamed from: f, reason: collision with root package name */
        public a f369391f;

        public d(@k String str) {
            super(str);
            this.f369389d = str;
            com.yandex.div.evaluable.internal.c.f369985a.getClass();
            this.f369390e = com.yandex.div.evaluable.internal.c.j(str);
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final Object a(@k com.yandex.div.evaluable.e eVar) {
            if (this.f369391f == null) {
                com.yandex.div.evaluable.internal.a aVar = com.yandex.div.evaluable.internal.a.f369949a;
                ArrayList arrayList = this.f369390e;
                aVar.getClass();
                this.f369391f = com.yandex.div.evaluable.internal.a.f(this.f369378a, arrayList);
            }
            a aVar2 = this.f369391f;
            if (aVar2 == null) {
                aVar2 = null;
            }
            Object objA = aVar2.a(eVar);
            a aVar3 = this.f369391f;
            c((aVar3 != null ? aVar3 : null).f369379b);
            return objA;
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final List<String> b() {
            a aVar = this.f369391f;
            if (aVar != null) {
                return aVar.b();
            }
            ArrayList arrayListB = C42745f0.B(this.f369390e, b.c.C10900b.class);
            ArrayList arrayList = new ArrayList(C42745f0.q(arrayListB, 10));
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                arrayList.add(((b.c.C10900b) it.next()).f369960a);
            }
            return arrayList;
        }

        @k
        /* renamed from: toString, reason: from getter */
        public final String getF369389d() {
            return this.f369389d;
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/a$e;", "Lcom/yandex/div/evaluable/a;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class e extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f369392d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f369393e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<String> f369394f;

        public e(@k ArrayList arrayList, @k String str) {
            super(str);
            this.f369392d = arrayList;
            this.f369393e = str;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a) it.next()).b());
            }
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = C42745f0.h0((List) it2.next(), (List) next);
            }
            this.f369394f = (List) next;
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final Object a(@k com.yandex.div.evaluable.e eVar) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f369392d.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                arrayList.add(eVar.a(aVar).toString());
                c(aVar.f369379b);
            }
            return C42745f0.O(arrayList, "", null, null, null, 62);
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final List<String> b() {
            return this.f369394f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f369392d.equals(eVar.f369392d) && L.f(this.f369393e, eVar.f369393e);
        }

        public final int hashCode() {
            return this.f369393e.hashCode() + (this.f369392d.hashCode() * 31);
        }

        @k
        public final String toString() {
            return C42745f0.O(this.f369392d, "", null, null, null, 62);
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/a$f;", "Lcom/yandex/div/evaluable/a;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class f extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final b.d.C10917d f369395d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final a f369396e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final a f369397f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final a f369398g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f369399h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final ArrayList f369400i;

        public f(@k b.d.C10917d c10917d, @k a aVar, @k a aVar2, @k a aVar3, @k String str) {
            super(str);
            this.f369395d = c10917d;
            this.f369396e = aVar;
            this.f369397f = aVar2;
            this.f369398g = aVar3;
            this.f369399h = str;
            this.f369400i = C42745f0.h0(aVar3.b(), C42745f0.h0(aVar2.b(), aVar.b()));
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final Object a(@k com.yandex.div.evaluable.e eVar) {
            b.d.C10917d c10917d = this.f369395d;
            if (c10917d == null) {
                com.yandex.div.evaluable.d.b(this.f369378a, c10917d + " was incorrectly parsed as a ternary operator.");
                throw null;
            }
            a aVar = this.f369396e;
            Object objA = eVar.a(aVar);
            c(aVar.f369379b);
            boolean z12 = objA instanceof Boolean;
            a aVar2 = this.f369398g;
            a aVar3 = this.f369397f;
            if (z12) {
                if (((Boolean) objA).booleanValue()) {
                    Object objA2 = eVar.a(aVar3);
                    c(aVar3.f369379b);
                    return objA2;
                }
                Object objA3 = eVar.a(aVar2);
                c(aVar2.f369379b);
                return objA3;
            }
            com.yandex.div.evaluable.d.b(aVar + " ? " + aVar3 + " : " + aVar2, "Ternary must be called with a Boolean value as a condition.");
            throw null;
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final List<String> b() {
            return this.f369400i;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f369395d, fVar.f369395d) && L.f(this.f369396e, fVar.f369396e) && L.f(this.f369397f, fVar.f369397f) && L.f(this.f369398g, fVar.f369398g) && L.f(this.f369399h, fVar.f369399h);
        }

        public final int hashCode() {
            return this.f369399h.hashCode() + ((this.f369398g.hashCode() + ((this.f369397f.hashCode() + ((this.f369396e.hashCode() + (this.f369395d.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @k
        public final String toString() {
            return "(" + this.f369396e + ' ' + b.d.c.f369976a + ' ' + this.f369397f + ' ' + b.d.C10916b.f369975a + ' ' + this.f369398g + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/a$g;", "Lcom/yandex/div/evaluable/a;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class g extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final b.d f369401d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final a f369402e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f369403f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final List<String> f369404g;

        public g(@k b.d dVar, @k a aVar, @k String str) {
            super(str);
            this.f369401d = dVar;
            this.f369402e = aVar;
            this.f369403f = str;
            this.f369404g = aVar.b();
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final Object a(@k com.yandex.div.evaluable.e eVar) {
            a aVar = this.f369402e;
            Object objA = eVar.a(aVar);
            c(aVar.f369379b);
            b.d dVar = this.f369401d;
            if (dVar instanceof b.d.e.c) {
                if (objA instanceof Long) {
                    return Long.valueOf(((Number) objA).longValue());
                }
                if (objA instanceof Double) {
                    return Double.valueOf(((Number) objA).doubleValue());
                }
                com.yandex.div.evaluable.d.b(L.j(objA, "+"), "A Number is expected after a unary plus.");
                throw null;
            }
            if (dVar instanceof b.d.e.a) {
                if (objA instanceof Long) {
                    return Long.valueOf(-((Number) objA).longValue());
                }
                if (objA instanceof Double) {
                    return Double.valueOf(-((Number) objA).doubleValue());
                }
                com.yandex.div.evaluable.d.b(L.j(objA, "-"), "A Number is expected after a unary minus.");
                throw null;
            }
            if (L.f(dVar, b.d.e.C10918b.f369979a)) {
                if (objA instanceof Boolean) {
                    return Boolean.valueOf(!((Boolean) objA).booleanValue());
                }
                com.yandex.div.evaluable.d.b(L.j(objA, "!"), "A Boolean is expected after a unary not.");
                throw null;
            }
            throw new EvaluableException(dVar + " was incorrectly parsed as a unary operator.", null, 2, null);
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final List<String> b() {
            return this.f369404g;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f369401d, gVar.f369401d) && L.f(this.f369402e, gVar.f369402e) && L.f(this.f369403f, gVar.f369403f);
        }

        public final int hashCode() {
            return this.f369403f.hashCode() + ((this.f369402e.hashCode() + (this.f369401d.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f369401d);
            sb2.append(this.f369402e);
            return sb2.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/evaluable/a$h;", "Lcom/yandex/div/evaluable/a;", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class h extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final b.c.a f369405d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f369406e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final C42784z0 f369407f;

        public h(@k b.c.a aVar, @k String str) {
            super(str);
            this.f369405d = aVar;
            this.f369406e = str;
            this.f369407f = C42784z0.f406748b;
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final Object a(@k com.yandex.div.evaluable.e eVar) {
            b.c.a aVar = this.f369405d;
            if (aVar instanceof b.c.a.C10898b) {
                return ((b.c.a.C10898b) aVar).f369958a;
            }
            if (aVar instanceof b.c.a.C10897a) {
                return Boolean.valueOf(((b.c.a.C10897a) aVar).f369957a);
            }
            if (aVar instanceof b.c.a.C10899c) {
                return ((b.c.a.C10899c) aVar).f369959a;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final List<String> b() {
            return this.f369407f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f369405d, hVar.f369405d) && L.f(this.f369406e, hVar.f369406e);
        }

        public final int hashCode() {
            return this.f369406e.hashCode() + (this.f369405d.hashCode() * 31);
        }

        @k
        public final String toString() {
            b.c.a aVar = this.f369405d;
            if (aVar instanceof b.c.a.C10899c) {
                return C22026a.c(new StringBuilder("'"), ((b.c.a.C10899c) aVar).f369959a, '\'');
            }
            if (aVar instanceof b.c.a.C10898b) {
                return ((b.c.a.C10898b) aVar).f369958a.toString();
            }
            if (aVar instanceof b.c.a.C10897a) {
                return String.valueOf(((b.c.a.C10897a) aVar).f369957a);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/yandex/div/evaluable/a$i;", "Lcom/yandex/div/evaluable/a;", "Lcom/yandex/div/evaluable/internal/b$c$b;", "token", "", "rawExpression", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/w;)V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class i extends a {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f369408d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f369409e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<String> f369410f;

        public i(String str, String str2, C42822w c42822w) {
            super(str2);
            this.f369408d = str;
            this.f369409e = str2;
            this.f369410f = Collections.singletonList(str);
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final Object a(@k com.yandex.div.evaluable.e eVar) {
            j jVar = eVar.f369414a;
            String str = this.f369408d;
            Object obj = jVar.get(str);
            if (obj != null) {
                return obj;
            }
            throw new MissingVariableException(str, null, 2, null);
        }

        @Override // com.yandex.div.evaluable.a
        @k
        public final List<String> b() {
            return this.f369410f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f369408d, iVar.f369408d) && L.f(this.f369409e, iVar.f369409e);
        }

        public final int hashCode() {
            return this.f369409e.hashCode() + (this.f369408d.hashCode() * 31);
        }

        @k
        /* renamed from: toString, reason: from getter */
        public final String getF369408d() {
            return this.f369408d;
        }
    }

    public a(@k String str) {
        this.f369378a = str;
    }

    @k
    public abstract Object a(@k com.yandex.div.evaluable.e eVar);

    @k
    public abstract List<String> b();

    public final void c(boolean z12) {
        this.f369379b = this.f369379b && z12;
    }
}
