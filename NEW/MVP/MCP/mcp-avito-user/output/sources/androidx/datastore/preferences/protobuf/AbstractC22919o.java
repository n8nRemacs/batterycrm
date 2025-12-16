package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C22939y0;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.List;
import java.util.Map;

/* compiled from: BinaryReader.java */
/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC22919o implements InterfaceC22891e1 {

    /* compiled from: BinaryReader.java */
    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45879a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f45879a = iArr;
            try {
                iArr[WireFormat.FieldType.f45765k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45879a[WireFormat.FieldType.f45769o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45879a[WireFormat.FieldType.f45758d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45879a[WireFormat.FieldType.f45771q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45879a[WireFormat.FieldType.f45764j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45879a[WireFormat.FieldType.f45763i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45879a[WireFormat.FieldType.f45759e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45879a[WireFormat.FieldType.f45762h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45879a[WireFormat.FieldType.f45760f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45879a[WireFormat.FieldType.f45768n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45879a[WireFormat.FieldType.f45772r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45879a[WireFormat.FieldType.f45773s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45879a[WireFormat.FieldType.f45774t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45879a[WireFormat.FieldType.f45775u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45879a[WireFormat.FieldType.f45766l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f45879a[WireFormat.FieldType.f45770p.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f45879a[WireFormat.FieldType.f45761g.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryReader.java */
    /* renamed from: androidx.datastore.preferences.protobuf.o$b */
    public static final class b extends AbstractC22919o {

        /* renamed from: a, reason: collision with root package name */
        public int f45880a;

        /* renamed from: b, reason: collision with root package name */
        public int f45881b;

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final <T> T a(InterfaceC22897g1<T> interfaceC22897g1, T t12) throws InvalidProtocolBufferException {
            o(2);
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final <T> void b(List<T> list, InterfaceC22897g1<T> interfaceC22897g1, T t12) throws InvalidProtocolBufferException {
            if ((0 & 7) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final <T> T c(InterfaceC22897g1<T> interfaceC22897g1, T t12) throws InvalidProtocolBufferException.InvalidWireTypeException {
            o(3);
            return (T) g(interfaceC22897g1, t12);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final <K, V> void d(Map<K, V> map, C22939y0.b<K, V> bVar, T t12) throws InvalidProtocolBufferException {
            o(2);
            l();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final <T> void e(List<T> list, InterfaceC22897g1<T> interfaceC22897g1, T t12) throws InvalidProtocolBufferException {
            if ((0 & 7) != 3) {
                throw InvalidProtocolBufferException.d();
            }
            list.add(g(interfaceC22897g1, t12));
            if (f()) {
                return;
            }
            l();
            throw null;
        }

        public final boolean f() {
            return this.f45880a == 0;
        }

        public final <T> T g(InterfaceC22897g1<T> interfaceC22897g1, T t12) {
            int i12 = this.f45881b;
            this.f45881b = ((0 >>> 3) << 3) | 4;
            try {
                T tNewInstance = interfaceC22897g1.newInstance();
                interfaceC22897g1.d(tNewInstance, this, t12);
                interfaceC22897g1.makeImmutable(tNewInstance);
                if (this.f45881b == 0) {
                    return tNewInstance;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.f45881b = i12;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final int getFieldNumber() throws InvalidProtocolBufferException {
            if (f()) {
                return Integer.MAX_VALUE;
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final int getTag() {
            return 0;
        }

        public final int h() {
            this.f45880a += 4;
            throw null;
        }

        public final long i() {
            this.f45880a += 8;
            throw null;
        }

        public final String j(boolean z12) throws InvalidProtocolBufferException {
            o(2);
            l();
            throw null;
        }

        public final void k(List<String> list, boolean z12) throws InvalidProtocolBufferException {
            if ((0 & 7) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            if (!(list instanceof InterfaceC22927s0) || z12) {
                j(z12);
                throw null;
            }
            readBytes();
            throw null;
        }

        public final int l() throws InvalidProtocolBufferException {
            if (this.f45880a != 0) {
                throw null;
            }
            throw InvalidProtocolBufferException.h();
        }

        public final long m() throws InvalidProtocolBufferException {
            if (this.f45880a != 0) {
                throw null;
            }
            throw InvalidProtocolBufferException.h();
        }

        public final void n(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0 || i12 > 0 - this.f45880a) {
                throw InvalidProtocolBufferException.h();
            }
        }

        public final void o(int i12) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if ((0 & 7) != i12) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final boolean readBool() throws InvalidProtocolBufferException {
            o(0);
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readBoolList(List<Boolean> list) throws InvalidProtocolBufferException {
            if (list instanceof C22926s) {
                int i12 = 0 & 7;
                if (i12 == 0) {
                    readBool();
                    throw null;
                }
                if (i12 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                l();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 0) {
                readBool();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final AbstractC22934w readBytes() throws InvalidProtocolBufferException {
            o(2);
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readBytesList(List<AbstractC22934w> list) throws InvalidProtocolBufferException {
            if ((0 & 7) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            readBytes();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final double readDouble() throws InvalidProtocolBufferException {
            o(1);
            n(8);
            i();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readDoubleList(List<Double> list) throws InvalidProtocolBufferException {
            if (list instanceof C) {
                int i12 = 0 & 7;
                if (i12 == 1) {
                    readDouble();
                    throw null;
                }
                if (i12 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                l();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 1) {
                readDouble();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final int readEnum() throws InvalidProtocolBufferException {
            o(0);
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readEnumList(List<Integer> list) throws InvalidProtocolBufferException {
            if (list instanceof C22911l0) {
                int i12 = 0 & 7;
                if (i12 == 0) {
                    readEnum();
                    throw null;
                }
                if (i12 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                l();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 0) {
                readEnum();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final int readFixed32() throws InvalidProtocolBufferException {
            o(5);
            n(4);
            h();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readFixed32List(List<Integer> list) throws InvalidProtocolBufferException {
            if (list instanceof C22911l0) {
                int i12 = 0 & 7;
                if (i12 == 2) {
                    l();
                    throw null;
                }
                if (i12 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                readFixed32();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 2) {
                l();
                throw null;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            readFixed32();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final long readFixed64() throws InvalidProtocolBufferException {
            o(1);
            n(8);
            i();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readFixed64List(List<Long> list) throws InvalidProtocolBufferException {
            if (list instanceof C22935w0) {
                int i12 = 0 & 7;
                if (i12 == 1) {
                    readFixed64();
                    throw null;
                }
                if (i12 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                l();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 1) {
                readFixed64();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final float readFloat() throws InvalidProtocolBufferException {
            o(5);
            n(4);
            h();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readFloatList(List<Float> list) throws InvalidProtocolBufferException {
            if (list instanceof C22887d0) {
                int i12 = 0 & 7;
                if (i12 == 2) {
                    l();
                    throw null;
                }
                if (i12 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                readFloat();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 2) {
                l();
                throw null;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            readFloat();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final int readInt32() throws InvalidProtocolBufferException {
            o(0);
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readInt32List(List<Integer> list) throws InvalidProtocolBufferException {
            if (list instanceof C22911l0) {
                int i12 = 0 & 7;
                if (i12 == 0) {
                    readInt32();
                    throw null;
                }
                if (i12 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                l();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 0) {
                readInt32();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final long readInt64() throws InvalidProtocolBufferException {
            o(0);
            m();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readInt64List(List<Long> list) throws InvalidProtocolBufferException {
            if (list instanceof C22935w0) {
                int i12 = 0 & 7;
                if (i12 == 0) {
                    readInt64();
                    throw null;
                }
                if (i12 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                l();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 0) {
                readInt64();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final int readSFixed32() throws InvalidProtocolBufferException {
            o(5);
            n(4);
            h();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readSFixed32List(List<Integer> list) throws InvalidProtocolBufferException {
            if (list instanceof C22911l0) {
                int i12 = 0 & 7;
                if (i12 == 2) {
                    l();
                    throw null;
                }
                if (i12 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                readSFixed32();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 2) {
                l();
                throw null;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            readSFixed32();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final long readSFixed64() throws InvalidProtocolBufferException {
            o(1);
            n(8);
            i();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readSFixed64List(List<Long> list) throws InvalidProtocolBufferException {
            if (list instanceof C22935w0) {
                int i12 = 0 & 7;
                if (i12 == 1) {
                    readSFixed64();
                    throw null;
                }
                if (i12 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                l();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 1) {
                readSFixed64();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final int readSInt32() throws InvalidProtocolBufferException {
            o(0);
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readSInt32List(List<Integer> list) throws InvalidProtocolBufferException {
            if (list instanceof C22911l0) {
                int i12 = 0 & 7;
                if (i12 == 0) {
                    readSInt32();
                    throw null;
                }
                if (i12 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                l();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 0) {
                readSInt32();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final long readSInt64() throws InvalidProtocolBufferException {
            o(0);
            m();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readSInt64List(List<Long> list) throws InvalidProtocolBufferException {
            if (list instanceof C22935w0) {
                int i12 = 0 & 7;
                if (i12 == 0) {
                    readSInt64();
                    throw null;
                }
                if (i12 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                l();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 0) {
                readSInt64();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final String readString() throws InvalidProtocolBufferException {
            j(false);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readStringList(List<String> list) throws InvalidProtocolBufferException {
            k(list, false);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readStringListRequireUtf8(List<String> list) throws InvalidProtocolBufferException {
            k(list, true);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final String readStringRequireUtf8() throws InvalidProtocolBufferException {
            j(true);
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final int readUInt32() throws InvalidProtocolBufferException {
            o(0);
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readUInt32List(List<Integer> list) throws InvalidProtocolBufferException {
            if (list instanceof C22911l0) {
                int i12 = 0 & 7;
                if (i12 == 0) {
                    readUInt32();
                    throw null;
                }
                if (i12 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                l();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 0) {
                readUInt32();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final long readUInt64() throws InvalidProtocolBufferException {
            o(0);
            m();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final void readUInt64List(List<Long> list) throws InvalidProtocolBufferException {
            if (list instanceof C22935w0) {
                int i12 = 0 & 7;
                if (i12 == 0) {
                    readUInt64();
                    throw null;
                }
                if (i12 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                l();
                throw null;
            }
            int i13 = 0 & 7;
            if (i13 == 0) {
                readUInt64();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            l();
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC22891e1
        public final boolean skipField() throws InvalidProtocolBufferException {
            int i12;
            if (f() || (i12 = this.f45881b) == 0) {
                return false;
            }
            int i13 = 0 & 7;
            if (i13 == 0) {
                int i14 = this.f45880a;
                if (0 - i14 >= 10) {
                    throw null;
                }
                if (i14 == 0) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f45880a = i14 + 1;
                throw null;
            }
            if (i13 == 1) {
                n(8);
                this.f45880a += 8;
                return true;
            }
            if (i13 == 2) {
                l();
                throw null;
            }
            if (i13 != 3) {
                if (i13 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                n(4);
                this.f45880a += 4;
                return true;
            }
            this.f45881b = ((0 >>> 3) << 3) | 4;
            getFieldNumber();
            if (this.f45881b != 0) {
                throw InvalidProtocolBufferException.g();
            }
            this.f45881b = i12;
            return true;
        }
    }

    public /* synthetic */ AbstractC22919o(a aVar) {
        this();
    }

    public AbstractC22919o() {
    }
}
