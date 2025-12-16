package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22884c0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes.dex */
final class J0<T> implements InterfaceC22897g1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final F0 f45697a;

    /* renamed from: b, reason: collision with root package name */
    public final G1<?, ?> f45698b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f45699c;

    /* renamed from: d, reason: collision with root package name */
    public final U<?> f45700d;

    public J0(G1<?, ?> g12, U<?> u12, F0 f02) {
        this.f45698b = g12;
        this.f45699c = u12.e(f02);
        this.f45700d = u12;
        this.f45697a = f02;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final int a(AbstractC22877a abstractC22877a) {
        G1<?, ?> g12 = this.f45698b;
        int i12 = g12.i(g12.g(abstractC22877a));
        if (this.f45699c) {
            C22909k1<T, Object> c22909k1 = this.f45700d.c(abstractC22877a).f45806a;
            if (c22909k1.f45851c.size() > 0) {
                C22884c0.d(c22909k1.c(0));
                throw null;
            }
            Iterator<T> it = c22909k1.d().iterator();
            if (it.hasNext()) {
                C22884c0.d((Map.Entry) it.next());
                throw null;
            }
        }
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final boolean b(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        G1<?, ?> g12 = this.f45698b;
        if (!g12.g(generatedMessageLite).equals(g12.g(generatedMessageLite2))) {
            return false;
        }
        if (!this.f45699c) {
            return true;
        }
        U<?> u12 = this.f45700d;
        return u12.c(generatedMessageLite).equals(u12.c(generatedMessageLite2));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final void c(T t12, Writer writer) {
        Iterator itI = this.f45700d.c(t12).i();
        if (itI.hasNext()) {
            ((C22884c0.c) ((Map.Entry) itI.next()).getKey()).getLiteJavaType();
            throw null;
        }
        G1<?, ?> g12 = this.f45698b;
        g12.q(g12.g(t12), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final void d(T t12, InterfaceC22891e1 interfaceC22891e1, T t13) {
        G1 g12 = this.f45698b;
        H1 h1F = g12.f(t12);
        U u12 = this.f45700d;
        C22884c0<ET> c22884c0D = u12.d(t12);
        while (interfaceC22891e1.getFieldNumber() != Integer.MAX_VALUE && g(interfaceC22891e1, t13, u12, c22884c0D, g12, h1F)) {
            try {
            } finally {
                g12.n(t12, h1F);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final void e(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        Class<?> cls = C22903i1.f45843a;
        G1<?, ?> g12 = this.f45698b;
        g12.o(generatedMessageLite, g12.k(g12.g(generatedMessageLite), g12.g(generatedMessageLite2)));
        if (this.f45699c) {
            C22903i1.B(this.f45700d, generatedMessageLite, generatedMessageLite2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final int f(GeneratedMessageLite generatedMessageLite) {
        int iHashCode = this.f45698b.g(generatedMessageLite).hashCode();
        return this.f45699c ? (iHashCode * 53) + this.f45700d.c(generatedMessageLite).f45806a.hashCode() : iHashCode;
    }

    public final <UT, UB, ET extends C22884c0.c<ET>> boolean g(InterfaceC22891e1 interfaceC22891e1, T t12, U<ET> u12, C22884c0<ET> c22884c0, G1<UT, UB> g12, UB ub2) throws InvalidProtocolBufferException {
        int tag = interfaceC22891e1.getTag();
        F0 f02 = this.f45697a;
        if (tag != 11) {
            if ((tag & 7) != 2) {
                return interfaceC22891e1.skipField();
            }
            GeneratedMessageLite.h hVarB = u12.b(t12, f02, tag >>> 3);
            if (hVarB == null) {
                return g12.l(ub2, interfaceC22891e1);
            }
            u12.h(hVarB);
            throw null;
        }
        int uInt32 = 0;
        GeneratedMessageLite.h hVarB2 = null;
        AbstractC22934w bytes = null;
        while (interfaceC22891e1.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = interfaceC22891e1.getTag();
            if (tag2 == 16) {
                uInt32 = interfaceC22891e1.readUInt32();
                hVarB2 = u12.b(t12, f02, uInt32);
            } else if (tag2 == 26) {
                if (hVarB2 != null) {
                    u12.h(hVarB2);
                    throw null;
                }
                bytes = interfaceC22891e1.readBytes();
            } else if (!interfaceC22891e1.skipField()) {
                break;
            }
        }
        if (interfaceC22891e1.getTag() != 12) {
            throw InvalidProtocolBufferException.a();
        }
        if (bytes == null) {
            return true;
        }
        if (hVarB2 == null) {
            g12.d(ub2, uInt32, bytes);
            return true;
        }
        u12.i(hVarB2);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final boolean isInitialized(T t12) {
        this.f45700d.c(t12).g();
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final void makeImmutable(T t12) {
        this.f45698b.j(t12);
        this.f45700d.f(t12);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final T newInstance() {
        return (T) this.f45697a.newBuilderForType().buildPartial();
    }
}
