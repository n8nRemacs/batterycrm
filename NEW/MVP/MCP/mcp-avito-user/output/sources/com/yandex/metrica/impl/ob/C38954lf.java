package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.lf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38954lf extends MessageNano {

    /* renamed from: f, reason: collision with root package name */
    private static volatile C38954lf[] f380977f;

    /* renamed from: a, reason: collision with root package name */
    public String f380978a;

    /* renamed from: b, reason: collision with root package name */
    public String f380979b;

    /* renamed from: c, reason: collision with root package name */
    public C38904jf[] f380980c;

    /* renamed from: d, reason: collision with root package name */
    public C38954lf f380981d;

    /* renamed from: e, reason: collision with root package name */
    public C38954lf[] f380982e;

    public C38954lf() {
        a();
    }

    public C38954lf a() {
        this.f380978a = "";
        this.f380979b = "";
        this.f380980c = C38904jf.b();
        this.f380981d = null;
        if (f380977f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f380977f == null) {
                        f380977f = new C38954lf[0];
                    }
                } finally {
                }
            }
        }
        this.f380982e = f380977f;
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f380978a) + super.computeSerializedSize();
        if (!this.f380979b.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f380979b);
        }
        C38904jf[] c38904jfArr = this.f380980c;
        int i12 = 0;
        if (c38904jfArr != null && c38904jfArr.length > 0) {
            int i13 = 0;
            while (true) {
                C38904jf[] c38904jfArr2 = this.f380980c;
                if (i13 >= c38904jfArr2.length) {
                    break;
                }
                C38904jf c38904jf = c38904jfArr2[i13];
                if (c38904jf != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c38904jf) + iComputeStringSize;
                }
                i13++;
            }
        }
        C38954lf c38954lf = this.f380981d;
        if (c38954lf != null) {
            iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c38954lf);
        }
        C38954lf[] c38954lfArr = this.f380982e;
        if (c38954lfArr != null && c38954lfArr.length > 0) {
            while (true) {
                C38954lf[] c38954lfArr2 = this.f380982e;
                if (i12 >= c38954lfArr2.length) {
                    break;
                }
                C38954lf c38954lf2 = c38954lfArr2[i12];
                if (c38954lf2 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c38954lf2) + iComputeStringSize;
                }
                i12++;
            }
        }
        return iComputeStringSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f380978a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f380979b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C38904jf[] c38904jfArr = this.f380980c;
                int length = c38904jfArr == null ? 0 : c38904jfArr.length;
                int i12 = repeatedFieldArrayLength + length;
                C38904jf[] c38904jfArr2 = new C38904jf[i12];
                if (length != 0) {
                    System.arraycopy(c38904jfArr, 0, c38904jfArr2, 0, length);
                }
                while (length < i12 - 1) {
                    C38904jf c38904jf = new C38904jf();
                    c38904jfArr2[length] = c38904jf;
                    codedInputByteBufferNano.readMessage(c38904jf);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C38904jf c38904jf2 = new C38904jf();
                c38904jfArr2[length] = c38904jf2;
                codedInputByteBufferNano.readMessage(c38904jf2);
                this.f380980c = c38904jfArr2;
            } else if (tag == 34) {
                if (this.f380981d == null) {
                    this.f380981d = new C38954lf();
                }
                codedInputByteBufferNano.readMessage(this.f380981d);
            } else if (tag == 42) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C38954lf[] c38954lfArr = this.f380982e;
                int length2 = c38954lfArr == null ? 0 : c38954lfArr.length;
                int i13 = repeatedFieldArrayLength2 + length2;
                C38954lf[] c38954lfArr2 = new C38954lf[i13];
                if (length2 != 0) {
                    System.arraycopy(c38954lfArr, 0, c38954lfArr2, 0, length2);
                }
                while (length2 < i13 - 1) {
                    C38954lf c38954lf = new C38954lf();
                    c38954lfArr2[length2] = c38954lf;
                    codedInputByteBufferNano.readMessage(c38954lf);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C38954lf c38954lf2 = new C38954lf();
                c38954lfArr2[length2] = c38954lf2;
                codedInputByteBufferNano.readMessage(c38954lf2);
                this.f380982e = c38954lfArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        codedOutputByteBufferNano.writeString(1, this.f380978a);
        if (!this.f380979b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f380979b);
        }
        C38904jf[] c38904jfArr = this.f380980c;
        int i12 = 0;
        if (c38904jfArr != null && c38904jfArr.length > 0) {
            int i13 = 0;
            while (true) {
                C38904jf[] c38904jfArr2 = this.f380980c;
                if (i13 >= c38904jfArr2.length) {
                    break;
                }
                C38904jf c38904jf = c38904jfArr2[i13];
                if (c38904jf != null) {
                    codedOutputByteBufferNano.writeMessage(3, c38904jf);
                }
                i13++;
            }
        }
        C38954lf c38954lf = this.f380981d;
        if (c38954lf != null) {
            codedOutputByteBufferNano.writeMessage(4, c38954lf);
        }
        C38954lf[] c38954lfArr = this.f380982e;
        if (c38954lfArr != null && c38954lfArr.length > 0) {
            while (true) {
                C38954lf[] c38954lfArr2 = this.f380982e;
                if (i12 >= c38954lfArr2.length) {
                    break;
                }
                C38954lf c38954lf2 = c38954lfArr2[i12];
                if (c38954lf2 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c38954lf2);
                }
                i12++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
