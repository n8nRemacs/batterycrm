package com.google.common.graph;

import java.util.ArrayDeque;

/* compiled from: Traverser.java */
@aZ0.f
@D
@XY0.a
/* loaded from: classes6.dex */
public abstract class u0<N> {

    /* renamed from: a, reason: collision with root package name */
    public final o0<N> f360187a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Traverser.java */
    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f360188b = {new C10679a("FRONT", 0, null), new b("BACK", 1, null)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF7;

        /* compiled from: Traverser.java */
        /* renamed from: com.google.common.graph.u0$a$a, reason: collision with other inner class name */
        public enum C10679a extends a {
        }

        /* compiled from: Traverser.java */
        public enum b extends a {
        }

        public a() {
            throw null;
        }

        public a(String str, int i12, p0 p0Var) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360188b.clone();
        }
    }

    /* compiled from: Traverser.java */
    public static abstract class b<N> {
        @I41.a
        public abstract Object a(ArrayDeque arrayDeque);
    }

    public u0() {
        throw null;
    }

    public u0(o0 o0Var, p0 p0Var) {
        o0Var.getClass();
        this.f360187a = o0Var;
    }
}
