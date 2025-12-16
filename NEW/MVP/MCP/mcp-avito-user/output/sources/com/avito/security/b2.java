package com.avito.security;

import java.util.Iterator;

/* loaded from: classes5.dex */
class b2 extends a2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements Iterable<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v1 f338575a;

        public a(v1 v1Var) {
            this.f338575a = v1Var;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f338575a.iterator();
        }
    }

    public static <T> Iterable<T> a(v1<? extends T> v1Var) {
        y0.b(v1Var, "$this$asIterable");
        return new a(v1Var);
    }
}
