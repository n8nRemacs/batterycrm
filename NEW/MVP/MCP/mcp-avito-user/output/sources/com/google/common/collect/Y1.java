package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: Iterables.java */
/* loaded from: classes6.dex */
class Y1 extends AbstractC37431x0<Object> {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection f359607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f359608d;

    /* compiled from: Iterables.java */
    public class a implements Iterator<Object> {

        /* renamed from: b, reason: collision with root package name */
        public boolean f359609b = true;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterator f359610c;

        public a(Iterator it) {
            this.f359610c = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f359610c.hasNext();
        }

        @Override // java.util.Iterator
        @InterfaceC37434x3
        public final Object next() {
            Object next = this.f359610c.next();
            this.f359609b = false;
            return next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            F.e(!this.f359609b);
            this.f359610c.remove();
        }
    }

    public Y1(int i12, Collection collection) {
        this.f359607c = collection;
        this.f359608d = i12;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Collection collection = this.f359607c;
        boolean z12 = collection instanceof List;
        int i12 = this.f359608d;
        if (z12) {
            List list = (List) collection;
            return list.subList(Math.min(list.size(), i12), list.size()).iterator();
        }
        Iterator it = collection.iterator();
        it.getClass();
        com.google.common.base.M.d("numberToAdvance must be nonnegative", i12 >= 0);
        for (int i13 = 0; i13 < i12 && it.hasNext(); i13++) {
            it.next();
        }
        return new a(it);
    }
}
