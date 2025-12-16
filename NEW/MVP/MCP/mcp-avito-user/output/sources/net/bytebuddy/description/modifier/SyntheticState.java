package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum SyntheticState implements a.d, a.b, a.InterfaceC11985a, a.c {
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN(0),
    SYNTHETIC(4096);


    /* renamed from: b, reason: collision with root package name */
    public final int f416295b;

    SyntheticState(int i12) {
        this.f416295b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416295b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 4096;
    }
}
