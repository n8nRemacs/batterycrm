package com.google.common.graph;

import com.google.common.graph.u0;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: Traverser.java */
/* loaded from: classes6.dex */
class w0 extends u0.b<Object> {
    @Override // com.google.common.graph.u0.b
    @I41.a
    public final Object a(ArrayDeque arrayDeque) {
        Iterator it = (Iterator) arrayDeque.getFirst();
        if (!it.hasNext()) {
            arrayDeque.removeFirst();
            return null;
        }
        Object next = it.next();
        next.getClass();
        return next;
    }
}
