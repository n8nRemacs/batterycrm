package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum FieldManifestation implements a.InterfaceC11985a {
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN(0),
    FINAL(16),
    /* JADX INFO: Fake field, exist only in values array */
    VOLATILE(64);


    /* renamed from: b, reason: collision with root package name */
    public final int f416269b;

    FieldManifestation(int i12) {
        this.f416269b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416269b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 80;
    }
}
