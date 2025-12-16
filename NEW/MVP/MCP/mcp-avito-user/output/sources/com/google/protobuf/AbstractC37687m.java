package com.google.protobuf;

import com.google.protobuf.C37694p0;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import java.util.List;
import java.util.Map;

/* compiled from: BinaryReader.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC37687m implements R0 {

    /* compiled from: BinaryReader.java */
    /* renamed from: com.google.protobuf.m$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362891a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f362891a = iArr;
            try {
                iArr[WireFormat.FieldType.f362796k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362891a[WireFormat.FieldType.f362800o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362891a[WireFormat.FieldType.f362789d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362891a[WireFormat.FieldType.f362802q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362891a[WireFormat.FieldType.f362795j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362891a[WireFormat.FieldType.f362794i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362891a[WireFormat.FieldType.f362790e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f362891a[WireFormat.FieldType.f362793h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f362891a[WireFormat.FieldType.f362791f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f362891a[WireFormat.FieldType.f362799n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f362891a[WireFormat.FieldType.f362803r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f362891a[WireFormat.FieldType.f362804s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f362891a[WireFormat.FieldType.f362805t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f362891a[WireFormat.FieldType.f362806u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f362891a[WireFormat.FieldType.f362797l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f362891a[WireFormat.FieldType.f362801p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f362891a[WireFormat.FieldType.f362792g.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryReader.java */
    /* renamed from: com.google.protobuf.m$b */
    public static final class b extends AbstractC37687m {
        public static void i(int i12) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (i12 != 0) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.protobuf.R0
        public final <T> void a(T t12, T0<T> t02, M m12) {
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final <T> void b(List<T> list, T0<T> t02, M m12) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.R0
        @Deprecated
        public final <T> T c(Class<T> cls, M m12) throws InvalidProtocolBufferException {
            i(3);
            T0<T> t0A = N0.f362717c.a(cls);
            f(t0A.newInstance(), t0A, m12);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final <T> T d(Class<T> cls, M m12) throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(2);
            N0.f362717c.a(cls).newInstance();
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final <K, V> void e(Map<K, V> map, C37694p0.b<K, V> bVar, M m12) throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(2);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final <T> void f(T t12, T0<T> t02, M m12) throws InvalidProtocolBufferException {
            t02.e(t12, this, m12);
            throw InvalidProtocolBufferException.g();
        }

        @Override // com.google.protobuf.R0
        @Deprecated
        public final <T> void g(List<T> list, T0<T> t02, M m12) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.R0
        public final int getFieldNumber() {
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final int getTag() {
            return 0;
        }

        public final void h(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readBoolList(List<Boolean> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof C37693p) {
                readBool();
                throw null;
            }
            readBool();
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final AbstractC37700t readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(2);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readBytesList(List<AbstractC37700t> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.R0
        public final double readDouble() throws InvalidProtocolBufferException {
            i(1);
            h(8);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readDoubleList(List<Double> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof B)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.R0
        public final int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readEnumList(List<Integer> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof C37668c0) {
                readEnum();
                throw null;
            }
            readEnum();
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final int readFixed32() throws InvalidProtocolBufferException {
            i(5);
            h(4);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readFixed32List(List<Integer> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof C37668c0)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.R0
        public final long readFixed64() throws InvalidProtocolBufferException {
            i(1);
            h(8);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readFixed64List(List<Long> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof C37690n0)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.R0
        public final float readFloat() throws InvalidProtocolBufferException {
            i(5);
            h(4);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readFloatList(List<Float> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof W)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.R0
        public final int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readInt32List(List<Integer> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof C37668c0) {
                readInt32();
                throw null;
            }
            readInt32();
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readInt64List(List<Long> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof C37690n0) {
                readInt64();
                throw null;
            }
            readInt64();
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final int readSFixed32() throws InvalidProtocolBufferException {
            i(5);
            h(4);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readSFixed32List(List<Integer> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof C37668c0)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.R0
        public final long readSFixed64() throws InvalidProtocolBufferException {
            i(1);
            h(8);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readSFixed64List(List<Long> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof C37690n0)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.R0
        public final int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readSInt32List(List<Integer> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof C37668c0) {
                readSInt32();
                throw null;
            }
            readSInt32();
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readSInt64List(List<Long> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof C37690n0) {
                readSInt64();
                throw null;
            }
            readSInt64();
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(2);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readStringList(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.R0
        public final void readStringListRequireUtf8(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.R0
        public final String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(2);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readUInt32List(List<Integer> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof C37668c0) {
                readUInt32();
                throw null;
            }
            readUInt32();
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
            i(0);
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final void readUInt64List(List<Long> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof C37690n0) {
                readUInt64();
                throw null;
            }
            readUInt64();
            throw null;
        }

        @Override // com.google.protobuf.R0
        public final boolean skipField() {
            throw null;
        }
    }

    public /* synthetic */ AbstractC37687m(a aVar) {
        this();
    }

    public AbstractC37687m() {
    }
}
