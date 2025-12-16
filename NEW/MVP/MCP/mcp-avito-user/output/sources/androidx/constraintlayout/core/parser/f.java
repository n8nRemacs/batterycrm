package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* compiled from: CLObject.java */
/* loaded from: classes.dex */
public class f extends b implements Iterable<d> {

    /* compiled from: CLObject.java */
    public class a implements Iterator {

        /* renamed from: b, reason: collision with root package name */
        public f f43365b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            this.f43365b.getClass();
            throw null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f43365b.getClass();
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<d> iterator() {
        a aVar = new a();
        aVar.f43365b = this;
        return aVar;
    }
}
