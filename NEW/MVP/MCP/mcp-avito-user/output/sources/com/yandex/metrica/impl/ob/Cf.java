package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public final class Cf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public a f377902a;

    /* renamed from: b, reason: collision with root package name */
    public b[] f377903b;

    public static final class a extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public String f377904a;

        /* renamed from: b, reason: collision with root package name */
        public String f377905b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f377906c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f377907d;

        /* renamed from: e, reason: collision with root package name */
        public int f377908e;

        public a() {
            a();
        }

        public a a() {
            this.f377904a = "";
            this.f377905b = "";
            this.f377906c = false;
            this.f377907d = false;
            this.f377908e = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!this.f377904a.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f377904a);
            }
            if (!this.f377905b.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f377905b);
            }
            boolean z12 = this.f377906c;
            if (z12) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z12);
            }
            boolean z13 = this.f377907d;
            if (z13) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z13);
            }
            return CodedOutputByteBufferNano.computeInt32Size(5, this.f377908e) + iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f377904a = codedInputByteBufferNano.readString();
                } else if (tag == 18) {
                    this.f377905b = codedInputByteBufferNano.readString();
                } else if (tag == 24) {
                    this.f377906c = codedInputByteBufferNano.readBool();
                } else if (tag == 32) {
                    this.f377907d = codedInputByteBufferNano.readBool();
                } else if (tag == 40) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                        this.f377908e = int32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            if (!this.f377904a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f377904a);
            }
            if (!this.f377905b.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.f377905b);
            }
            boolean z12 = this.f377906c;
            if (z12) {
                codedOutputByteBufferNano.writeBool(3, z12);
            }
            boolean z13 = this.f377907d;
            if (z13) {
                codedOutputByteBufferNano.writeBool(4, z13);
            }
            codedOutputByteBufferNano.writeInt32(5, this.f377908e);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public static final class b extends MessageNano {

        /* renamed from: d, reason: collision with root package name */
        private static volatile b[] f377909d;

        /* renamed from: a, reason: collision with root package name */
        public String f377910a;

        /* renamed from: b, reason: collision with root package name */
        public String f377911b;

        /* renamed from: c, reason: collision with root package name */
        public int f377912c;

        public b() {
            a();
        }

        public static b[] b() {
            if (f377909d == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f377909d == null) {
                            f377909d = new b[0];
                        }
                    } finally {
                    }
                }
            }
            return f377909d;
        }

        public b a() {
            this.f377910a = "";
            this.f377911b = "";
            this.f377912c = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!this.f377910a.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f377910a);
            }
            if (!this.f377911b.equals("")) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f377911b);
            }
            return CodedOutputByteBufferNano.computeInt32Size(3, this.f377912c) + iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f377910a = codedInputByteBufferNano.readString();
                } else if (tag == 18) {
                    this.f377911b = codedInputByteBufferNano.readString();
                } else if (tag == 24) {
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                        this.f377912c = int32;
                    }
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            if (!this.f377910a.equals("")) {
                codedOutputByteBufferNano.writeString(1, this.f377910a);
            }
            if (!this.f377911b.equals("")) {
                codedOutputByteBufferNano.writeString(2, this.f377911b);
            }
            codedOutputByteBufferNano.writeInt32(3, this.f377912c);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public Cf() {
        a();
    }

    public Cf a() {
        this.f377902a = null;
        this.f377903b = b.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        a aVar = this.f377902a;
        if (aVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
        }
        b[] bVarArr = this.f377903b;
        if (bVarArr != null && bVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                b[] bVarArr2 = this.f377903b;
                if (i12 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i12];
                if (bVar != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, bVar) + iComputeSerializedSize;
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
                if (this.f377902a == null) {
                    this.f377902a = new a();
                }
                codedInputByteBufferNano.readMessage(this.f377902a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                b[] bVarArr = this.f377903b;
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
                this.f377903b = bVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        a aVar = this.f377902a;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(1, aVar);
        }
        b[] bVarArr = this.f377903b;
        if (bVarArr != null && bVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                b[] bVarArr2 = this.f377903b;
                if (i12 >= bVarArr2.length) {
                    break;
                }
                b bVar = bVarArr2[i12];
                if (bVar != null) {
                    codedOutputByteBufferNano.writeMessage(2, bVar);
                }
                i12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
