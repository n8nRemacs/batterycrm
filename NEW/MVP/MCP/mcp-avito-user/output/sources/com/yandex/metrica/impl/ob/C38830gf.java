package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.gf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38830gf extends MessageNano {

    /* renamed from: k, reason: collision with root package name */
    private static byte[] f380636k;

    /* renamed from: l, reason: collision with root package name */
    private static volatile boolean f380637l;

    /* renamed from: a, reason: collision with root package name */
    public C38954lf f380638a;

    /* renamed from: b, reason: collision with root package name */
    public C38755df f380639b;

    /* renamed from: c, reason: collision with root package name */
    public String f380640c;

    /* renamed from: d, reason: collision with root package name */
    public int f380641d;

    /* renamed from: e, reason: collision with root package name */
    public C38904jf[] f380642e;

    /* renamed from: f, reason: collision with root package name */
    public int f380643f;

    /* renamed from: g, reason: collision with root package name */
    public a f380644g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f380645h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f380646i;

    /* renamed from: j, reason: collision with root package name */
    public C38805ff[] f380647j;

    /* renamed from: com.yandex.metrica.impl.ob.gf$a */
    public static final class a extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f380648a;

        /* renamed from: b, reason: collision with root package name */
        public Cif f380649b;

        public a() {
            a();
        }

        public a a() {
            this.f380648a = WireFormatNano.EMPTY_BYTES;
            this.f380649b = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            int iComputeSerializedSize = super.computeSerializedSize();
            if (!Arrays.equals(this.f380648a, WireFormatNano.EMPTY_BYTES)) {
                iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f380648a);
            }
            Cif cif = this.f380649b;
            return cif != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, cif) : iComputeSerializedSize;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f380648a = codedInputByteBufferNano.readBytes();
                } else if (tag == 18) {
                    if (this.f380649b == null) {
                        this.f380649b = new Cif();
                    }
                    codedInputByteBufferNano.readMessage(this.f380649b);
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException {
            if (!Arrays.equals(this.f380648a, WireFormatNano.EMPTY_BYTES)) {
                codedOutputByteBufferNano.writeBytes(1, this.f380648a);
            }
            Cif cif = this.f380649b;
            if (cif != null) {
                codedOutputByteBufferNano.writeMessage(2, cif);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C38830gf() {
        if (!f380637l) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f380637l) {
                        f380636k = InternalNano.bytesDefaultValue("JVM");
                        f380637l = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public C38830gf a() {
        this.f380638a = null;
        this.f380639b = null;
        this.f380640c = "";
        this.f380641d = -1;
        this.f380642e = C38904jf.b();
        this.f380643f = 0;
        this.f380644g = null;
        this.f380645h = (byte[]) f380636k.clone();
        this.f380646i = WireFormatNano.EMPTY_BYTES;
        this.f380647j = C38805ff.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C38954lf c38954lf = this.f380638a;
        if (c38954lf != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c38954lf);
        }
        C38755df c38755df = this.f380639b;
        if (c38755df != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c38755df);
        }
        if (!this.f380640c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f380640c);
        }
        int i12 = this.f380641d;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i12);
        }
        C38904jf[] c38904jfArr = this.f380642e;
        int i13 = 0;
        if (c38904jfArr != null && c38904jfArr.length > 0) {
            int i14 = 0;
            while (true) {
                C38904jf[] c38904jfArr2 = this.f380642e;
                if (i14 >= c38904jfArr2.length) {
                    break;
                }
                C38904jf c38904jf = c38904jfArr2[i14];
                if (c38904jf != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c38904jf) + iComputeSerializedSize;
                }
                i14++;
            }
        }
        int i15 = this.f380643f;
        if (i15 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i15);
        }
        a aVar = this.f380644g;
        if (aVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, aVar);
        }
        if (!Arrays.equals(this.f380645h, f380636k)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f380645h);
        }
        if (!Arrays.equals(this.f380646i, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f380646i);
        }
        C38805ff[] c38805ffArr = this.f380647j;
        if (c38805ffArr != null && c38805ffArr.length > 0) {
            while (true) {
                C38805ff[] c38805ffArr2 = this.f380647j;
                if (i13 >= c38805ffArr2.length) {
                    break;
                }
                C38805ff c38805ff = c38805ffArr2[i13];
                if (c38805ff != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c38805ff) + iComputeSerializedSize;
                }
                i13++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    break;
                case 10:
                    if (this.f380638a == null) {
                        this.f380638a = new C38954lf();
                    }
                    codedInputByteBufferNano.readMessage(this.f380638a);
                    break;
                case 18:
                    if (this.f380639b == null) {
                        this.f380639b = new C38755df();
                    }
                    codedInputByteBufferNano.readMessage(this.f380639b);
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    this.f380640c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f380641d = int32;
                        break;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C38904jf[] c38904jfArr = this.f380642e;
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
                    this.f380642e = c38904jfArr2;
                    break;
                case 48:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f380643f = int322;
                        break;
                    }
                    break;
                case 58:
                    if (this.f380644g == null) {
                        this.f380644g = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f380644g);
                    break;
                case 66:
                    this.f380645h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f380646i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C38805ff[] c38805ffArr = this.f380647j;
                    int length2 = c38805ffArr == null ? 0 : c38805ffArr.length;
                    int i13 = repeatedFieldArrayLength2 + length2;
                    C38805ff[] c38805ffArr2 = new C38805ff[i13];
                    if (length2 != 0) {
                        System.arraycopy(c38805ffArr, 0, c38805ffArr2, 0, length2);
                    }
                    while (length2 < i13 - 1) {
                        C38805ff c38805ff = new C38805ff();
                        c38805ffArr2[length2] = c38805ff;
                        codedInputByteBufferNano.readMessage(c38805ff);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C38805ff c38805ff2 = new C38805ff();
                    c38805ffArr2[length2] = c38805ff2;
                    codedInputByteBufferNano.readMessage(c38805ff2);
                    this.f380647j = c38805ffArr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
        C38954lf c38954lf = this.f380638a;
        if (c38954lf != null) {
            codedOutputByteBufferNano.writeMessage(1, c38954lf);
        }
        C38755df c38755df = this.f380639b;
        if (c38755df != null) {
            codedOutputByteBufferNano.writeMessage(2, c38755df);
        }
        if (!this.f380640c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f380640c);
        }
        int i12 = this.f380641d;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i12);
        }
        C38904jf[] c38904jfArr = this.f380642e;
        int i13 = 0;
        if (c38904jfArr != null && c38904jfArr.length > 0) {
            int i14 = 0;
            while (true) {
                C38904jf[] c38904jfArr2 = this.f380642e;
                if (i14 >= c38904jfArr2.length) {
                    break;
                }
                C38904jf c38904jf = c38904jfArr2[i14];
                if (c38904jf != null) {
                    codedOutputByteBufferNano.writeMessage(5, c38904jf);
                }
                i14++;
            }
        }
        int i15 = this.f380643f;
        if (i15 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i15);
        }
        a aVar = this.f380644g;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(7, aVar);
        }
        if (!Arrays.equals(this.f380645h, f380636k)) {
            codedOutputByteBufferNano.writeBytes(8, this.f380645h);
        }
        if (!Arrays.equals(this.f380646i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f380646i);
        }
        C38805ff[] c38805ffArr = this.f380647j;
        if (c38805ffArr != null && c38805ffArr.length > 0) {
            while (true) {
                C38805ff[] c38805ffArr2 = this.f380647j;
                if (i13 >= c38805ffArr2.length) {
                    break;
                }
                C38805ff c38805ff = c38805ffArr2[i13];
                if (c38805ff != null) {
                    codedOutputByteBufferNano.writeMessage(10, c38805ff);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
