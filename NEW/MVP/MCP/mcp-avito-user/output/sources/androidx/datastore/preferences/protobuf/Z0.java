package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC22929t0;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
final class Z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Z0 f45797c = new Z0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f45799b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C22937x0 f45798a = new C22937x0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.J0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.datastore.preferences.protobuf.J0] */
    public final <T> InterfaceC22897g1<T> a(Class<T> cls) {
        I0 i0U;
        I0 j02;
        Class<?> cls2;
        C22914m0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f45799b;
        InterfaceC22897g1<T> interfaceC22897g1 = (InterfaceC22897g1) concurrentHashMap.get(cls);
        if (interfaceC22897g1 != null) {
            return interfaceC22897g1;
        }
        C22937x0 c22937x0 = this.f45798a;
        c22937x0.getClass();
        Class<?> cls3 = C22903i1.f45843a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = C22903i1.f45843a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        D0 d0MessageInfoFor = c22937x0.f45941a.messageInfoFor(cls);
        if (d0MessageInfoFor.isMessageSetWireFormat()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                j02 = new J0(C22903i1.f45846d, W.f45756a, d0MessageInfoFor.getDefaultInstance());
            } else {
                G1<?, ?> g12 = C22903i1.f45844b;
                U<?> u12 = W.f45757b;
                if (u12 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                j02 = new J0(g12, u12, d0MessageInfoFor.getDefaultInstance());
            }
            i0U = j02;
        } else {
            boolean zIsAssignableFrom = GeneratedMessageLite.class.isAssignableFrom(cls);
            ProtoSyntax protoSyntax = ProtoSyntax.f45735b;
            if (zIsAssignableFrom) {
                i0U = d0MessageInfoFor.getSyntax() == protoSyntax ? I0.u(d0MessageInfoFor, R0.f45739b, AbstractC22929t0.f45921b, C22903i1.f45846d, W.f45756a, C0.f45596b) : I0.u(d0MessageInfoFor, R0.f45739b, AbstractC22929t0.f45921b, C22903i1.f45846d, null, C0.f45596b);
            } else if (d0MessageInfoFor.getSyntax() == protoSyntax) {
                P0 p02 = R0.f45738a;
                AbstractC22929t0.b bVar = AbstractC22929t0.f45920a;
                G1<?, ?> g13 = C22903i1.f45844b;
                U<?> u13 = W.f45757b;
                if (u13 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                i0U = I0.u(d0MessageInfoFor, p02, bVar, g13, u13, C0.f45595a);
            } else {
                i0U = I0.u(d0MessageInfoFor, R0.f45738a, AbstractC22929t0.f45920a, C22903i1.f45845c, null, C0.f45595a);
            }
        }
        InterfaceC22897g1<T> interfaceC22897g12 = (InterfaceC22897g1) concurrentHashMap.putIfAbsent(cls, i0U);
        return interfaceC22897g12 != null ? interfaceC22897g12 : i0U;
    }
}
