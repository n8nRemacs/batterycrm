package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum Ownership implements a.InterfaceC11985a, a.b, a.d {
    MEMBER(0),
    STATIC(8);


    /* renamed from: b, reason: collision with root package name */
    public final int f416285b;

    Ownership(int i12) {
        this.f416285b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416285b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 8;
    }
}
