package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.hf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38855hf extends MessageNano {

    /* renamed from: l, reason: collision with root package name */
    private static byte[] f380704l;

    /* renamed from: m, reason: collision with root package name */
    private static volatile boolean f380705m;

    /* renamed from: a, reason: collision with root package name */
    public C38954lf f380706a;

    /* renamed from: b, reason: collision with root package name */
    public C38755df f380707b;

    /* renamed from: c, reason: collision with root package name */
    public String f380708c;

    /* renamed from: d, reason: collision with root package name */
    public int f380709d;

    /* renamed from: e, reason: collision with root package name */
    public C38904jf[] f380710e;

    /* renamed from: f, reason: collision with root package name */
    public String f380711f;

    /* renamed from: g, reason: collision with root package name */
    public int f380712g;

    /* renamed from: h, reason: collision with root package name */
    public a f380713h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f380714i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f380715j;

    /* renamed from: k, reason: collision with root package name */
    public C38805ff[] f380716k;

    /* renamed from: com.yandex.metrica.impl.ob.hf$a */
    public static final class a extends MessageNano {

        /* renamed from: a, reason: collision with root package name */
        public String f380717a;

        public a() {
            a();
        }

        public a a() {
            this.f380717a = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public int computeSerializedSize() {
            return CodedOutputByteBufferNano.computeStringSize(1, this.f380717a) + super.computeSerializedSize();
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws InvalidProtocolBufferNanoException {
            while (true) {
                int tag = codedInputByteBufferNano.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 10) {
                    this.f380717a = codedInputByteBufferNano.readString();
                } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    break;
                }
            }
            return this;
        }

        @Override // com.google.protobuf.nano.ym.MessageNano
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws CodedOutputByteBufferNano.OutOfSpaceException, UnsupportedEncodingException {
            codedOutputByteBufferNano.writeString(1, this.f380717a);
            super.writeTo(codedOutputByteBufferNano);
        }
    }

    public C38855hf() {
        if (!f380705m) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f380705m) {
                        f380704l = InternalNano.bytesDefaultValue("JVM");
                        f380705m = true;
                    }
                } finally {
                }
            }
        }
        a();
    }

    public C38855hf a() {
        this.f380706a = null;
        this.f380707b = null;
        this.f380708c = "";
        this.f380709d = -1;
        this.f380710e = C38904jf.b();
        this.f380711f = "";
        this.f380712g = 0;
        this.f380713h = null;
        this.f380714i = (byte[]) f380704l.clone();
        this.f380715j = WireFormatNano.EMPTY_BYTES;
        this.f380716k = C38805ff.b();
        this.cachedSize = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.ym.MessageNano
    public int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C38954lf c38954lf = this.f380706a;
        if (c38954lf != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c38954lf);
        }
        C38755df c38755df = this.f380707b;
        if (c38755df != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c38755df);
        }
        if (!this.f380708c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f380708c);
        }
        int i12 = this.f380709d;
        if (i12 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i12);
        }
        C38904jf[] c38904jfArr = this.f380710e;
        int i13 = 0;
        if (c38904jfArr != null && c38904jfArr.length > 0) {
            int i14 = 0;
            while (true) {
                C38904jf[] c38904jfArr2 = this.f380710e;
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
        if (!this.f380711f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f380711f);
        }
        int i15 = this.f380712g;
        if (i15 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i15);
        }
        a aVar = this.f380713h;
        if (aVar != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, aVar);
        }
        if (!Arrays.equals(this.f380714i, f380704l)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f380714i);
        }
        if (!Arrays.equals(this.f380715j, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f380715j);
        }
        C38805ff[] c38805ffArr = this.f380716k;
        if (c38805ffArr != null && c38805ffArr.length > 0) {
            while (true) {
                C38805ff[] c38805ffArr2 = this.f380716k;
                if (i13 >= c38805ffArr2.length) {
                    break;
                }
                C38805ff c38805ff = c38805ffArr2[i13];
                if (c38805ff != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c38805ff) + iComputeSerializedSize;
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
                    if (this.f380706a == null) {
                        this.f380706a = new C38954lf();
                    }
                    codedInputByteBufferNano.readMessage(this.f380706a);
                    break;
                case 18:
                    if (this.f380707b == null) {
                        this.f380707b = new C38755df();
                    }
                    codedInputByteBufferNano.readMessage(this.f380707b);
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    this.f380708c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f380709d = int32;
                        break;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C38904jf[] c38904jfArr = this.f380710e;
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
                    this.f380710e = c38904jfArr2;
                    break;
                case 50:
                    this.f380711f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f380712g = int322;
                        break;
                    }
                case 66:
                    if (this.f380713h == null) {
                        this.f380713h = new a();
                    }
                    codedInputByteBufferNano.readMessage(this.f380713h);
                    break;
                case 74:
                    this.f380714i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f380715j = codedInputByteBufferNano.readBytes();
                    break;
                case YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C38805ff[] c38805ffArr = this.f380716k;
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
                    this.f380716k = c38805ffArr2;
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
        C38954lf c38954lf = this.f380706a;
        if (c38954lf != null) {
            codedOutputByteBufferNano.writeMessage(1, c38954lf);
        }
        C38755df c38755df = this.f380707b;
        if (c38755df != null) {
            codedOutputByteBufferNano.writeMessage(2, c38755df);
        }
        if (!this.f380708c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f380708c);
        }
        int i12 = this.f380709d;
        if (i12 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i12);
        }
        C38904jf[] c38904jfArr = this.f380710e;
        int i13 = 0;
        if (c38904jfArr != null && c38904jfArr.length > 0) {
            int i14 = 0;
            while (true) {
                C38904jf[] c38904jfArr2 = this.f380710e;
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
        if (!this.f380711f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f380711f);
        }
        int i15 = this.f380712g;
        if (i15 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i15);
        }
        a aVar = this.f380713h;
        if (aVar != null) {
            codedOutputByteBufferNano.writeMessage(8, aVar);
        }
        if (!Arrays.equals(this.f380714i, f380704l)) {
            codedOutputByteBufferNano.writeBytes(9, this.f380714i);
        }
        if (!Arrays.equals(this.f380715j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f380715j);
        }
        C38805ff[] c38805ffArr = this.f380716k;
        if (c38805ffArr != null && c38805ffArr.length > 0) {
            while (true) {
                C38805ff[] c38805ffArr2 = this.f380716k;
                if (i13 >= c38805ffArr2.length) {
                    break;
                }
                C38805ff c38805ff = c38805ffArr2[i13];
                if (c38805ff != null) {
                    codedOutputByteBufferNano.writeMessage(11, c38805ff);
                }
                i13++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
