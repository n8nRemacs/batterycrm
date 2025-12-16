package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum MethodStrictness implements a.b {
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN(0),
    /* JADX INFO: Fake field, exist only in values array */
    STRICT(2048);


    /* renamed from: b, reason: collision with root package name */
    public final int f416281b;

    MethodStrictness(int i12) {
        this.f416281b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416281b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 2048;
    }
}
