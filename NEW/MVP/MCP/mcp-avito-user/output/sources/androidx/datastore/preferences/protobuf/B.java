package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22939y0;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes.dex */
final class B implements Writer {

    /* renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f45591a;

    /* compiled from: CodedOutputStreamWriter.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45592a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f45592a = iArr;
            try {
                iArr[WireFormat.FieldType.f45765k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45592a[WireFormat.FieldType.f45764j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45592a[WireFormat.FieldType.f45762h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45592a[WireFormat.FieldType.f45772r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45592a[WireFormat.FieldType.f45774t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45592a[WireFormat.FieldType.f45770p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45592a[WireFormat.FieldType.f45763i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45592a[WireFormat.FieldType.f45760f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45592a[WireFormat.FieldType.f45773s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45592a[WireFormat.FieldType.f45775u.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45592a[WireFormat.FieldType.f45761g.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45592a[WireFormat.FieldType.f45766l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public B(CodedOutputStream codedOutputStream) {
        C22914m0.a(codedOutputStream, "output");
        this.f45591a = codedOutputStream;
        codedOutputStream.f45600a = this;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void a(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1) {
        this.f45591a.Q(i12, (F0) obj, interfaceC22897g1);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void b(int i12, AbstractC22934w abstractC22934w) {
        this.f45591a.b(i12, abstractC22934w);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final <K, V> void c(int i12, C22939y0.b<K, V> bVar, Map<K, V> map) {
        CodedOutputStream codedOutputStream = this.f45591a;
        codedOutputStream.getClass();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            codedOutputStream.V(i12, 2);
            codedOutputStream.W(C22939y0.a(bVar, entry.getKey(), entry.getValue()));
            C22939y0.b(codedOutputStream, bVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void d(int i12, List<?> list, InterfaceC22897g1 interfaceC22897g1) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            e(i12, list.get(i13), interfaceC22897g1);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void e(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1) {
        CodedOutputStream codedOutputStream = this.f45591a;
        codedOutputStream.V(i12, 3);
        interfaceC22897g1.c((F0) obj, codedOutputStream.f45600a);
        codedOutputStream.V(i12, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void f(int i12, List<?> list, InterfaceC22897g1 interfaceC22897g1) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            a(i12, list.get(i13), interfaceC22897g1);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.f45792b;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBool(int i12, boolean z12) {
        this.f45591a.writeBool(i12, z12);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBoolList(int i12, List<Boolean> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeBool(i12, list.get(i13).booleanValue());
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f45598b;
            i14++;
        }
        codedOutputStream.W(i14);
        while (i13 < list.size()) {
            codedOutputStream.J(list.get(i13).booleanValue() ? (byte) 1 : (byte) 0);
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBytesList(int i12, List<AbstractC22934w> list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f45591a.b(i12, list.get(i13));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDouble(int i12, double d12) {
        CodedOutputStream codedOutputStream = this.f45591a;
        codedOutputStream.getClass();
        codedOutputStream.writeFixed64(i12, Double.doubleToRawLongBits(d12));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDoubleList(int i12, List<Double> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                double dDoubleValue = list.get(i13).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.writeFixed64(i12, Double.doubleToRawLongBits(dDoubleValue));
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f45598b;
            i14 += 8;
        }
        codedOutputStream.W(i14);
        while (i13 < list.size()) {
            codedOutputStream.N(Double.doubleToRawLongBits(list.get(i13).doubleValue()));
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEndGroup(int i12) {
        this.f45591a.V(i12, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnum(int i12, int i13) {
        this.f45591a.writeInt32(i12, i13);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnumList(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeInt32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int iS2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iS2 += CodedOutputStream.s(list.get(i14).intValue());
        }
        codedOutputStream.W(iS2);
        while (i13 < list.size()) {
            codedOutputStream.O(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32(int i12, int i13) {
        this.f45591a.writeFixed32(i12, i13);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeFixed32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f45598b;
            i14 += 4;
        }
        codedOutputStream.W(i14);
        while (i13 < list.size()) {
            codedOutputStream.M(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64(int i12, long j12) {
        this.f45591a.writeFixed64(i12, j12);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeFixed64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f45598b;
            i14 += 8;
        }
        codedOutputStream.W(i14);
        while (i13 < list.size()) {
            codedOutputStream.N(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloat(int i12, float f12) {
        CodedOutputStream codedOutputStream = this.f45591a;
        codedOutputStream.getClass();
        codedOutputStream.writeFixed32(i12, Float.floatToRawIntBits(f12));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloatList(int i12, List<Float> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                float fFloatValue = list.get(i13).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.writeFixed32(i12, Float.floatToRawIntBits(fFloatValue));
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f45598b;
            i14 += 4;
        }
        codedOutputStream.W(i14);
        while (i13 < list.size()) {
            codedOutputStream.M(Float.floatToRawIntBits(list.get(i13).floatValue()));
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32(int i12, int i13) {
        this.f45591a.writeInt32(i12, i13);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeInt32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int iS2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iS2 += CodedOutputStream.s(list.get(i14).intValue());
        }
        codedOutputStream.W(iS2);
        while (i13 < list.size()) {
            codedOutputStream.O(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64(int i12, long j12) {
        this.f45591a.writeUInt64(i12, j12);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeUInt64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int iF2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iF2 += CodedOutputStream.F(list.get(i14).longValue());
        }
        codedOutputStream.W(iF2);
        while (i13 < list.size()) {
            codedOutputStream.X(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessage(int i12, Object obj) {
        this.f45591a.P(i12, (F0) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i12, Object obj) {
        boolean z12 = obj instanceof AbstractC22934w;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (z12) {
            codedOutputStream.T(i12, (AbstractC22934w) obj);
        } else {
            codedOutputStream.S(i12, (F0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32(int i12, int i13) {
        this.f45591a.writeFixed32(i12, i13);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeFixed32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f45598b;
            i14 += 4;
        }
        codedOutputStream.W(i14);
        while (i13 < list.size()) {
            codedOutputStream.M(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64(int i12, long j12) {
        this.f45591a.writeFixed64(i12, j12);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeFixed64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f45598b;
            i14 += 8;
        }
        codedOutputStream.W(i14);
        while (i13 < list.size()) {
            codedOutputStream.N(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32(int i12, int i13) {
        this.f45591a.writeUInt32(i12, CodedOutputStream.G(i13));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeUInt32(i12, CodedOutputStream.G(list.get(i13).intValue()));
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int iD2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iD2 += CodedOutputStream.D(CodedOutputStream.G(list.get(i14).intValue()));
        }
        codedOutputStream.W(iD2);
        while (i13 < list.size()) {
            codedOutputStream.W(CodedOutputStream.G(list.get(i13).intValue()));
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64(int i12, long j12) {
        this.f45591a.writeUInt64(i12, CodedOutputStream.H(j12));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeUInt64(i12, CodedOutputStream.H(list.get(i13).longValue()));
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int iF2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iF2 += CodedOutputStream.F(CodedOutputStream.H(list.get(i14).longValue()));
        }
        codedOutputStream.W(iF2);
        while (i13 < list.size()) {
            codedOutputStream.X(CodedOutputStream.H(list.get(i13).longValue()));
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeStartGroup(int i12) {
        this.f45591a.V(i12, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeString(int i12, String str) {
        this.f45591a.writeString(i12, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeStringList(int i12, List<String> list) {
        boolean z12 = list instanceof InterfaceC22927s0;
        CodedOutputStream codedOutputStream = this.f45591a;
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeString(i12, list.get(i13));
                i13++;
            }
            return;
        }
        InterfaceC22927s0 interfaceC22927s0 = (InterfaceC22927s0) list;
        while (i13 < list.size()) {
            Object raw = interfaceC22927s0.getRaw(i13);
            if (raw instanceof String) {
                codedOutputStream.writeString(i12, (String) raw);
            } else {
                codedOutputStream.b(i12, (AbstractC22934w) raw);
            }
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32(int i12, int i13) {
        this.f45591a.writeUInt32(i12, i13);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeUInt32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int iD2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iD2 += CodedOutputStream.D(list.get(i14).intValue());
        }
        codedOutputStream.W(iD2);
        while (i13 < list.size()) {
            codedOutputStream.W(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64(int i12, long j12) {
        this.f45591a.writeUInt64(i12, j12);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f45591a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeUInt64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        codedOutputStream.V(i12, 2);
        int iF2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iF2 += CodedOutputStream.F(list.get(i14).longValue());
        }
        codedOutputStream.W(iF2);
        while (i13 < list.size()) {
            codedOutputStream.X(list.get(i13).longValue());
            i13++;
        }
    }
}
