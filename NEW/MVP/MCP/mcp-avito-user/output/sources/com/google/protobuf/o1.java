package com.google.protobuf;

import com.google.protobuf.Writer;

/* compiled from: UnknownFieldSetLiteSchema.java */
@InterfaceC37706w
/* loaded from: classes7.dex */
class o1 extends m1<n1, n1> {
    @Override // com.google.protobuf.m1
    public final void a(n1 n1Var, int i12, int i13) {
        n1Var.f((i12 << 3) | 5, Integer.valueOf(i13));
    }

    @Override // com.google.protobuf.m1
    public final void b(n1 n1Var, int i12, long j12) {
        n1Var.f((i12 << 3) | 1, Long.valueOf(j12));
    }

    @Override // com.google.protobuf.m1
    public final void c(n1 n1Var, int i12, n1 n1Var2) {
        n1Var.f((i12 << 3) | 3, n1Var2);
    }

    @Override // com.google.protobuf.m1
    public final void d(n1 n1Var, int i12, AbstractC37700t abstractC37700t) {
        n1Var.f((i12 << 3) | 2, abstractC37700t);
    }

    @Override // com.google.protobuf.m1
    public final void e(n1 n1Var, int i12, long j12) {
        n1Var.f(i12 << 3, Long.valueOf(j12));
    }

    @Override // com.google.protobuf.m1
    public final n1 f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        n1 n1Var = generatedMessageLite.unknownFields;
        if (n1Var != n1.f362921f) {
            return n1Var;
        }
        n1 n1Var2 = new n1();
        generatedMessageLite.unknownFields = n1Var2;
        return n1Var2;
    }

    @Override // com.google.protobuf.m1
    public final n1 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.m1
    public final int h(n1 n1Var) {
        return n1Var.c();
    }

    @Override // com.google.protobuf.m1
    public final int i(n1 n1Var) {
        n1 n1Var2 = n1Var;
        int i12 = n1Var2.f362925d;
        if (i12 != -1) {
            return i12;
        }
        int iJ2 = 0;
        for (int i13 = 0; i13 < n1Var2.f362922a; i13++) {
            int i14 = n1Var2.f362923b[i13] >>> 3;
            iJ2 += CodedOutputStream.j(3, (AbstractC37700t) n1Var2.f362924c[i13]) + CodedOutputStream.C(2, i14) + (CodedOutputStream.B(1) * 2);
        }
        n1Var2.f362925d = iJ2;
        return iJ2;
    }

    @Override // com.google.protobuf.m1
    public final void j(Object obj) {
        n1 n1Var = ((GeneratedMessageLite) obj).unknownFields;
        if (n1Var.f362926e) {
            n1Var.f362926e = false;
        }
    }

    @Override // com.google.protobuf.m1
    public final n1 k(Object obj, Object obj2) {
        n1 n1Var = (n1) obj;
        n1 n1Var2 = (n1) obj2;
        n1 n1Var3 = n1.f362921f;
        if (n1Var3.equals(n1Var2)) {
            return n1Var;
        }
        if (n1Var3.equals(n1Var)) {
            return n1.e(n1Var, n1Var2);
        }
        n1Var.getClass();
        if (n1Var2.equals(n1Var3)) {
            return n1Var;
        }
        n1Var.a();
        int i12 = n1Var.f362922a + n1Var2.f362922a;
        n1Var.b(i12);
        System.arraycopy(n1Var2.f362923b, 0, n1Var.f362923b, n1Var.f362922a, n1Var2.f362922a);
        System.arraycopy(n1Var2.f362924c, 0, n1Var.f362924c, n1Var.f362922a, n1Var2.f362922a);
        n1Var.f362922a = i12;
        return n1Var;
    }

    @Override // com.google.protobuf.m1
    public final n1 m() {
        return new n1();
    }

    @Override // com.google.protobuf.m1
    public final void n(Object obj, n1 n1Var) {
        ((GeneratedMessageLite) obj).unknownFields = n1Var;
    }

    @Override // com.google.protobuf.m1
    public final void o(Object obj, n1 n1Var) {
        ((GeneratedMessageLite) obj).unknownFields = n1Var;
    }

    @Override // com.google.protobuf.m1
    public final n1 p(Object obj) {
        n1 n1Var = (n1) obj;
        if (n1Var.f362926e) {
            n1Var.f362926e = false;
        }
        return n1Var;
    }

    @Override // com.google.protobuf.m1
    public final void q(n1 n1Var, Writer writer) {
        n1 n1Var2 = n1Var;
        n1Var2.getClass();
        if (writer.fieldOrder() == Writer.FieldOrder.f362825c) {
            for (int i12 = n1Var2.f362922a - 1; i12 >= 0; i12--) {
                writer.writeMessageSetItem(n1Var2.f362923b[i12] >>> 3, n1Var2.f362924c[i12]);
            }
            return;
        }
        for (int i13 = 0; i13 < n1Var2.f362922a; i13++) {
            writer.writeMessageSetItem(n1Var2.f362923b[i13] >>> 3, n1Var2.f362924c[i13]);
        }
    }

    @Override // com.google.protobuf.m1
    public final void r(n1 n1Var, Writer writer) {
        n1Var.h(writer);
    }
}
