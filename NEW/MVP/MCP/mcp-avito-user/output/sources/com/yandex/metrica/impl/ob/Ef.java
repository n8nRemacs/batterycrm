package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public final class Ef extends MessageNano {

    /* renamed from: a, reason: collision with root package name */
    public a f378048a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f378049b;

    public static final class a extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public C10951a[] f378050a;

        /* renamed from: com.yandex.metrica.impl.ob.Ef$a$a, reason: collision with other inner class name */
        public static final class C10951a extends MessageNano {

            /* renamed from: c, reason: collision with root package name */
            private static volatile C10951a[] f378051c;

            /* renamed from: a, reason: collision with root package name */
            public String f378052a;

            /* renamed from: b, reason: collision with root package name */
            public String f378053b;

            public C10951a() {
                a();
            }

            public static C10951a[] b() {
                if (f378051c == null) {
                    synchronized (InternalNano.LAZY_INIT_LOCK) {
                        try {
                            if (f378051c == null) {
                                f378051c = new C10951a[0];
                            }
                        } finally {
                        }
                    }
                }
                return f378051c;
            }

            public C10951a a() {
                this.f378052a = "";
                this.f378053b = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public int computeSerializedSize() {
                int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f378052a) + super.computeSerializedSize();
                return !this.f378053b.equals("") ? iComputeStringSize + CodedOutputByteBufferNano.computeStringSize(2, this.f378053b) : iComputeStringSize;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
                while (true) {
                    int tag = codedInputByteBufferNano.readTag();
                    if (tag == 0) {
                        break;
                    }
                    if (tag == 10) {
                        this.f378052a = codedInputByteBufferNano.readString();
                    } else if (tag == 18) {
                        this.f378053b = codedInputByteBufferNano.readString();
                    } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    }
                }
                return this;
            }

            @Override // com.google.protobuf.nano.ym.MessageNano
            public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
                codedOutputByteBufferNano.writeString(1, this.f378052a);
                if (!this.f378053b.equals("")) {
                    codedOutputByteBufferNano.writeString(2, this.f378053b);
                }
                super.writeTo(codedOutputByteBufferNano);
            }
        }

        public a() {
            a();
        }

        public a a() {
            this.f378050a = C10951a.b();
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            C10951a[] c10951aArr = this.f378050a;
            if (c10951aArr != null && c10951aArr.length > 0) {
                int i12 = 0;
                while (true) {
                    C10951a[] c10951aArr2 = this.f378050a;
                    if (i12 >= c10951aArr2.length) {
                        break;
                    }
                    C10951a c10951a = c10951aArr2[i12];
                    if (c10951a != null) {
                        iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c10951a) + iComputeSerializedSize;
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
                    C10951a[] c10951aArr = this.f378050a;
                    int length = c10951aArr == null ? 0 : c10951aArr.length;
                    int i12 = repeatedFieldArrayLength + length;
                    C10951a[] c10951aArr2 = new C10951a[i12];
                    if (length != 0) {
                        System.arraycopy(c10951aArr, 0, c10951aArr2, 0, length);
                    }
                    while (length < i12 - 1) {
                        C10951a c10951a = new C10951a();
                        c10951aArr2[length] = c10951a;
                        codedInputByteBufferNano.readMessage(c10951a);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C10951a c10951a2 = new C10951a();
                    c10951aArr2[length] = c10951a2;
                    codedInputByteBufferNano.readMessage(c10951a2);
                    this.f378050a = c10951aArr2;
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            C10951a[] c10951aArr = this.f378050a;
            if (c10951aArr != null && c10951aArr.length > 0) {
                int i12 = 0;
                while (true) {
                    C10951a[] c10951aArr2 = this.f378050a;
                    if (i12 >= c10951aArr2.length) {
                        break;
                    }
                    C10951a c10951a = c10951aArr2[i12];
                    if (c10951a != null) {
                        codedOutputByteBufferNano.writeMessage(1, c10951a);
                    }
                    i12++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public Ef() {
        a();
    }

    public Ef a() {
        this.f378048a = null;
        this.f378049b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        a aVar = this.f378048a;
        if (aVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, aVar);
        }
        boolean z12 = this.f378049b;
        return z12 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z12) : iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                if (this.f378048a == null) {
                    this.f378048a = new a();
                }
                codedInputByteBufferNano.readMessage(this.f378048a);
            } else if (tag == 16) {
                this.f378049b = codedInputByteBufferNano.readBool();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
        a aVar = this.f378048a;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(1, aVar);
        }
        boolean z12 = this.f378049b;
        if (z12) {
            codedOutputByteBufferNano.writeBool(2, z12);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
