package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes.dex */
class I1 extends G1<H1, H1> {
    @Override // androidx.datastore.preferences.protobuf.G1
    public final void a(H1 h12, int i12, int i13) {
        h12.b((i12 << 3) | 5, Integer.valueOf(i13));
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final void b(H1 h12, int i12, long j12) {
        h12.b((i12 << 3) | 1, Long.valueOf(j12));
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final void c(H1 h12, int i12, H1 h13) {
        h12.b((i12 << 3) | 3, h13);
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final void d(H1 h12, int i12, AbstractC22934w abstractC22934w) {
        h12.b((i12 << 3) | 2, abstractC22934w);
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final void e(H1 h12, int i12, long j12) {
        h12.b(i12 << 3, Long.valueOf(j12));
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final H1 f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        H1 h12 = generatedMessageLite.unknownFields;
        if (h12 != H1.f45671f) {
            return h12;
        }
        H1 h13 = new H1();
        generatedMessageLite.unknownFields = h13;
        return h13;
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final H1 g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final int h(H1 h12) {
        return h12.a();
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final int i(H1 h12) {
        H1 h13 = h12;
        int i12 = h13.f45675d;
        if (i12 != -1) {
            return i12;
        }
        int iJ2 = 0;
        for (int i13 = 0; i13 < h13.f45672a; i13++) {
            int i14 = h13.f45673b[i13] >>> 3;
            iJ2 += CodedOutputStream.j(3, (AbstractC22934w) h13.f45674c[i13]) + CodedOutputStream.C(2, i14) + (CodedOutputStream.B(1) * 2);
        }
        h13.f45675d = iJ2;
        return iJ2;
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final void j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f45676e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final H1 k(Object obj, Object obj2) {
        H1 h12 = (H1) obj;
        H1 h13 = (H1) obj2;
        if (h13.equals(H1.f45671f)) {
            return h12;
        }
        int i12 = h12.f45672a + h13.f45672a;
        int[] iArrCopyOf = Arrays.copyOf(h12.f45673b, i12);
        System.arraycopy(h13.f45673b, 0, iArrCopyOf, h12.f45672a, h13.f45672a);
        Object[] objArrCopyOf = Arrays.copyOf(h12.f45674c, i12);
        System.arraycopy(h13.f45674c, 0, objArrCopyOf, h12.f45672a, h13.f45672a);
        return new H1(i12, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final H1 m() {
        return new H1();
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final void n(Object obj, H1 h12) {
        ((GeneratedMessageLite) obj).unknownFields = h12;
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final void o(GeneratedMessageLite generatedMessageLite, Object obj) {
        generatedMessageLite.unknownFields = (H1) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final H1 p(Object obj) {
        H1 h12 = (H1) obj;
        h12.f45676e = false;
        return h12;
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final void q(H1 h12, Writer writer) {
        H1 h13 = h12;
        h13.getClass();
        if (writer.fieldOrder() == Writer.FieldOrder.f45793c) {
            for (int i12 = h13.f45672a - 1; i12 >= 0; i12--) {
                writer.writeMessageSetItem(h13.f45673b[i12] >>> 3, h13.f45674c[i12]);
            }
            return;
        }
        for (int i13 = 0; i13 < h13.f45672a; i13++) {
            writer.writeMessageSetItem(h13.f45673b[i13] >>> 3, h13.f45674c[i13]);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.G1
    public final void r(H1 h12, Writer writer) {
        h12.d(writer);
    }
}
