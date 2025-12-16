package com.yandex.metrica.impl.ob;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;

/* renamed from: com.yandex.metrica.impl.ob.pf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39054pf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public b[] f381295a;

    /* renamed from: b, reason: collision with root package name */
    public a[] f381296b;

    /* renamed from: com.yandex.metrica.impl.ob.pf$a */
    public static final class a extends MessageNano {

        /* renamed from: h, reason: collision with root package name */
        private static volatile a[] f381297h;

        /* renamed from: a, reason: collision with root package name */
        public long f381298a;

        /* renamed from: b, reason: collision with root package name */
        public long f381299b;

        /* renamed from: c, reason: collision with root package name */
        public C39029of[] f381300c;

        /* renamed from: d, reason: collision with root package name */
        public C39101rf[] f381301d;

        /* renamed from: e, reason: collision with root package name */
        public long f381302e;

        /* renamed from: f, reason: collision with root package name */
        public int f381303f;

        /* renamed from: g, reason: collision with root package name */
        public int f381304g;

        public a() {
            a();
        }

        public static a[] b() {
            if (f381297h == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f381297h == null) {
                            f381297h = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f381297h;
        }

        public a a() {
            this.f381298a = 0L;
            this.f381299b = 0L;
            this.f381300c = C39029of.b();
            this.f381301d = C39101rf.b();
            this.f381302e = 0L;
            this.f381303f = 0;
            this.f381304g = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(2, this.f381299b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f381298a) + super.computeSerializedSize();
            C39029of[] c39029ofArr = this.f381300c;
            int i12 = 0;
            if (c39029ofArr != null && c39029ofArr.length > 0) {
                int i13 = 0;
                while (true) {
                    C39029of[] c39029ofArr2 = this.f381300c;
                    if (i13 >= c39029ofArr2.length) {
                        break;
                    }
                    C39029of c39029of = c39029ofArr2[i13];
                    if (c39029of != null) {
                        iComputeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c39029of) + iComputeUInt64Size;
                    }
                    i13++;
                }
            }
            C39101rf[] c39101rfArr = this.f381301d;
            if (c39101rfArr != null && c39101rfArr.length > 0) {
                while (true) {
                    C39101rf[] c39101rfArr2 = this.f381301d;
                    if (i12 >= c39101rfArr2.length) {
                        break;
                    }
                    C39101rf c39101rf = c39101rfArr2[i12];
                    if (c39101rf != null) {
                        iComputeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(4, c39101rf) + iComputeUInt64Size;
                    }
                    i12++;
                }
            }
            long j12 = this.f381302e;
            if (j12 != 0) {
                iComputeUInt64Size += CodedOutputByteBufferNano.computeUInt64Size(5, j12);
            }
            int i14 = this.f381303f;
            if (i14 != 0) {
                iComputeUInt64Size += CodedOutputByteBufferNano.computeInt32Size(6, i14);
            }
            int i15 = this.f381304g;
            return i15 != 0 ? iComputeUInt64Size + CodedOutputByteBufferNano.computeInt32Size(7, i15) : iComputeUInt64Size;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    this.f381298a = codedInputByteBufferNano.readUInt64();
                } else if (tag == 16) {
                    this.f381299b = codedInputByteBufferNano.readUInt64();
                } else if (tag == 26) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    C39029of[] c39029ofArr = this.f381300c;
                    int length = c39029ofArr == null ? 0 : c39029ofArr.length;
                    int i12 = repeatedFieldArrayLength + length;
                    C39029of[] c39029ofArr2 = new C39029of[i12];
                    if (length != 0) {
                        System.arraycopy(c39029ofArr, 0, c39029ofArr2, 0, length);
                    }
                    while (length < i12 - 1) {
                        C39029of c39029of = new C39029of();
                        c39029ofArr2[length] = c39029of;
                        codedInputByteBufferNano.readMessage(c39029of);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C39029of c39029of2 = new C39029of();
                    c39029ofArr2[length] = c39029of2;
                    codedInputByteBufferNano.readMessage(c39029of2);
                    this.f381300c = c39029ofArr2;
                } else if (tag == 34) {
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                    C39101rf[] c39101rfArr = this.f381301d;
                    int length2 = c39101rfArr == null ? 0 : c39101rfArr.length;
                    int i13 = repeatedFieldArrayLength2 + length2;
                    C39101rf[] c39101rfArr2 = new C39101rf[i13];
                    if (length2 != 0) {
                        System.arraycopy(c39101rfArr, 0, c39101rfArr2, 0, length2);
                    }
                    while (length2 < i13 - 1) {
                        C39101rf c39101rf = new C39101rf();
                        c39101rfArr2[length2] = c39101rf;
                        codedInputByteBufferNano.readMessage(c39101rf);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C39101rf c39101rf2 = new C39101rf();
                    c39101rfArr2[length2] = c39101rf2;
                    codedInputByteBufferNano.readMessage(c39101rf2);
                    this.f381301d = c39101rfArr2;
                } else if (tag == 40) {
                    this.f381302e = codedInputByteBufferNano.readUInt64();
                } else if (tag == 48) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                        this.f381303f = int32;
                    }
                } else if (tag == 56) {
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == 0 || int322 == 1 || int322 == 2 || int322 == 3) {
                        this.f381304g = int322;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeUInt64(1, this.f381298a);
            codedOutputByteBufferNano.writeUInt64(2, this.f381299b);
            C39029of[] c39029ofArr = this.f381300c;
            int i12 = 0;
            if (c39029ofArr != null && c39029ofArr.length > 0) {
                int i13 = 0;
                while (true) {
                    C39029of[] c39029ofArr2 = this.f381300c;
                    if (i13 >= c39029ofArr2.length) {
                        break;
                    }
                    C39029of c39029of = c39029ofArr2[i13];
                    if (c39029of != null) {
                        codedOutputByteBufferNano.writeMessage(3, c39029of);
                    }
                    i13++;
                }
            }
            C39101rf[] c39101rfArr = this.f381301d;
            if (c39101rfArr != null && c39101rfArr.length > 0) {
                while (true) {
                    C39101rf[] c39101rfArr2 = this.f381301d;
                    if (i12 >= c39101rfArr2.length) {
                        break;
                    }
                    C39101rf c39101rf = c39101rfArr2[i12];
                    if (c39101rf != null) {
                        codedOutputByteBufferNano.writeMessage(4, c39101rf);
                    }
                    i12++;
                }
            }
            long j12 = this.f381302e;
            if (j12 != 0) {
                codedOutputByteBufferNano.writeUInt64(5, j12);
            }
            int i14 = this.f381303f;
            if (i14 != 0) {
                codedOutputByteBufferNano.writeInt32(6, i14);
            }
            int i15 = this.f381304g;
            if (i15 != 0) {
                codedOutputByteBufferNano.writeInt32(7, i15);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.pf$b */
    public static final class b extends MessageNano {

        /* renamed from: n, reason: collision with root package name */
        private static volatile b[] f381305n;

        /* renamed from: a, reason: collision with root package name */
        public long f381306a;

        /* renamed from: b, reason: collision with root package name */
        public long f381307b;

        /* renamed from: c, reason: collision with root package name */
        public long f381308c;

        /* renamed from: d, reason: collision with root package name */
        public double f381309d;

        /* renamed from: e, reason: collision with root package name */
        public double f381310e;

        /* renamed from: f, reason: collision with root package name */
        public int f381311f;

        /* renamed from: g, reason: collision with root package name */
        public int f381312g;

        /* renamed from: h, reason: collision with root package name */
        public int f381313h;

        /* renamed from: i, reason: collision with root package name */
        public int f381314i;

        /* renamed from: j, reason: collision with root package name */
        public int f381315j;

        /* renamed from: k, reason: collision with root package name */
        public int f381316k;

        /* renamed from: l, reason: collision with root package name */
        public long f381317l;

        /* renamed from: m, reason: collision with root package name */
        public int f381318m;

        public b() {
            a();
        }

        public static b[] b() {
            if (f381305n == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f381305n == null) {
                            f381305n = new b[0];
                        }
                    } finally {
                    }
                }
            }
            return f381305n;
        }

        public b a() {
            this.f381306a = 0L;
            this.f381307b = 0L;
            this.f381308c = 0L;
            this.f381309d = 0.0d;
            this.f381310e = 0.0d;
            this.f381311f = 0;
            this.f381312g = 0;
            this.f381313h = 0;
            this.f381314i = 0;
            this.f381315j = 0;
            this.f381316k = 0;
            this.f381317l = 0L;
            this.f381318m = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(2, this.f381307b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f381306a) + super.computeSerializedSize();
            long j12 = this.f381308c;
            if (j12 != 0) {
                iComputeUInt64Size += CodedOutputByteBufferNano.computeUInt64Size(3, j12);
            }
            int iComputeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(5, this.f381310e) + CodedOutputByteBufferNano.computeDoubleSize(4, this.f381309d) + iComputeUInt64Size;
            int i12 = this.f381311f;
            if (i12 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i12);
            }
            int i13 = this.f381312g;
            if (i13 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(7, i13);
            }
            int i14 = this.f381313h;
            if (i14 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(8, i14);
            }
            int i15 = this.f381314i;
            if (i15 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(9, i15);
            }
            int i16 = this.f381315j;
            if (i16 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(10, i16);
            }
            int i17 = this.f381316k;
            if (i17 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(11, i17);
            }
            long j13 = this.f381317l;
            if (j13 != 0) {
                iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(12, j13);
            }
            int i18 = this.f381318m;
            return i18 != 0 ? iComputeDoubleSize + CodedOutputByteBufferNano.computeInt32Size(13, i18) : iComputeDoubleSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                switch (tag) {
                    case 0:
                        break;
                    case 8:
                        this.f381306a = codedInputByteBufferNano.readUInt64();
                        break;
                    case 16:
                        this.f381307b = codedInputByteBufferNano.readUInt64();
                        break;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        this.f381308c = codedInputByteBufferNano.readUInt64();
                        break;
                    case 33:
                        this.f381309d = codedInputByteBufferNano.readDouble();
                        break;
                    case 41:
                        this.f381310e = codedInputByteBufferNano.readDouble();
                        break;
                    case 48:
                        this.f381311f = codedInputByteBufferNano.readUInt32();
                        break;
                    case 56:
                        this.f381312g = codedInputByteBufferNano.readUInt32();
                        break;
                    case 64:
                        this.f381313h = codedInputByteBufferNano.readUInt32();
                        break;
                    case 72:
                        this.f381314i = codedInputByteBufferNano.readInt32();
                        break;
                    case 80:
                        int int32 = codedInputByteBufferNano.readInt32();
                        if (int32 != 0 && int32 != 1 && int32 != 2 && int32 != 3) {
                            break;
                        } else {
                            this.f381315j = int32;
                            break;
                        }
                        break;
                    case 88:
                        int int322 = codedInputByteBufferNano.readInt32();
                        if (int322 != 0 && int322 != 1 && int322 != 2 && int322 != 3) {
                            break;
                        } else {
                            this.f381316k = int322;
                            break;
                        }
                        break;
                    case 96:
                        this.f381317l = codedInputByteBufferNano.readUInt64();
                        break;
                    case 104:
                        int int323 = codedInputByteBufferNano.readInt32();
                        if (int323 != 0 && int323 != 1 && int323 != 2 && int323 != 3 && int323 != 4) {
                            break;
                        } else {
                            this.f381318m = int323;
                            break;
                        }
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
            codedOutputByteBufferNano.writeUInt64(1, this.f381306a);
            codedOutputByteBufferNano.writeUInt64(2, this.f381307b);
            long j12 = this.f381308c;
            if (j12 != 0) {
                codedOutputByteBufferNano.writeUInt64(3, j12);
            }
            codedOutputByteBufferNano.writeDouble(4, this.f381309d);
            codedOutputByteBufferNano.writeDouble(5, this.f381310e);
            int i12 = this.f381311f;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeUInt32(6, i12);
            }
            int i13 = this.f381312g;
            if (i13 != 0) {
                codedOutputByteBufferNano.writeUInt32(7, i13);
            }
            int i14 = this.f381313h;
            if (i14 != 0) {
                codedOutputByteBufferNano.writeUInt32(8, i14);
            }
            int i15 = this.f381314i;
            if (i15 != 0) {
                codedOutputByteBufferNano.writeInt32(9, i15);
            }
            int i16 = this.f381315j;
            if (i16 != 0) {
                codedOutputByteBufferNano.writeInt32(10, i16);
            }
            int i17 = this.f381316k;
            if (i17 != 0) {
                codedOutputByteBufferNano.writeInt32(11, i17);
            }
            long j13 = this.f381317l;
            if (j13 != 0) {
                codedOutputByteBufferNano.writeUInt64(12, j13);
            }
            int i18 = this.f381318m;
            if (i18 != 0) {
                codedOutputByteBufferNano.writeInt32(13, i18);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C39054pf() {
        a();
    }

    public C39054pf a() {
        this.f381295a = b.b();
        this.f381296b = a.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        b[] bVarArr = this.f381295a;
        int i12 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                b[] bVarArr2 = this.f381295a;
                if (i13 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i13];
                if (bVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, bVar) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        a[] aVarArr = this.f381296b;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f381296b;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i12];
                if (aVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, aVar) + iComputeSerializedSize;
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
                b[] bVarArr = this.f381295a;
                int length = bVarArr == null ? 0 : bVarArr.length;
                int i12 = repeatedFieldArrayLength + length;
                b[] bVarArr2 = new b[i12];
                if (length != 0) {
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                }
                while (length < i12 - 1) {
                    b bVar = new b();
                    bVarArr2[length] = bVar;
                    codedInputByteBufferNano.readMessage(bVar);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                b bVar2 = new b();
                bVarArr2[length] = bVar2;
                codedInputByteBufferNano.readMessage(bVar2);
                this.f381295a = bVarArr2;
            } else if (tag == 18) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                a[] aVarArr = this.f381296b;
                int length2 = aVarArr == null ? 0 : aVarArr.length;
                int i13 = repeatedFieldArrayLength2 + length2;
                a[] aVarArr2 = new a[i13];
                if (length2 != 0) {
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, length2);
                }
                while (length2 < i13 - 1) {
                    a aVar = new a();
                    aVarArr2[length2] = aVar;
                    codedInputByteBufferNano.readMessage(aVar);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                a aVar2 = new a();
                aVarArr2[length2] = aVar2;
                codedInputByteBufferNano.readMessage(aVar2);
                this.f381296b = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        b[] bVarArr = this.f381295a;
        int i12 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                b[] bVarArr2 = this.f381295a;
                if (i13 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i13];
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, bVar);
                }
                i13++;
            }
        }
        a[] aVarArr = this.f381296b;
        if (aVarArr != null && aVarArr.length > 0) {
            while (true) {
                a[] aVarArr2 = this.f381296b;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i12];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, aVar);
                }
                i12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
