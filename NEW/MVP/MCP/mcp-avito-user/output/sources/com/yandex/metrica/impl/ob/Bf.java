package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public final class Bf extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public a[] f377847a;

    public static final class a extends MessageNano {

        /* renamed from: c, reason: collision with root package name */
        private static volatile a[] f377848c;

        /* renamed from: a, reason: collision with root package name */
        public String f377849a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f377850b;

        public a() {
            a();
        }

        public static a[] b() {
            if (f377848c == null) {
                synchronized (InternalNano.LAZY_INIT_LOCK) {
                    try {
                        if (f377848c == null) {
                            f377848c = new a[0];
                        }
                    } finally {
                    }
                }
            }
            return f377848c;
        }

        public a a() {
            this.f377849a = "";
            this.f377850b = false;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeBoolSize(2, this.f377850b) + CodedOutputByteBufferNano.computeStringSize(1, this.f377849a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f377849a = codedInputByteBufferNano.readString();
                } else if (tag == 16) {
                    this.f377850b = codedInputByteBufferNano.readBool();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            codedOutputByteBufferNano.writeString(1, this.f377849a);
            codedOutputByteBufferNano.writeBool(2, this.f377850b);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public Bf() {
        a();
    }

    public Bf a() {
        this.f377847a = a.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        a[] aVarArr = this.f377847a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f377847a;
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
                a[] aVarArr = this.f377847a;
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
                this.f377847a = aVarArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        a[] aVarArr = this.f377847a;
        if (aVarArr != null && aVarArr.length > 0) {
            int i12 = 0;
            while (true) {
                a[] aVarArr2 = this.f377847a;
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
