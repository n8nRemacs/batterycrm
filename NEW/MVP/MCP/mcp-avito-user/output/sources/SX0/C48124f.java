package sX0;

import java.nio.file.Path;

/* compiled from: Java7HandlersImpl.java */
/* renamed from: sX0.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C48124f extends AbstractC48123e {

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f437701b = Path.class;

    @Override // sX0.AbstractC48123e
    public final C48127i a(Class cls) {
        if (cls == this.f437701b) {
            return new C48127i();
        }
        return null;
    }

    @Override // sX0.AbstractC48123e
    public final C48128j b(Class cls) {
        if (this.f437701b.isAssignableFrom(cls)) {
            return new C48128j();
        }
        return null;
    }
}
