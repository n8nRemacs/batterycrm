package com.google.protobuf;

/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes7.dex */
class Y implements InterfaceC37705v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f362849a = new Y();

    @Override // com.google.protobuf.InterfaceC37705v0
    public final boolean isSupported(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.InterfaceC37705v0
    public final InterfaceC37703u0 messageInfoFor(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC37703u0) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
        } catch (Exception e12) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e12);
        }
    }
}
