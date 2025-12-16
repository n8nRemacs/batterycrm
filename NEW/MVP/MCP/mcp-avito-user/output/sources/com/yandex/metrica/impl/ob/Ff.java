package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public final class Ff extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public a[] f378142a;

    /* renamed from: b, reason: collision with root package name */
    public String f378143b;

    /* renamed from: c, reason: collision with root package name */
    public long f378144c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f378145d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f378146e;

    public static final class a extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile a[] f378147c;

        /* renamed from: a, reason: collision with root package name */
        public String f378148a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f378149b;

        public a() {
            a();
        }

        public static a[] b() {
            if (f378147c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f378147c == null) {
                            f378147c = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f378147c;
        }

        public a a() {
            this.f378148a = "";
            this.f378149b = WireFormatNano.EMPTY_STRING_ARRAY;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f378148a) + super.computeSerializedSize();
            String[] strArr = this.f378149b;
            if (strArr == null || strArr.length <= 0) {
                return iComputeStringSize;
            }
            int i12 = 0;
            int iComputeStringSizeNoTag = 0;
            int i13 = 0;
            while (true) {
                String[] strArr2 = this.f378149b;
                if (i12 >= strArr2.length) {
                    return iComputeStringSize + iComputeStringSizeNoTag + i13;
                }
                String str = strArr2[i12];
                if (str != null) {
                    i13++;
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
                    this.f378148a = codedInputByteBufferNano.readString();
                } else if (tag == 18) {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                    String[] strArr = this.f378149b;
                    int length = strArr == null ? 0 : strArr.length;
                    int i12 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i12];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i12 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f378149b = strArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            codedOutputByteBufferNano.writeString(1, this.f378148a);
            String[] strArr = this.f378149b;
            if (strArr != null && strArr.length > 0) {
                int i12 = 0;
                while (true) {
                    String[] strArr2 = this.f378149b;
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

    public Ff() {
        a();
    }

    public Ff a() {
        this.f378142a = a.b();
        this.f378143b = "";
        this.f378144c = 0L;
        this.f378145d = false;
        this.f378146e = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.f378142a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f378142a;
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
        return CodedOutputByteBufferNano.computeBoolSize(5, this.f378146e) + CodedOutputByteBufferNano.computeBoolSize(4, this.f378145d) + CodedOutputByteBufferNano.computeInt64Size(3, this.f378144c) + CodedOutputByteBufferNano.computeStringSize(2, this.f378143b) + iComputeSerializedSize;
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
                a[] aVarArr = this.f378142a;
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
                this.f378142a = aVarArr2;
            } else if (tag == 18) {
                this.f378143b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f378144c = codedInputByteBufferNano.readInt64();
            } else if (tag == 32) {
                this.f378145d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                this.f378146e = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        a[] aVarArr = this.f378142a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f378142a;
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
        codedOutputByteBufferNano.writeString(2, this.f378143b);
        codedOutputByteBufferNano.writeInt64(3, this.f378144c);
        codedOutputByteBufferNano.writeBool(4, this.f378145d);
        codedOutputByteBufferNano.writeBool(5, this.f378146e);
        super.writeTo(codedOutputByteBufferNano);
    }
}
