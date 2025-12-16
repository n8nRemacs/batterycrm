package com.avito.beduin.v2.engine.field.entity;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.field.MergePolicy;
import com.avito.beduin.v2.engine.field.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ArrayField.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/entity/b;", "Lcom/avito/beduin/v2/engine/field/f;", "Lcom/avito/beduin/v2/engine/field/entity/a;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.field.entity.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C36269b implements com.avito.beduin.v2.engine.field.f<C36268a>, List<com.avito.beduin.v2.engine.field.f<?>>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j f336783b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.beduin.v2.engine.field.f<?>> f336784c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f336785d = C42727D.c(new a());

    /* compiled from: ArrayField.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/beduin/v2/engine/field/j;", "Lcom/avito/beduin/v2/engine/field/f;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.engine.field.entity.b$a */
    public static final class a extends N implements Y41.a<Map<com.avito.beduin.v2.engine.field.j, ? extends com.avito.beduin.v2.engine.field.f<?>>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<com.avito.beduin.v2.engine.field.j, ? extends com.avito.beduin.v2.engine.field.f<?>> invoke() {
            List<com.avito.beduin.v2.engine.field.f<?>> list = C36269b.this.f336784c;
            int iF2 = P0.f(C42745f0.q(list, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (Object obj : list) {
                linkedHashMap.put(((com.avito.beduin.v2.engine.field.f) obj).getF336802b(), obj);
            }
            return linkedHashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36269b(@Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k List<? extends com.avito.beduin.v2.engine.field.f<?>> list) {
        this.f336783b = jVar;
        this.f336784c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C36269b r(C36269b c36269b, com.avito.beduin.v2.engine.field.j jVar, ArrayList arrayList, int i12) {
        if ((i12 & 1) != 0) {
            jVar = c36269b.f336783b;
        }
        List list = arrayList;
        if ((i12 & 2) != 0) {
            list = c36269b.f336784c;
        }
        c36269b.getClass();
        return new C36269b(jVar, list);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    public final com.avito.beduin.v2.engine.field.d a(com.avito.beduin.v2.engine.core.z zVar, Map map) {
        Object objA;
        List<com.avito.beduin.v2.engine.field.f<?>> list = this.f336784c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.beduin.v2.engine.field.f fVar = (com.avito.beduin.v2.engine.field.f) obj;
            boolean zF2 = zVar.F();
            String strValueOf = String.valueOf(i12);
            List listU = C42745f0.U(fVar, com.avito.beduin.v2.engine.field.a.a(map));
            if (zF2) {
                InterfaceC36252b interfaceC36252bK = C31685o.k(zVar, strValueOf, listU);
                if (!interfaceC36252bK.getF336701b()) {
                    try {
                        interfaceC36252bK.l(fVar.a(interfaceC36252bK.g(), map));
                    } catch (Throwable th2) {
                        interfaceC36252bK.l(null);
                        throw th2;
                    }
                }
                objA = interfaceC36252bK.getF336702c();
            } else {
                objA = fVar.a(zVar, map);
            }
            arrayList.add((com.avito.beduin.v2.engine.field.d) objA);
            i12 = i13;
        }
        return new C36268a(arrayList);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i12, com.avito.beduin.v2.engine.field.f<?> fVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i12, Collection<? extends com.avito.beduin.v2.engine.field.f<?>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> b(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        if (str.equals(this.f336783b.getF336873c())) {
            return g(fVar);
        }
        List<com.avito.beduin.v2.engine.field.f<?>> list = this.f336784c;
        ArrayList arrayList = new ArrayList(list);
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.beduin.v2.engine.field.f fVar2 = (com.avito.beduin.v2.engine.field.f) obj;
            com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVarD = fVar2.d(str, fVar);
            if (!L.f(fVarD, fVar2)) {
                arrayList.set(i12, fVarD);
            }
            i12 = i13;
        }
        return !arrayList.equals(list) ? r(this, null, arrayList, 1) : this;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof com.avito.beduin.v2.engine.field.f)) {
            return false;
        }
        return this.f336784c.contains((com.avito.beduin.v2.engine.field.f) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        return this.f336784c.containsAll(collection);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> d(@Y61.k String str, @Y61.k com.avito.beduin.v2.engine.field.f<?> fVar) {
        return f.a.c(this, str, fVar);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final Set<com.avito.beduin.v2.engine.field.q> e() {
        List<com.avito.beduin.v2.engine.field.f<?>> list = this.f336784c;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C42745f0.h(((com.avito.beduin.v2.engine.field.f) it.next()).e(), arrayList);
        }
        return C42745f0.P0(arrayList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36269b)) {
            return false;
        }
        C36269b c36269b = (C36269b) obj;
        return L.f(this.f336783b, c36269b.f336783b) && L.f(this.f336784c, c36269b.f336784c);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> g(@Y61.k com.avito.beduin.v2.engine.field.f<? extends com.avito.beduin.v2.engine.field.d> fVar) {
        MergePolicy mergePolicy;
        Integer numValueOf;
        com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVarF;
        if (!(fVar instanceof C36269b)) {
            return fVar.l(this.f336783b).h();
        }
        List<com.avito.beduin.v2.engine.field.f<?>> list = this.f336784c;
        ArrayList arrayList = new ArrayList(list);
        Iterator<T> it = ((C36269b) fVar).f336784c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> fVar2 = (com.avito.beduin.v2.engine.field.f) it.next();
            u uVar = fVar2 instanceof u ? (u) fVar2 : null;
            if (uVar == null || (mergePolicy = uVar.f336833d.get()) == null) {
                MergePolicy.f336739a.getClass();
                mergePolicy = MergePolicy.b.f336758b;
            }
            if (uVar != null && (fVarF = uVar.f()) != null) {
                fVar2 = fVarF;
            }
            if (mergePolicy instanceof MergePolicy.d) {
                com.avito.beduin.v2.engine.field.f fVar3 = (com.avito.beduin.v2.engine.field.f) ((Map) this.f336785d.getValue()).get(fVar2.getF336802b());
                if (fVar3 != null) {
                    arrayList.set(arrayList.indexOf(fVar3), fVar3.b(fVar3.getF336802b().getF336873c(), fVar2));
                }
            } else if (mergePolicy instanceof MergePolicy.a) {
                int iA2 = ((MergePolicy.a) mergePolicy).f336756c.a(arrayList);
                numValueOf = iA2 >= 0 ? Integer.valueOf(iA2) : null;
                if (numValueOf != null) {
                    arrayList.add(numValueOf.intValue(), fVar2.h());
                }
            } else {
                int i12 = -1;
                int i13 = 0;
                if (mergePolicy instanceof MergePolicy.f) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (L.f(((com.avito.beduin.v2.engine.field.f) it2.next()).getF336802b(), fVar2.getF336802b())) {
                            i12 = i13;
                            break;
                        }
                        i13++;
                    }
                    numValueOf = i12 >= 0 ? Integer.valueOf(i12) : null;
                    if (numValueOf != null) {
                    }
                } else if (mergePolicy instanceof MergePolicy.g) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (L.f(((com.avito.beduin.v2.engine.field.f) it3.next()).getF336802b(), fVar2.getF336802b())) {
                            i12 = i13;
                            break;
                        }
                        i13++;
                    }
                    numValueOf = i12 >= 0 ? Integer.valueOf(i12) : null;
                    if (numValueOf != null) {
                        arrayList.set(numValueOf.intValue(), fVar2.h());
                    }
                }
            }
        }
        return !arrayList.equals(list) ? r(this, null, arrayList, 1) : this;
    }

    @Override // java.util.List
    public final com.avito.beduin.v2.engine.field.f<?> get(int i12) {
        return this.f336784c.get(i12);
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final com.avito.beduin.v2.engine.field.j getF336802b() {
        return this.f336783b;
    }

    @Override // com.avito.beduin.v2.engine.field.f
    @Y61.k
    public final com.avito.beduin.v2.engine.field.f<com.avito.beduin.v2.engine.field.d> h() {
        List<com.avito.beduin.v2.engine.field.f<?>> list = this.f336784c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.beduin.v2.engine.field.f) it.next()).h());
        }
        return r(this, null, arrayList, 1);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f336784c.hashCode() + (this.f336783b.hashCode() * 31);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof com.avito.beduin.v2.engine.field.f)) {
            return -1;
        }
        return this.f336784c.indexOf((com.avito.beduin.v2.engine.field.f) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f336784c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<com.avito.beduin.v2.engine.field.f<?>> iterator() {
        return this.f336784c.iterator();
    }

    @Override // com.avito.beduin.v2.engine.field.f
    public final com.avito.beduin.v2.engine.field.f l(com.avito.beduin.v2.engine.field.j jVar) {
        return r(this, jVar, null, 2);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof com.avito.beduin.v2.engine.field.f)) {
            return -1;
        }
        return this.f336784c.lastIndexOf((com.avito.beduin.v2.engine.field.f) obj);
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<com.avito.beduin.v2.engine.field.f<?>> listIterator() {
        return this.f336784c.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ com.avito.beduin.v2.engine.field.f<?> remove(int i12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<com.avito.beduin.v2.engine.field.f<?>> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ com.avito.beduin.v2.engine.field.f<?> set(int i12, com.avito.beduin.v2.engine.field.f<?> fVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f336784c.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super com.avito.beduin.v2.engine.field.f<?>> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @Y61.k
    public final List<com.avito.beduin.v2.engine.field.f<?>> subList(int i12, int i13) {
        return this.f336784c.subList(i12, i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArrayField(");
        com.avito.beduin.v2.engine.field.j jVar = this.f336783b;
        if (jVar.getF336874d()) {
            sb2.append("id=" + jVar.getF336873c() + ", ");
        }
        sb2.append("fields=" + this.f336784c);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends com.avito.beduin.v2.engine.field.f<?>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<com.avito.beduin.v2.engine.field.f<?>> listIterator(int i12) {
        return this.f336784c.listIterator(i12);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
