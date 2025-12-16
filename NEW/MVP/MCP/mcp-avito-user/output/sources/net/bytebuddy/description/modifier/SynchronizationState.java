package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum SynchronizationState implements a.b {
    PLAIN(0),
    /* JADX INFO: Fake field, exist only in values array */
    SYNCHRONIZED(32);


    /* renamed from: b, reason: collision with root package name */
    public final int f416292b;

    SynchronizationState(int i12) {
        this.f416292b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416292b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 32;
    }
}
