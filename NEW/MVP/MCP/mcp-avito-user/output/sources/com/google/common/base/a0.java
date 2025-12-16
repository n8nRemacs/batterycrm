package com.google.common.base;

import java.util.Iterator;

/* compiled from: Splitter.java */
/* loaded from: classes6.dex */
class a0 implements Iterable<String> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f358986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f358987c;

    public a0(b0 b0Var, String str) {
        this.f358987c = b0Var;
        this.f358986b = str;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        b0 b0Var = this.f358987c;
        return b0Var.f358998c.a(b0Var, this.f358986b);
    }

    public final String toString() {
        C c12 = new C(", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        c12.b(sb2, iterator());
        sb2.append(']');
        return sb2.toString();
    }
}
