package com.google.protobuf;

import com.google.protobuf.AbstractC37686l0;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Protobuf.java */
@InterfaceC37706w
/* loaded from: classes7.dex */
final class N0 {

    /* renamed from: c, reason: collision with root package name */
    public static final N0 f362717c = new N0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f362719b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C37692o0 f362718a = new C37692o0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.protobuf.A0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.protobuf.A0] */
    public final <T> T0<T> a(Class<T> cls) {
        C37713z0 c37713z0A;
        C37713z0 a02;
        Class<?> cls2;
        C37670d0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f362719b;
        T0<T> t02 = (T0) concurrentHashMap.get(cls);
        if (t02 != null) {
            return t02;
        }
        C37692o0 c37692o0 = this.f362718a;
        c37692o0.getClass();
        Class<?> cls3 = V0.f362774a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = V0.f362774a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        InterfaceC37703u0 interfaceC37703u0MessageInfoFor = c37692o0.f362928a.messageInfoFor(cls);
        if (interfaceC37703u0MessageInfoFor.isMessageSetWireFormat()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                a02 = new A0(V0.f362776c, P.f362729a, interfaceC37703u0MessageInfoFor.getDefaultInstance());
            } else {
                m1<?, ?> m1Var = V0.f362775b;
                N<?> n12 = P.f362730b;
                if (n12 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                a02 = new A0(m1Var, n12, interfaceC37703u0MessageInfoFor.getDefaultInstance());
            }
            c37713z0A = a02;
        } else {
            boolean zIsAssignableFrom = GeneratedMessageLite.class.isAssignableFrom(cls);
            ProtoSyntax protoSyntax = ProtoSyntax.f362731b;
            if (zIsAssignableFrom) {
                c37713z0A = interfaceC37703u0MessageInfoFor.getSyntax() == protoSyntax ? C37713z0.A(interfaceC37703u0MessageInfoFor, G0.f362669b, AbstractC37686l0.f362889b, V0.f362776c, P.f362729a, C37701t0.f362966b) : C37713z0.A(interfaceC37703u0MessageInfoFor, G0.f362669b, AbstractC37686l0.f362889b, V0.f362776c, null, C37701t0.f362966b);
            } else if (interfaceC37703u0MessageInfoFor.getSyntax() == protoSyntax) {
                E0 e02 = G0.f362668a;
                AbstractC37686l0.b bVar = AbstractC37686l0.f362888a;
                m1<?, ?> m1Var2 = V0.f362775b;
                N<?> n13 = P.f362730b;
                if (n13 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c37713z0A = C37713z0.A(interfaceC37703u0MessageInfoFor, e02, bVar, m1Var2, n13, C37701t0.f362965a);
            } else {
                c37713z0A = C37713z0.A(interfaceC37703u0MessageInfoFor, G0.f362668a, AbstractC37686l0.f362888a, V0.f362775b, null, C37701t0.f362965a);
            }
        }
        T0<T> t03 = (T0) concurrentHashMap.putIfAbsent(cls, c37713z0A);
        return t03 != null ? t03 : c37713z0A;
    }

    public final <T> T0<T> b(T t12) {
        return a(t12.getClass());
    }
}
