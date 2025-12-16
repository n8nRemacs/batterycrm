package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.wf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39221wf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public b[] f382122a;

    /* renamed from: b, reason: collision with root package name */
    public a f382123b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f382124c;

    /* renamed from: com.yandex.metrica.impl.ob.wf$a */
    public static final class a extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public int f382125a;

        /* renamed from: b, reason: collision with root package name */
        public int f382126b;

        public a() {
            a();
        }

        public a a() {
            this.f382125a = 0;
            this.f382126b = -1;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeInt32Size(3, this.f382126b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f382125a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 16) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4 || int32 == 5) {
                        this.f382125a = int32;
                    }
                } else if (tag == 24) {
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 == -1 || int322 == 0 || int322 == 1) {
                        this.f382126b = int322;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            codedOutputByteBufferNano.writeInt32(2, this.f382125a);
            codedOutputByteBufferNano.writeInt32(3, this.f382126b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.wf$b */
    public static final class b extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile b[] f382127c;

        /* renamed from: a, reason: collision with root package name */
        public String f382128a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f382129b;

        public b() {
            a();
        }

        public static b[] b() {
            if (f382127c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f382127c == null) {
                            f382127c = new b[0];
                        }
                    } finally {
                    }
                }
            }
            return f382127c;
        }

        public b a() {
            this.f382128a = "";
            this.f382129b = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeBoolSize(2, this.f382129b) + CodedOutputByteBufferNano.computeStringSize(1, this.f382128a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f382128a = codedInputByteBufferNano.readString();
                } else if (tag == 16) {
                    this.f382129b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            codedOutputByteBufferNano.writeString(1, this.f382128a);
            codedOutputByteBufferNano.writeBool(2, this.f382129b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C39221wf() {
        a();
    }

    public C39221wf a() {
        this.f382122a = b.b();
        this.f382123b = null;
        this.f382124c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        b[] bVarArr = this.f382122a;
        int i12 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                b[] bVarArr2 = this.f382122a;
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
        a aVar = this.f382123b;
        if (aVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, aVar);
        }
        String[] strArr = this.f382124c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.f382124c;
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
                b[] bVarArr = this.f382122a;
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
                this.f382122a = bVarArr2;
            } else if (tag == 18) {
                if (this.f382123b == null) {
                    this.f382123b = new a();
                }
                codedInputByteBufferNano.readMessage(this.f382123b);
            } else if (tag == 26) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f382124c;
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
                this.f382124c = strArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        b[] bVarArr = this.f382122a;
        int i12 = 0;
        if (bVarArr != null && bVarArr.length > 0) {
            int i13 = 0;
            while (true) {
                b[] bVarArr2 = this.f382122a;
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
        a aVar = this.f382123b;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(2, aVar);
        }
        String[] strArr = this.f382124c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f382124c;
                if (i12 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i12];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
