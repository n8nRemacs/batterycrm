package com.google.protobuf;

import com.google.protobuf.C37694p0;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: CodedOutputStreamWriter.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37712z implements Writer {

    /* renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f363011a;

    /* compiled from: CodedOutputStreamWriter.java */
    /* renamed from: com.google.protobuf.z$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f363012a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f363012a = iArr;
            try {
                iArr[WireFormat.FieldType.f362796k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f363012a[WireFormat.FieldType.f362795j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f363012a[WireFormat.FieldType.f362793h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f363012a[WireFormat.FieldType.f362803r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f363012a[WireFormat.FieldType.f362805t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f363012a[WireFormat.FieldType.f362801p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f363012a[WireFormat.FieldType.f362794i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f363012a[WireFormat.FieldType.f362791f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f363012a[WireFormat.FieldType.f362804s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f363012a[WireFormat.FieldType.f362806u.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f363012a[WireFormat.FieldType.f362792g.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f363012a[WireFormat.FieldType.f362797l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C37712z(CodedOutputStream codedOutputStream) {
        C37670d0.a(codedOutputStream, "output");
        this.f363011a = codedOutputStream;
        codedOutputStream.f362605a = this;
    }

    @Override // com.google.protobuf.Writer
    public final void a(int i12, AbstractC37700t abstractC37700t) {
        this.f363011a.a(i12, abstractC37700t);
    }

    @Override // com.google.protobuf.Writer
    public final void b(int i12, List<?> list, T0 t02) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            e(i12, list.get(i13), t02);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void c(int i12, Object obj, T0 t02) {
        CodedOutputStream codedOutputStream = this.f363011a;
        codedOutputStream.W(i12, 3);
        t02.b((InterfaceC37707w0) obj, codedOutputStream.f362605a);
        codedOutputStream.W(i12, 4);
    }

    @Override // com.google.protobuf.Writer
    public final void d(int i12, List<?> list, T0 t02) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            c(i12, list.get(i13), t02);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void e(int i12, Object obj, T0 t02) {
        this.f363011a.R(i12, (InterfaceC37707w0) obj, t02);
    }

    @Override // com.google.protobuf.Writer
    public final <K, V> void f(int i12, C37694p0.b<K, V> bVar, Map<K, V> map) {
        CodedOutputStream codedOutputStream = this.f363011a;
        codedOutputStream.getClass();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            codedOutputStream.W(i12, 2);
            codedOutputStream.X(C37694p0.a(bVar, entry.getKey(), entry.getValue()));
            K key = entry.getKey();
            V value = entry.getValue();
            V.s(codedOutputStream, bVar.f362936a, 1, key);
            V.s(codedOutputStream, bVar.f362937b, 2, value);
        }
    }

    @Override // com.google.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.f362824b;
    }

    @Override // com.google.protobuf.Writer
    public final void writeBool(int i12, boolean z12) {
        this.f363011a.writeBool(i12, z12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeBoolList(int i12, List<Boolean> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeBool(i12, list.get(i13).booleanValue());
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f362603b;
            i14++;
        }
        codedOutputStream.X(i14);
        while (i13 < list.size()) {
            codedOutputStream.K(list.get(i13).booleanValue() ? (byte) 1 : (byte) 0);
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeBytesList(int i12, List<AbstractC37700t> list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f363011a.a(i12, list.get(i13));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeDouble(int i12, double d12) {
        CodedOutputStream codedOutputStream = this.f363011a;
        codedOutputStream.getClass();
        codedOutputStream.writeFixed64(i12, Double.doubleToRawLongBits(d12));
    }

    @Override // com.google.protobuf.Writer
    public final void writeDoubleList(int i12, List<Double> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                double dDoubleValue = list.get(i13).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.writeFixed64(i12, Double.doubleToRawLongBits(dDoubleValue));
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f362603b;
            i14 += 8;
        }
        codedOutputStream.X(i14);
        while (i13 < list.size()) {
            codedOutputStream.O(Double.doubleToRawLongBits(list.get(i13).doubleValue()));
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    @Deprecated
    public final void writeEndGroup(int i12) {
        this.f363011a.W(i12, 4);
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnum(int i12, int i13) {
        this.f363011a.writeInt32(i12, i13);
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnumList(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeInt32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int iS2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iS2 += CodedOutputStream.s(list.get(i14).intValue());
        }
        codedOutputStream.X(iS2);
        while (i13 < list.size()) {
            codedOutputStream.P(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeFixed32(int i12, int i13) {
        this.f363011a.writeFixed32(i12, i13);
    }

    @Override // com.google.protobuf.Writer
    public final void writeFixed32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeFixed32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f362603b;
            i14 += 4;
        }
        codedOutputStream.X(i14);
        while (i13 < list.size()) {
            codedOutputStream.N(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeFixed64(int i12, long j12) {
        this.f363011a.writeFixed64(i12, j12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeFixed64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeFixed64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f362603b;
            i14 += 8;
        }
        codedOutputStream.X(i14);
        while (i13 < list.size()) {
            codedOutputStream.O(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloat(int i12, float f12) {
        CodedOutputStream codedOutputStream = this.f363011a;
        codedOutputStream.getClass();
        codedOutputStream.writeFixed32(i12, Float.floatToRawIntBits(f12));
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloatList(int i12, List<Float> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                float fFloatValue = list.get(i13).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.writeFixed32(i12, Float.floatToRawIntBits(fFloatValue));
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f362603b;
            i14 += 4;
        }
        codedOutputStream.X(i14);
        while (i13 < list.size()) {
            codedOutputStream.N(Float.floatToRawIntBits(list.get(i13).floatValue()));
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt32(int i12, int i13) {
        this.f363011a.writeInt32(i12, i13);
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeInt32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int iS2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iS2 += CodedOutputStream.s(list.get(i14).intValue());
        }
        codedOutputStream.X(iS2);
        while (i13 < list.size()) {
            codedOutputStream.P(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64(int i12, long j12) {
        this.f363011a.writeUInt64(i12, j12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeUInt64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int iF2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iF2 += CodedOutputStream.F(list.get(i14).longValue());
        }
        codedOutputStream.X(iF2);
        while (i13 < list.size()) {
            codedOutputStream.Y(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessage(int i12, Object obj) {
        this.f363011a.Q(i12, (InterfaceC37707w0) obj);
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageSetItem(int i12, Object obj) {
        boolean z12 = obj instanceof AbstractC37700t;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (z12) {
            codedOutputStream.U(i12, (AbstractC37700t) obj);
        } else {
            codedOutputStream.T(i12, (InterfaceC37707w0) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32(int i12, int i13) {
        this.f363011a.writeFixed32(i12, i13);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeFixed32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f362603b;
            i14 += 4;
        }
        codedOutputStream.X(i14);
        while (i13 < list.size()) {
            codedOutputStream.N(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64(int i12, long j12) {
        this.f363011a.writeFixed64(i12, j12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeFixed64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).getClass();
            Logger logger = CodedOutputStream.f362603b;
            i14 += 8;
        }
        codedOutputStream.X(i14);
        while (i13 < list.size()) {
            codedOutputStream.O(list.get(i13).longValue());
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeSInt32(int i12, int i13) {
        this.f363011a.writeUInt32(i12, CodedOutputStream.G(i13));
    }

    @Override // com.google.protobuf.Writer
    public final void writeSInt32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeUInt32(i12, CodedOutputStream.G(list.get(i13).intValue()));
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int iD2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iD2 += CodedOutputStream.D(CodedOutputStream.G(list.get(i14).intValue()));
        }
        codedOutputStream.X(iD2);
        while (i13 < list.size()) {
            codedOutputStream.X(CodedOutputStream.G(list.get(i13).intValue()));
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeSInt64(int i12, long j12) {
        this.f363011a.writeUInt64(i12, CodedOutputStream.H(j12));
    }

    @Override // com.google.protobuf.Writer
    public final void writeSInt64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeUInt64(i12, CodedOutputStream.H(list.get(i13).longValue()));
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int iF2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iF2 += CodedOutputStream.F(CodedOutputStream.H(list.get(i14).longValue()));
        }
        codedOutputStream.X(iF2);
        while (i13 < list.size()) {
            codedOutputStream.Y(CodedOutputStream.H(list.get(i13).longValue()));
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    @Deprecated
    public final void writeStartGroup(int i12) {
        this.f363011a.W(i12, 3);
    }

    @Override // com.google.protobuf.Writer
    public final void writeString(int i12, String str) {
        this.f363011a.writeString(i12, str);
    }

    @Override // com.google.protobuf.Writer
    public final void writeStringList(int i12, List<String> list) {
        boolean z12 = list instanceof InterfaceC37684k0;
        CodedOutputStream codedOutputStream = this.f363011a;
        int i13 = 0;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeString(i12, list.get(i13));
                i13++;
            }
            return;
        }
        InterfaceC37684k0 interfaceC37684k0 = (InterfaceC37684k0) list;
        while (i13 < list.size()) {
            Object raw = interfaceC37684k0.getRaw(i13);
            if (raw instanceof String) {
                codedOutputStream.writeString(i12, (String) raw);
            } else {
                codedOutputStream.a(i12, (AbstractC37700t) raw);
            }
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt32(int i12, int i13) {
        this.f363011a.writeUInt32(i12, i13);
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt32List(int i12, List<Integer> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeUInt32(i12, list.get(i13).intValue());
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int iD2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iD2 += CodedOutputStream.D(list.get(i14).intValue());
        }
        codedOutputStream.X(iD2);
        while (i13 < list.size()) {
            codedOutputStream.X(list.get(i13).intValue());
            i13++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt64(int i12, long j12) {
        this.f363011a.writeUInt64(i12, j12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt64List(int i12, List<Long> list, boolean z12) {
        int i13 = 0;
        CodedOutputStream codedOutputStream = this.f363011a;
        if (!z12) {
            while (i13 < list.size()) {
                codedOutputStream.writeUInt64(i12, list.get(i13).longValue());
                i13++;
            }
            return;
        }
        codedOutputStream.W(i12, 2);
        int iF2 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            iF2 += CodedOutputStream.F(list.get(i14).longValue());
        }
        codedOutputStream.X(iF2);
        while (i13 < list.size()) {
            codedOutputStream.Y(list.get(i13).longValue());
            i13++;
        }
    }
}
