package com.google.protobuf;

import java.nio.charset.Charset;

/* compiled from: ManifestSchemaFactory.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.o0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37692o0 implements U0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f362927b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b f362928a;

    /* compiled from: ManifestSchemaFactory.java */
    /* renamed from: com.google.protobuf.o0$a */
    public class a implements InterfaceC37705v0 {
        @Override // com.google.protobuf.InterfaceC37705v0
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.InterfaceC37705v0
        public final InterfaceC37703u0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    /* renamed from: com.google.protobuf.o0$b */
    public static class b implements InterfaceC37705v0 {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC37705v0[] f362929a;

        @Override // com.google.protobuf.InterfaceC37705v0
        public final boolean isSupported(Class<?> cls) {
            for (InterfaceC37705v0 interfaceC37705v0 : this.f362929a) {
                if (interfaceC37705v0.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.InterfaceC37705v0
        public final InterfaceC37703u0 messageInfoFor(Class<?> cls) {
            for (InterfaceC37705v0 interfaceC37705v0 : this.f362929a) {
                if (interfaceC37705v0.isSupported(cls)) {
                    return interfaceC37705v0.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public C37692o0() {
        InterfaceC37705v0 interfaceC37705v0;
        try {
            interfaceC37705v0 = (InterfaceC37705v0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            interfaceC37705v0 = f362927b;
        }
        InterfaceC37705v0[] interfaceC37705v0Arr = {Y.f362849a, interfaceC37705v0};
        b bVar = new b();
        bVar.f362929a = interfaceC37705v0Arr;
        Charset charset = C37670d0.f362857a;
        this.f362928a = bVar;
    }
}
