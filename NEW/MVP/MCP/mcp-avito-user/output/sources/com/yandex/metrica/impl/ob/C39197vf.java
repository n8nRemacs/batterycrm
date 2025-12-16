package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.vf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39197vf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public a[] f382068a;

    /* renamed from: com.yandex.metrica.impl.ob.vf$a */
    public static final class a extends MessageNano {

        /* renamed from: e, reason: collision with root package name */
        private static volatile a[] f382069e;

        /* renamed from: a, reason: collision with root package name */
        public byte[] f382070a;

        /* renamed from: b, reason: collision with root package name */
        public int f382071b;

        /* renamed from: c, reason: collision with root package name */
        public b f382072c;

        /* renamed from: d, reason: collision with root package name */
        public c f382073d;

        public a() {
            a();
        }

        public static a[] b() {
            if (f382069e == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f382069e == null) {
                            f382069e = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f382069e;
        }

        public a a() {
            this.f382070a = WireFormatNano.EMPTY_BYTES;
            this.f382071b = 0;
            this.f382072c = null;
            this.f382073d = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f382071b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f382070a) + super.computeSerializedSize();
            b bVar = this.f382072c;
            if (bVar != null) {
                iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, bVar);
            }
            c cVar = this.f382073d;
            return cVar != null ? iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, cVar) : iComputeInt32Size;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f382070a = codedInputByteBufferNano.readBytes();
                } else if (tag == 16) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                        this.f382071b = int32;
                    }
                } else if (tag == 26) {
                    if (this.f382072c == null) {
                        this.f382072c = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f382072c);
                } else if (tag == 34) {
                    if (this.f382073d == null) {
                        this.f382073d = new c();
                    }
                    codedInputByteBufferNano.readMessage(this.f382073d);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeBytes(1, this.f382070a);
            codedOutputByteBufferNano.writeInt32(2, this.f382071b);
            b bVar = this.f382072c;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(3, bVar);
            }
            c cVar = this.f382073d;
            if (cVar != null) {
                codedOutputByteBufferNano.writeMessage(4, cVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vf$b */
    public static final class b extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public boolean f382074a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f382075b;

        public b() {
            a();
        }

        public b a() {
            this.f382074a = false;
            this.f382075b = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            boolean z12 = this.f382074a;
            if (z12) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z12);
            }
            boolean z13 = this.f382075b;
            return z13 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z13) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f382074a = codedInputByteBufferNano.readBool();
                } else if (tag == 16) {
                    this.f382075b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            boolean z12 = this.f382074a;
            if (z12) {
                codedOutputByteBufferNano.writeBool(1, z12);
            }
            boolean z13 = this.f382075b;
            if (z13) {
                codedOutputByteBufferNano.writeBool(2, z13);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.vf$c */
    public static final class c extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f382076a;

        /* renamed from: b, reason: collision with root package name */
        public double f382077b;

        /* renamed from: c, reason: collision with root package name */
        public double f382078c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f382079d;

        public c() {
            a();
        }

        public c a() {
            this.f382076a = WireFormatNano.EMPTY_BYTES;
            this.f382077b = 0.0d;
            this.f382078c = 0.0d;
            this.f382079d = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f382076a, WireFormatNano.EMPTY_BYTES)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f382076a);
            }
            if (Double.doubleToLongBits(this.f382077b) != Double.doubleToLongBits(0.0d)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f382077b);
            }
            if (Double.doubleToLongBits(this.f382078c) != Double.doubleToLongBits(0.0d)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f382078c);
            }
            boolean z12 = this.f382079d;
            return z12 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z12) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f382076a = codedInputByteBufferNano.readBytes();
                } else if (tag == 17) {
                    this.f382077b = codedInputByteBufferNano.readDouble();
                } else if (tag == 25) {
                    this.f382078c = codedInputByteBufferNano.readDouble();
                } else if (tag == 32) {
                    this.f382079d = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            if (!Arrays.equals(this.f382076a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f382076a);
            }
            if (Double.doubleToLongBits(this.f382077b) != Double.doubleToLongBits(0.0d)) {
                codedOutputByteBufferNano.writeDouble(2, this.f382077b);
            }
            if (Double.doubleToLongBits(this.f382078c) != Double.doubleToLongBits(0.0d)) {
                codedOutputByteBufferNano.writeDouble(3, this.f382078c);
            }
            boolean z12 = this.f382079d;
            if (z12) {
                codedOutputByteBufferNano.writeBool(4, z12);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C39197vf() {
        a();
    }

    public C39197vf a() {
        this.f382068a = a.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.f382068a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f382068a;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i12];
                if (aVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, aVar) + iComputeSerializedSize;
                }
                i12++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                a[] aVarArr = this.f382068a;
                int length = aVarArr == null ? 0 : aVarArr.length;
                int i12 = repeatedFieldArrayLength + length;
                a[] aVarArr2 = new a[i12];
                if (length != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                }
                while (length < i12 - 1) {
                    a aVar = new a();
                    aVarArr2[length] = aVar;
                    codedInputByteBufferNano.readMessage(aVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                a aVar2 = new a();
                aVarArr2[length] = aVar2;
                codedInputByteBufferNano.readMessage(aVar2);
                this.f382068a = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        a[] aVarArr = this.f382068a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f382068a;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i12];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, aVar);
                }
                i12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
