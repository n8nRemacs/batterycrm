package com.google.protobuf;

import com.google.protobuf.C37678h0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.V;
import com.google.protobuf.WireFormat;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
@InterfaceC37706w
/* loaded from: classes7.dex */
final class A0<T> implements T0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC37707w0 f362592a;

    /* renamed from: b, reason: collision with root package name */
    public final m1<?, ?> f362593b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f362594c;

    /* renamed from: d, reason: collision with root package name */
    public final N<?> f362595d;

    public A0(m1<?, ?> m1Var, N<?> n12, InterfaceC37707w0 interfaceC37707w0) {
        this.f362593b = m1Var;
        this.f362594c = n12.e(interfaceC37707w0);
        this.f362595d = n12;
        this.f362592a = interfaceC37707w0;
    }

    @Override // com.google.protobuf.T0
    public final int a(GeneratedMessageLite generatedMessageLite) {
        int iHashCode = this.f362593b.g(generatedMessageLite).hashCode();
        return this.f362594c ? (iHashCode * 53) + this.f362595d.c(generatedMessageLite).f362769a.hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.T0
    public final void b(T t12, Writer writer) {
        Iterator itM = this.f362595d.c(t12).m();
        while (itM.hasNext()) {
            Map.Entry entry = (Map.Entry) itM.next();
            V.c cVar = (V.c) entry.getKey();
            if (cVar.getLiteJavaType() != WireFormat.JavaType.MESSAGE || cVar.isRepeated() || cVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C37678h0.b) {
                writer.writeMessageSetItem(cVar.getNumber(), ((C37678h0.b) entry).f362877b.getValue().b());
            } else {
                writer.writeMessageSetItem(cVar.getNumber(), entry.getValue());
            }
        }
        m1<?, ?> m1Var = this.f362593b;
        m1Var.q(m1Var.g(t12), writer);
    }

    @Override // com.google.protobuf.T0
    public final int c(AbstractC37663a abstractC37663a) {
        m1<?, ?> m1Var = this.f362593b;
        int i12 = m1Var.i(m1Var.g(abstractC37663a));
        return this.f362594c ? i12 + this.f362595d.c(abstractC37663a).g() : i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    @Override // com.google.protobuf.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(T r17, byte[] r18, int r19, int r20, com.google.protobuf.C37685l.b r21) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.A0.d(java.lang.Object, byte[], int, int, com.google.protobuf.l$b):void");
    }

    @Override // com.google.protobuf.T0
    public final void e(T t12, R0 r02, M m12) {
        m1 m1Var = this.f362593b;
        n1 n1VarF = m1Var.f(t12);
        N n12 = this.f362595d;
        V<ET> vD2 = n12.d(t12);
        while (r02.getFieldNumber() != Integer.MAX_VALUE && g(r02, m12, n12, vD2, m1Var, n1VarF)) {
            try {
            } finally {
                m1Var.n(t12, n1VarF);
            }
        }
    }

    @Override // com.google.protobuf.T0
    public final boolean f(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        m1<?, ?> m1Var = this.f362593b;
        if (!m1Var.g(generatedMessageLite).equals(m1Var.g(generatedMessageLite2))) {
            return false;
        }
        if (!this.f362594c) {
            return true;
        }
        N<?> n12 = this.f362595d;
        return n12.c(generatedMessageLite).equals(n12.c(generatedMessageLite2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends V.c<ET>> boolean g(R0 r02, M m12, N<ET> n12, V<ET> v12, m1<UT, UB> m1Var, UB ub2) throws InvalidProtocolBufferException {
        int tag = r02.getTag();
        InterfaceC37707w0 interfaceC37707w0 = this.f362592a;
        if (tag != 11) {
            if ((tag & 7) != 2) {
                return r02.skipField();
            }
            GeneratedMessageLite.g gVarB = n12.b(m12, interfaceC37707w0, tag >>> 3);
            if (gVarB == null) {
                return m1Var.l(ub2, r02);
            }
            n12.h(r02, gVarB, m12, v12);
            return true;
        }
        GeneratedMessageLite.g gVarB2 = null;
        int uInt32 = 0;
        AbstractC37700t bytes = null;
        while (r02.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = r02.getTag();
            if (tag2 == 16) {
                uInt32 = r02.readUInt32();
                gVarB2 = n12.b(m12, interfaceC37707w0, uInt32);
            } else if (tag2 == 26) {
                if (gVarB2 != null) {
                    n12.h(r02, gVarB2, m12, v12);
                } else {
                    bytes = r02.readBytes();
                }
            } else if (!r02.skipField()) {
                break;
            }
        }
        if (r02.getTag() != 12) {
            throw InvalidProtocolBufferException.a();
        }
        if (bytes != null) {
            if (gVarB2 != null) {
                n12.i(bytes, gVarB2, m12, v12);
            } else {
                m1Var.d(ub2, uInt32, bytes);
            }
        }
        return true;
    }

    @Override // com.google.protobuf.T0
    public final boolean isInitialized(T t12) {
        return this.f362595d.c(t12).k();
    }

    @Override // com.google.protobuf.T0
    public final void makeImmutable(T t12) {
        this.f362593b.j(t12);
        this.f362595d.f(t12);
    }

    @Override // com.google.protobuf.T0
    public final void mergeFrom(T t12, T t13) {
        Class<?> cls = V0.f362774a;
        m1<?, ?> m1Var = this.f362593b;
        m1Var.o(t12, m1Var.k(m1Var.g(t12), m1Var.g(t13)));
        if (this.f362594c) {
            N<?> n12 = this.f362595d;
            V<T> vC2 = n12.c(t13);
            if (vC2.f362769a.isEmpty()) {
                return;
            }
            n12.d(t12).o(vC2);
        }
    }

    @Override // com.google.protobuf.T0
    public final T newInstance() {
        InterfaceC37707w0 interfaceC37707w0 = this.f362592a;
        return interfaceC37707w0 instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) interfaceC37707w0).newMutableInstance() : (T) interfaceC37707w0.newBuilderForType().buildPartial();
    }
}
