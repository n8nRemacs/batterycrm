package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum MethodManifestation implements a.b {
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN(0),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE(256),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(1024),
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(16),
    /* JADX INFO: Fake field, exist only in values array */
    FINAL_NATIVE(272),
    /* JADX INFO: Fake field, exist only in values array */
    BRIDGE(64),
    /* JADX INFO: Fake field, exist only in values array */
    FINAL_BRIDGE(80);


    /* renamed from: b, reason: collision with root package name */
    public final int f416279b;

    MethodManifestation(int i12) {
        this.f416279b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416279b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 1360;
    }
}
