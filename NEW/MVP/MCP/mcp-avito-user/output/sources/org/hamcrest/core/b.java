package org.hamcrest.core;

import java.util.Arrays;

/* compiled from: AnyOf.java */
/* loaded from: classes7.dex */
public class b<T> extends o<T> {
    public b() {
        throw null;
    }

    @SafeVarargs
    public static void b(org.hamcrest.j... jVarArr) {
        new b(Arrays.asList(jVarArr));
    }

    @Override // org.hamcrest.m
    public final void a(org.hamcrest.a aVar) {
        aVar.e("(", " or ", ")", this.f420415a);
    }
}
