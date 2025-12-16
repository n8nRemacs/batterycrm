package com.google.common.graph;

import java.util.Set;

/* compiled from: AbstractGraph.java */
@D
@XY0.a
/* renamed from: com.google.common.graph.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37467g<N> extends AbstractC37461d<N> implements J<N> {
    @Override // com.google.common.graph.J
    public Set a() {
        return new C37455a(this);
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j12 = (J) obj;
        return c() == j12.c() && d().equals(j12.d()) && a().equals(j12.a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "isDirected: " + c() + ", allowsSelfLoops: " + b() + ", nodes: " + d() + ", edges: " + a();
    }
}
