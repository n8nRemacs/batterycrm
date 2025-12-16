package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.xf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39245xf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public a[] f382189a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f382190b;

    /* renamed from: com.yandex.metrica.impl.ob.xf$a */
    public static final class a extends MessageNano {

        /* renamed from: f, reason: collision with root package name */
        private static volatile a[] f382191f;

        /* renamed from: a, reason: collision with root package name */
        public int f382192a;

        /* renamed from: b, reason: collision with root package name */
        public String f382193b;

        /* renamed from: c, reason: collision with root package name */
        public String f382194c;

        /* renamed from: d, reason: collision with root package name */
        public long f382195d;

        /* renamed from: e, reason: collision with root package name */
        public long f382196e;

        public a() {
            a();
        }

        public static a[] b() {
            if (f382191f == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f382191f == null) {
                            f382191f = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f382191f;
        }

        public a a() {
            this.f382192a = 1;
            this.f382193b = "";
            this.f382194c = "";
            this.f382195d = 0L;
            this.f382196e = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeUInt64Size(5, this.f382196e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f382195d) + CodedOutputByteBufferNano.computeStringSize(3, this.f382194c) + CodedOutputByteBufferNano.computeStringSize(2, this.f382193b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f382192a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 8) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 1 || int32 == 2 || int32 == 3) {
                        this.f382192a = int32;
                    }
                } else if (tag == 18) {
                    this.f382193b = codedInputByteBufferNano.readString();
                } else if (tag == 26) {
                    this.f382194c = codedInputByteBufferNano.readString();
                } else if (tag == 32) {
                    this.f382195d = codedInputByteBufferNano.readUInt64();
                } else if (tag == 40) {
                    this.f382196e = codedInputByteBufferNano.readUInt64();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            codedOutputByteBufferNano.writeInt32(1, this.f382192a);
            codedOutputByteBufferNano.writeString(2, this.f382193b);
            codedOutputByteBufferNano.writeString(3, this.f382194c);
            codedOutputByteBufferNano.writeUInt64(4, this.f382195d);
            codedOutputByteBufferNano.writeUInt64(5, this.f382196e);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C39245xf() {
        a();
    }

    public C39245xf a() {
        this.f382189a = a.b();
        this.f382190b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.f382189a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f382189a;
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
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f382190b) + iComputeSerializedSize;
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
                a[] aVarArr = this.f382189a;
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
                this.f382189a = aVarArr2;
            } else if (tag == 16) {
                this.f382190b = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        a[] aVarArr = this.f382189a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f382189a;
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
        codedOutputByteBufferNano.writeBool(2, this.f382190b);
        super.writeTo(codedOutputByteBufferNano);
    }
}
