package com.google.common.graph;

import com.google.common.graph.u0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: Traverser.java */
/* loaded from: classes6.dex */
class v0 extends u0.b<Object> {
    @Override // com.google.common.graph.u0.b
    @I41.a
    public final Object a(ArrayDeque arrayDeque) {
        Iterator it = (Iterator) arrayDeque.getFirst();
        if (it.hasNext()) {
            Objects.requireNonNull(it.next());
            throw null;
        }
        arrayDeque.removeFirst();
        return null;
    }
}
