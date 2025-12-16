package net.bytebuddy.description.modifier;

import net.bytebuddy.description.modifier.a;

/* loaded from: classes8.dex */
public enum TypeManifestation implements a.d {
    PLAIN(0),
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(16),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(1024),
    /* JADX INFO: Fake field, exist only in values array */
    INTERFACE(1536),
    /* JADX INFO: Fake field, exist only in values array */
    ANNOTATION(9728);


    /* renamed from: b, reason: collision with root package name */
    public final int f416298b;

    TypeManifestation(int i12) {
        this.f416298b = i12;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int a() {
        return this.f416298b;
    }

    @Override // net.bytebuddy.description.modifier.a
    public final int b() {
        return 9744;
    }
}
