package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.uf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39173uf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public int f381936a;

    /* renamed from: b, reason: collision with root package name */
    public double f381937b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f381938c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f381939d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f381940e;

    /* renamed from: f, reason: collision with root package name */
    public a f381941f;

    /* renamed from: g, reason: collision with root package name */
    public long f381942g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f381943h;

    /* renamed from: i, reason: collision with root package name */
    public int f381944i;

    /* renamed from: j, reason: collision with root package name */
    public int f381945j;

    /* renamed from: k, reason: collision with root package name */
    public c f381946k;

    /* renamed from: l, reason: collision with root package name */
    public b f381947l;

    /* renamed from: com.yandex.metrica.impl.ob.uf$a */
    public static final class a extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f381948a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f381949b;

        public a() {
            a();
        }

        public a a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f381948a = bArr;
            this.f381949b = bArr;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            byte[] bArr = this.f381948a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f381948a);
            }
            return !Arrays.equals(this.f381949b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f381949b) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f381948a = codedInputByteBufferNano.readBytes();
                } else if (tag == 18) {
                    this.f381949b = codedInputByteBufferNano.readBytes();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            byte[] bArr = this.f381948a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                codedOutputByteBufferNano.writeBytes(1, this.f381948a);
            }
            if (!Arrays.equals(this.f381949b, bArr2)) {
                codedOutputByteBufferNano.writeBytes(2, this.f381949b);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.uf$b */
    public static final class b extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public boolean f381950a;

        /* renamed from: b, reason: collision with root package name */
        public C10963b f381951b;

        /* renamed from: c, reason: collision with root package name */
        public a f381952c;

        /* renamed from: com.yandex.metrica.impl.ob.uf$b$a */
        public static final class a extends MessageNano {

            /* renamed from: a, reason: collision with root package name */
            public long f381953a;

            /* renamed from: b, reason: collision with root package name */
            public C10963b f381954b;

            /* renamed from: c, reason: collision with root package name */
            public int f381955c;

            /* renamed from: d, reason: collision with root package name */
            public byte[] f381956d;

            public a() {
                a();
            }

            public a a() {
                this.f381953a = 0L;
                this.f381954b = null;
                this.f381955c = 0;
                this.f381956d = WireFormatNano.EMPTY_BYTES;
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                int iComputeSerializedSize = super.computeSerializedSize();
                long j12 = this.f381953a;
                if (j12 != 0) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j12);
                }
                C10963b c10963b = this.f381954b;
                if (c10963b != null) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c10963b);
                }
                int i12 = this.f381955c;
                if (i12 != 0) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i12);
                }
                return !Arrays.equals(this.f381956d, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f381956d) : iComputeSerializedSize;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    if (tag == 0) {
                        break;
                    }
                    if (tag == 8) {
                        this.f381953a = codedInputByteBufferNano.readInt64();
                    } else if (tag == 18) {
                        if (this.f381954b == null) {
                            this.f381954b = new C10963b();
                        }
                        codedInputByteBufferNano.readMessage(this.f381954b);
                    } else if (tag == 24) {
                        this.f381955c = codedInputByteBufferNano.readUInt32();
                    } else if (tag == 34) {
                        this.f381956d = codedInputByteBufferNano.readBytes();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
                long j12 = this.f381953a;
                if (j12 != 0) {
                    codedOutputByteBufferNano.writeInt64(1, j12);
                }
                C10963b c10963b = this.f381954b;
                if (c10963b != null) {
                    codedOutputByteBufferNano.writeMessage(2, c10963b);
                }
                int i12 = this.f381955c;
                if (i12 != 0) {
                    codedOutputByteBufferNano.writeUInt32(3, i12);
                }
                if (!Arrays.equals(this.f381956d, WireFormatNano.EMPTY_BYTES)) {
                    codedOutputByteBufferNano.writeBytes(4, this.f381956d);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.uf$b$b, reason: collision with other inner class name */
        public static final class C10963b extends MessageNano {

            /* renamed from: a, reason: collision with root package name */
            public int f381957a;

            /* renamed from: b, reason: collision with root package name */
            public int f381958b;

            public C10963b() {
                a();
            }

            public C10963b a() {
                this.f381957a = 0;
                this.f381958b = 0;
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                int iComputeSerializedSize = super.computeSerializedSize();
                int i12 = this.f381957a;
                if (i12 != 0) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i12);
                }
                int i13 = this.f381958b;
                return i13 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i13) : iComputeSerializedSize;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    if (tag == 0) {
                        break;
                    }
                    if (tag == 8) {
                        this.f381957a = codedInputByteBufferNano.readUInt32();
                    } else if (tag == 16) {
                        int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                            this.f381958b = int32;
                        }
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
                int i12 = this.f381957a;
                if (i12 != 0) {
                    codedOutputByteBufferNano.writeUInt32(1, i12);
                }
                int i13 = this.f381958b;
                if (i13 != 0) {
                    codedOutputByteBufferNano.writeInt32(2, i13);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public b() {
            a();
        }

        public b a() {
            this.f381950a = false;
            this.f381951b = null;
            this.f381952c = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            boolean z12 = this.f381950a;
            if (z12) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z12);
            }
            C10963b c10963b = this.f381951b;
            if (c10963b != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c10963b);
            }
            a aVar = this.f381952c;
            return aVar != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, aVar) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f381950a = codedInputByteBufferNano.readBool();
                } else if (tag == 18) {
                    if (this.f381951b == null) {
                        this.f381951b = new C10963b();
                    }
                    codedInputByteBufferNano.readMessage(this.f381951b);
                } else if (tag == 26) {
                    if (this.f381952c == null) {
                        this.f381952c = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f381952c);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            boolean z12 = this.f381950a;
            if (z12) {
                codedOutputByteBufferNano.writeBool(1, z12);
            }
            C10963b c10963b = this.f381951b;
            if (c10963b != null) {
                codedOutputByteBufferNano.writeMessage(2, c10963b);
            }
            a aVar = this.f381952c;
            if (aVar != null) {
                codedOutputByteBufferNano.writeMessage(3, aVar);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.uf$c */
    public static final class c extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f381959a;

        /* renamed from: b, reason: collision with root package name */
        public long f381960b;

        /* renamed from: c, reason: collision with root package name */
        public int f381961c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f381962d;

        /* renamed from: e, reason: collision with root package name */
        public long f381963e;

        public c() {
            a();
        }

        public c a() {
            byte[] bArr = WireFormatNano.EMPTY_BYTES;
            this.f381959a = bArr;
            this.f381960b = 0L;
            this.f381961c = 0;
            this.f381962d = bArr;
            this.f381963e = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            byte[] bArr = this.f381959a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f381959a);
            }
            long j12 = this.f381960b;
            if (j12 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j12);
            }
            int i12 = this.f381961c;
            if (i12 != 0) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i12);
            }
            if (!Arrays.equals(this.f381962d, bArr2)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f381962d);
            }
            long j13 = this.f381963e;
            return j13 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j13) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f381959a = codedInputByteBufferNano.readBytes();
                } else if (tag == 16) {
                    this.f381960b = codedInputByteBufferNano.readUInt64();
                } else if (tag == 24) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2) {
                        this.f381961c = int32;
                    }
                } else if (tag == 34) {
                    this.f381962d = codedInputByteBufferNano.readBytes();
                } else if (tag == 40) {
                    this.f381963e = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            byte[] bArr = this.f381959a;
            byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
            if (!Arrays.equals(bArr, bArr2)) {
                codedOutputByteBufferNano.writeBytes(1, this.f381959a);
            }
            long j12 = this.f381960b;
            if (j12 != 0) {
                codedOutputByteBufferNano.writeUInt64(2, j12);
            }
            int i12 = this.f381961c;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeInt32(3, i12);
            }
            if (!Arrays.equals(this.f381962d, bArr2)) {
                codedOutputByteBufferNano.writeBytes(4, this.f381962d);
            }
            long j13 = this.f381963e;
            if (j13 != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j13);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C39173uf() {
        a();
    }

    public C39173uf a() {
        this.f381936a = 1;
        this.f381937b = 0.0d;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f381938c = bArr;
        this.f381939d = bArr;
        this.f381940e = bArr;
        this.f381941f = null;
        this.f381942g = 0L;
        this.f381943h = false;
        this.f381944i = 0;
        this.f381945j = 1;
        this.f381946k = null;
        this.f381947l = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i12 = this.f381936a;
        if (i12 != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i12);
        }
        if (Double.doubleToLongBits(this.f381937b) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f381937b);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f381938c) + iComputeSerializedSize;
        byte[] bArr = this.f381939d;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f381939d);
        }
        if (!Arrays.equals(this.f381940e, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f381940e);
        }
        a aVar = this.f381941f;
        if (aVar != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, aVar);
        }
        long j12 = this.f381942g;
        if (j12 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j12);
        }
        boolean z12 = this.f381943h;
        if (z12) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z12);
        }
        int i13 = this.f381944i;
        if (i13 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i13);
        }
        int i14 = this.f381945j;
        if (i14 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i14);
        }
        c cVar = this.f381946k;
        if (cVar != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, cVar);
        }
        b bVar = this.f381947l;
        return bVar != null ? iComputeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, bVar) : iComputeBytesSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 8:
                    this.f381936a = codedInputByteBufferNano.readUInt32();
                    break;
                case 17:
                    this.f381937b = codedInputByteBufferNano.readDouble();
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    this.f381938c = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f381939d = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f381940e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f381941f == null) {
                        this.f381941f = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f381941f);
                    break;
                case 56:
                    this.f381942g = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f381943h = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != 0 && int32 != 1 && int32 != 2) {
                        break;
                    } else {
                        this.f381944i = int32;
                        break;
                    }
                    break;
                case 80:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 1 && int322 != 2) {
                        break;
                    } else {
                        this.f381945j = int322;
                        break;
                    }
                    break;
                case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    if (this.f381946k == null) {
                        this.f381946k = new c();
                    }
                    codedInputByteBufferNano.readMessage(this.f381946k);
                    break;
                case 98:
                    if (this.f381947l == null) {
                        this.f381947l = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f381947l);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        int i12 = this.f381936a;
        if (i12 != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i12);
        }
        if (Double.doubleToLongBits(this.f381937b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f381937b);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f381938c);
        byte[] bArr = this.f381939d;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f381939d);
        }
        if (!Arrays.equals(this.f381940e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f381940e);
        }
        a aVar = this.f381941f;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(6, aVar);
        }
        long j12 = this.f381942g;
        if (j12 != 0) {
            codedOutputByteBufferNano.writeInt64(7, j12);
        }
        boolean z12 = this.f381943h;
        if (z12) {
            codedOutputByteBufferNano.writeBool(8, z12);
        }
        int i13 = this.f381944i;
        if (i13 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i13);
        }
        int i14 = this.f381945j;
        if (i14 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i14);
        }
        c cVar = this.f381946k;
        if (cVar != null) {
            codedOutputByteBufferNano.writeMessage(11, cVar);
        }
        b bVar = this.f381947l;
        if (bVar != null) {
            codedOutputByteBufferNano.writeMessage(12, bVar);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
