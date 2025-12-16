package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum ParameterManifestation implements a.c {
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN(0),
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(16);


    /* renamed from: b, reason: collision with root package name */
    public final int f416287b;

    ParameterManifestation(int i12) {
        this.f416287b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416287b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 16;
    }
}
