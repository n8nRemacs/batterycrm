package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum MethodArguments implements a.b {
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN(0),
    /* JADX INFO: Fake field, exist only in values array */
    VARARGS(128);


    /* renamed from: b, reason: collision with root package name */
    public final int f416277b;

    MethodArguments(int i12) {
        this.f416277b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416277b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 128;
    }
}
