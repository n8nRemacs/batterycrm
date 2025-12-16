package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* compiled from: GeneratedMessageInfoFactory.java */
/* renamed from: androidx.datastore.preferences.protobuf.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C22896g0 implements E0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C22896g0 f45840a = new C22896g0();

    @Override // androidx.datastore.preferences.protobuf.E0
    public final boolean isSupported(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.E0
    public final D0 messageInfoFor(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (D0) GeneratedMessageLite.j(cls.asSubclass(GeneratedMessageLite.class)).h(GeneratedMessageLite.MethodToInvoke.f45661d);
        } catch (Exception e12) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e12);
        }
    }
}
