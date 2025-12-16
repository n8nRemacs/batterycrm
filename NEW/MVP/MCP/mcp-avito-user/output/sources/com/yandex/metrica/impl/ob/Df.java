package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public final class Df extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public a[] f377969a;

    /* renamed from: b, reason: collision with root package name */
    public String[] f377970b;

    public static final class a extends MessageNano {

        /* renamed from: g, reason: collision with root package name */
        private static volatile a[] f377971g;

        /* renamed from: a, reason: collision with root package name */
        public String f377972a;

        /* renamed from: b, reason: collision with root package name */
        public String f377973b;

        /* renamed from: c, reason: collision with root package name */
        public String f377974c;

        /* renamed from: d, reason: collision with root package name */
        public C10950a[] f377975d;

        /* renamed from: e, reason: collision with root package name */
        public long f377976e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f377977f;

        /* renamed from: com.yandex.metrica.impl.ob.Df$a$a, reason: collision with other inner class name */
        public static final class C10950a extends MessageNano {

            /* renamed from: c, reason: collision with root package name */
            private static volatile C10950a[] f377978c;

            /* renamed from: a, reason: collision with root package name */
            public String f377979a;

            /* renamed from: b, reason: collision with root package name */
            public String f377980b;

            public C10950a() {
                a();
            }

            public static C10950a[] b() {
                if (f377978c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        try {
                            if (f377978c == null) {
                                f377978c = new C10950a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f377978c;
            }

            public C10950a a() {
                this.f377979a = "";
                this.f377980b = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                return CodedOutputByteBufferNano.computeStringSize(2, this.f377980b) + CodedOutputByteBufferNano.computeStringSize(1, this.f377979a) + super.computeSerializedSize();
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    if (tag == 0) {
                        break;
                    }
                    if (tag == 10) {
                        this.f377979a = codedInputByteBufferNano.readString();
                    } else if (tag == 18) {
                        this.f377980b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
                codedOutputByteBufferNano.writeString(1, this.f377979a);
                codedOutputByteBufferNano.writeString(2, this.f377980b);
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public a() {
            a();
        }

        public static a[] b() {
            if (f377971g == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f377971g == null) {
                            f377971g = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f377971g;
        }

        public a a() {
            this.f377972a = "";
            this.f377973b = "";
            this.f377974c = "";
            this.f377975d = C10950a.b();
            this.f377976e = 0L;
            this.f377977f = WireFormatNano.EMPTY_INT_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(3, this.f377974c) + CodedOutputByteBufferNano.computeStringSize(2, this.f377973b) + CodedOutputByteBufferNano.computeStringSize(1, this.f377972a) + super.computeSerializedSize();
            C10950a[] c10950aArr = this.f377975d;
            int i12 = 0;
            if (c10950aArr != null && c10950aArr.length > 0) {
                int i13 = 0;
                while (true) {
                    C10950a[] c10950aArr2 = this.f377975d;
                    if (i13 >= c10950aArr2.length) {
                        break;
                    }
                    C10950a c10950a = c10950aArr2[i13];
                    if (c10950a != null) {
                        iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(4, c10950a) + iComputeStringSize;
                    }
                    i13++;
                }
            }
            int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(5, this.f377976e) + iComputeStringSize;
            int[] iArr = this.f377977f;
            if (iArr == null || iArr.length <= 0) {
                return iComputeUInt64Size;
            }
            int iComputeInt32SizeNoTag = 0;
            while (true) {
                int[] iArr2 = this.f377977f;
                if (i12 >= iArr2.length) {
                    return iComputeUInt64Size + iComputeInt32SizeNoTag + iArr2.length;
                }
                iComputeInt32SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i12]);
                i12++;
            }
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag != 10) {
                    if (tag != 18) {
                        if (tag != 26) {
                            if (tag != 34) {
                                if (tag != 40) {
                                    if (tag != 48) {
                                        if (tag != 50) {
                                            if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                                                break;
                                            }
                                        } else {
                                            int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                                            int position = codedInputByteBufferNano.getPosition();
                                            int i12 = 0;
                                            while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                                int int32 = codedInputByteBufferNano.readInt32();
                                                if (int32 == 1 || int32 == 2) {
                                                    i12++;
                                                }
                                            }
                                            if (i12 != 0) {
                                                codedInputByteBufferNano.rewindToPosition(position);
                                                int[] iArr = this.f377977f;
                                                int length = iArr == null ? 0 : iArr.length;
                                                int[] iArr2 = new int[i12 + length];
                                                if (length != 0) {
                                                    System.arraycopy(iArr, 0, iArr2, 0, length);
                                                }
                                                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                                                    int int322 = codedInputByteBufferNano.readInt32();
                                                    if (int322 == 1 || int322 == 2) {
                                                        iArr2[length] = int322;
                                                        length++;
                                                    }
                                                }
                                                this.f377977f = iArr2;
                                            }
                                            codedInputByteBufferNano.popLimit(iPushLimit);
                                        }
                                    } else {
                                        int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 48);
                                        int[] iArr3 = new int[repeatedFieldArrayLength];
                                        int i13 = 0;
                                        for (int i14 = 0; i14 < repeatedFieldArrayLength; i14++) {
                                            if (i14 != 0) {
                                                codedInputByteBufferNano.readTag();
                                            }
                                            int int323 = codedInputByteBufferNano.readInt32();
                                            if (int323 == 1 || int323 == 2) {
                                                iArr3[i13] = int323;
                                                i13++;
                                            }
                                        }
                                        if (i13 != 0) {
                                            int[] iArr4 = this.f377977f;
                                            int length2 = iArr4 == null ? 0 : iArr4.length;
                                            if (length2 == 0 && i13 == repeatedFieldArrayLength) {
                                                this.f377977f = iArr3;
                                            } else {
                                                int[] iArr5 = new int[length2 + i13];
                                                if (length2 != 0) {
                                                    System.arraycopy(iArr4, 0, iArr5, 0, length2);
                                                }
                                                System.arraycopy(iArr3, 0, iArr5, length2, i13);
                                                this.f377977f = iArr5;
                                            }
                                        }
                                    }
                                } else {
                                    this.f377976e = codedInputByteBufferNano.readUInt64();
                                }
                            } else {
                                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                                C10950a[] c10950aArr = this.f377975d;
                                int length3 = c10950aArr == null ? 0 : c10950aArr.length;
                                int i15 = repeatedFieldArrayLength2 + length3;
                                C10950a[] c10950aArr2 = new C10950a[i15];
                                if (length3 != 0) {
                                    System.arraycopy(c10950aArr, 0, c10950aArr2, 0, length3);
                                }
                                while (length3 < i15 - 1) {
                                    C10950a c10950a = new C10950a();
                                    c10950aArr2[length3] = c10950a;
                                    codedInputByteBufferNano.readMessage(c10950a);
                                    codedInputByteBufferNano.readTag();
                                    length3++;
                                }
                                C10950a c10950a2 = new C10950a();
                                c10950aArr2[length3] = c10950a2;
                                codedInputByteBufferNano.readMessage(c10950a2);
                                this.f377975d = c10950aArr2;
                            }
                        } else {
                            this.f377974c = codedInputByteBufferNano.readString();
                        }
                    } else {
                        this.f377973b = codedInputByteBufferNano.readString();
                    }
                } else {
                    this.f377972a = codedInputByteBufferNano.readString();
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            codedOutputByteBufferNano.writeString(1, this.f377972a);
            codedOutputByteBufferNano.writeString(2, this.f377973b);
            codedOutputByteBufferNano.writeString(3, this.f377974c);
            C10950a[] c10950aArr = this.f377975d;
            int i12 = 0;
            if (c10950aArr != null && c10950aArr.length > 0) {
                int i13 = 0;
                while (true) {
                    C10950a[] c10950aArr2 = this.f377975d;
                    if (i13 >= c10950aArr2.length) {
                        break;
                    }
                    C10950a c10950a = c10950aArr2[i13];
                    if (c10950a != null) {
                        codedOutputByteBufferNano.writeMessage(4, c10950a);
                    }
                    i13++;
                }
            }
            codedOutputByteBufferNano.writeUInt64(5, this.f377976e);
            int[] iArr = this.f377977f;
            if (iArr != null && iArr.length > 0) {
                while (true) {
                    int[] iArr2 = this.f377977f;
                    if (i12 >= iArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.writeInt32(6, iArr2[i12]);
                    i12++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public Df() {
        a();
    }

    public Df a() {
        this.f377969a = a.b();
        this.f377970b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.f377969a;
        int i12 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                a[] aVarArr2 = this.f377969a;
                if (i13 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i13];
                if (aVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, aVar) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        String[] strArr = this.f377970b;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.f377970b;
            if (i12 >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i14;
            }
            String str = strArr2[i12];
            if (str != null) {
                i14++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i12++;
        }
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
                a[] aVarArr = this.f377969a;
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
                this.f377969a = aVarArr2;
            } else if (tag == 18) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f377970b;
                int length2 = strArr == null ? 0 : strArr.length;
                int i13 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i13];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i13 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f377970b = strArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        a[] aVarArr = this.f377969a;
        int i12 = 0;
        if (aVarArr != null && aVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                a[] aVarArr2 = this.f377969a;
                if (i13 >= aVarArr2.length) {
                    break;
                }
                a aVar = aVarArr2[i13];
                if (aVar != null) {
                    codedOutputByteBufferNano.writeMessage(1, aVar);
                }
                i13++;
            }
        }
        String[] strArr = this.f377970b;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f377970b;
                if (i12 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i12];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
