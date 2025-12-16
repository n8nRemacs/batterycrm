package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum ProvisioningState implements a.c {
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN(0),
    /* JADX INFO: Fake field, exist only in values array */
    MANDATED(32768);


    /* renamed from: b, reason: collision with root package name */
    public final int f416289b;

    ProvisioningState(int i12) {
        this.f416289b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416289b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 32768;
    }
}
