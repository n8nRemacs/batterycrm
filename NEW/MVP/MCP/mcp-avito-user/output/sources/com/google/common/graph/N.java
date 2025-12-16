package com.google.common.graph;

import java.util.Set;

/* compiled from: Graphs.java */
@D
@XY0.a
/* loaded from: classes6.dex */
public final class N {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Graphs.java */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f360183b = {new a("PENDING", 0), new a("COMPLETE", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360183b.clone();
        }
    }

    /* compiled from: Graphs.java */
    public static class b<N> extends G<N> {
        @Override // com.google.common.graph.G, com.google.common.graph.InterfaceC37475o
        public final Set<N> e(N n12) {
            throw null;
        }

        @Override // com.google.common.graph.G, com.google.common.graph.AbstractC37461d, com.google.common.graph.InterfaceC37475o
        public final int g() {
            throw null;
        }

        @Override // com.google.common.graph.G, com.google.common.graph.InterfaceC37475o
        public final Set<N> h(N n12) {
            throw null;
        }

        @Override // com.google.common.graph.G, com.google.common.graph.AbstractC37461d, com.google.common.graph.InterfaceC37475o
        public final int k() {
            throw null;
        }
    }

    /* compiled from: Graphs.java */
    public static class c<N, E> extends H<N, E> {
        @Override // com.google.common.graph.H, com.google.common.graph.InterfaceC37462d0
        public final E<N> l(E e12) {
            throw null;
        }
    }

    /* compiled from: Graphs.java */
    public static class d<N, V> extends I<N, V> {
        @Override // com.google.common.graph.I, com.google.common.graph.InterfaceC37475o
        public final Set<N> e(N n12) {
            throw null;
        }

        @Override // com.google.common.graph.I, com.google.common.graph.D0
        @I41.a
        public final Object f(Object obj, Object obj2) {
            throw null;
        }

        @Override // com.google.common.graph.I, com.google.common.graph.AbstractC37461d, com.google.common.graph.InterfaceC37475o
        public final int g() {
            throw null;
        }

        @Override // com.google.common.graph.I, com.google.common.graph.InterfaceC37475o
        public final Set<N> h(N n12) {
            throw null;
        }

        @Override // com.google.common.graph.I, com.google.common.graph.AbstractC37461d, com.google.common.graph.InterfaceC37475o
        public final int k() {
            throw null;
        }
    }
}
