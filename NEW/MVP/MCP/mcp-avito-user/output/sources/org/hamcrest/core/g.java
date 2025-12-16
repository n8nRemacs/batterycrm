package org.hamcrest.core;

/* compiled from: IsAnything.java */
/* loaded from: classes7.dex */
public class g<T> extends org.hamcrest.b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f420414a;

    public g() {
        this("ANYTHING");
    }

    @Override // org.hamcrest.m
    public final void a(org.hamcrest.a aVar) {
        aVar.d(this.f420414a);
    }

    public g(String str) {
        this.f420414a = str;
    }
}
