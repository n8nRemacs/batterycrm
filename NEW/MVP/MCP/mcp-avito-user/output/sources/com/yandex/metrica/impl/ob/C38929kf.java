package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.kf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38929kf extends MessageNano {

    /* renamed from: g, reason: collision with root package name */
    private static volatile C38929kf[] f380918g;

    /* renamed from: a, reason: collision with root package name */
    public String f380919a;

    /* renamed from: b, reason: collision with root package name */
    public int f380920b;

    /* renamed from: c, reason: collision with root package name */
    public long f380921c;

    /* renamed from: d, reason: collision with root package name */
    public String f380922d;

    /* renamed from: e, reason: collision with root package name */
    public int f380923e;

    /* renamed from: f, reason: collision with root package name */
    public C38904jf[] f380924f;

    public C38929kf() {
        a();
    }

    public static C38929kf[] b() {
        if (f380918g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f380918g == null) {
                        f380918g = new C38929kf[0];
                    }
                } finally {
                }
            }
        }
        return f380918g;
    }

    public C38929kf a() {
        this.f380919a = "";
        this.f380920b = 0;
        this.f380921c = 0L;
        this.f380922d = "";
        this.f380923e = 0;
        this.f380924f = C38904jf.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f380921c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f380920b) + CodedOutputByteBufferNano.computeStringSize(1, this.f380919a) + super.computeSerializedSize();
        if (!this.f380922d.equals("")) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f380922d);
        }
        int i12 = this.f380923e;
        if (i12 != 0) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i12);
        }
        C38904jf[] c38904jfArr = this.f380924f;
        if (c38904jfArr != null && c38904jfArr.length > 0) {
            int i13 = 0;
            while (true) {
                C38904jf[] c38904jfArr2 = this.f380924f;
                if (i13 >= c38904jfArr2.length) {
                    break;
                }
                C38904jf c38904jf = c38904jfArr2[i13];
                if (c38904jf != null) {
                    iComputeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c38904jf) + iComputeSInt64Size;
                }
                i13++;
            }
        }
        return iComputeSInt64Size;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == 10) {
                this.f380919a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f380920b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f380921c = codedInputByteBufferNano.readSInt64();
            } else if (tag == 34) {
                this.f380922d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f380923e = codedInputByteBufferNano.readUInt32();
            } else if (tag == 50) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C38904jf[] c38904jfArr = this.f380924f;
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
                this.f380924f = c38904jfArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                break;
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        codedOutputByteBufferNano.writeString(1, this.f380919a);
        codedOutputByteBufferNano.writeSInt32(2, this.f380920b);
        codedOutputByteBufferNano.writeSInt64(3, this.f380921c);
        if (!this.f380922d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f380922d);
        }
        int i12 = this.f380923e;
        if (i12 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i12);
        }
        C38904jf[] c38904jfArr = this.f380924f;
        if (c38904jfArr != null && c38904jfArr.length > 0) {
            int i13 = 0;
            while (true) {
                C38904jf[] c38904jfArr2 = this.f380924f;
                if (i13 >= c38904jfArr2.length) {
                    break;
                }
                C38904jf c38904jf = c38904jfArr2[i13];
                if (c38904jf != null) {
                    codedOutputByteBufferNano.writeMessage(6, c38904jf);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
