package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum Mandate implements a.InterfaceC11985a, a.b, a.c {
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN(0),
    /* JADX INFO: Fake field, exist only in values array */
    MANDATED(32768);


    /* renamed from: b, reason: collision with root package name */
    public final int f416275b;

    Mandate(int i12) {
        this.f416275b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416275b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 32768;
    }
}
