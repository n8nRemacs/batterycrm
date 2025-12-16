package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.yf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39269yf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public a f382245a;

    /* renamed from: b, reason: collision with root package name */
    public a[] f382246b;

    /* renamed from: com.yandex.metrica.impl.ob.yf$a */
    public static final class a extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile a[] f382247c;

        /* renamed from: a, reason: collision with root package name */
        public b f382248a;

        /* renamed from: b, reason: collision with root package name */
        public int f382249b;

        public a() {
            a();
        }

        public static a[] b() {
            if (f382247c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f382247c == null) {
                            f382247c = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f382247c;
        }

        public a a() {
            this.f382248a = null;
            this.f382249b = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            b bVar = this.f382248a;
            if (bVar != null) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, bVar);
            }
            int i12 = this.f382249b;
            return i12 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i12) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    if (this.f382248a == null) {
                        this.f382248a = new b();
                    }
                    codedInputByteBufferNano.readMessage(this.f382248a);
                } else if (tag == 16) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                        this.f382249b = int32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            b bVar = this.f382248a;
            if (bVar != null) {
                codedOutputByteBufferNano.writeMessage(1, bVar);
            }
            int i12 = this.f382249b;
            if (i12 != 0) {
                codedOutputByteBufferNano.writeInt32(2, i12);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.yf$b */
    public static final class b extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public a[] f382250a;

        /* renamed from: com.yandex.metrica.impl.ob.yf$b$a */
        public static final class a extends MessageNano {

            /* renamed from: c, reason: collision with root package name */
            private static volatile a[] f382251c;

            /* renamed from: a, reason: collision with root package name */
            public String f382252a;

            /* renamed from: b, reason: collision with root package name */
            public String f382253b;

            public a() {
                a();
            }

            public static a[] b() {
                if (f382251c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        try {
                            if (f382251c == null) {
                                f382251c = new a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f382251c;
            }

            public a a() {
                this.f382252a = "";
                this.f382253b = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                int iComputeSerializedSize = super.computeSerializedSize();
                if (!this.f382252a.equals("")) {
                    iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f382252a);
                }
                return !this.f382253b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f382253b) : iComputeSerializedSize;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    if (tag == 0) {
                        break;
                    }
                    if (tag == 10) {
                        this.f382252a = codedInputByteBufferNano.readString();
                    } else if (tag == 18) {
                        this.f382253b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
                if (!this.f382252a.equals("")) {
                    codedOutputByteBufferNano.writeString(1, this.f382252a);
                }
                if (!this.f382253b.equals("")) {
                    codedOutputByteBufferNano.writeString(2, this.f382253b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public b() {
            a();
        }

        public b a() {
            this.f382250a = a.b();
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            a[] aVarArr = this.f382250a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    a[] aVarArr2 = this.f382250a;
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
                    a[] aVarArr = this.f382250a;
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
                    this.f382250a = aVarArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            a[] aVarArr = this.f382250a;
            if (aVarArr != null && aVarArr.length > 0) {
                int i12 = 0;
                while (true) {
                    a[] aVarArr2 = this.f382250a;
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

    public C39269yf() {
        a();
    }

    public C39269yf a() {
        this.f382245a = null;
        this.f382246b = a.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        a aVar = this.f382245a;
        if (aVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
        }
        a[] aVarArr = this.f382246b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f382246b;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                a aVar2 = aVarArr2[i12];
                if (aVar2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, aVar2) + iComputeSerializedSize;
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
                if (this.f382245a == null) {
                    this.f382245a = new a();
                }
                codedInputByteBufferNano.readMessage(this.f382245a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                a[] aVarArr = this.f382246b;
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
                this.f382246b = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        a aVar = this.f382245a;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(1, aVar);
        }
        a[] aVarArr = this.f382246b;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f382246b;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                a aVar2 = aVarArr2[i12];
                if (aVar2 != null) {
                    codedOutputByteBufferNano.writeMessage(2, aVar2);
                }
                i12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
