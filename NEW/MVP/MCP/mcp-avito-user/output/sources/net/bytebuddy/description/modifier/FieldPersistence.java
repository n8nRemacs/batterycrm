package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum FieldPersistence implements a.InterfaceC11985a {
    PLAIN(0),
    TRANSIENT(128);


    /* renamed from: b, reason: collision with root package name */
    public final int f416273b;

    FieldPersistence(int i12) {
        this.f416273b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416273b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 128;
    }
}
