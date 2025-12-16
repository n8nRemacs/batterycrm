package com.google.common.collect;

import com.google.common.collect.M2;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: StandardRowSortedTable.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.m4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37375m4<R, C, V> extends C37381n4<R, C, V> implements R3<R, C, V> {
    private static final long serialVersionUID = 0;

    /* compiled from: StandardRowSortedTable.java */
    /* renamed from: com.google.common.collect.m4$b */
    public class b extends C37381n4<R, C, V>.h implements SortedMap<R, Map<C, V>> {
        public b(a aVar) {
            super();
        }

        @Override // com.google.common.collect.M2.E
        public final Set b() {
            return new M2.t(this);
        }

        @Override // java.util.SortedMap
        @I41.a
        public final Comparator<? super R> comparator() {
            return ((SortedMap) C37375m4.this.f359870d).comparator();
        }

        @Override // java.util.SortedMap
        public final R firstKey() {
            return (R) ((SortedMap) C37375m4.this.f359870d).firstKey();
        }

        @Override // java.util.SortedMap
        public final SortedMap<R, Map<C, V>> headMap(R r12) {
            r12.getClass();
            C37375m4 c37375m4 = C37375m4.this;
            return new C37375m4(((SortedMap) c37375m4.f359870d).headMap(r12), c37375m4.f359871e).d();
        }

        @Override // com.google.common.collect.M2.E, java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            return (SortedSet) super.keySet();
        }

        @Override // java.util.SortedMap
        public final R lastKey() {
            return (R) ((SortedMap) C37375m4.this.f359870d).lastKey();
        }

        @Override // java.util.SortedMap
        public final SortedMap<R, Map<C, V>> subMap(R r12, R r13) {
            r12.getClass();
            r13.getClass();
            C37375m4 c37375m4 = C37375m4.this;
            return new C37375m4(((SortedMap) c37375m4.f359870d).subMap(r12, r13), c37375m4.f359871e).d();
        }

        @Override // java.util.SortedMap
        public final SortedMap<R, Map<C, V>> tailMap(R r12) {
            r12.getClass();
            C37375m4 c37375m4 = C37375m4.this;
            return new C37375m4(((SortedMap) c37375m4.f359870d).tailMap(r12), c37375m4.f359871e).d();
        }
    }

    public C37375m4() {
        throw null;
    }

    @Override // com.google.common.collect.C37381n4
    public final Map q() {
        return new b(null);
    }

    @Override // com.google.common.collect.C37381n4, com.google.common.collect.t4, com.google.common.collect.R3
    public SortedMap<R, Map<C, V>> d() {
        return (SortedMap) super.d();
    }
}
